package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u81 {
    public float PxuCJdSBwIXG = 0.0f;
    public float lS5Rgt96tfkO = 0.0f;
    public float TSizfFm2Yiuu = 0.0f;
    public float Y1f8riQaR6yg = 0.0f;

    public final void PxuCJdSBwIXG(float f, float f2, float f3, float f4) {
        this.PxuCJdSBwIXG = Math.max(f, this.PxuCJdSBwIXG);
        this.lS5Rgt96tfkO = Math.max(f2, this.lS5Rgt96tfkO);
        this.TSizfFm2Yiuu = Math.min(f3, this.TSizfFm2Yiuu);
        this.Y1f8riQaR6yg = Math.min(f4, this.Y1f8riQaR6yg);
    }

    public final void TSizfFm2Yiuu(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.PxuCJdSBwIXG += intBitsToFloat;
        this.lS5Rgt96tfkO += intBitsToFloat2;
        this.TSizfFm2Yiuu += intBitsToFloat;
        this.Y1f8riQaR6yg += intBitsToFloat2;
    }

    public final boolean lS5Rgt96tfkO() {
        return (this.PxuCJdSBwIXG >= this.TSizfFm2Yiuu) | (this.lS5Rgt96tfkO >= this.Y1f8riQaR6yg);
    }

    public final String toString() {
        return "MutableRect(" + ng0.EpkonXwzFgDB(this.PxuCJdSBwIXG) + ", " + ng0.EpkonXwzFgDB(this.lS5Rgt96tfkO) + ", " + ng0.EpkonXwzFgDB(this.TSizfFm2Yiuu) + ", " + ng0.EpkonXwzFgDB(this.Y1f8riQaR6yg) + ')';
    }
}
