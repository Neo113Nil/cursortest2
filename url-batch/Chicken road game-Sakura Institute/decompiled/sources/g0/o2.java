package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o2 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3819a;

    public o2(Object obj) {
        this.f3819a = obj;
    }

    @Override // g0.p2
    public final Object a(k1 k1Var) {
        return this.f3819a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && r6.k.a(this.f3819a, ((o2) obj).f3819a);
    }

    public final int hashCode() {
        Object obj = this.f3819a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f3819a + ')';
    }
}
