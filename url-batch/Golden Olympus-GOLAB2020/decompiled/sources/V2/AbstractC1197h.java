package V2;

import java.math.BigInteger;

/* renamed from: V2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1197h {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9540a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9541b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9542c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.d.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Y2.d.h(iArr3, f9540a))) {
            Y2.m.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Y2.d.h(iArr2, f9540a))) {
            Y2.m.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] f4 = Y2.d.f(bigInteger);
        if (f4[4] == -1) {
            int[] iArr = f9540a;
            if (Y2.d.h(f4, iArr)) {
                Y2.d.s(iArr, f4);
            }
        }
        return f4;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] d4 = Y2.d.d();
        Y2.d.k(iArr, iArr2, d4);
        g(d4, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.d.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Y2.m.p(10, iArr3, f9541b))) {
            int[] iArr4 = f9542c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (Y2.d.j(iArr)) {
            Y2.d.u(iArr2);
        } else {
            Y2.d.r(f9540a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        long j4 = iArr[5] & 4294967295L;
        long j5 = iArr[6] & 4294967295L;
        long j6 = iArr[7] & 4294967295L;
        long j7 = iArr[8] & 4294967295L;
        long j8 = iArr[9] & 4294967295L;
        long j9 = (iArr[0] & 4294967295L) + j4 + (j4 << 31);
        iArr2[0] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[1] & 4294967295L) + j5 + (j5 << 31);
        iArr2[1] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[2] & 4294967295L) + j6 + (j6 << 31);
        iArr2[2] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[3] & 4294967295L) + j7 + (j7 << 31);
        iArr2[3] = (int) j12;
        long j13 = (j12 >>> 32) + (4294967295L & iArr[4]) + j8 + (j8 << 31);
        iArr2[4] = (int) j13;
        h((int) (j13 >>> 32), iArr2);
    }

    public static void h(int i4, int[] iArr) {
        if ((i4 == 0 || Y2.d.p(-2147483647, i4, iArr, 0) == 0) && !(iArr[4] == -1 && Y2.d.h(iArr, f9540a))) {
            return;
        }
        Y2.m.g(5, -2147483647, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] d4 = Y2.d.d();
        Y2.d.q(iArr, d4);
        g(d4, iArr2);
    }

    public static void j(int[] iArr, int i4, int[] iArr2) {
        int[] d4 = Y2.d.d();
        Y2.d.q(iArr, d4);
        g(d4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.d.q(iArr2, d4);
            g(d4, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.d.r(iArr, iArr2, iArr3) != 0) {
            Y2.m.N(5, -2147483647, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (Y2.m.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Y2.d.h(iArr2, f9540a))) {
            Y2.m.g(5, -2147483647, iArr2);
        }
    }
}
