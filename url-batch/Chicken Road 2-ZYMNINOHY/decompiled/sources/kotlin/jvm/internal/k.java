package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f14155a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f14155a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f14155a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i.a(this.f14155a, ((k) obj).f14155a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14155a.hashCode();
    }

    public final String toString() {
        return this.f14155a.toString() + " (Kotlin reflection is not available)";
    }
}
