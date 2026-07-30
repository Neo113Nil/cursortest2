package F0;

/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f320a;

    public k(Class cls) {
        this.f320a = cls;
    }

    @Override // F0.d
    public final Class a() {
        return this.f320a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f320a, ((k) obj).f320a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f320a.hashCode();
    }

    public final String toString() {
        return this.f320a + " (Kotlin reflection is not available)";
    }
}
