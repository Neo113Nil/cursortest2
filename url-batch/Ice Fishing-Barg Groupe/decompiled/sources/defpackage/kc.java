package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class kc extends r61 {
    public final long PxuCJdSBwIXG;
    public final z42 TSizfFm2Yiuu;
    public final float lS5Rgt96tfkO = 1.0f;

    public kc(long j, z42 z42Var) {
        this.PxuCJdSBwIXG = j;
        this.TSizfFm2Yiuu = z42Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        lc lcVar = new lc();
        lcVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        lcVar.S2OOm9zPNm0h = this.TSizfFm2Yiuu;
        a62.Companion.getClass();
        lcVar.ZbWwgt3aGe7A = 9205357640488583168L;
        return lcVar;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        lc lcVar = (lc) m61Var;
        lcVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        z42 z42Var = lcVar.S2OOm9zPNm0h;
        z42 z42Var2 = this.TSizfFm2Yiuu;
        if (!cs0.wdg6QnbFHrFF(z42Var, z42Var2)) {
            lcVar.S2OOm9zPNm0h = z42Var2;
            th0.S2OOm9zPNm0h(lcVar);
        }
        fx1.IXK6ba3ucyzm(lcVar);
    }

    public final boolean equals(Object obj) {
        kc kcVar = obj instanceof kc ? (kc) obj : null;
        return kcVar != null && hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, kcVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == kcVar.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, kcVar.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return this.TSizfFm2Yiuu.hashCode() + o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Long.hashCode(this.PxuCJdSBwIXG) * 961, 31);
    }
}
