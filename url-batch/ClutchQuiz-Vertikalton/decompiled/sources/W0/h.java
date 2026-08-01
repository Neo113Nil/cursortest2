package W0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f921a;

    public h(f fVar) {
        g1.f.e(fVar, "backing");
        this.f921a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        g1.f.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f921a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f921a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f921a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        f fVar = this.f921a;
        fVar.getClass();
        return new d(fVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f921a;
        fVar.c();
        int i = fVar.i(obj);
        if (i < 0) {
            return false;
        }
        fVar.l(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        g1.f.e(collection, "elements");
        this.f921a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        g1.f.e(collection, "elements");
        this.f921a.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f921a.i;
    }
}
