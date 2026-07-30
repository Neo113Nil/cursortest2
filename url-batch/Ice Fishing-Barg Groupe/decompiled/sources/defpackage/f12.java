package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f12 extends r61 {
    public final q02 PxuCJdSBwIXG;

    public f12(q02 q02Var) {
        this.PxuCJdSBwIXG = q02Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        l02 l02Var = new l02();
        l02Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        l02Var.S2OOm9zPNm0h = true;
        return l02Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        l02 l02Var = (l02) m61Var;
        l02Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        l02Var.S2OOm9zPNm0h = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f12) {
            return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((f12) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + o0.Y1f8riQaR6yg(this.PxuCJdSBwIXG.hashCode() * 31, 31, false);
    }
}
