package l8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5935a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5936b;

    public r(Class cls, Class cls2) {
        this.f5935a = cls;
        this.f5936b = cls2;
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
        if (this.f5936b.equals(rVar.f5936b)) {
            return this.f5935a.equals(rVar.f5935a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5935a.hashCode() + (this.f5936b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f5936b;
        Class cls2 = this.f5935a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
