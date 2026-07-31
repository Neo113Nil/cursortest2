package x6;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f8678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f8679e;

    public j(i iVar) {
        this.f8679e = iVar;
        this.f8678d = iVar.f8676b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8678d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f8679e.f8677c.i(this.f8678d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
