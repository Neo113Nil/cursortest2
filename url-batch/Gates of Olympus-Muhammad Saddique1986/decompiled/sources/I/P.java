package I;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2736a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2737b;

    public P(Integer num, Object obj) {
        this.f2736a = num;
        this.f2737b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return this.f2736a.equals(p3.f2736a) && f2.j.a(this.f2737b, p3.f2737b);
    }

    public final int hashCode() {
        int hashCode = this.f2736a.hashCode() * 31;
        Object obj = this.f2737b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f2736a + ", right=" + this.f2737b + ')';
    }
}
