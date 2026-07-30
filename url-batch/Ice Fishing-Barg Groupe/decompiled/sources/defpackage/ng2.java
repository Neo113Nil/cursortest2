package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ng2 extends jc2 implements pe0 {
    public final /* synthetic */ boolean QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ e81 gPXPFXrUH4XX;
    public final /* synthetic */ d91 r3s1LDPKFs1S;
    public d91 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng2(d91 d91Var, boolean z, e81 e81Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = d91Var;
        this.QrzZRwfaDlRX = z;
        this.gPXPFXrUH4XX = e81Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        d91 d91Var;
        d91 d91Var2;
        int i = this.cpQdD2nAriOS;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            d91Var = this.r3s1LDPKFs1S;
            wp1 wp1Var = (wp1) d91Var.getValue();
            if (wp1Var != null) {
                kr0 xp1Var = this.QrzZRwfaDlRX ? new xp1(wp1Var) : new vp1(wp1Var);
                e81 e81Var = this.gPXPFXrUH4XX;
                if (e81Var != null) {
                    this.x50lh2ztY7Y5 = d91Var;
                    this.cpQdD2nAriOS = 1;
                    Object PxuCJdSBwIXG = e81Var.PxuCJdSBwIXG(xp1Var, this);
                    su suVar = su.rtx2ld2ELZv4;
                    if (PxuCJdSBwIXG == suVar) {
                        return suVar;
                    }
                    d91Var2 = d91Var;
                }
                d91Var.setValue(null);
            }
            return no2.PxuCJdSBwIXG;
        }
        if (i != 1) {
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d91Var2 = this.x50lh2ztY7Y5;
        ng0.tmVwIGCQF4zR(obj);
        d91Var = d91Var2;
        d91Var.setValue(null);
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new ng2(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((ng2) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
