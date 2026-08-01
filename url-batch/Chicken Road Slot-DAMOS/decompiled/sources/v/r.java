package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final float f9870a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f9871b;

    public r(float f3, float f10) {
        this.f9870a = f10;
        i0 i0Var = new i0();
        i0Var.f9821a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        i0Var.f9822b = sqrt;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            y.a("Spring stiffness constant must be positive.");
        }
        i0Var.f9822b = Math.sqrt(f3);
        this.f9871b = i0Var;
    }

    @Override // v.q
    public final float b(long j, float f3, float f10, float f11) {
        i0 i0Var = this.f9871b;
        i0Var.f9821a = f10;
        return Float.intBitsToFloat((int) (i0Var.a(f3, f11, j / 1000000) >> 32));
    }

    @Override // v.q
    public final float c(long j, float f3, float f10, float f11) {
        i0 i0Var = this.f9871b;
        i0Var.f9821a = f10;
        return Float.intBitsToFloat((int) (i0Var.a(f3, f11, j / 1000000) & 4294967295L));
    }

    @Override // v.q
    public final long d(float f3, float f10, float f11) {
        double log;
        int i3;
        long j;
        double d10 = this.f9871b.f9822b;
        float f12 = this.f9870a;
        double d11 = (float) (d10 * d10);
        double d12 = 1.0f;
        double d13 = f11 / f12;
        double d14 = (f3 - f10) / f12;
        double sqrt = Math.sqrt(d11) * d12 * 2.0d;
        double d15 = (sqrt * sqrt) - (d11 * 4.0d);
        double sqrt2 = d15 < 0.0d ? 0.0d : Math.sqrt(d15);
        double d16 = -sqrt;
        double d17 = (d16 + sqrt2) * 0.5d;
        double sqrt3 = (d15 < 0.0d ? Math.sqrt(Math.abs(d15)) : 0.0d) * 0.5d;
        double d18 = (d16 - sqrt2) * 0.5d;
        if (d14 == 0.0d && d13 == 0.0d) {
            j = 0;
        } else {
            if (d14 < 0.0d) {
                d13 = -d13;
            }
            double abs = Math.abs(d14);
            double d19 = Double.MAX_VALUE;
            if (d12 > 1.0d) {
                double d20 = (d17 * abs) - d13;
                double d21 = d17 - d18;
                double d22 = d20 / d21;
                double d23 = abs - d22;
                log = Math.log(Math.abs(d12 / d23)) / d17;
                double log2 = Math.log(Math.abs(d12 / d22)) / d18;
                if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) >= 9218868437227405312L) {
                    log = log2;
                } else if ((Double.doubleToRawLongBits(log2) & Long.MAX_VALUE) < 9218868437227405312L) {
                    log = Math.max(log, log2);
                }
                double d24 = d23 * d17;
                double log3 = Math.log(d24 / ((-d22) * d18)) / (d18 - d17);
                if (Double.isNaN(log3) || log3 <= 0.0d) {
                    d12 = -d12;
                } else {
                    if (log3 > 0.0d) {
                        if ((-((Math.exp(log3 * d18) * d22) + (Math.exp(d17 * log3) * d23))) < d12) {
                            d12 = -d12;
                            log = (d22 <= 0.0d || d23 >= 0.0d) ? log : 0.0d;
                        }
                    }
                    log = Math.log((-((d22 * d18) * d18)) / (d24 * d17)) / d21;
                }
                double d25 = d22 * d18;
                if (Math.abs((Math.exp(d18 * log) * d25) + (Math.exp(d17 * log) * d24)) >= 1.0E-4d) {
                    int i10 = 0;
                    while (d19 > 0.001d && i10 < 100) {
                        i10++;
                        double d26 = d17 * log;
                        double d27 = d18 * log;
                        double exp = log - ((((Math.exp(d27) * d22) + (Math.exp(d26) * d23)) + d12) / ((Math.exp(d27) * d25) + (Math.exp(d26) * d24)));
                        d19 = Math.abs(log - exp);
                        log = exp;
                    }
                }
            } else if (d12 < 1.0d) {
                double d28 = (d13 - (d17 * abs)) / sqrt3;
                log = Math.log(d12 / Math.sqrt((d28 * d28) + (abs * abs))) / d17;
            } else {
                double d29 = d17 * abs;
                double d30 = d13 - d29;
                log = Math.log(Math.abs(d12 / abs)) / d17;
                double log4 = Math.log(Math.abs(d12 / d30));
                double d31 = log4;
                for (int i11 = 0; i11 < 6; i11++) {
                    d31 = log4 - Math.log(Math.abs(d31 / d17));
                }
                double d32 = d31 / d17;
                if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) >= 9218868437227405312L) {
                    log = d32;
                } else if ((Double.doubleToRawLongBits(d32) & Long.MAX_VALUE) < 9218868437227405312L) {
                    log = Math.max(log, d32);
                }
                double d33 = (-(d29 + d30)) / (d17 * d30);
                double d34 = d17 * d33;
                double exp2 = (Math.exp(d34) * d30 * d33) + (Math.exp(d34) * abs);
                if (!Double.isNaN(d33) && d33 > 0.0d) {
                    if (d33 <= 0.0d || (-exp2) >= d12) {
                        log = (-(2.0d / d17)) - (abs / d30);
                        i3 = 0;
                        while (d19 > 0.001d && i3 < 100) {
                            i3++;
                            double d35 = d17 * log;
                            double exp3 = log - (((Math.exp(d35) * ((d30 * log) + abs)) + d12) / (Math.exp(d35) * (((d35 + 1) * d30) + d29)));
                            d19 = Math.abs(log - exp3);
                            log = exp3;
                        }
                    } else if (d30 < 0.0d && abs > 0.0d) {
                        log = 0.0d;
                    }
                }
                d12 = -d12;
                i3 = 0;
                while (d19 > 0.001d) {
                    i3++;
                    double d352 = d17 * log;
                    double exp32 = log - (((Math.exp(d352) * ((d30 * log) + abs)) + d12) / (Math.exp(d352) * (((d352 + 1) * d30) + d29)));
                    d19 = Math.abs(log - exp32);
                    log = exp32;
                }
            }
            j = (long) (log * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // v.q
    public final float e(float f3, float f10, float f11) {
        return 0.0f;
    }
}
