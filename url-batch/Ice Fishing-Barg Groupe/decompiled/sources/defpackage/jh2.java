package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jh2 {
    public cw0 PxuCJdSBwIXG;
    public long RAsUl2FVSrh6;
    public ob0 TSizfFm2Yiuu;
    public dj2 Y1f8riQaR6yg;
    public final mj1 a92UlCVFR9N8 = sj0.tmVwIGCQF4zR(Boolean.TRUE);
    public Object e9gEMXR7LXtO;
    public hy lS5Rgt96tfkO;

    public jh2(cw0 cw0Var, hy hyVar, ob0 ob0Var, dj2 dj2Var, Object obj) {
        long PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = cw0Var;
        this.lS5Rgt96tfkO = hyVar;
        this.TSizfFm2Yiuu = ob0Var;
        this.Y1f8riQaR6yg = dj2Var;
        this.e9gEMXR7LXtO = obj;
        PxuCJdSBwIXG = vf2.PxuCJdSBwIXG(this.Y1f8riQaR6yg, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, vf2.PxuCJdSBwIXG, 1);
        this.RAsUl2FVSrh6 = PxuCJdSBwIXG;
    }

    public static void PxuCJdSBwIXG(jh2 jh2Var, cw0 cw0Var, hy hyVar, dj2 dj2Var, int i) {
        if ((i & 1) != 0) {
            cw0Var = jh2Var.PxuCJdSBwIXG;
        }
        if ((i & 2) != 0) {
            hyVar = jh2Var.lS5Rgt96tfkO;
        }
        ob0 ob0Var = jh2Var.TSizfFm2Yiuu;
        if ((i & 8) != 0) {
            dj2Var = jh2Var.Y1f8riQaR6yg;
        }
        Object obj = jh2Var.e9gEMXR7LXtO;
        cw0 cw0Var2 = jh2Var.PxuCJdSBwIXG;
        mj1 mj1Var = jh2Var.a92UlCVFR9N8;
        if (cw0Var == cw0Var2 && cs0.wdg6QnbFHrFF(hyVar, jh2Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(ob0Var, jh2Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(dj2Var, jh2Var.Y1f8riQaR6yg)) {
            if (cs0.wdg6QnbFHrFF(obj, jh2Var.e9gEMXR7LXtO)) {
                return;
            }
            jh2Var.e9gEMXR7LXtO = obj;
            mj1Var.setValue(Boolean.TRUE);
            return;
        }
        jh2Var.PxuCJdSBwIXG = cw0Var;
        jh2Var.lS5Rgt96tfkO = hyVar;
        jh2Var.TSizfFm2Yiuu = ob0Var;
        jh2Var.Y1f8riQaR6yg = dj2Var;
        mj1Var.setValue(Boolean.TRUE);
    }
}
