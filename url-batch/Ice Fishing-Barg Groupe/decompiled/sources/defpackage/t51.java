package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t51 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ u51 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t51(u51 u51Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = u51Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        u51 u51Var = this.r3s1LDPKFs1S;
        bt btVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l92 l92Var = u51Var.TSizfFm2Yiuu;
                    l92 l92Var2 = u51Var.Y1f8riQaR6yg;
                    int i4 = 0;
                    r51 r51Var = new r51(3, btVar, i4);
                    s51 s51Var = new s51(u51Var, i4);
                    this.cpQdD2nAriOS = 1;
                    im imVar = new im(new v80[]{l92Var, l92Var2}, new h90(r51Var, btVar, i2), s51Var, null);
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
                int i5 = this.cpQdD2nAriOS;
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    us0 us0Var = u51Var.lS5Rgt96tfkO.PxuCJdSBwIXG;
                    ca0 rZjpSjn4zoMv = fx1.rZjpSjn4zoMv(us0Var.PxuCJdSBwIXG, new String[]{"items"}, new wnqUPcAvl7HT(26, us0Var));
                    s51 s51Var2 = new s51(u51Var, i2);
                    this.cpQdD2nAriOS = 1;
                    if (rZjpSjn4zoMv.PxuCJdSBwIXG(s51Var2, this) == suVar) {
                        break;
                    }
                } else if (i5 != 1) {
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
        u51 u51Var = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new t51(u51Var, btVar, 0);
            default:
                return new t51(u51Var, btVar, 1);
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
        return ((t51) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
