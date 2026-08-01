package b8;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class o extends AbstractList {

    /* renamed from: d, reason: collision with root package name */
    public final List f1438d;

    public o(List list) {
        list.getClass();
        this.f1438d = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        this.f1438d.add(b(i3), obj);
    }

    public final int b(int i3) {
        int size = this.f1438d.size();
        i7.a.B(i3, size);
        return size - i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f1438d.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        List list = this.f1438d;
        int size = list.size();
        i7.a.v(i3, size);
        return list.get((size - 1) - i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new n(this, this.f1438d.listIterator(b(i3)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        List list = this.f1438d;
        int size = list.size();
        i7.a.v(i3, size);
        return list.remove((size - 1) - i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        subList(i3, i10).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        List list = this.f1438d;
        int size = list.size();
        i7.a.v(i3, size);
        return list.set((size - 1) - i3, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1438d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i10) {
        List list = this.f1438d;
        i7.a.D(i3, i10, list.size());
        return k7.e.N(list.subList(b(i10), b(i3)));
    }
}
