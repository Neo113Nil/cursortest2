package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r6 extends jc2 implements pe0 {
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6(int i, bt btVar, int i2) {
        super(i, btVar);
        this.x50lh2ztY7Y5 = i2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                return Choreographer.getInstance();
            default:
                ng0.tmVwIGCQF4zR(obj);
                return no2.PxuCJdSBwIXG;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new r6(2, btVar, 0);
            default:
                return new r6(2, btVar, 1);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((r6) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            default:
                ((r6) gPXPFXrUH4XX((bt) obj2, (v80) obj)).RfyTYNmI9Srp(no2Var);
                return no2Var;
        }
    }
}
