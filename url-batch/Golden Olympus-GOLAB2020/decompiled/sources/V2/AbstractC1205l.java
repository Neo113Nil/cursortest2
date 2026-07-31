package V2;

import java.math.BigInteger;

/* renamed from: V2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1205l {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9550a = {-21389, -2, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9551b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9552c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.d.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && Y2.d.h(iArr3, f9550a))) {
            Y2.m.b(5, 21389, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && Y2.d.h(iArr2, f9550a))) {
            Y2.m.b(5, 21389, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] f4 = Y2.d.f(bigInteger);
        if (f4[4] == -1) {
            int[] iArr = f9550a;
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
        if (Y2.d.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && Y2.m.p(10, iArr3, f9551b))) {
            int[] iArr4 = f9552c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (Y2.d.j(iArr)) {
            Y2.d.u(iArr2);
        } else {
            Y2.d.r(f9550a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.d.m(21389, Y2.d.l(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && Y2.d.h(iArr2, f9550a))) {
            Y2.m.b(5, 21389, iArr2);
        }
    }

    public static void h(int i4, int[] iArr) {
        if ((i4 == 0 || Y2.d.n(21389, i4, iArr, 0) == 0) && !(iArr[4] == -1 && Y2.d.h(iArr, f9550a))) {
            return;
        }
        Y2.m.b(5, 21389, iArr);
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
            Y2.m.K(5, 21389, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (Y2.m.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && Y2.d.h(iArr2, f9550a))) {
            Y2.m.b(5, 21389, iArr2);
        }
    }
}
