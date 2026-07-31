package M0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f2767a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f2767a == ((f) obj).f2767a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2767a);
    }

    public final String toString() {
        long j3 = this.f2767a;
        if (j3 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(Float.intBitsToFloat((int) (j3 >> 32)))) + ", " + ((Object) e.b(Float.intBitsToFloat((int) (j3 & 4294967295L)))) + ')';
    }
}
