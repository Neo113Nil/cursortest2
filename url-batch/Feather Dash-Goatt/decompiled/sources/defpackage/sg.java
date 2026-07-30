package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sg extends mb0 {
    public final tf l;

    public sg(tf tfVar) {
        this.l = tfVar;
    }

    @Override // defpackage.mb0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.mb0
    public final void s(Throwable th) {
        boolean p;
        qb0 q = q();
        tf tfVar = this.l;
        Throwable q2 = tfVar.q(q);
        if (tfVar.A()) {
            dn dnVar = tfVar.h;
            dnVar.getClass();
            p = ((hs) dnVar).p(q2);
        } else {
            p = false;
        }
        if (p) {
            return;
        }
        tfVar.t(q2);
        if (tfVar.A()) {
            return;
        }
        tfVar.o();
    }
}
