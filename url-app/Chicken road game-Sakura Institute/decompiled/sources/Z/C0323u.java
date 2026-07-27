package Z;

import A.AbstractC0017m;
import a0.AbstractC0348c;
import a0.AbstractC0353h;
import a0.AbstractC0355j;
import a0.C0349d;
import a0.C0352g;
import y2.y;

/* renamed from: Z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323u {

    /* renamed from: b, reason: collision with root package name */
    public static final long f4542b = K.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f4543c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f4544d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4545e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f4546f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f4547g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f4548h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f4549a;

    static {
        K.d(4282664004L);
        K.d(4287137928L);
        K.d(4291611852L);
        f4543c = K.d(4294967295L);
        f4544d = K.d(4294901760L);
        K.d(4278255360L);
        f4545e = K.d(4278190335L);
        K.d(4294967040L);
        K.d(4278255615L);
        K.d(4294902015L);
        f4546f = K.c(0);
        f4547g = K.b(0.0f, 0.0f, 0.0f, 0.0f, C0349d.f4779s);
    }

    public /* synthetic */ C0323u(long j4) {
        this.f4549a = j4;
    }

    public static final long a(long j4, AbstractC0348c abstractC0348c) {
        C0352g c0352g;
        AbstractC0348c f4 = f(j4);
        int i2 = f4.f4760c;
        int i4 = abstractC0348c.f4760c;
        if ((i2 | i4) < 0) {
            c0352g = AbstractC0355j.e(f4, abstractC0348c, 0);
        } else {
            i.q qVar = AbstractC0353h.f4789a;
            int i5 = i2 | (i4 << 6);
            Object f5 = qVar.f(i5);
            if (f5 == null) {
                f5 = AbstractC0355j.e(f4, abstractC0348c, 0);
                qVar.i(i5, f5);
            }
            c0352g = (C0352g) f5;
        }
        return c0352g.a(j4);
    }

    public static long b(float f4, long j4) {
        return K.b(h(j4), g(j4), e(j4), f4, f(j4));
    }

    public static final boolean c(long j4, long j5) {
        y.a aVar = y2.y.f11688e;
        return j4 == j5;
    }

    public static final float d(long j4) {
        float w4;
        float f4;
        long j5 = 63 & j4;
        y.a aVar = y2.y.f11688e;
        if (j5 == 0) {
            w4 = (float) m3.o.w((j4 >>> 56) & 255);
            f4 = 255.0f;
        } else {
            w4 = (float) m3.o.w((j4 >>> 6) & 1023);
            f4 = 1023.0f;
        }
        return w4 / f4;
    }

    public static final float e(long j4) {
        int i2;
        int i4;
        int i5;
        long j5 = 63 & j4;
        y.a aVar = y2.y.f11688e;
        if (j5 == 0) {
            return ((float) m3.o.w((j4 >>> 32) & 255)) / 255.0f;
        }
        short s4 = (short) ((j4 >>> 16) & 65535);
        int i6 = 32768 & s4;
        int i7 = ((65535 & s4) >>> 10) & 31;
        int i8 = s4 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i2 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i2 = i7 + 112;
            }
            int i10 = i2;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - z.f4554a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final AbstractC0348c f(long j4) {
        float[] fArr = C0349d.f4761a;
        y.a aVar = y2.y.f11688e;
        return C0349d.f4781u[(int) (j4 & 63)];
    }

    public static final float g(long j4) {
        int i2;
        int i4;
        int i5;
        long j5 = 63 & j4;
        y.a aVar = y2.y.f11688e;
        if (j5 == 0) {
            return ((float) m3.o.w((j4 >>> 40) & 255)) / 255.0f;
        }
        short s4 = (short) ((j4 >>> 32) & 65535);
        int i6 = 32768 & s4;
        int i7 = ((65535 & s4) >>> 10) & 31;
        int i8 = s4 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i2 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i2 = i7 + 112;
            }
            int i10 = i2;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - z.f4554a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final float h(long j4) {
        int i2;
        int i4;
        int i5;
        long j5 = 63 & j4;
        y.a aVar = y2.y.f11688e;
        if (j5 == 0) {
            return ((float) m3.o.w((j4 >>> 48) & 255)) / 255.0f;
        }
        short s4 = (short) ((j4 >>> 48) & 65535);
        int i6 = 32768 & s4;
        int i7 = ((65535 & s4) >>> 10) & 31;
        int i8 = s4 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i2 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i2 = i7 + 112;
            }
            int i10 = i2;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - z.f4554a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static String i(long j4) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j4));
        sb.append(", ");
        sb.append(g(j4));
        sb.append(", ");
        sb.append(e(j4));
        sb.append(", ");
        sb.append(d(j4));
        sb.append(", ");
        return AbstractC0017m.m(sb, f(j4).f4758a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0323u) {
            return this.f4549a == ((C0323u) obj).f4549a;
        }
        return false;
    }

    public final int hashCode() {
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f4549a);
    }

    public final String toString() {
        return i(this.f4549a);
    }
}
