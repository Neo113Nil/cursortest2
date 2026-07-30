package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bp2 {
    private static final zo2 Companion = new zo2();
    public static final k8 a92UlCVFR9N8 = new k8(0.0f);
    public final sp2 PxuCJdSBwIXG;
    public boolean Y1f8riQaR6yg;
    public float e9gEMXR7LXtO;
    public long lS5Rgt96tfkO = Long.MIN_VALUE;
    public k8 TSizfFm2Yiuu = a92UlCVFR9N8;

    public bp2(i8 i8Var) {
        this.PxuCJdSBwIXG = i8Var.PxuCJdSBwIXG(b51.QrzZRwfaDlRX);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (defpackage.ki0.BjEWd04qc7Mw(r0).PxuCJdSBwIXG(r3, r8) == r12) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [le0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ab -> B:23:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(cd cdVar, vb vbVar, ct ctVar) {
        ap2 ap2Var;
        int i;
        k8 k8Var;
        float f;
        ap2 ap2Var2;
        cd cdVar2;
        ae0 ae0Var;
        try {
            if (ctVar instanceof ap2) {
                ap2Var = (ap2) ctVar;
                int i2 = ap2Var.gPXPFXrUH4XX;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ap2Var.gPXPFXrUH4XX = i2 - Integer.MIN_VALUE;
                    Object obj = ap2Var.r3s1LDPKFs1S;
                    i = ap2Var.gPXPFXrUH4XX;
                    k8Var = a92UlCVFR9N8;
                    su suVar = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        if (this.Y1f8riQaR6yg) {
                            hp0.TSizfFm2Yiuu("animateToZero called while previous animation is running");
                        }
                        hu huVar = ap2Var.OPXfSBeufaJ8;
                        huVar.getClass();
                        u61 u61Var = (u61) huVar.S2OOm9zPNm0h(ih0.RfyTYNmI9Srp);
                        float rZjpSjn4zoMv = u61Var != null ? u61Var.rZjpSjn4zoMv() : 1.0f;
                        this.Y1f8riQaR6yg = true;
                        f = rZjpSjn4zoMv;
                        ap2Var2 = ap2Var;
                        cdVar2 = cdVar;
                        ae0Var = vbVar;
                        zo2 zo2Var = Companion;
                        float f2 = this.e9gEMXR7LXtO;
                        zo2Var.getClass();
                        if (Math.abs(f2) >= 0.01f) {
                            v2 v2Var = new v2(this, f, cdVar2);
                            ap2Var2.dgRBjINgWbAK = cdVar2;
                            ap2Var2.x50lh2ztY7Y5 = ae0Var;
                            ap2Var2.cpQdD2nAriOS = f;
                            ap2Var2.gPXPFXrUH4XX = 1;
                            hu huVar2 = ap2Var2.OPXfSBeufaJ8;
                            huVar2.getClass();
                            if (ki0.BjEWd04qc7Mw(huVar2).PxuCJdSBwIXG(ap2Var2, v2Var) == suVar) {
                                return suVar;
                            }
                            ae0Var.PxuCJdSBwIXG();
                        } else {
                            if (Math.abs(this.e9gEMXR7LXtO) == 0.0f) {
                                this.lS5Rgt96tfkO = Long.MIN_VALUE;
                                this.TSizfFm2Yiuu = k8Var;
                                this.Y1f8riQaR6yg = false;
                                return no2.PxuCJdSBwIXG;
                            }
                            xf2 xf2Var = new xf2(10, this, cdVar2);
                            ap2Var2.dgRBjINgWbAK = ae0Var;
                            ap2Var2.x50lh2ztY7Y5 = null;
                            ap2Var2.gPXPFXrUH4XX = 2;
                            hu huVar3 = ap2Var2.OPXfSBeufaJ8;
                            huVar3.getClass();
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ae0Var = (ae0) ap2Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                            ae0Var.PxuCJdSBwIXG();
                            this.lS5Rgt96tfkO = Long.MIN_VALUE;
                            this.TSizfFm2Yiuu = k8Var;
                            this.Y1f8riQaR6yg = false;
                            return no2.PxuCJdSBwIXG;
                        }
                        float f3 = ap2Var.cpQdD2nAriOS;
                        ae0 ae0Var2 = ap2Var.x50lh2ztY7Y5;
                        ?? r14 = (le0) ap2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        ap2Var2 = ap2Var;
                        ae0Var = ae0Var2;
                        f = f3;
                        cdVar2 = r14;
                        ae0Var.PxuCJdSBwIXG();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.lS5Rgt96tfkO = Long.MIN_VALUE;
            this.TSizfFm2Yiuu = k8Var;
            this.Y1f8riQaR6yg = false;
            throw th;
        }
        ap2Var = new ap2(this, ctVar);
        Object obj2 = ap2Var.r3s1LDPKFs1S;
        i = ap2Var.gPXPFXrUH4XX;
        k8Var = a92UlCVFR9N8;
        su suVar2 = su.rtx2ld2ELZv4;
    }
}
