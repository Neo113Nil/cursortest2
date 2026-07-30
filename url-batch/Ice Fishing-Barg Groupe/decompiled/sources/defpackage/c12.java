package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c12 extends jc2 implements pe0 {
    public final /* synthetic */ float QrzZRwfaDlRX;
    public final /* synthetic */ d12 cpQdD2nAriOS;
    public final /* synthetic */ float r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c12(d12 d12Var, float f, float f2, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = d12Var;
        this.r3s1LDPKFs1S = f;
        this.QrzZRwfaDlRX = f2;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            this.x50lh2ztY7Y5 = 1;
            Object PxuCJdSBwIXG = x02.PxuCJdSBwIXG(this.cpQdD2nAriOS.xbgXKYA2cIfu, (Float.floatToRawIntBits(this.r3s1LDPKFs1S) << 32) | (Float.floatToRawIntBits(this.QrzZRwfaDlRX) & 4294967295L), this);
            su suVar = su.rtx2ld2ELZv4;
            if (PxuCJdSBwIXG == suVar) {
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
        return new c12(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((c12) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
