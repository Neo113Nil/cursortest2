package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q40 implements fe1 {
    public final ng1 a;

    public q40(ng1 ng1Var) {
        this.a = ng1Var;
    }

    @Override // defpackage.fe1
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.fe1
    public final boolean b(wb wbVar) {
        int i = wbVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.c(wbVar.a);
        return true;
    }
}
