package b0;

import c0.AbstractC0357c;
import c0.AbstractC0362h;
import c0.AbstractC0364j;
import c0.C0358d;
import c0.C0361g;
import j.C0542p;

/* renamed from: b0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0352v {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5434b = M.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f5435c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f5436d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5437e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5438f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f5439g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5440h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f5441a;

    static {
        M.d(4282664004L);
        M.d(4287137928L);
        M.d(4291611852L);
        f5435c = M.d(4294967295L);
        f5436d = M.d(4294901760L);
        M.d(4278255360L);
        f5437e = M.d(4278190335L);
        M.d(4294967040L);
        M.d(4278255615L);
        M.d(4294902015L);
        f5438f = M.c(0);
        f5439g = M.b(0.0f, 0.0f, 0.0f, 0.0f, C0358d.f5492s);
    }

    public /* synthetic */ C0352v(long j3) {
        this.f5441a = j3;
    }

    public static final long a(long j3, AbstractC0357c abstractC0357c) {
        C0361g c0361g;
        AbstractC0357c f3 = f(j3);
        int i3 = f3.f5473c;
        int i4 = abstractC0357c.f5473c;
        if ((i3 | i4) < 0) {
            c0361g = AbstractC0364j.e(f3, abstractC0357c, 0);
        } else {
            C0542p c0542p = AbstractC0362h.f5502a;
            int i5 = i3 | (i4 << 6);
            Object f4 = c0542p.f(i5);
            if (f4 == null) {
                f4 = AbstractC0364j.e(f3, abstractC0357c, 0);
                c0542p.i(i5, f4);
            }
            c0361g = (C0361g) f4;
        }
        return c0361g.a(j3);
    }

    public static long b(long j3, float f3) {
        return M.b(h(j3), g(j3), e(j3), f3, f(j3));
    }

    public static final boolean c(long j3, long j4) {
        return j3 == j4;
    }

    public static final float d(long j3) {
        float f3;
        float f4;
        if ((63 & j3) == 0) {
            f3 = (float) R1.a.f((j3 >>> 56) & 255);
            f4 = 255.0f;
        } else {
            f3 = (float) R1.a.f((j3 >>> 6) & 1023);
            f4 = 1023.0f;
        }
        return f3 / f4;
    }

    public static final float e(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) R1.a.f((j3 >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 16) & 65535);
        int i6 = 32768 & s3;
        int i7 = ((65535 & s3) >>> 10) & 31;
        int i8 = s3 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i3 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i3 = i7 + 112;
            }
            int i10 = i3;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - C.f5347a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final AbstractC0357c f(long j3) {
        float[] fArr = C0358d.f5474a;
        return C0358d.f5494u[(int) (j3 & 63)];
    }

    public static final float g(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) R1.a.f((j3 >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 32) & 65535);
        int i6 = 32768 & s3;
        int i7 = ((65535 & s3) >>> 10) & 31;
        int i8 = s3 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i3 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i3 = i7 + 112;
            }
            int i10 = i3;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - C.f5347a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final float h(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) R1.a.f((j3 >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 48) & 65535);
        int i6 = 32768 & s3;
        int i7 = ((65535 & s3) >>> 10) & 31;
        int i8 = s3 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i3 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i3 = i7 + 112;
            }
            int i10 = i3;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - C.f5347a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static String i(long j3) {
        return "Color(" + h(j3) + ", " + g(j3) + ", " + e(j3) + ", " + d(j3) + ", " + f(j3).f5471a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0352v) {
            return this.f5441a == ((C0352v) obj).f5441a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5441a);
    }

    public final String toString() {
        return i(this.f5441a);
    }
}
