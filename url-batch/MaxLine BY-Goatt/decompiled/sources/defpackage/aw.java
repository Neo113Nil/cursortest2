package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aw {
    public static final long b = ap.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        ap.d(4282664004L);
        ap.d(4287137928L);
        ap.d(4291611852L);
        c = ap.d(4294967295L);
        d = ap.d(4294901760L);
        ap.d(4278255360L);
        e = ap.d(4278190335L);
        ap.d(4294967040L);
        ap.d(4278255615L);
        ap.d(4294902015L);
        f = ap.c(0);
        float[] fArr = kw.a;
        g = ap.b(0.0f, 0.0f, 0.0f, 0.0f, kw.u);
    }

    public /* synthetic */ aw(long j) {
        this.a = j;
    }

    public static final long a(long j, iw iwVar) {
        m10 m10Var;
        iw f2 = f(j);
        int i = f2.c;
        int i2 = iwVar.c;
        if ((i | i2) < 0) {
            m10Var = l41.y(f2, iwVar);
        } else {
            zm1 zm1Var = n10.a;
            int i3 = i | (i2 << 6);
            Object b2 = zm1Var.b(i3);
            if (b2 == null) {
                b2 = l41.y(f2, iwVar);
                zm1Var.h(i3, b2);
            }
            m10Var = (m10) b2;
        }
        return m10Var.a(j);
    }

    public static long b(long j, float f2) {
        return ap.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        q13.a aVar = q13.m;
        return j == j2;
    }

    public static final float d(long j) {
        float n;
        float f2;
        long j2 = 63 & j;
        q13.a aVar = q13.m;
        if (j2 == 0) {
            n = (float) ij2.n((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            n = (float) ij2.n((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return n / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        q13.a aVar = q13.m;
        if (j2 == 0) {
            return ((float) ij2.n((j >>> 32) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - sm0.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final iw f(long j) {
        float[] fArr = kw.a;
        q13.a aVar = q13.m;
        return kw.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        q13.a aVar = q13.m;
        if (j2 == 0) {
            return ((float) ij2.n((j >>> 40) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - sm0.a;
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
        q13.a aVar = q13.m;
        if (j2 == 0) {
            return ((float) ij2.n((j >>> 48) & 255)) / 255.0f;
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
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - sm0.a;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return in1.m(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aw) {
            return this.a == ((aw) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        q13.a aVar = q13.m;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
