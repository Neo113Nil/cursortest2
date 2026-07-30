package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hi {
    public static final long b = la0.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        la0.d(4282664004L);
        la0.d(4287137928L);
        la0.d(4291611852L);
        c = la0.d(4294967295L);
        d = la0.d(4294901760L);
        la0.d(4278255360L);
        e = la0.d(4278190335L);
        la0.d(4294967040L);
        la0.d(4278255615L);
        la0.d(4294902015L);
        f = la0.c(0);
        g = la0.b(0.0f, 0.0f, 0.0f, 0.0f, si.u);
    }

    public /* synthetic */ hi(long j) {
        this.a = j;
    }

    public static final long a(long j, pi piVar) {
        jm jmVar;
        pi f2 = f(j);
        int i = f2.c;
        int i2 = piVar.c;
        if ((i | i2) < 0) {
            jmVar = p4.C(f2, piVar);
        } else {
            en0 en0Var = km.a;
            int i3 = i | (i2 << 6);
            Object b2 = en0Var.b(i3);
            if (b2 == null) {
                b2 = p4.C(f2, piVar);
                en0Var.h(i3, b2);
            }
            jmVar = (jm) b2;
        }
        return jmVar.a(j);
    }

    public static long b(float f2, long j) {
        return la0.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        jk1 jk1Var = kk1.d;
        return j == j2;
    }

    public static final float d(long j) {
        float y;
        float f2;
        long j2 = 63 & j;
        jk1 jk1Var = kk1.d;
        if (j2 == 0) {
            y = (float) ca0.y((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            y = (float) ca0.y((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return y / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        jk1 jk1Var = kk1.d;
        if (j2 == 0) {
            return ((float) ca0.y((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - yz.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final pi f(long j) {
        float[] fArr = si.a;
        jk1 jk1Var = kk1.d;
        return si.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        jk1 jk1Var = kk1.d;
        if (j2 == 0) {
            return ((float) ca0.y((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - yz.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        jk1 jk1Var = kk1.d;
        if (j2 == 0) {
            return ((float) ca0.y((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - yz.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        return "Color(" + h(j) + ", " + g(j) + ", " + e(j) + ", " + d(j) + ", " + f(j).a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hi) {
            return this.a == ((hi) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        jk1 jk1Var = kk1.d;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
