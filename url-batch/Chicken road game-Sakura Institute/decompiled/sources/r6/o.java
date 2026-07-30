package r6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7962a;

    public o(Class cls) {
        this.f7962a = cls;
    }

    @Override // r6.c
    public final Class a() {
        return this.f7962a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return k.a(this.f7962a, ((o) obj).f7962a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7962a.hashCode();
    }

    public final String toString() {
        return this.f7962a.toString() + " (Kotlin reflection is not available)";
    }
}
