package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rb implements wh {
    public final qb[] PxuCJdSBwIXG;

    public rb(qb[] qbVarArr) {
        this.PxuCJdSBwIXG = qbVarArr;
    }

    @Override // defpackage.wh
    public final void PxuCJdSBwIXG(Throwable th) {
        lS5Rgt96tfkO();
    }

    public final void lS5Rgt96tfkO() {
        for (qb qbVar : this.PxuCJdSBwIXG) {
            s00 s00Var = qbVar.gPXPFXrUH4XX;
            if (s00Var == null) {
                cs0.tmVwIGCQF4zR("handle");
                throw null;
            }
            s00Var.PxuCJdSBwIXG();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.PxuCJdSBwIXG + ']';
    }
}
