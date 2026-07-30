package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nc1 {
    public float a;
    public double b;

    public final long a(float f, float f2, long j) {
        float f3 = f - this.a;
        double d = j / 1000.0d;
        double d2 = this.b;
        double d3 = f3;
        double d4 = (d2 * d3) + f2;
        double d5 = (-d2) * d;
        double d6 = (d * d4) + d3;
        double exp = Math.exp(d5) * d6;
        double exp2 = (Math.exp(d5) * d4) + (Math.exp(d5) * d6 * (-this.b));
        return (Float.floatToRawIntBits((float) exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.a)) << 32);
    }
}
