package V2;

import java.math.BigInteger;

/* renamed from: V2.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1220t {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9568a = {-1, -1, -2, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9569b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9570c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Y2.e.p(iArr3, f9568a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Y2.e.p(iArr2, f9568a))) {
            c(iArr2);
        }
    }

    private static void c(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            long j6 = j5 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j6;
            j5 = j6 >> 32;
        }
        long j7 = j5 + (4294967295L & iArr[2]) + 1;
        iArr[2] = (int) j7;
        if ((j7 >> 32) != 0) {
            Y2.m.s(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] l4 = Y2.e.l(bigInteger);
        if (l4[5] == -1) {
            int[] iArr = f9568a;
            if (Y2.e.p(l4, iArr)) {
                Y2.e.E(iArr, l4);
            }
        }
        return l4;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g4 = Y2.e.g();
        Y2.e.v(iArr, iArr2, g4);
        h(g4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.e.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Y2.m.p(12, iArr3, f9569b))) {
            int[] iArr4 = f9570c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.e.s(iArr)) {
            Y2.e.H(iArr2);
        } else {
            Y2.e.D(f9568a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j4 = iArr[6] & 4294967295L;
        long j5 = iArr[7] & 4294967295L;
        long j6 = (iArr[10] & 4294967295L) + j4;
        long j7 = (iArr[11] & 4294967295L) + j5;
        long j8 = (iArr[0] & 4294967295L) + j6;
        int i4 = (int) j8;
        long j9 = (j8 >> 32) + (iArr[1] & 4294967295L) + j7;
        int i5 = (int) j9;
        iArr2[1] = i5;
        long j10 = j6 + (iArr[8] & 4294967295L);
        long j11 = j7 + (iArr[9] & 4294967295L);
        long j12 = (j9 >> 32) + (iArr[2] & 4294967295L) + j10;
        long j13 = j12 & 4294967295L;
        long j14 = (j12 >> 32) + (iArr[3] & 4294967295L) + j11;
        iArr2[3] = (int) j14;
        long j15 = (j14 >> 32) + (iArr[4] & 4294967295L) + (j10 - j4);
        iArr2[4] = (int) j15;
        long j16 = (j15 >> 32) + (iArr[5] & 4294967295L) + (j11 - j5);
        iArr2[5] = (int) j16;
        long j17 = j16 >> 32;
        long j18 = j13 + j17;
        long j19 = j17 + (i4 & 4294967295L);
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (i5 & 4294967295L);
            iArr2[1] = (int) j21;
            j18 += j21 >> 32;
        }
        iArr2[2] = (int) j18;
        if (((j18 >> 32) == 0 || Y2.m.s(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && Y2.e.p(iArr2, f9568a))) {
            return;
        }
        c(iArr2);
    }

    public static void i(int i4, int[] iArr) {
        long j4;
        if (i4 != 0) {
            long j5 = i4 & 4294967295L;
            long j6 = (iArr[0] & 4294967295L) + j5;
            iArr[0] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j8;
                j7 = j8 >> 32;
            }
            long j9 = j7 + (4294967295L & iArr[2]) + j5;
            iArr[2] = (int) j9;
            j4 = j9 >> 32;
        } else {
            j4 = 0;
        }
        if ((j4 == 0 || Y2.m.s(6, iArr, 3) == 0) && !(iArr[5] == -1 && Y2.e.p(iArr, f9568a))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] g4 = Y2.e.g();
        Y2.e.B(iArr, g4);
        h(g4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] g4 = Y2.e.g();
        Y2.e.B(iArr, g4);
        h(g4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.e.B(iArr2, g4);
            h(g4, iArr2);
        }
    }

    private static void l(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            long j6 = j5 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j6;
            j5 = j6 >> 32;
        }
        long j7 = j5 + ((4294967295L & iArr[2]) - 1);
        iArr[2] = (int) j7;
        if ((j7 >> 32) != 0) {
            Y2.m.l(6, iArr, 3);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.e.D(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (Y2.m.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Y2.e.p(iArr2, f9568a))) {
            c(iArr2);
        }
    }
}
