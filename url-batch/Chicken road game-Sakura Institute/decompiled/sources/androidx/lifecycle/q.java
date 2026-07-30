package androidx.lifecycle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements t, c7.x {

    /* renamed from: f, reason: collision with root package name */
    public final x f1019f;

    /* renamed from: g, reason: collision with root package name */
    public final h6.i f1020g;

    public q(x xVar, h6.i iVar) {
        c7.x0 x0Var;
        r6.k.f(iVar, "coroutineContext");
        this.f1019f = xVar;
        this.f1020g = iVar;
        if (xVar.f1046d != o.f1007f || (x0Var = (c7.x0) iVar.u(c7.u.f1748g)) == null) {
            return;
        }
        x0Var.c(null);
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        x xVar = this.f1019f;
        if (xVar.f1046d.compareTo(o.f1007f) <= 0) {
            xVar.f(this);
            c7.x0 x0Var = (c7.x0) this.f1020g.u(c7.u.f1748g);
            if (x0Var != null) {
                x0Var.c(null);
            }
        }
    }

    @Override // c7.x
    public final h6.i k() {
        return this.f1020g;
    }
}
