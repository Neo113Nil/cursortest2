package M0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f3546a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3546a == ((f) obj).f3546a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3546a);
    }

    public final String toString() {
        long j4 = this.f3546a;
        if (j4 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.c(Float.intBitsToFloat((int) (j4 >> 32)))) + ", " + ((Object) e.c(Float.intBitsToFloat((int) (j4 & 4294967295L)))) + ')';
    }
}
