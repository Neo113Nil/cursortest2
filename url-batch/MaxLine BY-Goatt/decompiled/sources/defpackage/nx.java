package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class nx implements fd1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ nx(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        int i = this.m;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                xx.b((ru1) obj2, (xx) obj, id1Var, yc1Var);
                break;
            default:
                jk1 jk1Var = (jk1) obj2;
                al1 al1Var = (al1) obj;
                jk1Var.getClass();
                if (yc1Var == yc1.ON_DESTROY) {
                    jk1Var.b(al1Var);
                    break;
                }
                break;
        }
    }
}
