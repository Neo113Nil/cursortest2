package r2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f10281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10282b;

    public k(l lVar) {
        this.f10282b = lVar;
        this.f10281a = lVar.f10283a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10281a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f10282b.f10284b.invoke(this.f10281a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
