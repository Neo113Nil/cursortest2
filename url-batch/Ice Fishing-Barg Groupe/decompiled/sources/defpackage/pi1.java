package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pi1 extends m61 implements kw0 {
    public mi1 VhhvGxCb8gfr;

    @Override // defpackage.kw0
    public final k51 e9gEMXR7LXtO(l51 l51Var, e51 e51Var, long j) {
        float PxuCJdSBwIXG = this.VhhvGxCb8gfr.PxuCJdSBwIXG(l51Var.getLayoutDirection());
        float Y1f8riQaR6yg = this.VhhvGxCb8gfr.Y1f8riQaR6yg();
        float lS5Rgt96tfkO = this.VhhvGxCb8gfr.lS5Rgt96tfkO(l51Var.getLayoutDirection());
        float TSizfFm2Yiuu = this.VhhvGxCb8gfr.TSizfFm2Yiuu();
        if (!((k10.PxuCJdSBwIXG(PxuCJdSBwIXG, 0.0f) >= 0) & (k10.PxuCJdSBwIXG(Y1f8riQaR6yg, 0.0f) >= 0) & (k10.PxuCJdSBwIXG(lS5Rgt96tfkO, 0.0f) >= 0) & (k10.PxuCJdSBwIXG(TSizfFm2Yiuu, 0.0f) >= 0))) {
            cp0.PxuCJdSBwIXG("Padding must be non-negative");
        }
        int POWyO8hTM6YC = l51Var.POWyO8hTM6YC(PxuCJdSBwIXG);
        int POWyO8hTM6YC2 = l51Var.POWyO8hTM6YC(lS5Rgt96tfkO) + POWyO8hTM6YC;
        int POWyO8hTM6YC3 = l51Var.POWyO8hTM6YC(Y1f8riQaR6yg);
        int POWyO8hTM6YC4 = l51Var.POWyO8hTM6YC(TSizfFm2Yiuu) + POWyO8hTM6YC3;
        em1 e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(sr.OPXfSBeufaJ8(-POWyO8hTM6YC2, -POWyO8hTM6YC4, j));
        return l51Var.jJwa0q7P5wHq(sr.RAsUl2FVSrh6(e9gEMXR7LXtO.rtx2ld2ELZv4 + POWyO8hTM6YC2, j), sr.a92UlCVFR9N8(e9gEMXR7LXtO.OPXfSBeufaJ8 + POWyO8hTM6YC4, j), q50.rtx2ld2ELZv4, new h61(e9gEMXR7LXtO, POWyO8hTM6YC, POWyO8hTM6YC3, 1));
    }
}
