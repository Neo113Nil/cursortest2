package V2;

import java.math.BigInteger;

/* renamed from: V2.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1213p {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9559a = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    static final int[] f9560b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f9561c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Y2.e.p(iArr3, f9559a))) {
            Y2.m.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (Y2.m.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Y2.e.p(iArr2, f9559a))) {
            Y2.m.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] l4 = Y2.e.l(bigInteger);
        if (l4[5] == -1) {
            int[] iArr = f9559a;
            if (Y2.e.p(l4, iArr)) {
                Y2.e.E(iArr, l4);
            }
        }
        return l4;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g4 = Y2.e.g();
        Y2.e.v(iArr, iArr2, g4);
        g(g4, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.e.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Y2.m.p(12, iArr3, f9560b))) {
            int[] iArr4 = f9561c;
            if (Y2.m.e(iArr4.length, iArr4, iArr3) != 0) {
                Y2.m.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (Y2.e.s(iArr)) {
            Y2.e.H(iArr2);
        } else {
            Y2.e.D(f9559a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.e.x(4553, Y2.e.w(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && Y2.e.p(iArr2, f9559a))) {
            Y2.m.b(6, 4553, iArr2);
        }
    }

    public static void h(int i4, int[] iArr) {
        if ((i4 == 0 || Y2.e.y(4553, i4, iArr, 0) == 0) && !(iArr[5] == -1 && Y2.e.p(iArr, f9559a))) {
            return;
        }
        Y2.m.b(6, 4553, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] g4 = Y2.e.g();
        Y2.e.B(iArr, g4);
        g(g4, iArr2);
    }

    public static void j(int[] iArr, int i4, int[] iArr2) {
        int[] g4 = Y2.e.g();
        Y2.e.B(iArr, g4);
        g(g4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            Y2.e.B(iArr2, g4);
            g(g4, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Y2.e.D(iArr, iArr2, iArr3) != 0) {
            Y2.m.K(6, 4553, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (Y2.m.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Y2.e.p(iArr2, f9559a))) {
            Y2.m.b(6, 4553, iArr2);
        }
    }
}
