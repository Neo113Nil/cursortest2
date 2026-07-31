package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s implements v1.c {

    /* renamed from: a, reason: collision with root package name */
    public final p6.c f8271a;

    /* renamed from: b, reason: collision with root package name */
    public r0 f8272b;

    public s(p6.c cVar) {
        this.f8271a = cVar;
    }

    @Override // v1.c
    public final void c(v1.f fVar) {
        r0 r0Var = (r0) fVar.d(v0.f8303a);
        if (q6.i.a(r0Var, this.f8272b)) {
            return;
        }
        this.f8272b = r0Var;
        this.f8271a.i(r0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && ((s) obj).f8271a == this.f8271a;
    }

    public final int hashCode() {
        return this.f8271a.hashCode();
    }
}
