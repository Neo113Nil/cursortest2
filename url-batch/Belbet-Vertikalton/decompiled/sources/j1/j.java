package j1;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3183a;

    public j(Class cls) {
        this.f3183a = cls;
    }

    @Override // j1.c
    public final Class a() {
        return this.f3183a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f3183a, ((j) obj).f3183a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3183a.hashCode();
    }

    public final String toString() {
        return this.f3183a.toString() + " (Kotlin reflection is not available)";
    }
}
