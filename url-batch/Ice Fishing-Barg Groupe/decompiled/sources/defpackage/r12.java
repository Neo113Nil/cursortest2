package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r12 extends jc2 implements le0 {
    public final /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ Object gPXPFXrUH4XX;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r12(x12 x12Var, Object obj, gl2 gl2Var, bt btVar) {
        super(1, btVar);
        this.x50lh2ztY7Y5 = 1;
        this.r3s1LDPKFs1S = x12Var;
        this.QrzZRwfaDlRX = obj;
        this.gPXPFXrUH4XX = gl2Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.QrzZRwfaDlRX;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj3 = this.r3s1LDPKFs1S;
        Object obj4 = this.gPXPFXrUH4XX;
        switch (i) {
            case 0:
                return new r12((gl2) obj4, (x12) obj3, this.QrzZRwfaDlRX, (bt) obj, 0).RfyTYNmI9Srp(no2Var);
            case 1:
                return new r12((x12) obj3, obj2, (gl2) obj4, (bt) obj).RfyTYNmI9Srp(no2Var);
            default:
                return new r12((uj1) obj4, (sk2) obj3, (pe0) obj2, (bt) obj, 2).RfyTYNmI9Srp(no2Var);
        }
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.QrzZRwfaDlRX;
        Object obj3 = this.r3s1LDPKFs1S;
        Object obj4 = this.gPXPFXrUH4XX;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                gl2 gl2Var = (gl2) obj4;
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    d4 d4Var = new d4((x12) obj3, obj2, gl2Var, null);
                    this.cpQdD2nAriOS = 1;
                    if (cs0.XL4ISE6Oc65B(d4Var, this) == suVar) {
                        return suVar;
                    }
                } else {
                    if (i2 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                gl2Var.OPXfSBeufaJ8();
                return no2Var;
            case 1:
                gl2 gl2Var2 = (gl2) obj4;
                x12 x12Var = (x12) obj3;
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    x12Var.RfyTYNmI9Srp();
                    mj1 mj1Var = x12Var.lS5Rgt96tfkO;
                    x12Var.cpQdD2nAriOS = Long.MIN_VALUE;
                    x12Var.S2OOm9zPNm0h(0.0f);
                    float f = obj2.equals(x12Var.TSizfFm2Yiuu.getValue()) ? -4.0f : obj2.equals(mj1Var.getValue()) ? -5.0f : -3.0f;
                    gl2Var2.gPXPFXrUH4XX(obj2);
                    gl2Var2.r3s1LDPKFs1S(0L);
                    mj1Var.setValue(obj2);
                    x12Var.S2OOm9zPNm0h(0.0f);
                    x12Var.wdg6QnbFHrFF(obj2);
                    gl2Var2.wdg6QnbFHrFF(f);
                    if (f == -3.0f) {
                        this.cpQdD2nAriOS = 1;
                        if (x12.BRwzKIf41E4i(x12Var, this) == suVar) {
                            return suVar;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                gl2Var2.OPXfSBeufaJ8();
                return no2Var;
            default:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    Object e9gEMXR7LXtO = ((uj1) obj4).e9gEMXR7LXtO((sk2) obj3, (pe0) obj2, this);
                    return e9gEMXR7LXtO == suVar ? suVar : e9gEMXR7LXtO;
                }
                if (i4 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    return obj;
                }
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r12(Object obj, Object obj2, Object obj3, bt btVar, int i) {
        super(1, btVar);
        this.x50lh2ztY7Y5 = i;
        this.gPXPFXrUH4XX = obj;
        this.r3s1LDPKFs1S = obj2;
        this.QrzZRwfaDlRX = obj3;
    }
}
