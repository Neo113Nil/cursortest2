package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xg2 extends jc2 implements le0 {
    public final /* synthetic */ eh2 cpQdD2nAriOS;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg2(eh2 eh2Var, bt btVar, int i) {
        super(1, btVar);
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = eh2Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        eh2 eh2Var = this.cpQdD2nAriOS;
        bt btVar = (bt) obj;
        switch (i) {
            case 0:
                new xg2(eh2Var, btVar, 0).RfyTYNmI9Srp(no2Var);
                break;
            case 1:
                new xg2(eh2Var, btVar, 1).RfyTYNmI9Srp(no2Var);
                break;
            case 2:
                new xg2(eh2Var, btVar, 2).RfyTYNmI9Srp(no2Var);
                break;
            default:
                new xg2(eh2Var, btVar, 3).RfyTYNmI9Srp(no2Var);
                break;
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        eh2 eh2Var = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                eh2Var.e6tOsSdd2EFb = false;
                break;
            case 1:
                ng0.tmVwIGCQF4zR(obj);
                eh2Var.a92UlCVFR9N8();
                break;
            case 2:
                ng0.tmVwIGCQF4zR(obj);
                eh2Var.Y1f8riQaR6yg(eh2Var.e6tOsSdd2EFb);
                break;
            default:
                ng0.tmVwIGCQF4zR(obj);
                eh2Var.gPXPFXrUH4XX();
                break;
        }
        return no2Var;
    }
}
