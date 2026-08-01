package v0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f3717a;

    /* renamed from: b, reason: collision with root package name */
    public double f3718b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3719c;
    public double d;

    /* renamed from: e, reason: collision with root package name */
    public double f3720e;

    /* renamed from: f, reason: collision with root package name */
    public double f3721f;

    /* renamed from: g, reason: collision with root package name */
    public double f3722g;
    public double h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final d f3723j;

    public f() {
        this.f3717a = Math.sqrt(1500.0d);
        this.f3718b = 0.5d;
        this.f3719c = false;
        this.i = Double.MAX_VALUE;
        this.f3723j = new d();
    }

    public final d a(double d, double d5, long j2) {
        double sin;
        double cos;
        if (!this.f3719c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d6 = this.f3718b;
            if (d6 > 1.0d) {
                double d7 = this.f3717a;
                this.f3721f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
                double d8 = this.f3718b;
                double d9 = this.f3717a;
                this.f3722g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
            } else if (d6 >= 0.0d && d6 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d6 * d6)) * this.f3717a;
            }
            this.f3719c = true;
        }
        double d10 = j2 / 1000.0d;
        double d11 = d - this.i;
        double d12 = this.f3718b;
        if (d12 > 1.0d) {
            double d13 = this.f3722g;
            double d14 = ((d13 * d11) - d5) / (d13 - this.f3721f);
            double d15 = d11 - d14;
            sin = (Math.pow(2.718281828459045d, this.f3721f * d10) * d14) + (Math.pow(2.718281828459045d, d13 * d10) * d15);
            double d16 = this.f3722g;
            double pow = Math.pow(2.718281828459045d, d16 * d10) * d15 * d16;
            double d17 = this.f3721f;
            cos = (Math.pow(2.718281828459045d, d17 * d10) * d14 * d17) + pow;
        } else if (d12 == 1.0d) {
            double d18 = this.f3717a;
            double d19 = (d18 * d11) + d5;
            double d20 = (d19 * d10) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d10) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.f3717a) * d10) * d20;
            double d21 = -this.f3717a;
            cos = (Math.pow(2.718281828459045d, d21 * d10) * d19) + (pow3 * d21);
            sin = pow2;
        } else {
            double d22 = 1.0d / this.h;
            double d23 = this.f3717a;
            double d24 = ((d12 * d23 * d11) + d5) * d22;
            sin = ((Math.sin(this.h * d10) * d24) + (Math.cos(this.h * d10) * d11)) * Math.pow(2.718281828459045d, (-d12) * d23 * d10);
            double d25 = this.f3717a;
            double d26 = this.f3718b;
            double d27 = (-d25) * sin * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d10);
            double d28 = this.h;
            double sin2 = Math.sin(d28 * d10) * (-d28) * d11;
            double d29 = this.h;
            cos = (((Math.cos(d29 * d10) * d24 * d29) + sin2) * pow4) + d27;
        }
        float f5 = (float) (sin + this.i);
        d dVar = this.f3723j;
        dVar.f3700a = f5;
        dVar.f3701b = (float) cos;
        return dVar;
    }

    public f(float f5) {
        this.f3717a = Math.sqrt(1500.0d);
        this.f3718b = 0.5d;
        this.f3719c = false;
        this.f3723j = new d();
        this.i = f5;
    }
}
