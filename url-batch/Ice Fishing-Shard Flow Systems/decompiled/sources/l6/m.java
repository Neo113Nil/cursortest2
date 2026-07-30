package l6;

import f6.InterfaceC0406a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f6320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f6321e;

    public m(n nVar) {
        this.f6321e = nVar;
        this.f6320d = nVar.f6322a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6320d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f6321e.f6323b.invoke(this.f6320d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
