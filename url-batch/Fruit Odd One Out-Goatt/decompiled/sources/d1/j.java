package d1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f93a;

    public j(Class cls) {
        this.f93a = cls;
    }

    @Override // d1.d
    public final Class a() {
        return this.f93a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f93a.equals(((j) obj).f93a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f93a.hashCode();
    }

    public final String toString() {
        return this.f93a.toString() + " (Kotlin reflection is not available)";
    }
}
