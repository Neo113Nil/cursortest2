package S;

import S.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    double f9224a;

    /* renamed from: b, reason: collision with root package name */
    double f9225b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9226c;

    /* renamed from: d, reason: collision with root package name */
    private double f9227d;

    /* renamed from: e, reason: collision with root package name */
    private double f9228e;

    /* renamed from: f, reason: collision with root package name */
    private double f9229f;

    /* renamed from: g, reason: collision with root package name */
    private double f9230g;

    /* renamed from: h, reason: collision with root package name */
    private double f9231h;

    /* renamed from: i, reason: collision with root package name */
    private double f9232i;

    /* renamed from: j, reason: collision with root package name */
    private final b.o f9233j;

    public e() {
        this.f9224a = Math.sqrt(1500.0d);
        this.f9225b = 0.5d;
        this.f9226c = false;
        this.f9232i = Double.MAX_VALUE;
        this.f9233j = new b.o();
    }

    private void b() {
        if (this.f9226c) {
            return;
        }
        if (this.f9232i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d4 = this.f9225b;
        if (d4 > 1.0d) {
            double d5 = this.f9224a;
            this.f9229f = ((-d4) * d5) + (d5 * Math.sqrt((d4 * d4) - 1.0d));
            double d6 = this.f9225b;
            double d7 = this.f9224a;
            this.f9230g = ((-d6) * d7) - (d7 * Math.sqrt((d6 * d6) - 1.0d));
        } else if (d4 >= 0.0d && d4 < 1.0d) {
            this.f9231h = this.f9224a * Math.sqrt(1.0d - (d4 * d4));
        }
        this.f9226c = true;
    }

    public float a() {
        return (float) this.f9232i;
    }

    public boolean c(float f4, float f5) {
        return ((double) Math.abs(f5)) < this.f9228e && ((double) Math.abs(f4 - a())) < this.f9227d;
    }

    public e d(float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f9225b = f4;
        this.f9226c = false;
        return this;
    }

    public e e(float f4) {
        this.f9232i = f4;
        return this;
    }

    public e f(float f4) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f9224a = Math.sqrt(f4);
        this.f9226c = false;
        return this;
    }

    void g(double d4) {
        double abs = Math.abs(d4);
        this.f9227d = abs;
        this.f9228e = abs * 62.5d;
    }

    b.o h(double d4, double d5, long j4) {
        double pow;
        double cos;
        b();
        double d6 = j4 / 1000.0d;
        double d7 = d4 - this.f9232i;
        double d8 = this.f9225b;
        if (d8 > 1.0d) {
            double d9 = this.f9230g;
            double d10 = this.f9229f;
            double d11 = d7 - (((d9 * d7) - d5) / (d9 - d10));
            double d12 = ((d7 * d9) - d5) / (d9 - d10);
            pow = (Math.pow(2.718281828459045d, d9 * d6) * d11) + (Math.pow(2.718281828459045d, this.f9229f * d6) * d12);
            double d13 = this.f9230g;
            double pow2 = d11 * d13 * Math.pow(2.718281828459045d, d13 * d6);
            double d14 = this.f9229f;
            cos = pow2 + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d6));
        } else if (d8 == 1.0d) {
            double d15 = this.f9224a;
            double d16 = d5 + (d15 * d7);
            double d17 = d7 + (d16 * d6);
            pow = Math.pow(2.718281828459045d, (-d15) * d6) * d17;
            double pow3 = d17 * Math.pow(2.718281828459045d, (-this.f9224a) * d6);
            double d18 = this.f9224a;
            cos = (d16 * Math.pow(2.718281828459045d, (-d18) * d6)) + (pow3 * (-d18));
        } else {
            double d19 = 1.0d / this.f9231h;
            double d20 = this.f9224a;
            double d21 = d19 * ((d8 * d20 * d7) + d5);
            pow = Math.pow(2.718281828459045d, (-d8) * d20 * d6) * ((Math.cos(this.f9231h * d6) * d7) + (Math.sin(this.f9231h * d6) * d21));
            double d22 = this.f9224a;
            double d23 = this.f9225b;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d6);
            double d24 = this.f9231h;
            double sin = (-d24) * d7 * Math.sin(d24 * d6);
            double d25 = this.f9231h;
            cos = ((-d22) * pow * d23) + (pow4 * (sin + (d21 * d25 * Math.cos(d25 * d6))));
        }
        b.o oVar = this.f9233j;
        oVar.f9219a = (float) (pow + this.f9232i);
        oVar.f9220b = (float) cos;
        return oVar;
    }

    public e(float f4) {
        this.f9224a = Math.sqrt(1500.0d);
        this.f9225b = 0.5d;
        this.f9226c = false;
        this.f9232i = Double.MAX_VALUE;
        this.f9233j = new b.o();
        this.f9232i = f4;
    }
}
