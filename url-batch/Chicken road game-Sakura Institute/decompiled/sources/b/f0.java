package b;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements androidx.lifecycle.t, c {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.x f1151f;

    /* renamed from: g, reason: collision with root package name */
    public final y f1152g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f1153h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f1154i;

    public f0(i0 i0Var, androidx.lifecycle.x xVar, y yVar) {
        r6.k.f(yVar, "onBackPressedCallback");
        this.f1154i = i0Var;
        this.f1151f = xVar;
        this.f1152g = yVar;
        xVar.a(this);
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        if (nVar != androidx.lifecycle.n.ON_START) {
            if (nVar != androidx.lifecycle.n.ON_STOP) {
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                g0 g0Var = this.f1153h;
                if (g0Var != null) {
                    g0Var.cancel();
                    return;
                }
                return;
            }
        }
        y yVar = this.f1152g;
        r6.k.f(yVar, "onBackPressedCallback");
        i0 i0Var = this.f1154i;
        i0Var.f1162b.addLast(yVar);
        g0 g0Var2 = new g0(i0Var, yVar);
        yVar.f1221b.add(g0Var2);
        i0Var.e();
        yVar.f1222c = new h0(0, i0Var, i0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.f1153h = g0Var2;
    }

    @Override // b.c
    public final void cancel() {
        this.f1151f.f(this);
        this.f1152g.f1221b.remove(this);
        g0 g0Var = this.f1153h;
        if (g0Var != null) {
            g0Var.cancel();
        }
        this.f1153h = null;
    }
}
