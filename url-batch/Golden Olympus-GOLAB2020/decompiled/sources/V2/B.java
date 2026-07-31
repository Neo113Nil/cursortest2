package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9477a = {1, 0, 0, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9478b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9479c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Y2.f.i(iArr3, f9477a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Y2.f.i(iArr2, f9477a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            long j6 = j5 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j6;
            long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j7;
            j5 = j7 >> 32;
        }
        long j8 = j5 + (4294967295L & iArr[3]) + 1;
        iArr[3] = (int) j8;
        if ((j8 >> 32) != 0) {
            Y2.m.s(7, iArr, 4);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] g4 = Y2.f.g(bigInteger);
        if (g4[6] == -1) {
            int[] iArr = f9477a;
            if (Y2.f.i(g4, iArr)) {
                Y2.f.s(iArr, g4);
            }
        }
        return g4;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e4 = Y2.f.e();
        Y2.f.l(iArr, iArr2, e4);
        h(e4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.f.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Y2.m.p(14, iArr3, f9478b))) {
            int[] iArr4 = f9479c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.f.k(iArr)) {
            Y2.f.u(iArr2);
        } else {
            Y2.f.r(f9477a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j4 = iArr[10] & 4294967295L;
        long j5 = iArr[11] & 4294967295L;
        long j6 = iArr[12] & 4294967295L;
        long j7 = iArr[13] & 4294967295L;
        long j8 = ((iArr[7] & 4294967295L) + j5) - 1;
        long j9 = (iArr[8] & 4294967295L) + j6;
        long j10 = (iArr[9] & 4294967295L) + j7;
        long j11 = (iArr[0] & 4294967295L) - j8;
        long j12 = j11 & 4294967295L;
        long j13 = (j11 >> 32) + ((iArr[1] & 4294967295L) - j9);
        int i4 = (int) j13;
        iArr2[1] = i4;
        long j14 = (j13 >> 32) + ((iArr[2] & 4294967295L) - j10);
        int i5 = (int) j14;
        iArr2[2] = i5;
        long j15 = (j14 >> 32) + (((iArr[3] & 4294967295L) + j8) - j4);
        long j16 = j15 & 4294967295L;
        long j17 = (j15 >> 32) + (((iArr[4] & 4294967295L) + j9) - j5);
        iArr2[4] = (int) j17;
        long j18 = (j17 >> 32) + (((iArr[5] & 4294967295L) + j10) - j6);
        iArr2[5] = (int) j18;
        long j19 = (j18 >> 32) + (((iArr[6] & 4294967295L) + j4) - j7);
        iArr2[6] = (int) j19;
        long j20 = (j19 >> 32) + 1;
        long j21 = j16 + j20;
        long j22 = j12 - j20;
        iArr2[0] = (int) j22;
        long j23 = j22 >> 32;
        if (j23 != 0) {
            long j24 = j23 + (i4 & 4294967295L);
            iArr2[1] = (int) j24;
            long j25 = (j24 >> 32) + (i5 & 4294967295L);
            iArr2[2] = (int) j25;
            j21 += j25 >> 32;
        }
        iArr2[3] = (int) j21;
        if (((j21 >> 32) == 0 || Y2.m.s(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Y2.f.i(iArr2, f9477a))) {
            return;
        }
        c(iArr2);
    }

    public static void i(int i4, int[] iArr) {
        long j4;
        if (i4 != 0) {
            long j5 = i4 & 4294967295L;
            long j6 = (iArr[0] & 4294967295L) - j5;
            iArr[0] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j8;
                long j9 = (j8 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j9;
                j7 = j9 >> 32;
            }
            long j10 = j7 + (4294967295L & iArr[3]) + j5;
            iArr[3] = (int) j10;
            j4 = j10 >> 32;
        } else {
            j4 = 0;
        }
        if ((j4 == 0 || Y2.m.s(7, iArr, 4) == 0) && !(iArr[6] == -1 && Y2.f.i(iArr, f9477a))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] e4 = Y2.f.e();
        Y2.f.q(iArr, e4);
        h(e4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] e4 = Y2.f.e();
        Y2.f.q(iArr, e4);
        h(e4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.f.q(iArr2, e4);
            h(e4, iArr2);
        }
    }

    private static void l(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            long j6 = j5 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j6;
            long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j7;
            j5 = j7 >> 32;
        }
        long j8 = j5 + ((4294967295L & iArr[3]) - 1);
        iArr[3] = (int) j8;
        if ((j8 >> 32) != 0) {
            Y2.m.l(7, iArr, 4);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.f.r(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (Y2.m.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Y2.f.i(iArr2, f9477a))) {
            c(iArr2);
        }
    }
}
