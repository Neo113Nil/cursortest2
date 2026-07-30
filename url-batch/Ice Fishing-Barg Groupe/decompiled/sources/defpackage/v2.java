package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements le0 {
    public final /* synthetic */ float OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ v2(float f, ym0 ym0Var, td tdVar) {
        this.OPXfSBeufaJ8 = f;
        this.wdg6QnbFHrFF = ym0Var;
        this.dgRBjINgWbAK = tdVar;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.dgRBjINgWbAK;
        float f = this.OPXfSBeufaJ8;
        Object obj3 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                ym0 ym0Var = (ym0) obj3;
                td tdVar = (td) obj2;
                xw0 xw0Var = (xw0) obj;
                xw0Var.PxuCJdSBwIXG();
                m9 m9Var = xw0Var.rtx2ld2ELZv4.OPXfSBeufaJ8;
                long S2OOm9zPNm0h = m9Var.S2OOm9zPNm0h();
                m9Var.gPXPFXrUH4XX().wdg6QnbFHrFF();
                try {
                    i2 i2Var = (i2) m9Var.OPXfSBeufaJ8;
                    i2Var.BRwzKIf41E4i(f, 0.0f);
                    bf1.Companion.getClass();
                    gi gPXPFXrUH4XX = ((m9) i2Var.OPXfSBeufaJ8).gPXPFXrUH4XX();
                    gPXPFXrUH4XX.Y1f8riQaR6yg(Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                    gPXPFXrUH4XX.e9gEMXR7LXtO();
                    gPXPFXrUH4XX.Y1f8riQaR6yg(-Float.intBitsToFloat(0), -Float.intBitsToFloat(0));
                    k30.cpQdD2nAriOS(xw0Var, ym0Var, tdVar);
                    return no2Var;
                } finally {
                    m9Var.gPXPFXrUH4XX().RAsUl2FVSrh6();
                    m9Var.ozEBbv0hFTAB(S2OOm9zPNm0h);
                }
            default:
                bp2 bp2Var = (bp2) obj3;
                le0 le0Var = (le0) obj2;
                long longValue = ((Long) obj).longValue();
                if (bp2Var.lS5Rgt96tfkO == Long.MIN_VALUE) {
                    bp2Var.lS5Rgt96tfkO = longValue;
                }
                float f2 = bp2Var.e9gEMXR7LXtO;
                k8 k8Var = new k8(f2);
                k8 k8Var2 = bp2.a92UlCVFR9N8;
                long lS5Rgt96tfkO = f == 0.0f ? bp2Var.PxuCJdSBwIXG.lS5Rgt96tfkO(new k8(f2), k8Var2, bp2Var.TSizfFm2Yiuu) : b51.JHNfcAUfKc4G((longValue - bp2Var.lS5Rgt96tfkO) / f);
                float f3 = ((k8) bp2Var.PxuCJdSBwIXG.QrzZRwfaDlRX(lS5Rgt96tfkO, k8Var, k8Var2, bp2Var.TSizfFm2Yiuu)).PxuCJdSBwIXG;
                bp2Var.TSizfFm2Yiuu = (k8) bp2Var.PxuCJdSBwIXG.x50lh2ztY7Y5(lS5Rgt96tfkO, k8Var, k8Var2, bp2Var.TSizfFm2Yiuu);
                bp2Var.lS5Rgt96tfkO = longValue;
                float f4 = bp2Var.e9gEMXR7LXtO - f3;
                bp2Var.e9gEMXR7LXtO = f3;
                le0Var.OPXfSBeufaJ8(Float.valueOf(f4));
                return no2Var;
        }
    }

    public /* synthetic */ v2(bp2 bp2Var, float f, le0 le0Var) {
        this.wdg6QnbFHrFF = bp2Var;
        this.OPXfSBeufaJ8 = f;
        this.dgRBjINgWbAK = le0Var;
    }
}
