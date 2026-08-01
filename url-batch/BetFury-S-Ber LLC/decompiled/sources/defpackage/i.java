package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class i extends mw implements dg, ah {
    public final qg h;

    public i(qg qgVar, boolean z) {
        super(z);
        A((mw) qgVar.w(sl.k));
        this.h = qgVar.r(this);
    }

    @Override // defpackage.mw
    public final void K(Object obj) {
        if (obj instanceof ld) {
            ld.b.get((ld) obj);
        }
    }

    @Override // defpackage.dg
    public final qg d() {
        return this.h;
    }

    @Override // defpackage.dg
    public final void e(Object obj) {
        Throwable a = aa0.a(obj);
        if (a != null) {
            obj = new ld(a, false);
        }
        Object G = G(obj);
        if (G == n9.h) {
            return;
        }
        b(G);
    }

    @Override // defpackage.ah
    public final qg i() {
        return this.h;
    }

    @Override // defpackage.mw
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.mw
    public final void z(md mdVar) {
        n9.x(this.h, mdVar);
    }
}
