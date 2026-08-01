package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class j implements og {
    public final pg f;

    public j(pg pgVar) {
        this.f = pgVar;
    }

    @Override // defpackage.qg
    public qg D(pg pgVar) {
        return mv.D(this, pgVar);
    }

    @Override // defpackage.og
    public final pg getKey() {
        return this.f;
    }

    @Override // defpackage.qg
    public final Object n(Object obj, xr xrVar) {
        return xrVar.g(obj, this);
    }

    @Override // defpackage.qg
    public final qg r(qg qgVar) {
        return mv.I(this, qgVar);
    }

    @Override // defpackage.qg
    public og w(pg pgVar) {
        return mv.p(this, pgVar);
    }
}
