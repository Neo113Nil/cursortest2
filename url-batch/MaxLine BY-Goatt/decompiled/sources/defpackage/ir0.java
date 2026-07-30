package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ir0 implements wu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr0 b;

    public /* synthetic */ ir0(kr0 kr0Var, int i) {
        this.a = i;
        this.b = kr0Var;
    }

    @Override // defpackage.wu1
    public final void a(xx xxVar) {
        int i = this.a;
        kr0 kr0Var = this.b;
        switch (i) {
            case 0:
                jr0 jr0Var = kr0Var.mFragments.a;
                jr0Var.p.b(jr0Var, jr0Var, null);
                break;
            default:
                xx.f(kr0Var, xxVar);
                break;
        }
    }
}
