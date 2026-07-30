package y;

import a0.x0;
import g0.g1;
import g0.t0;
import r1.a1;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends s0.n implements r1.k, r1.p, r1.l {

    /* renamed from: s, reason: collision with root package name */
    public d f9724s;

    /* renamed from: t, reason: collision with root package name */
    public j0 f9725t;

    /* renamed from: u, reason: collision with root package name */
    public x0 f9726u;

    /* renamed from: v, reason: collision with root package name */
    public final g1 f9727v = g0.d.J(null, t0.f3903k);

    public q(d dVar, j0 j0Var, x0 x0Var) {
        this.f9724s = dVar;
        this.f9725t = j0Var;
        this.f9726u = x0Var;
    }

    @Override // r1.p
    public final void V(a1 a1Var) {
        this.f9727v.setValue(a1Var);
    }

    @Override // s0.n
    public final void s0() {
        d dVar = this.f9724s;
        if (dVar.f9709a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        dVar.f9709a = this;
    }

    @Override // s0.n
    public final void t0() {
        this.f9724s.k(this);
    }
}
