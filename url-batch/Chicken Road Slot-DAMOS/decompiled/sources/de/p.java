package de;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f3726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f3727e;

    public p(o oVar) {
        this.f3727e = oVar;
        this.f3726d = oVar.f3724b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3726d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f3727e.f3725c.invoke(this.f3726d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
