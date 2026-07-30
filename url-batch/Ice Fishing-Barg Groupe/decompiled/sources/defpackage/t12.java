package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t12 extends jc2 implements pe0 {
    public final /* synthetic */ gl2 BRwzKIf41E4i;
    public final /* synthetic */ Object QrzZRwfaDlRX;
    public final /* synthetic */ float XL4ISE6Oc65B;
    public /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ x12 gPXPFXrUH4XX;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(Object obj, Object obj2, x12 x12Var, gl2 gl2Var, float f, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = obj;
        this.QrzZRwfaDlRX = obj2;
        this.gPXPFXrUH4XX = x12Var;
        this.BRwzKIf41E4i = gl2Var;
        this.XL4ISE6Oc65B = f;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        bt btVar = null;
        x12 x12Var = this.gPXPFXrUH4XX;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            ru ruVar = (ru) this.cpQdD2nAriOS;
            Object obj2 = this.r3s1LDPKFs1S;
            Object obj3 = this.QrzZRwfaDlRX;
            if (cs0.wdg6QnbFHrFF(obj2, obj3)) {
                x12Var.QrzZRwfaDlRX = null;
                if (cs0.wdg6QnbFHrFF(x12Var.TSizfFm2Yiuu.getValue(), obj2)) {
                    return no2Var;
                }
            } else {
                x12.r3s1LDPKFs1S(x12Var);
            }
            boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(obj2, obj3);
            float f = this.XL4ISE6Oc65B;
            if (!wdg6QnbFHrFF) {
                gl2 gl2Var = this.BRwzKIf41E4i;
                gl2Var.gPXPFXrUH4XX(obj2);
                gl2Var.r3s1LDPKFs1S(0L);
                x12Var.lS5Rgt96tfkO.setValue(obj2);
                gl2Var.wdg6QnbFHrFF(f);
            }
            x12Var.S2OOm9zPNm0h(f);
            if (x12Var.r3s1LDPKFs1S.OPXfSBeufaJ8()) {
                fx1.KUoIVIumpKat(ruVar, null, new ew(x12Var, btVar, 11), 3);
            } else {
                x12Var.cpQdD2nAriOS = Long.MIN_VALUE;
            }
            this.x50lh2ztY7Y5 = 1;
            Object BRwzKIf41E4i = x12.BRwzKIf41E4i(x12Var, this);
            su suVar = su.rtx2ld2ELZv4;
            if (BRwzKIf41E4i == suVar) {
                return suVar;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        x12Var.VhhvGxCb8gfr();
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        t12 t12Var = new t12(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, this.XL4ISE6Oc65B, btVar);
        t12Var.cpQdD2nAriOS = obj;
        return t12Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((t12) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
