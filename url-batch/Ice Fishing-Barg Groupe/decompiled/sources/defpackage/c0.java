package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c0 extends jc2 implements pe0 {
    public final /* synthetic */ ae0 cpQdD2nAriOS;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(ae0 ae0Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.cpQdD2nAriOS = ae0Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        Object uv1Var;
        int i = this.x50lh2ztY7Y5;
        ae0 ae0Var = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                try {
                    uv1Var = ae0Var.PxuCJdSBwIXG();
                } catch (Throwable th) {
                    uv1Var = new uv1(th);
                }
                Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                if (PxuCJdSBwIXG == null) {
                    return uv1Var;
                }
                if (PxuCJdSBwIXG instanceof CancellationException) {
                    throw PxuCJdSBwIXG;
                }
                return "";
            default:
                ng0.tmVwIGCQF4zR(obj);
                ae0Var.PxuCJdSBwIXG();
                return no2.PxuCJdSBwIXG;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        ae0 ae0Var = this.cpQdD2nAriOS;
        switch (i) {
            case 0:
                return new c0(ae0Var, btVar, 0);
            default:
                return new c0(ae0Var, btVar, 1);
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
                return ((c0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
            default:
                ((c0) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                return no2Var;
        }
    }
}
