package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k20 extends sv1 implements pe0 {
    public final /* synthetic */ Object BRwzKIf41E4i;
    public final /* synthetic */ xe0 QrzZRwfaDlRX;
    public Object cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final /* synthetic */ xe0 gPXPFXrUH4XX;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int wdg6QnbFHrFF = 0;
    public /* synthetic */ Object x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(kb kbVar, ai aiVar, l4 l4Var, m31 m31Var, r3s1LDPKFs1S r3s1ldpkfs1s, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = kbVar;
        this.r3s1LDPKFs1S = aiVar;
        this.QrzZRwfaDlRX = l4Var;
        this.gPXPFXrUH4XX = m31Var;
        this.BRwzKIf41E4i = r3s1ldpkfs1s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r3 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r11 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r3 == r9) goto L38;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        oc2 oc2Var;
        Object PxuCJdSBwIXG;
        oc2 oc2Var2;
        xs0 KUoIVIumpKat;
        Object lS5Rgt96tfkO;
        bt btVar;
        Object OPXfSBeufaJ8;
        int i = this.wdg6QnbFHrFF;
        no2 no2Var = no2.PxuCJdSBwIXG;
        xe0 xe0Var = this.gPXPFXrUH4XX;
        xe0 xe0Var2 = this.QrzZRwfaDlRX;
        su suVar = su.rtx2ld2ELZv4;
        Object obj2 = this.BRwzKIf41E4i;
        Object obj3 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                int i2 = this.dgRBjINgWbAK;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    oc2Var = (oc2) this.x50lh2ztY7Y5;
                    this.x50lh2ztY7Y5 = oc2Var;
                    this.dgRBjINgWbAK = 1;
                    PxuCJdSBwIXG = rd2.PxuCJdSBwIXG(oc2Var, false, rn1.rtx2ld2ELZv4, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ng0.tmVwIGCQF4zR(obj);
                            return no2Var;
                        }
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oc2Var = (oc2) this.x50lh2ztY7Y5;
                    ng0.tmVwIGCQF4zR(obj);
                    PxuCJdSBwIXG = obj;
                }
                this.x50lh2ztY7Y5 = null;
                this.dgRBjINgWbAK = 2;
                if (n20.RAsUl2FVSrh6(oc2Var, (ao1) PxuCJdSBwIXG, (kb) this.cpQdD2nAriOS, (ai) obj3, (l4) xe0Var2, (m31) xe0Var, (r3s1LDPKFs1S) obj2, this) != suVar) {
                    return no2Var;
                }
                return suVar;
            default:
                ru ruVar = (ru) obj3;
                up1 up1Var = (up1) obj2;
                int i3 = this.dgRBjINgWbAK;
                bt btVar2 = null;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    oc2Var2 = (oc2) this.x50lh2ztY7Y5;
                    KUoIVIumpKat = fx1.KUoIVIumpKat(ruVar, null, new ld2(up1Var, null, 0), 1);
                    this.x50lh2ztY7Y5 = oc2Var2;
                    this.cpQdD2nAriOS = KUoIVIumpKat;
                    this.dgRBjINgWbAK = 1;
                    lS5Rgt96tfkO = rd2.lS5Rgt96tfkO(oc2Var2, this, 3);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        KUoIVIumpKat = (xs0) this.x50lh2ztY7Y5;
                        ng0.tmVwIGCQF4zR(obj);
                        OPXfSBeufaJ8 = obj;
                        btVar = null;
                        ao1 ao1Var = (ao1) OPXfSBeufaJ8;
                        if (ao1Var == null) {
                            rd2.a92UlCVFR9N8(ruVar, KUoIVIumpKat, new kd2(up1Var, btVar, 0));
                            return no2Var;
                        }
                        ao1Var.PxuCJdSBwIXG();
                        rd2.a92UlCVFR9N8(ruVar, KUoIVIumpKat, new kd2(up1Var, btVar, 1));
                        ((o6) xe0Var).OPXfSBeufaJ8(new bf1(ao1Var.TSizfFm2Yiuu));
                        return no2Var;
                    }
                    KUoIVIumpKat = (z82) this.cpQdD2nAriOS;
                    oc2Var2 = (oc2) this.x50lh2ztY7Y5;
                    ng0.tmVwIGCQF4zR(obj);
                    lS5Rgt96tfkO = obj;
                }
                ao1 ao1Var2 = (ao1) lS5Rgt96tfkO;
                ao1Var2.PxuCJdSBwIXG();
                og2 og2Var = (og2) xe0Var2;
                if (og2Var != rd2.PxuCJdSBwIXG) {
                    btVar = null;
                    rd2.a92UlCVFR9N8(ruVar, KUoIVIumpKat, new rtx2ld2ELZv4(og2Var, up1Var, ao1Var2, btVar2, 19));
                } else {
                    btVar = null;
                }
                this.x50lh2ztY7Y5 = KUoIVIumpKat;
                this.cpQdD2nAriOS = btVar;
                this.dgRBjINgWbAK = 2;
                OPXfSBeufaJ8 = rd2.OPXfSBeufaJ8(oc2Var2, rn1.OPXfSBeufaJ8, this);
                break;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.wdg6QnbFHrFF;
        Object obj2 = this.BRwzKIf41E4i;
        xe0 xe0Var = this.gPXPFXrUH4XX;
        xe0 xe0Var2 = this.QrzZRwfaDlRX;
        Object obj3 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                k20 k20Var = new k20((kb) this.cpQdD2nAriOS, (ai) obj3, (l4) xe0Var2, (m31) xe0Var, (r3s1LDPKFs1S) obj2, btVar);
                k20Var.x50lh2ztY7Y5 = obj;
                return k20Var;
            default:
                k20 k20Var2 = new k20((ru) obj3, (og2) xe0Var2, (o6) xe0Var, (up1) obj2, btVar);
                k20Var2.x50lh2ztY7Y5 = obj;
                return k20Var2;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.wdg6QnbFHrFF;
        no2 no2Var = no2.PxuCJdSBwIXG;
        oc2 oc2Var = (oc2) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((k20) gPXPFXrUH4XX(btVar, oc2Var)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(ru ruVar, og2 og2Var, o6 o6Var, up1 up1Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = ruVar;
        this.QrzZRwfaDlRX = og2Var;
        this.gPXPFXrUH4XX = o6Var;
        this.BRwzKIf41E4i = up1Var;
    }
}
