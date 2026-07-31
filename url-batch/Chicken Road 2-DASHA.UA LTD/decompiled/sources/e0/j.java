package e0;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f503a;

    public j(Class cls) {
        this.f503a = cls;
    }

    @Override // e0.d
    public final Class a() {
        return this.f503a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f503a, ((j) obj).f503a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f503a.hashCode();
    }

    public final String toString() {
        return this.f503a + " (Kotlin reflection is not available)";
    }
}
