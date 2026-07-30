package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5419a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f5420b;

    public c0(float f9, float f10, float f11) {
        this.f5419a = f11;
        z0 z0Var = new z0();
        z0Var.f5735a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        z0Var.f5736b = sqrt;
        z0Var.f5741g = 1.0f;
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        z0Var.f5741g = f9;
        z0Var.f5737c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        z0Var.f5736b = Math.sqrt(f10);
        z0Var.f5737c = false;
        this.f5420b = z0Var;
    }

    @Override // l.b0
    public final float b(long j8, float f9, float f10, float f11) {
        z0 z0Var = this.f5420b;
        z0Var.f5735a = f10;
        return Float.intBitsToFloat((int) (z0Var.a(f9, f11, j8 / 1000000) >> 32));
    }

    @Override // l.b0
    public final float c(long j8, float f9, float f10, float f11) {
        z0 z0Var = this.f5420b;
        z0Var.f5735a = f10;
        return Float.intBitsToFloat((int) (z0Var.a(f9, f11, j8 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    @Override // l.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f9, float f10, float f11) {
        double d8;
        double d9;
        t tVar;
        double d10;
        long j8;
        double d11;
        z0 z0Var = this.f5420b;
        double d12 = z0Var.f5736b;
        float f12 = (float) (d12 * d12);
        float f13 = z0Var.f5741g;
        float f14 = this.f5419a;
        float f15 = (f9 - f10) / f14;
        float f16 = f11 / f14;
        if (f13 == 0.0f) {
            j8 = 9223372036854L;
        } else {
            double d13 = f12;
            double d14 = f13;
            double d15 = f16;
            double d16 = f15;
            double d17 = 1.0f;
            double sqrt = d14 * 2.0d * Math.sqrt(d13);
            double d18 = (sqrt * sqrt) - (d13 * 4.0d);
            double d19 = -sqrt;
            if (d18 < 0.0d) {
                d9 = 2.0d;
                d8 = d14;
                tVar = new t(0.0d, Math.sqrt(Math.abs(d18)));
            } else {
                d8 = d14;
                d9 = 2.0d;
                tVar = new t(Math.sqrt(d18), 0.0d);
            }
            tVar.f5657a = (tVar.f5657a + d19) * 0.5d;
            tVar.f5658b *= 0.5d;
            t tVar2 = d18 < 0.0d ? new t(0.0d, Math.sqrt(Math.abs(d18))) : new t(Math.sqrt(d18), 0.0d);
            double d20 = -1;
            double d21 = tVar2.f5657a * d20;
            double d22 = tVar2.f5658b * d20;
            tVar2.f5657a = (d21 + d19) * 0.5d;
            tVar2.f5658b = d22 * 0.5d;
            if (d16 == 0.0d && d15 == 0.0d) {
                j8 = 0;
            } else {
                if (d16 < 0.0d) {
                    d15 = -d15;
                }
                double abs = Math.abs(d16);
                double d23 = Double.MAX_VALUE;
                if (d8 > 1.0d) {
                    double d24 = tVar.f5657a;
                    double d25 = tVar2.f5657a;
                    double d26 = (d24 * abs) - d15;
                    double d27 = d24 - d25;
                    double d28 = d26 / d27;
                    double d29 = abs - d28;
                    d10 = Math.log(Math.abs(d17 / d29)) / d24;
                    double log = Math.log(Math.abs(d17 / d28)) / d25;
                    if (Double.isInfinite(d10) || Double.isNaN(d10)) {
                        d10 = log;
                    } else if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                        d10 = Math.max(d10, log);
                    }
                    double d30 = d29 * d24;
                    double log2 = Math.log(d30 / ((-d28) * d25)) / (d25 - d24);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d25) * d28) + (Math.exp(d24 * log2) * d29))) < d17) {
                                if (d28 > 0.0d && d29 < 0.0d) {
                                    d10 = 0.0d;
                                }
                            }
                        }
                        d10 = Math.log((-((d28 * d25) * d25)) / (d30 * d24)) / d27;
                        d11 = d28 * d25;
                        if (Math.abs((Math.exp(d25 * d10) * d11) + (Math.exp(d24 * d10) * d30)) >= 1.0E-4d) {
                            int i7 = 0;
                            while (d23 > 0.001d && i7 < 100) {
                                i7++;
                                double d31 = d24 * d10;
                                double d32 = d25 * d10;
                                double exp = d10 - ((((Math.exp(d32) * d28) + (Math.exp(d31) * d29)) + d17) / ((Math.exp(d32) * d11) + (Math.exp(d31) * d30)));
                                d23 = Math.abs(d10 - exp);
                                d10 = exp;
                            }
                        }
                    }
                    d17 = -d17;
                    d11 = d28 * d25;
                    if (Math.abs((Math.exp(d25 * d10) * d11) + (Math.exp(d24 * d10) * d30)) >= 1.0E-4d) {
                    }
                } else if (d8 < 1.0d) {
                    double d33 = tVar.f5657a;
                    double d34 = (d15 - (d33 * abs)) / tVar.f5658b;
                    d10 = Math.log(d17 / Math.sqrt((d34 * d34) + (abs * abs))) / d33;
                } else {
                    double d35 = tVar.f5657a;
                    double d36 = d35 * abs;
                    double d37 = d15 - d36;
                    double log3 = Math.log(Math.abs(d17 / abs)) / d35;
                    double log4 = Math.log(Math.abs(d17 / d37));
                    double d38 = log4;
                    for (int i8 = 0; i8 < 6; i8++) {
                        d38 = log4 - Math.log(Math.abs(d38 / d35));
                    }
                    double d39 = d38 / d35;
                    if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                        log3 = d39;
                    } else if (!Double.isInfinite(d39) && !Double.isNaN(d39)) {
                        log3 = Math.max(log3, d39);
                    }
                    double d40 = (-(d36 + d37)) / (d35 * d37);
                    double d41 = d35 * d40;
                    double exp2 = (Math.exp(d41) * d37 * d40) + (Math.exp(d41) * abs);
                    if (Double.isNaN(d40) || d40 <= 0.0d) {
                        d17 = -d17;
                    } else if (d40 <= 0.0d || (-exp2) >= d17) {
                        log3 = (-(d9 / d35)) - (abs / d37);
                    } else {
                        d17 = -d17;
                        log3 = (d37 >= 0.0d || abs <= 0.0d) ? log3 : 0.0d;
                    }
                    int i9 = 0;
                    while (d23 > 0.001d && i9 < 100) {
                        i9++;
                        double d42 = d35 * log3;
                        double exp3 = log3 - (((Math.exp(d42) * ((d37 * log3) + abs)) + d17) / (Math.exp(d42) * (((1 + d42) * d37) + d36)));
                        d23 = Math.abs(log3 - exp3);
                        log3 = exp3;
                    }
                    d10 = log3;
                }
                j8 = (long) (d10 * 1000.0d);
            }
        }
        return j8 * 1000000;
    }

    @Override // l.b0
    public final float e(float f9, float f10, float f11) {
        return 0.0f;
    }
}
