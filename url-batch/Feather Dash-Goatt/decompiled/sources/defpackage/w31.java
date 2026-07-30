package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w31 extends pi {
    public static final dd0 r = new dd0(7);
    public final oo1 d;
    public final float e;
    public final float f;
    public final zi1 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final zs k;
    public final v31 l;
    public final s31 m;
    public final zs n;
    public final v31 o;
    public final s31 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e0, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w31(String str, float[] fArr, oo1 oo1Var, float[] fArr2, zs zsVar, zs zsVar2, float f, float f2, zi1 zi1Var, int i) {
        super(i, 12884901888L, str);
        ?? r44;
        float f3;
        float f4;
        boolean z;
        this.d = oo1Var;
        this.e = f;
        this.f = f2;
        this.g = zi1Var;
        this.k = zsVar;
        int i2 = 1;
        this.l = new v31(this, i2);
        int i3 = 0;
        this.m = new s31(this, i3);
        this.n = zsVar2;
        this.o = new v31(this, i3);
        this.p = new s31(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            dd0.e("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
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
        this.h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = oo1Var.a;
            r44 = 1;
            float f21 = oo1Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            r44 = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
        }
        this.j = p4.J(this.i);
        float h = ka0.h(fArr3);
        float[] fArr4 = si.a;
        if (h / ka0.h(si.b) > 0.9f) {
            float[] fArr5 = si.a;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[r44];
            float f41 = fArr5[r44];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[0] = f38 - f39;
            fArr6[r44] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[0];
            float f51 = fArr6[r44];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) >= 0.0f) {
                    }
                }
            }
        } else {
            f4 = 0.0f;
        }
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr7 = si.a;
            if (fArr3 != fArr7) {
                for (int i5 = 0; i5 < 6; i5++) {
                    if (Float.compare(fArr3[i5], fArr7[i5]) != 0 && Math.abs(fArr3[i5] - fArr7[i5]) > 0.001f) {
                        break;
                    }
                }
            }
            if (p4.y(oo1Var, uq1.h) && f == f4 && f2 == f3) {
                float[] fArr8 = si.a;
                w31 w31Var = si.e;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(zsVar.b(d) - w31Var.k.b(d)) <= 0.001d && Math.abs(zsVar2.b(d) - w31Var.n.b(d)) <= 0.001d) {
                    }
                }
            }
            z = false;
            this.q = z;
        }
        z = r44;
        this.q = z;
    }

    @Override // defpackage.pi
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.pi
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.pi
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.pi
    public final long d(float f, float f2, float f3) {
        double d = f;
        s31 s31Var = this.p;
        float b = (float) s31Var.b(d);
        float b2 = (float) s31Var.b(f2);
        float b3 = (float) s31Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f5 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.pi
    public final float e(float f, float f2, float f3) {
        double d = f;
        s31 s31Var = this.p;
        float b = (float) s31Var.b(d);
        float b2 = (float) s31Var.b(f2);
        float b3 = (float) s31Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
    }

    @Override // defpackage.pi
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w31.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        w31 w31Var = (w31) obj;
        if (Float.compare(w31Var.e, this.e) != 0 || Float.compare(w31Var.f, this.f) != 0 || !Intrinsics.a(this.d, w31Var.d) || !Arrays.equals(this.h, w31Var.h)) {
            return false;
        }
        zi1 zi1Var = w31Var.g;
        zi1 zi1Var2 = this.g;
        if (zi1Var2 != null) {
            return Intrinsics.a(zi1Var2, zi1Var);
        }
        if (zi1Var == null) {
            return true;
        }
        if (Intrinsics.a(this.k, w31Var.k)) {
            return Intrinsics.a(this.n, w31Var.n);
        }
        return false;
    }

    @Override // defpackage.pi
    public final long f(float f, float f2, float f3, float f4, pi piVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        s31 s31Var = this.m;
        return la0.b((float) s31Var.b(f5), (float) s31Var.b(f6), (float) s31Var.b(f7), f4, piVar);
    }

    @Override // defpackage.pi
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        zi1 zi1Var = this.g;
        int hashCode2 = floatToIntBits2 + (zi1Var != null ? zi1Var.hashCode() : 0);
        if (zi1Var != null) {
            return hashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w31(String str, float[] fArr, oo1 oo1Var, final zi1 zi1Var, int i) {
        this(str, fArr, oo1Var, null, r4, r0, 0.0f, 1.0f, zi1Var, i);
        double d;
        zs zsVar;
        zs zsVar2;
        double d2 = zi1Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = zi1Var.g;
        double d4 = zi1Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            zsVar = new zs() { // from class: u31
                @Override // defpackage.zs
                public final double b(double d5) {
                    int i5 = i4;
                    zi1 zi1Var2 = zi1Var;
                    switch (i5) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = si.a;
                            return si.a(zi1Var2, d5);
                        case 1:
                            float[] fArr3 = si.a;
                            return si.c(zi1Var2, d5);
                        case 2:
                            double d6 = zi1Var2.b;
                            return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                        case 3:
                            double d7 = zi1Var2.b;
                            double d8 = zi1Var2.c;
                            double d9 = zi1Var2.d;
                            return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                        case 4:
                            float[] fArr4 = si.a;
                            return si.b(zi1Var2, d5);
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = si.a;
                            return si.d(zi1Var2, d5);
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = zi1Var2.b;
                            double d11 = zi1Var2.c;
                            double d12 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = zi1Var2.b;
                            double d14 = zi1Var2.c;
                            double d15 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                zsVar = new zs() { // from class: u31
                    @Override // defpackage.zs
                    public final double b(double d5) {
                        int i52 = i5;
                        zi1 zi1Var2 = zi1Var;
                        switch (i52) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                float[] fArr2 = si.a;
                                return si.a(zi1Var2, d5);
                            case 1:
                                float[] fArr3 = si.a;
                                return si.c(zi1Var2, d5);
                            case 2:
                                double d6 = zi1Var2.b;
                                return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                            case 3:
                                double d7 = zi1Var2.b;
                                double d8 = zi1Var2.c;
                                double d9 = zi1Var2.d;
                                return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                            case 4:
                                float[] fArr4 = si.a;
                                return si.b(zi1Var2, d5);
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = si.a;
                                return si.d(zi1Var2, d5);
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = zi1Var2.b;
                                double d11 = zi1Var2.c;
                                double d12 = zi1Var2.d;
                                return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = zi1Var2.b;
                                double d14 = zi1Var2.c;
                                double d15 = zi1Var2.d;
                                return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                zsVar = new zs() { // from class: u31
                    @Override // defpackage.zs
                    public final double b(double d5) {
                        int i52 = i6;
                        zi1 zi1Var2 = zi1Var;
                        switch (i52) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                float[] fArr2 = si.a;
                                return si.a(zi1Var2, d5);
                            case 1:
                                float[] fArr3 = si.a;
                                return si.c(zi1Var2, d5);
                            case 2:
                                double d6 = zi1Var2.b;
                                return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                            case 3:
                                double d7 = zi1Var2.b;
                                double d8 = zi1Var2.c;
                                double d9 = zi1Var2.d;
                                return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                            case 4:
                                float[] fArr4 = si.a;
                                return si.b(zi1Var2, d5);
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = si.a;
                                return si.d(zi1Var2, d5);
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = zi1Var2.b;
                                double d11 = zi1Var2.c;
                                double d12 = zi1Var2.d;
                                return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = zi1Var2.b;
                                double d14 = zi1Var2.c;
                                double d15 = zi1Var2.d;
                                return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                zsVar = new zs() { // from class: u31
                    @Override // defpackage.zs
                    public final double b(double d5) {
                        int i52 = i7;
                        zi1 zi1Var2 = zi1Var;
                        switch (i52) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                float[] fArr2 = si.a;
                                return si.a(zi1Var2, d5);
                            case 1:
                                float[] fArr3 = si.a;
                                return si.c(zi1Var2, d5);
                            case 2:
                                double d6 = zi1Var2.b;
                                return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                            case 3:
                                double d7 = zi1Var2.b;
                                double d8 = zi1Var2.c;
                                double d9 = zi1Var2.d;
                                return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                            case 4:
                                float[] fArr4 = si.a;
                                return si.b(zi1Var2, d5);
                            case ry0.STRING_FIELD_NUMBER /* 5 */:
                                float[] fArr5 = si.a;
                                return si.d(zi1Var2, d5);
                            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                double d10 = zi1Var2.b;
                                double d11 = zi1Var2.c;
                                double d12 = zi1Var2.d;
                                return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = zi1Var2.b;
                                double d14 = zi1Var2.c;
                                double d15 = zi1Var2.d;
                                return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            zsVar2 = new zs() { // from class: u31
                @Override // defpackage.zs
                public final double b(double d5) {
                    int i52 = i2;
                    zi1 zi1Var2 = zi1Var;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = si.a;
                            return si.a(zi1Var2, d5);
                        case 1:
                            float[] fArr3 = si.a;
                            return si.c(zi1Var2, d5);
                        case 2:
                            double d6 = zi1Var2.b;
                            return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                        case 3:
                            double d7 = zi1Var2.b;
                            double d8 = zi1Var2.c;
                            double d9 = zi1Var2.d;
                            return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                        case 4:
                            float[] fArr4 = si.a;
                            return si.b(zi1Var2, d5);
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = si.a;
                            return si.d(zi1Var2, d5);
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = zi1Var2.b;
                            double d11 = zi1Var2.c;
                            double d12 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = zi1Var2.b;
                            double d14 = zi1Var2.c;
                            double d15 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            zsVar2 = new zs() { // from class: u31
                @Override // defpackage.zs
                public final double b(double d5) {
                    int i52 = i3;
                    zi1 zi1Var2 = zi1Var;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = si.a;
                            return si.a(zi1Var2, d5);
                        case 1:
                            float[] fArr3 = si.a;
                            return si.c(zi1Var2, d5);
                        case 2:
                            double d6 = zi1Var2.b;
                            return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                        case 3:
                            double d7 = zi1Var2.b;
                            double d8 = zi1Var2.c;
                            double d9 = zi1Var2.d;
                            return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                        case 4:
                            float[] fArr4 = si.a;
                            return si.b(zi1Var2, d5);
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = si.a;
                            return si.d(zi1Var2, d5);
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = zi1Var2.b;
                            double d11 = zi1Var2.c;
                            double d12 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = zi1Var2.b;
                            double d14 = zi1Var2.c;
                            double d15 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            zsVar2 = new zs() { // from class: u31
                @Override // defpackage.zs
                public final double b(double d5) {
                    int i52 = i8;
                    zi1 zi1Var2 = zi1Var;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = si.a;
                            return si.a(zi1Var2, d5);
                        case 1:
                            float[] fArr3 = si.a;
                            return si.c(zi1Var2, d5);
                        case 2:
                            double d6 = zi1Var2.b;
                            return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                        case 3:
                            double d7 = zi1Var2.b;
                            double d8 = zi1Var2.c;
                            double d9 = zi1Var2.d;
                            return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                        case 4:
                            float[] fArr4 = si.a;
                            return si.b(zi1Var2, d5);
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = si.a;
                            return si.d(zi1Var2, d5);
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = zi1Var2.b;
                            double d11 = zi1Var2.c;
                            double d12 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = zi1Var2.b;
                            double d14 = zi1Var2.c;
                            double d15 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            zsVar2 = new zs() { // from class: u31
                @Override // defpackage.zs
                public final double b(double d5) {
                    int i52 = i9;
                    zi1 zi1Var2 = zi1Var;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            float[] fArr2 = si.a;
                            return si.a(zi1Var2, d5);
                        case 1:
                            float[] fArr3 = si.a;
                            return si.c(zi1Var2, d5);
                        case 2:
                            double d6 = zi1Var2.b;
                            return d5 >= zi1Var2.e ? Math.pow((d6 * d5) + zi1Var2.c, zi1Var2.a) : zi1Var2.d * d5;
                        case 3:
                            double d7 = zi1Var2.b;
                            double d8 = zi1Var2.c;
                            double d9 = zi1Var2.d;
                            return d5 >= zi1Var2.e ? Math.pow((d7 * d5) + d8, zi1Var2.a) + zi1Var2.f : (d9 * d5) + zi1Var2.g;
                        case 4:
                            float[] fArr4 = si.a;
                            return si.b(zi1Var2, d5);
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            float[] fArr5 = si.a;
                            return si.d(zi1Var2, d5);
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            double d10 = zi1Var2.b;
                            double d11 = zi1Var2.c;
                            double d12 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d12 ? (Math.pow(d5, 1.0d / zi1Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = zi1Var2.b;
                            double d14 = zi1Var2.c;
                            double d15 = zi1Var2.d;
                            return d5 >= zi1Var2.e * d15 ? (Math.pow(d5 - zi1Var2.f, 1.0d / zi1Var2.a) - d14) / d13 : (d5 - zi1Var2.g) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w31(String str, float[] fArr, oo1 oo1Var, final double d, float f, float f2, int i) {
        this(str, fArr, oo1Var, null, r11, r12, f, f2, new zi1(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        zs zsVar;
        zs zsVar2 = r;
        if (d == 1.0d) {
            zsVar = zsVar2;
        } else {
            final int i2 = 0;
            zsVar = new zs() { // from class: t31
                @Override // defpackage.zs
                public final double b(double d2) {
                    switch (i2) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            zsVar2 = new zs() { // from class: t31
                @Override // defpackage.zs
                public final double b(double d2) {
                    switch (i3) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        zs zsVar3 = zsVar2;
    }
}
