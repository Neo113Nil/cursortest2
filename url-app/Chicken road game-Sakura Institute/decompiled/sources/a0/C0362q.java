package a0;

import A.C0022s;
import Z.K;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362q extends AbstractC0348c {

    /* renamed from: r, reason: collision with root package name */
    public static final C0022s f4808r = new C0022s(14);

    /* renamed from: d, reason: collision with root package name */
    public final C0364s f4809d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4810e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4811f;

    /* renamed from: g, reason: collision with root package name */
    public final C0363r f4812g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f4813h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f4814i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f4815j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0354i f4816k;

    /* renamed from: l, reason: collision with root package name */
    public final C0361p f4817l;

    /* renamed from: m, reason: collision with root package name */
    public final C0358m f4818m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0354i f4819n;

    /* renamed from: o, reason: collision with root package name */
    public final C0361p f4820o;

    /* renamed from: p, reason: collision with root package name */
    public final C0358m f4821p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4822q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0230, code lost:
    
        if (a0.AbstractC0355j.f(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0362q(String str, float[] fArr, C0364s c0364s, float[] fArr2, InterfaceC0354i interfaceC0354i, InterfaceC0354i interfaceC0354i2, float f4, float f5, C0363r c0363r, int i2) {
        super(i2, AbstractC0347b.f4753a, str);
        int i4;
        boolean z4;
        this.f4809d = c0364s;
        this.f4810e = f4;
        this.f4811f = f5;
        this.f4812g = c0363r;
        this.f4816k = interfaceC0354i;
        this.f4817l = new C0361p(this, 1);
        this.f4818m = new C0358m(this, 0);
        this.f4819n = interfaceC0354i2;
        this.f4820o = new C0361p(this, 0);
        this.f4821p = new C0358m(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f4 >= f5) {
            throw new IllegalArgumentException("Invalid range: min=" + f4 + ", max=" + f5 + "; min must be strictly < max");
        }
        float[] destination = new float[6];
        if (fArr.length == 9) {
            float f6 = fArr[0];
            float f7 = fArr[1];
            float f8 = f6 + f7 + fArr[2];
            destination[0] = f6 / f8;
            destination[1] = f7 / f8;
            float f9 = fArr[3];
            float f10 = fArr[4];
            float f11 = f9 + f10 + fArr[5];
            destination[2] = f9 / f11;
            destination[3] = f10 / f11;
            float f12 = fArr[6];
            float f13 = fArr[7];
            float f14 = f12 + f13 + fArr[8];
            destination[4] = f12 / f14;
            destination[5] = f13 / f14;
        } else {
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(fArr, 0, destination, 0, 6);
        }
        this.f4813h = destination;
        if (fArr2 == null) {
            float f15 = destination[0];
            float f16 = destination[1];
            float f17 = destination[2];
            float f18 = destination[3];
            float f19 = destination[4];
            float f20 = destination[5];
            float f21 = 1;
            float f22 = (f21 - f15) / f16;
            float f23 = (f21 - f17) / f18;
            float f24 = (f21 - f19) / f20;
            float f25 = c0364s.f4830a;
            float f26 = c0364s.f4831b;
            float f27 = (f21 - f25) / f26;
            float f28 = f15 / f16;
            float f29 = (f17 / f18) - f28;
            float f30 = (f25 / f26) - f28;
            float f31 = f23 - f22;
            float f32 = (f19 / f20) - f28;
            float f33 = (((f27 - f22) * f29) - (f30 * f31)) / (((f24 - f22) * f29) - (f31 * f32));
            float f34 = (f30 - (f32 * f33)) / f29;
            float f35 = (1.0f - f34) - f33;
            float f36 = f35 / f16;
            float f37 = f34 / f18;
            float f38 = f33 / f20;
            this.f4814i = new float[]{f36 * f15, f35, ((1.0f - f15) - f16) * f36, f37 * f17, f34, ((1.0f - f17) - f18) * f37, f38 * f19, f33, ((1.0f - f19) - f20) * f38};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f4814i = fArr2;
        }
        this.f4815j = AbstractC0355j.g(this.f4814i);
        float b4 = AbstractC0355j.b(destination);
        float[] fArr3 = C0349d.f4761a;
        if (b4 / AbstractC0355j.b(C0349d.f4762b) > 0.9f) {
            float[] fArr4 = C0349d.f4761a;
            float f39 = destination[0];
            float f40 = fArr4[0];
            float f41 = destination[1];
            float f42 = fArr4[1];
            float f43 = destination[2] - fArr4[2];
            float f44 = destination[3] - fArr4[3];
            float f45 = destination[4];
            float f46 = fArr4[4];
            float f47 = destination[5];
            float f48 = fArr4[5];
            float[] fArr5 = {f39 - f40, f41 - f42, f43, f44, f45 - f46, f47 - f48};
            if (AbstractC0355j.f(fArr5[0], fArr5[1], f40 - f46, f42 - f48) >= 0.0f) {
                if (AbstractC0355j.f(fArr4[0] - fArr4[2], fArr4[1] - fArr4[3], fArr5[0], fArr5[1]) >= 0.0f && AbstractC0355j.f(fArr5[2], fArr5[3], fArr4[2] - fArr4[0], fArr4[3] - fArr4[1]) >= 0.0f && AbstractC0355j.f(fArr4[2] - fArr4[4], fArr4[3] - fArr4[5], fArr5[2], fArr5[3]) >= 0.0f && AbstractC0355j.f(fArr5[4], fArr5[5], fArr4[4] - fArr4[2], fArr4[5] - fArr4[3]) >= 0.0f) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                int i5 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    z4 = 1;
                } else {
                    float[] fArr6 = C0349d.f4761a;
                    if (destination != fArr6) {
                        for (int i6 = i4; i6 < 6; i6++) {
                            if (Float.compare(destination[i6], fArr6[i6]) != 0 && Math.abs(destination[i6] - fArr6[i6]) > 0.001f) {
                                break;
                            }
                        }
                    }
                    if (AbstractC0355j.d(c0364s, AbstractC0355j.f4793d) && f4 == 0.0f && f5 == 1.0f) {
                        float[] fArr7 = C0349d.f4761a;
                        C0362q c0362q = C0349d.f4763c;
                        for (double d4 = 0.0d; d4 <= 1.0d; d4 += 0.00392156862745098d) {
                            if (Math.abs(interfaceC0354i.c(d4) - c0362q.f4816k.c(d4)) <= 0.001d && Math.abs(interfaceC0354i2.c(d4) - c0362q.f4819n.c(d4)) <= 0.001d) {
                            }
                        }
                        z4 = 1;
                    }
                    z4 = i4;
                }
                this.f4822q = z4;
            }
        }
        i4 = 0;
        int i52 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        if (i2 != 0) {
        }
        this.f4822q = z4;
    }

    @Override // a0.AbstractC0348c
    public final float a(int i2) {
        return this.f4811f;
    }

    @Override // a0.AbstractC0348c
    public final float b(int i2) {
        return this.f4810e;
    }

    @Override // a0.AbstractC0348c
    public final boolean c() {
        return this.f4822q;
    }

    @Override // a0.AbstractC0348c
    public final long d(float f4, float f5, float f6) {
        double d4 = f4;
        C0358m c0358m = this.f4821p;
        float c4 = (float) c0358m.c(d4);
        float c5 = (float) c0358m.c(f5);
        float c6 = (float) c0358m.c(f6);
        float[] fArr = this.f4814i;
        float f7 = (fArr[6] * c6) + (fArr[3] * c5) + (fArr[0] * c4);
        float f8 = (fArr[7] * c6) + (fArr[4] * c5) + (fArr[1] * c4);
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    @Override // a0.AbstractC0348c
    public final float e(float f4, float f5, float f6) {
        double d4 = f4;
        C0358m c0358m = this.f4821p;
        float c4 = (float) c0358m.c(d4);
        float c5 = (float) c0358m.c(f5);
        float c6 = (float) c0358m.c(f6);
        float[] fArr = this.f4814i;
        return (fArr[8] * c6) + (fArr[5] * c5) + (fArr[2] * c4);
    }

    @Override // a0.AbstractC0348c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0362q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0362q c0362q = (C0362q) obj;
        if (Float.compare(c0362q.f4810e, this.f4810e) != 0 || Float.compare(c0362q.f4811f, this.f4811f) != 0 || !Intrinsics.a(this.f4809d, c0362q.f4809d) || !Arrays.equals(this.f4813h, c0362q.f4813h)) {
            return false;
        }
        C0363r c0363r = c0362q.f4812g;
        C0363r c0363r2 = this.f4812g;
        if (c0363r2 != null) {
            return Intrinsics.a(c0363r2, c0363r);
        }
        if (c0363r == null) {
            return true;
        }
        if (Intrinsics.a(this.f4816k, c0362q.f4816k)) {
            return Intrinsics.a(this.f4819n, c0362q.f4819n);
        }
        return false;
    }

    @Override // a0.AbstractC0348c
    public final long f(float f4, float f5, float f6, float f7, AbstractC0348c abstractC0348c) {
        float[] fArr = this.f4815j;
        float f8 = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f4);
        float f9 = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f4);
        float f10 = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f4);
        C0358m c0358m = this.f4818m;
        return K.b((float) c0358m.c(f8), (float) c0358m.c(f9), (float) c0358m.c(f10), f7, abstractC0348c);
    }

    @Override // a0.AbstractC0348c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f4813h) + ((this.f4809d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f4 = this.f4810e;
        int floatToIntBits = (hashCode + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        float f5 = this.f4811f;
        int floatToIntBits2 = (floatToIntBits + (f5 == 0.0f ? 0 : Float.floatToIntBits(f5))) * 31;
        C0363r c0363r = this.f4812g;
        int hashCode2 = floatToIntBits2 + (c0363r != null ? c0363r.hashCode() : 0);
        if (c0363r == null) {
            return this.f4819n.hashCode() + ((this.f4816k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0362q(String str, float[] fArr, C0364s c0364s, final C0363r c0363r, int i2) {
        this(str, fArr, c0364s, null, r6, r0, 0.0f, 1.0f, c0363r, i2);
        InterfaceC0354i interfaceC0354i;
        InterfaceC0354i interfaceC0354i2;
        double d4 = c0363r.f4828f;
        double d5 = c0363r.f4829g;
        if (d4 == 0.0d && d5 == 0.0d) {
            final int i4 = 0;
            interfaceC0354i = new InterfaceC0354i() { // from class: a0.o
                @Override // a0.InterfaceC0354i
                public final double c(double d6) {
                    switch (i4) {
                        case 0:
                            C0363r c0363r2 = c0363r;
                            double d7 = c0363r2.f4827e;
                            double d8 = c0363r2.f4826d;
                            return d6 >= d7 * d8 ? (Math.pow(d6, 1.0d / c0363r2.f4823a) - c0363r2.f4825c) / c0363r2.f4824b : d6 / d8;
                        case 1:
                            C0363r c0363r3 = c0363r;
                            double d9 = c0363r3.f4824b;
                            double d10 = c0363r3.f4827e;
                            double d11 = c0363r3.f4826d;
                            return d6 >= d10 * d11 ? (Math.pow(d6 - c0363r3.f4828f, 1.0d / c0363r3.f4823a) - c0363r3.f4825c) / d9 : (d6 - c0363r3.f4829g) / d11;
                        case 2:
                            C0363r c0363r4 = c0363r;
                            return d6 >= c0363r4.f4827e ? Math.pow((c0363r4.f4824b * d6) + c0363r4.f4825c, c0363r4.f4823a) : d6 * c0363r4.f4826d;
                        default:
                            C0363r c0363r5 = c0363r;
                            double d12 = c0363r5.f4824b;
                            if (d6 >= c0363r5.f4827e) {
                                return Math.pow((d12 * d6) + c0363r5.f4825c, c0363r5.f4823a) + c0363r5.f4828f;
                            }
                            return c0363r5.f4829g + (c0363r5.f4826d * d6);
                    }
                }
            };
        } else {
            final int i5 = 1;
            interfaceC0354i = new InterfaceC0354i() { // from class: a0.o
                @Override // a0.InterfaceC0354i
                public final double c(double d6) {
                    switch (i5) {
                        case 0:
                            C0363r c0363r2 = c0363r;
                            double d7 = c0363r2.f4827e;
                            double d8 = c0363r2.f4826d;
                            return d6 >= d7 * d8 ? (Math.pow(d6, 1.0d / c0363r2.f4823a) - c0363r2.f4825c) / c0363r2.f4824b : d6 / d8;
                        case 1:
                            C0363r c0363r3 = c0363r;
                            double d9 = c0363r3.f4824b;
                            double d10 = c0363r3.f4827e;
                            double d11 = c0363r3.f4826d;
                            return d6 >= d10 * d11 ? (Math.pow(d6 - c0363r3.f4828f, 1.0d / c0363r3.f4823a) - c0363r3.f4825c) / d9 : (d6 - c0363r3.f4829g) / d11;
                        case 2:
                            C0363r c0363r4 = c0363r;
                            return d6 >= c0363r4.f4827e ? Math.pow((c0363r4.f4824b * d6) + c0363r4.f4825c, c0363r4.f4823a) : d6 * c0363r4.f4826d;
                        default:
                            C0363r c0363r5 = c0363r;
                            double d12 = c0363r5.f4824b;
                            if (d6 >= c0363r5.f4827e) {
                                return Math.pow((d12 * d6) + c0363r5.f4825c, c0363r5.f4823a) + c0363r5.f4828f;
                            }
                            return c0363r5.f4829g + (c0363r5.f4826d * d6);
                    }
                }
            };
        }
        InterfaceC0354i interfaceC0354i3 = interfaceC0354i;
        if (d4 == 0.0d && d5 == 0.0d) {
            final int i6 = 2;
            interfaceC0354i2 = new InterfaceC0354i() { // from class: a0.o
                @Override // a0.InterfaceC0354i
                public final double c(double d6) {
                    switch (i6) {
                        case 0:
                            C0363r c0363r2 = c0363r;
                            double d7 = c0363r2.f4827e;
                            double d8 = c0363r2.f4826d;
                            return d6 >= d7 * d8 ? (Math.pow(d6, 1.0d / c0363r2.f4823a) - c0363r2.f4825c) / c0363r2.f4824b : d6 / d8;
                        case 1:
                            C0363r c0363r3 = c0363r;
                            double d9 = c0363r3.f4824b;
                            double d10 = c0363r3.f4827e;
                            double d11 = c0363r3.f4826d;
                            return d6 >= d10 * d11 ? (Math.pow(d6 - c0363r3.f4828f, 1.0d / c0363r3.f4823a) - c0363r3.f4825c) / d9 : (d6 - c0363r3.f4829g) / d11;
                        case 2:
                            C0363r c0363r4 = c0363r;
                            return d6 >= c0363r4.f4827e ? Math.pow((c0363r4.f4824b * d6) + c0363r4.f4825c, c0363r4.f4823a) : d6 * c0363r4.f4826d;
                        default:
                            C0363r c0363r5 = c0363r;
                            double d12 = c0363r5.f4824b;
                            if (d6 >= c0363r5.f4827e) {
                                return Math.pow((d12 * d6) + c0363r5.f4825c, c0363r5.f4823a) + c0363r5.f4828f;
                            }
                            return c0363r5.f4829g + (c0363r5.f4826d * d6);
                    }
                }
            };
        } else {
            final int i7 = 3;
            interfaceC0354i2 = new InterfaceC0354i() { // from class: a0.o
                @Override // a0.InterfaceC0354i
                public final double c(double d6) {
                    switch (i7) {
                        case 0:
                            C0363r c0363r2 = c0363r;
                            double d7 = c0363r2.f4827e;
                            double d8 = c0363r2.f4826d;
                            return d6 >= d7 * d8 ? (Math.pow(d6, 1.0d / c0363r2.f4823a) - c0363r2.f4825c) / c0363r2.f4824b : d6 / d8;
                        case 1:
                            C0363r c0363r3 = c0363r;
                            double d9 = c0363r3.f4824b;
                            double d10 = c0363r3.f4827e;
                            double d11 = c0363r3.f4826d;
                            return d6 >= d10 * d11 ? (Math.pow(d6 - c0363r3.f4828f, 1.0d / c0363r3.f4823a) - c0363r3.f4825c) / d9 : (d6 - c0363r3.f4829g) / d11;
                        case 2:
                            C0363r c0363r4 = c0363r;
                            return d6 >= c0363r4.f4827e ? Math.pow((c0363r4.f4824b * d6) + c0363r4.f4825c, c0363r4.f4823a) : d6 * c0363r4.f4826d;
                        default:
                            C0363r c0363r5 = c0363r;
                            double d12 = c0363r5.f4824b;
                            if (d6 >= c0363r5.f4827e) {
                                return Math.pow((d12 * d6) + c0363r5.f4825c, c0363r5.f4823a) + c0363r5.f4828f;
                            }
                            return c0363r5.f4829g + (c0363r5.f4826d * d6);
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0362q(String str, float[] fArr, C0364s c0364s, final double d4, float f4, float f5, int i2) {
        this(str, fArr, c0364s, null, r11, r3, f4, f5, new C0363r(d4, 1.0d, 0.0d, 0.0d, 0.0d), i2);
        InterfaceC0354i interfaceC0354i;
        InterfaceC0354i interfaceC0354i2 = f4808r;
        if (d4 == 1.0d) {
            interfaceC0354i = interfaceC0354i2;
        } else {
            final int i4 = 0;
            interfaceC0354i = new InterfaceC0354i() { // from class: a0.n
                @Override // a0.InterfaceC0354i
                public final double c(double d5) {
                    switch (i4) {
                        case 0:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, 1.0d / d4);
                        default:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, d4);
                    }
                }
            };
        }
        if (d4 != 1.0d) {
            final int i5 = 1;
            interfaceC0354i2 = new InterfaceC0354i() { // from class: a0.n
                @Override // a0.InterfaceC0354i
                public final double c(double d5) {
                    switch (i5) {
                        case 0:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, 1.0d / d4);
                        default:
                            if (d5 < 0.0d) {
                                d5 = 0.0d;
                            }
                            return Math.pow(d5, d4);
                    }
                }
            };
        }
    }
}
