package Y2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class d {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int[] c() {
        return new int[5];
    }

    public static int[] d() {
        return new int[10];
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        for (int i4 = 4; i4 >= 0; i4--) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static int[] f(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] c4 = c();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            c4[i4] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i4++;
        }
        return c4;
    }

    public static int g(int[] iArr, int i4) {
        int i5;
        if (i4 == 0) {
            i5 = iArr[0];
        } else {
            int i6 = i4 >> 5;
            if (i6 < 0 || i6 >= 5) {
                return 0;
            }
            i5 = iArr[i6] >>> (i4 & 31);
        }
        return i5 & 1;
    }

    public static boolean h(int[] iArr, int[] iArr2) {
        for (int i4 = 4; i4 >= 0; i4--) {
            int i5 = iArr[i4] ^ Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE ^ iArr2[i4];
            if (i5 < i6) {
                return false;
            }
            if (i5 > i6) {
                return true;
            }
        }
        return true;
    }

    public static boolean i(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(int[] iArr) {
        for (int i4 = 0; i4 < 5; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        int i4 = 1;
        long j10 = j9 * j4;
        iArr3[0] = (int) j10;
        char c4 = ' ';
        long j11 = (j10 >>> 32) + (j9 * j5);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j6);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j7);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j8);
        iArr3[4] = (int) j14;
        int i5 = 5;
        iArr3[5] = (int) (j14 >>> 32);
        while (true) {
            int i6 = i4;
            if (i6 >= i5) {
                return;
            }
            long j15 = iArr[i6] & 4294967295L;
            long j16 = (j15 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j16;
            i4 = i6 + 1;
            char c5 = c4;
            long j17 = (j16 >>> c4) + (j15 * j5) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j17;
            long j18 = j8;
            long j19 = (j17 >>> c5) + (j15 * j6) + (iArr3[r8] & 4294967295L);
            iArr3[i6 + 2] = (int) j19;
            long j20 = (j19 >>> c5) + (j15 * j7) + (iArr3[r6] & 4294967295L);
            iArr3[i6 + 3] = (int) j20;
            long j21 = (j20 >>> c5) + (j15 * j18) + (iArr3[r2] & 4294967295L);
            iArr3[i6 + 4] = (int) j21;
            iArr3[i6 + 5] = (int) (j21 >>> c5);
            c4 = c5;
            j8 = j18;
            i5 = 5;
        }
    }

    public static long l(int i4, int[] iArr, int i5, int[] iArr2, int i6, int[] iArr3, int i7) {
        long j4 = i4 & 4294967295L;
        long j5 = iArr[i5] & 4294967295L;
        long j6 = (j4 * j5) + (iArr2[i6] & 4294967295L);
        iArr3[i7] = (int) j6;
        long j7 = iArr[i5 + 1] & 4294967295L;
        long j8 = (j6 >>> 32) + (j4 * j7) + j5 + (iArr2[i6 + 1] & 4294967295L);
        iArr3[i7 + 1] = (int) j8;
        long j9 = j8 >>> 32;
        long j10 = iArr[i5 + 2] & 4294967295L;
        long j11 = j9 + (j4 * j10) + j7 + (iArr2[i6 + 2] & 4294967295L);
        iArr3[i7 + 2] = (int) j11;
        long j12 = iArr[i5 + 3] & 4294967295L;
        long j13 = (j11 >>> 32) + (j4 * j12) + j10 + (iArr2[i6 + 3] & 4294967295L);
        iArr3[i7 + 3] = (int) j13;
        long j14 = iArr[i5 + 4] & 4294967295L;
        long j15 = (j13 >>> 32) + (j4 * j14) + j12 + (4294967295L & iArr2[i6 + 4]);
        iArr3[i7 + 4] = (int) j15;
        return (j15 >>> 32) + j14;
    }

    public static int m(int i4, long j4, int[] iArr, int i5) {
        long j5 = i4 & 4294967295L;
        long j6 = j4 & 4294967295L;
        long j7 = (j5 * j6) + (iArr[i5] & 4294967295L);
        iArr[i5] = (int) j7;
        long j8 = j4 >>> 32;
        long j9 = (j5 * j8) + j6;
        long j10 = (j7 >>> 32) + j9 + (iArr[r4] & 4294967295L);
        iArr[i5 + 1] = (int) j10;
        long j11 = (j10 >>> 32) + j8 + (iArr[r4] & 4294967295L);
        iArr[i5 + 2] = (int) j11;
        long j12 = j11 >>> 32;
        long j13 = j12 + (iArr[r0] & 4294967295L);
        iArr[i5 + 3] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return m.t(5, iArr, i5, 4);
    }

    public static int n(int i4, int i5, int[] iArr, int i6) {
        long j4 = i4 & 4294967295L;
        long j5 = i5 & 4294967295L;
        long j6 = (j4 * j5) + (iArr[i6] & 4294967295L);
        iArr[i6] = (int) j6;
        long j7 = (j6 >>> 32) + j5 + (iArr[r5] & 4294967295L);
        iArr[i6 + 1] = (int) j7;
        long j8 = j7 >>> 32;
        long j9 = j8 + (iArr[r0] & 4294967295L);
        iArr[i6 + 2] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return m.t(5, iArr, i6, 3);
    }

    public static int o(int[] iArr, int[] iArr2, int[] iArr3) {
        int i4 = 0;
        long j4 = 4294967295L;
        long j5 = iArr2[0] & 4294967295L;
        long j6 = iArr2[1] & 4294967295L;
        long j7 = iArr2[2] & 4294967295L;
        long j8 = iArr2[3] & 4294967295L;
        long j9 = iArr2[4] & 4294967295L;
        long j10 = 0;
        while (i4 < 5) {
            long j11 = j4;
            long j12 = iArr[i4] & j11;
            int i5 = i4;
            long j13 = (j12 * j5) + (iArr3[i4] & j11);
            iArr3[i5] = (int) j13;
            int i6 = i5 + 1;
            long j14 = (j13 >>> 32) + (j12 * j6) + (iArr3[i6] & j11);
            iArr3[i6] = (int) j14;
            long j15 = (j14 >>> 32) + (j12 * j7) + (iArr3[r15] & j11);
            iArr3[i5 + 2] = (int) j15;
            long j16 = (j15 >>> 32) + (j12 * j8) + (iArr3[r2] & j11);
            iArr3[i5 + 3] = (int) j16;
            long j17 = (j16 >>> 32) + (j12 * j9) + (iArr3[r2] & j11);
            iArr3[i5 + 4] = (int) j17;
            long j18 = (j17 >>> 32) + j10 + (iArr3[r2] & j11);
            iArr3[i5 + 5] = (int) j18;
            j10 = j18 >>> 32;
            j4 = j11;
            j5 = j5;
            i4 = i6;
        }
        return (int) j10;
    }

    public static int p(int i4, int i5, int[] iArr, int i6) {
        long j4 = ((i5 & 4294967295L) * (i4 & 4294967295L)) + (iArr[i6] & 4294967295L);
        iArr[i6] = (int) j4;
        long j5 = (j4 >>> 32) + (4294967295L & iArr[r1]);
        iArr[i6 + 1] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return m.t(5, iArr, i6, 2);
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j4 = iArr[0] & 4294967295L;
        int i4 = 10;
        int i5 = 0;
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            long j5 = iArr[i6] & 4294967295L;
            long j6 = j5 * j5;
            iArr2[i4 - 1] = (i5 << 31) | ((int) (j6 >>> 33));
            i4 -= 2;
            iArr2[i4] = (int) (j6 >>> 1);
            i5 = (int) j6;
            if (i7 <= 0) {
                long j7 = j4 * j4;
                long j8 = (j7 >>> 33) | ((i5 << 31) & 4294967295L);
                iArr2[0] = (int) j7;
                long j9 = iArr[1] & 4294967295L;
                long j10 = j8 + (j9 * j4);
                int i8 = (int) j10;
                iArr2[1] = (i8 << 1) | (((int) (j7 >>> 32)) & 1);
                long j11 = (iArr2[2] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[2] & 4294967295L;
                long j13 = j11 + (j12 * j4);
                int i9 = (int) j13;
                iArr2[2] = (i9 << 1) | (i8 >>> 31);
                long j14 = (iArr2[3] & 4294967295L) + (j13 >>> 32) + (j12 * j9);
                long j15 = (iArr2[4] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[3] & 4294967295L;
                long j17 = (iArr2[5] & 4294967295L) + (j15 >>> 32);
                long j18 = (iArr2[6] & 4294967295L) + (j17 >>> 32);
                long j19 = (j14 & 4294967295L) + (j16 * j4);
                int i10 = (int) j19;
                iArr2[3] = (i10 << 1) | (i9 >>> 31);
                int i11 = i10 >>> 31;
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j16 * j9);
                long j21 = (j17 & 4294967295L) + (j20 >>> 32) + (j16 * j12);
                long j22 = j20 & 4294967295L;
                long j23 = j18 + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = iArr[4] & 4294967295L;
                long j26 = (iArr2[7] & 4294967295L) + (j23 >>> 32);
                long j27 = (iArr2[8] & 4294967295L) + (j26 >>> 32);
                long j28 = j22 + (j4 * j25);
                int i12 = (int) j28;
                iArr2[4] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long j29 = j24 + (j28 >>> 32) + (j25 * j9);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j25 * j12);
                long j31 = (j26 & 4294967295L) + (j30 >>> 32) + (j25 * j16);
                long j32 = j27 + (j31 >>> 32);
                int i14 = (int) j29;
                iArr2[5] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j30;
                iArr2[6] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j31;
                iArr2[7] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j32;
                iArr2[8] = i19 | (i20 << 1);
                iArr2[9] = (i20 >>> 31) | ((iArr2[9] + ((int) (j32 >>> 32))) << 1);
                return;
            }
            i6 = i7;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int s(int[] iArr, int[] iArr2) {
        long j4 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr2[4] & 4294967295L) - (4294967295L & iArr[4]));
        iArr2[4] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = iArr[i4];
            if (i5 != 0) {
                Z2.d.a(i5, bArr, (4 - i4) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void u(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }
}
