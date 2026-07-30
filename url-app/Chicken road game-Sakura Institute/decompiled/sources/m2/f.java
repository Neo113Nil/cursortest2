package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f6313a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f6313a == ((f) obj).f6313a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6313a);
    }

    public final String toString() {
        long j8 = this.f6313a;
        if (j8 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.e(Float.intBitsToFloat((int) (j8 >> 32)))) + ", " + ((Object) e.e(Float.intBitsToFloat((int) (j8 & 4294967295L)))) + ')';
    }
}
