package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6314a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6314a == ((g) obj).f6314a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6314a);
    }

    public final String toString() {
        long j8 = this.f6314a;
        if (j8 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.e(Float.intBitsToFloat((int) (j8 >> 32)))) + " x " + ((Object) e.e(Float.intBitsToFloat((int) (j8 & 4294967295L))));
    }
}
