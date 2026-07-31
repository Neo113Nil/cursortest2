package Y2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class f {
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
        long j9 = (j8 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j10;
        return (int) (j10 >>> 32);
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
        long j9 = (j8 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j10;
        return (int) (j10 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] d() {
        return new int[7];
    }

    public static int[] e() {
        return new int[14];
    }

    public static boolean f(int[] iArr, int[] iArr2) {
        for (int i4 = 6; i4 >= 0; i4--) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static int[] g(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] d4 = d();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            d4[i4] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i4++;
        }
        return d4;
    }

    public static int h(int[] iArr, int i4) {
        int i5;
        if (i4 == 0) {
            i5 = iArr[0];
        } else {
            int i6 = i4 >> 5;
            if (i6 < 0 || i6 >= 7) {
                return 0;
            }
            i5 = iArr[i6] >>> (i4 & 31);
        }
        return i5 & 1;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        for (int i4 = 6; i4 >= 0; i4--) {
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

    public static boolean j(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 7; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr) {
        for (int i4 = 0; i4 < 7; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr2[5] & 4294967295L;
        long j10 = iArr2[6] & 4294967295L;
        long j11 = iArr[0] & 4294967295L;
        long j12 = j11 * j4;
        iArr3[0] = (int) j12;
        long j13 = (j12 >>> 32) + (j11 * j5);
        iArr3[1] = (int) j13;
        long j14 = (j13 >>> 32) + (j11 * j6);
        iArr3[2] = (int) j14;
        long j15 = (j14 >>> 32) + (j11 * j7);
        iArr3[3] = (int) j15;
        long j16 = (j15 >>> 32) + (j11 * j8);
        iArr3[4] = (int) j16;
        long j17 = (j16 >>> 32) + (j11 * j9);
        iArr3[5] = (int) j17;
        long j18 = (j17 >>> 32) + (j11 * j10);
        iArr3[6] = (int) j18;
        iArr3[7] = (int) (j18 >>> 32);
        int i4 = 1;
        for (int i5 = 7; i4 < i5; i5 = 7) {
            long j19 = iArr[i4] & 4294967295L;
            long j20 = (j19 * j4) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j20;
            int i6 = i4 + 1;
            long j21 = j8;
            long j22 = (j20 >>> 32) + (j19 * j5) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j22;
            long j23 = (j22 >>> 32) + (j19 * j6) + (iArr3[r7] & 4294967295L);
            iArr3[i4 + 2] = (int) j23;
            long j24 = (j23 >>> 32) + (j19 * j7) + (iArr3[r7] & 4294967295L);
            iArr3[i4 + 3] = (int) j24;
            long j25 = (j24 >>> 32) + (j19 * j21) + (iArr3[r7] & 4294967295L);
            iArr3[i4 + 4] = (int) j25;
            long j26 = (j25 >>> 32) + (j19 * j9) + (iArr3[r7] & 4294967295L);
            iArr3[i4 + 5] = (int) j26;
            long j27 = (j26 >>> 32) + (j19 * j10) + (iArr3[r7] & 4294967295L);
            iArr3[i4 + 6] = (int) j27;
            iArr3[i4 + 7] = (int) (j27 >>> 32);
            i4 = i6;
            j8 = j21;
        }
    }

    public static long m(int i4, int[] iArr, int i5, int[] iArr2, int i6, int[] iArr3, int i7) {
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
        long j15 = (j13 >>> 32) + (j4 * j14) + j12 + (iArr2[i6 + 4] & 4294967295L);
        iArr3[i7 + 4] = (int) j15;
        long j16 = iArr[i5 + 5] & 4294967295L;
        long j17 = (j15 >>> 32) + (j4 * j16) + j14 + (iArr2[i6 + 5] & 4294967295L);
        iArr3[i7 + 5] = (int) j17;
        long j18 = iArr[i5 + 6] & 4294967295L;
        long j19 = (j17 >>> 32) + (j4 * j18) + j16 + (4294967295L & iArr2[i6 + 6]);
        iArr3[i7 + 6] = (int) j19;
        return (j19 >>> 32) + j18;
    }

    public static int n(int i4, long j4, int[] iArr, int i5) {
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
        return m.t(7, iArr, i5, 4);
    }

    public static int o(int i4, int i5, int[] iArr, int i6) {
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
        return m.t(7, iArr, i6, 3);
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr2[5] & 4294967295L;
        long j10 = iArr2[6] & 4294967295L;
        long j11 = 0;
        int i4 = 0;
        while (i4 < 7) {
            long j12 = j10;
            long j13 = iArr[i4] & 4294967295L;
            long j14 = (iArr3[i4] & 4294967295L) + (j13 * j4);
            iArr3[i4] = (int) j14;
            int i5 = i4 + 1;
            long j15 = (j14 >>> 32) + (j13 * j5) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j15;
            long j16 = (j15 >>> 32) + (j13 * j6) + (iArr3[r15] & 4294967295L);
            int i6 = i4;
            iArr3[i4 + 2] = (int) j16;
            long j17 = (j16 >>> 32) + (j13 * j7) + (iArr3[r2] & 4294967295L);
            iArr3[i6 + 3] = (int) j17;
            long j18 = (j17 >>> 32) + (j13 * j8) + (iArr3[r2] & 4294967295L);
            iArr3[i6 + 4] = (int) j18;
            long j19 = (j18 >>> 32) + (j13 * j9) + (iArr3[r2] & 4294967295L);
            iArr3[i6 + 5] = (int) j19;
            long j20 = (j19 >>> 32) + (j13 * j12) + (iArr3[r2] & 4294967295L);
            iArr3[i6 + 6] = (int) j20;
            long j21 = (j20 >>> 32) + j11 + (iArr3[r2] & 4294967295L);
            iArr3[i6 + 7] = (int) j21;
            j11 = j21 >>> 32;
            i4 = i5;
            j10 = j12;
        }
        return (int) j11;
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j4 = iArr[0] & 4294967295L;
        int i4 = 14;
        int i5 = 0;
        int i6 = 6;
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
                long j28 = j22 + (j25 * j4);
                int i12 = (int) j28;
                iArr2[4] = (i12 << 1) | i11;
                int i13 = i12 >>> 31;
                long j29 = j24 + (j28 >>> 32) + (j25 * j9);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j25 * j12);
                long j31 = j29 & 4294967295L;
                long j32 = (j26 & 4294967295L) + (j30 >>> 32) + (j25 * j16);
                long j33 = j30 & 4294967295L;
                long j34 = j27 + (j32 >>> 32);
                long j35 = iArr[5] & 4294967295L;
                long j36 = (iArr2[9] & 4294967295L) + (j34 >>> 32);
                long j37 = j31 + (j35 * j4);
                int i14 = (int) j37;
                iArr2[5] = (i14 << 1) | i13;
                int i15 = i14 >>> 31;
                long j38 = j33 + (j37 >>> 32) + (j35 * j9);
                long j39 = (j32 & 4294967295L) + (j38 >>> 32) + (j35 * j12);
                long j40 = j38 & 4294967295L;
                long j41 = (j34 & 4294967295L) + (j39 >>> 32) + (j35 * j16);
                long j42 = j39 & 4294967295L;
                long j43 = (j36 & 4294967295L) + (j41 >>> 32) + (j35 * j25);
                long j44 = j41 & 4294967295L;
                long j45 = (iArr2[10] & 4294967295L) + (j36 >>> 32) + (j43 >>> 32);
                long j46 = j43 & 4294967295L;
                long j47 = iArr[6] & 4294967295L;
                long j48 = (iArr2[11] & 4294967295L) + (j45 >>> 32);
                long j49 = j45 & 4294967295L;
                long j50 = j40 + (j4 * j47);
                int i16 = (int) j50;
                iArr2[6] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long j51 = j42 + (j50 >>> 32) + (j9 * j47);
                long j52 = j44 + (j51 >>> 32) + (j12 * j47);
                long j53 = j46 + (j52 >>> 32) + (j47 * j16);
                long j54 = j49 + (j53 >>> 32) + (j47 * j25);
                long j55 = (j48 & 4294967295L) + (j54 >>> 32) + (j47 * j35);
                long j56 = (iArr2[12] & 4294967295L) + (j48 >>> 32) + (j55 >>> 32);
                int i18 = (int) j51;
                iArr2[7] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j52;
                iArr2[8] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j53;
                iArr2[9] = i21 | (i22 << 1);
                int i23 = (int) j54;
                iArr2[10] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j55;
                iArr2[11] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j56;
                iArr2[12] = i26 | (i27 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j56 >>> 32))) << 1) | (i27 >>> 31);
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
        long j9 = (j8 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j10;
        return (int) (j10 >> 32);
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
        long j8 = (j7 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6]));
        iArr2[6] = (int) j10;
        return (int) (j10 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = iArr[i4];
            if (i5 != 0) {
                Z2.d.a(i5, bArr, (6 - i4) << 2);
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
        iArr[5] = 0;
        iArr[6] = 0;
    }
}
