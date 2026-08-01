package r0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public double f3167a;

    /* renamed from: b, reason: collision with root package name */
    public double f3168b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public double f3169d;

    /* renamed from: e, reason: collision with root package name */
    public double f3170e;

    /* renamed from: f, reason: collision with root package name */
    public double f3171f;
    public double g;
    public double h;

    /* renamed from: i, reason: collision with root package name */
    public double f3172i;

    /* renamed from: j, reason: collision with root package name */
    public final f f3173j;

    public h() {
        this.f3167a = Math.sqrt(1500.0d);
        this.f3168b = 0.5d;
        this.c = false;
        this.f3172i = Double.MAX_VALUE;
        this.f3173j = new f();
    }

    public final f a(double d4, double d5, long j4) {
        double sin;
        double cos;
        if (!this.c) {
            if (this.f3172i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d6 = this.f3168b;
            if (d6 > 1.0d) {
                double d7 = this.f3167a;
                this.f3171f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
                double d8 = this.f3168b;
                double d9 = this.f3167a;
                this.g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
            } else if (d6 >= 0.0d && d6 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d6 * d6)) * this.f3167a;
            }
            this.c = true;
        }
        double d10 = j4 / 1000.0d;
        double d11 = d4 - this.f3172i;
        double d12 = this.f3168b;
        if (d12 > 1.0d) {
            double d13 = this.g;
            double d14 = ((d13 * d11) - d5) / (d13 - this.f3171f);
            double d15 = d11 - d14;
            sin = (Math.pow(2.718281828459045d, this.f3171f * d10) * d14) + (Math.pow(2.718281828459045d, d13 * d10) * d15);
            double d16 = this.g;
            double pow = Math.pow(2.718281828459045d, d16 * d10) * d15 * d16;
            double d17 = this.f3171f;
            cos = (Math.pow(2.718281828459045d, d17 * d10) * d14 * d17) + pow;
        } else if (d12 == 1.0d) {
            double d18 = this.f3167a;
            double d19 = (d18 * d11) + d5;
            double d20 = (d19 * d10) + d11;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d10) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.f3167a) * d10) * d20;
            double d21 = -this.f3167a;
            cos = (Math.pow(2.718281828459045d, d21 * d10) * d19) + (pow3 * d21);
            sin = pow2;
        } else {
            double d22 = 1.0d / this.h;
            double d23 = this.f3167a;
            double d24 = ((d12 * d23 * d11) + d5) * d22;
            sin = ((Math.sin(this.h * d10) * d24) + (Math.cos(this.h * d10) * d11)) * Math.pow(2.718281828459045d, (-d12) * d23 * d10);
            double d25 = this.f3167a;
            double d26 = this.f3168b;
            double d27 = (-d25) * sin * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d10);
            double d28 = this.h;
            double sin2 = Math.sin(d28 * d10) * (-d28) * d11;
            double d29 = this.h;
            cos = (((Math.cos(d29 * d10) * d24 * d29) + sin2) * pow4) + d27;
        }
        float f4 = (float) (sin + this.f3172i);
        f fVar = this.f3173j;
        fVar.f3150a = f4;
        fVar.f3151b = (float) cos;
        return fVar;
    }

    public h(float f4) {
        this.f3167a = Math.sqrt(1500.0d);
        this.f3168b = 0.5d;
        this.c = false;
        this.f3173j = new f();
        this.f3172i = f4;
    }
}
