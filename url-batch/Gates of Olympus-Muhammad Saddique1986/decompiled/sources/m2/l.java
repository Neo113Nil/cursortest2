package m2;

import g2.InterfaceC0439a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f7011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f7012e;

    public l(k kVar) {
        this.f7012e = kVar;
        this.f7011d = ((InterfaceC0656f) kVar.f7009b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7011d.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e2.c, f2.k] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f7012e.f7010c.n(this.f7011d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
