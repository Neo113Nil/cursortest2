package l;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public float f7651a;

    /* renamed from: b, reason: collision with root package name */
    public double f7652b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7653c;

    /* renamed from: d, reason: collision with root package name */
    public double f7654d;

    /* renamed from: e, reason: collision with root package name */
    public double f7655e;

    /* renamed from: f, reason: collision with root package name */
    public double f7656f;

    /* renamed from: g, reason: collision with root package name */
    public float f7657g;

    public final long a(float f4, float f5, long j4) {
        double cos;
        double d4;
        if (!this.f7653c) {
            if (this.f7651a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f6 = this.f7657g;
            double d5 = f6;
            double d6 = d5 * d5;
            if (f6 > 1.0f) {
                double d7 = this.f7652b;
                double d8 = d6 - 1;
                this.f7654d = (Math.sqrt(d8) * d7) + ((-f6) * d7);
                double d9 = -this.f7657g;
                double d10 = this.f7652b;
                this.f7655e = (d9 * d10) - (Math.sqrt(d8) * d10);
            } else if (f6 >= 0.0f && f6 < 1.0f) {
                this.f7656f = Math.sqrt(1 - d6) * this.f7652b;
            }
            this.f7653c = true;
        }
        float f7 = f4 - this.f7651a;
        double d11 = j4 / 1000.0d;
        float f8 = this.f7657g;
        if (f8 > 1.0f) {
            double d12 = f7;
            double d13 = this.f7655e;
            double d14 = ((d13 * d12) - f5) / (d13 - this.f7654d);
            double d15 = d12 - d14;
            d4 = (Math.exp(this.f7654d * d11) * d14) + (Math.exp(d13 * d11) * d15);
            double d16 = this.f7655e;
            double exp = Math.exp(d16 * d11) * d15 * d16;
            double d17 = this.f7654d;
            cos = (Math.exp(d17 * d11) * d14 * d17) + exp;
        } else if (f8 == 1.0f) {
            double d18 = this.f7652b;
            double d19 = f7;
            double d20 = (d18 * d19) + f5;
            double d21 = (d20 * d11) + d19;
            d4 = Math.exp((-d18) * d11) * d21;
            double exp2 = Math.exp((-this.f7652b) * d11) * d21;
            double d22 = -this.f7652b;
            cos = (exp2 * d22) + (Math.exp(d22 * d11) * d20);
        } else {
            double d23 = 1 / this.f7656f;
            double d24 = this.f7652b;
            double d25 = f7;
            double d26 = ((f8 * d24 * d25) + f5) * d23;
            double exp3 = Math.exp((-f8) * d24 * d11) * ((Math.sin(this.f7656f * d11) * d26) + (Math.cos(this.f7656f * d11) * d25));
            double d27 = this.f7652b;
            double d28 = (-d27) * exp3 * this.f7657g;
            double exp4 = Math.exp((-r7) * d27 * d11);
            double d29 = this.f7656f;
            double sin = Math.sin(d29 * d11) * (-d29) * d25;
            double d30 = this.f7656f;
            cos = (((Math.cos(d30 * d11) * d26 * d30) + sin) * exp4) + d28;
            d4 = exp3;
        }
        return (Float.floatToRawIntBits((float) (d4 + this.f7651a)) << 32) | (Float.floatToRawIntBits((float) cos) & 4294967295L);
    }
}
