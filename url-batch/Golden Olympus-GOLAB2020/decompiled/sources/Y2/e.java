package Y2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class e {
    public static void A(int[] iArr, int i4, int[] iArr2, int i5) {
        long j4 = iArr[i4] & 4294967295L;
        int i6 = 0;
        int i7 = 12;
        int i8 = 5;
        while (true) {
            int i9 = i8 - 1;
            long j5 = iArr[i4 + i8] & 4294967295L;
            long j6 = j5 * j5;
            iArr2[i5 + (i7 - 1)] = (i6 << 31) | ((int) (j6 >>> 33));
            i7 -= 2;
            iArr2[i5 + i7] = (int) (j6 >>> 1);
            i6 = (int) j6;
            if (i9 <= 0) {
                long j7 = j4 * j4;
                long j8 = (j7 >>> 33) | ((i6 << 31) & 4294967295L);
                iArr2[i5] = (int) j7;
                int i10 = ((int) (j7 >>> 32)) & 1;
                long j9 = iArr[i4 + 1] & 4294967295L;
                long j10 = j8 + (j9 * j4);
                int i11 = (int) j10;
                iArr2[i5 + 1] = (i11 << 1) | i10;
                int i12 = i11 >>> 31;
                long j11 = (iArr2[r12] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[i4 + 2] & 4294967295L;
                long j13 = j11 + (j12 * j4);
                int i13 = (int) j13;
                iArr2[i5 + 2] = (i13 << 1) | i12;
                long j14 = (iArr2[r15] & 4294967295L) + (j13 >>> 32) + (j12 * j9);
                long j15 = (iArr2[r18] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[i4 + 3] & 4294967295L;
                long j17 = (iArr2[r14] & 4294967295L) + (j15 >>> 32);
                long j18 = (iArr2[r7] & 4294967295L) + (j17 >>> 32);
                long j19 = j17 & 4294967295L;
                long j20 = (j14 & 4294967295L) + (j16 * j4);
                int i14 = (int) j20;
                iArr2[i5 + 3] = (i14 << 1) | (i13 >>> 31);
                int i15 = i14 >>> 31;
                long j21 = (j15 & 4294967295L) + (j20 >>> 32) + (j16 * j9);
                long j22 = j19 + (j21 >>> 32) + (j16 * j12);
                long j23 = j18 + (j22 >>> 32);
                long j24 = iArr[i4 + 4] & 4294967295L;
                long j25 = (iArr2[r2] & 4294967295L) + (j23 >>> 32);
                long j26 = (iArr2[r15] & 4294967295L) + (j25 >>> 32);
                long j27 = j25 & 4294967295L;
                long j28 = (j21 & 4294967295L) + (j24 * j4);
                int i16 = (int) j28;
                iArr2[i5 + 4] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long j29 = (j22 & 4294967295L) + (j28 >>> 32) + (j24 * j9);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j24 * j12);
                long j31 = j29 & 4294967295L;
                long j32 = j27 + (j30 >>> 32) + (j24 * j16);
                long j33 = j26 + (j32 >>> 32);
                long j34 = iArr[i4 + 5] & 4294967295L;
                long j35 = (iArr2[r18] & 4294967295L) + (j33 >>> 32);
                long j36 = (iArr2[r20] & 4294967295L) + (j35 >>> 32);
                long j37 = j35 & 4294967295L;
                long j38 = j31 + (j4 * j34);
                int i18 = (int) j38;
                iArr2[i5 + 5] = (i18 << 1) | i17;
                long j39 = (j30 & 4294967295L) + (j38 >>> 32) + (j9 * j34);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j34 * j12);
                long j41 = (j33 & 4294967295L) + (j40 >>> 32) + (j34 * j16);
                long j42 = j37 + (j41 >>> 32) + (j34 * j24);
                long j43 = j36 + (j42 >>> 32);
                int i19 = (int) j39;
                iArr2[i5 + 6] = (i18 >>> 31) | (i19 << 1);
                int i20 = (int) j40;
                iArr2[i5 + 7] = (i20 << 1) | (i19 >>> 31);
                int i21 = (int) j41;
                iArr2[i5 + 8] = (i20 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j42;
                iArr2[i5 + 9] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j43;
                iArr2[i5 + 10] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = i5 + 11;
                iArr2[i27] = i26 | ((iArr2[i27] + ((int) (j43 >>> 32))) << 1);
                return;
            }
            i8 = i9;
        }
    }

    public static void B(int[] iArr, int[] iArr2) {
        long j4 = iArr[0] & 4294967295L;
        int i4 = 12;
        int i5 = 0;
        int i6 = 5;
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
                long j27 = j22 + (j25 * j4);
                int i12 = (int) j27;
                iArr2[4] = (i12 << 1) | i11;
                int i13 = i12 >>> 31;
                long j28 = j24 + (j27 >>> 32) + (j25 * j9);
                long j29 = (j23 & 4294967295L) + (j28 >>> 32) + (j25 * j12);
                long j30 = j28 & 4294967295L;
                long j31 = (j26 & 4294967295L) + (j29 >>> 32) + (j25 * j16);
                long j32 = j29 & 4294967295L;
                long j33 = (iArr2[8] & 4294967295L) + (j26 >>> 32) + (j31 >>> 32);
                long j34 = j31 & 4294967295L;
                long j35 = iArr[5] & 4294967295L;
                long j36 = (iArr2[9] & 4294967295L) + (j33 >>> 32);
                long j37 = j33 & 4294967295L;
                long j38 = j30 + (j4 * j35);
                int i14 = (int) j38;
                iArr2[5] = (i14 << 1) | i13;
                long j39 = j32 + (j38 >>> 32) + (j9 * j35);
                long j40 = j34 + (j39 >>> 32) + (j12 * j35);
                long j41 = j37 + (j40 >>> 32) + (j35 * j16);
                long j42 = (j36 & 4294967295L) + (j41 >>> 32) + (j25 * j35);
                long j43 = (iArr2[10] & 4294967295L) + (j36 >>> 32) + (j42 >>> 32);
                int i15 = (int) j39;
                iArr2[6] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j40;
                iArr2[7] = i16 | (i17 << 1);
                int i18 = (int) j41;
                iArr2[8] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j42;
                iArr2[9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j43;
                iArr2[10] = i21 | (i22 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j43 >>> 32))) << 1) | (i22 >>> 31);
                return;
            }
            i6 = i7;
        }
    }

    public static int C(int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        long j4 = (iArr[i4] & 4294967295L) - (iArr2[i5] & 4294967295L);
        iArr3[i6] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[i4 + 1] & 4294967295L) - (iArr2[i5 + 1] & 4294967295L));
        iArr3[i6 + 1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[i4 + 2] & 4294967295L) - (iArr2[i5 + 2] & 4294967295L));
        iArr3[i6 + 2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[i4 + 3] & 4294967295L) - (iArr2[i5 + 3] & 4294967295L));
        iArr3[i6 + 3] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[i4 + 4] & 4294967295L) - (iArr2[i5 + 4] & 4294967295L));
        iArr3[i6 + 4] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr[i4 + 5] & 4294967295L) - (iArr2[i5 + 5] & 4294967295L));
        iArr3[i6 + 5] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int D(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j9 >> 32);
    }

    public static int E(int[] iArr, int[] iArr2) {
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
        long j9 = (j8 >> 32) + ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5]));
        iArr2[5] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static BigInteger F(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i4 = 0; i4 < 6; i4++) {
            int i5 = iArr[i4];
            if (i5 != 0) {
                Z2.d.a(i5, bArr, (5 - i4) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger G(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i4 = 0; i4 < 3; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                Z2.d.b(j4, bArr, (2 - i4) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void H(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

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
        return (int) (j9 >>> 32);
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
        return (int) (j9 >>> 32);
    }

    public static int c(int[] iArr, int i4, int[] iArr2, int i5, int i6) {
        long j4 = (i6 & 4294967295L) + (iArr[i4] & 4294967295L) + (iArr2[i5] & 4294967295L);
        iArr2[i5] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[i4 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[i4 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[i4 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[i4 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 4] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[i4 + 5] & 4294967295L) + (4294967295L & iArr2[r12]);
        iArr2[i5 + 5] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int d(int[] iArr, int i4, int[] iArr2, int i5) {
        long j4 = (iArr[i4] & 4294967295L) + (iArr2[i5] & 4294967295L);
        int i6 = (int) j4;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        long j5 = (j4 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i7 = (int) j5;
        iArr[i4 + 1] = i7;
        iArr2[i5 + 1] = i7;
        long j6 = (j5 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i8 = (int) j6;
        iArr[i4 + 2] = i8;
        iArr2[i5 + 2] = i8;
        long j7 = (j6 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i9 = (int) j7;
        iArr[i4 + 3] = i9;
        iArr2[i5 + 3] = i9;
        long j8 = (j7 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i10 = (int) j8;
        iArr[i4 + 4] = i10;
        iArr2[i5 + 4] = i10;
        long j9 = (j8 >>> 32) + (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]);
        int i11 = (int) j9;
        iArr[i4 + 5] = i11;
        iArr2[i5 + 5] = i11;
        return (int) (j9 >>> 32);
    }

    public static int[] e() {
        return new int[6];
    }

    public static long[] f() {
        return new long[3];
    }

    public static int[] g() {
        return new int[12];
    }

    public static long[] h() {
        return new long[6];
    }

    public static boolean i(int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        boolean o4 = o(iArr, i4, iArr2, i5);
        if (o4) {
            C(iArr, i4, iArr2, i5, iArr3, i6);
            return o4;
        }
        C(iArr2, i5, iArr, i4, iArr3, i6);
        return o4;
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        for (int i4 = 5; i4 >= 0; i4--) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, long[] jArr2) {
        for (int i4 = 2; i4 >= 0; i4--) {
            if (jArr[i4] != jArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static int[] l(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] e4 = e();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            e4[i4] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i4++;
        }
        return e4;
    }

    public static long[] m(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] f4 = f();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            f4[i4] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i4++;
        }
        return f4;
    }

    public static int n(int[] iArr, int i4) {
        int i5;
        if (i4 == 0) {
            i5 = iArr[0];
        } else {
            int i6 = i4 >> 5;
            if (i6 < 0 || i6 >= 6) {
                return 0;
            }
            i5 = iArr[i6] >>> (i4 & 31);
        }
        return i5 & 1;
    }

    public static boolean o(int[] iArr, int i4, int[] iArr2, int i5) {
        for (int i6 = 5; i6 >= 0; i6--) {
            int i7 = iArr[i4 + i6] ^ Integer.MIN_VALUE;
            int i8 = Integer.MIN_VALUE ^ iArr2[i5 + i6];
            if (i7 < i8) {
                return false;
            }
            if (i7 > i8) {
                return true;
            }
        }
        return true;
    }

    public static boolean p(int[] iArr, int[] iArr2) {
        for (int i4 = 5; i4 >= 0; i4--) {
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

    public static boolean q(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 6; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 3; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(int[] iArr) {
        for (int i4 = 0; i4 < 6; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(long[] jArr) {
        for (int i4 = 0; i4 < 3; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void u(int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        long j4 = iArr2[i5] & 4294967295L;
        long j5 = iArr2[i5 + 1] & 4294967295L;
        long j6 = iArr2[i5 + 2] & 4294967295L;
        long j7 = iArr2[i5 + 3] & 4294967295L;
        long j8 = iArr2[i5 + 4] & 4294967295L;
        long j9 = iArr2[i5 + 5] & 4294967295L;
        long j10 = iArr[i4] & 4294967295L;
        long j11 = j10 * j4;
        iArr3[i6] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j5);
        iArr3[i6 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j6);
        iArr3[i6 + 2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j7);
        iArr3[i6 + 3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j8);
        iArr3[i6 + 4] = (int) j15;
        long j16 = (j15 >>> 32) + (j10 * j9);
        iArr3[i6 + 5] = (int) j16;
        iArr3[i6 + 6] = (int) (j16 >>> 32);
        int i7 = 1;
        int i8 = i6;
        while (i7 < 6) {
            int i9 = i8 + 1;
            long j17 = iArr[i4 + i7] & 4294967295L;
            int i10 = i8;
            long j18 = (j17 * j4) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j18;
            long j19 = (j18 >>> 32) + (j17 * j5) + (iArr3[r3] & 4294967295L);
            iArr3[i10 + 2] = (int) j19;
            long j20 = (j19 >>> 32) + (j17 * j6) + (iArr3[r21] & 4294967295L);
            iArr3[i10 + 3] = (int) j20;
            long j21 = (j20 >>> 32) + (j17 * j7) + (iArr3[r21] & 4294967295L);
            iArr3[i10 + 4] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j8) + (iArr3[r21] & 4294967295L);
            iArr3[i10 + 5] = (int) j22;
            long j23 = (j22 >>> 32) + (j17 * j9) + (iArr3[r2] & 4294967295L);
            iArr3[i10 + 6] = (int) j23;
            iArr3[i10 + 7] = (int) (j23 >>> 32);
            i7++;
            i8 = i9;
        }
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr2[5] & 4294967295L;
        int i4 = 1;
        long j10 = iArr[0] & 4294967295L;
        long j11 = j10 * j4;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j5);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j6);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j7);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j8);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (j10 * j9);
        iArr3[5] = (int) j16;
        int i5 = 6;
        iArr3[6] = (int) (j16 >>> 32);
        while (true) {
            int i6 = i4;
            if (i6 >= i5) {
                return;
            }
            long j17 = iArr[i6] & 4294967295L;
            long j18 = (j17 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j18;
            i4 = i6 + 1;
            long j19 = j8;
            long j20 = (j18 >>> 32) + (j17 * j5) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j20;
            long j21 = (j20 >>> 32) + (j17 * j6) + (iArr3[r5] & 4294967295L);
            iArr3[i6 + 2] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j7) + (iArr3[r5] & 4294967295L);
            iArr3[i6 + 3] = (int) j22;
            long j23 = (j22 >>> 32) + (j17 * j19) + (iArr3[r5] & 4294967295L);
            iArr3[i6 + 4] = (int) j23;
            long j24 = (j23 >>> 32) + (j17 * j9) + (iArr3[r5] & 4294967295L);
            iArr3[i6 + 5] = (int) j24;
            iArr3[i6 + 6] = (int) (j24 >>> 32);
            j8 = j19;
            i5 = 6;
        }
    }

    public static long w(int i4, int[] iArr, int i5, int[] iArr2, int i6, int[] iArr3, int i7) {
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
        long j17 = (j15 >>> 32) + (j4 * j16) + j14 + (4294967295L & iArr2[i6 + 5]);
        iArr3[i7 + 5] = (int) j17;
        return (j17 >>> 32) + j16;
    }

    public static int x(int i4, long j4, int[] iArr, int i5) {
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
        return m.t(6, iArr, i5, 4);
    }

    public static int y(int i4, int i5, int[] iArr, int i6) {
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
        return m.t(6, iArr, i6, 3);
    }

    public static int z(int[] iArr, int[] iArr2, int[] iArr3) {
        int i4 = 0;
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr2[5] & 4294967295L;
        long j10 = 0;
        while (i4 < 6) {
            long j11 = j4;
            int i5 = i4;
            long j12 = iArr[i4] & 4294967295L;
            long j13 = (iArr3[i5] & 4294967295L) + (j12 * j11);
            iArr3[i5] = (int) j13;
            int i6 = i5 + 1;
            long j14 = (j13 >>> 32) + (j12 * j5) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j14;
            long j15 = (j14 >>> 32) + (j12 * j6) + (iArr3[r15] & 4294967295L);
            iArr3[i5 + 2] = (int) j15;
            long j16 = (j15 >>> 32) + (j12 * j7) + (iArr3[r2] & 4294967295L);
            iArr3[i5 + 3] = (int) j16;
            long j17 = (j16 >>> 32) + (j12 * j8) + (iArr3[r2] & 4294967295L);
            iArr3[i5 + 4] = (int) j17;
            long j18 = (j17 >>> 32) + (j12 * j9) + (iArr3[r2] & 4294967295L);
            iArr3[i5 + 5] = (int) j18;
            long j19 = (j18 >>> 32) + j10 + (iArr3[r2] & 4294967295L);
            iArr3[i5 + 6] = (int) j19;
            j10 = j19 >>> 32;
            i4 = i6;
            j4 = j11;
        }
        return (int) j10;
    }
}
