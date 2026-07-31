package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f4948a;

    public i0(h1 h1Var) {
        this.f4948a = h1Var;
    }

    @Override // m0.w2
    public final Object a(o1 o1Var) {
        return this.f4948a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f4948a.equals(((i0) obj).f4948a);
    }

    public final int hashCode() {
        return this.f4948a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4948a + ')';
    }
}
