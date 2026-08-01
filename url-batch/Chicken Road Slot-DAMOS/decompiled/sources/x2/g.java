package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f10323a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f10323a == ((g) obj).f10323a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10323a);
    }

    public final String toString() {
        long j = this.f10323a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) f.c(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
