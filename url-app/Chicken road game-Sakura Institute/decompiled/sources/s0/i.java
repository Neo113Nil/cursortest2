package s0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final o f8099a;

    /* renamed from: b, reason: collision with root package name */
    public final o f8100b;

    public i(o oVar, o oVar2) {
        this.f8099a = oVar;
        this.f8100b = oVar2;
    }

    @Override // s0.o
    public final boolean a(q6.c cVar) {
        return this.f8099a.a(cVar) && this.f8100b.a(cVar);
    }

    @Override // s0.o
    public final Object d(Object obj, q6.e eVar) {
        return this.f8100b.d(this.f8099a.d(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r6.k.a(this.f8099a, iVar.f8099a) && r6.k.a(this.f8100b, iVar.f8100b);
    }

    public final int hashCode() {
        return (this.f8100b.hashCode() * 31) + this.f8099a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) d("", h.f8098g)) + ']';
    }
}
