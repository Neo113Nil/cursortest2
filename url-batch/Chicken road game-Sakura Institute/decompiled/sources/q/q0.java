package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public float f7330s;

    /* renamed from: t, reason: collision with root package name */
    public float f7331t;

    @Override // r1.w
    public final int b(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        int d02 = e0Var.d0(i7);
        int K = !m2.e.a(this.f7330s, Float.NaN) ? o0Var.K(this.f7330s) : 0;
        return d02 < K ? K : d02;
    }

    @Override // r1.w
    public final int e(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        int c4 = e0Var.c(i7);
        int K = !m2.e.a(this.f7331t, Float.NaN) ? o0Var.K(this.f7331t) : 0;
        return c4 < K ? K : c4;
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        int j9;
        int i7 = 0;
        if (m2.e.a(this.f7330s, Float.NaN) || m2.a.j(j8) != 0) {
            j9 = m2.a.j(j8);
        } else {
            j9 = h0Var.K(this.f7330s);
            int h3 = m2.a.h(j8);
            if (j9 > h3) {
                j9 = h3;
            }
            if (j9 < 0) {
                j9 = 0;
            }
        }
        int h8 = m2.a.h(j8);
        if (m2.e.a(this.f7331t, Float.NaN) || m2.a.i(j8) != 0) {
            i7 = m2.a.i(j8);
        } else {
            int K = h0Var.K(this.f7331t);
            int g9 = m2.a.g(j8);
            if (K > g9) {
                K = g9;
            }
            if (K >= 0) {
                i7 = K;
            }
        }
        p1.n0 b9 = e0Var.b(r4.a.b(j9, h8, i7, m2.a.g(j8)));
        return h0Var.C(b9.f7063f, b9.f7064g, e6.v.f2827f, new k.c0(b9, 7));
    }

    @Override // r1.w
    public final int h(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        int a02 = e0Var.a0(i7);
        int K = !m2.e.a(this.f7330s, Float.NaN) ? o0Var.K(this.f7330s) : 0;
        return a02 < K ? K : a02;
    }

    @Override // r1.w
    public final int i(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        int e02 = e0Var.e0(i7);
        int K = !m2.e.a(this.f7331t, Float.NaN) ? o0Var.K(this.f7331t) : 0;
        return e02 < K ? K : e02;
    }
}
