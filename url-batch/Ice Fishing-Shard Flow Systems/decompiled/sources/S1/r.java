package S1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2503a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2504b;

    public r(Class cls, Class cls2) {
        this.f2503a = cls;
        this.f2504b = cls2;
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
        if (this.f2504b.equals(rVar.f2504b)) {
            return this.f2503a.equals(rVar.f2503a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2503a.hashCode() + (this.f2504b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2504b;
        Class cls2 = this.f2503a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
