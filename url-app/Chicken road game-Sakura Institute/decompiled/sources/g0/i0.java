package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f3750a;

    public i0(g1 g1Var) {
        this.f3750a = g1Var;
    }

    @Override // g0.p2
    public final Object a(k1 k1Var) {
        return this.f3750a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f3750a.equals(((i0) obj).f3750a);
    }

    public final int hashCode() {
        return this.f3750a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f3750a + ')';
    }
}
