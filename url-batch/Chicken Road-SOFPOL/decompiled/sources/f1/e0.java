package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 extends p {

    /* renamed from: e, reason: collision with root package name */
    public final e1.d f2635e;

    /* renamed from: f, reason: collision with root package name */
    public final j f2636f;

    public e0(e1.d dVar) {
        j jVar;
        this.f2635e = dVar;
        if (s6.a.w(dVar)) {
            jVar = null;
        } else {
            jVar = l.a();
            j.a(jVar, dVar);
        }
        this.f2636f = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return q6.i.a(this.f2635e, ((e0) obj).f2635e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2635e.hashCode();
    }

    @Override // f1.p
    public final e1.c k() {
        e1.d dVar = this.f2635e;
        return new e1.c(dVar.f2461a, dVar.f2462b, dVar.f2463c, dVar.f2464d);
    }
}
