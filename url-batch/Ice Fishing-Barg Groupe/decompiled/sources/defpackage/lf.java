package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lf extends jc2 implements pe0 {
    public final /* synthetic */ i1 QrzZRwfaDlRX;
    public final /* synthetic */ mf cpQdD2nAriOS;
    public final /* synthetic */ vb gPXPFXrUH4XX;
    public final /* synthetic */ pd1 r3s1LDPKFs1S;
    public /* synthetic */ Object x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(mf mfVar, pd1 pd1Var, i1 i1Var, vb vbVar, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = mfVar;
        this.r3s1LDPKFs1S = pd1Var;
        this.QrzZRwfaDlRX = i1Var;
        this.gPXPFXrUH4XX = vbVar;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        ng0.tmVwIGCQF4zR(obj);
        ru ruVar = (ru) this.x50lh2ztY7Y5;
        mf mfVar = this.cpQdD2nAriOS;
        bt btVar = null;
        fx1.KUoIVIumpKat(ruVar, null, new rtx2ld2ELZv4(mfVar, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 2), 3);
        return fx1.KUoIVIumpKat(ruVar, null, new a92UlCVFR9N8(mfVar, this.gPXPFXrUH4XX, btVar, 8), 3);
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        lf lfVar = new lf(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar);
        lfVar.x50lh2ztY7Y5 = obj;
        return lfVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((lf) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
