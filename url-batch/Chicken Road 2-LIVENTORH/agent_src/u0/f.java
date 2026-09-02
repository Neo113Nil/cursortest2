package u0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f3340a;

    /* renamed from: b, reason: collision with root package name */
    public double f3341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3342c;
    public double d;

    /* renamed from: e, reason: collision with root package name */
    public double f3343e;

    /* renamed from: f, reason: collision with root package name */
    public double f3344f;

    /* renamed from: g, reason: collision with root package name */
    public double f3345g;

    /* renamed from: h, reason: collision with root package name */
    public double f3346h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final d f3347j;

    public f() {
        this.f3340a = Math.sqrt(1500.0d);
        this.f3341b = 0.5d;
        this.f3342c = false;
        this.i = Double.MAX_VALUE;
        this.f3347j = new d();
    }

    public final d a(double d, double d3, long j4) {
        double sin;
        double cos;
        if (!this.f3342c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d4 = this.f3341b;
            if (d4 > 1.0d) {
                double d5 = this.f3340a;
                this.f3344f = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                double d6 = this.f3341b;
                double d7 = this.f3340a;
                this.f3345g = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
            } else if (d4 >= 0.0d && d4 < 1.0d) {
                this.f3346h = Math.sqrt(1.0d - (d4 * d4)) * this.f3340a;
            }
            this.f3342c = true;
        }
        double d8 = j4 / 1000.0d;
        double d9 = d - this.i;
        double d10 = this.f3341b;
        if (d10 > 1.0d) {
            double d11 = this.f3345g;
            double d12 = ((d11 * d9) - d3) / (d11 - this.f3344f);
            double d13 = d9 - d12;
            sin = (Math.pow(2.718281828459045d, this.f3344f * d8) * d12) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d14 = this.f3345g;
            double pow = Math.pow(2.718281828459045d, d14 * d8) * d13 * d14;
            double d15 = this.f3344f;
            cos = (Math.pow(2.718281828459045d, d15 * d8) * d12 * d15) + pow;
        } else if (d10 == 1.0d) {
            double d16 = this.f3340a;
            double d17 = (d16 * d9) + d3;
            double d18 = (d17 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d16) * d8) * d18;
            double pow3 = Math.pow(2.718281828459045d, (-this.f3340a) * d8) * d18;
            double d19 = -this.f3340a;
            cos = (Math.pow(2.718281828459045d, d19 * d8) * d17) + (pow3 * d19);
            sin = pow2;
        } else {
            double d20 = 1.0d / this.f3346h;
            double d21 = this.f3340a;
            double d22 = ((d10 * d21 * d9) + d3) * d20;
            sin = ((Math.sin(this.f3346h * d8) * d22) + (Math.cos(this.f3346h * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d21 * d8);
            double d23 = this.f3340a;
            double d24 = this.f3341b;
            double d25 = (-d23) * sin * d24;
            double pow4 = Math.pow(2.718281828459045d, (-d24) * d23 * d8);
            double d26 = this.f3346h;
            double sin2 = Math.sin(d26 * d8) * (-d26) * d9;
            double d27 = this.f3346h;
            cos = (((Math.cos(d27 * d8) * d22 * d27) + sin2) * pow4) + d25;
        }
        float f2 = (float) (sin + this.i);
        d dVar = this.f3347j;
        dVar.f3322a = f2;
        dVar.f3323b = (float) cos;
        return dVar;
    }

    public f(float f2) {
        this.f3340a = Math.sqrt(1500.0d);
        this.f3341b = 0.5d;
        this.f3342c = false;
        this.f3347j = new d();
        this.i = f2;
    }
}
