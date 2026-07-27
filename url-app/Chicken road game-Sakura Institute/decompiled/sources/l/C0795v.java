package l;

import A.AbstractC0017m;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795v implements InterfaceC0797x {

    /* renamed from: a, reason: collision with root package name */
    public final float f7847a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7848b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7849c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7850d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7851e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7852f;

    public C0795v(float f4, float f5, float f6, float f7) {
        int H3;
        this.f7847a = f4;
        this.f7848b = f5;
        this.f7849c = f6;
        this.f7850d = f7;
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f4 + ", " + f5 + ", " + f6 + ", " + f7 + '.');
        }
        float[] fArr = new float[5];
        float f8 = (f5 - 0.0f) * 3.0f;
        float f9 = (f7 - f5) * 3.0f;
        float f10 = (1.0f - f7) * 3.0f;
        double d4 = f8;
        double d5 = f9;
        double d6 = f10;
        double d7 = d5 * 2.0d;
        double d8 = (d4 - d7) + d6;
        if (d8 == 0.0d) {
            H3 = d5 == d6 ? 0 : Z.K.H((float) ((d7 - d6) / (d7 - (d6 * 2.0d))), fArr, 0);
        } else {
            double d9 = -Math.sqrt((d5 * d5) - (d6 * d4));
            double d10 = (-d4) + d5;
            int H4 = Z.K.H((float) ((-(d9 + d10)) / d8), fArr, 0);
            H3 = Z.K.H((float) ((d9 - d10) / d8), fArr, H4) + H4;
            if (H3 > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    H3--;
                }
            }
        }
        float f13 = (f9 - f8) * 2.0f;
        int H5 = Z.K.H((-f13) / (((f10 - f9) * 2.0f) - f13), fArr, H3) + H3;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < H5; i2++) {
            float f14 = fArr[i2];
            float f15 = (((((((((f5 - f7) * 3.0f) + 1.0f) - 0.0f) * f14) + (((f7 - (f5 * 2.0f)) + 0.0f) * 3.0f)) * f14) + f8) * f14) + 0.0f;
            min = Math.min(min, f15);
            max = Math.max(max, f15);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f7851e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f7852f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
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
    @Override // l.InterfaceC0797x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f4) {
        float w4;
        float cos;
        boolean isNaN;
        if (f4 <= 0.0f || f4 >= 1.0f) {
            return f4;
        }
        float f5 = this.f7847a;
        float f6 = this.f7849c;
        float f7 = f6 - f4;
        double d4 = 0.0f - f4;
        double d5 = ((d4 - ((f5 - f4) * 2.0d)) + f7) * 3.0d;
        double d6 = (r6 - r4) * 3.0d;
        double d7 = ((r6 - f7) * 3.0d) + (-r4) + (1.0f - f4);
        float f8 = Float.NaN;
        if (Math.abs(d7 - 0.0d) >= 1.0E-7d) {
            double d8 = d5 / d7;
            double d9 = d6 / d7;
            double d10 = ((d9 * 3.0d) - (d8 * d8)) / 9.0d;
            double d11 = (((d4 / d7) * 27.0d) + ((((2.0d * d8) * d8) * d8) - ((9.0d * d8) * d9))) / 54.0d;
            double d12 = d10 * d10 * d10;
            double d13 = (d11 * d11) + d12;
            double d14 = d8 / 3.0d;
            if (d13 < 0.0d) {
                double sqrt = Math.sqrt(-d12);
                double d15 = (-d11) / sqrt;
                if (d15 < -1.0d) {
                    d15 = -1.0d;
                }
                if (d15 > 1.0d) {
                    d15 = 1.0d;
                }
                double acos = Math.acos(d15);
                double w5 = u3.d.w((float) sqrt) * 2.0f;
                cos = (float) ((Math.cos(acos / 3.0d) * w5) - d14);
                if (cos < 0.0f) {
                    if (cos >= -8.34465E-7f) {
                        cos = 0.0f;
                        if (Float.isNaN(cos)) {
                            cos = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * w5) - d14);
                            if (cos < 0.0f) {
                                if (cos >= -8.34465E-7f) {
                                    cos = 0.0f;
                                    if (Float.isNaN(cos)) {
                                        w4 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * w5) - d14);
                                        if (w4 >= 0.0f) {
                                            if (w4 > 1.0f) {
                                            }
                                            f8 = w4;
                                            isNaN = Float.isNaN(f8);
                                            float f9 = this.f7850d;
                                            float f10 = this.f7848b;
                                            if (!isNaN) {
                                            }
                                        }
                                        w4 = Float.NaN;
                                        f8 = w4;
                                        isNaN = Float.isNaN(f8);
                                        float f92 = this.f7850d;
                                        float f102 = this.f7848b;
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
                        f8 = cos;
                        isNaN = Float.isNaN(f8);
                        float f922 = this.f7850d;
                        float f1022 = this.f7848b;
                        if (!isNaN) {
                        }
                    }
                    cos = Float.NaN;
                    if (Float.isNaN(cos)) {
                    }
                    f8 = cos;
                    isNaN = Float.isNaN(f8);
                    float f9222 = this.f7850d;
                    float f10222 = this.f7848b;
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
                    f8 = cos;
                    isNaN = Float.isNaN(f8);
                    float f92222 = this.f7850d;
                    float f102222 = this.f7848b;
                    if (!isNaN) {
                    }
                }
            } else if (d13 == 0.0d) {
                float f11 = -u3.d.w((float) d11);
                float f12 = (float) d14;
                float f13 = (f11 * 2.0f) - f12;
                if (f13 < 0.0f) {
                    if (f13 >= -8.34465E-7f) {
                        f13 = 0.0f;
                        if (Float.isNaN(f13)) {
                            w4 = (-f11) - f12;
                            if (w4 >= 0.0f) {
                                if (w4 > 1.0f) {
                                }
                            }
                            w4 = Float.NaN;
                        } else {
                            f8 = f13;
                            isNaN = Float.isNaN(f8);
                            float f922222 = this.f7850d;
                            float f1022222 = this.f7848b;
                            if (!isNaN) {
                            }
                        }
                    }
                    f13 = Float.NaN;
                    if (Float.isNaN(f13)) {
                    }
                } else {
                    if (f13 > 1.0f) {
                        if (f13 <= 1.0000008f) {
                            f13 = 1.0f;
                        }
                        f13 = Float.NaN;
                    }
                    if (Float.isNaN(f13)) {
                    }
                }
                f8 = w4;
                isNaN = Float.isNaN(f8);
                float f9222222 = this.f7850d;
                float f10222222 = this.f7848b;
                if (!isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d13);
                w4 = (float) ((u3.d.w((float) ((-d11) + sqrt2)) - u3.d.w((float) (d11 + sqrt2))) - d14);
                float f14 = 0.0f;
                if (w4 >= 0.0f) {
                    f14 = 1.0f;
                    if (w4 > 1.0f) {
                    }
                }
                f8 = w4;
                isNaN = Float.isNaN(f8);
                float f92222222 = this.f7850d;
                float f102222222 = this.f7848b;
                if (!isNaN) {
                }
            }
        } else {
            if (Math.abs(d5 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d6 - 0.0d) >= 1.0E-7d) {
                    w4 = (float) ((-d4) / d6);
                    if (w4 >= 0.0f) {
                        if (w4 > 1.0f) {
                        }
                        f8 = w4;
                    }
                    w4 = Float.NaN;
                    f8 = w4;
                }
                isNaN = Float.isNaN(f8);
                float f922222222 = this.f7850d;
                float f1022222222 = this.f7848b;
                if (!isNaN) {
                    float f15 = ((((((f1022222222 - f922222222) + 0.33333334f) * f8) + (f922222222 - (2.0f * f1022222222))) * f8) + f1022222222) * 3.0f * f8;
                    float f16 = this.f7851e;
                    if (f15 < f16) {
                        f15 = f16;
                    }
                    float f17 = this.f7852f;
                    return f15 > f17 ? f17 : f15;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f5 + ", " + f1022222222 + ", " + f6 + ", " + f922222222 + ") has no solution at " + f4);
            }
            double sqrt3 = Math.sqrt((d6 * d6) - ((4.0d * d5) * d4));
            double d16 = d5 * 2.0d;
            cos = (float) ((sqrt3 - d6) / d16);
            if (cos < 0.0f) {
                if (cos >= -8.34465E-7f) {
                    cos = 0.0f;
                    if (Float.isNaN(cos)) {
                        w4 = (float) (((-d6) - sqrt3) / d16);
                        if (w4 >= 0.0f) {
                            if (w4 > 1.0f) {
                            }
                        }
                        w4 = Float.NaN;
                    }
                    f8 = cos;
                    isNaN = Float.isNaN(f8);
                    float f9222222222 = this.f7850d;
                    float f10222222222 = this.f7848b;
                    if (!isNaN) {
                    }
                }
                cos = Float.NaN;
                if (Float.isNaN(cos)) {
                }
                f8 = cos;
                isNaN = Float.isNaN(f8);
                float f92222222222 = this.f7850d;
                float f102222222222 = this.f7848b;
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
                f8 = cos;
                isNaN = Float.isNaN(f8);
                float f922222222222 = this.f7850d;
                float f1022222222222 = this.f7848b;
                if (!isNaN) {
                }
            }
            f8 = w4;
            isNaN = Float.isNaN(f8);
            float f9222222222222 = this.f7850d;
            float f10222222222222 = this.f7848b;
            if (!isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0795v) {
            C0795v c0795v = (C0795v) obj;
            if (this.f7847a == c0795v.f7847a && this.f7848b == c0795v.f7848b && this.f7849c == c0795v.f7849c && this.f7850d == c0795v.f7850d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7850d) + AbstractC0017m.a(this.f7849c, AbstractC0017m.a(this.f7848b, Float.hashCode(this.f7847a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f7847a);
        sb.append(", b=");
        sb.append(this.f7848b);
        sb.append(", c=");
        sb.append(this.f7849c);
        sb.append(", d=");
        return AbstractC0017m.k(sb, this.f7850d, ')');
    }
}
