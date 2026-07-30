package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qt1 {
    public static final pt1 Companion = new pt1();
    public static final qt1 e9gEMXR7LXtO = new qt1(0.0f, 0.0f, 0.0f, 0.0f);
    public final float PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float lS5Rgt96tfkO;

    public qt1(float f, float f2, float f3, float f4) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = f3;
        this.Y1f8riQaR6yg = f4;
    }

    public final qt1 OPXfSBeufaJ8(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new qt1(Float.intBitsToFloat(i) + this.PxuCJdSBwIXG, Float.intBitsToFloat(i2) + this.lS5Rgt96tfkO, Float.intBitsToFloat(i) + this.TSizfFm2Yiuu, Float.intBitsToFloat(i2) + this.Y1f8riQaR6yg);
    }

    public final boolean PxuCJdSBwIXG(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.PxuCJdSBwIXG) & (intBitsToFloat < this.TSizfFm2Yiuu) & (intBitsToFloat2 >= this.lS5Rgt96tfkO) & (intBitsToFloat2 < this.Y1f8riQaR6yg);
    }

    public final boolean RAsUl2FVSrh6(qt1 qt1Var) {
        return (this.PxuCJdSBwIXG < qt1Var.TSizfFm2Yiuu) & (qt1Var.PxuCJdSBwIXG < this.TSizfFm2Yiuu) & (this.lS5Rgt96tfkO < qt1Var.Y1f8riQaR6yg) & (qt1Var.lS5Rgt96tfkO < this.Y1f8riQaR6yg);
    }

    public final long TSizfFm2Yiuu() {
        float f = this.TSizfFm2Yiuu - this.PxuCJdSBwIXG;
        float f2 = this.Y1f8riQaR6yg - this.lS5Rgt96tfkO;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long Y1f8riQaR6yg() {
        return (Float.floatToRawIntBits(this.PxuCJdSBwIXG) << 32) | (Float.floatToRawIntBits(this.lS5Rgt96tfkO) & 4294967295L);
    }

    public final boolean a92UlCVFR9N8() {
        return (this.PxuCJdSBwIXG >= this.TSizfFm2Yiuu) | (this.lS5Rgt96tfkO >= this.Y1f8riQaR6yg);
    }

    public final qt1 e9gEMXR7LXtO(qt1 qt1Var) {
        return new qt1(Math.max(this.PxuCJdSBwIXG, qt1Var.PxuCJdSBwIXG), Math.max(this.lS5Rgt96tfkO, qt1Var.lS5Rgt96tfkO), Math.min(this.TSizfFm2Yiuu, qt1Var.TSizfFm2Yiuu), Math.min(this.Y1f8riQaR6yg, qt1Var.Y1f8riQaR6yg));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt1)) {
            return false;
        }
        qt1 qt1Var = (qt1) obj;
        return Float.compare(this.PxuCJdSBwIXG, qt1Var.PxuCJdSBwIXG) == 0 && Float.compare(this.lS5Rgt96tfkO, qt1Var.lS5Rgt96tfkO) == 0 && Float.compare(this.TSizfFm2Yiuu, qt1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, qt1Var.Y1f8riQaR6yg) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Y1f8riQaR6yg) + o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31);
    }

    public final long lS5Rgt96tfkO() {
        float f = this.TSizfFm2Yiuu;
        float f2 = this.PxuCJdSBwIXG;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.Y1f8riQaR6yg;
        float f5 = this.lS5Rgt96tfkO;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final qt1 rtx2ld2ELZv4(float f, float f2) {
        return new qt1(this.PxuCJdSBwIXG + f, this.lS5Rgt96tfkO + f2, this.TSizfFm2Yiuu + f, this.Y1f8riQaR6yg + f2);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + ng0.EpkonXwzFgDB(this.PxuCJdSBwIXG) + ", " + ng0.EpkonXwzFgDB(this.lS5Rgt96tfkO) + ", " + ng0.EpkonXwzFgDB(this.TSizfFm2Yiuu) + ", " + ng0.EpkonXwzFgDB(this.Y1f8riQaR6yg) + ')';
    }
}
