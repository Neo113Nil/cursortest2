package b0;

import a.AbstractC0157a;
import c0.AbstractC0300c;
import c0.AbstractC0305h;
import c0.AbstractC0307j;
import c0.C0301d;
import c0.C0304g;
import j.C0498p;

/* renamed from: b0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288u {

    /* renamed from: b, reason: collision with root package name */
    public static final long f4292b = AbstractC0259J.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f4293c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f4294d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4295e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f4296f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f4297g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f4298a;

    static {
        AbstractC0259J.c(4282664004L);
        AbstractC0259J.c(4287137928L);
        AbstractC0259J.c(4291611852L);
        AbstractC0259J.c(4294967295L);
        f4293c = AbstractC0259J.c(4294901760L);
        AbstractC0259J.c(4278255360L);
        f4294d = AbstractC0259J.c(4278190335L);
        AbstractC0259J.c(4294967040L);
        AbstractC0259J.c(4278255615L);
        AbstractC0259J.c(4294902015L);
        f4295e = AbstractC0259J.b(0);
        f4296f = AbstractC0259J.a(0.0f, 0.0f, 0.0f, 0.0f, C0301d.f4366s);
    }

    public /* synthetic */ C0288u(long j3) {
        this.f4298a = j3;
    }

    public static final long a(long j3, AbstractC0300c abstractC0300c) {
        C0304g c0304g;
        AbstractC0300c f3 = f(j3);
        int i3 = f3.f4348c;
        int i4 = abstractC0300c.f4348c;
        if ((i3 | i4) < 0) {
            c0304g = AbstractC0307j.e(f3, abstractC0300c, 0);
        } else {
            C0498p c0498p = AbstractC0305h.f4376a;
            int i5 = i3 | (i4 << 6);
            Object f4 = c0498p.f(i5);
            if (f4 == null) {
                f4 = AbstractC0307j.e(f3, abstractC0300c, 0);
                c0498p.i(i5, f4);
            }
            c0304g = (C0304g) f4;
        }
        return c0304g.a(j3);
    }

    public static long b(long j3, float f3) {
        return AbstractC0259J.a(h(j3), g(j3), e(j3), f3, f(j3));
    }

    public static final boolean c(long j3, long j4) {
        return j3 == j4;
    }

    public static final float d(long j3) {
        float Y2;
        float f3;
        if ((63 & j3) == 0) {
            Y2 = (float) AbstractC0157a.Y((j3 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            Y2 = (float) AbstractC0157a.Y((j3 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return Y2 / f3;
    }

    public static final float e(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) AbstractC0157a.Y((j3 >>> 32) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - AbstractC0250A.f4208a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final AbstractC0300c f(long j3) {
        float[] fArr = C0301d.f4349a;
        return C0301d.f4368u[(int) (j3 & 63)];
    }

    public static final float g(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) AbstractC0157a.Y((j3 >>> 40) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - AbstractC0250A.f4208a;
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
            return ((float) AbstractC0157a.Y((j3 >>> 48) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - AbstractC0250A.f4208a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static String i(long j3) {
        return "Color(" + h(j3) + ", " + g(j3) + ", " + e(j3) + ", " + d(j3) + ", " + f(j3).f4346a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0288u) {
            return this.f4298a == ((C0288u) obj).f4298a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4298a);
    }

    public final String toString() {
        return i(this.f4298a);
    }
}
