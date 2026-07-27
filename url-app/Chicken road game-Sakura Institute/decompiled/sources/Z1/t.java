package Z1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4602a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4603b;

    public t(Class cls, Class cls2) {
        this.f4602a = cls;
        this.f4603b = cls2;
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
        if (this.f4603b.equals(tVar.f4603b)) {
            return this.f4602a.equals(tVar.f4602a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4602a.hashCode() + (this.f4603b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f4603b;
        Class cls2 = this.f4602a;
        if (cls2 == s.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
