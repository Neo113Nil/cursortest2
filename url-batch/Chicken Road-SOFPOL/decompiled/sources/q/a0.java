package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.e f5797a;

    /* renamed from: b, reason: collision with root package name */
    public final q6.j f5798b;

    /* renamed from: c, reason: collision with root package name */
    public final r.u0 f5799c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(y0.e eVar, p6.c cVar, r.u0 u0Var) {
        this.f5797a = eVar;
        this.f5798b = (q6.j) cVar;
        this.f5799c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f5797a.equals(a0Var.f5797a) && this.f5798b.equals(a0Var.f5798b) && this.f5799c.equals(a0Var.f5799c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f5799c.hashCode() + ((this.f5798b.hashCode() + (this.f5797a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f5797a + ", size=" + this.f5798b + ", animationSpec=" + this.f5799c + ", clip=true)";
    }
}
