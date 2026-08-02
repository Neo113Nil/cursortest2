package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acu {
    public double a;
    public double b;
    public double c;
    public double d;
    private boolean e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final aco j;

    public acu(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new aco();
        this.i = f;
    }

    public final float a() {
        return (float) this.i;
    }

    final aco b(double d, double d2, long j) {
        double cos;
        double d3;
        if (!this.e) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d4 = this.b;
            if (d4 > 1.0d) {
                double d5 = this.a;
                this.f = ((-d4) * d5) + (d5 * Math.sqrt((d4 * d4) - 1.0d));
                double d6 = this.b;
                double d7 = this.a;
                this.g = ((-d6) * d7) - (d7 * Math.sqrt((d6 * d6) - 1.0d));
            } else if (d4 >= 0.0d && d4 < 1.0d) {
                this.h = this.a * Math.sqrt(1.0d - (d4 * d4));
            }
            this.e = true;
        }
        double d8 = d - this.i;
        double d9 = this.b;
        double d10 = j / 1000.0d;
        if (d9 > 1.0d) {
            double d11 = this.g;
            double d12 = ((d11 * d8) - d2) / (d11 - this.f);
            double d13 = d8 - d12;
            double pow = Math.pow(2.718281828459045d, d11 * d10) * d13;
            double pow2 = Math.pow(2.718281828459045d, this.f * d10) * d12;
            double d14 = this.g;
            double pow3 = d13 * d14 * Math.pow(2.718281828459045d, d14 * d10);
            double d15 = this.f;
            cos = pow3 + (d12 * d15 * Math.pow(2.718281828459045d, d15 * d10));
            d3 = pow + pow2;
        } else if (d9 == 1.0d) {
            double d16 = this.a;
            double d17 = d2 + (d16 * d8);
            double d18 = d8 + (d17 * d10);
            d3 = Math.pow(2.718281828459045d, (-d16) * d10) * d18;
            double pow4 = d18 * Math.pow(2.718281828459045d, (-this.a) * d10);
            double d19 = -this.a;
            cos = (pow4 * d19) + (d17 * Math.pow(2.718281828459045d, d10 * d19));
        } else {
            double d20 = 1.0d / this.h;
            double d21 = this.a;
            double d22 = d20 * ((d9 * d21 * d8) + d2);
            double pow5 = Math.pow(2.718281828459045d, (-d9) * d21 * d10) * ((Math.cos(this.h * d10) * d8) + (Math.sin(this.h * d10) * d22));
            double d23 = this.a;
            double d24 = this.b;
            double d25 = (-d23) * pow5 * d24;
            double pow6 = Math.pow(2.718281828459045d, (-d24) * d23 * d10);
            double d26 = this.h;
            double sin = (-d26) * d8 * Math.sin(d26 * d10);
            double d27 = this.h;
            cos = d25 + (pow6 * (sin + (d27 * d22 * Math.cos(d27 * d10))));
            d3 = pow5;
        }
        aco acoVar = this.j;
        acoVar.a = (float) (d3 + this.i);
        acoVar.b = (float) cos;
        return acoVar;
    }

    public final void c(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f;
        this.e = false;
    }

    public final void d(float f) {
        this.i = f;
    }

    public final void e(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.e = false;
    }

    public acu() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.e = false;
        this.i = Double.MAX_VALUE;
        this.j = new aco();
    }
}
