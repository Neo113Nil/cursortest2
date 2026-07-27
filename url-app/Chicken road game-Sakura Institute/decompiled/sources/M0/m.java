package M0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f3559b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f3560c = u3.l.p0(Float.NaN, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f3561a;

    public /* synthetic */ m(long j4) {
        this.f3561a = j4;
    }

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static final long b(long j4) {
        return f3559b[(int) ((j4 & 1095216660480L) >>> 32)].f3562a;
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static String d(long j4) {
        long b4 = b(j4);
        if (n.a(b4, 0L)) {
            return "Unspecified";
        }
        if (n.a(b4, 4294967296L)) {
            return c(j4) + ".sp";
        }
        if (!n.a(b4, 8589934592L)) {
            return "Invalid";
        }
        return c(j4) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f3561a == ((m) obj).f3561a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3561a);
    }

    public final String toString() {
        return d(this.f3561a);
    }
}
