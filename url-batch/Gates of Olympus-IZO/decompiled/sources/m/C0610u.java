package m;

import H2.AbstractC0080b;
import b0.AbstractC0259J;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610u implements InterfaceC0613x {

    /* renamed from: a, reason: collision with root package name */
    public final float f5856a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5857b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5858c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5859d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5860e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5861f;

    public C0610u(float f3, float f4, float f5, float f6) {
        int I3;
        this.f5856a = f3;
        this.f5857b = f4;
        this.f5858c = f5;
        this.f5859d = f6;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", " + f4 + ", " + f5 + ", " + f6 + '.');
        }
        float[] fArr = new float[5];
        float f7 = (f4 - 0.0f) * 3.0f;
        float f8 = (f6 - f4) * 3.0f;
        float f9 = (1.0f - f6) * 3.0f;
        double d3 = f7;
        double d4 = f8;
        double d5 = f9;
        double d6 = d4 * 2.0d;
        double d7 = (d3 - d6) + d5;
        if (d7 == 0.0d) {
            I3 = d4 == d5 ? 0 : AbstractC0259J.I((float) ((d6 - d5) / (d6 - (d5 * 2.0d))), fArr, 0);
        } else {
            double d8 = -Math.sqrt((d4 * d4) - (d5 * d3));
            double d9 = (-d3) + d4;
            int I4 = AbstractC0259J.I((float) ((-(d8 + d9)) / d7), fArr, 0);
            I3 = AbstractC0259J.I((float) ((d8 - d9) / d7), fArr, I4) + I4;
            if (I3 > 1) {
                float f10 = fArr[0];
                float f11 = fArr[1];
                if (f10 > f11) {
                    fArr[0] = f11;
                    fArr[1] = f10;
                } else if (f10 == f11) {
                    I3--;
                }
            }
        }
        float f12 = (f8 - f7) * 2.0f;
        int I5 = AbstractC0259J.I((-f12) / (((f9 - f8) * 2.0f) - f12), fArr, I3) + I3;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i3 = 0; i3 < I5; i3++) {
            float f13 = fArr[i3];
            float f14 = (((((((((f4 - f6) * 3.0f) + 1.0f) - 0.0f) * f13) + (((f6 - (f4 * 2.0f)) + 0.0f) * 3.0f)) * f13) + f7) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f5860e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f5861f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e7, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f3, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0213, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0215, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0220, code lost:
    
        if (r2 <= 1.0000008f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r2 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r2 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019f, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    @Override // m.InterfaceC0613x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f3) {
        float y3;
        float cos;
        boolean isNaN;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return f3;
        }
        float f4 = this.f5856a;
        float f5 = this.f5858c;
        float f6 = f5 - f3;
        double d3 = 0.0f - f3;
        double d4 = ((d3 - ((f4 - f3) * 2.0d)) + f6) * 3.0d;
        double d5 = (r6 - r4) * 3.0d;
        double d6 = ((r6 - f6) * 3.0d) + (-r4) + (1.0f - f3);
        float f7 = Float.NaN;
        if (Math.abs(d6 - 0.0d) >= 1.0E-7d) {
            double d7 = d4 / d6;
            double d8 = d5 / d6;
            double d9 = ((d8 * 3.0d) - (d7 * d7)) / 9.0d;
            double d10 = (((d3 / d6) * 27.0d) + ((((2.0d * d7) * d7) * d7) - ((9.0d * d7) * d8))) / 54.0d;
            double d11 = d9 * d9 * d9;
            double d12 = (d10 * d10) + d11;
            double d13 = d7 / 3.0d;
            if (d12 < 0.0d) {
                double sqrt = Math.sqrt(-d11);
                double d14 = (-d10) / sqrt;
                if (d14 < -1.0d) {
                    d14 = -1.0d;
                }
                if (d14 > 1.0d) {
                    d14 = 1.0d;
                }
                double acos = Math.acos(d14);
                double y4 = I2.l.y((float) sqrt) * 2.0f;
                cos = (float) ((Math.cos(acos / 3.0d) * y4) - d13);
                if (cos < 0.0f) {
                    if (cos >= -8.34465E-7f) {
                        cos = 0.0f;
                        if (Float.isNaN(cos)) {
                            cos = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * y4) - d13);
                            if (cos < 0.0f) {
                                if (cos >= -8.34465E-7f) {
                                    cos = 0.0f;
                                    if (Float.isNaN(cos)) {
                                        y3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * y4) - d13);
                                        if (y3 >= 0.0f) {
                                            if (y3 > 1.0f) {
                                            }
                                            f7 = y3;
                                            isNaN = Float.isNaN(f7);
                                            float f8 = this.f5859d;
                                            float f9 = this.f5857b;
                                            if (!isNaN) {
                                            }
                                        }
                                        y3 = Float.NaN;
                                        f7 = y3;
                                        isNaN = Float.isNaN(f7);
                                        float f82 = this.f5859d;
                                        float f92 = this.f5857b;
                                        if (!isNaN) {
                                        }
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
                        f7 = cos;
                        isNaN = Float.isNaN(f7);
                        float f822 = this.f5859d;
                        float f922 = this.f5857b;
                        if (!isNaN) {
                        }
                    }
                    cos = Float.NaN;
                    if (Float.isNaN(cos)) {
                    }
                    f7 = cos;
                    isNaN = Float.isNaN(f7);
                    float f8222 = this.f5859d;
                    float f9222 = this.f5857b;
                    if (!isNaN) {
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
                    f7 = cos;
                    isNaN = Float.isNaN(f7);
                    float f82222 = this.f5859d;
                    float f92222 = this.f5857b;
                    if (!isNaN) {
                    }
                }
            } else if (d12 == 0.0d) {
                float f10 = -I2.l.y((float) d10);
                float f11 = (float) d13;
                float f12 = (f10 * 2.0f) - f11;
                if (f12 < 0.0f) {
                    if (f12 >= -8.34465E-7f) {
                        f12 = 0.0f;
                        if (Float.isNaN(f12)) {
                            y3 = (-f10) - f11;
                            if (y3 >= 0.0f) {
                                if (y3 > 1.0f) {
                                }
                            }
                            y3 = Float.NaN;
                        } else {
                            f7 = f12;
                            isNaN = Float.isNaN(f7);
                            float f822222 = this.f5859d;
                            float f922222 = this.f5857b;
                            if (!isNaN) {
                            }
                        }
                    }
                    f12 = Float.NaN;
                    if (Float.isNaN(f12)) {
                    }
                } else {
                    if (f12 > 1.0f) {
                        if (f12 <= 1.0000008f) {
                            f12 = 1.0f;
                        }
                        f12 = Float.NaN;
                    }
                    if (Float.isNaN(f12)) {
                    }
                }
                f7 = y3;
                isNaN = Float.isNaN(f7);
                float f8222222 = this.f5859d;
                float f9222222 = this.f5857b;
                if (!isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d12);
                y3 = (float) ((I2.l.y((float) ((-d10) + sqrt2)) - I2.l.y((float) (d10 + sqrt2))) - d13);
                float f13 = 0.0f;
                if (y3 >= 0.0f) {
                    f13 = 1.0f;
                    if (y3 > 1.0f) {
                    }
                }
                f7 = y3;
                isNaN = Float.isNaN(f7);
                float f82222222 = this.f5859d;
                float f92222222 = this.f5857b;
                if (!isNaN) {
                }
            }
        } else {
            if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d5 - 0.0d) >= 1.0E-7d) {
                    y3 = (float) ((-d3) / d5);
                    if (y3 >= 0.0f) {
                        if (y3 > 1.0f) {
                        }
                        f7 = y3;
                    }
                    y3 = Float.NaN;
                    f7 = y3;
                }
                isNaN = Float.isNaN(f7);
                float f822222222 = this.f5859d;
                float f922222222 = this.f5857b;
                if (!isNaN) {
                    float f14 = ((((((f922222222 - f822222222) + 0.33333334f) * f7) + (f822222222 - (2.0f * f922222222))) * f7) + f922222222) * 3.0f * f7;
                    float f15 = this.f5860e;
                    if (f14 < f15) {
                        f14 = f15;
                    }
                    float f16 = this.f5861f;
                    return f14 > f16 ? f16 : f14;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f4 + ", " + f922222222 + ", " + f5 + ", " + f822222222 + ") has no solution at " + f3);
            }
            double sqrt3 = Math.sqrt((d5 * d5) - ((4.0d * d4) * d3));
            double d15 = d4 * 2.0d;
            cos = (float) ((sqrt3 - d5) / d15);
            if (cos < 0.0f) {
                if (cos >= -8.34465E-7f) {
                    cos = 0.0f;
                    if (Float.isNaN(cos)) {
                        y3 = (float) (((-d5) - sqrt3) / d15);
                        if (y3 >= 0.0f) {
                            if (y3 > 1.0f) {
                            }
                        }
                        y3 = Float.NaN;
                    }
                    f7 = cos;
                    isNaN = Float.isNaN(f7);
                    float f8222222222 = this.f5859d;
                    float f9222222222 = this.f5857b;
                    if (!isNaN) {
                    }
                }
                cos = Float.NaN;
                if (Float.isNaN(cos)) {
                }
                f7 = cos;
                isNaN = Float.isNaN(f7);
                float f82222222222 = this.f5859d;
                float f92222222222 = this.f5857b;
                if (!isNaN) {
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
                f7 = cos;
                isNaN = Float.isNaN(f7);
                float f822222222222 = this.f5859d;
                float f922222222222 = this.f5857b;
                if (!isNaN) {
                }
            }
            f7 = y3;
            isNaN = Float.isNaN(f7);
            float f8222222222222 = this.f5859d;
            float f9222222222222 = this.f5857b;
            if (!isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0610u) {
            C0610u c0610u = (C0610u) obj;
            if (this.f5856a == c0610u.f5856a && this.f5857b == c0610u.f5857b && this.f5858c == c0610u.f5858c && this.f5859d == c0610u.f5859d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5859d) + AbstractC0080b.a(this.f5858c, AbstractC0080b.a(this.f5857b, Float.hashCode(this.f5856a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f5856a);
        sb.append(", b=");
        sb.append(this.f5857b);
        sb.append(", c=");
        sb.append(this.f5858c);
        sb.append(", d=");
        return AbstractC0080b.j(sb, this.f5859d, ')');
    }
}
