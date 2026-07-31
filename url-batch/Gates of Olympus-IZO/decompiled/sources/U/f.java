package U;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final l f3298a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3299b;

    public f(l lVar, l lVar2) {
        this.f3298a = lVar;
        this.f3299b = lVar2;
    }

    @Override // U.l
    public final Object a(Object obj, Y1.e eVar) {
        return this.f3299b.a(this.f3298a.a(obj, eVar), eVar);
    }

    @Override // U.l
    public final boolean c(Y1.c cVar) {
        return this.f3298a.c(cVar) && this.f3299b.c(cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Z1.i.a(this.f3298a, fVar.f3298a) && Z1.i.a(this.f3299b, fVar.f3299b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3299b.hashCode() * 31) + this.f3298a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) a("", e.f3297e)) + ']';
    }
}
