package q6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6199a;

    public l(Class cls) {
        this.f6199a = cls;
    }

    @Override // q6.d
    public final Class a() {
        return this.f6199a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return i.a(this.f6199a, ((l) obj).f6199a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6199a.hashCode();
    }

    public final String toString() {
        return this.f6199a.toString() + " (Kotlin reflection is not available)";
    }
}
