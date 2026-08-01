package e0;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f559a;

    public j(Class cls) {
        this.f559a = cls;
    }

    @Override // e0.d
    public final Class a() {
        return this.f559a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f559a, ((j) obj).f559a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f559a.hashCode();
    }

    public final String toString() {
        return this.f559a + " (Kotlin reflection is not available)";
    }
}
