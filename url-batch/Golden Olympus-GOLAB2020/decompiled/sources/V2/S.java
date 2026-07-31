package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9514a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a4 = Y2.m.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a4 > 511 || (a4 == 511 && Y2.m.m(16, iArr3, f9514a))) {
            a4 = (a4 + Y2.m.q(16, iArr3)) & 511;
        }
        iArr3[16] = a4;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int r4 = Y2.m.r(16, iArr, iArr2) + iArr[16];
        if (r4 > 511 || (r4 == 511 && Y2.m.m(16, iArr2, f9514a))) {
            r4 = (r4 + Y2.m.q(16, iArr2)) & 511;
        }
        iArr2[16] = r4;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] n4 = Y2.m.n(521, bigInteger);
        if (Y2.m.m(17, n4, f9514a)) {
            Y2.m.P(17, n4);
        }
        return n4;
    }

    protected static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        Y2.k.a(iArr, iArr2, iArr3);
        int i4 = iArr[16];
        int i5 = iArr2[16];
        iArr3[32] = Y2.m.w(16, i4, iArr2, i5, iArr, iArr3, 16) + (i4 * i5);
    }

    protected static void e(int[] iArr, int[] iArr2) {
        Y2.k.b(iArr, iArr2);
        int i4 = iArr[16];
        iArr2[32] = Y2.m.x(16, i4 << 1, iArr, 0, iArr2, 16) + (i4 * i4);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] i4 = Y2.m.i(33);
        d(iArr, iArr2, i4);
        h(i4, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (Y2.m.v(17, iArr)) {
            Y2.m.P(17, iArr2);
        } else {
            Y2.m.J(17, f9514a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i4 = iArr[32];
        int A4 = (Y2.m.A(16, iArr, 16, 9, i4, iArr2, 0) >>> 23) + (i4 >>> 9) + Y2.m.e(16, iArr, iArr2);
        if (A4 > 511 || (A4 == 511 && Y2.m.m(16, iArr2, f9514a))) {
            A4 = (A4 + Y2.m.q(16, iArr2)) & 511;
        }
        iArr2[16] = A4;
    }

    public static void i(int[] iArr) {
        int i4 = iArr[16];
        int g4 = Y2.m.g(16, i4 >>> 9, iArr) + (i4 & 511);
        if (g4 > 511 || (g4 == 511 && Y2.m.m(16, iArr, f9514a))) {
            g4 = (g4 + Y2.m.q(16, iArr)) & 511;
        }
        iArr[16] = g4;
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] i4 = Y2.m.i(33);
        e(iArr, i4);
        h(i4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] i5 = Y2.m.i(33);
        e(iArr, i5);
        h(i5, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            e(iArr2, i5);
            h(i5, iArr2);
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int J3 = (Y2.m.J(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (J3 < 0) {
            J3 = (J3 + Y2.m.k(16, iArr3)) & 511;
        }
        iArr3[16] = J3;
    }

    public static void m(int[] iArr, int[] iArr2) {
        int i4 = iArr[16];
        iArr2[16] = (Y2.m.D(16, iArr, i4 << 23, iArr2) | (i4 << 1)) & 511;
    }
}
