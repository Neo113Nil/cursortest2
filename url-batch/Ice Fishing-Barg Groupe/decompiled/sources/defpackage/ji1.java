package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ji1 extends r61 {
    public final float PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float lS5Rgt96tfkO;

    public ji1(float f, float f2, float f3, float f4) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = f3;
        this.Y1f8riQaR6yg = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            cp0.PxuCJdSBwIXG("Padding must be non-negative");
        }
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        ki1 ki1Var = new ki1();
        ki1Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        ki1Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        ki1Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        ki1Var.pnx5pC0XzaCw = this.Y1f8riQaR6yg;
        ki1Var.IAToe7bXGz4N = true;
        return ki1Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        ki1 ki1Var = (ki1) m61Var;
        ki1Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        ki1Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        ki1Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
        ki1Var.pnx5pC0XzaCw = this.Y1f8riQaR6yg;
        ki1Var.IAToe7bXGz4N = true;
    }

    public final boolean equals(Object obj) {
        ji1 ji1Var = obj instanceof ji1 ? (ji1) obj : null;
        return ji1Var != null && k10.lS5Rgt96tfkO(this.PxuCJdSBwIXG, ji1Var.PxuCJdSBwIXG) && k10.lS5Rgt96tfkO(this.lS5Rgt96tfkO, ji1Var.lS5Rgt96tfkO) && k10.lS5Rgt96tfkO(this.TSizfFm2Yiuu, ji1Var.TSizfFm2Yiuu) && k10.lS5Rgt96tfkO(this.Y1f8riQaR6yg, ji1Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31), 31);
    }
}
