package Y2;

/* loaded from: classes3.dex */
public abstract class i {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        e.v(iArr, iArr2, iArr3);
        e.u(iArr, 6, iArr2, 6, iArr3, 12);
        int d4 = e.d(iArr3, 6, iArr3, 12);
        int c4 = d4 + e.c(iArr3, 18, iArr3, 12, e.c(iArr3, 0, iArr3, 6, 0) + d4);
        int[] e4 = e.e();
        int[] e5 = e.e();
        boolean z4 = e.i(iArr, 6, iArr, 0, e4, 0) != e.i(iArr2, 6, iArr2, 0, e5, 0);
        int[] g4 = e.g();
        e.v(e4, e5, g4);
        m.f(24, c4 + (z4 ? m.d(12, g4, 0, iArr3, 6) : m.L(12, g4, 0, iArr3, 6)), iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        e.B(iArr, iArr2);
        e.A(iArr, 6, iArr2, 12);
        int d4 = e.d(iArr2, 6, iArr2, 12);
        int c4 = d4 + e.c(iArr2, 18, iArr2, 12, e.c(iArr2, 0, iArr2, 6, 0) + d4);
        int[] e4 = e.e();
        e.i(iArr, 6, iArr, 0, e4, 0);
        int[] g4 = e.g();
        e.B(e4, g4);
        m.f(24, c4 + m.L(12, g4, 0, iArr2, 6), iArr2, 18);
    }
}
