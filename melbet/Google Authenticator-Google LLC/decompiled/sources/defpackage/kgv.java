package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kgv implements kfr {
    @Override // defpackage.kfj
    public kfg a(kae kaeVar, kaa kaaVar, jww jwwVar, jxb[] jxbVarArr) {
        throw null;
    }

    @Override // defpackage.kjb
    public final Runnable b(kja kjaVar) {
        return d().b(kjaVar);
    }

    @Override // defpackage.jyv
    public final jyp c() {
        return d().c();
    }

    protected abstract kfr d();

    @Override // defpackage.kjb
    public void e(kbq kbqVar) {
        d().e(kbqVar);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", d());
        return T.toString();
    }
}
