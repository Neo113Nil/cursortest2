package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9504a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9505b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9506c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.m.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Y2.m.p(12, iArr3, f9504a))) {
            d(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.m.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Y2.m.p(24, iArr3, f9505b))) {
            int[] iArr4 = f9506c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(24, iArr3, iArr4.length);
            }
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (Y2.m.r(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Y2.m.p(12, iArr2, f9504a))) {
            d(iArr2);
        }
    }

    private static void d(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[1] & 4294967295L) - 1);
        iArr[1] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j7;
            j6 = j7 >> 32;
        }
        long j8 = j6 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j8;
        long j9 = (j8 >> 32) + (4294967295L & iArr[4]) + 1;
        iArr[4] = (int) j9;
        if ((j9 >> 32) != 0) {
            Y2.m.s(12, iArr, 5);
        }
    }

    public static int[] e(BigInteger bigInteger) {
        int[] n4 = Y2.m.n(384, bigInteger);
        if (n4[11] == -1) {
            int[] iArr = f9504a;
            if (Y2.m.p(12, n4, iArr)) {
                Y2.m.M(12, iArr, n4);
            }
        }
        return n4;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] i4 = Y2.m.i(24);
        Y2.i.a(iArr, iArr2, i4);
        h(i4, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.m.v(12, iArr)) {
            Y2.m.P(12, iArr2);
        } else {
            Y2.m.J(12, f9504a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j4 = iArr[16] & 4294967295L;
        long j5 = iArr[17] & 4294967295L;
        long j6 = iArr[18] & 4294967295L;
        long j7 = iArr[19] & 4294967295L;
        long j8 = iArr[20] & 4294967295L;
        long j9 = iArr[21] & 4294967295L;
        long j10 = iArr[22] & 4294967295L;
        long j11 = iArr[23] & 4294967295L;
        long j12 = ((iArr[12] & 4294967295L) + j8) - 1;
        long j13 = (iArr[13] & 4294967295L) + j10;
        long j14 = (iArr[14] & 4294967295L) + j10 + j11;
        long j15 = (iArr[15] & 4294967295L) + j11;
        long j16 = j5 + j9;
        long j17 = j9 - j11;
        long j18 = j10 - j11;
        long j19 = j12 + j17;
        long j20 = (iArr[0] & 4294967295L) + j19;
        iArr2[0] = (int) j20;
        long j21 = (j20 >> 32) + (((iArr[1] & 4294967295L) + j11) - j12) + j13;
        iArr2[1] = (int) j21;
        long j22 = (j21 >> 32) + (((iArr[2] & 4294967295L) - j9) - j13) + j14;
        iArr2[2] = (int) j22;
        long j23 = (j22 >> 32) + ((iArr[3] & 4294967295L) - j14) + j15 + j19;
        iArr2[3] = (int) j23;
        long j24 = (j23 >> 32) + (((((iArr[4] & 4294967295L) + j4) + j9) + j13) - j15) + j19;
        iArr2[4] = (int) j24;
        long j25 = (j24 >> 32) + ((iArr[5] & 4294967295L) - j4) + j13 + j14 + j16;
        iArr2[5] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[6] & 4294967295L) + j6) - j5) + j14 + j15;
        iArr2[6] = (int) j26;
        long j27 = (j26 >> 32) + ((((iArr[7] & 4294967295L) + j4) + j7) - j6) + j15;
        iArr2[7] = (int) j27;
        long j28 = (j27 >> 32) + (((((iArr[8] & 4294967295L) + j4) + j5) + j8) - j7);
        iArr2[8] = (int) j28;
        long j29 = (j28 >> 32) + (((iArr[9] & 4294967295L) + j6) - j8) + j16;
        iArr2[9] = (int) j29;
        long j30 = (j29 >> 32) + ((((iArr[10] & 4294967295L) + j6) + j7) - j17) + j18;
        iArr2[10] = (int) j30;
        long j31 = (j30 >> 32) + ((((iArr[11] & 4294967295L) + j7) + j8) - j18);
        iArr2[11] = (int) j31;
        i((int) ((j31 >> 32) + 1), iArr2);
    }

    public static void i(int i4, int[] iArr) {
        long j4;
        if (i4 != 0) {
            long j5 = i4 & 4294967295L;
            long j6 = (iArr[0] & 4294967295L) + j5;
            iArr[0] = (int) j6;
            long j7 = (j6 >> 32) + ((iArr[1] & 4294967295L) - j5);
            iArr[1] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j9;
                j8 = j9 >> 32;
            }
            long j10 = j8 + (iArr[3] & 4294967295L) + j5;
            iArr[3] = (int) j10;
            long j11 = (j10 >> 32) + (4294967295L & iArr[4]) + j5;
            iArr[4] = (int) j11;
            j4 = j11 >> 32;
        } else {
            j4 = 0;
        }
        if ((j4 == 0 || Y2.m.s(12, iArr, 5) == 0) && !(iArr[11] == -1 && Y2.m.p(12, iArr, f9504a))) {
            return;
        }
        d(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] i4 = Y2.m.i(24);
        Y2.i.b(iArr, i4);
        h(i4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] i5 = Y2.m.i(24);
        Y2.i.b(iArr, i5);
        h(i5, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.i.b(iArr2, i5);
            h(i5, iArr2);
        }
    }

    private static void l(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j4;
        long j5 = (j4 >> 32) + (iArr[1] & 4294967295L) + 1;
        iArr[1] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j7;
            j6 = j7 >> 32;
        }
        long j8 = j6 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j8;
        long j9 = (j8 >> 32) + ((4294967295L & iArr[4]) - 1);
        iArr[4] = (int) j9;
        if ((j9 >> 32) != 0) {
            Y2.m.l(12, iArr, 5);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.m.J(12, iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (Y2.m.D(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Y2.m.p(12, iArr2, f9504a))) {
            d(iArr2);
        }
    }
}
