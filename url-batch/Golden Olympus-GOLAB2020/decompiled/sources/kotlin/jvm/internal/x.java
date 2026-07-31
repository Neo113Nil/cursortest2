package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public final class x implements InterfaceC3242h {

    /* renamed from: b, reason: collision with root package name */
    private final Class f41163b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41164c;

    public x(Class jClass, String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f41163b = jClass;
        this.f41164c = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC3242h
    public Class a() {
        return this.f41163b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && Intrinsics.areEqual(a(), ((x) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
