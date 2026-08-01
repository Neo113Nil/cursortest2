package c2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements List, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f1619d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1620e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f1621i;

    public n(o oVar, int i3, int i10) {
        this.f1621i = oVar;
        this.f1619d = i3;
        this.f1620e = i10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof d1.k) && indexOf((d1.k) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d1.k) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object f3 = this.f1621i.f1628d.f(i3 + this.f1619d);
        f3.getClass();
        return (d1.k) f3;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d1.k)) {
            return -1;
        }
        d1.k kVar = (d1.k) obj;
        int i3 = this.f1619d;
        int i10 = this.f1620e;
        if (i3 > i10) {
            return -1;
        }
        int i11 = i3;
        while (!Intrinsics.a(this.f1621i.f1628d.f(i11), kVar)) {
            if (i11 == i10) {
                return -1;
            }
            i11++;
        }
        return i11 - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i3 = this.f1619d;
        return new b1.d0(this.f1621i, i3, i3, this.f1620e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d1.k)) {
            return -1;
        }
        d1.k kVar = (d1.k) obj;
        int i3 = this.f1620e;
        int i10 = this.f1619d;
        if (i10 > i3) {
            return -1;
        }
        while (!Intrinsics.a(this.f1621i.f1628d.f(i3), kVar)) {
            if (i3 == i10) {
                return -1;
            }
            i3--;
        }
        return i3 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        int i10 = this.f1619d;
        int i11 = this.f1620e;
        return new b1.d0(this.f1621i, i3 + i10, i10, i11);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1620e - this.f1619d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        int i11 = this.f1619d;
        return new n(this.f1621i, i3 + i11, i11 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wd.i.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i3 = this.f1619d;
        return new b1.d0(this.f1621i, i3, i3, this.f1620e);
    }
}
