package O0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f3733a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f3733a == ((g) obj).f3733a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3733a);
    }

    public final String toString() {
        long j3 = this.f3733a;
        if (j3 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(Float.intBitsToFloat((int) (j3 >> 32)))) + " x " + ((Object) e.b(Float.intBitsToFloat((int) (j3 & 4294967295L))));
    }
}
