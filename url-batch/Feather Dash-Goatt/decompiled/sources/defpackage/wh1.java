package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wh1 {
    public static final xh1[] b = {new xh1(0), new xh1(4294967296L), new xh1(8589934592L)};
    public static final long c = t80.E(Float.NaN, 0);
    public final long a;

    public /* synthetic */ wh1(long j) {
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
        if (xh1.a(b2, 0L)) {
            return "Unspecified";
        }
        if (xh1.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!xh1.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wh1) {
            return this.a == ((wh1) obj).a;
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
