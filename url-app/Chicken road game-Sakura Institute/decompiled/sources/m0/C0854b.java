package m0;

import l.AbstractC0784j;
import n.AbstractC0864b;
import u3.l;
import y2.C1338m;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8237a = false;

    /* renamed from: b, reason: collision with root package name */
    public final int f8238b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f8239c;

    /* renamed from: d, reason: collision with root package name */
    public final C0853a[] f8240d;

    /* renamed from: e, reason: collision with root package name */
    public int f8241e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f8242f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8243g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f8244h;

    public C0854b() {
        int i2;
        int d4 = AbstractC0784j.d(1);
        if (d4 == 0) {
            i2 = 3;
        } else {
            if (d4 != 1) {
                throw new C1338m();
            }
            i2 = 2;
        }
        this.f8239c = i2;
        this.f8240d = new C0853a[20];
        this.f8242f = new float[20];
        this.f8243g = new float[20];
        this.f8244h = new float[3];
    }

    public final void a(float f4, long j4) {
        int i2 = (this.f8241e + 1) % 20;
        this.f8241e = i2;
        C0853a[] c0853aArr = this.f8240d;
        C0853a c0853a = c0853aArr[i2];
        if (c0853a != null) {
            c0853a.f8235a = j4;
            c0853a.f8236b = f4;
        } else {
            C0853a c0853a2 = new C0853a();
            c0853a2.f8235a = j4;
            c0853a2.f8236b = f4;
            c0853aArr[i2] = c0853a2;
        }
    }

    public final float b(float f4) {
        int i2;
        float[] fArr;
        float[] fArr2;
        boolean z4;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (f4 <= 0.0f) {
            AbstractC0864b.D("maximumVelocity should be a positive value. You specified=" + f4);
            throw null;
        }
        int i4 = this.f8241e;
        C0853a[] c0853aArr = this.f8240d;
        C0853a c0853a = c0853aArr[i4];
        if (c0853a == null) {
            f5 = 0.0f;
        } else {
            int i5 = 0;
            C0853a c0853a2 = c0853a;
            while (true) {
                C0853a c0853a3 = c0853aArr[i4];
                boolean z5 = this.f8237a;
                i2 = this.f8238b;
                fArr = this.f8242f;
                fArr2 = this.f8243g;
                if (c0853a3 != null) {
                    long j4 = c0853a.f8235a;
                    int i6 = i4;
                    long j5 = c0853a3.f8235a;
                    float f8 = j4 - j5;
                    z4 = z5;
                    float abs = Math.abs(j5 - c0853a2.f8235a);
                    c0853a2 = (i2 == 1 || z4) ? c0853a3 : c0853a;
                    if (f8 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i5] = c0853a3.f8236b;
                    fArr2[i5] = -f8;
                    i4 = (i6 == 0 ? 20 : i6) - 1;
                    i5++;
                    if (i5 >= 20) {
                        break;
                    }
                } else {
                    z4 = z5;
                    break;
                }
            }
            if (i5 >= this.f8239c) {
                int d4 = AbstractC0784j.d(i2);
                if (d4 == 0) {
                    try {
                        float[] fArr3 = this.f8244h;
                        l.q0(fArr2, fArr, i5, fArr3);
                        f6 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f6 = 0.0f;
                    }
                } else {
                    if (d4 != 1) {
                        throw new C1338m();
                    }
                    int i7 = i5 - 1;
                    float f9 = fArr2[i7];
                    int i8 = i7;
                    float f10 = 0.0f;
                    while (i8 > 0) {
                        int i9 = i8 - 1;
                        float f11 = fArr2[i9];
                        if (f9 != f11) {
                            float f12 = (z4 ? -fArr[i9] : fArr[i8] - fArr[i9]) / (f9 - f11);
                            f10 += Math.abs(f12) * (f12 - (Math.signum(f10) * ((float) Math.sqrt(Math.abs(f10) * 2))));
                            if (i8 == i7) {
                                f10 *= 0.5f;
                            }
                        }
                        i8--;
                        f9 = f11;
                    }
                    f6 = Math.signum(f10) * ((float) Math.sqrt(Math.abs(f10) * 2));
                }
                f7 = f6 * 1000;
            } else {
                f7 = 0.0f;
            }
            f5 = 0.0f;
        }
        return (f7 == f5 || Float.isNaN(f7)) ? f5 : f7 > f5 ? kotlin.ranges.b.b(f7, f4) : kotlin.ranges.b.a(f7, -f4);
    }
}
