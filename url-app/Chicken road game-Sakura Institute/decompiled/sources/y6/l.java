package y6;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final Iterator f9919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f9920g;

    public l(k kVar) {
        this.f9920g = kVar;
        this.f9919f = kVar.f9917b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9919f.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q6.c, r6.l] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f9920g.f9918c.f(this.f9919f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
