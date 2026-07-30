package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class au extends j61 {
    public final fs t;

    public au(fs fsVar) {
        this.t = fsVar;
    }

    @Override // defpackage.j61
    public final boolean r() {
        return true;
    }

    @Override // defpackage.j61
    public final void s(Throwable th) {
        boolean p;
        n61 q = q();
        fs fsVar = this.t;
        Throwable q2 = fsVar.q(q);
        if (fsVar.y()) {
            o30 o30Var = fsVar.p;
            o30Var.getClass();
            p = ((pb0) o30Var).p(q2);
        } else {
            p = false;
        }
        if (p) {
            return;
        }
        fsVar.g(q2);
        if (fsVar.y()) {
            return;
        }
        fsVar.o();
    }
}
