package Y2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class c {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j7;
        return (int) (j7 >>> 32);
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
        return (int) (j7 >>> 32);
    }

    public static int[] c() {
        return new int[4];
    }

    public static long[] d() {
        return new long[2];
    }

    public static int[] e() {
        return new int[8];
    }

    public static long[] f() {
        return new long[4];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i4 = 3; i4 >= 0; i4--) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(long[] jArr, long[] jArr2) {
        for (int i4 = 1; i4 >= 0; i4--) {
            if (jArr[i4] != jArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static int[] i(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
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

    public static long[] j(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] d4 = d();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            d4[i4] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i4++;
        }
        return d4;
    }

    public static int k(int[] iArr, int i4) {
        int i5;
        if (i4 == 0) {
            i5 = iArr[0];
        } else {
            int i6 = i4 >> 5;
            if (i6 < 0 || i6 >= 4) {
                return 0;
            }
            i5 = iArr[i6] >>> (i4 & 31);
        }
        return i5 & 1;
    }

    public static boolean l(int[] iArr, int[] iArr2) {
        for (int i4 = 3; i4 >= 0; i4--) {
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

    public static boolean m(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 4; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean o(int[] iArr) {
        for (int i4 = 0; i4 < 4; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = 4294967295L;
        long j5 = iArr2[0] & 4294967295L;
        int i4 = 1;
        long j6 = iArr2[1] & 4294967295L;
        long j7 = iArr2[2] & 4294967295L;
        long j8 = iArr2[3] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = j9 * j5;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j6);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j7);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j8);
        iArr3[3] = (int) j13;
        iArr3[4] = (int) (j13 >>> 32);
        for (int i5 = 4; i4 < i5; i5 = 4) {
            long j14 = iArr[i4] & j4;
            long j15 = (j14 * j5) + (iArr3[i4] & j4);
            iArr3[i4] = (int) j15;
            int i6 = i4 + 1;
            long j16 = j4;
            long j17 = (j15 >>> 32) + (j14 * j6) + (iArr3[i6] & j16);
            iArr3[i6] = (int) j17;
            long j18 = (j17 >>> 32) + (j14 * j7) + (iArr3[r11] & j16);
            iArr3[i4 + 2] = (int) j18;
            long j19 = (j18 >>> 32) + (j14 * j8) + (iArr3[r3] & j16);
            iArr3[i4 + 3] = (int) j19;
            iArr3[i4 + 4] = (int) (j19 >>> 32);
            i4 = i6;
            j4 = j16;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        int i4 = 0;
        long j4 = 4294967295L;
        long j5 = iArr2[0] & 4294967295L;
        long j6 = iArr2[1] & 4294967295L;
        long j7 = iArr2[2] & 4294967295L;
        long j8 = iArr2[3] & 4294967295L;
        long j9 = 0;
        while (i4 < 4) {
            long j10 = iArr[i4] & j4;
            long j11 = j4;
            long j12 = (iArr3[i4] & j11) + (j10 * j5);
            iArr3[i4] = (int) j12;
            int i5 = i4 + 1;
            int i6 = i4;
            long j13 = (j12 >>> 32) + (j10 * j6) + (iArr3[i5] & j11);
            iArr3[i5] = (int) j13;
            long j14 = (j13 >>> 32) + (j10 * j7) + (iArr3[r15] & j11);
            iArr3[i6 + 2] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j8) + (iArr3[r3] & j11);
            iArr3[i6 + 3] = (int) j15;
            long j16 = (j15 >>> 32) + j9 + (iArr3[r2] & j11);
            iArr3[i6 + 4] = (int) j16;
            j9 = j16 >>> 32;
            i4 = i5;
            j4 = j11;
            j5 = j5;
        }
        return (int) j9;
    }

    public static void s(int[] iArr, int[] iArr2) {
        long j4 = iArr[0] & 4294967295L;
        int i4 = 8;
        int i5 = 0;
        int i6 = 3;
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
                long j19 = (j14 & 4294967295L) + (j4 * j16);
                int i10 = (int) j19;
                iArr2[3] = (i10 << 1) | (i9 >>> 31);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j9 * j16);
                long j21 = (j17 & 4294967295L) + (j20 >>> 32) + (j16 * j12);
                long j22 = j18 + (j21 >>> 32);
                int i11 = (int) j20;
                iArr2[4] = (i11 << 1) | (i10 >>> 31);
                int i12 = (int) (j21 & 4294967295L);
                iArr2[5] = (i12 << 1) | (i11 >>> 31);
                int i13 = (int) j22;
                iArr2[6] = (i12 >>> 31) | (i13 << 1);
                iArr2[7] = (i13 >>> 31) | ((iArr2[7] + ((int) (j22 >>> 32))) << 1);
                return;
            }
            i6 = i7;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int u(int[] iArr, int[] iArr2) {
        long j4 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr2[3] & 4294967295L) - (4294967295L & iArr[3]));
        iArr2[3] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger v(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = iArr[i4];
            if (i5 != 0) {
                Z2.d.a(i5, bArr, (3 - i4) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger w(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i4 = 0; i4 < 2; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                Z2.d.b(j4, bArr, (1 - i4) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void x(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}
