package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public float f9821a;

    /* renamed from: b, reason: collision with root package name */
    public double f9822b;

    public final long a(float f3, float f10, long j) {
        float f11 = f3 - this.f9821a;
        double d10 = j / 1000.0d;
        double d11 = this.f9822b;
        double d12 = f11;
        double d13 = (d11 * d12) + f10;
        double d14 = (-d11) * d10;
        double d15 = (d10 * d13) + d12;
        double exp = Math.exp(d14) * d15;
        float exp2 = (float) ((Math.exp(d14) * d13) + (Math.exp(d14) * d15 * (-this.f9822b)));
        return (Float.floatToRawIntBits(exp2) & 4294967295L) | (Float.floatToRawIntBits((float) (exp + this.f9821a)) << 32);
    }
}
