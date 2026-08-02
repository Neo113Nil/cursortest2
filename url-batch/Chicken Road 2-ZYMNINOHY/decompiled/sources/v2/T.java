package v2;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class T extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f15591a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.d f15592b;

    public T(List list, u2.d dVar) {
        list.getClass();
        this.f15591a = list;
        this.f15592b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15591a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new Q(this, this.f15591a.listIterator(i4), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        this.f15591a.subList(i4, i5).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15591a.size();
    }
}
