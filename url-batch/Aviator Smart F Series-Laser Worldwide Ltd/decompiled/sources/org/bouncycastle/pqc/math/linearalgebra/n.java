package org.bouncycastle.pqc.math.linearalgebra;

import java.io.PrintStream;

/* loaded from: classes5.dex */
public final class n {
    private n() {
    }

    public static int add(int i8, int i9) {
        return i8 ^ i9;
    }

    public static int degree(int i8) {
        int i9 = -1;
        while (i8 != 0) {
            i9++;
            i8 >>>= 1;
        }
        return i9;
    }

    public static int gcd(int i8, int i9) {
        while (true) {
            int i10 = i9;
            int i11 = i8;
            i8 = i10;
            if (i8 == 0) {
                return i11;
            }
            i9 = remainder(i11, i8);
        }
    }

    public static int getIrreduciblePolynomial(int i8) {
        PrintStream printStream;
        String str;
        if (i8 < 0) {
            printStream = System.err;
            str = "The Degree is negative";
        } else {
            if (i8 <= 31) {
                if (i8 == 0) {
                    return 1;
                }
                int i9 = 1 << (i8 + 1);
                for (int i10 = (1 << i8) + 1; i10 < i9; i10 += 2) {
                    if (isIrreducible(i10)) {
                        return i10;
                    }
                }
                return 0;
            }
            printStream = System.err;
            str = "The Degree is more then 31";
        }
        printStream.println(str);
        return 0;
    }

    public static boolean isIrreducible(int i8) {
        if (i8 == 0) {
            return false;
        }
        int degree = degree(i8) >>> 1;
        int i9 = 2;
        for (int i10 = 0; i10 < degree; i10++) {
            i9 = modMultiply(i9, i9, i8);
            if (gcd(i9 ^ 2, i8) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i8, int i9, int i10) {
        int remainder = remainder(i8, i10);
        int remainder2 = remainder(i9, i10);
        int i11 = 0;
        if (remainder2 != 0) {
            int degree = 1 << degree(i10);
            while (remainder != 0) {
                if (((byte) (remainder & 1)) == 1) {
                    i11 ^= remainder2;
                }
                remainder >>>= 1;
                remainder2 <<= 1;
                if (remainder2 >= degree) {
                    remainder2 ^= i10;
                }
            }
        }
        return i11;
    }

    public static long multiply(int i8, int i9) {
        long j8 = 0;
        if (i9 != 0) {
            long j9 = i9 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
            while (i8 != 0) {
                if (((byte) (i8 & 1)) == 1) {
                    j8 ^= j9;
                }
                i8 >>>= 1;
                j9 <<= 1;
            }
        }
        return j8;
    }

    public static int remainder(int i8, int i9) {
        if (i9 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (degree(i8) >= degree(i9)) {
            i8 ^= i9 << (degree(i8) - degree(i9));
        }
        return i8;
    }

    public static int rest(long j8, int i8) {
        if (i8 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j9 = i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
        while ((j8 >>> 32) != 0) {
            j8 ^= j9 << (degree(j8) - degree(j9));
        }
        int i9 = (int) j8;
        while (degree(i9) >= degree(i8)) {
            i9 ^= i8 << (degree(i9) - degree(i8));
        }
        return i9;
    }

    public static int degree(long j8) {
        int i8 = 0;
        while (j8 != 0) {
            i8++;
            j8 >>>= 1;
        }
        return i8 - 1;
    }
}
