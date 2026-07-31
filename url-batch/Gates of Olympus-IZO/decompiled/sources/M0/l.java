package M0;

import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final m[] f2779b = {new m(0), new m(4294967296L), new m(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f2780c = AbstractC0157a.N(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f2781a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final long b(long j3) {
        return f2779b[(int) ((j3 & 1095216660480L) >>> 32)].f2782a;
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        long b2 = b(j3);
        if (m.a(b2, 0L)) {
            return "Unspecified";
        }
        if (m.a(b2, 4294967296L)) {
            return c(j3) + ".sp";
        }
        if (!m.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j3) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f2781a == ((l) obj).f2781a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2781a);
    }

    public final String toString() {
        return d(this.f2781a);
    }
}
