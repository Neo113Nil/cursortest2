package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uy extends jc2 implements pe0 {
    public final /* synthetic */ int QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ wy r3s1LDPKFs1S;
    public l92 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy(wy wyVar, int i, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = wyVar;
        this.QrzZRwfaDlRX = i;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        l92 l92Var;
        int i = this.cpQdD2nAriOS;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            wy wyVar = this.r3s1LDPKFs1S;
            l92 l92Var2 = wyVar.TSizfFm2Yiuu;
            w51 w51Var = wyVar.lS5Rgt96tfkO;
            this.x50lh2ztY7Y5 = l92Var2;
            this.cpQdD2nAriOS = 1;
            us0 us0Var = w51Var.PxuCJdSBwIXG;
            obj = fx1.fRTaYY6FBZcX(this, new rs0(this.QrzZRwfaDlRX, us0Var), us0Var.PxuCJdSBwIXG, true, false);
            su suVar = su.rtx2ld2ELZv4;
            if (obj == suVar) {
                return suVar;
            }
            l92Var = l92Var2;
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l92Var = this.x50lh2ztY7Y5;
            ng0.tmVwIGCQF4zR(obj);
        }
        l92Var.rtx2ld2ELZv4(obj);
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new uy(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((uy) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
