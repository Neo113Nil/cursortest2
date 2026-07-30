package m1;

import a8.m;
import l.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6297a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f6298b;

    /* renamed from: c, reason: collision with root package name */
    public int f6299c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f6300d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6301e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6302f;

    public b() {
        int i7;
        int d8 = h.d(1);
        if (d8 == 0) {
            i7 = 3;
        } else {
            if (d8 != 1) {
                throw new b4.c();
            }
            i7 = 2;
        }
        this.f6297a = i7;
        this.f6298b = new a[20];
        this.f6300d = new float[20];
        this.f6301e = new float[20];
        this.f6302f = new float[3];
    }

    public final void a(long j8, float f9) {
        int i7 = (this.f6299c + 1) % 20;
        this.f6299c = i7;
        a[] aVarArr = this.f6298b;
        a aVar = aVarArr[i7];
        if (aVar != null) {
            aVar.f6295a = j8;
            aVar.f6296b = f9;
        } else {
            a aVar2 = new a();
            aVar2.f6295a = j8;
            aVar2.f6296b = f9;
            aVarArr[i7] = aVar2;
        }
    }

    public final float b(float f9) {
        float[] fArr;
        float[] fArr2;
        float f10;
        float f11;
        float f12 = f9;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            a.a.M("maximumVelocity should be a positive value. You specified=" + f12);
            throw null;
        }
        int i7 = this.f6299c;
        a[] aVarArr = this.f6298b;
        a aVar = aVarArr[i7];
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            int i8 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i7];
                fArr = this.f6300d;
                fArr2 = this.f6301e;
                if (aVar3 != null) {
                    long j8 = aVar.f6295a;
                    long j9 = aVar3.f6295a;
                    float f14 = j8 - j9;
                    f10 = f13;
                    int i9 = i7;
                    float abs = Math.abs(j9 - aVar2.f6295a);
                    if (f14 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i8] = aVar3.f6296b;
                    fArr2[i8] = -f14;
                    i7 = (i9 == 0 ? 20 : i9) - 1;
                    i8++;
                    if (i8 >= 20) {
                        break;
                    }
                    aVar2 = aVar3;
                    f13 = f10;
                } else {
                    f10 = f13;
                    break;
                }
            }
            if (i8 >= this.f6297a) {
                int d8 = h.d(1);
                if (d8 == 0) {
                    try {
                        float[] fArr3 = this.f6302f;
                        m.H(fArr2, fArr, i8, fArr3);
                        f11 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f11 = f10;
                    }
                } else {
                    if (d8 != 1) {
                        throw new b4.c();
                    }
                    int i10 = i8 - 1;
                    float f15 = fArr2[i10];
                    int i11 = i10;
                    float f16 = f10;
                    while (i11 > 0) {
                        int i12 = i11 - 1;
                        float f17 = fArr2[i12];
                        if (f15 != f17) {
                            float f18 = (fArr[i11] - fArr[i12]) / (f15 - f17);
                            f16 += Math.abs(f18) * (f18 - (Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2))));
                            if (i11 == i10) {
                                f16 *= 0.5f;
                            }
                        }
                        i11--;
                        f15 = f17;
                    }
                    f11 = Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2));
                }
                f13 = f11 * 1000;
            } else {
                f13 = f10;
            }
        }
        if (f13 == f10 || Float.isNaN(f13)) {
            return f10;
        }
        if (f13 <= f10) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }
}
