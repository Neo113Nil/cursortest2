package f2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3276a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3276a == ((j) obj).f3276a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3276a);
    }

    public final String toString() {
        int i7 = this.f3276a;
        return i7 == 0 ? "None" : i7 == 1 ? "All" : i7 == 2 ? "Weight" : i7 == 3 ? "Style" : "Invalid";
    }
}
