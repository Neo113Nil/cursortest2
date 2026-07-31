package Y2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class m {
    public static int A(int i4, int[] iArr, int i5, int i6, int i7, int[] iArr2, int i8) {
        while (true) {
            i4--;
            if (i4 < 0) {
                return i7 << (-i6);
            }
            int i9 = iArr[i5 + i4];
            iArr2[i8 + i4] = (i7 << (-i6)) | (i9 >>> i6);
            i7 = i9;
        }
    }

    public static int B(int i4, int[] iArr, int i5) {
        while (true) {
            i4--;
            if (i4 < 0) {
                return i5;
            }
            int i6 = iArr[i4];
            iArr[i4] = i5;
            i5 = i6;
        }
    }

    public static int C(int i4, int[] iArr, int i5, int i6, int[] iArr2, int i7) {
        int i8 = 0;
        while (i8 < i4) {
            int i9 = iArr[i5 + i8];
            iArr2[i7 + i8] = (i6 >>> 31) | (i9 << 1);
            i8++;
            i6 = i9;
        }
        return i6 >>> 31;
    }

    public static int D(int i4, int[] iArr, int i5, int[] iArr2) {
        int i6 = 0;
        while (i6 < i4) {
            int i7 = iArr[i6];
            iArr2[i6] = (i5 >>> 31) | (i7 << 1);
            i6++;
            i5 = i7;
        }
        return i5 >>> 31;
    }

    public static long E(int i4, long[] jArr, int i5, long j4, long[] jArr2, int i6) {
        int i7 = 0;
        while (i7 < i4) {
            long j5 = jArr[i5 + i7];
            jArr2[i6 + i7] = (j4 >>> 63) | (j5 << 1);
            i7++;
            j4 = j5;
        }
        return j4 >>> 63;
    }

    public static int F(int i4, int[] iArr, int i5, int i6) {
        int i7 = 0;
        while (i7 < i4) {
            int i8 = iArr[i7];
            iArr[i7] = (i6 >>> (-i5)) | (i8 << i5);
            i7++;
            i6 = i8;
        }
        return i6 >>> (-i5);
    }

    public static int G(int i4, int[] iArr, int i5, int i6, int[] iArr2) {
        int i7 = 0;
        while (i7 < i4) {
            int i8 = iArr[i7];
            iArr2[i7] = (i6 >>> (-i5)) | (i8 << i5);
            i7++;
            i6 = i8;
        }
        return i6 >>> (-i5);
    }

    public static long H(int i4, long[] jArr, int i5, int i6, long j4) {
        int i7 = 0;
        while (i7 < i4) {
            int i8 = i5 + i7;
            long j5 = jArr[i8];
            jArr[i8] = (j4 >>> (-i6)) | (j5 << i6);
            i7++;
            j4 = j5;
        }
        return j4 >>> (-i6);
    }

    public static long I(int i4, long[] jArr, int i5, int i6, long j4, long[] jArr2, int i7) {
        int i8 = 0;
        while (i8 < i4) {
            long j5 = jArr[i5 + i8];
            jArr2[i7 + i8] = (j4 >>> (-i6)) | (j5 << i6);
            i8++;
            j4 = j5;
        }
        return j4 >>> (-i6);
    }

    public static int J(int i4, int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            long j5 = j4 + ((iArr[i5] & 4294967295L) - (4294967295L & iArr2[i5]));
            iArr3[i5] = (int) j5;
            j4 = j5 >> 32;
        }
        return (int) j4;
    }

    public static int K(int i4, int i5, int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) - (i5 & 4294967295L);
        iArr[0] = (int) j4;
        long j5 = (j4 >> 32) + ((4294967295L & iArr[1]) - 1);
        iArr[1] = (int) j5;
        if ((j5 >> 32) == 0) {
            return 0;
        }
        return l(i4, iArr, 2);
    }

    public static int L(int i4, int[] iArr, int i5, int[] iArr2, int i6) {
        long j4 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            long j5 = j4 + ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i5 + i7]));
            iArr2[i6 + i7] = (int) j5;
            j4 = j5 >> 32;
        }
        return (int) j4;
    }

    public static int M(int i4, int[] iArr, int[] iArr2) {
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            long j5 = j4 + ((iArr2[i5] & 4294967295L) - (4294967295L & iArr[i5]));
            iArr2[i5] = (int) j5;
            j4 = j5 >> 32;
        }
        return (int) j4;
    }

    public static int N(int i4, int i5, int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) - (4294967295L & i5);
        iArr[0] = (int) j4;
        if ((j4 >> 32) == 0) {
            return 0;
        }
        return l(i4, iArr, 1);
    }

    public static BigInteger O(int i4, int[] iArr) {
        byte[] bArr = new byte[i4 << 2];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                Z2.d.a(i6, bArr, ((i4 - 1) - i5) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void P(int i4, int[] iArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            iArr[i5] = 0;
        }
    }

    public static int a(int i4, int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            long j5 = j4 + (iArr[i5] & 4294967295L) + (4294967295L & iArr2[i5]);
            iArr3[i5] = (int) j5;
            j4 = j5 >>> 32;
        }
        return (int) j4;
    }

    public static int b(int i4, int i5, int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) + (i5 & 4294967295L);
        iArr[0] = (int) j4;
        long j5 = (j4 >>> 32) + (4294967295L & iArr[1]) + 1;
        iArr[1] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return s(i4, iArr, 2);
    }

    public static int c(int i4, int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            long j5 = j4 + (iArr[i5] & 4294967295L) + (iArr2[i5] & 4294967295L) + (4294967295L & iArr3[i5]);
            iArr3[i5] = (int) j5;
            j4 = j5 >>> 32;
        }
        return (int) j4;
    }

    public static int d(int i4, int[] iArr, int i5, int[] iArr2, int i6) {
        long j4 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            long j5 = j4 + (iArr[i5 + i7] & 4294967295L) + (4294967295L & iArr2[r7]);
            iArr2[i6 + i7] = (int) j5;
            j4 = j5 >>> 32;
        }
        return (int) j4;
    }

    public static int e(int i4, int[] iArr, int[] iArr2) {
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            long j5 = j4 + (iArr[i5] & 4294967295L) + (4294967295L & iArr2[i5]);
            iArr2[i5] = (int) j5;
            j4 = j5 >>> 32;
        }
        return (int) j4;
    }

    public static int f(int i4, int i5, int[] iArr, int i6) {
        long j4 = (i5 & 4294967295L) + (4294967295L & iArr[i6]);
        iArr[i6] = (int) j4;
        if ((j4 >>> 32) == 0) {
            return 0;
        }
        return s(i4, iArr, i6 + 1);
    }

    public static int g(int i4, int i5, int[] iArr) {
        long j4 = (i5 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j4;
        if ((j4 >>> 32) == 0) {
            return 0;
        }
        return s(i4, iArr, 1);
    }

    public static int[] h(int i4, int[] iArr) {
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, 0, iArr2, 0, i4);
        return iArr2;
    }

    public static int[] i(int i4) {
        return new int[i4];
    }

    public static long[] j(int i4) {
        return new long[i4];
    }

    public static int k(int i4, int[] iArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5] - 1;
            iArr[i5] = i6;
            if (i6 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int l(int i4, int[] iArr, int i5) {
        while (i5 < i4) {
            int i6 = iArr[i5] - 1;
            iArr[i5] = i6;
            if (i6 != -1) {
                return 0;
            }
            i5++;
        }
        return -1;
    }

    public static boolean m(int i4, int[] iArr, int[] iArr2) {
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (iArr[i5] != iArr2[i5]) {
                return false;
            }
        }
        return true;
    }

    public static int[] n(int i4, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i4) {
            throw new IllegalArgumentException();
        }
        int[] i5 = i((i4 + 31) >> 5);
        int i6 = 0;
        while (bigInteger.signum() != 0) {
            i5[i6] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i6++;
        }
        return i5;
    }

    public static int o(int[] iArr, int i4) {
        int i5;
        if (i4 == 0) {
            i5 = iArr[0];
        } else {
            int i6 = i4 >> 5;
            if (i6 < 0 || i6 >= iArr.length) {
                return 0;
            }
            i5 = iArr[i6] >>> (i4 & 31);
        }
        return i5 & 1;
    }

    public static boolean p(int i4, int[] iArr, int[] iArr2) {
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            int i6 = iArr[i5] ^ Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE ^ iArr2[i5];
            if (i6 < i7) {
                return false;
            }
            if (i6 > i7) {
                return true;
            }
        }
        return true;
    }

    public static int q(int i4, int[] iArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5] + 1;
            iArr[i5] = i6;
            if (i6 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int r(int i4, int[] iArr, int[] iArr2) {
        int i5 = 0;
        while (i5 < i4) {
            int i6 = iArr[i5] + 1;
            iArr2[i5] = i6;
            i5++;
            if (i6 != 0) {
                while (i5 < i4) {
                    iArr2[i5] = iArr[i5];
                    i5++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int s(int i4, int[] iArr, int i5) {
        while (i5 < i4) {
            int i6 = iArr[i5] + 1;
            iArr[i5] = i6;
            if (i6 != 0) {
                return 0;
            }
            i5++;
        }
        return 1;
    }

    public static int t(int i4, int[] iArr, int i5, int i6) {
        while (i6 < i4) {
            int i7 = i5 + i6;
            int i8 = iArr[i7] + 1;
            iArr[i7] = i8;
            if (i8 != 0) {
                return 0;
            }
            i6++;
        }
        return 1;
    }

    public static boolean u(int i4, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i5 = 1; i5 < i4; i5++) {
            if (iArr[i5] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(int i4, int[] iArr) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (iArr[i5] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int w(int i4, int i5, int[] iArr, int i6, int[] iArr2, int[] iArr3, int i7) {
        long j4 = i5 & 4294967295L;
        long j5 = i6 & 4294967295L;
        long j6 = 0;
        int i8 = 0;
        do {
            long j7 = j6 + ((iArr[i8] & 4294967295L) * j4) + ((iArr2[i8] & 4294967295L) * j5) + (iArr3[r10] & 4294967295L);
            iArr3[i7 + i8] = (int) j7;
            j6 = j7 >>> 32;
            i8++;
        } while (i8 < i4);
        return (int) j6;
    }

    public static int x(int i4, int i5, int[] iArr, int i6, int[] iArr2, int i7) {
        long j4 = i5 & 4294967295L;
        long j5 = 0;
        int i8 = 0;
        do {
            long j6 = j5 + ((iArr[i6 + i8] & 4294967295L) * j4) + (iArr2[r8] & 4294967295L);
            iArr2[i7 + i8] = (int) j6;
            j5 = j6 >>> 32;
            i8++;
        } while (i8 < i4);
        return (int) j5;
    }

    public static int y(int i4, int[] iArr, int i5) {
        while (true) {
            i4--;
            if (i4 < 0) {
                return i5 << 31;
            }
            int i6 = iArr[i4];
            iArr[i4] = (i5 << 31) | (i6 >>> 1);
            i5 = i6;
        }
    }

    public static int z(int i4, int[] iArr, int i5, int i6) {
        while (true) {
            i4--;
            if (i4 < 0) {
                return i6 << (-i5);
            }
            int i7 = iArr[i4];
            iArr[i4] = (i6 << (-i5)) | (i7 >>> i5);
            i6 = i7;
        }
    }
}
