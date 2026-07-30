package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public float f5735a;

    /* renamed from: b, reason: collision with root package name */
    public double f5736b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5737c;

    /* renamed from: d, reason: collision with root package name */
    public double f5738d;

    /* renamed from: e, reason: collision with root package name */
    public double f5739e;

    /* renamed from: f, reason: collision with root package name */
    public double f5740f;

    /* renamed from: g, reason: collision with root package name */
    public float f5741g;

    public final long a(float f9, float f10, long j8) {
        double cos;
        double d8;
        if (!this.f5737c) {
            if (this.f5735a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f11 = this.f5741g;
            double d9 = f11;
            double d10 = d9 * d9;
            if (f11 > 1.0f) {
                double d11 = this.f5736b;
                double d12 = d10 - 1;
                this.f5738d = (Math.sqrt(d12) * d11) + ((-f11) * d11);
                double d13 = -this.f5741g;
                double d14 = this.f5736b;
                this.f5739e = (d13 * d14) - (Math.sqrt(d12) * d14);
            } else if (f11 >= 0.0f && f11 < 1.0f) {
                this.f5740f = Math.sqrt(1 - d10) * this.f5736b;
            }
            this.f5737c = true;
        }
        float f12 = f9 - this.f5735a;
        double d15 = j8 / 1000.0d;
        float f13 = this.f5741g;
        if (f13 > 1.0f) {
            double d16 = f12;
            double d17 = this.f5739e;
            double d18 = ((d17 * d16) - f10) / (d17 - this.f5738d);
            double d19 = d16 - d18;
            d8 = (Math.exp(this.f5738d * d15) * d18) + (Math.exp(d17 * d15) * d19);
            double d20 = this.f5739e;
            double exp = Math.exp(d20 * d15) * d19 * d20;
            double d21 = this.f5738d;
            cos = (Math.exp(d21 * d15) * d18 * d21) + exp;
        } else if (f13 == 1.0f) {
            double d22 = this.f5736b;
            double d23 = f12;
            double d24 = (d22 * d23) + f10;
            double d25 = (d24 * d15) + d23;
            d8 = Math.exp((-d22) * d15) * d25;
            double exp2 = Math.exp((-this.f5736b) * d15) * d25;
            double d26 = -this.f5736b;
            cos = (exp2 * d26) + (Math.exp(d26 * d15) * d24);
        } else {
            double d27 = 1 / this.f5740f;
            double d28 = this.f5736b;
            double d29 = f12;
            double d30 = ((f13 * d28 * d29) + f10) * d27;
            double exp3 = Math.exp((-f13) * d28 * d15) * ((Math.sin(this.f5740f * d15) * d30) + (Math.cos(this.f5740f * d15) * d29));
            double d31 = this.f5736b;
            double d32 = (-d31) * exp3 * this.f5741g;
            double exp4 = Math.exp((-r7) * d31 * d15);
            double d33 = this.f5740f;
            double sin = Math.sin(d33 * d15) * (-d33) * d29;
            double d34 = this.f5740f;
            cos = (((Math.cos(d34 * d15) * d30 * d34) + sin) * exp4) + d32;
            d8 = exp3;
        }
        return (Float.floatToRawIntBits((float) (d8 + this.f5735a)) << 32) | (Float.floatToRawIntBits((float) cos) & 4294967295L);
    }
}
