package A;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6b;

    public d(Object obj, Object obj2) {
        this.f5a = obj;
        this.f6b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f5a, this.f5a) && c.a(dVar.f6b, this.f6b);
    }

    public int hashCode() {
        Object obj = this.f5a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f5a + " " + this.f6b + "}";
    }
}
