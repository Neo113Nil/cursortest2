package P0;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f803a;

    public j(Class cls) {
        this.f803a = cls;
    }

    @Override // P0.d
    public final Class a() {
        return this.f803a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return h.a(this.f803a, ((j) obj).f803a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f803a.hashCode();
    }

    public final String toString() {
        return this.f803a.toString() + " (Kotlin reflection is not available)";
    }
}
