package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vr1 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ wr1 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vr1(wr1 wr1Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = wr1Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        wr1 wr1Var = this.r3s1LDPKFs1S;
        bt btVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l92 l92Var = wr1Var.TSizfFm2Yiuu;
                    l92 l92Var2 = wr1Var.e9gEMXR7LXtO;
                    r51 r51Var = new r51(3, btVar, i2);
                    ur1 ur1Var = new ur1(wr1Var, 0);
                    this.cpQdD2nAriOS = 1;
                    im imVar = new im(new v80[]{l92Var, l92Var2}, new h90(r51Var, btVar, i2), ur1Var, null);
                    hu huVar = this.OPXfSBeufaJ8;
                    huVar.getClass();
                    y80 y80Var = new y80(this, huVar);
                    Object i68hK7ahKtgp = sj0.i68hK7ahKtgp(y80Var, y80Var, imVar);
                    if (i68hK7ahKtgp != suVar) {
                        i68hK7ahKtgp = no2Var;
                    }
                    if (i68hK7ahKtgp != suVar) {
                        i68hK7ahKtgp = no2Var;
                    }
                    if (i68hK7ahKtgp == suVar) {
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
            default:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    us0 us0Var = wr1Var.lS5Rgt96tfkO.PxuCJdSBwIXG;
                    ca0 rZjpSjn4zoMv = fx1.rZjpSjn4zoMv(us0Var.PxuCJdSBwIXG, new String[]{"items"}, new wnqUPcAvl7HT(25, us0Var));
                    ur1 ur1Var2 = new ur1(wr1Var, i2);
                    this.cpQdD2nAriOS = 1;
                    if (rZjpSjn4zoMv.PxuCJdSBwIXG(ur1Var2, this) == suVar) {
                        break;
                    }
                } else if (i4 != 1) {
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
        wr1 wr1Var = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new vr1(wr1Var, btVar, 0);
            default:
                return new vr1(wr1Var, btVar, 1);
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
        return ((vr1) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
