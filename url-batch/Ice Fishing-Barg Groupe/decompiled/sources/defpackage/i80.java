package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i80 {
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public i80(float f, hy hyVar) {
        this.PxuCJdSBwIXG = f;
        float lS5Rgt96tfkO = hyVar.lS5Rgt96tfkO();
        float f2 = j80.PxuCJdSBwIXG;
        this.lS5Rgt96tfkO = lS5Rgt96tfkO * 386.0878f * 160.0f * 0.84f;
    }

    public final h80 PxuCJdSBwIXG(float f) {
        double lS5Rgt96tfkO = lS5Rgt96tfkO(f);
        double d = j80.PxuCJdSBwIXG;
        double d2 = d - 1.0d;
        return new h80(f, (float) (Math.exp((d / d2) * lS5Rgt96tfkO) * this.PxuCJdSBwIXG * this.lS5Rgt96tfkO), (long) (Math.exp(lS5Rgt96tfkO / d2) * 1000.0d));
    }

    public final double lS5Rgt96tfkO(float f) {
        float[] fArr = p3.PxuCJdSBwIXG;
        return Math.log((Math.abs(f) * 0.35f) / (this.PxuCJdSBwIXG * this.lS5Rgt96tfkO));
    }
}
