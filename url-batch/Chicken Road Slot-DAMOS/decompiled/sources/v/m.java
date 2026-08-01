package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: d, reason: collision with root package name */
    public final float f9836d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9837e;

    /* renamed from: i, reason: collision with root package name */
    public final float f9838i;

    /* renamed from: r, reason: collision with root package name */
    public final float f9839r;

    public m(float f3, float f10) {
        int w6;
        this.f9836d = f3;
        this.f9837e = f10;
        if (Float.isNaN(f3) || Float.isNaN(0.0f) || Float.isNaN(f10) || Float.isNaN(1.0f)) {
            y.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", 0.0, " + f10 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d10 = 0.0f;
        double d11 = 3.0f;
        double d12 = 0.0f;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            w6 = d11 == d12 ? 0 : k1.v.w((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int w10 = k1.v.w((float) ((-(d15 + d16)) / d14), fArr, 0);
            w6 = k1.v.w((float) ((d15 - d16) / d14), fArr, w10) + w10;
            if (w6 > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    w6--;
                }
            }
        }
        int w11 = k1.v.w(0.5f, fArr, w6) + w6;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i3 = 0; i3 < w11; i3++) {
            float f13 = fArr[i3];
            float f14 = ((((((-2.0f) * f13) + 3.0f) * f13) + 0.0f) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f9838i = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f9839r = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fd, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x022b, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024f  */
    @Override // v.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f3) {
        float f10;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return f3;
        }
        float max = Math.max(f3, 1.1920929E-7f);
        float f11 = this.f9836d;
        float f12 = this.f9837e;
        float f13 = f12 - max;
        double d10 = 0.0f - max;
        double d11 = ((d10 - ((f11 - max) * 2.0d)) + f13) * 3.0d;
        double d12 = (r7 - r5) * 3.0d;
        double d13 = ((r7 - f13) * 3.0d) + (-r5) + (1.0f - max);
        float f14 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double sqrt = Math.sqrt(-d19);
                double d22 = (-d18) / sqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double acos = Math.acos(d22);
                double a9 = z2.b.a((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * a9) - d21);
                float f15 = cos < 0.0f ? 0.0f : cos;
                if (f15 > 1.0f) {
                    f15 = 1.0f;
                }
                if (Math.abs(f15 - cos) > 1.05E-6f) {
                    f15 = Float.NaN;
                }
                if (Float.isNaN(f15)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * a9) - d21);
                    f15 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f15 > 1.0f) {
                        f15 = 1.0f;
                    }
                    if (Math.abs(f15 - cos2) > 1.05E-6f) {
                        f15 = Float.NaN;
                    }
                    if (Float.isNaN(f15)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * a9) - d21);
                        f10 = cos3 < 0.0f ? 0.0f : cos3;
                        if (f10 > 1.0f) {
                            f10 = 1.0f;
                        }
                    }
                }
                f14 = f15;
                if (Float.isNaN(f14)) {
                }
            } else if (d20 == 0.0d) {
                float f16 = -z2.b.a((float) d18);
                float f17 = (float) d21;
                float f18 = (2.0f * f16) - f17;
                float f19 = f18 < 0.0f ? 0.0f : f18;
                if (f19 > 1.0f) {
                    f19 = 1.0f;
                }
                if (Math.abs(f19 - f18) > 1.05E-6f) {
                    f19 = Float.NaN;
                }
                if (Float.isNaN(f19)) {
                    float f20 = (-f16) - f17;
                    f10 = f20 < 0.0f ? 0.0f : f20;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                } else {
                    f14 = f19;
                }
                if (Float.isNaN(f14)) {
                }
            } else {
                double sqrt2 = Math.sqrt(d20);
                float a10 = (float) ((z2.b.a((float) ((-d18) + sqrt2)) - z2.b.a((float) (d18 + sqrt2))) - d21);
                f10 = a10 < 0.0f ? 0.0f : a10;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d11 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
                    float f21 = (float) ((-d10) / d12);
                    f10 = f21 < 0.0f ? 0.0f : f21;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                }
                if (Float.isNaN(f14)) {
                    float f22 = (((((-0.6666666f) * f14) + 1.0f) * f14) + 0.0f) * 3.0f * f14;
                    float f23 = this.f9838i;
                    if (f22 < f23) {
                        f22 = f23;
                    }
                    float f24 = this.f9839r;
                    return f22 > f24 ? f24 : f22;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f11 + ", 0.0, " + f12 + ", 1.0) has no solution at " + f3);
            }
            double sqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            float f25 = (float) ((sqrt3 - d12) / d23);
            float f26 = f25 < 0.0f ? 0.0f : f25;
            if (f26 > 1.0f) {
                f26 = 1.0f;
            }
            if (Math.abs(f26 - f25) > 1.05E-6f) {
                f26 = Float.NaN;
            }
            if (Float.isNaN(f26)) {
                float f27 = (float) (((-d12) - sqrt3) / d23);
                f10 = f27 < 0.0f ? 0.0f : f27;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
            } else {
                f14 = f26;
            }
            if (Float.isNaN(f14)) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f9836d == mVar.f9836d && this.f9837e == mVar.f9837e;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + n0.l.b(this.f9837e, n0.l.b(0.0f, Float.hashCode(this.f9836d) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f9836d + ", b=0.0, c=" + this.f9837e + ", d=1.0)";
    }
}
