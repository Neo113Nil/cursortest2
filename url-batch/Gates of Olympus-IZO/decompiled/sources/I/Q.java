package I;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2181a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2182b;

    public Q(Integer num, Object obj) {
        this.f2181a = num;
        this.f2182b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        return this.f2181a.equals(q2.f2181a) && Z1.i.a(this.f2182b, q2.f2182b);
    }

    public final int hashCode() {
        int hashCode = this.f2181a.hashCode() * 31;
        Object obj = this.f2182b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f2181a + ", right=" + this.f2182b + ')';
    }
}
