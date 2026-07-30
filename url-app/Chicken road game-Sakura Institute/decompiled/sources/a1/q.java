package a1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final a0.s f265r = new a0.s(6);

    /* renamed from: d, reason: collision with root package name */
    public final s f266d;

    /* renamed from: e, reason: collision with root package name */
    public final float f267e;

    /* renamed from: f, reason: collision with root package name */
    public final float f268f;

    /* renamed from: g, reason: collision with root package name */
    public final r f269g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f270h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f271i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f272j;

    /* renamed from: k, reason: collision with root package name */
    public final i f273k;

    /* renamed from: l, reason: collision with root package name */
    public final p f274l;

    /* renamed from: m, reason: collision with root package name */
    public final m f275m;

    /* renamed from: n, reason: collision with root package name */
    public final i f276n;

    /* renamed from: o, reason: collision with root package name */
    public final p f277o;

    /* renamed from: p, reason: collision with root package name */
    public final m f278p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f279q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final r rVar, int i7) {
        this(str, fArr, sVar, null, r1, r0, 0.0f, 1.0f, rVar, i7);
        i iVar;
        i iVar2;
        double d8 = rVar.f285f;
        double d9 = rVar.f286g;
        if (d8 == 0.0d && d9 == 0.0d) {
            final int i8 = 0;
            iVar = new i() { // from class: a1.o
                @Override // a1.i
                public final double d(double d10) {
                    switch (i8) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            r rVar2 = rVar;
                            double d11 = rVar2.f281b;
                            double d12 = rVar2.f282c;
                            double d13 = rVar2.f283d;
                            return d10 >= rVar2.f284e * d13 ? (Math.pow(d10, 1.0d / rVar2.f280a) - d12) / d11 : d10 / d13;
                        case 1:
                            r rVar3 = rVar;
                            double d14 = rVar3.f281b;
                            double d15 = rVar3.f282c;
                            double d16 = rVar3.f283d;
                            return d10 >= rVar3.f284e * d16 ? (Math.pow(d10 - rVar3.f285f, 1.0d / rVar3.f280a) - d15) / d14 : (d10 - rVar3.f286g) / d16;
                        case 2:
                            r rVar4 = rVar;
                            double d17 = rVar4.f281b;
                            return d10 >= rVar4.f284e ? Math.pow((d17 * d10) + rVar4.f282c, rVar4.f280a) : d10 * rVar4.f283d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f281b;
                            double d19 = rVar5.f282c;
                            double d20 = rVar5.f283d;
                            return d10 >= rVar5.f284e ? Math.pow((d10 * d18) + d19, rVar5.f280a) + rVar5.f285f : (d20 * d10) + rVar5.f286g;
                    }
                }
            };
        } else {
            final int i9 = 1;
            iVar = new i() { // from class: a1.o
                @Override // a1.i
                public final double d(double d10) {
                    switch (i9) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            r rVar2 = rVar;
                            double d11 = rVar2.f281b;
                            double d12 = rVar2.f282c;
                            double d13 = rVar2.f283d;
                            return d10 >= rVar2.f284e * d13 ? (Math.pow(d10, 1.0d / rVar2.f280a) - d12) / d11 : d10 / d13;
                        case 1:
                            r rVar3 = rVar;
                            double d14 = rVar3.f281b;
                            double d15 = rVar3.f282c;
                            double d16 = rVar3.f283d;
                            return d10 >= rVar3.f284e * d16 ? (Math.pow(d10 - rVar3.f285f, 1.0d / rVar3.f280a) - d15) / d14 : (d10 - rVar3.f286g) / d16;
                        case 2:
                            r rVar4 = rVar;
                            double d17 = rVar4.f281b;
                            return d10 >= rVar4.f284e ? Math.pow((d17 * d10) + rVar4.f282c, rVar4.f280a) : d10 * rVar4.f283d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f281b;
                            double d19 = rVar5.f282c;
                            double d20 = rVar5.f283d;
                            return d10 >= rVar5.f284e ? Math.pow((d10 * d18) + d19, rVar5.f280a) + rVar5.f285f : (d20 * d10) + rVar5.f286g;
                    }
                }
            };
        }
        if (d8 == 0.0d && d9 == 0.0d) {
            final int i10 = 2;
            iVar2 = new i() { // from class: a1.o
                @Override // a1.i
                public final double d(double d10) {
                    switch (i10) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            r rVar2 = rVar;
                            double d11 = rVar2.f281b;
                            double d12 = rVar2.f282c;
                            double d13 = rVar2.f283d;
                            return d10 >= rVar2.f284e * d13 ? (Math.pow(d10, 1.0d / rVar2.f280a) - d12) / d11 : d10 / d13;
                        case 1:
                            r rVar3 = rVar;
                            double d14 = rVar3.f281b;
                            double d15 = rVar3.f282c;
                            double d16 = rVar3.f283d;
                            return d10 >= rVar3.f284e * d16 ? (Math.pow(d10 - rVar3.f285f, 1.0d / rVar3.f280a) - d15) / d14 : (d10 - rVar3.f286g) / d16;
                        case 2:
                            r rVar4 = rVar;
                            double d17 = rVar4.f281b;
                            return d10 >= rVar4.f284e ? Math.pow((d17 * d10) + rVar4.f282c, rVar4.f280a) : d10 * rVar4.f283d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f281b;
                            double d19 = rVar5.f282c;
                            double d20 = rVar5.f283d;
                            return d10 >= rVar5.f284e ? Math.pow((d10 * d18) + d19, rVar5.f280a) + rVar5.f285f : (d20 * d10) + rVar5.f286g;
                    }
                }
            };
        } else {
            final int i11 = 3;
            iVar2 = new i() { // from class: a1.o
                @Override // a1.i
                public final double d(double d10) {
                    switch (i11) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            r rVar2 = rVar;
                            double d11 = rVar2.f281b;
                            double d12 = rVar2.f282c;
                            double d13 = rVar2.f283d;
                            return d10 >= rVar2.f284e * d13 ? (Math.pow(d10, 1.0d / rVar2.f280a) - d12) / d11 : d10 / d13;
                        case 1:
                            r rVar3 = rVar;
                            double d14 = rVar3.f281b;
                            double d15 = rVar3.f282c;
                            double d16 = rVar3.f283d;
                            return d10 >= rVar3.f284e * d16 ? (Math.pow(d10 - rVar3.f285f, 1.0d / rVar3.f280a) - d15) / d14 : (d10 - rVar3.f286g) / d16;
                        case 2:
                            r rVar4 = rVar;
                            double d17 = rVar4.f281b;
                            return d10 >= rVar4.f284e ? Math.pow((d17 * d10) + rVar4.f282c, rVar4.f280a) : d10 * rVar4.f283d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f281b;
                            double d19 = rVar5.f282c;
                            double d20 = rVar5.f283d;
                            return d10 >= rVar5.f284e ? Math.pow((d10 * d18) + d19, rVar5.f280a) + rVar5.f285f : (d20 * d10) + rVar5.f286g;
                    }
                }
            };
        }
    }

    @Override // a1.c
    public final float a(int i7) {
        return this.f268f;
    }

    @Override // a1.c
    public final float b(int i7) {
        return this.f267e;
    }

    @Override // a1.c
    public final boolean c() {
        return this.f279q;
    }

    @Override // a1.c
    public final long d(float f9, float f10, float f11) {
        double d8 = f9;
        m mVar = this.f278p;
        float d9 = (float) mVar.d(d8);
        float d10 = (float) mVar.d(f10);
        float d11 = (float) mVar.d(f11);
        float[] fArr = this.f271i;
        float f12 = (fArr[6] * d11) + (fArr[3] * d10) + (fArr[0] * d9);
        float f13 = (fArr[7] * d11) + (fArr[4] * d10) + (fArr[1] * d9);
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // a1.c
    public final float e(float f9, float f10, float f11) {
        double d8 = f9;
        m mVar = this.f278p;
        float d9 = (float) mVar.d(d8);
        float d10 = (float) mVar.d(f10);
        float d11 = (float) mVar.d(f11);
        float[] fArr = this.f271i;
        return (fArr[8] * d11) + (fArr[5] * d10) + (fArr[2] * d9);
    }

    @Override // a1.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f269g;
        if (Float.compare(qVar.f267e, this.f267e) != 0 || Float.compare(qVar.f268f, this.f268f) != 0 || !r6.k.a(this.f266d, qVar.f266d) || !Arrays.equals(this.f270h, qVar.f270h)) {
            return false;
        }
        r rVar2 = this.f269g;
        if (rVar2 != null) {
            return r6.k.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (r6.k.a(this.f273k, qVar.f273k)) {
            return r6.k.a(this.f276n, qVar.f276n);
        }
        return false;
    }

    @Override // a1.c
    public final long f(float f9, float f10, float f11, float f12, c cVar) {
        float[] fArr = this.f272j;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f9);
        m mVar = this.f275m;
        return l0.b((float) mVar.d(f13), (float) mVar.d(f14), (float) mVar.d(f15), f12, cVar);
    }

    @Override // a1.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f270h) + ((this.f266d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f9 = this.f267e;
        int floatToIntBits = (hashCode + (f9 == 0.0f ? 0 : Float.floatToIntBits(f9))) * 31;
        float f10 = this.f268f;
        int floatToIntBits2 = (floatToIntBits + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        r rVar = this.f269g;
        int hashCode2 = floatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f276n.hashCode() + ((this.f273k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0205, code lost:
    
        if (a1.j.f(r1[4] - r1[r41], r1[5] - r1[1], r3[4], r3[5]) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f9, float f10, r rVar, int i7) {
        super(i7, b.f210a, str);
        ?? r41;
        float f11;
        float f12;
        this.f266d = sVar;
        this.f267e = f9;
        this.f268f = f10;
        this.f269g = rVar;
        this.f273k = iVar;
        boolean z8 = true;
        z8 = true;
        this.f274l = new p(this, z8 ? 1 : 0);
        int i8 = 0;
        this.f275m = new m(this, i8);
        this.f276n = iVar2;
        this.f277o = new p(this, i8);
        this.f278p = new m(this, z8 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f9 < f10) {
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
            this.f270h = fArr3;
            if (fArr2 == null) {
                float f22 = fArr3[0];
                float f23 = fArr3[1];
                float f24 = fArr3[2];
                float f25 = fArr3[3];
                float f26 = fArr3[4];
                float f27 = fArr3[5];
                f11 = 1.0f;
                float f28 = sVar.f287a;
                r41 = 0;
                float f29 = sVar.f288b;
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
                this.f271i = new float[]{f43 * f22, f42, ((1.0f - f22) - f23) * f43, f44 * f24, f41, ((1.0f - f24) - f25) * f44, f45 * f26, f40, ((1.0f - f26) - f27) * f45};
            } else {
                r41 = 0;
                f11 = 1.0f;
                if (fArr2.length == 9) {
                    this.f271i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f272j = j.g(this.f271i);
            float b9 = j.b(fArr3);
            float[] fArr4 = d.f218a;
            if (b9 / j.b(d.f219b) > 0.9f) {
                float[] fArr5 = d.f218a;
                float f46 = fArr3[r41];
                float f47 = fArr5[r41];
                float f48 = fArr3[1];
                float f49 = fArr5[1];
                float f50 = fArr3[2] - fArr5[2];
                float f51 = fArr3[3] - fArr5[3];
                float f52 = fArr3[4];
                float f53 = fArr5[4];
                float f54 = fArr3[5];
                float f55 = fArr5[5];
                f12 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r41] = f46 - f47;
                fArr6[1] = f48 - f49;
                fArr6[2] = f50;
                fArr6[3] = f51;
                fArr6[4] = f52 - f53;
                fArr6[5] = f54 - f55;
                if (j.f(fArr6[r41], fArr6[1], f47 - f53, f49 - f55) >= 0.0f) {
                    if (j.f(fArr5[r41] - fArr5[2], fArr5[1] - fArr5[3], fArr6[r41], fArr6[1]) >= 0.0f) {
                        if (j.f(fArr6[2], fArr6[3], fArr5[2] - fArr5[r41], fArr5[3] - fArr5[1]) >= 0.0f) {
                            if (j.f(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) >= 0.0f) {
                                if (j.f(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) >= 0.0f) {
                                }
                            }
                        }
                    }
                }
            } else {
                f12 = 0.0f;
            }
            int i9 = (f9 > f12 ? 1 : (f9 == f12 ? 0 : -1));
            if (i7 != 0) {
                float[] fArr7 = d.f218a;
                if (fArr3 != fArr7) {
                    for (int i10 = r41; i10 < 6; i10++) {
                        if (Float.compare(fArr3[i10], fArr7[i10]) != 0 && Math.abs(fArr3[i10] - fArr7[i10]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (j.d(sVar, j.f250d) && f9 == f12 && f10 == f11) {
                    float[] fArr8 = d.f218a;
                    q qVar = d.f220c;
                    for (double d8 = 0.0d; d8 <= 1.0d; d8 += 0.00392156862745098d) {
                        if (Math.abs(iVar.d(d8) - qVar.f273k.d(d8)) <= 0.001d && Math.abs(iVar2.d(d8) - qVar.f276n.d(d8)) <= 0.001d) {
                        }
                    }
                }
                z8 = r41;
            }
            this.f279q = z8;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f9 + ", max=" + f10 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final double d8, float f9, float f10, int i7) {
        this(str, fArr, sVar, null, r11, r3, f9, f10, new r(d8, 1.0d, 0.0d, 0.0d, 0.0d), i7);
        i iVar;
        i iVar2 = f265r;
        if (d8 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i8 = 0;
            iVar = new i() { // from class: a1.n
                @Override // a1.i
                public final double d(double d9) {
                    switch (i8) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
            iVar2 = new i() { // from class: a1.n
                @Override // a1.i
                public final double d(double d9) {
                    switch (i9) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
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
