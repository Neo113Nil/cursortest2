package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nn3 extends uc3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jo3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn3(jo3 jo3Var, pj3 pj3Var, int i) {
        super(pj3Var);
        this.e = i;
        this.f = jo3Var;
    }

    @Override // defpackage.uc3
    public final void a() {
        int i = this.e;
        jo3 jo3Var = this.f;
        switch (i) {
            case 0:
                jo3Var.v();
                if (jo3Var.N()) {
                    vh3 vh3Var = ((pj3) jo3Var.m).r;
                    pj3.m(vh3Var);
                    vh3Var.z.b("Inactivity, disconnecting from the service");
                    jo3Var.E();
                    break;
                }
                break;
            default:
                vh3 vh3Var2 = ((pj3) jo3Var.m).r;
                pj3.m(vh3Var2);
                vh3Var2.u.b("Tasks have been queued for a long time");
                break;
        }
    }
}
