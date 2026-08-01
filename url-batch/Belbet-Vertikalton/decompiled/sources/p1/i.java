package p1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterator, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f3883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f3884b;

    public i(j jVar) {
        this.f3884b = jVar;
        this.f3883a = new q1.b(jVar.f3885a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3883a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3884b.f3886b.g(this.f3883a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
