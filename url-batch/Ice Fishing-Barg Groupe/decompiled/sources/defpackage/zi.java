package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zi extends jc2 implements pe0 {
    public final /* synthetic */ cj QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ w80 gPXPFXrUH4XX;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(cj cjVar, w80 w80Var, Object obj, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = cjVar;
        this.gPXPFXrUH4XX = w80Var;
        this.r3s1LDPKFs1S = obj;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    qe0 qe0Var = this.QrzZRwfaDlRX.x50lh2ztY7Y5;
                    Object obj2 = this.r3s1LDPKFs1S;
                    this.cpQdD2nAriOS = 1;
                    if (qe0Var.a92UlCVFR9N8(this.gPXPFXrUH4XX, obj2, this) == suVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            default:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    ru ruVar = (ru) this.r3s1LDPKFs1S;
                    zt1 zt1Var = new zt1();
                    cj cjVar = this.QrzZRwfaDlRX;
                    v80 v80Var = cjVar.dgRBjINgWbAK;
                    bj bjVar = new bj(zt1Var, ruVar, cjVar, this.gPXPFXrUH4XX, 0);
                    this.cpQdD2nAriOS = 1;
                    if (v80Var.PxuCJdSBwIXG(bjVar, this) == suVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        w80 w80Var = this.gPXPFXrUH4XX;
        cj cjVar = this.QrzZRwfaDlRX;
        switch (i) {
            case 0:
                return new zi(cjVar, w80Var, this.r3s1LDPKFs1S, btVar);
            default:
                zi ziVar = new zi(cjVar, w80Var, btVar);
                ziVar.r3s1LDPKFs1S = obj;
                return ziVar;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((zi) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(cj cjVar, w80 w80Var, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = cjVar;
        this.gPXPFXrUH4XX = w80Var;
    }
}
