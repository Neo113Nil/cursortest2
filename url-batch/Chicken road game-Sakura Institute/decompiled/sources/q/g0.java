package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public float f7280s;

    /* renamed from: t, reason: collision with root package name */
    public float f7281t;

    /* renamed from: u, reason: collision with root package name */
    public float f7282u;

    /* renamed from: v, reason: collision with root package name */
    public float f7283v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7284w;

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        int K = h0Var.K(this.f7282u) + h0Var.K(this.f7280s);
        int K2 = h0Var.K(this.f7283v) + h0Var.K(this.f7281t);
        p1.n0 b9 = e0Var.b(r4.a.M(-K, -K2, j8));
        return h0Var.C(r4.a.w(j8, b9.f7063f + K), r4.a.v(j8, b9.f7064g + K2), e6.v.f2827f, new c.h(this, b9, h0Var, 6));
    }
}
