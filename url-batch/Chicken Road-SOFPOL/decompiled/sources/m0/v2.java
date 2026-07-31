package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v2 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5143a;

    public v2(Object obj) {
        this.f5143a = obj;
    }

    @Override // m0.w2
    public final Object a(o1 o1Var) {
        return this.f5143a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2) && q6.i.a(this.f5143a, ((v2) obj).f5143a);
    }

    public final int hashCode() {
        Object obj = this.f5143a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f5143a + ')';
    }
}
