package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kw extends iw {
    public final mw j;
    public final lw k;
    public final lb l;
    public final Object m;

    public kw(mw mwVar, lw lwVar, lb lbVar, Object obj) {
        this.j = mwVar;
        this.k = lwVar;
        this.l = lbVar;
        this.m = obj;
    }

    @Override // defpackage.iw
    public final boolean k() {
        return false;
    }

    @Override // defpackage.iw
    public final void l(Throwable th) {
        lb lbVar = this.l;
        lb I = mw.I(lbVar);
        mw mwVar = this.j;
        lw lwVar = this.k;
        Object obj = this.m;
        if (I == null || !mwVar.R(lwVar, I, obj)) {
            lwVar.f.e(new ey(2), 2);
            lb I2 = mw.I(lbVar);
            if (I2 == null || !mwVar.R(lwVar, I2, obj)) {
                mwVar.a(mwVar.q(lwVar, obj));
            }
        }
    }
}
