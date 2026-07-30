package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3814b;

    public o0(Integer num, Object obj) {
        this.f3813a = num;
        this.f3814b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f3813a.equals(o0Var.f3813a) && r6.k.a(this.f3814b, o0Var.f3814b);
    }

    public final int hashCode() {
        int hashCode = this.f3813a.hashCode() * 31;
        Object obj = this.f3814b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f3813a + ", right=" + this.f3814b + ')';
    }
}
