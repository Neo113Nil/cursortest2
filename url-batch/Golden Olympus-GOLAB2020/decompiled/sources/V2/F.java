package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9486a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9487b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9488c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Y2.g.q(iArr3, f9486a))) {
            Y2.m.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Y2.g.q(iArr2, f9486a))) {
            Y2.m.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] m4 = Y2.g.m(bigInteger);
        if (m4[7] == -1) {
            int[] iArr = f9486a;
            if (Y2.g.q(m4, iArr)) {
                Y2.g.G(iArr, m4);
            }
        }
        return m4;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h4 = Y2.g.h();
        Y2.g.w(iArr, iArr2, h4);
        g(h4, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.g.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && Y2.m.p(16, iArr3, f9487b))) {
            int[] iArr4 = f9488c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(16, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (Y2.g.t(iArr)) {
            Y2.g.J(iArr2);
        } else {
            Y2.g.F(f9486a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.g.y(977, Y2.g.x(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && Y2.g.q(iArr2, f9486a))) {
            Y2.m.b(8, 977, iArr2);
        }
    }

    public static void h(int i4, int[] iArr) {
        if ((i4 == 0 || Y2.g.z(977, i4, iArr, 0) == 0) && !(iArr[7] == -1 && Y2.g.q(iArr, f9486a))) {
            return;
        }
        Y2.m.b(8, 977, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] h4 = Y2.g.h();
        Y2.g.D(iArr, h4);
        g(h4, iArr2);
    }

    public static void j(int[] iArr, int i4, int[] iArr2) {
        int[] h4 = Y2.g.h();
        Y2.g.D(iArr, h4);
        g(h4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.g.D(iArr2, h4);
            g(h4, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.g.F(iArr, iArr2, iArr3) != 0) {
            Y2.m.K(8, 977, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (Y2.m.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Y2.g.q(iArr2, f9486a))) {
            Y2.m.b(8, 977, iArr2);
        }
    }
}
