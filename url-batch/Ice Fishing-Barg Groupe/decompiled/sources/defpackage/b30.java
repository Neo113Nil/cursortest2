package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b30 extends jc2 implements pe0 {
    public final /* synthetic */ long QrzZRwfaDlRX;
    public /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ c30 r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(c30 c30Var, long j, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = c30Var;
        this.QrzZRwfaDlRX = j;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            ru ruVar = (ru) this.cpQdD2nAriOS;
            qe0 qe0Var = this.r3s1LDPKFs1S.wLFCmsViZrNT;
            bf1 bf1Var = new bf1(this.QrzZRwfaDlRX);
            this.x50lh2ztY7Y5 = 1;
            Object a92UlCVFR9N8 = qe0Var.a92UlCVFR9N8(ruVar, bf1Var, this);
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
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        b30 b30Var = new b30(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar);
        b30Var.cpQdD2nAriOS = obj;
        return b30Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((b30) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
