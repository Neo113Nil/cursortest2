package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public float f6434a;

    /* renamed from: b, reason: collision with root package name */
    public double f6435b;

    /* renamed from: c, reason: collision with root package name */
    public float f6436c;

    public final long a(float f6, float f8, long j7) {
        double sin;
        double cos;
        double exp;
        double exp2;
        float f9 = f6 - this.f6434a;
        double d8 = j7 / 1000.0d;
        float f10 = this.f6436c;
        double d9 = f10 * f10;
        double d10 = this.f6435b;
        double d11 = (-f10) * d10;
        if (f10 > 1.0f) {
            double sqrt = Math.sqrt(d9 - 1) * d10;
            double d12 = d11 + sqrt;
            double d13 = d11 - sqrt;
            double d14 = f9;
            double d15 = ((d13 * d14) - f8) / (d13 - d12);
            double d16 = d14 - d15;
            double d17 = d13 * d8;
            double d18 = d8 * d12;
            sin = (Math.exp(d18) * d15) + (Math.exp(d17) * d16);
            exp = Math.exp(d17) * d16 * d13;
            exp2 = Math.exp(d18) * d15 * d12;
        } else {
            if (f10 != 1.0f) {
                double d19 = 1;
                double sqrt2 = Math.sqrt(d19 - d9) * d10;
                double d20 = f9;
                double d21 = (((-d11) * d20) + f8) * (d19 / sqrt2);
                double d22 = sqrt2 * d8;
                double d23 = d8 * d11;
                sin = ((Math.sin(d22) * d21) + (Math.cos(d22) * d20)) * Math.exp(d23);
                cos = (((Math.cos(d22) * sqrt2 * d21) + (Math.sin(d22) * (-sqrt2) * d20)) * Math.exp(d23)) + (d11 * sin);
                float f11 = (float) cos;
                return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f6434a)) << 32);
            }
            double d24 = f9;
            double d25 = (d10 * d24) + f8;
            double d26 = (-d10) * d8;
            double d27 = (d8 * d25) + d24;
            sin = Math.exp(d26) * d27;
            exp = Math.exp(d26) * d27 * (-this.f6435b);
            exp2 = Math.exp(d26) * d25;
        }
        cos = exp2 + exp;
        float f112 = (float) cos;
        return (Float.floatToRawIntBits(f112) & 4294967295L) | (Float.floatToRawIntBits((float) (sin + this.f6434a)) << 32);
    }
}
