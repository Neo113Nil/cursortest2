package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mv0 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ ov0 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv0(ov0 ov0Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = ov0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        ov0 ov0Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        bt btVar = null;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    gg0 gg0Var = ov0Var.lS5Rgt96tfkO;
                    this.cpQdD2nAriOS = 1;
                    b0 b0Var = gg0Var.PxuCJdSBwIXG;
                    b0Var.getClass();
                    Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(new a92UlCVFR9N8(b0Var, btVar, 2), this);
                    if (XL4ISE6Oc65B == suVar) {
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
                    rtx2ld2ELZv4 rtx2ld2elzv4 = new rtx2ld2ELZv4(ov0Var, btVar, 11);
                    this.cpQdD2nAriOS = 1;
                    Object XL4ISE6Oc65B2 = cs0.XL4ISE6Oc65B(rtx2ld2elzv4, this);
                    if (XL4ISE6Oc65B2 == suVar) {
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
                return new mv0(this.r3s1LDPKFs1S, btVar, 0);
            default:
                return new mv0(this.r3s1LDPKFs1S, btVar, 1);
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
        return ((mv0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
