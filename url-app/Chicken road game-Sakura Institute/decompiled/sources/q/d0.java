package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public int f7270s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7271t;

    @Override // r1.w
    public final int b(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return this.f7270s == 1 ? e0Var.a0(i7) : e0Var.d0(i7);
    }

    @Override // r1.w
    public final int e(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.c(i7);
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        int a02 = this.f7270s == 1 ? e0Var.a0(m2.a.g(j8)) : e0Var.d0(m2.a.g(j8));
        if (a02 < 0) {
            a02 = 0;
        }
        if (a02 >= 0) {
            long z8 = r4.a.z(a02, a02, 0, Integer.MAX_VALUE);
            if (this.f7271t) {
                z8 = r4.a.u(j8, z8);
            }
            p1.n0 b9 = e0Var.b(z8);
            return h0Var.C(b9.f7063f, b9.f7064g, e6.v.f2827f, new k.c0(b9, 5));
        }
        a8.d.c0("width(" + a02 + ") must be >= 0");
        throw null;
    }

    @Override // r1.w
    public final int h(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return this.f7270s == 1 ? e0Var.a0(i7) : e0Var.d0(i7);
    }

    @Override // r1.w
    public final int i(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.e0(i7);
    }
}
