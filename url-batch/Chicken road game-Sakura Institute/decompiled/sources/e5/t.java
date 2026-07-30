package e5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2798a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2799b;

    public t(Class cls, Class cls2) {
        this.f2798a = cls;
        this.f2799b = cls2;
    }

    public static t a(Class cls) {
        return new t(s.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f2799b.equals(tVar.f2799b)) {
            return this.f2798a.equals(tVar.f2798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2798a.hashCode() + (this.f2799b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2799b;
        Class cls2 = this.f2798a;
        if (cls2 == s.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
