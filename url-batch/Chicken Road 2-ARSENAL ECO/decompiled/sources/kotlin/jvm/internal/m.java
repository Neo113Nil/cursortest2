package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class m implements c {

    /* renamed from: f, reason: collision with root package name */
    public final Class f5230f;

    public m(Class jClass) {
        i.e(jClass, "jClass");
        this.f5230f = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f5230f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return i.a(this.f5230f, ((m) obj).f5230f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5230f.hashCode();
    }

    public final String toString() {
        return this.f5230f.toString() + " (Kotlin reflection is not available)";
    }
}
