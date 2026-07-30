package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class es extends jc2 implements pe0 {
    public final /* synthetic */ long BRwzKIf41E4i;
    public final /* synthetic */ bp2 QrzZRwfaDlRX;
    public /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ pf gPXPFXrUH4XX;
    public final /* synthetic */ fs r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(fs fsVar, bp2 bp2Var, pf pfVar, long j, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = fsVar;
        this.QrzZRwfaDlRX = bp2Var;
        this.gPXPFXrUH4XX = pfVar;
        this.BRwzKIf41E4i = j;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        fs fsVar = this.r3s1LDPKFs1S;
        ef efVar = fsVar.IAToe7bXGz4N;
        int i = this.x50lh2ztY7Y5;
        try {
            try {
                if (i == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    xs0 rZjpSjn4zoMv = ki0.rZjpSjn4zoMv(((ru) this.cpQdD2nAriOS).cpQdD2nAriOS());
                    fsVar.aF05bpZJlKEP = true;
                    l12 l12Var = fsVar.S2OOm9zPNm0h;
                    h91 h91Var = h91.rtx2ld2ELZv4;
                    ds dsVar = new ds(this.QrzZRwfaDlRX, fsVar, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, rZjpSjn4zoMv, null);
                    this.x50lh2ztY7Y5 = 1;
                    Object a92UlCVFR9N8 = l12Var.a92UlCVFR9N8(h91Var, dsVar, this);
                    su suVar = su.rtx2ld2ELZv4;
                    if (a92UlCVFR9N8 == suVar) {
                        return suVar;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                efVar.lS5Rgt96tfkO();
                fsVar.aF05bpZJlKEP = false;
                efVar.PxuCJdSBwIXG(null);
                fsVar.e6tOsSdd2EFb = false;
                return no2.PxuCJdSBwIXG;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            fsVar.aF05bpZJlKEP = false;
            efVar.PxuCJdSBwIXG(null);
            fsVar.e6tOsSdd2EFb = false;
            throw th;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        es esVar = new es(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, btVar);
        esVar.cpQdD2nAriOS = obj;
        return esVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((es) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
