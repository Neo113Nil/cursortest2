package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wdg6QnbFHrFF extends jc2 implements pe0 {
    public final /* synthetic */ wp1 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ e81 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdg6QnbFHrFF(wp1 wp1Var, e81 e81Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 0;
        this.QrzZRwfaDlRX = wp1Var;
        this.r3s1LDPKFs1S = e81Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        wp1 wp1Var = this.QrzZRwfaDlRX;
        e81 e81Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    xp1 xp1Var = new xp1(wp1Var);
                    this.cpQdD2nAriOS = 1;
                    if (e81Var.PxuCJdSBwIXG(xp1Var, this) == suVar) {
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
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    if (e81Var.PxuCJdSBwIXG(wp1Var, this) == suVar) {
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
                    this.cpQdD2nAriOS = 1;
                    if (e81Var.PxuCJdSBwIXG(wp1Var, this) == suVar) {
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
        wp1 wp1Var = this.QrzZRwfaDlRX;
        e81 e81Var = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new wdg6QnbFHrFF(wp1Var, e81Var, btVar);
            case 1:
                return new wdg6QnbFHrFF(e81Var, wp1Var, btVar, 1);
            default:
                return new wdg6QnbFHrFF(e81Var, wp1Var, btVar, 2);
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
        return ((wdg6QnbFHrFF) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdg6QnbFHrFF(e81 e81Var, wp1 wp1Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = e81Var;
        this.QrzZRwfaDlRX = wp1Var;
    }
}
