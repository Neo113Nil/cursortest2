package v2;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class S extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f15589a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.d f15590b;

    public S(List list, u2.d dVar) {
        list.getClass();
        this.f15589a = list;
        this.f15590b = dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return this.f15590b.apply(this.f15589a.get(i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15589a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new Q(this, this.f15589a.listIterator(i4), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        return this.f15590b.apply(this.f15589a.remove(i4));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        this.f15589a.subList(i4, i5).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15589a.size();
    }
}
