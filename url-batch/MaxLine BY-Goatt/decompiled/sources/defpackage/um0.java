package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class um0 implements tm0 {
    public final float a;
    public final do2 b;

    public um0(float f, float f2, float f3) {
        this.a = f3;
        do2 do2Var = new do2();
        do2Var.a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        do2Var.b = sqrt;
        do2Var.g = 1.0f;
        if (f < 0.0f) {
            lh.e("Damping ratio must be non-negative");
            throw null;
        }
        do2Var.g = f;
        do2Var.c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            lh.e("Spring stiffness constant must be positive.");
            throw null;
        }
        do2Var.b = Math.sqrt(f2);
        do2Var.c = false;
        this.b = do2Var;
    }

    @Override // defpackage.tm0
    public final float b(long j, float f, float f2, float f3) {
        do2 do2Var = this.b;
        do2Var.a = f2;
        return Float.intBitsToFloat((int) (do2Var.a(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.tm0
    public final float c(long j, float f, float f2, float f3) {
        do2 do2Var = this.b;
        do2Var.a = f2;
        return Float.intBitsToFloat((int) (do2Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0177  */
    @Override // defpackage.tm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f, float f2, float f3) {
        double d;
        jx jxVar;
        double d2;
        double d3;
        long j;
        double d4;
        double d5;
        do2 do2Var = this.b;
        double d6 = do2Var.b;
        float f4 = (float) (d6 * d6);
        float f5 = do2Var.g;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d7 = f4;
            double d8 = f5;
            double d9 = f8;
            double d10 = f7;
            double sqrt = Math.sqrt(d7) * d8 * 2.0d;
            double d11 = (sqrt * sqrt) - (d7 * 4.0d);
            double d12 = -sqrt;
            if (d11 < 0.0d) {
                d = 2.0d;
                jxVar = new jx(0.0d, Math.sqrt(Math.abs(d11)));
            } else {
                d = 2.0d;
                jxVar = new jx(Math.sqrt(d11), 0.0d);
            }
            jxVar.a = (jxVar.a + d12) * 0.5d;
            jxVar.b *= 0.5d;
            jx jxVar2 = d11 < 0.0d ? new jx(0.0d, Math.sqrt(Math.abs(d11))) : new jx(Math.sqrt(d11), 0.0d);
            double d13 = jxVar2.a * (-1.0d);
            double d14 = jxVar2.b * (-1.0d);
            jxVar2.a = (d13 + d12) * 0.5d;
            jxVar2.b = d14 * 0.5d;
            if (d10 == 0.0d && d9 == 0.0d) {
                j = 0;
            } else {
                if (d10 < 0.0d) {
                    d9 = -d9;
                }
                double abs = Math.abs(d10);
                double d15 = jxVar.a;
                double d16 = Double.MAX_VALUE;
                if (d8 > 1.0d) {
                    double d17 = jxVar2.a;
                    double d18 = d15 - d17;
                    double d19 = 1.0d;
                    double d20 = ((d15 * abs) - d9) / d18;
                    double d21 = abs - d20;
                    double log = Math.log(Math.abs(1.0d / d21)) / d15;
                    double log2 = Math.log(Math.abs(1.0d / d20)) / d17;
                    if (Double.isInfinite(log) || Double.isNaN(log)) {
                        d4 = d15;
                        d3 = log2;
                    } else if (Double.isInfinite(log2) || Double.isNaN(log2)) {
                        d4 = d15;
                        d3 = log;
                    } else {
                        d4 = d15;
                        d3 = Math.max(log, log2);
                    }
                    double d22 = d21 * d4;
                    double log3 = Math.log(d22 / ((-d20) * d17)) / (d17 - d4);
                    if (!Double.isNaN(log3) && log3 > 0.0d) {
                        if (log3 > 0.0d) {
                            if ((-((Math.exp(log3 * d17) * d20) + (Math.exp(d4 * log3) * d21))) < 1.0d) {
                                if (d20 > 0.0d && d21 < 0.0d) {
                                    d3 = 0.0d;
                                }
                            }
                        }
                        d3 = Math.log((-((d20 * d17) * d17)) / (d22 * d4)) / d18;
                        d5 = d20 * d17;
                        if (Math.abs((Math.exp(d17 * d3) * d5) + (Math.exp(d4 * d3) * d22)) >= 1.0E-4d) {
                            int i = 0;
                            while (d16 > 0.001d && i < 100) {
                                i++;
                                double d23 = d4 * d3;
                                double d24 = d17 * d3;
                                double exp = d3 - ((((Math.exp(d24) * d20) + (Math.exp(d23) * d21)) + d19) / ((Math.exp(d24) * d5) + (Math.exp(d23) * d22)));
                                d16 = Math.abs(d3 - exp);
                                d3 = exp;
                            }
                        }
                    }
                    d19 = -1.0d;
                    d5 = d20 * d17;
                    if (Math.abs((Math.exp(d17 * d3) * d5) + (Math.exp(d4 * d3) * d22)) >= 1.0E-4d) {
                    }
                } else if (d8 < 1.0d) {
                    double d25 = (d9 - (d15 * abs)) / jxVar.b;
                    d3 = Math.log(1.0d / Math.sqrt((d25 * d25) + (abs * abs))) / d15;
                } else {
                    double d26 = d15 * abs;
                    double d27 = d9 - d26;
                    double log4 = Math.log(Math.abs(1.0d / abs)) / d15;
                    double log5 = Math.log(Math.abs(1.0d / d27));
                    double d28 = log5;
                    for (int i2 = 0; i2 < 6; i2++) {
                        d28 = log5 - Math.log(Math.abs(d28 / d15));
                    }
                    double d29 = d28 / d15;
                    if (Double.isInfinite(log4) || Double.isNaN(log4)) {
                        log4 = d29;
                    } else if (!Double.isInfinite(d29) && !Double.isNaN(d29)) {
                        log4 = Math.max(log4, d29);
                    }
                    double d30 = (-(d26 + d27)) / (d15 * d27);
                    double d31 = d15 * d30;
                    double exp2 = (Math.exp(d31) * d27 * d30) + (Math.exp(d31) * abs);
                    if (Double.isNaN(d30) || d30 <= 0.0d) {
                        d2 = -1.0d;
                    } else if (d30 <= 0.0d || (-exp2) >= 1.0d) {
                        log4 = (-(d / d15)) - (abs / d27);
                        d2 = 1.0d;
                    } else {
                        d2 = -1.0d;
                        log4 = (d27 >= 0.0d || abs <= 0.0d) ? log4 : 0.0d;
                    }
                    d3 = log4;
                    int i3 = 0;
                    while (d16 > 0.001d && i3 < 100) {
                        i3++;
                        double d32 = d15 * d3;
                        double exp3 = d3 - (((Math.exp(d32) * ((d27 * d3) + abs)) + d2) / (Math.exp(d32) * (((d32 + 1.0d) * d27) + d26)));
                        d16 = Math.abs(d3 - exp3);
                        d3 = exp3;
                    }
                }
                j = (long) (d3 * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // defpackage.tm0
    public final float e(float f, float f2, float f3) {
        return 0.0f;
    }
}
