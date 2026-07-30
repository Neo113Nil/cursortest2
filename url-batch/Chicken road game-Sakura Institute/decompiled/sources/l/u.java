package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    public final float f5667a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5668b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5669c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5670d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5671e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5672f;

    public u(float f9, float f10, float f11, float f12) {
        int A;
        this.f5667a = f9;
        this.f5668b = f10;
        this.f5669c = f11;
        this.f5670d = f12;
        if (Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f9 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        float[] fArr = new float[5];
        float f13 = (f10 - 0.0f) * 3.0f;
        float f14 = (f12 - f10) * 3.0f;
        float f15 = (1.0f - f12) * 3.0f;
        double d8 = f13;
        double d9 = f14;
        double d10 = f15;
        double d11 = d9 * 2.0d;
        double d12 = (d8 - d11) + d10;
        if (d12 == 0.0d) {
            A = d9 == d10 ? 0 : z0.l0.A((float) ((d11 - d10) / (d11 - (d10 * 2.0d))), fArr, 0);
        } else {
            double d13 = -Math.sqrt((d9 * d9) - (d10 * d8));
            double d14 = (-d8) + d9;
            int A2 = z0.l0.A((float) ((-(d13 + d14)) / d12), fArr, 0);
            A = z0.l0.A((float) ((d13 - d14) / d12), fArr, A2) + A2;
            if (A > 1) {
                float f16 = fArr[0];
                float f17 = fArr[1];
                if (f16 > f17) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                } else if (f16 == f17) {
                    A--;
                }
            }
        }
        float f18 = (f14 - f13) * 2.0f;
        int A3 = z0.l0.A((-f18) / (((f15 - f14) * 2.0f) - f18), fArr, A) + A;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i7 = 0; i7 < A3; i7++) {
            float f19 = fArr[i7];
            float f20 = (((((((((f10 - f12) * 3.0f) + 1.0f) - 0.0f) * f19) + (((f12 - (f10 * 2.0f)) + 0.0f) * 3.0f)) * f19) + f13) * f19) + 0.0f;
            min = Math.min(min, f20);
            max = Math.max(max, f20);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f5671e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f5672f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d5, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01df, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fe, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0208, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019d, code lost:
    
        if (r2 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    @Override // l.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c(float f9) {
        float u8;
        float cos;
        if (f9 <= 0.0f || f9 >= 1.0f) {
            return f9;
        }
        float f10 = this.f5667a;
        float f11 = this.f5669c;
        float f12 = f11 - f9;
        double d8 = 0.0f - f9;
        double d9 = ((d8 - ((f10 - f9) * 2.0d)) + f12) * 3.0d;
        double d10 = (r6 - r4) * 3.0d;
        double d11 = ((r6 - f12) * 3.0d) + (-r4) + (1.0f - f9);
        if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double d12 = d9 / d11;
            double d13 = d10 / d11;
            double d14 = d8 / d11;
            double d15 = ((d13 * 3.0d) - (d12 * d12)) / 9.0d;
            double d16 = ((d14 * 27.0d) + ((((2.0d * d12) * d12) * d12) - ((9.0d * d12) * d13))) / 54.0d;
            double d17 = d15 * d15 * d15;
            double d18 = (d16 * d16) + d17;
            double d19 = d12 / 3.0d;
            if (d18 < 0.0d) {
                double sqrt = Math.sqrt(-d17);
                double d20 = (-d16) / sqrt;
                if (d20 < -1.0d) {
                    d20 = -1.0d;
                }
                if (d20 > 1.0d) {
                    d20 = 1.0d;
                }
                double acos = Math.acos(d20);
                double u9 = a8.m.u((float) sqrt) * 2.0f;
                cos = (float) ((Math.cos(acos / 3.0d) * u9) - d19);
                if (cos < 0.0f) {
                    if (cos >= -8.34465E-7f) {
                        cos = 0.0f;
                        if (Float.isNaN(cos)) {
                            cos = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * u9) - d19);
                            if (cos < 0.0f) {
                                if (cos >= -8.34465E-7f) {
                                    cos = 0.0f;
                                    if (Float.isNaN(cos)) {
                                        u8 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * u9) - d19);
                                        if (u8 >= 0.0f) {
                                            if (u8 > 1.0f) {
                                            }
                                        }
                                        u8 = Float.NaN;
                                    }
                                }
                                cos = Float.NaN;
                                if (Float.isNaN(cos)) {
                                }
                            } else {
                                if (cos > 1.0f) {
                                    if (cos <= 1.0000008f) {
                                        cos = 1.0f;
                                    }
                                    cos = Float.NaN;
                                }
                                if (Float.isNaN(cos)) {
                                }
                            }
                        }
                        u8 = cos;
                    }
                    cos = Float.NaN;
                    if (Float.isNaN(cos)) {
                    }
                    u8 = cos;
                } else {
                    if (cos > 1.0f) {
                        if (cos <= 1.0000008f) {
                            cos = 1.0f;
                        }
                        cos = Float.NaN;
                    }
                    if (Float.isNaN(cos)) {
                    }
                    u8 = cos;
                }
            } else if (d18 == 0.0d) {
                float f13 = -a8.m.u((float) d16);
                float f14 = (float) d19;
                float f15 = (f13 * 2.0f) - f14;
                if (f15 < 0.0f) {
                    if (f15 >= -8.34465E-7f) {
                        f15 = 0.0f;
                        if (Float.isNaN(f15)) {
                            u8 = (-f13) - f14;
                            if (u8 >= 0.0f) {
                                if (u8 > 1.0f) {
                                }
                            }
                            u8 = Float.NaN;
                        } else {
                            u8 = f15;
                        }
                    }
                    f15 = Float.NaN;
                    if (Float.isNaN(f15)) {
                    }
                } else {
                    if (f15 > 1.0f) {
                        if (f15 <= 1.0000008f) {
                            f15 = 1.0f;
                        }
                        f15 = Float.NaN;
                    }
                    if (Float.isNaN(f15)) {
                    }
                }
            } else {
                double sqrt2 = Math.sqrt(d18);
                u8 = (float) ((a8.m.u((float) ((-d16) + sqrt2)) - a8.m.u((float) (d16 + sqrt2))) - d19);
                if (u8 >= 0.0f) {
                    if (u8 > 1.0f) {
                    }
                }
                u8 = Float.NaN;
            }
        } else if (Math.abs(d9 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d10 - 0.0d) >= 1.0E-7d) {
                u8 = (float) ((-d8) / d10);
                if (u8 >= 0.0f) {
                    if (u8 > 1.0f) {
                    }
                }
            }
            u8 = Float.NaN;
        } else {
            double sqrt3 = Math.sqrt((d10 * d10) - ((4.0d * d9) * d8));
            double d21 = d9 * 2.0d;
            cos = (float) ((sqrt3 - d10) / d21);
            if (cos < 0.0f) {
                if (cos >= -8.34465E-7f) {
                    cos = 0.0f;
                    if (Float.isNaN(cos)) {
                        u8 = (float) (((-d10) - sqrt3) / d21);
                        if (u8 >= 0.0f) {
                            if (u8 > 1.0f) {
                            }
                        }
                        u8 = Float.NaN;
                    }
                    u8 = cos;
                }
                cos = Float.NaN;
                if (Float.isNaN(cos)) {
                }
                u8 = cos;
            } else {
                if (cos > 1.0f) {
                    if (cos <= 1.0000008f) {
                        cos = 1.0f;
                    }
                    cos = Float.NaN;
                }
                if (Float.isNaN(cos)) {
                }
                u8 = cos;
            }
        }
        boolean isNaN = Float.isNaN(u8);
        float f16 = this.f5670d;
        float f17 = this.f5668b;
        if (!isNaN) {
            float f18 = ((((((f17 - f16) + 0.33333334f) * u8) + (f16 - (2.0f * f17))) * u8) + f17) * 3.0f * u8;
            float f19 = this.f5671e;
            if (f18 < f19) {
                f18 = f19;
            }
            float f20 = this.f5672f;
            return f18 > f20 ? f20 : f18;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f10 + ", " + f17 + ", " + f11 + ", " + f16 + ") has no solution at " + f9);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f5667a == uVar.f5667a && this.f5668b == uVar.f5668b && this.f5669c == uVar.f5669c && this.f5670d == uVar.f5670d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5670d) + a0.m.a(this.f5669c, a0.m.a(this.f5668b, Float.hashCode(this.f5667a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f5667a);
        sb.append(", b=");
        sb.append(this.f5668b);
        sb.append(", c=");
        sb.append(this.f5669c);
        sb.append(", d=");
        return a0.m.k(sb, this.f5670d, ')');
    }
}
