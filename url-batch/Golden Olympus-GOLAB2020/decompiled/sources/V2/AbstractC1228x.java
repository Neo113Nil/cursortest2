package V2;

import java.math.BigInteger;

/* renamed from: V2.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1228x {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9577a = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9578b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9579c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.f.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Y2.f.i(iArr3, f9577a))) {
            Y2.m.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Y2.f.i(iArr2, f9577a))) {
            Y2.m.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] g4 = Y2.f.g(bigInteger);
        if (g4[6] == -1 && Y2.f.i(g4, f9577a)) {
            Y2.m.b(7, 6803, g4);
        }
        return g4;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e4 = Y2.f.e();
        Y2.f.l(iArr, iArr2, e4);
        g(e4, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.f.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Y2.m.p(14, iArr3, f9578b))) {
            int[] iArr4 = f9579c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (Y2.f.k(iArr)) {
            Y2.f.u(iArr2);
        } else {
            Y2.f.r(f9577a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.f.n(6803, Y2.f.m(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && Y2.f.i(iArr2, f9577a))) {
            Y2.m.b(7, 6803, iArr2);
        }
    }

    public static void h(int i4, int[] iArr) {
        if ((i4 == 0 || Y2.f.o(6803, i4, iArr, 0) == 0) && !(iArr[6] == -1 && Y2.f.i(iArr, f9577a))) {
            return;
        }
        Y2.m.b(7, 6803, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] e4 = Y2.f.e();
        Y2.f.q(iArr, e4);
        g(e4, iArr2);
    }

    public static void j(int[] iArr, int i4, int[] iArr2) {
        int[] e4 = Y2.f.e();
        Y2.f.q(iArr, e4);
        g(e4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.f.q(iArr2, e4);
            g(e4, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.f.r(iArr, iArr2, iArr3) != 0) {
            Y2.m.K(7, 6803, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (Y2.m.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Y2.f.i(iArr2, f9577a))) {
            Y2.m.b(7, 6803, iArr2);
        }
    }
}
