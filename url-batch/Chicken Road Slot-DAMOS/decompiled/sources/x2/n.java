package x2;

import z4.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final o[] f10334b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f10335c = v.d(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f10336a;

    public /* synthetic */ n(long j) {
        this.f10336a = j;
    }

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public static final long b(long j) {
        return f10334b[(int) ((j & 1095216660480L) >>> 32)].f10337a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b10 = b(j);
        if (o.a(b10, 0L)) {
            return "Unspecified";
        }
        if (o.a(b10, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!o.a(b10, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f10336a == ((n) obj).f10336a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10336a);
    }

    public final String toString() {
        return d(this.f10336a);
    }
}
