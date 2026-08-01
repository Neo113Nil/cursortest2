package Z0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1552a;

    public h(f fVar) {
        k1.e.e(fVar, "backing");
        this.f1552a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        k1.e.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f1552a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1552a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f1552a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        f fVar = this.f1552a;
        fVar.getClass();
        return new d(fVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f1552a;
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
        k1.e.e(collection, "elements");
        this.f1552a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        k1.e.e(collection, "elements");
        this.f1552a.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f1552a.i;
    }
}
