package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cpQdD2nAriOS extends jc2 implements pe0 {
    public final /* synthetic */ kk cpQdD2nAriOS;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpQdD2nAriOS(kk kkVar, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = kkVar;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        kk kkVar = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                if (kkVar.J54yh1s3n4Aq == null) {
                    jk0 jk0Var = new jk0();
                    e81 e81Var = kkVar.ZbWwgt3aGe7A;
                    if (e81Var != null) {
                        fx1.KUoIVIumpKat(kkVar.GlTbNTgfSMqy(), null, new a92UlCVFR9N8(e81Var, jk0Var, null, 0), 3);
                    }
                    kkVar.J54yh1s3n4Aq = jk0Var;
                    break;
                }
                break;
            default:
                ng0.tmVwIGCQF4zR(obj);
                jk0 jk0Var2 = kkVar.J54yh1s3n4Aq;
                if (jk0Var2 != null) {
                    kk0 kk0Var = new kk0(jk0Var2);
                    e81 e81Var2 = kkVar.ZbWwgt3aGe7A;
                    if (e81Var2 != null) {
                        fx1.KUoIVIumpKat(kkVar.GlTbNTgfSMqy(), null, new a92UlCVFR9N8(e81Var2, kk0Var, null, 1), 3);
                    }
                    kkVar.J54yh1s3n4Aq = null;
                    break;
                }
                break;
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        kk kkVar = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                return new cpQdD2nAriOS(kkVar, btVar, 0);
            default:
                return new cpQdD2nAriOS(kkVar, btVar, 1);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
            case 0:
                ((cpQdD2nAriOS) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                break;
            default:
                ((cpQdD2nAriOS) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                break;
        }
        return no2Var;
    }
}
