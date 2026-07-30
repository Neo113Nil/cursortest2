package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class po extends jc2 implements pe0 {
    public /* synthetic */ float cpQdD2nAriOS;
    public final /* synthetic */ qo r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(qo qoVar, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = qoVar;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            float f = this.cpQdD2nAriOS;
            qo qoVar = this.r3s1LDPKFs1S;
            Object RAsUl2FVSrh6 = qoVar.PxuCJdSBwIXG.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.e9gEMXR7LXtO);
            pe0 pe0Var = (pe0) (RAsUl2FVSrh6 != null ? RAsUl2FVSrh6 : null);
            if (pe0Var == null) {
                throw o0.a92UlCVFR9N8("Required value was null.");
            }
            bf1 bf1Var = new bf1((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            this.x50lh2ztY7Y5 = 1;
            obj = pe0Var.rtx2ld2ELZv4(bf1Var, this);
            su suVar = su.rtx2ld2ELZv4;
            if (obj == suVar) {
                return suVar;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((bf1) obj).PxuCJdSBwIXG & 4294967295L)));
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        po poVar = new po(this.r3s1LDPKFs1S, btVar);
        poVar.cpQdD2nAriOS = ((Number) obj).floatValue();
        return poVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((po) gPXPFXrUH4XX((bt) obj2, Float.valueOf(((Number) obj).floatValue()))).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
