package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class od2 extends jc2 implements pe0 {
    public final /* synthetic */ up1 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ ao1 gPXPFXrUH4XX;
    public final /* synthetic */ qe0 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od2(qe0 qe0Var, up1 up1Var, ao1 ao1Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = qe0Var;
        this.QrzZRwfaDlRX = up1Var;
        this.gPXPFXrUH4XX = ao1Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ao1 ao1Var = this.gPXPFXrUH4XX;
        up1 up1Var = this.QrzZRwfaDlRX;
        qe0 qe0Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    bf1 bf1Var = new bf1(ao1Var.TSizfFm2Yiuu);
                    this.cpQdD2nAriOS = 1;
                    if (qe0Var.a92UlCVFR9N8(up1Var, bf1Var, this) == suVar) {
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
                    bf1 bf1Var2 = new bf1(ao1Var.TSizfFm2Yiuu);
                    this.cpQdD2nAriOS = 1;
                    if (qe0Var.a92UlCVFR9N8(up1Var, bf1Var2, this) == suVar) {
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
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new od2(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 0);
            default:
                return new od2(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 1);
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
        return ((od2) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
