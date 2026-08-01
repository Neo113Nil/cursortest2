package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mb0 implements jx, AutoCloseable {
    public final String f;
    public final lb0 g;
    public boolean h;

    public mb0(String str, lb0 lb0Var) {
        this.f = str;
        this.g = lb0Var;
    }

    @Override // defpackage.jx
    public final void i(lx lxVar, fx fxVar) {
        if (fxVar == fx.ON_DESTROY) {
            this.h = false;
            lxVar.e().f(this);
        }
    }

    public final void n(i5 i5Var, nx nxVar) {
        i5Var.getClass();
        nxVar.getClass();
        if (this.h) {
            s9.u("Already attached to lifecycleOwner");
            return;
        }
        this.h = true;
        nxVar.a(this);
        i5Var.N(this.f, (rd) this.g.a.f);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
