import java.util.Arrays;

class FindPair
{
    public static void findPair(int[] A, int sum)
    {
        int n = A.length;
        Arrays.sort(A);
        if (n>1) {
            int[] B = new int[n];
            int jk = 0;
            for (int i = 0; i < n - 1; i++) {
                if (A[i] != A[i + 1]) {
                    B[jk++] = A[i];
                }
            }
            B[jk++] = A[n - 1];
            for (int i = 0; i < jk; i++) {
                B[i] = B[i];
            }

            int flag = 0;
            for (int i = 0; i < B.length - 1; i++) {
                for (int j = i + 1; j < B.length - 1; j++) { 
                    if (B[i] + B[j] == sum) {
                        flag = 1;
                        System.out.println("["
                                + B[i] + "," + B[j] + "]");
                    }
                }
            }
            if (flag == 0)
                // No pair with given sum exists in the array
                System.out.println("Pair not found");
        }
    }

    // main function
    public static void main (String[] args)
    {
        int A[] = { 1,4,6,9,8, 7, 2, 9,5, 3, 1 ,7};
        int sum = 15;

        findPair(A, sum);
    }
}
