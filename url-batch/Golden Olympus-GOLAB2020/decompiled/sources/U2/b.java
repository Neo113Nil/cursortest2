package U2;

import Y2.g;
import Y2.m;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9370a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9371b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g.a(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && g.q(iArr3, f9370a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (m.r(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && g.q(iArr2, f9370a))) {
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
        long j7 = j5 + ((iArr[2] & 4294967295L) - 1);
        iArr[2] = (int) j7;
        long j8 = (j7 >> 32) + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = j9 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j11;
            long j12 = (j11 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j12;
            j9 = j12 >> 32;
        }
        iArr[7] = (int) (j9 + (4294967295L & iArr[7]) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] m4 = g.m(bigInteger);
        if ((m4[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = f9370a;
            if (g.q(m4, iArr)) {
                g.G(iArr, m4);
            }
        }
        return m4;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h4 = g.h();
        g.w(iArr, iArr2, h4);
        h(h4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g.A(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && m.p(16, iArr3, f9371b))) {
            m.M(16, f9371b, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (g.t(iArr)) {
            g.J(iArr2);
        } else {
            g.F(f9370a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j4 = iArr[8] & 4294967295L;
        long j5 = iArr[9] & 4294967295L;
        long j6 = iArr[10] & 4294967295L;
        long j7 = iArr[11] & 4294967295L;
        long j8 = iArr[12] & 4294967295L;
        long j9 = iArr[13] & 4294967295L;
        long j10 = iArr[14] & 4294967295L;
        long j11 = iArr[15] & 4294967295L;
        long j12 = j6 + j7;
        long j13 = j9 + j10;
        long j14 = j13 + (j11 << 1);
        long j15 = j4 + j5 + j13;
        long j16 = j12 + j8 + j11 + j15;
        long j17 = (iArr[0] & 4294967295L) + j16 + j9 + j10 + j11;
        iArr2[0] = (int) j17;
        long j18 = (j17 >> 32) + (((iArr[1] & 4294967295L) + j16) - j4) + j10 + j11;
        iArr2[1] = (int) j18;
        long j19 = (j18 >> 32) + ((iArr[2] & 4294967295L) - j15);
        iArr2[2] = (int) j19;
        long j20 = (j19 >> 32) + ((((iArr[3] & 4294967295L) + j16) - j5) - j6) + j9;
        iArr2[3] = (int) j20;
        long j21 = (j20 >> 32) + ((((iArr[4] & 4294967295L) + j16) - j12) - j4) + j10;
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + (iArr[5] & 4294967295L) + j14 + j6;
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + (iArr[6] & 4294967295L) + j7 + j10 + j11;
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + (iArr[7] & 4294967295L) + j16 + j14 + j8;
        iArr2[7] = (int) j24;
        i((int) (j24 >> 32), iArr2);
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
            long j9 = j7 + ((iArr[2] & 4294967295L) - j5);
            iArr[2] = (int) j9;
            long j10 = (j9 >> 32) + (iArr[3] & 4294967295L) + j5;
            iArr[3] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j12;
                long j13 = (j12 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j13;
                long j14 = (j13 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j14;
                j11 = j14 >> 32;
            }
            long j15 = j11 + (4294967295L & iArr[7]) + j5;
            iArr[7] = (int) j15;
            j4 = j15 >> 32;
        } else {
            j4 = 0;
        }
        if (j4 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && g.q(iArr, f9370a))) {
            c(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] h4 = g.h();
        g.D(iArr, h4);
        h(h4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] h4 = g.h();
        g.D(iArr, h4);
        h(h4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            g.D(iArr2, h4);
            h(h4, iArr2);
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
        long j7 = j5 + (iArr[2] & 4294967295L) + 1;
        iArr[2] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = j9 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j11;
            long j12 = (j11 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j12;
            j9 = j12 >> 32;
        }
        iArr[7] = (int) (j9 + ((4294967295L & iArr[7]) - 1));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g.F(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (m.D(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && g.q(iArr2, f9370a))) {
            c(iArr2);
        }
    }
}
