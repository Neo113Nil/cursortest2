package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class u implements InterfaceC0641f {

    /* renamed from: d, reason: collision with root package name */
    public final Class f6169d;

    public u(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter("", "moduleName");
        this.f6169d = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC0641f
    public final Class a() {
        return this.f6169d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return Intrinsics.a(this.f6169d, ((u) obj).f6169d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6169d.hashCode();
    }

    public final String toString() {
        return this.f6169d.toString() + " (Kotlin reflection is not available)";
    }
}
