package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final float f6390a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6391b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6392c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6393d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6394e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6395f;

    public q(float f6, float f8, float f9, float f10) {
        int i;
        this.f6390a = f6;
        this.f6391b = f8;
        this.f6392c = f9;
        this.f6393d = f10;
        if (!((Float.isNaN(f6) || Float.isNaN(f8) || Float.isNaN(f9) || Float.isNaN(f10)) ? false : true)) {
            i0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f6 + ", " + f8 + ", " + f9 + ", " + f10 + '.');
        }
        float[] fArr = new float[5];
        float f11 = (f8 - 0.0f) * 3.0f;
        float f12 = (f10 - f8) * 3.0f;
        float f13 = (1.0f - f10) * 3.0f;
        double d8 = f11;
        double d9 = f12;
        double d10 = f13;
        double d11 = d9 * 2.0d;
        double d12 = (d8 - d11) + d10;
        if (d12 == 0.0d) {
            i = d9 == d10 ? 0 : f1.p.A((float) ((d11 - d10) / (d11 - (d10 * 2.0d))), fArr, 0);
        } else {
            double d13 = -Math.sqrt((d9 * d9) - (d10 * d8));
            double d14 = (-d8) + d9;
            int A = f1.p.A((float) ((-(d13 + d14)) / d12), fArr, 0);
            int A2 = f1.p.A((float) ((d13 - d14) / d12), fArr, A) + A;
            if (A2 > 1) {
                float f14 = fArr[0];
                float f15 = fArr[1];
                if (f14 > f15) {
                    fArr[0] = f15;
                    fArr[1] = f14;
                } else if (f14 == f15) {
                    i = A2 - 1;
                }
            }
            i = A2;
        }
        float f16 = (f12 - f11) * 2.0f;
        int A3 = f1.p.A((-f16) / (((f13 - f12) * 2.0f) - f16), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i8 = 0; i8 < A3; i8++) {
            float f17 = fArr[i8];
            float f18 = (((((((((f8 - f10) * 3.0f) + 1.0f) - 0.0f) * f17) + (((f10 - (f8 * 2.0f)) + 0.0f) * 3.0f)) * f17) + f11) * f17) + 0.0f;
            min = Math.min(min, f18);
            max = Math.max(max, f18);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f6394e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f6395f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // r.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f6) {
        float f8;
        boolean isNaN;
        if (f6 <= 0.0f || f6 >= 1.0f) {
            return f6;
        }
        float max = Math.max(f6, 1.1920929E-7f);
        float f9 = this.f6390a;
        float f10 = this.f6392c;
        float f11 = f10 - max;
        double d8 = 0.0f - max;
        float f12 = 0.0f;
        double d9 = ((d8 - ((f9 - max) * 2.0d)) + f11) * 3.0d;
        double d10 = (r7 - r5) * 3.0d;
        double d11 = ((r7 - f11) * 3.0d) + (-r5) + (1.0f - max);
        float f13 = Float.NaN;
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
                double t3 = r2.r.t((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * t3) - d19);
                float f14 = cos < 0.0f ? 0.0f : cos;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - cos) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * t3) - d19);
                    f14 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (Math.abs(f14 - cos2) > 1.05E-6f) {
                        f14 = Float.NaN;
                    }
                    if (Float.isNaN(f14)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * t3) - d19);
                        if (cos3 >= 0.0f) {
                            f12 = cos3;
                        }
                        f8 = f12 > 1.0f ? 1.0f : f12;
                    }
                }
                f13 = f14;
                isNaN = Float.isNaN(f13);
                float f15 = this.f6393d;
                float f16 = this.f6391b;
                if (isNaN) {
                }
            } else if (d18 == 0.0d) {
                float f17 = -r2.r.t((float) d16);
                float f18 = (float) d19;
                float f19 = (f17 * 2.0f) - f18;
                float f20 = f19 < 0.0f ? 0.0f : f19;
                if (f20 > 1.0f) {
                    f20 = 1.0f;
                }
                if (Math.abs(f20 - f19) > 1.05E-6f) {
                    f20 = Float.NaN;
                }
                if (Float.isNaN(f20)) {
                    float f21 = (-f17) - f18;
                    if (f21 >= 0.0f) {
                        f12 = f21;
                    }
                    f8 = f12 > 1.0f ? 1.0f : f12;
                } else {
                    f13 = f20;
                }
                isNaN = Float.isNaN(f13);
                float f152 = this.f6393d;
                float f162 = this.f6391b;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d18);
                float t7 = (float) ((r2.r.t((float) ((-d16) + sqrt2)) - r2.r.t((float) (d16 + sqrt2))) - d19);
                if (t7 >= 0.0f) {
                    f12 = t7;
                }
                f8 = f12 > 1.0f ? 1.0f : f12;
            }
        } else {
            if (Math.abs(d9 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d10 - 0.0d) >= 1.0E-7d) {
                    float f22 = (float) ((-d8) / d10);
                    if (f22 >= 0.0f) {
                        f12 = f22;
                    }
                    f8 = f12 > 1.0f ? 1.0f : f12;
                }
                isNaN = Float.isNaN(f13);
                float f1522 = this.f6393d;
                float f1622 = this.f6391b;
                if (isNaN) {
                    float f23 = ((((((f1622 - f1522) + 0.33333334f) * f13) + (f1522 - (2.0f * f1622))) * f13) + f1622) * 3.0f * f13;
                    float f24 = this.f6394e;
                    if (f23 < f24) {
                        f23 = f24;
                    }
                    float f25 = this.f6395f;
                    return f23 > f25 ? f25 : f23;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f9 + ", " + f1622 + ", " + f10 + ", " + f1522 + ") has no solution at " + f6);
            }
            double sqrt3 = Math.sqrt((d10 * d10) - ((4.0d * d9) * d8));
            double d21 = d9 * 2.0d;
            float f26 = (float) ((sqrt3 - d10) / d21);
            float f27 = f26 < 0.0f ? 0.0f : f26;
            if (f27 > 1.0f) {
                f27 = 1.0f;
            }
            if (Math.abs(f27 - f26) > 1.05E-6f) {
                f27 = Float.NaN;
            }
            if (Float.isNaN(f27)) {
                float f28 = (float) (((-d10) - sqrt3) / d21);
                if (f28 >= 0.0f) {
                    f12 = f28;
                }
                f8 = f12 > 1.0f ? 1.0f : f12;
            } else {
                f13 = f27;
            }
            isNaN = Float.isNaN(f13);
            float f15222 = this.f6393d;
            float f16222 = this.f6391b;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f6390a == qVar.f6390a && this.f6391b == qVar.f6391b && this.f6392c == qVar.f6392c && this.f6393d == qVar.f6393d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6393d) + a0.q.a(this.f6392c, a0.q.a(this.f6391b, Float.hashCode(this.f6390a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f6390a);
        sb.append(", b=");
        sb.append(this.f6391b);
        sb.append(", c=");
        sb.append(this.f6392c);
        sb.append(", d=");
        return a0.q.j(sb, this.f6393d, ')');
    }
}
