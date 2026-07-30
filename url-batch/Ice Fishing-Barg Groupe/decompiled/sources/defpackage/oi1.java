package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oi1 implements mi1 {
    public final float PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float lS5Rgt96tfkO;

    public oi1(float f, float f2, float f3, float f4) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = f3;
        this.Y1f8riQaR6yg = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            cp0.PxuCJdSBwIXG("Padding must be non-negative");
        }
    }

    @Override // defpackage.mi1
    public final float PxuCJdSBwIXG(cw0 cw0Var) {
        return cw0Var == cw0.rtx2ld2ELZv4 ? this.PxuCJdSBwIXG : this.TSizfFm2Yiuu;
    }

    @Override // defpackage.mi1
    public final float TSizfFm2Yiuu() {
        return this.Y1f8riQaR6yg;
    }

    @Override // defpackage.mi1
    public final float Y1f8riQaR6yg() {
        return this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oi1)) {
            return false;
        }
        oi1 oi1Var = (oi1) obj;
        return k10.lS5Rgt96tfkO(this.PxuCJdSBwIXG, oi1Var.PxuCJdSBwIXG) && k10.lS5Rgt96tfkO(this.lS5Rgt96tfkO, oi1Var.lS5Rgt96tfkO) && k10.lS5Rgt96tfkO(this.TSizfFm2Yiuu, oi1Var.TSizfFm2Yiuu) && k10.lS5Rgt96tfkO(this.Y1f8riQaR6yg, oi1Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        return Float.hashCode(this.Y1f8riQaR6yg) + o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31);
    }

    @Override // defpackage.mi1
    public final float lS5Rgt96tfkO(cw0 cw0Var) {
        return cw0Var == cw0.rtx2ld2ELZv4 ? this.TSizfFm2Yiuu : this.PxuCJdSBwIXG;
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) k10.TSizfFm2Yiuu(this.PxuCJdSBwIXG)) + ", top=" + ((Object) k10.TSizfFm2Yiuu(this.lS5Rgt96tfkO)) + ", end=" + ((Object) k10.TSizfFm2Yiuu(this.TSizfFm2Yiuu)) + ", bottom=" + ((Object) k10.TSizfFm2Yiuu(this.Y1f8riQaR6yg)) + ')';
    }
}
