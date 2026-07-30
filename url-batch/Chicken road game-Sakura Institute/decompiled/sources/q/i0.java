package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public h0 f7290s;

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        float f9 = 0;
        if (Float.compare(this.f7290s.b(h0Var.getLayoutDirection()), f9) < 0 || Float.compare(this.f7290s.d(), f9) < 0 || Float.compare(this.f7290s.c(h0Var.getLayoutDirection()), f9) < 0 || Float.compare(this.f7290s.a(), f9) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int K = h0Var.K(this.f7290s.c(h0Var.getLayoutDirection())) + h0Var.K(this.f7290s.b(h0Var.getLayoutDirection()));
        int K2 = h0Var.K(this.f7290s.a()) + h0Var.K(this.f7290s.d());
        p1.n0 b9 = e0Var.b(r4.a.M(-K, -K2, j8));
        return h0Var.C(r4.a.w(j8, b9.f7063f + K), r4.a.v(j8, b9.f7064g + K2), e6.v.f2827f, new c.h(b9, h0Var, this, 7));
    }
}
