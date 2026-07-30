package N3;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2192a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2193b;

    public r(Class cls, Class cls2) {
        this.f2192a = cls;
        this.f2193b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f2193b.equals(rVar.f2193b)) {
            return this.f2192a.equals(rVar.f2192a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2192a.hashCode() + (this.f2193b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2193b;
        Class cls2 = this.f2192a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
