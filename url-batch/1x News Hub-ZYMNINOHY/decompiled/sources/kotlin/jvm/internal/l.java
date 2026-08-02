package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9688a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f9688a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f9688a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return j.a(this.f9688a, ((l) obj).f9688a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9688a.hashCode();
    }

    public final String toString() {
        return this.f9688a + " (Kotlin reflection is not available)";
    }
}
