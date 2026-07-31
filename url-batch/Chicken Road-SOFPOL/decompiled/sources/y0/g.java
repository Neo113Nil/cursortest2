package y0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final m f8701a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8702b;

    public g(m mVar, m mVar2) {
        this.f8701a = mVar;
        this.f8702b = mVar2;
    }

    @Override // y0.m
    public final boolean a(p6.c cVar) {
        return this.f8701a.a(cVar) && this.f8702b.a(cVar);
    }

    @Override // y0.m
    public final Object b(Object obj, p6.e eVar) {
        return this.f8702b.b(this.f8701a.b(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return q6.i.a(this.f8701a, gVar.f8701a) && q6.i.a(this.f8702b, gVar.f8702b);
    }

    public final int hashCode() {
        return (this.f8702b.hashCode() * 31) + this.f8701a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) b("", f.f8700e)) + ']';
    }
}
