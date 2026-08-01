package k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final long f5336b = v.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f5337c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f5338d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f5339e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f5340f;
    public static final long g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f5341h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f5342a;

    static {
        v.c(4282664004L);
        v.c(4287137928L);
        v.c(4291611852L);
        f5337c = v.c(4294967295L);
        f5338d = v.c(4294901760L);
        v.c(4278255360L);
        f5339e = v.c(4278190335L);
        v.c(4294967040L);
        v.c(4278255615L);
        v.c(4294902015L);
        f5340f = v.b(0);
        g = v.a(0.0f, 0.0f, 0.0f, 0.0f, l1.d.f5776u);
    }

    public /* synthetic */ p(long j) {
        this.f5342a = j;
    }

    public static final long a(long j, l1.c cVar) {
        l1.g gVar;
        float[] fArr = l1.d.f5758a;
        hd.z zVar = hd.a0.f4495e;
        l1.c cVar2 = l1.d.f5780y[(int) (63 & j)];
        int i3 = cVar2.f5757c;
        int i10 = cVar.f5757c;
        if ((i3 | i10) < 0) {
            gVar = l1.j.e(cVar2, cVar);
        } else {
            s.w wVar = l1.h.f5787a;
            int i11 = i3 | (i10 << 6);
            Object b10 = wVar.b(i11);
            if (b10 == null) {
                b10 = l1.j.e(cVar2, cVar);
                wVar.h(i11, b10);
            }
            gVar = (l1.g) b10;
        }
        return gVar.a(j);
    }

    public static long b(long j, float f3) {
        float g2 = g(j);
        float f10 = f(j);
        float e2 = e(j);
        float[] fArr = l1.d.f5758a;
        hd.z zVar = hd.a0.f4495e;
        return v.a(g2, f10, e2, f3, l1.d.f5780y[(int) (j & 63)]);
    }

    public static final boolean c(long j, long j3) {
        hd.z zVar = hd.a0.f4495e;
        return j == j3;
    }

    public static final float d(long j) {
        float O;
        float f3;
        long j3 = 63 & j;
        hd.z zVar = hd.a0.f4495e;
        if (j3 == 0) {
            O = (float) g8.b.O((j >>> 56) & 255);
            f3 = 255.0f;
        } else {
            O = (float) g8.b.O((j >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return O / f3;
    }

    public static final float e(long j) {
        int i3;
        int i10;
        int i11;
        long j3 = 63 & j;
        hd.z zVar = hd.a0.f4495e;
        if (j3 == 0) {
            return ((float) g8.b.O((j >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j >>> 16) & 65535);
        int i12 = 32768 & s3;
        int i13 = ((65535 & s3) >>> 10) & 31;
        int i14 = s3 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i3 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i3 = i13 + 112;
            }
            int i16 = i3;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - s.f5345a;
                return i12 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float f(long j) {
        int i3;
        int i10;
        int i11;
        long j3 = 63 & j;
        hd.z zVar = hd.a0.f4495e;
        if (j3 == 0) {
            return ((float) g8.b.O((j >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j >>> 32) & 65535);
        int i12 = 32768 & s3;
        int i13 = ((65535 & s3) >>> 10) & 31;
        int i14 = s3 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i3 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i3 = i13 + 112;
            }
            int i16 = i3;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - s.f5345a;
                return i12 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float g(long j) {
        int i3;
        int i10;
        int i11;
        long j3 = 63 & j;
        hd.z zVar = hd.a0.f4495e;
        if (j3 == 0) {
            return ((float) g8.b.O((j >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j >>> 48) & 65535);
        int i12 = 32768 & s3;
        int i13 = ((65535 & s3) >>> 10) & 31;
        int i14 = s3 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i3 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i3 = i13 + 112;
            }
            int i16 = i3;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - s.f5345a;
                return i12 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static String h(long j) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(g(j));
        sb2.append(", ");
        sb2.append(f(j));
        sb2.append(", ");
        sb2.append(e(j));
        sb2.append(", ");
        sb2.append(d(j));
        sb2.append(", ");
        float[] fArr = l1.d.f5758a;
        hd.z zVar = hd.a0.f4495e;
        return n0.l.h(sb2, l1.d.f5780y[(int) (j & 63)].f5755a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f5342a == ((p) obj).f5342a;
        }
        return false;
    }

    public final int hashCode() {
        hd.z zVar = hd.a0.f4495e;
        return Long.hashCode(this.f5342a);
    }

    public final String toString() {
        return h(this.f5342a);
    }
}
