package k1;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3243a;

    public g(Class cls) {
        this.f3243a = cls;
    }

    @Override // k1.b
    public final Class a() {
        return this.f3243a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (e.a(this.f3243a, ((g) obj).f3243a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3243a.hashCode();
    }

    public final String toString() {
        return this.f3243a.toString() + " (Kotlin reflection is not available)";
    }
}
