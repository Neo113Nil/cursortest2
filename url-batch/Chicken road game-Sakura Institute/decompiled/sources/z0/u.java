package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final long f10052b = l0.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f10053c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f10054d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f10055e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f10056f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f10057g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10058h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f10059a;

    static {
        l0.d(4282664004L);
        l0.d(4287137928L);
        l0.d(4291611852L);
        f10053c = l0.d(4294967295L);
        f10054d = l0.d(4294901760L);
        l0.d(4278255360L);
        f10055e = l0.d(4278190335L);
        l0.d(4294967040L);
        l0.d(4278255615L);
        l0.d(4294902015L);
        f10056f = l0.c(0);
        f10057g = l0.b(0.0f, 0.0f, 0.0f, 0.0f, a1.d.f236s);
    }

    public /* synthetic */ u(long j8) {
        this.f10059a = j8;
    }

    public static final long a(long j8, a1.c cVar) {
        a1.g gVar;
        a1.c f9 = f(j8);
        int i7 = f9.f217c;
        int i8 = cVar.f217c;
        if ((i7 | i8) < 0) {
            gVar = a1.j.e(f9, cVar);
        } else {
            i.p pVar = a1.h.f246a;
            int i9 = i7 | (i8 << 6);
            Object f10 = pVar.f(i9);
            if (f10 == null) {
                f10 = a1.j.e(f9, cVar);
                pVar.i(i9, f10);
            }
            gVar = (a1.g) f10;
        }
        return gVar.a(j8);
    }

    public static long b(long j8, float f9) {
        return l0.b(h(j8), g(j8), e(j8), f9, f(j8));
    }

    public static final boolean c(long j8, long j9) {
        return j8 == j9;
    }

    public static final float d(long j8) {
        float f9;
        float f10;
        if ((63 & j8) == 0) {
            f9 = (float) d6.a.f((j8 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            f9 = (float) d6.a.f((j8 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return f9 / f10;
    }

    public static final float e(long j8) {
        int i7;
        int i8;
        int i9;
        if ((63 & j8) == 0) {
            return ((float) d6.a.f((j8 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j8 >>> 16) & 65535);
        int i10 = 32768 & s5;
        int i11 = ((65535 & s5) >>> 10) & 31;
        int i12 = s5 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - b0.f9982a;
                return i10 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static final a1.c f(long j8) {
        float[] fArr = a1.d.f218a;
        return a1.d.f238u[(int) (j8 & 63)];
    }

    public static final float g(long j8) {
        int i7;
        int i8;
        int i9;
        if ((63 & j8) == 0) {
            return ((float) d6.a.f((j8 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j8 >>> 32) & 65535);
        int i10 = 32768 & s5;
        int i11 = ((65535 & s5) >>> 10) & 31;
        int i12 = s5 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - b0.f9982a;
                return i10 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static final float h(long j8) {
        int i7;
        int i8;
        int i9;
        if ((63 & j8) == 0) {
            return ((float) d6.a.f((j8 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j8 >>> 48) & 65535);
        int i10 = 32768 & s5;
        int i11 = ((65535 & s5) >>> 10) & 31;
        int i12 = s5 & 1023;
        if (i11 != 0) {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        } else {
            if (i12 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - b0.f9982a;
                return i10 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    public static String i(long j8) {
        return "Color(" + h(j8) + ", " + g(j8) + ", " + e(j8) + ", " + d(j8) + ", " + f(j8).f215a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f10059a == ((u) obj).f10059a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10059a);
    }

    public final String toString() {
        return i(this.f10059a);
    }
}
