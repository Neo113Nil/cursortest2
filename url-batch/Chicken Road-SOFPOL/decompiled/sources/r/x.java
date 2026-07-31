package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final float f6451a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f6452b;

    public x(float f6, float f8, float f9) {
        this.f6451a = f9;
        t0 t0Var = new t0();
        t0Var.f6434a = 1.0f;
        t0Var.f6435b = Math.sqrt(50.0d);
        t0Var.f6436c = 1.0f;
        if (f6 < 0.0f) {
            i0.a("Damping ratio must be non-negative");
        }
        t0Var.f6436c = f6;
        double d8 = t0Var.f6435b;
        if (((float) (d8 * d8)) <= 0.0f) {
            i0.a("Spring stiffness constant must be positive.");
        }
        t0Var.f6435b = Math.sqrt(f8);
        this.f6452b = t0Var;
    }

    @Override // r.w
    public final float b(long j7, float f6, float f8, float f9) {
        t0 t0Var = this.f6452b;
        t0Var.f6434a = f8;
        return Float.intBitsToFloat((int) (t0Var.a(f6, f9, j7 / 1000000) >> 32));
    }

    @Override // r.w
    public final float c(long j7, float f6, float f8, float f9) {
        t0 t0Var = this.f6452b;
        t0Var.f6434a = f8;
        return Float.intBitsToFloat((int) (t0Var.a(f6, f9, j7 / 1000000) & 4294967295L));
    }

    @Override // r.w
    public final long d(float f6, float f8, float f9) {
        double d8;
        int i;
        long j7;
        t0 t0Var = this.f6452b;
        double d9 = t0Var.f6435b;
        float f10 = (float) (d9 * d9);
        float f11 = t0Var.f6436c;
        float f12 = this.f6451a;
        float f13 = (f6 - f8) / f12;
        float f14 = f9 / f12;
        if (f11 == 0.0f) {
            j7 = 9223372036854L;
        } else {
            double d10 = f10;
            double d11 = f11;
            double d12 = f14;
            double d13 = f13;
            double d14 = 1.0f;
            double sqrt = d11 * 2.0d * Math.sqrt(d10);
            double d15 = (sqrt * sqrt) - (d10 * 4.0d);
            double sqrt2 = d15 < 0.0d ? 0.0d : Math.sqrt(d15);
            double d16 = -sqrt;
            double d17 = (d16 + sqrt2) * 0.5d;
            double sqrt3 = (d15 < 0.0d ? Math.sqrt(Math.abs(d15)) : 0.0d) * 0.5d;
            double d18 = (d16 - sqrt2) * 0.5d;
            if (d13 == 0.0d && d12 == 0.0d) {
                j7 = 0;
            } else {
                if (d13 < 0.0d) {
                    d12 = -d12;
                }
                double abs = Math.abs(d13);
                double d19 = Double.MAX_VALUE;
                if (d11 > 1.0d) {
                    double d20 = (d17 * abs) - d12;
                    double d21 = d17 - d18;
                    double d22 = d20 / d21;
                    double d23 = abs - d22;
                    d8 = Math.log(Math.abs(d14 / d23)) / d17;
                    double log = Math.log(Math.abs(d14 / d22)) / d18;
                    if ((Double.doubleToRawLongBits(d8) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d8 = log;
                    } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d8 = Math.max(d8, log);
                    }
                    double d24 = d23 * d17;
                    double log2 = Math.log(d24 / ((-d22) * d18)) / (d18 - d17);
                    if (Double.isNaN(log2) || log2 <= 0.0d) {
                        d14 = -d14;
                    } else {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d18) * d22) + (Math.exp(d17 * log2) * d23))) < d14) {
                                d14 = -d14;
                                d8 = (d22 <= 0.0d || d23 >= 0.0d) ? d8 : 0.0d;
                            }
                        }
                        d8 = Math.log((-((d22 * d18) * d18)) / (d24 * d17)) / d21;
                    }
                    double d25 = d22 * d18;
                    if (Math.abs((Math.exp(d18 * d8) * d25) + (Math.exp(d17 * d8) * d24)) >= 1.0E-4d) {
                        int i8 = 0;
                        while (d19 > 0.001d && i8 < 100) {
                            i8++;
                            double d26 = d17 * d8;
                            double d27 = d18 * d8;
                            double exp = d8 - ((((Math.exp(d27) * d22) + (Math.exp(d26) * d23)) + d14) / ((Math.exp(d27) * d25) + (Math.exp(d26) * d24)));
                            d19 = Math.abs(d8 - exp);
                            d8 = exp;
                        }
                    }
                } else if (d11 < 1.0d) {
                    double d28 = (d12 - (d17 * abs)) / sqrt3;
                    d8 = Math.log(d14 / Math.sqrt((d28 * d28) + (abs * abs))) / d17;
                } else {
                    double d29 = d17 * abs;
                    double d30 = d12 - d29;
                    double log3 = Math.log(Math.abs(d14 / abs)) / d17;
                    double log4 = Math.log(Math.abs(d14 / d30));
                    double d31 = log4;
                    for (int i9 = 0; i9 < 6; i9++) {
                        d31 = log4 - Math.log(Math.abs(d31 / d17));
                    }
                    double d32 = d31 / d17;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d32;
                    } else if ((Double.doubleToRawLongBits(d32) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = Math.max(log3, d32);
                    }
                    double d33 = (-(d29 + d30)) / (d17 * d30);
                    double d34 = d17 * d33;
                    double exp2 = (Math.exp(d34) * d30 * d33) + (Math.exp(d34) * abs);
                    if (!Double.isNaN(d33) && d33 > 0.0d) {
                        if (d33 <= 0.0d || (-exp2) >= d14) {
                            log3 = (-(2.0d / d17)) - (abs / d30);
                            d8 = log3;
                            i = 0;
                            while (d19 > 0.001d && i < 100) {
                                i++;
                                double d35 = d17 * d8;
                                double exp3 = d8 - (((Math.exp(d35) * ((d30 * d8) + abs)) + d14) / (Math.exp(d35) * (((1 + d35) * d30) + d29)));
                                d19 = Math.abs(d8 - exp3);
                                d8 = exp3;
                            }
                        } else if (d30 < 0.0d && abs > 0.0d) {
                            log3 = 0.0d;
                        }
                    }
                    d14 = -d14;
                    d8 = log3;
                    i = 0;
                    while (d19 > 0.001d) {
                        i++;
                        double d352 = d17 * d8;
                        double exp32 = d8 - (((Math.exp(d352) * ((d30 * d8) + abs)) + d14) / (Math.exp(d352) * (((1 + d352) * d30) + d29)));
                        d19 = Math.abs(d8 - exp32);
                        d8 = exp32;
                    }
                }
                j7 = (long) (d8 * 1000.0d);
            }
        }
        return j7 * 1000000;
    }

    @Override // r.w
    public final float e(float f6, float f8, float f9) {
        return 0.0f;
    }
}
