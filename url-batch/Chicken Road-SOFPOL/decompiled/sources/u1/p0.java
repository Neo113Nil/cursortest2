package u1;

import w1.x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 extends y0.l implements w1.v, x1 {

    /* renamed from: r, reason: collision with root package name */
    public o f7255r;

    /* renamed from: s, reason: collision with root package name */
    public final f1.n f7256s;

    public p0(o oVar) {
        this.f7255r = oVar;
        this.f7256s = new f1.n(3, this, oVar);
    }

    @Override // w1.v
    public final f0 e(w1.n0 n0Var, d0 d0Var, long j7) {
        l0 e8 = d0Var.e(j7);
        return n0Var.J(e8.f7230d, e8.f7231e, d6.v.f2327d, this.f7256s, new c1.g(e8, 5));
    }

    @Override // w1.x1
    public final Object m() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
