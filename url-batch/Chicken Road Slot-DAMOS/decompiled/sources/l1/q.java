package l1;

import java.util.Arrays;
import k1.v;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final i0 f5805r = new i0(8);

    /* renamed from: d, reason: collision with root package name */
    public final s f5806d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5807e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5808f;
    public final r g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f5809h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f5810i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final i f5811k;

    /* renamed from: l, reason: collision with root package name */
    public final p f5812l;

    /* renamed from: m, reason: collision with root package name */
    public final m f5813m;

    /* renamed from: n, reason: collision with root package name */
    public final i f5814n;

    /* renamed from: o, reason: collision with root package name */
    public final p f5815o;

    /* renamed from: p, reason: collision with root package name */
    public final m f5816p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f5817q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e1, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r11)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f3, float f10, r rVar, int i3) {
        super(i3, b.f5750a, str);
        ?? r41;
        float f11;
        float f12;
        this.f5806d = sVar;
        this.f5807e = f3;
        this.f5808f = f10;
        this.g = rVar;
        this.f5811k = iVar;
        boolean z10 = true;
        z10 = true;
        this.f5812l = new p(this, z10 ? 1 : 0);
        this.f5813m = new m(this, 0);
        this.f5814n = iVar2;
        this.f5815o = new p(this, 0);
        this.f5816p = new m(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            a1.e("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f3 >= f10) {
            throw new IllegalArgumentException("Invalid range: min=" + f3 + ", max=" + f10 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = f13 + f14 + fArr[2];
            fArr3[0] = f13 / f15;
            fArr3[1] = f14 / f15;
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = f16 + f17 + fArr[5];
            fArr3[2] = f16 / f18;
            fArr3[3] = f17 / f18;
            float f19 = fArr[6];
            float f20 = fArr[7];
            float f21 = f19 + f20 + fArr[8];
            fArr3[4] = f19 / f21;
            fArr3[5] = f20 / f21;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f5809h = fArr3;
        if (fArr2 == null) {
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr3[2];
            float f25 = fArr3[3];
            float f26 = fArr3[4];
            float f27 = fArr3[5];
            f11 = 1.0f;
            float f28 = sVar.f5824a;
            r41 = 0;
            float f29 = sVar.f5825b;
            float f30 = 1;
            float f31 = (f30 - f22) / f23;
            float f32 = (f30 - f24) / f25;
            float f33 = (f30 - f26) / f27;
            float f34 = (f30 - f28) / f29;
            float f35 = f22 / f23;
            float f36 = (f24 / f25) - f35;
            float f37 = (f28 / f29) - f35;
            float f38 = f32 - f31;
            float f39 = (f26 / f27) - f35;
            float f40 = (((f34 - f31) * f36) - (f37 * f38)) / (((f33 - f31) * f36) - (f38 * f39));
            float f41 = (f37 - (f39 * f40)) / f36;
            float f42 = (1.0f - f41) - f40;
            float f43 = f42 / f23;
            float f44 = f41 / f25;
            float f45 = f40 / f27;
            this.f5810i = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
        } else {
            r41 = 0;
            f11 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f5810i = fArr2;
        }
        this.j = j.f(this.f5810i);
        float b10 = j.b(fArr3);
        float[] fArr4 = d.f5758a;
        if (b10 / j.b(d.f5759b) > 0.9f) {
            float[] fArr5 = d.f5758a;
            float f46 = fArr3[r41];
            float f47 = fArr5[r41];
            float f48 = fArr3[1];
            float f49 = fArr5[1];
            float f50 = fArr3[2];
            float f51 = fArr5[2];
            float f52 = fArr3[3];
            float f53 = fArr5[3];
            float f54 = fArr3[4];
            float f55 = fArr5[4];
            float f56 = fArr3[5];
            float f57 = fArr5[5];
            f12 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[r41] = f46 - f47;
            fArr6[1] = f48 - f49;
            fArr6[2] = f50 - f51;
            fArr6[3] = f52 - f53;
            fArr6[4] = f54 - f55;
            fArr6[5] = f56 - f57;
            float f58 = fArr6[r41];
            float f59 = fArr6[1];
            if (((f49 - f57) * f58) - ((f47 - f55) * f59) >= 0.0f && ((f47 - f51) * f59) - ((f49 - f53) * f58) >= 0.0f) {
                float f60 = fArr6[2];
                float f61 = fArr6[3];
                if (((f53 - f49) * f60) - ((f51 - f47) * f61) >= 0.0f && ((f51 - f55) * f61) - ((f53 - f57) * f60) >= 0.0f) {
                    float f62 = fArr6[4];
                    float f63 = fArr6[5];
                    if (((f57 - f53) * f62) - ((f55 - f51) * f63) >= 0.0f) {
                    }
                }
            }
        } else {
            f12 = 0.0f;
        }
        int i10 = (f3 > f12 ? 1 : (f3 == f12 ? 0 : -1));
        if (i3 != 0) {
            float[] fArr7 = d.f5758a;
            if (fArr3 != fArr7) {
                for (int i11 = r41; i11 < 6; i11++) {
                    if (Float.compare(fArr3[i11], fArr7[i11]) != 0 && Math.abs(fArr3[i11] - fArr7[i11]) > 0.001f) {
                        break;
                    }
                }
            }
            if (j.d(sVar, j.f5791d) && f3 == f12 && f10 == f11) {
                float[] fArr8 = d.f5758a;
                q qVar = d.f5762e;
                for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                    if (Math.abs(iVar.a(d10) - qVar.f5811k.a(d10)) <= 0.001d && Math.abs(iVar2.a(d10) - qVar.f5814n.a(d10)) <= 0.001d) {
                    }
                }
            }
            z10 = r41;
        }
        this.f5817q = z10;
    }

    @Override // l1.c
    public final float a(int i3) {
        return this.f5808f;
    }

    @Override // l1.c
    public final float b(int i3) {
        return this.f5807e;
    }

    @Override // l1.c
    public final boolean c() {
        return this.f5817q;
    }

    @Override // l1.c
    public final long d(float f3, float f10, float f11) {
        double d10 = f3;
        m mVar = this.f5816p;
        float a9 = (float) mVar.a(d10);
        float a10 = (float) mVar.a(f10);
        float a11 = (float) mVar.a(f11);
        float[] fArr = this.f5810i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f12 = (fArr[6] * a11) + (fArr[3] * a10) + (fArr[0] * a9);
        float f13 = (fArr[7] * a11) + (fArr[4] * a10) + (fArr[1] * a9);
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // l1.c
    public final float e(float f3, float f10, float f11) {
        double d10 = f3;
        m mVar = this.f5816p;
        float a9 = (float) mVar.a(d10);
        float a10 = (float) mVar.a(f10);
        float a11 = (float) mVar.a(f11);
        float[] fArr = this.f5810i;
        return (fArr[8] * a11) + (fArr[5] * a10) + (fArr[2] * a9);
    }

    @Override // l1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f5807e, this.f5807e) != 0 || Float.compare(qVar.f5808f, this.f5808f) != 0 || !Intrinsics.a(this.f5806d, qVar.f5806d) || !Arrays.equals(this.f5809h, qVar.f5809h)) {
            return false;
        }
        r rVar = qVar.g;
        r rVar2 = this.g;
        if (rVar2 != null) {
            return Intrinsics.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (Intrinsics.a(this.f5811k, qVar.f5811k)) {
            return Intrinsics.a(this.f5814n, qVar.f5814n);
        }
        return false;
    }

    @Override // l1.c
    public final long f(float f3, float f10, float f11, float f12, c cVar) {
        float[] fArr = this.j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        m mVar = this.f5813m;
        return v.a((float) mVar.a(f13), (float) mVar.a(f14), (float) mVar.a(f15), f12, cVar);
    }

    @Override // l1.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f5809h) + ((this.f5806d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f5807e;
        int floatToIntBits = (hashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f10 = this.f5808f;
        int floatToIntBits2 = (floatToIntBits + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        r rVar = this.g;
        int hashCode2 = floatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f5814n.hashCode() + ((this.f5811k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final r rVar, int i3) {
        this(str, fArr, sVar, null, r4, r0, 0.0f, 1.0f, rVar, i3);
        i iVar;
        i iVar2;
        double d10 = rVar.f5818a;
        boolean z10 = d10 == -3.0d;
        double d11 = rVar.g;
        double d12 = rVar.f5823f;
        if (z10) {
            final int i10 = 4;
            iVar = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i11 = i10;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i11 = 5;
            iVar = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i11;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i12 = 6;
            iVar = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i12;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else {
            final int i13 = 7;
            iVar = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i13;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        }
        if (d10 == -3.0d) {
            final int i14 = 0;
            iVar2 = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i14;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d10 == -2.0d) {
            final int i15 = 1;
            iVar2 = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i15;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i16 = 2;
            iVar2 = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i16;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        } else {
            final int i17 = 3;
            iVar2 = new i() { // from class: l1.o
                @Override // l1.i
                public final double a(double d13) {
                    int i112 = i17;
                    r rVar2 = rVar;
                    switch (i112) {
                        case 0:
                            float[] fArr2 = d.f5758a;
                            return d.a(rVar2, d13);
                        case 1:
                            float[] fArr3 = d.f5758a;
                            return d.c(rVar2, d13);
                        case 2:
                            double d14 = rVar2.f5819b;
                            return d13 >= rVar2.f5822e ? Math.pow((d14 * d13) + rVar2.f5820c, rVar2.f5818a) : d13 * rVar2.f5821d;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            double d15 = rVar2.f5819b;
                            double d16 = rVar2.f5820c;
                            double d17 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e ? Math.pow((d15 * d13) + d16, rVar2.f5818a) + rVar2.f5823f : (d17 * d13) + rVar2.g;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            float[] fArr4 = d.f5758a;
                            return d.b(rVar2, d13);
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = d.f5758a;
                            return d.d(rVar2, d13);
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d18 = rVar2.f5819b;
                            double d19 = rVar2.f5820c;
                            double d20 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d20 ? (Math.pow(d13, 1.0d / rVar2.f5818a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = rVar2.f5819b;
                            double d22 = rVar2.f5820c;
                            double d23 = rVar2.f5821d;
                            return d13 >= rVar2.f5822e * d23 ? (Math.pow(d13 - rVar2.f5823f, 1.0d / rVar2.f5818a) - d22) / d21 : (d13 - rVar2.g) / d23;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final double d10, float f3, float f10, int i3) {
        this(str, fArr, sVar, null, r11, r3, f3, f10, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i3);
        i iVar;
        i iVar2 = f5805r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i10 = 0;
            iVar = new i() { // from class: l1.n
                @Override // l1.i
                public final double a(double d11) {
                    switch (i10) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i11 = 1;
            iVar2 = new i() { // from class: l1.n
                @Override // l1.i
                public final double a(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
    }
}
