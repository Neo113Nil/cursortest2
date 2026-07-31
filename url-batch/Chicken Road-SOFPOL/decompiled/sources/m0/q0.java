package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5052a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5053b;

    public q0(Integer num, Object obj) {
        this.f5052a = num;
        this.f5053b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f5052a.equals(q0Var.f5052a) && q6.i.a(this.f5053b, q0Var.f5053b);
    }

    public final int hashCode() {
        int hashCode = this.f5052a.hashCode() * 31;
        Object obj = this.f5053b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f5052a + ", right=" + this.f5053b + ')';
    }
}
