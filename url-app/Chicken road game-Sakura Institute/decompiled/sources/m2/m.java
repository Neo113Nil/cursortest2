package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f6326b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f6327c = r4.a.O(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f6328a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static final long b(long j8) {
        return f6326b[(int) ((j8 & 1095216660480L) >>> 32)].f6329a;
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static String d(long j8) {
        long b9 = b(j8);
        if (n.a(b9, 0L)) {
            return "Unspecified";
        }
        if (n.a(b9, 4294967296L)) {
            return c(j8) + ".sp";
        }
        if (!n.a(b9, 8589934592L)) {
            return "Invalid";
        }
        return c(j8) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f6328a == ((m) obj).f6328a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6328a);
    }

    public final String toString() {
        return d(this.f6328a);
    }
}
