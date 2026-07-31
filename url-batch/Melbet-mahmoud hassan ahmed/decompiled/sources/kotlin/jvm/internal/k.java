package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f18308f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18309g;

    public k(Class<?> cls, String str) {
        i.d(cls, "jClass");
        i.d(str, "moduleName");
        this.f18308f = cls;
        this.f18309g = str;
    }

    @Override // kotlin.jvm.internal.b
    public Class<?> b() {
        return this.f18308f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(b(), ((k) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
