package Z1;

/* loaded from: classes.dex */
public final class m implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3474a;

    public m(Class cls) {
        this.f3474a = cls;
    }

    @Override // Z1.c
    public final Class a() {
        return this.f3474a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (i.a(this.f3474a, ((m) obj).f3474a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3474a.hashCode();
    }

    public final String toString() {
        return this.f3474a.toString() + " (Kotlin reflection is not available)";
    }
}
