package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2698b = p.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2699c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2700d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2701e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2702f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2703g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f2704h;
    public static final /* synthetic */ int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2705a;

    static {
        p.c(4282664004L);
        f2699c = p.c(4287137928L);
        p.c(4291611852L);
        f2700d = p.c(4294967295L);
        f2701e = p.c(4294901760L);
        p.c(4278255360L);
        f2702f = p.c(4278190335L);
        p.c(4294967040L);
        p.c(4278255615L);
        p.c(4294902015L);
        f2703g = p.b(0);
        f2704h = p.a(0.0f, 0.0f, 0.0f, 0.0f, g1.d.f2840u);
    }

    public /* synthetic */ s(long j7) {
        this.f2705a = j7;
    }

    public static final long a(long j7, g1.c cVar) {
        g1.g gVar;
        g1.c f6 = f(j7);
        int i8 = f6.f2820c;
        int i9 = cVar.f2820c;
        if ((i8 | i9) < 0) {
            gVar = g1.j.e(f6, cVar);
        } else {
            o.x xVar = g1.h.f2852a;
            int i10 = i8 | (i9 << 6);
            Object b8 = xVar.b(i10);
            if (b8 == null) {
                b8 = g1.j.e(f6, cVar);
                xVar.g(i10, b8);
            }
            gVar = (g1.g) b8;
        }
        return gVar.a(j7);
    }

    public static long b(long j7, float f6) {
        return p.a(h(j7), g(j7), e(j7), f6, f(j7));
    }

    public static final boolean c(long j7, long j8) {
        return j7 == j8;
    }

    public static final float d(long j7) {
        float B;
        float f6;
        if ((63 & j7) == 0) {
            B = (float) a.a.B((j7 >>> 56) & 255);
            f6 = 255.0f;
        } else {
            B = (float) a.a.B((j7 >>> 6) & 1023);
            f6 = 1023.0f;
        }
        return B / f6;
    }

    public static final float e(long j7) {
        int i8;
        int i9;
        int i10;
        if ((63 & j7) == 0) {
            return ((float) a.a.B((j7 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j7 >>> 16) & 65535);
        int i11 = 32768 & s5;
        int i12 = ((65535 & s5) >>> 10) & 31;
        int i13 = s5 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i8 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i8 = i12 + 112;
            }
            int i15 = i8;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - w.f2708a;
                return i11 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static final g1.c f(long j7) {
        float[] fArr = g1.d.f2821a;
        return g1.d.f2844y[(int) (j7 & 63)];
    }

    public static final float g(long j7) {
        int i8;
        int i9;
        int i10;
        if ((63 & j7) == 0) {
            return ((float) a.a.B((j7 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j7 >>> 32) & 65535);
        int i11 = 32768 & s5;
        int i12 = ((65535 & s5) >>> 10) & 31;
        int i13 = s5 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i8 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i8 = i12 + 112;
            }
            int i15 = i8;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - w.f2708a;
                return i11 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static final float h(long j7) {
        int i8;
        int i9;
        int i10;
        if ((63 & j7) == 0) {
            return ((float) a.a.B((j7 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j7 >>> 48) & 65535);
        int i11 = 32768 & s5;
        int i12 = ((65535 & s5) >>> 10) & 31;
        int i13 = s5 & 1023;
        if (i12 != 0) {
            int i14 = i13 << 13;
            if (i12 == 31) {
                i8 = 255;
                if (i14 != 0) {
                    i14 |= 4194304;
                }
            } else {
                i8 = i12 + 112;
            }
            int i15 = i8;
            i9 = i14;
            i10 = i15;
        } else {
            if (i13 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i13 + 1056964608) - w.f2708a;
                return i11 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i10 = 0;
            i9 = 0;
        }
        return Float.intBitsToFloat((i10 << 23) | (i11 << 16) | i9);
    }

    public static String i(long j7) {
        return "Color(" + h(j7) + ", " + g(j7) + ", " + e(j7) + ", " + d(j7) + ", " + f(j7).f2818a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f2705a == ((s) obj).f2705a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2705a);
    }

    public final String toString() {
        return i(this.f2705a);
    }
}
