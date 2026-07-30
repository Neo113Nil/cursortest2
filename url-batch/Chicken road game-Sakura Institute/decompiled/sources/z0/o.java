package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public q6.c f10029s;

    public o(q6.c cVar) {
        this.f10029s = cVar;
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        p1.n0 b9 = e0Var.b(j8);
        return h0Var.C(b9.f7063f, b9.f7064g, e6.v.f2827f, new q.t0(b9, 15, this));
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f10029s + ')';
    }
}
