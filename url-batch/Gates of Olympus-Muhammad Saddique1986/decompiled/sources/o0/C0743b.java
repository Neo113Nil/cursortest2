package o0;

import O2.d;
import m.AbstractC0625j;
import n.T;
import n.z0;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7426a = false;

    /* renamed from: b, reason: collision with root package name */
    public final int f7427b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f7428c;

    /* renamed from: d, reason: collision with root package name */
    public final C0742a[] f7429d;

    /* renamed from: e, reason: collision with root package name */
    public int f7430e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f7431f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f7432g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f7433h;

    public C0743b() {
        int i3;
        int b3 = AbstractC0625j.b(1);
        if (b3 == 0) {
            i3 = 3;
        } else {
            if (b3 != 1) {
                throw new C1.c();
            }
            i3 = 2;
        }
        this.f7428c = i3;
        this.f7429d = new C0742a[20];
        this.f7431f = new float[20];
        this.f7432g = new float[20];
        this.f7433h = new float[3];
    }

    public final void a(long j3, float f3) {
        int i3 = (this.f7430e + 1) % 20;
        this.f7430e = i3;
        C0742a[] c0742aArr = this.f7429d;
        C0742a c0742a = c0742aArr[i3];
        if (c0742a != null) {
            c0742a.f7424a = j3;
            c0742a.f7425b = f3;
        } else {
            C0742a c0742a2 = new C0742a();
            c0742a2.f7424a = j3;
            c0742a2.f7425b = f3;
            c0742aArr[i3] = c0742a2;
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
            z0.o("maximumVelocity should be a positive value. You specified=" + f3);
            throw null;
        }
        int i4 = this.f7430e;
        C0742a[] c0742aArr = this.f7429d;
        C0742a c0742a = c0742aArr[i4];
        if (c0742a == null) {
            f4 = 0.0f;
        } else {
            int i5 = 0;
            C0742a c0742a2 = c0742a;
            while (true) {
                C0742a c0742a3 = c0742aArr[i4];
                boolean z4 = this.f7426a;
                i3 = this.f7427b;
                fArr = this.f7431f;
                fArr2 = this.f7432g;
                if (c0742a3 != null) {
                    long j3 = c0742a.f7424a;
                    int i6 = i4;
                    long j4 = c0742a3.f7424a;
                    float f7 = j3 - j4;
                    z3 = z4;
                    float abs = Math.abs(j4 - c0742a2.f7424a);
                    c0742a2 = (i3 == 1 || z3) ? c0742a3 : c0742a;
                    if (f7 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i5] = c0742a3.f7425b;
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
            if (i5 >= this.f7428c) {
                int b3 = AbstractC0625j.b(i3);
                if (b3 == 0) {
                    try {
                        float[] fArr3 = this.f7433h;
                        T.o(fArr2, fArr, i5, fArr3);
                        f5 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f5 = 0.0f;
                    }
                } else {
                    if (b3 != 1) {
                        throw new C1.c();
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
        return (f6 == f4 || Float.isNaN(f6)) ? f4 : f6 > f4 ? d.v(f6, f3) : d.u(f6, -f3);
    }
}
