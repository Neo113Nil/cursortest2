package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mv extends jc2 implements pe0 {
    public final /* synthetic */ ex1 BRwzKIf41E4i;
    public final /* synthetic */ boolean QrzZRwfaDlRX;
    public final /* synthetic */ le0 XL4ISE6Oc65B;
    public int cpQdD2nAriOS;
    public final /* synthetic */ boolean gPXPFXrUH4XX;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public sk2 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(bt btVar, le0 le0Var, ex1 ex1Var, boolean z, boolean z2) {
        super(2, btVar);
        this.QrzZRwfaDlRX = z;
        this.gPXPFXrUH4XX = z2;
        this.BRwzKIf41E4i = ex1Var;
        this.XL4ISE6Oc65B = le0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        sk2 sk2Var;
        tk2 tk2Var;
        sk2 sk2Var2;
        tk2 tk2Var2;
        Object obj2;
        int i = this.cpQdD2nAriOS;
        le0 le0Var = this.XL4ISE6Oc65B;
        ex1 ex1Var = this.BRwzKIf41E4i;
        boolean z = this.gPXPFXrUH4XX;
        int i2 = 2;
        bt btVar = null;
        su suVar = su.rtx2ld2ELZv4;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            tk2 tk2Var3 = (tk2) this.r3s1LDPKFs1S;
            if (!this.QrzZRwfaDlRX) {
                tk2Var3.getClass();
                return le0Var.OPXfSBeufaJ8(((zr1) tk2Var3).lS5Rgt96tfkO());
            }
            sk2Var = z ? sk2.rtx2ld2ELZv4 : sk2.OPXfSBeufaJ8;
            if (!z) {
                this.r3s1LDPKFs1S = tk2Var3;
                this.x50lh2ztY7Y5 = sk2Var;
                this.cpQdD2nAriOS = 1;
                Boolean TSizfFm2Yiuu = tk2Var3.TSizfFm2Yiuu(this);
                if (TSizfFm2Yiuu != suVar) {
                    tk2Var2 = tk2Var3;
                    obj = TSizfFm2Yiuu;
                }
                return suVar;
            }
            sk2 sk2Var3 = sk2Var;
            tk2Var = tk2Var3;
            sk2Var2 = sk2Var3;
            gv gvVar = new gv((bt) null, le0Var);
            this.r3s1LDPKFs1S = tk2Var;
            this.x50lh2ztY7Y5 = null;
            this.cpQdD2nAriOS = 3;
            obj = tk2Var.PxuCJdSBwIXG(sk2Var2, gvVar, this);
        } else if (i == 1) {
            sk2Var = this.x50lh2ztY7Y5;
            tk2Var2 = (tk2) this.r3s1LDPKFs1S;
            ng0.tmVwIGCQF4zR(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    tk2Var = (tk2) this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                    if (z) {
                        return obj;
                    }
                    this.r3s1LDPKFs1S = obj;
                    this.cpQdD2nAriOS = 4;
                    Boolean TSizfFm2Yiuu2 = tk2Var.TSizfFm2Yiuu(this);
                    if (TSizfFm2Yiuu2 != suVar) {
                        Object obj3 = obj;
                        obj = TSizfFm2Yiuu2;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    }
                    return suVar;
                }
                if (i != 4) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                if (!((Boolean) obj).booleanValue()) {
                    ns0 Y1f8riQaR6yg = ex1Var.Y1f8riQaR6yg();
                    gm2 gm2Var = Y1f8riQaR6yg.lS5Rgt96tfkO;
                    kb kbVar = Y1f8riQaR6yg.e9gEMXR7LXtO;
                    kb kbVar2 = Y1f8riQaR6yg.a92UlCVFR9N8;
                    gm2Var.getClass();
                    kbVar.getClass();
                    kbVar2.getClass();
                    if (gm2Var.wdg6QnbFHrFF.compareAndSet(false, true)) {
                        at atVar = gm2Var.PxuCJdSBwIXG.PxuCJdSBwIXG;
                        if (atVar != null) {
                            fx1.KUoIVIumpKat(atVar, new mu(), new n92(gm2Var, kbVar2, btVar, i2), 2);
                            return obj2;
                        }
                        cs0.tmVwIGCQF4zR("coroutineScope");
                        throw null;
                    }
                }
                return obj2;
            }
            sk2Var = this.x50lh2ztY7Y5;
            tk2Var2 = (tk2) this.r3s1LDPKFs1S;
            ng0.tmVwIGCQF4zR(obj);
            sk2Var2 = sk2Var;
            tk2Var = tk2Var2;
            gv gvVar2 = new gv((bt) null, le0Var);
            this.r3s1LDPKFs1S = tk2Var;
            this.x50lh2ztY7Y5 = null;
            this.cpQdD2nAriOS = 3;
            obj = tk2Var.PxuCJdSBwIXG(sk2Var2, gvVar2, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            ns0 Y1f8riQaR6yg2 = ex1Var.Y1f8riQaR6yg();
            this.r3s1LDPKFs1S = tk2Var2;
            this.x50lh2ztY7Y5 = sk2Var;
            this.cpQdD2nAriOS = 2;
            Object e9gEMXR7LXtO = Y1f8riQaR6yg2.lS5Rgt96tfkO.e9gEMXR7LXtO(this);
            if (e9gEMXR7LXtO != suVar) {
                e9gEMXR7LXtO = no2.PxuCJdSBwIXG;
            }
        }
        sk2Var2 = sk2Var;
        tk2Var = tk2Var2;
        gv gvVar22 = new gv((bt) null, le0Var);
        this.r3s1LDPKFs1S = tk2Var;
        this.x50lh2ztY7Y5 = null;
        this.cpQdD2nAriOS = 3;
        obj = tk2Var.PxuCJdSBwIXG(sk2Var2, gvVar22, this);
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        mv mvVar = new mv(btVar, this.XL4ISE6Oc65B, this.BRwzKIf41E4i, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX);
        mvVar.r3s1LDPKFs1S = obj;
        return mvVar;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((mv) gPXPFXrUH4XX((bt) obj2, (tk2) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
