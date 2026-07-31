package g1;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final c5.n f2871r = new c5.n(11);

    /* renamed from: d, reason: collision with root package name */
    public final s f2872d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2873e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2874f;

    /* renamed from: g, reason: collision with root package name */
    public final r f2875g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f2876h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f2877j;

    /* renamed from: k, reason: collision with root package name */
    public final i f2878k;

    /* renamed from: l, reason: collision with root package name */
    public final p f2879l;

    /* renamed from: m, reason: collision with root package name */
    public final m f2880m;

    /* renamed from: n, reason: collision with root package name */
    public final i f2881n;

    /* renamed from: o, reason: collision with root package name */
    public final p f2882o;

    /* renamed from: p, reason: collision with root package name */
    public final m f2883p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2884q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final r rVar, int i) {
        this(str, fArr, sVar, null, r4, r0, 0.0f, 1.0f, rVar, i);
        i iVar;
        i iVar2;
        double d8 = rVar.f2885a;
        boolean z3 = d8 == -3.0d;
        double d9 = rVar.f2891g;
        double d10 = rVar.f2890f;
        if (z3) {
            final int i8 = 4;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i9 = i8;
                    r rVar2 = rVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        } else if (d8 == -2.0d) {
            final int i9 = 5;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i9;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        } else if (d10 == 0.0d && d9 == 0.0d) {
            final int i10 = 6;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i10;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        } else {
            final int i11 = 7;
            iVar = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i11;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        }
        if (d8 == -3.0d) {
            final int i12 = 0;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i12;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        } else if (d8 == -2.0d) {
            final int i13 = 1;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i13;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        } else if (d10 == 0.0d && d9 == 0.0d) {
            final int i14 = 2;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i14;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        } else {
            final int i15 = 3;
            iVar2 = new i() { // from class: g1.o
                @Override // g1.i
                public final double b(double d11) {
                    int i92 = i15;
                    r rVar2 = rVar;
                    switch (i92) {
                        case 0:
                            float[] fArr2 = d.f2821a;
                            return d.a(rVar2, d11);
                        case 1:
                            float[] fArr3 = d.f2821a;
                            return d.c(rVar2, d11);
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            double d12 = rVar2.f2886b;
                            return d11 >= rVar2.f2889e ? Math.pow((d12 * d11) + rVar2.f2887c, rVar2.f2885a) : d11 * rVar2.f2888d;
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            double d13 = rVar2.f2886b;
                            double d14 = rVar2.f2887c;
                            double d15 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e ? Math.pow((d13 * d11) + d14, rVar2.f2885a) + rVar2.f2890f : (d15 * d11) + rVar2.f2891g;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f2821a;
                            return d.b(rVar2, d11);
                        case 5:
                            float[] fArr5 = d.f2821a;
                            return d.d(rVar2, d11);
                        case 6:
                            double d16 = rVar2.f2886b;
                            double d17 = rVar2.f2887c;
                            double d18 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d18 ? (Math.pow(d11, 1.0d / rVar2.f2885a) - d17) / d16 : d11 / d18;
                        default:
                            double d19 = rVar2.f2886b;
                            double d20 = rVar2.f2887c;
                            double d21 = rVar2.f2888d;
                            return d11 >= rVar2.f2889e * d21 ? (Math.pow(d11 - rVar2.f2890f, 1.0d / rVar2.f2885a) - d20) / d19 : (d11 - rVar2.f2891g) / d21;
                    }
                }
            };
        }
    }

    @Override // g1.c
    public final float a(int i) {
        return this.f2874f;
    }

    @Override // g1.c
    public final float b(int i) {
        return this.f2873e;
    }

    @Override // g1.c
    public final boolean c() {
        return this.f2884q;
    }

    @Override // g1.c
    public final long d(float f6, float f8, float f9) {
        double d8 = f6;
        m mVar = this.f2883p;
        float b8 = (float) mVar.b(d8);
        float b9 = (float) mVar.b(f8);
        float b10 = (float) mVar.b(f9);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f10 = (fArr[6] * b10) + (fArr[3] * b9) + (fArr[0] * b8);
        float f11 = (fArr[7] * b10) + (fArr[4] * b9) + (fArr[1] * b8);
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // g1.c
    public final float e(float f6, float f8, float f9) {
        double d8 = f6;
        m mVar = this.f2883p;
        float b8 = (float) mVar.b(d8);
        float b9 = (float) mVar.b(f8);
        float b10 = (float) mVar.b(f9);
        float[] fArr = this.i;
        return (fArr[8] * b10) + (fArr[5] * b9) + (fArr[2] * b8);
    }

    @Override // g1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f2875g;
        if (Float.compare(qVar.f2873e, this.f2873e) != 0 || Float.compare(qVar.f2874f, this.f2874f) != 0 || !q6.i.a(this.f2872d, qVar.f2872d) || !Arrays.equals(this.f2876h, qVar.f2876h)) {
            return false;
        }
        r rVar2 = this.f2875g;
        if (rVar2 != null) {
            return q6.i.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (q6.i.a(this.f2878k, qVar.f2878k)) {
            return q6.i.a(this.f2881n, qVar.f2881n);
        }
        return false;
    }

    @Override // g1.c
    public final long f(float f6, float f8, float f9, float f10, c cVar) {
        float[] fArr = this.f2877j;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f6);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f6);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f6);
        m mVar = this.f2880m;
        return f1.p.a((float) mVar.b(f11), (float) mVar.b(f12), (float) mVar.b(f13), f10, cVar);
    }

    @Override // g1.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f2876h) + ((this.f2872d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f6 = this.f2873e;
        int floatToIntBits = (hashCode + (f6 == 0.0f ? 0 : Float.floatToIntBits(f6))) * 31;
        float f8 = this.f2874f;
        int floatToIntBits2 = (floatToIntBits + (f8 == 0.0f ? 0 : Float.floatToIntBits(f8))) * 31;
        r rVar = this.f2875g;
        int hashCode2 = floatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f2881n.hashCode() + ((this.f2878k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e2, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r11)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f6, float f8, r rVar, int i) {
        super(str, b.f2813a, i);
        ?? r41;
        float f9;
        float f10;
        this.f2872d = sVar;
        this.f2873e = f6;
        this.f2874f = f8;
        this.f2875g = rVar;
        this.f2878k = iVar;
        boolean z3 = true;
        z3 = true;
        this.f2879l = new p(this, z3 ? 1 : 0);
        int i8 = 0;
        this.f2880m = new m(this, i8);
        this.f2881n = iVar2;
        this.f2882o = new p(this, i8);
        this.f2883p = new m(this, z3 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f6 < f8) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                float f13 = f11 + f12 + fArr[2];
                fArr3[0] = f11 / f13;
                fArr3[1] = f12 / f13;
                float f14 = fArr[3];
                float f15 = fArr[4];
                float f16 = f14 + f15 + fArr[5];
                fArr3[2] = f14 / f16;
                fArr3[3] = f15 / f16;
                float f17 = fArr[6];
                float f18 = fArr[7];
                float f19 = f17 + f18 + fArr[8];
                fArr3[4] = f17 / f19;
                fArr3[5] = f18 / f19;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f2876h = fArr3;
            if (fArr2 == null) {
                float f20 = fArr3[0];
                float f21 = fArr3[1];
                float f22 = fArr3[2];
                float f23 = fArr3[3];
                float f24 = fArr3[4];
                float f25 = fArr3[5];
                f9 = 1.0f;
                float f26 = sVar.f2892a;
                r41 = 0;
                float f27 = sVar.f2893b;
                float f28 = 1;
                float f29 = (f28 - f20) / f21;
                float f30 = (f28 - f22) / f23;
                float f31 = (f28 - f24) / f25;
                float f32 = (f28 - f26) / f27;
                float f33 = f20 / f21;
                float f34 = (f22 / f23) - f33;
                float f35 = (f26 / f27) - f33;
                float f36 = f30 - f29;
                float f37 = (f24 / f25) - f33;
                float f38 = (((f32 - f29) * f34) - (f35 * f36)) / (((f31 - f29) * f34) - (f36 * f37));
                float f39 = (f35 - (f37 * f38)) / f34;
                float f40 = (1.0f - f39) - f38;
                float f41 = f40 / f21;
                float f42 = f39 / f23;
                float f43 = f38 / f25;
                this.i = new float[]{f41 * f20, f40, ((1.0f - f20) - f21) * f41, f42 * f22, f39, ((1.0f - f22) - f23) * f42, f43 * f24, f38, ((1.0f - f24) - f25) * f43};
            } else {
                r41 = 0;
                f9 = 1.0f;
                if (fArr2.length == 9) {
                    this.i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f2877j = j.f(this.i);
            float b8 = j.b(fArr3);
            float[] fArr4 = d.f2821a;
            if (b8 / j.b(d.f2822b) > 0.9f) {
                float[] fArr5 = d.f2821a;
                float f44 = fArr3[r41];
                float f45 = fArr5[r41];
                float f46 = fArr3[1];
                float f47 = fArr5[1];
                float f48 = fArr3[2];
                float f49 = fArr5[2];
                float f50 = fArr3[3];
                float f51 = fArr5[3];
                float f52 = fArr3[4];
                float f53 = fArr5[4];
                float f54 = fArr3[5];
                float f55 = fArr5[5];
                f10 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r41] = f44 - f45;
                fArr6[1] = f46 - f47;
                fArr6[2] = f48 - f49;
                fArr6[3] = f50 - f51;
                fArr6[4] = f52 - f53;
                fArr6[5] = f54 - f55;
                float f56 = fArr6[r41];
                float f57 = fArr6[1];
                if (((f47 - f55) * f56) - ((f45 - f53) * f57) >= 0.0f && ((f45 - f49) * f57) - ((f47 - f51) * f56) >= 0.0f) {
                    float f58 = fArr6[2];
                    float f59 = fArr6[3];
                    if (((f51 - f47) * f58) - ((f49 - f45) * f59) >= 0.0f && ((f49 - f53) * f59) - ((f51 - f55) * f58) >= 0.0f) {
                        float f60 = fArr6[4];
                        float f61 = fArr6[5];
                        if (((f55 - f51) * f60) - ((f53 - f49) * f61) >= 0.0f) {
                        }
                    }
                }
            } else {
                f10 = 0.0f;
            }
            int i9 = (f6 > f10 ? 1 : (f6 == f10 ? 0 : -1));
            if (i != 0) {
                float[] fArr7 = d.f2821a;
                if (fArr3 != fArr7) {
                    for (int i10 = r41; i10 < 6; i10++) {
                        if (Float.compare(fArr3[i10], fArr7[i10]) != 0 && Math.abs(fArr3[i10] - fArr7[i10]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (j.d(sVar, j.f2856d) && f6 == f10 && f8 == f9) {
                    float[] fArr8 = d.f2821a;
                    q qVar = d.f2825e;
                    for (double d8 = 0.0d; d8 <= 1.0d; d8 += 0.00392156862745098d) {
                        if (Math.abs(iVar.b(d8) - qVar.f2878k.b(d8)) <= 0.001d && Math.abs(iVar2.b(d8) - qVar.f2881n.b(d8)) <= 0.001d) {
                        }
                    }
                }
                z3 = r41;
            }
            this.f2884q = z3;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f6 + ", max=" + f8 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final double d8, float f6, float f8, int i) {
        this(str, fArr, sVar, null, r11, r3, f6, f8, new r(d8, 1.0d, 0.0d, 0.0d, 0.0d), i);
        i iVar;
        i iVar2 = f2871r;
        if (d8 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i8 = 0;
            iVar = new i() { // from class: g1.n
                @Override // g1.i
                public final double b(double d9) {
                    switch (i8) {
                        case 0:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, 1.0d / d8);
                        default:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, d8);
                    }
                }
            };
        }
        if (d8 != 1.0d) {
            final int i9 = 1;
            iVar2 = new i() { // from class: g1.n
                @Override // g1.i
                public final double b(double d9) {
                    switch (i9) {
                        case 0:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, 1.0d / d8);
                        default:
                            if (d9 < 0.0d) {
                                d9 = 0.0d;
                            }
                            return Math.pow(d9, d8);
                    }
                }
            };
        }
    }
}
