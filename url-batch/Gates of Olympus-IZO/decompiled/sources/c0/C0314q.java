package c0;

import b0.AbstractC0259J;
import h1.C0438i;
import java.util.Arrays;

/* renamed from: c0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314q extends AbstractC0300c {

    /* renamed from: r, reason: collision with root package name */
    public static final B2.a f4395r = new B2.a(3);

    /* renamed from: d, reason: collision with root package name */
    public final C0316s f4396d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4397e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4398f;

    /* renamed from: g, reason: collision with root package name */
    public final C0315r f4399g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4400h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f4401i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f4402j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0306i f4403k;

    /* renamed from: l, reason: collision with root package name */
    public final C0313p f4404l;

    /* renamed from: m, reason: collision with root package name */
    public final C0310m f4405m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0306i f4406n;

    /* renamed from: o, reason: collision with root package name */
    public final C0313p f4407o;
    public final C0310m p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4408q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0226, code lost:
    
        if (c0.AbstractC0307j.f(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0314q(String str, float[] fArr, C0316s c0316s, float[] fArr2, InterfaceC0306i interfaceC0306i, InterfaceC0306i interfaceC0306i2, float f3, float f4, C0315r c0315r, int i3) {
        super(str, AbstractC0299b.f4341a, i3);
        int i4;
        boolean z3;
        int i5 = 0;
        int i6 = 1;
        this.f4396d = c0316s;
        this.f4397e = f3;
        this.f4398f = f4;
        this.f4399g = c0315r;
        this.f4403k = interfaceC0306i;
        this.f4404l = new C0313p(this, i6);
        this.f4405m = new C0310m(this, i5);
        this.f4406n = interfaceC0306i2;
        this.f4407o = new C0313p(this, i5);
        this.p = new C0310m(this, i6);
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
        this.f4400h = fArr3;
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
            float f24 = c0316s.f4416a;
            float f25 = c0316s.f4417b;
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
            this.f4401i = new float[]{f35 * f14, f34, ((1.0f - f14) - f15) * f35, f36 * f16, f33, ((1.0f - f16) - f17) * f36, f37 * f18, f32, ((1.0f - f18) - f19) * f37};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f4401i = fArr2;
        }
        this.f4402j = AbstractC0307j.g(this.f4401i);
        float b2 = AbstractC0307j.b(fArr3);
        float[] fArr4 = C0301d.f4349a;
        if (b2 / AbstractC0307j.b(C0301d.f4350b) > 0.9f) {
            float[] fArr5 = C0301d.f4349a;
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
            if (AbstractC0307j.f(fArr6[0], fArr6[1], f39 - f45, f41 - f47) >= 0.0f) {
                if (AbstractC0307j.f(fArr5[0] - fArr5[2], fArr5[1] - fArr5[3], fArr6[0], fArr6[1]) >= 0.0f && AbstractC0307j.f(fArr6[2], fArr6[3], fArr5[2] - fArr5[0], fArr5[3] - fArr5[1]) >= 0.0f && AbstractC0307j.f(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) >= 0.0f && AbstractC0307j.f(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) >= 0.0f) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                int i7 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    z3 = 1;
                } else {
                    float[] fArr7 = C0301d.f4349a;
                    if (fArr3 != fArr7) {
                        for (int i8 = i4; i8 < 6; i8++) {
                            if (Float.compare(fArr3[i8], fArr7[i8]) != 0 && Math.abs(fArr3[i8] - fArr7[i8]) > 0.001f) {
                                break;
                            }
                        }
                    }
                    if (AbstractC0307j.d(c0316s, AbstractC0307j.f4380d) && f3 == 0.0f && f4 == 1.0f) {
                        float[] fArr8 = C0301d.f4349a;
                        C0314q c0314q = C0301d.f4351c;
                        for (double d3 = 0.0d; d3 <= 1.0d; d3 += 0.00392156862745098d) {
                            if (Math.abs(interfaceC0306i.b(d3) - c0314q.f4403k.b(d3)) <= 0.001d && Math.abs(interfaceC0306i2.b(d3) - c0314q.f4406n.b(d3)) <= 0.001d) {
                            }
                        }
                        z3 = 1;
                    }
                    z3 = i4;
                }
                this.f4408q = z3;
            }
        }
        i4 = 0;
        int i72 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i3 != 0) {
        }
        this.f4408q = z3;
    }

    @Override // c0.AbstractC0300c
    public final float a(int i3) {
        return this.f4398f;
    }

    @Override // c0.AbstractC0300c
    public final float b(int i3) {
        return this.f4397e;
    }

    @Override // c0.AbstractC0300c
    public final boolean c() {
        return this.f4408q;
    }

    @Override // c0.AbstractC0300c
    public final long d(float f3, float f4, float f5) {
        double d3 = f3;
        C0310m c0310m = this.p;
        float b2 = (float) c0310m.b(d3);
        float b3 = (float) c0310m.b(f4);
        float b4 = (float) c0310m.b(f5);
        float[] fArr = this.f4401i;
        float f6 = (fArr[6] * b4) + (fArr[3] * b3) + (fArr[0] * b2);
        float f7 = (fArr[7] * b4) + (fArr[4] * b3) + (fArr[1] * b2);
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // c0.AbstractC0300c
    public final float e(float f3, float f4, float f5) {
        double d3 = f3;
        C0310m c0310m = this.p;
        float b2 = (float) c0310m.b(d3);
        float b3 = (float) c0310m.b(f4);
        float b4 = (float) c0310m.b(f5);
        float[] fArr = this.f4401i;
        return (fArr[8] * b4) + (fArr[5] * b3) + (fArr[2] * b2);
    }

    @Override // c0.AbstractC0300c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0314q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0314q c0314q = (C0314q) obj;
        if (Float.compare(c0314q.f4397e, this.f4397e) != 0 || Float.compare(c0314q.f4398f, this.f4398f) != 0 || !Z1.i.a(this.f4396d, c0314q.f4396d) || !Arrays.equals(this.f4400h, c0314q.f4400h)) {
            return false;
        }
        C0315r c0315r = c0314q.f4399g;
        C0315r c0315r2 = this.f4399g;
        if (c0315r2 != null) {
            return Z1.i.a(c0315r2, c0315r);
        }
        if (c0315r == null) {
            return true;
        }
        if (Z1.i.a(this.f4403k, c0314q.f4403k)) {
            return Z1.i.a(this.f4406n, c0314q.f4406n);
        }
        return false;
    }

    @Override // c0.AbstractC0300c
    public final long f(float f3, float f4, float f5, float f6, AbstractC0300c abstractC0300c) {
        float[] fArr = this.f4402j;
        float f7 = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
        C0310m c0310m = this.f4405m;
        return AbstractC0259J.a((float) c0310m.b(f7), (float) c0310m.b(f8), (float) c0310m.b(f9), f6, abstractC0300c);
    }

    @Override // c0.AbstractC0300c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f4400h) + ((this.f4396d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f4397e;
        int floatToIntBits = (hashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f4 = this.f4398f;
        int floatToIntBits2 = (floatToIntBits + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        C0315r c0315r = this.f4399g;
        int hashCode2 = floatToIntBits2 + (c0315r != null ? c0315r.hashCode() : 0);
        if (c0315r == null) {
            return this.f4406n.hashCode() + ((this.f4403k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0314q(String str, float[] fArr, C0316s c0316s, final C0315r c0315r, int i3) {
        this(str, fArr, c0316s, null, r6, r0, 0.0f, 1.0f, c0315r, i3);
        InterfaceC0306i interfaceC0306i;
        InterfaceC0306i interfaceC0306i2;
        double d3 = c0315r.f4414f;
        double d4 = c0315r.f4415g;
        if (d3 == 0.0d && d4 == 0.0d) {
            final int i4 = 0;
            interfaceC0306i = new InterfaceC0306i() { // from class: c0.o
                @Override // c0.InterfaceC0306i
                public final double b(double d5) {
                    switch (i4) {
                        case 0:
                            C0315r c0315r2 = c0315r;
                            double d6 = c0315r2.f4413e;
                            double d7 = c0315r2.f4412d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0315r2.f4409a) - c0315r2.f4411c) / c0315r2.f4410b : d5 / d7;
                        case 1:
                            C0315r c0315r3 = c0315r;
                            double d8 = c0315r3.f4410b;
                            double d9 = c0315r3.f4413e;
                            double d10 = c0315r3.f4412d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0315r3.f4414f, 1.0d / c0315r3.f4409a) - c0315r3.f4411c) / d8 : (d5 - c0315r3.f4415g) / d10;
                        case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0315r c0315r4 = c0315r;
                            return d5 >= c0315r4.f4413e ? Math.pow((c0315r4.f4410b * d5) + c0315r4.f4411c, c0315r4.f4409a) : d5 * c0315r4.f4412d;
                        default:
                            C0315r c0315r5 = c0315r;
                            double d11 = c0315r5.f4410b;
                            if (d5 >= c0315r5.f4413e) {
                                return Math.pow((d11 * d5) + c0315r5.f4411c, c0315r5.f4409a) + c0315r5.f4414f;
                            }
                            return c0315r5.f4415g + (c0315r5.f4412d * d5);
                    }
                }
            };
        } else {
            final int i5 = 1;
            interfaceC0306i = new InterfaceC0306i() { // from class: c0.o
                @Override // c0.InterfaceC0306i
                public final double b(double d5) {
                    switch (i5) {
                        case 0:
                            C0315r c0315r2 = c0315r;
                            double d6 = c0315r2.f4413e;
                            double d7 = c0315r2.f4412d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0315r2.f4409a) - c0315r2.f4411c) / c0315r2.f4410b : d5 / d7;
                        case 1:
                            C0315r c0315r3 = c0315r;
                            double d8 = c0315r3.f4410b;
                            double d9 = c0315r3.f4413e;
                            double d10 = c0315r3.f4412d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0315r3.f4414f, 1.0d / c0315r3.f4409a) - c0315r3.f4411c) / d8 : (d5 - c0315r3.f4415g) / d10;
                        case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0315r c0315r4 = c0315r;
                            return d5 >= c0315r4.f4413e ? Math.pow((c0315r4.f4410b * d5) + c0315r4.f4411c, c0315r4.f4409a) : d5 * c0315r4.f4412d;
                        default:
                            C0315r c0315r5 = c0315r;
                            double d11 = c0315r5.f4410b;
                            if (d5 >= c0315r5.f4413e) {
                                return Math.pow((d11 * d5) + c0315r5.f4411c, c0315r5.f4409a) + c0315r5.f4414f;
                            }
                            return c0315r5.f4415g + (c0315r5.f4412d * d5);
                    }
                }
            };
        }
        InterfaceC0306i interfaceC0306i3 = interfaceC0306i;
        if (d3 == 0.0d && d4 == 0.0d) {
            final int i6 = 2;
            interfaceC0306i2 = new InterfaceC0306i() { // from class: c0.o
                @Override // c0.InterfaceC0306i
                public final double b(double d5) {
                    switch (i6) {
                        case 0:
                            C0315r c0315r2 = c0315r;
                            double d6 = c0315r2.f4413e;
                            double d7 = c0315r2.f4412d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0315r2.f4409a) - c0315r2.f4411c) / c0315r2.f4410b : d5 / d7;
                        case 1:
                            C0315r c0315r3 = c0315r;
                            double d8 = c0315r3.f4410b;
                            double d9 = c0315r3.f4413e;
                            double d10 = c0315r3.f4412d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0315r3.f4414f, 1.0d / c0315r3.f4409a) - c0315r3.f4411c) / d8 : (d5 - c0315r3.f4415g) / d10;
                        case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0315r c0315r4 = c0315r;
                            return d5 >= c0315r4.f4413e ? Math.pow((c0315r4.f4410b * d5) + c0315r4.f4411c, c0315r4.f4409a) : d5 * c0315r4.f4412d;
                        default:
                            C0315r c0315r5 = c0315r;
                            double d11 = c0315r5.f4410b;
                            if (d5 >= c0315r5.f4413e) {
                                return Math.pow((d11 * d5) + c0315r5.f4411c, c0315r5.f4409a) + c0315r5.f4414f;
                            }
                            return c0315r5.f4415g + (c0315r5.f4412d * d5);
                    }
                }
            };
        } else {
            final int i7 = 3;
            interfaceC0306i2 = new InterfaceC0306i() { // from class: c0.o
                @Override // c0.InterfaceC0306i
                public final double b(double d5) {
                    switch (i7) {
                        case 0:
                            C0315r c0315r2 = c0315r;
                            double d6 = c0315r2.f4413e;
                            double d7 = c0315r2.f4412d;
                            return d5 >= d6 * d7 ? (Math.pow(d5, 1.0d / c0315r2.f4409a) - c0315r2.f4411c) / c0315r2.f4410b : d5 / d7;
                        case 1:
                            C0315r c0315r3 = c0315r;
                            double d8 = c0315r3.f4410b;
                            double d9 = c0315r3.f4413e;
                            double d10 = c0315r3.f4412d;
                            return d5 >= d9 * d10 ? (Math.pow(d5 - c0315r3.f4414f, 1.0d / c0315r3.f4409a) - c0315r3.f4411c) / d8 : (d5 - c0315r3.f4415g) / d10;
                        case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                            C0315r c0315r4 = c0315r;
                            return d5 >= c0315r4.f4413e ? Math.pow((c0315r4.f4410b * d5) + c0315r4.f4411c, c0315r4.f4409a) : d5 * c0315r4.f4412d;
                        default:
                            C0315r c0315r5 = c0315r;
                            double d11 = c0315r5.f4410b;
                            if (d5 >= c0315r5.f4413e) {
                                return Math.pow((d11 * d5) + c0315r5.f4411c, c0315r5.f4409a) + c0315r5.f4414f;
                            }
                            return c0315r5.f4415g + (c0315r5.f4412d * d5);
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0314q(String str, float[] fArr, C0316s c0316s, final double d3, float f3, float f4, int i3) {
        this(str, fArr, c0316s, null, r11, r3, f3, f4, new C0315r(d3, 1.0d, 0.0d, 0.0d, 0.0d), i3);
        InterfaceC0306i interfaceC0306i;
        InterfaceC0306i interfaceC0306i2 = f4395r;
        if (d3 == 1.0d) {
            interfaceC0306i = interfaceC0306i2;
        } else {
            final int i4 = 0;
            interfaceC0306i = new InterfaceC0306i() { // from class: c0.n
                @Override // c0.InterfaceC0306i
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
            interfaceC0306i2 = new InterfaceC0306i() { // from class: c0.n
                @Override // c0.InterfaceC0306i
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
