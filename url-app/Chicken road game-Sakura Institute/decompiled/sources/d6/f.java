package d6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final f f2613g = new f();

    /* renamed from: f, reason: collision with root package name */
    public final int f2614f = 131093;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        r6.k.f(fVar, "other");
        return this.f2614f - fVar.f2614f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f2614f == fVar.f2614f;
    }

    public final int hashCode() {
        return this.f2614f;
    }

    public final String toString() {
        return "2.0.21";
    }
}
