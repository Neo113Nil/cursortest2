package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c0 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    public final p6.c f4883a;

    public c0(p6.c cVar) {
        this.f4883a = cVar;
    }

    @Override // m0.w2
    public final Object a(o1 o1Var) {
        return this.f4883a.i(o1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && q6.i.a(this.f4883a, ((c0) obj).f4883a);
    }

    public final int hashCode() {
        return this.f4883a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f4883a + ')';
    }
}
