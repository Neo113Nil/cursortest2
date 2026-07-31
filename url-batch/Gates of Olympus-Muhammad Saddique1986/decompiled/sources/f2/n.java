package f2;

/* loaded from: classes.dex */
public final class n implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5826a;

    public n(Class cls) {
        this.f5826a = cls;
    }

    @Override // f2.c
    public final Class a() {
        return this.f5826a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (j.a(this.f5826a, ((n) obj).f5826a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5826a.hashCode();
    }

    public final String toString() {
        return this.f5826a.toString() + " (Kotlin reflection is not available)";
    }
}
