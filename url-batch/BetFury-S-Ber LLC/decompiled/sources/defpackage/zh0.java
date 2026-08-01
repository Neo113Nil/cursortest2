package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zh0 implements og {
    public final Object f;
    public final ThreadLocal g;
    public final bi0 h;

    public zh0(e60 e60Var, ThreadLocal threadLocal) {
        this.f = e60Var;
        this.g = threadLocal;
        this.h = new bi0(threadLocal);
    }

    @Override // defpackage.qg
    public final qg D(pg pgVar) {
        return this.h.equals(pgVar) ? um.f : this;
    }

    @Override // defpackage.og
    public final pg getKey() {
        return this.h;
    }

    @Override // defpackage.qg
    public final Object n(Object obj, xr xrVar) {
        return xrVar.g(obj, this);
    }

    @Override // defpackage.qg
    public final qg r(qg qgVar) {
        return mv.I(this, qgVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f + ", threadLocal = " + this.g + ')';
    }

    @Override // defpackage.qg
    public final og w(pg pgVar) {
        if (this.h.equals(pgVar)) {
            return this;
        }
        return null;
    }
}
