package p1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5695a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5696b;

    public o(Class cls, Class cls2) {
        this.f5695a = cls;
        this.f5696b = cls2;
    }

    public static o a(Class cls) {
        return new o(n.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f5696b.equals(oVar.f5696b)) {
            return this.f5695a.equals(oVar.f5695a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5695a.hashCode() + (this.f5696b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f5696b;
        Class cls2 = this.f5695a;
        if (cls2 == n.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
