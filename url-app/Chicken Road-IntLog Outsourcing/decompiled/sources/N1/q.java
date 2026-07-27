package N1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2034a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2035b;

    public q(Class cls, Class cls2) {
        this.f2034a = cls;
        this.f2035b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f2035b.equals(qVar.f2035b)) {
            return this.f2034a.equals(qVar.f2034a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2034a.hashCode() + (this.f2035b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2035b;
        Class cls2 = this.f2034a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
