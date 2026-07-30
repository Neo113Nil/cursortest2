package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class wu2 extends r61 {
    public static final vu2 Companion = new vu2();
    public final c00 PxuCJdSBwIXG;
    public final Object TSizfFm2Yiuu;
    public final pe0 lS5Rgt96tfkO;

    public wu2(c00 c00Var, pe0 pe0Var, Object obj) {
        this.PxuCJdSBwIXG = c00Var;
        this.lS5Rgt96tfkO = pe0Var;
        this.TSizfFm2Yiuu = obj;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        yu2 yu2Var = new yu2();
        yu2Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        yu2Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return yu2Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        yu2 yu2Var = (yu2) m61Var;
        yu2Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        yu2Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wu2.class != obj.getClass()) {
            return false;
        }
        wu2 wu2Var = (wu2) obj;
        return this.PxuCJdSBwIXG == wu2Var.PxuCJdSBwIXG && this.TSizfFm2Yiuu.equals(wu2Var.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + o0.Y1f8riQaR6yg(this.PxuCJdSBwIXG.hashCode() * 31, 31, false);
    }
}
