package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x50lh2ztY7Y5 extends jc2 implements pe0 {
    public final /* synthetic */ wp1 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ kk r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x50lh2ztY7Y5(kk kkVar, wp1 wp1Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = kkVar;
        this.QrzZRwfaDlRX = wp1Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        wp1 wp1Var = this.QrzZRwfaDlRX;
        kk kkVar = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    e81 e81Var = kkVar.ZbWwgt3aGe7A;
                    if (e81Var != null) {
                        vp1 vp1Var = new vp1(wp1Var);
                        this.cpQdD2nAriOS = 1;
                        if (e81Var.PxuCJdSBwIXG(vp1Var, this) == suVar) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    e81 e81Var2 = kkVar.ZbWwgt3aGe7A;
                    if (e81Var2 != null) {
                        vp1 vp1Var2 = new vp1(wp1Var);
                        this.cpQdD2nAriOS = 1;
                        if (e81Var2.PxuCJdSBwIXG(vp1Var2, this) == suVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            case 2:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    e81 e81Var3 = kkVar.ZbWwgt3aGe7A;
                    if (e81Var3 != null) {
                        this.cpQdD2nAriOS = 1;
                        if (e81Var3.PxuCJdSBwIXG(wp1Var, this) == suVar) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
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
                    e81 e81Var4 = kkVar.ZbWwgt3aGe7A;
                    if (e81Var4 != null) {
                        xp1 xp1Var = new xp1(wp1Var);
                        this.cpQdD2nAriOS = 1;
                        if (e81Var4.PxuCJdSBwIXG(xp1Var, this) == suVar) {
                            break;
                        }
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
        wp1 wp1Var = this.QrzZRwfaDlRX;
        kk kkVar = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new x50lh2ztY7Y5(kkVar, wp1Var, btVar, 0);
            case 1:
                return new x50lh2ztY7Y5(kkVar, wp1Var, btVar, 1);
            case 2:
                return new x50lh2ztY7Y5(kkVar, wp1Var, btVar, 2);
            default:
                return new x50lh2ztY7Y5(kkVar, wp1Var, btVar, 3);
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
        return ((x50lh2ztY7Y5) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
