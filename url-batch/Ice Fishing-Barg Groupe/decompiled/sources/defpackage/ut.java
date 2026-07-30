package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ut extends jc2 implements pe0 {
    public final /* synthetic */ of2 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ eo1 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut(eo1 eo1Var, of2 of2Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = eo1Var;
        this.QrzZRwfaDlRX = of2Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        of2 of2Var = this.QrzZRwfaDlRX;
        eo1 eo1Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        bt btVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(new rz(eo1Var, of2Var, null), this);
                    if (XL4ISE6Oc65B != suVar) {
                        XL4ISE6Oc65B = no2Var;
                    }
                    if (XL4ISE6Oc65B == suVar) {
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
            case 1:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    Object ryVscX7ZL4Ux = b51.ryVscX7ZL4Ux(eo1Var, new bd0(of2Var, btVar, i2), this);
                    if (ryVscX7ZL4Ux != suVar) {
                        ryVscX7ZL4Ux = no2Var;
                    }
                    if (ryVscX7ZL4Ux == suVar) {
                    }
                } else if (i4 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
            default:
                int i5 = this.cpQdD2nAriOS;
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    l31 l31Var = new l31(of2Var, 0);
                    m31 m31Var = new m31(of2Var, 0);
                    m31 m31Var2 = new m31(of2Var, 1);
                    l4 l4Var = new l4(9, of2Var);
                    float f = n20.PxuCJdSBwIXG;
                    Object ryVscX7ZL4Ux2 = b51.ryVscX7ZL4Ux(eo1Var, new k20(new kb(7), new ai(4, l31Var), l4Var, m31Var2, new r3s1LDPKFs1S(8, m31Var), null), this);
                    if (ryVscX7ZL4Ux2 != suVar) {
                        ryVscX7ZL4Ux2 = no2Var;
                    }
                    if (ryVscX7ZL4Ux2 != suVar) {
                        ryVscX7ZL4Ux2 = no2Var;
                    }
                    if (ryVscX7ZL4Ux2 != suVar) {
                        ryVscX7ZL4Ux2 = no2Var;
                    }
                    if (ryVscX7ZL4Ux2 == suVar) {
                    }
                } else if (i5 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                }
                break;
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new ut(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 0);
            case 1:
                return new ut(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 1);
            default:
                return new ut(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, btVar, 2);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((ut) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
