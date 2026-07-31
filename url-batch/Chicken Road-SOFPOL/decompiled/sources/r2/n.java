package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f6533b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f6534c = o.d0(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f6535a;

    public /* synthetic */ n(long j7) {
        this.f6535a = j7;
    }

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final long b(long j7) {
        return f6533b[(int) ((j7 & 1095216660480L) >>> 32)].f6536a;
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static String d(long j7) {
        long b8 = b(j7);
        if (p.a(b8, 0L)) {
            return "Unspecified";
        }
        if (p.a(b8, 4294967296L)) {
            return c(j7) + ".sp";
        }
        if (!p.a(b8, 8589934592L)) {
            return "Invalid";
        }
        return c(j7) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f6535a == ((n) obj).f6535a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6535a);
    }

    public final String toString() {
        return d(this.f6535a);
    }
}
