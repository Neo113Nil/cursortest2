package c4;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public double f1643a;

    /* renamed from: b, reason: collision with root package name */
    public double f1644b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1645c;

    /* renamed from: d, reason: collision with root package name */
    public double f1646d;

    /* renamed from: e, reason: collision with root package name */
    public double f1647e;

    /* renamed from: f, reason: collision with root package name */
    public double f1648f;

    /* renamed from: g, reason: collision with root package name */
    public double f1649g;

    /* renamed from: h, reason: collision with root package name */
    public double f1650h;
    public double i;

    /* renamed from: j, reason: collision with root package name */
    public final e f1651j;

    public g() {
        this.f1643a = Math.sqrt(1500.0d);
        this.f1644b = 0.5d;
        this.f1645c = false;
        this.i = Double.MAX_VALUE;
        this.f1651j = new e();
    }

    public final e a(double d8, double d9, long j7) {
        double sin;
        double cos;
        if (!this.f1645c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d10 = this.f1644b;
            if (d10 > 1.0d) {
                double d11 = this.f1643a;
                this.f1648f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                double d12 = this.f1644b;
                double d13 = this.f1643a;
                this.f1649g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.f1650h = Math.sqrt(1.0d - (d10 * d10)) * this.f1643a;
            }
            this.f1645c = true;
        }
        double d14 = j7 / 1000.0d;
        double d15 = d8 - this.i;
        double d16 = this.f1644b;
        if (d16 > 1.0d) {
            double d17 = this.f1649g;
            double d18 = ((d17 * d15) - d9) / (d17 - this.f1648f);
            double d19 = d15 - d18;
            sin = (Math.pow(2.718281828459045d, this.f1648f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f1649g;
            double pow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f1648f;
            cos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + pow;
        } else if (d16 == 1.0d) {
            double d22 = this.f1643a;
            double d23 = (d22 * d15) + d9;
            double d24 = (d23 * d14) + d15;
            double pow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double pow3 = Math.pow(2.718281828459045d, (-this.f1643a) * d14) * d24;
            double d25 = -this.f1643a;
            cos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (pow3 * d25);
            sin = pow2;
        } else {
            double d26 = 1.0d / this.f1650h;
            double d27 = this.f1643a;
            double d28 = ((d16 * d27 * d15) + d9) * d26;
            sin = ((Math.sin(this.f1650h * d14) * d28) + (Math.cos(this.f1650h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f1643a;
            double d30 = this.f1644b;
            double d31 = (-d29) * sin * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.f1650h;
            double sin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.f1650h;
            cos = (((Math.cos(d33 * d14) * d28 * d33) + sin2) * pow4) + d31;
        }
        float f6 = (float) (sin + this.i);
        e eVar = this.f1651j;
        eVar.f1624a = f6;
        eVar.f1625b = (float) cos;
        return eVar;
    }

    public g(float f6) {
        this.f1643a = Math.sqrt(1500.0d);
        this.f1644b = 0.5d;
        this.f1645c = false;
        this.f1651j = new e();
        this.i = f6;
    }
}
