package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bp extends kv0 implements pe0 {
    public final /* synthetic */ int OPXfSBeufaJ8 = 1;
    public final /* synthetic */ r1 dgRBjINgWbAK;
    public final /* synthetic */ dp wdg6QnbFHrFF;
    public final /* synthetic */ pe0 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(r1 r1Var, dp dpVar, pe0 pe0Var) {
        super(2);
        this.dgRBjINgWbAK = r1Var;
        this.wdg6QnbFHrFF = dpVar;
        this.x50lh2ztY7Y5 = pe0Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        pe0 pe0Var = this.x50lh2ztY7Y5;
        r1 r1Var = this.dgRBjINgWbAK;
        dp dpVar = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                hp hpVar = (hp) obj;
                int intValue = ((Number) obj2).intValue();
                tf0 tf0Var = (tf0) hpVar;
                if (!tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                    tf0Var.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    tf0Var.IXK6ba3ucyzm(866651995);
                    eq.PxuCJdSBwIXG(r1Var, dpVar.dgRBjINgWbAK, pe0Var, tf0Var, 0);
                    tf0Var.gPXPFXrUH4XX(false);
                    break;
                }
            default:
                ((Number) obj2).intValue();
                dpVar.PxuCJdSBwIXG(r1Var, pe0Var, (hp) obj, ki0.bEKsvqmvPh2y(1));
                break;
        }
        return no2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(dp dpVar, r1 r1Var, pe0 pe0Var, int i) {
        super(2);
        this.wdg6QnbFHrFF = dpVar;
        this.dgRBjINgWbAK = r1Var;
        this.x50lh2ztY7Y5 = pe0Var;
    }
}
