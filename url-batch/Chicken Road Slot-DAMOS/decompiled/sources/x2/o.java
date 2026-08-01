package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f10337a;

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f10337a == ((o) obj).f10337a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10337a);
    }

    public final String toString() {
        long j = this.f10337a;
        return a(j, 0L) ? "Unspecified" : a(j, 4294967296L) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
