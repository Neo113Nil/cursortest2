package s7;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f8988d;

    public s(t tVar) {
        this.f8988d = tVar.f9010d.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8988d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f8988d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
