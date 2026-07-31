package c0;

import b0.M;
import java.util.Arrays;

/* renamed from: c0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371q extends AbstractC0357c {

    /* renamed from: r, reason: collision with root package name */
    public static final B.r f5521r = new B.r(10);

    /* renamed from: d, reason: collision with root package name */
    public final C0373s f5522d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5523e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5524f;

    /* renamed from: g, reason: collision with root package name */
    public final C0372r f5525g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f5526h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f5527i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f5528j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0363i f5529k;

    /* renamed from: l, reason: collision with root package name */
    public final C0370p f5530l;

    /* renamed from: m, reason: collision with root package name */
    public final C0367m f5531m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0363i f5532n;

    /* renamed from: o, reason: collision with root package name */
    public final C0370p f5533o;

    /* renamed from: p, reason: collision with root package name */
    public final C0367m f5534p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5535q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0226, code lost:
    
        if (c0.AbstractC0364j.f(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0371q(String str, float[] fArr, C0373s c0373s, float[] fArr2, InterfaceC0363i interfaceC0363i, InterfaceC0363i interfaceC0363i2, float f3, float f4, C0372r c0372r, int i3) {
        super(str, AbstractC0356b.f5466a, i3);
        int i4;
        boolean z3;
        int i5 = 0;
        int i6 = 1;
        this.f5522d = c0373s;
        this.f5523e = f3;
        this.f5524f = f4;
        this.f5525g = c0372r;
        this.f5529k = interfaceC0363i;
        this.f5530l = new C0370p(this, i6);
        this.f5531m = new C0367m(this, i5);
        this.f5532n = interfaceC0363i2;
        this.f5533o = new C0370p(this, i5);
        this.f5534p = new C0367m(this, i6);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f3 >= f4) {
            throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f4 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f5526h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            float f20 = 1;
            float f21 = (f20 - f14) / f15;
            float f22 = (f20 - f16) / f17;
            float f23 = (f20 - f18) / f19;
            float f24 = c0373s.f5543a;
            float f25 = c0373s.f5544b;
            float f26 = (f20 - f24) / f25;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f24 / f25) - f27;
            float f30 = f22 - f21;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f21) * f28) - (f29 * f30)) / (((f23 - f21) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.f5527i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f5527i = fArr2;
        }
        this.f5528j = AbstractC0364j.g(this.f5527i);
        float b3 = AbstractC0364j.b(fArr3);
        float[] fArr4 = C0358d.f5474a;
        if (b3 / AbstractC0364j.b(C0358d.f5475b) > 0.9f) {
            float[] fArr5 = C0358d.f5474a;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[1];
            float f41 = fArr5[1];
            float f42 = fArr3[2] - fArr5[2];
            float f43 = fArr3[3] - fArr5[3];
            float f44 = fArr3[4];
            float f45 = fArr5[4];
            float f46 = fArr3[5];
            float f47 = fArr5[5];
            float[] fArr6 = {f38 - f39, f40 - f41, f42, f43, f44 - f45, f46 - f47};
            if (AbstractC0364j.f(fArr6[0], fArr6[1], f39 - f45, f41 - f47) >= 0.0f) {
                if (AbstractC0364j.f(fArr5[0] - fArr5[2], fArr5[1] - fArr5[3], fArr6[0], fArr6[1]) >= 0.0f && AbstractC0364j.f(fArr6[2], fArr6[3], fArr5[2] - fArr5[0], fArr5[3] - fArr5[1]) >= 0.0f && AbstractC0364j.f(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) >= 0.0f && AbstractC0364j.f(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) >= 0.0f) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                int i7 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    z3 = 1;
                } else {
                    float[] fArr7 = C0358d.f5474a;
                    if (fArr3 != fArr7) {
                        for (int i8 = i4; i8 < 6; i8++) {
                            if (Float.compare(fArr3[i8], fArr7[i8]) != 0 && Math.abs(fArr3[i8] - fArr7[i8]) > 0.001f) {
                                break;
                            }
                        }
                    }
                    if (AbstractC0364j.d(c0373s, AbstractC0364j.f5506d) && f3 == 0.0f && f4 == 1.0f) {
                        float[] fArr8 = C0358d.f5474a;
                        C0371q c0371q = C0358d.f5476c;
                        for (double d3 = 0.0d; d3 <= 1.0d; d3 += 0.00392156862745098d) {
                            if (Math.abs(interfaceC0363i.b(d3) - c0371q.f5529k.b(d3)) <= 0.001d && Math.abs(interfaceC0363i2.b(d3) - c0371q.f5532n.b(d3)) <= 0.001d) {
                            }
                        }
                        z3 = 1;
                    }
                    z3 = i4;
                }
                this.f5535q = z3;
            }
        }
        i4 = 0;
        int i72 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i3 != 0) {
        }
        this.f5535q = z3;
    }

    @Override // c0.AbstractC0357c
    public final float a(int i3) {
        return this.f5524f;
    }

    @Override // c0.AbstractC0357c
    public final float b(int i3) {
        return this.f5523e;
    }

    @Override // c0.AbstractC0357c
    public final boolean c() {
        return this.f5535q;
    }

    @Override // c0.AbstractC0357c
    public final long d(float f3, float f4, float f5) {
        double d3 = f3;
        C0367m c0367m = this.f5534p;
        float b3 = (float) c0367m.b(d3);
        float b4 = (float) c0367m.b(f4);
        float b5 = (float) c0367m.b(f5);
        float[] fArr = this.f5527i;
        float f6 = (fArr[6] * b5) + (fArr[3] * b4) + (fArr[0] * b3);
        float f7 = (fArr[7] * b5) + (fArr[4] * b4) + (fArr[1] * b3);
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // c0.AbstractC0357c
    public final float e(float f3, float f4, float f5) {
        double d3 = f3;
        C0367m c0367m = this.f5534p;
        float b3 = (float) c0367m.b(d3);
        float b4 = (float) c0367m.b(f4);
        float b5 = (float) c0367m.b(f5);
        float[] fArr = this.f5527i;
        return (fArr[8] * b5) + (fArr[5] * b4) + (fArr[2] * b3);
    }

    @Override // c0.AbstractC0357c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0371q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0371q c0371q = (C0371q) obj;
        if (Float.compare(c0371q.f5523e, this.f5523e) != 0 || Float.compare(c0371q.f5524f, this.f5524f) != 0 || !f2.j.a(this.f5522d, c0371q.f5522d) || !Arrays.equals(this.f5526h, c0371q.f5526h)) {
            return false;
        }
        C0372r c0372r = c0371q.f5525g;
        C0372r c0372r2 = this.f5525g;
        if (c0372r2 != null) {
            return f2.j.a(c0372r2, c0372r);
        }
        if (c0372r == null) {
            return true;
        }
        if (f2.j.a(this.f5529k, c0371q.f5529k)) {
            return f2.j.a(this.f5532n, c0371q.f5532n);
        }
        return false;
    }

    @Override // c0.AbstractC0357c
    public final long f(float f3, float f4, float f5, float f6, AbstractC0357c abstractC0357c) {
        float[] fArr = this.f5528j;
        float f7 = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
        C0367m c0367m = this.f5531m;
        return M.b((float) c0367m.b(f7), (float) c0367m.b(f8), (float) c0367m.b(f9), f6, abstractC0357c);
    }

    @Override // c0.AbstractC0357c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f5526h) + ((this.f5522d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f5523e;
        int floatToIntBits = (hashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f4 = this.f5524f;
        int floatToIntBits2 = (floatToIntBits + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        C0372r c0372r = this.f5525g;
        int hashCode2 = floatToIntBits2 + (c0372r != null ? c0372r.hashCode() : 0);
        if (c0372r == null) {
            return this.f5532n.hashCode() + ((this.f5529k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0371q(String str, float[] fArr, C0373s c0373s, final C0372r c0372r, int i3) {
        this(str, fArr, c0373s, null, r6, r0, 0.0f, 1.0f, c0372r, i3);
        InterfaceC0363i interfaceC0363i;
        InterfaceC0363i interfaceC0363i2;
        double d3 = c0372r.f5541f;
        double d4 = c0372r.f5542g;
        if (d3 == 0.0d && d4 == 0.0d) {
            final int i4 = 0;
            interfaceC0363i = new InterfaceC0363i() { // from class: c0.o
                @Override // c0.InterfaceC0363i
                public final double b(double d5) {
                    switch (i4) {
                        case 0:
                            C0372r c0372r2 = c0372r;
                            double d6 = c0372r2.f5540e;
                            double d7 = c0372r2.f5539d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0372r2.f5536a) - c0372r2.f5538c) / c0372r2.f5537b : d5 / d7;
                        case 1:
                            C0372r c0372r3 = c0372r;
                            double d8 = c0372r3.f5537b;
                            double d9 = c0372r3.f5540e;
                            double d10 = c0372r3.f5539d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0372r3.f5541f, 1.0d / c0372r3.f5536a) - c0372r3.f5538c) / d8 : (d5 - c0372r3.f5542g) / d10;
                        case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0372r c0372r4 = c0372r;
                            return d5 >= c0372r4.f5540e ? Math.pow((c0372r4.f5537b * d5) + c0372r4.f5538c, c0372r4.f5536a) : d5 * c0372r4.f5539d;
                        default:
                            C0372r c0372r5 = c0372r;
                            double d11 = c0372r5.f5537b;
                            if (d5 >= c0372r5.f5540e) {
                                return Math.pow((d11 * d5) + c0372r5.f5538c, c0372r5.f5536a) + c0372r5.f5541f;
                            }
                            return c0372r5.f5542g + (c0372r5.f5539d * d5);
                    }
                }
            };
        } else {
            final int i5 = 1;
            interfaceC0363i = new InterfaceC0363i() { // from class: c0.o
                @Override // c0.InterfaceC0363i
                public final double b(double d5) {
                    switch (i5) {
                        case 0:
                            C0372r c0372r2 = c0372r;
                            double d6 = c0372r2.f5540e;
                            double d7 = c0372r2.f5539d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0372r2.f5536a) - c0372r2.f5538c) / c0372r2.f5537b : d5 / d7;
                        case 1:
                            C0372r c0372r3 = c0372r;
                            double d8 = c0372r3.f5537b;
                            double d9 = c0372r3.f5540e;
                            double d10 = c0372r3.f5539d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0372r3.f5541f, 1.0d / c0372r3.f5536a) - c0372r3.f5538c) / d8 : (d5 - c0372r3.f5542g) / d10;
                        case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0372r c0372r4 = c0372r;
                            return d5 >= c0372r4.f5540e ? Math.pow((c0372r4.f5537b * d5) + c0372r4.f5538c, c0372r4.f5536a) : d5 * c0372r4.f5539d;
                        default:
                            C0372r c0372r5 = c0372r;
                            double d11 = c0372r5.f5537b;
                            if (d5 >= c0372r5.f5540e) {
                                return Math.pow((d11 * d5) + c0372r5.f5538c, c0372r5.f5536a) + c0372r5.f5541f;
                            }
                            return c0372r5.f5542g + (c0372r5.f5539d * d5);
                    }
                }
            };
        }
        InterfaceC0363i interfaceC0363i3 = interfaceC0363i;
        if (d3 == 0.0d && d4 == 0.0d) {
            final int i6 = 2;
            interfaceC0363i2 = new InterfaceC0363i() { // from class: c0.o
                @Override // c0.InterfaceC0363i
                public final double b(double d5) {
                    switch (i6) {
                        case 0:
                            C0372r c0372r2 = c0372r;
                            double d6 = c0372r2.f5540e;
                            double d7 = c0372r2.f5539d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0372r2.f5536a) - c0372r2.f5538c) / c0372r2.f5537b : d5 / d7;
                        case 1:
                            C0372r c0372r3 = c0372r;
                            double d8 = c0372r3.f5537b;
                            double d9 = c0372r3.f5540e;
                            double d10 = c0372r3.f5539d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0372r3.f5541f, 1.0d / c0372r3.f5536a) - c0372r3.f5538c) / d8 : (d5 - c0372r3.f5542g) / d10;
                        case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0372r c0372r4 = c0372r;
                            return d5 >= c0372r4.f5540e ? Math.pow((c0372r4.f5537b * d5) + c0372r4.f5538c, c0372r4.f5536a) : d5 * c0372r4.f5539d;
                        default:
                            C0372r c0372r5 = c0372r;
                            double d11 = c0372r5.f5537b;
                            if (d5 >= c0372r5.f5540e) {
                                return Math.pow((d11 * d5) + c0372r5.f5538c, c0372r5.f5536a) + c0372r5.f5541f;
                            }
                            return c0372r5.f5542g + (c0372r5.f5539d * d5);
                    }
                }
            };
        } else {
            final int i7 = 3;
            interfaceC0363i2 = new InterfaceC0363i() { // from class: c0.o
                @Override // c0.InterfaceC0363i
                public final double b(double d5) {
                    switch (i7) {
                        case 0:
                            C0372r c0372r2 = c0372r;
                            double d6 = c0372r2.f5540e;
                            double d7 = c0372r2.f5539d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0372r2.f5536a) - c0372r2.f5538c) / c0372r2.f5537b : d5 / d7;
                        case 1:
                            C0372r c0372r3 = c0372r;
                            double d8 = c0372r3.f5537b;
                            double d9 = c0372r3.f5540e;
                            double d10 = c0372r3.f5539d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0372r3.f5541f, 1.0d / c0372r3.f5536a) - c0372r3.f5538c) / d8 : (d5 - c0372r3.f5542g) / d10;
                        case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0372r c0372r4 = c0372r;
                            return d5 >= c0372r4.f5540e ? Math.pow((c0372r4.f5537b * d5) + c0372r4.f5538c, c0372r4.f5536a) : d5 * c0372r4.f5539d;
                        default:
                            C0372r c0372r5 = c0372r;
                            double d11 = c0372r5.f5537b;
                            if (d5 >= c0372r5.f5540e) {
                                return Math.pow((d11 * d5) + c0372r5.f5538c, c0372r5.f5536a) + c0372r5.f5541f;
                            }
                            return c0372r5.f5542g + (c0372r5.f5539d * d5);
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0371q(String str, float[] fArr, C0373s c0373s, final double d3, float f3, float f4, int i3) {
        this(str, fArr, c0373s, null, r11, r3, f3, f4, new C0372r(d3, 1.0d, 0.0d, 0.0d, 0.0d), i3);
        InterfaceC0363i interfaceC0363i;
        InterfaceC0363i interfaceC0363i2 = f5521r;
        if (d3 == 1.0d) {
            interfaceC0363i = interfaceC0363i2;
        } else {
            final int i4 = 0;
            interfaceC0363i = new InterfaceC0363i() { // from class: c0.n
                @Override // c0.InterfaceC0363i
                public final double b(double d4) {
                    switch (i4) {
                        case 0:
                            if (d4 < 0.0d) {
                                d4 = 0.0d;
                            }
                            return Math.pow(d4, 1.0d / d3);
                        default:
                            if (d4 < 0.0d) {
                                d4 = 0.0d;
                            }
                            return Math.pow(d4, d3);
                    }
                }
            };
        }
        if (d3 != 1.0d) {
            final int i5 = 1;
            interfaceC0363i2 = new InterfaceC0363i() { // from class: c0.n
                @Override // c0.InterfaceC0363i
                public final double b(double d4) {
                    switch (i5) {
                        case 0:
                            if (d4 < 0.0d) {
                                d4 = 0.0d;
                            }
                            return Math.pow(d4, 1.0d / d3);
                        default:
                            if (d4 < 0.0d) {
                                d4 = 0.0d;
                            }
                            return Math.pow(d4, d3);
                    }
                }
            };
        }
    }
}
