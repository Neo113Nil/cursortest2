package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class og2 extends jc2 implements qe0 {
    public final /* synthetic */ e81 BRwzKIf41E4i;
    public final /* synthetic */ ru QrzZRwfaDlRX;
    public /* synthetic */ up1 cpQdD2nAriOS;
    public final /* synthetic */ d91 gPXPFXrUH4XX;
    public /* synthetic */ long r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og2(ru ruVar, d91 d91Var, e81 e81Var, bt btVar) {
        super(3, btVar);
        this.QrzZRwfaDlRX = ruVar;
        this.gPXPFXrUH4XX = d91Var;
        this.BRwzKIf41E4i = e81Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        ru ruVar = this.QrzZRwfaDlRX;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            up1 up1Var = this.cpQdD2nAriOS;
            fx1.KUoIVIumpKat(ruVar, null, new OPXfSBeufaJ8(this.gPXPFXrUH4XX, this.r3s1LDPKFs1S, this.BRwzKIf41E4i, (bt) null, 4), 3);
            this.x50lh2ztY7Y5 = 1;
            obj = up1Var.a92UlCVFR9N8(this);
            su suVar = su.rtx2ld2ELZv4;
            if (obj == suVar) {
                return suVar;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        fx1.KUoIVIumpKat(ruVar, null, new ng2(this.gPXPFXrUH4XX, ((Boolean) obj).booleanValue(), this.BRwzKIf41E4i, null), 3);
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        long j = ((bf1) obj2).PxuCJdSBwIXG;
        d91 d91Var = this.gPXPFXrUH4XX;
        e81 e81Var = this.BRwzKIf41E4i;
        og2 og2Var = new og2(this.QrzZRwfaDlRX, d91Var, e81Var, (bt) obj3);
        og2Var.cpQdD2nAriOS = (up1) obj;
        og2Var.r3s1LDPKFs1S = j;
        return og2Var.RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
