package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5864a;

    public static String a(int i7) {
        return i7 == 1 ? "Hyphens.None" : i7 == 2 ? "Hyphens.Auto" : i7 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f5864a == ((d) obj).f5864a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5864a);
    }

    public final String toString() {
        return a(this.f5864a);
    }
}
