package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sw2 {
    public static final tw2[] b = {new tw2(0), new tw2(4294967296L), new tw2(8589934592L)};
    public static final long c = mi2.n(0, Float.NaN);
    public final long a;

    public /* synthetic */ sw2(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (tw2.a(b2, 0L)) {
            return "Unspecified";
        }
        if (tw2.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!tw2.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sw2) {
            return this.a == ((sw2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
