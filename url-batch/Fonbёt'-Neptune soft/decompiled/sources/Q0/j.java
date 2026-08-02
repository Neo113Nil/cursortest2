package Q0;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f979a;

    public j(Class cls) {
        this.f979a = cls;
    }

    @Override // Q0.d
    public final Class a() {
        return this.f979a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f979a, ((j) obj).f979a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f979a.hashCode();
    }

    public final String toString() {
        return this.f979a.toString() + " (Kotlin reflection is not available)";
    }
}
