package v3;

import java.util.Iterator;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public final class p implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f15721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f15722b;

    public p(q qVar) {
        this.f15722b = qVar;
        this.f15721a = qVar.f15723a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15721a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f15722b.f15724b.invoke(this.f15721a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
