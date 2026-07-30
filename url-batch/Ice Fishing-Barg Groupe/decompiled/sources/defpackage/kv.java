package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kv extends jc2 implements pe0 {
    public final /* synthetic */ boolean QrzZRwfaDlRX;
    public final /* synthetic */ ex1 cpQdD2nAriOS;
    public final /* synthetic */ le0 gPXPFXrUH4XX;
    public final /* synthetic */ boolean r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(bt btVar, le0 le0Var, ex1 ex1Var, boolean z, boolean z2) {
        super(2, btVar);
        this.cpQdD2nAriOS = ex1Var;
        this.r3s1LDPKFs1S = z;
        this.QrzZRwfaDlRX = z2;
        this.gPXPFXrUH4XX = le0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        if (i != 0) {
            if (i == 1) {
                ng0.tmVwIGCQF4zR(obj);
                return obj;
            }
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ng0.tmVwIGCQF4zR(obj);
        le0 le0Var = this.gPXPFXrUH4XX;
        ex1 ex1Var = this.cpQdD2nAriOS;
        boolean z = this.QrzZRwfaDlRX;
        boolean z2 = this.r3s1LDPKFs1S;
        mv mvVar = new mv(null, le0Var, ex1Var, z, z2);
        this.x50lh2ztY7Y5 = 1;
        Object wdg6QnbFHrFF = ex1Var.wdg6QnbFHrFF(z2, mvVar, this);
        su suVar = su.rtx2ld2ELZv4;
        return wdg6QnbFHrFF == suVar ? suVar : wdg6QnbFHrFF;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new kv(btVar, this.gPXPFXrUH4XX, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((kv) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
