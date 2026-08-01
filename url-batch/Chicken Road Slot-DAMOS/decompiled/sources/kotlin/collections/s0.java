package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 extends l {

    /* renamed from: d, reason: collision with root package name */
    public final List f5584d;

    public s0(List list) {
        list.getClass();
        this.f5584d = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        this.f5584d.add(e0.p(i3, this), obj);
    }

    @Override // kotlin.collections.l
    public final int b() {
        return this.f5584d.size();
    }

    @Override // kotlin.collections.l
    public final Object c(int i3) {
        return this.f5584d.remove(e0.o(i3, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f5584d.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        return this.f5584d.get(e0.o(i3, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new b1.i0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new b1.i0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        return this.f5584d.set(e0.o(i3, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new b1.i0(this, i3);
    }
}
