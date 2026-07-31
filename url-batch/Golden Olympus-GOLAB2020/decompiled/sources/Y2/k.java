package Y2;

/* loaded from: classes3.dex */
public abstract class k {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        g.w(iArr, iArr2, iArr3);
        g.v(iArr, 8, iArr2, 8, iArr3, 16);
        int e4 = g.e(iArr3, 8, iArr3, 16);
        int c4 = e4 + g.c(iArr3, 24, iArr3, 16, g.c(iArr3, 0, iArr3, 8, 0) + e4);
        int[] f4 = g.f();
        int[] f5 = g.f();
        boolean z4 = g.j(iArr, 8, iArr, 0, f4, 0) != g.j(iArr2, 8, iArr2, 0, f5, 0);
        int[] h4 = g.h();
        g.w(f4, f5, h4);
        m.f(32, c4 + (z4 ? m.d(16, h4, 0, iArr3, 8) : m.L(16, h4, 0, iArr3, 8)), iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        g.D(iArr, iArr2);
        g.C(iArr, 8, iArr2, 16);
        int e4 = g.e(iArr2, 8, iArr2, 16);
        int c4 = e4 + g.c(iArr2, 24, iArr2, 16, g.c(iArr2, 0, iArr2, 8, 0) + e4);
        int[] f4 = g.f();
        g.j(iArr, 8, iArr, 0, f4, 0);
        int[] h4 = g.h();
        g.D(f4, h4);
        m.f(32, c4 + m.L(16, h4, 0, iArr2, 8), iArr2, 24);
    }
}
