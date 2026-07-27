package l;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757B implements InterfaceC0756A {

    /* renamed from: a, reason: collision with root package name */
    public final float f7553a;

    /* renamed from: b, reason: collision with root package name */
    public final W f7554b;

    public C0757B(float f4, float f5, float f6) {
        this.f7553a = f6;
        W w4 = new W();
        w4.f7651a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        w4.f7652b = sqrt;
        w4.f7657g = 1.0f;
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        w4.f7657g = f4;
        w4.f7653c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        w4.f7652b = Math.sqrt(f5);
        w4.f7653c = false;
        this.f7554b = w4;
    }

    @Override // l.InterfaceC0756A
    public final float b(long j4, float f4, float f5, float f6) {
        W w4 = this.f7554b;
        w4.f7651a = f5;
        return Float.intBitsToFloat((int) (w4.a(f4, f6, j4 / 1000000) >> 32));
    }

    @Override // l.InterfaceC0756A
    public final float c(long j4, float f4, float f5, float f6) {
        W w4 = this.f7554b;
        w4.f7651a = f5;
        return Float.intBitsToFloat((int) (w4.a(f4, f6, j4 / 1000000) & 4294967295L));
    }

    @Override // l.InterfaceC0756A
    public final long d(float f4, float f5, float f6) {
        double d4;
        C0794u c0794u;
        C0794u c0794u2;
        C0794u c0794u3;
        double d5;
        double d6;
        long j4;
        double d7;
        double d8;
        double d9;
        long j5;
        W w4 = this.f7554b;
        double d10 = w4.f7652b;
        float f7 = (float) (d10 * d10);
        float f8 = w4.f7657g;
        float f9 = this.f7553a;
        float f10 = (f4 - f5) / f9;
        float f11 = f6 / f9;
        if (f8 == 0.0f) {
            j5 = 9223372036854L;
        } else {
            double d11 = f7;
            double d12 = f8;
            double d13 = f11;
            double d14 = f10;
            double d15 = 1.0f;
            double sqrt = d12 * 2.0d * Math.sqrt(d11);
            double d16 = (sqrt * sqrt) - (d11 * 4.0d);
            double d17 = -sqrt;
            if (d16 < 0.0d) {
                d4 = d15;
                c0794u = new C0794u(0.0d, Math.sqrt(Math.abs(d16)));
            } else {
                d4 = d15;
                c0794u = new C0794u(Math.sqrt(d16), 0.0d);
            }
            c0794u.f7842a = (c0794u.f7842a + d17) * 0.5d;
            c0794u.f7843b *= 0.5d;
            if (d16 < 0.0d) {
                c0794u2 = c0794u;
                c0794u3 = new C0794u(0.0d, Math.sqrt(Math.abs(d16)));
            } else {
                c0794u2 = c0794u;
                c0794u3 = new C0794u(Math.sqrt(d16), 0.0d);
            }
            double d18 = -1;
            double d19 = c0794u3.f7842a * d18;
            double d20 = c0794u3.f7843b * d18;
            c0794u3.f7842a = (d19 + d17) * 0.5d;
            c0794u3.f7843b = d20 * 0.5d;
            if (d14 == 0.0d && d13 == 0.0d) {
                j4 = 0;
            } else {
                if (d14 < 0.0d) {
                    d13 = -d13;
                }
                double abs = Math.abs(d14);
                if (d12 > 1.0d) {
                    double d21 = c0794u2.f7842a;
                    double d22 = c0794u3.f7842a;
                    double d23 = (d21 * abs) - d13;
                    double d24 = d21 - d22;
                    double d25 = d23 / d24;
                    double d26 = abs - d25;
                    double log = Math.log(Math.abs(d4 / d26)) / d21;
                    double log2 = Math.log(Math.abs(d4 / d25)) / d22;
                    if (Double.isInfinite(log) || Double.isNaN(log)) {
                        log = log2;
                    } else if (!Double.isInfinite(log2) && !Double.isNaN(log2)) {
                        log = Math.max(log, log2);
                    }
                    double d27 = d26 * d21;
                    double d28 = log;
                    double log3 = Math.log(d27 / ((-d25) * d22)) / (d22 - d21);
                    if (Double.isNaN(log3) || log3 <= 0.0d) {
                        double d29 = d4;
                        d7 = d26;
                        d8 = -d29;
                        d6 = d28;
                    } else {
                        if (log3 > 0.0d) {
                            if ((-((Math.exp(log3 * d22) * d25) + (Math.exp(d21 * log3) * d26))) < d4) {
                                if (d25 <= 0.0d || d26 >= 0.0d) {
                                    d6 = d28;
                                    d9 = d4;
                                } else {
                                    d9 = d4;
                                    d6 = 0.0d;
                                }
                                d8 = -d9;
                                d7 = d26;
                            }
                        }
                        d8 = d4;
                        d7 = d26;
                        d6 = Math.log((-((d25 * d22) * d22)) / (d27 * d21)) / d24;
                    }
                    double d30 = d25 * d22;
                    if (Math.abs((Math.exp(d22 * d6) * d30) + (Math.exp(d21 * d6) * d27)) >= 1.0E-4d) {
                        int i2 = 0;
                        double d31 = Double.MAX_VALUE;
                        for (double d32 = 0.001d; d31 > d32 && i2 < 100; d32 = 0.001d) {
                            i2++;
                            double d33 = d21 * d6;
                            double d34 = d22 * d6;
                            double exp = d6 - ((((Math.exp(d34) * d25) + (Math.exp(d33) * d7)) + d8) / ((Math.exp(d34) * d30) + (Math.exp(d33) * d27)));
                            d31 = Math.abs(d6 - exp);
                            d6 = exp;
                        }
                    }
                } else {
                    C0794u c0794u4 = c0794u2;
                    double d35 = d4;
                    if (d12 < 1.0d) {
                        double d36 = c0794u4.f7842a;
                        double d37 = (d13 - (d36 * abs)) / c0794u4.f7843b;
                        d6 = Math.log(d35 / Math.sqrt((d37 * d37) + (abs * abs))) / d36;
                    } else {
                        double d38 = c0794u4.f7842a;
                        double d39 = d38 * abs;
                        double d40 = d13 - d39;
                        double log4 = Math.log(Math.abs(d35 / abs)) / d38;
                        double log5 = Math.log(Math.abs(d35 / d40));
                        double d41 = log5;
                        for (int i4 = 0; i4 < 6; i4++) {
                            d41 = log5 - Math.log(Math.abs(d41 / d38));
                        }
                        double d42 = d41 / d38;
                        if (Double.isInfinite(log4) || Double.isNaN(log4)) {
                            log4 = d42;
                        } else if (!Double.isInfinite(d42) && !Double.isNaN(d42)) {
                            log4 = Math.max(log4, d42);
                        }
                        double d43 = (-(d39 + d40)) / (d38 * d40);
                        double d44 = d38 * d43;
                        double d45 = log4;
                        double exp2 = (Math.exp(d44) * d40 * d43) + (Math.exp(d44) * abs);
                        if (Double.isNaN(d43) || d43 <= 0.0d) {
                            d35 = -d35;
                            d5 = d45;
                        } else if (d43 <= 0.0d || (-exp2) >= d35) {
                            d5 = (-(2.0d / d38)) - (abs / d40);
                        } else {
                            d35 = -d35;
                            d5 = (d40 >= 0.0d || abs <= 0.0d) ? d45 : 0.0d;
                        }
                        d6 = d5;
                        int i5 = 0;
                        double d46 = Double.MAX_VALUE;
                        while (d46 > 0.001d && i5 < 100) {
                            i5++;
                            double d47 = d38 * d6;
                            double exp3 = d6 - (((Math.exp(d47) * ((d40 * d6) + abs)) + d35) / (Math.exp(d47) * (((d47 + 1) * d40) + d39)));
                            d46 = Math.abs(d6 - exp3);
                            d6 = exp3;
                        }
                    }
                }
                j4 = (long) (1000.0d * d6);
            }
            j5 = j4;
        }
        return j5 * 1000000;
    }

    @Override // l.InterfaceC0756A
    public final float f(float f4, float f5, float f6) {
        return 0.0f;
    }
}
