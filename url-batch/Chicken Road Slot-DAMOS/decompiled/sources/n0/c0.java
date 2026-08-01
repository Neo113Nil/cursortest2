package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f6646a;

    public c0(j1 j1Var) {
        this.f6646a = j1Var;
    }

    @Override // n0.p2
    public final Object a(x0.h hVar) {
        return this.f6646a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f6646a.equals(((c0) obj).f6646a);
    }

    public final int hashCode() {
        return this.f6646a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f6646a + ')';
    }
}
