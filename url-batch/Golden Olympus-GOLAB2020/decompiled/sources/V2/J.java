package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9496a = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9497b = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Y2.g.q(iArr3, f9496a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Y2.g.q(iArr2, f9496a))) {
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
            long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j7;
            j5 = j7 >> 32;
        }
        long j8 = j5 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = j9 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j11;
            j9 = j11 >> 32;
        }
        long j12 = j9 + ((iArr[6] & 4294967295L) - 1);
        iArr[6] = (int) j12;
        iArr[7] = (int) ((j12 >> 32) + (4294967295L & iArr[7]) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] m4 = Y2.g.m(bigInteger);
        if (m4[7] == -1) {
            int[] iArr = f9496a;
            if (Y2.g.q(m4, iArr)) {
                Y2.g.G(iArr, m4);
            }
        }
        return m4;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h4 = Y2.g.h();
        Y2.g.w(iArr, iArr2, h4);
        h(h4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.g.A(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Y2.m.p(16, iArr3, f9497b))) {
            Y2.m.M(16, f9497b, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.g.t(iArr)) {
            Y2.g.J(iArr2);
        } else {
            Y2.g.F(f9496a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j4 = iArr[9] & 4294967295L;
        long j5 = iArr[10] & 4294967295L;
        long j6 = iArr[11] & 4294967295L;
        long j7 = iArr[12] & 4294967295L;
        long j8 = iArr[13] & 4294967295L;
        long j9 = iArr[14] & 4294967295L;
        long j10 = iArr[15] & 4294967295L;
        long j11 = (iArr[8] & 4294967295L) - 6;
        long j12 = j11 + j4;
        long j13 = j4 + j5;
        long j14 = (j5 + j6) - j10;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j8 + j9;
        long j18 = j9 + j10;
        long j19 = j17 - j12;
        long j20 = ((iArr[0] & 4294967295L) - j15) - j19;
        iArr2[0] = (int) j20;
        long j21 = (j20 >> 32) + ((((iArr[1] & 4294967295L) + j13) - j16) - j18);
        iArr2[1] = (int) j21;
        long j22 = (j21 >> 32) + (((iArr[2] & 4294967295L) + j14) - j17);
        iArr2[2] = (int) j22;
        long j23 = (j22 >> 32) + ((((iArr[3] & 4294967295L) + (j15 << 1)) + j19) - j18);
        iArr2[3] = (int) j23;
        long j24 = (j23 >> 32) + ((((iArr[4] & 4294967295L) + (j16 << 1)) + j9) - j13);
        iArr2[4] = (int) j24;
        long j25 = (j24 >> 32) + (((iArr[5] & 4294967295L) + (j17 << 1)) - j14);
        iArr2[5] = (int) j25;
        long j26 = (j25 >> 32) + (iArr[6] & 4294967295L) + (j18 << 1) + j19;
        iArr2[6] = (int) j26;
        long j27 = (j26 >> 32) + (((((iArr[7] & 4294967295L) + (j10 << 1)) + j11) - j14) - j16);
        iArr2[7] = (int) j27;
        i((int) ((j27 >> 32) + 6), iArr2);
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
                long j9 = (j8 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j9;
                j7 = j9 >> 32;
            }
            long j10 = j7 + ((iArr[3] & 4294967295L) - j5);
            iArr[3] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j12;
                long j13 = (j12 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = j11 + ((iArr[6] & 4294967295L) - j5);
            iArr[6] = (int) j14;
            long j15 = (j14 >> 32) + (4294967295L & iArr[7]) + j5;
            iArr[7] = (int) j15;
            j4 = j15 >> 32;
        } else {
            j4 = 0;
        }
        if (j4 != 0 || (iArr[7] == -1 && Y2.g.q(iArr, f9496a))) {
            c(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] h4 = Y2.g.h();
        Y2.g.D(iArr, h4);
        h(h4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] h4 = Y2.g.h();
        Y2.g.D(iArr, h4);
        h(h4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.g.D(iArr2, h4);
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
            long j7 = (j6 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j7;
            j5 = j7 >> 32;
        }
        long j8 = j5 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = j9 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j11;
            j9 = j11 >> 32;
        }
        long j12 = j9 + (iArr[6] & 4294967295L) + 1;
        iArr[6] = (int) j12;
        iArr[7] = (int) ((j12 >> 32) + ((4294967295L & iArr[7]) - 1));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.g.F(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (Y2.m.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Y2.g.q(iArr2, f9496a))) {
            c(iArr2);
        }
    }
}
