package g1;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2569a;

    public h(Class cls) {
        this.f2569a = cls;
    }

    @Override // g1.b
    public final Class a() {
        return this.f2569a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (f.a(this.f2569a, ((h) obj).f2569a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2569a.hashCode();
    }

    public final String toString() {
        return this.f2569a.toString() + " (Kotlin reflection is not available)";
    }
}
