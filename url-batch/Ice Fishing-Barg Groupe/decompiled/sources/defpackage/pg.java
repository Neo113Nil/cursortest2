package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pg extends jc2 implements pe0 {
    public final /* synthetic */ d82 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ e81 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg(e81 e81Var, d82 d82Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = e81Var;
        this.QrzZRwfaDlRX = d82Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        d82 d82Var = this.QrzZRwfaDlRX;
        e81 e81Var = this.r3s1LDPKFs1S;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    h52 h52Var = e81Var.PxuCJdSBwIXG;
                    og ogVar = new og(d82Var, 0);
                    this.cpQdD2nAriOS = 1;
                    h52Var.getClass();
                    h52.wdg6QnbFHrFF(h52Var, ogVar, this);
                    break;
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
            default:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    h52 h52Var2 = e81Var.PxuCJdSBwIXG;
                    og ogVar2 = new og(d82Var, 1);
                    this.cpQdD2nAriOS = 1;
                    h52Var2.getClass();
                    h52.wdg6QnbFHrFF(h52Var2, ogVar2, this);
                    break;
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new pg(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 0);
            default:
                return new pg(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 1);
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
        return ((pg) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
