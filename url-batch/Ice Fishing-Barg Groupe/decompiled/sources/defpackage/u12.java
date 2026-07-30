package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u12 extends jc2 implements le0 {
    public final /* synthetic */ float BRwzKIf41E4i;
    public final /* synthetic */ x12 QrzZRwfaDlRX;
    public final /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ gl2 gPXPFXrUH4XX;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(Object obj, Object obj2, x12 x12Var, gl2 gl2Var, float f, bt btVar) {
        super(1, btVar);
        this.cpQdD2nAriOS = obj;
        this.r3s1LDPKFs1S = obj2;
        this.QrzZRwfaDlRX = x12Var;
        this.gPXPFXrUH4XX = gl2Var;
        this.BRwzKIf41E4i = f;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        gl2 gl2Var = this.gPXPFXrUH4XX;
        float f = this.BRwzKIf41E4i;
        return new u12(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, gl2Var, f, (bt) obj).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            t12 t12Var = new t12(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, null);
            this.x50lh2ztY7Y5 = 1;
            Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(t12Var, this);
            su suVar = su.rtx2ld2ELZv4;
            if (XL4ISE6Oc65B == suVar) {
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
}
