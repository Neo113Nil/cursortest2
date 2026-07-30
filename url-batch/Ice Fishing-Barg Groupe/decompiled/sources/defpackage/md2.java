package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class md2 extends sv1 implements pe0 {
    public final /* synthetic */ le0 QrzZRwfaDlRX;
    public final /* synthetic */ up1 cpQdD2nAriOS;
    public /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ qe0 r3s1LDPKFs1S;
    public int wdg6QnbFHrFF;
    public final /* synthetic */ ru x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md2(ru ruVar, up1 up1Var, qe0 qe0Var, le0 le0Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = ruVar;
        this.cpQdD2nAriOS = up1Var;
        this.r3s1LDPKFs1S = qe0Var;
        this.QrzZRwfaDlRX = le0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.wdg6QnbFHrFF;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            oc2 oc2Var = (oc2) this.dgRBjINgWbAK;
            this.wdg6QnbFHrFF = 1;
            Object RAsUl2FVSrh6 = rd2.RAsUl2FVSrh6(oc2Var, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this);
            su suVar = su.rtx2ld2ELZv4;
            if (RAsUl2FVSrh6 == suVar) {
                return suVar;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        md2 md2Var = new md2(this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar);
        md2Var.dgRBjINgWbAK = obj;
        return md2Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((md2) gPXPFXrUH4XX((bt) obj2, (oc2) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
