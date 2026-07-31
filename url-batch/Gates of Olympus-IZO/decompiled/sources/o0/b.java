package o0;

import L1.f;
import e2.AbstractC0381e;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6680a = false;

    /* renamed from: b, reason: collision with root package name */
    public final int f6681b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f6682c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f6683d;

    /* renamed from: e, reason: collision with root package name */
    public int f6684e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6685f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f6686g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f6687h;

    public b() {
        int i3;
        int a3 = AbstractC0600j.a(1);
        if (a3 == 0) {
            i3 = 3;
        } else {
            if (a3 != 1) {
                throw new f();
            }
            i3 = 2;
        }
        this.f6682c = i3;
        this.f6683d = new a[20];
        this.f6685f = new float[20];
        this.f6686g = new float[20];
        this.f6687h = new float[3];
    }

    public final void a(long j3, float f3) {
        int i3 = (this.f6684e + 1) % 20;
        this.f6684e = i3;
        a[] aVarArr = this.f6683d;
        a aVar = aVarArr[i3];
        if (aVar != null) {
            aVar.f6678a = j3;
            aVar.f6679b = f3;
        } else {
            a aVar2 = new a();
            aVar2.f6678a = j3;
            aVar2.f6679b = f3;
            aVarArr[i3] = aVar2;
        }
    }

    public final float b(float f3) {
        int i3;
        float[] fArr;
        float[] fArr2;
        boolean z3;
        float f4;
        float f5;
        float f6 = 0.0f;
        if (f3 <= 0.0f) {
            AbstractC0381e.N("maximumVelocity should be a positive value. You specified=" + f3);
            throw null;
        }
        int i4 = this.f6684e;
        a[] aVarArr = this.f6683d;
        a aVar = aVarArr[i4];
        if (aVar == null) {
            f4 = 0.0f;
        } else {
            int i5 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i4];
                boolean z4 = this.f6680a;
                i3 = this.f6681b;
                fArr = this.f6685f;
                fArr2 = this.f6686g;
                if (aVar3 != null) {
                    long j3 = aVar.f6678a;
                    int i6 = i4;
                    long j4 = aVar3.f6678a;
                    float f7 = j3 - j4;
                    z3 = z4;
                    float abs = Math.abs(j4 - aVar2.f6678a);
                    aVar2 = (i3 == 1 || z3) ? aVar3 : aVar;
                    if (f7 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i5] = aVar3.f6679b;
                    fArr2[i5] = -f7;
                    i4 = (i6 == 0 ? 20 : i6) - 1;
                    i5++;
                    if (i5 >= 20) {
                        break;
                    }
                } else {
                    z3 = z4;
                    break;
                }
            }
            if (i5 >= this.f6682c) {
                int a3 = AbstractC0600j.a(i3);
                if (a3 == 0) {
                    try {
                        float[] fArr3 = this.f6687h;
                        AbstractC0381e.I(fArr2, fArr, i5, fArr3);
                        f5 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f5 = 0.0f;
                    }
                } else {
                    if (a3 != 1) {
                        throw new f();
                    }
                    int i7 = i5 - 1;
                    float f8 = fArr2[i7];
                    int i8 = i7;
                    float f9 = 0.0f;
                    while (i8 > 0) {
                        int i9 = i8 - 1;
                        float f10 = fArr2[i9];
                        if (f8 != f10) {
                            float f11 = (z3 ? -fArr[i9] : fArr[i8] - fArr[i9]) / (f8 - f10);
                            f9 += Math.abs(f11) * (f11 - (Math.signum(f9) * ((float) Math.sqrt(Math.abs(f9) * 2))));
                            if (i8 == i7) {
                                f9 *= 0.5f;
                            }
                        }
                        i8--;
                        f8 = f10;
                    }
                    f5 = Math.signum(f9) * ((float) Math.sqrt(Math.abs(f9) * 2));
                }
                f6 = f5 * 1000;
            } else {
                f6 = 0.0f;
            }
            f4 = 0.0f;
        }
        return (f6 == f4 || Float.isNaN(f6)) ? f4 : f6 > f4 ? AbstractC0381e.o(f6, f3) : AbstractC0381e.n(f6, -f3);
    }
}
