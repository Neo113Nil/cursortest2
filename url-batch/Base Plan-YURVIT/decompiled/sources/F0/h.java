package F0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection {

    /* renamed from: e, reason: collision with root package name */
    public final f f492e;

    public h(f fVar) {
        this.f492e = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        P0.h.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f492e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f492e.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f492e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        f fVar = this.f492e;
        fVar.getClass();
        return new d(fVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f492e;
        fVar.b();
        int h2 = fVar.h(obj);
        if (h2 < 0) {
            return false;
        }
        fVar.k(h2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        P0.h.e(collection, "elements");
        this.f492e.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        P0.h.e(collection, "elements");
        this.f492e.b();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f492e.f485m;
    }
}
