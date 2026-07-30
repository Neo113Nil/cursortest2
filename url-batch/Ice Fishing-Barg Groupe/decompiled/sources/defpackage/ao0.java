package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ao0 extends jc2 implements pe0 {
    public int cpQdD2nAriOS;
    public final /* synthetic */ bo0 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao0(bo0 bo0Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = bo0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        bo0 bo0Var = this.r3s1LDPKFs1S;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    g7 g7Var = bo0Var.rZjpSjn4zoMv;
                    if (g7Var != null) {
                        pf2 pf2Var = bo0Var.kpCQ9veP6n3I;
                        if (pf2Var == null) {
                            pf2Var = ih0.cpQdD2nAriOS((pl) f2.QrzZRwfaDlRX(bo0Var, rl.PxuCJdSBwIXG), (wi2) f2.QrzZRwfaDlRX(bo0Var, xi2.PxuCJdSBwIXG));
                        }
                        hl hlVar = new hl(!bo0Var.ZbWwgt3aGe7A ? pf2Var.r3s1LDPKFs1S : bo0Var.jyegZNwi31qc ? pf2Var.x50lh2ztY7Y5 : pf2Var.cpQdD2nAriOS);
                        i8 VhhvGxCb8gfr = bo0Var.ZbWwgt3aGe7A ? vi0.VhhvGxCb8gfr((d71) f2.QrzZRwfaDlRX(bo0Var, a51.PxuCJdSBwIXG), e71.OPXfSBeufaJ8) : new h72();
                        this.cpQdD2nAriOS = 1;
                        obj = g7.TSizfFm2Yiuu(g7Var, hlVar, VhhvGxCb8gfr, null, this, 12);
                        if (obj == suVar) {
                            break;
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    g7 g7Var2 = bo0Var.ozEBbv0hFTAB;
                    k10 k10Var = new k10((bo0Var.jyegZNwi31qc && bo0Var.ZbWwgt3aGe7A) ? bo0Var.IAToe7bXGz4N : bo0Var.e6tOsSdd2EFb);
                    i8 VhhvGxCb8gfr2 = bo0Var.ZbWwgt3aGe7A ? vi0.VhhvGxCb8gfr((d71) f2.QrzZRwfaDlRX(bo0Var, a51.PxuCJdSBwIXG), e71.rtx2ld2ELZv4) : new h72();
                    this.cpQdD2nAriOS = 1;
                    if (g7.TSizfFm2Yiuu(g7Var2, k10Var, VhhvGxCb8gfr2, null, this, 12) == suVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
            case 2:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    bo0.Yadk4uqlxLy8(bo0Var, this);
                    break;
                } else if (i4 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
            default:
                int i5 = this.cpQdD2nAriOS;
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    bo0.Yadk4uqlxLy8(bo0Var, this);
                    break;
                } else if (i5 != 1) {
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
        int i = this.x50lh2ztY7Y5;
        bo0 bo0Var = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new ao0(bo0Var, btVar, 0);
            case 1:
                return new ao0(bo0Var, btVar, 1);
            case 2:
                return new ao0(bo0Var, btVar, 2);
            default:
                return new ao0(bo0Var, btVar, 3);
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
        return ((ao0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
