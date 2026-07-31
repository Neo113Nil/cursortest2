package O0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f3732a;

    public static String a(long j3) {
        if (j3 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(Float.intBitsToFloat((int) (j3 >> 32)))) + ", " + ((Object) e.b(Float.intBitsToFloat((int) (j3 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3732a == ((f) obj).f3732a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3732a);
    }

    public final String toString() {
        return a(this.f3732a);
    }
}
