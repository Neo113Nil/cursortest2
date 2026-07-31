package V2;

import java.math.BigInteger;

/* renamed from: V2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1185b {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9527a = {-1, -1, -1, -3};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9528b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9529c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.c.a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && Y2.c.l(iArr3, f9527a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Y2.c.l(iArr2, f9527a))) {
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
        iArr[3] = (int) (j5 + (4294967295L & iArr[3]) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] i4 = Y2.c.i(bigInteger);
        if ((i4[3] >>> 1) >= 2147483646) {
            int[] iArr = f9527a;
            if (Y2.c.l(i4, iArr)) {
                Y2.c.u(iArr, i4);
            }
        }
        return i4;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e4 = Y2.c.e();
        Y2.c.q(iArr, iArr2, e4);
        h(e4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.c.r(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && Y2.g.q(iArr3, f9528b))) {
            int[] iArr4 = f9529c;
            Y2.m.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.c.o(iArr)) {
            Y2.c.x(iArr2);
        } else {
            Y2.c.t(f9527a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j4 = iArr[7] & 4294967295L;
        long j5 = (iArr[3] & 4294967295L) + j4;
        long j6 = (iArr[6] & 4294967295L) + (j4 << 1);
        long j7 = (iArr[5] & 4294967295L) + (j6 << 1);
        long j8 = (iArr[1] & 4294967295L) + j7;
        long j9 = (iArr[4] & 4294967295L) + (j7 << 1);
        long j10 = (iArr[0] & 4294967295L) + j9;
        iArr2[0] = (int) j10;
        long j11 = j8 + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (iArr[2] & 4294967295L) + j6 + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = j5 + (j9 << 1) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        i((int) (j13 >>> 32), iArr2);
    }

    public static void i(int i4, int[] iArr) {
        while (i4 != 0) {
            long j4 = i4 & 4294967295L;
            long j5 = (iArr[0] & 4294967295L) + j4;
            iArr[0] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j7;
                long j8 = (j7 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = j6 + (4294967295L & iArr[3]) + (j4 << 1);
            iArr[3] = (int) j9;
            i4 = (int) (j9 >> 32);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] e4 = Y2.c.e();
        Y2.c.s(iArr, e4);
        h(e4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] e4 = Y2.c.e();
        Y2.c.s(iArr, e4);
        h(e4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.c.s(iArr2, e4);
            h(e4, iArr2);
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
        iArr[3] = (int) (j5 + ((4294967295L & iArr[3]) - 2));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.c.t(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (Y2.m.D(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && Y2.c.l(iArr2, f9527a))) {
            c(iArr2);
        }
    }
}
