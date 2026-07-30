package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zu2 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ av2 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zu2(av2 av2Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = av2Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        av2 av2Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    r1 r1Var = av2Var.rtx2ld2ELZv4;
                    this.cpQdD2nAriOS = 1;
                    Object Y1f8riQaR6yg = r1Var.ozEBbv0hFTAB.Y1f8riQaR6yg(this);
                    if (Y1f8riQaR6yg != suVar) {
                        Y1f8riQaR6yg = no2Var;
                    }
                    if (Y1f8riQaR6yg == suVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
            default:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    r1 r1Var2 = av2Var.rtx2ld2ELZv4;
                    this.cpQdD2nAriOS = 1;
                    Object PxuCJdSBwIXG = r1Var2.tmVwIGCQF4zR.PxuCJdSBwIXG(this);
                    if (PxuCJdSBwIXG != suVar) {
                        PxuCJdSBwIXG = no2Var;
                    }
                    if (PxuCJdSBwIXG == suVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        av2 av2Var = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new zu2(av2Var, btVar, 0);
            default:
                return new zu2(av2Var, btVar, 1);
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
        return ((zu2) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
