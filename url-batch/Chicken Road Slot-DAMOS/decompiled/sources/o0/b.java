package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import wd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements List, xd.c {

    /* renamed from: d, reason: collision with root package name */
    public final e f7311d;

    public b(e eVar) {
        this.f7311d = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f7311d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f7311d;
        return eVar.e(eVar.f7319i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f7311d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7311d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f7311d.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        f.a(i3, this);
        return this.f7311d.f7317d[i3];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f7311d.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7311d.f7319i == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f7311d;
        Object[] objArr = eVar.f7317d;
        for (int i3 = eVar.f7319i - 1; i3 >= 0; i3--) {
            if (Intrinsics.a(obj, objArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        f.a(i3, this);
        return this.f7311d.l(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        e eVar = this.f7311d;
        int i3 = eVar.f7319i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.k(it.next());
        }
        return i3 != eVar.f7319i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f7311d;
        int i3 = eVar.f7319i;
        for (int i10 = i3 - 1; -1 < i10; i10--) {
            if (!collection.contains(eVar.f7317d[i10])) {
                eVar.l(i10);
            }
        }
        return i3 != eVar.f7319i;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        f.a(i3, this);
        Object[] objArr = this.f7311d.f7317d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7311d.f7319i;
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        f.b(this, i3, i10);
        return new c(this, i3, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        this.f7311d.a(i3, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new d(i3, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return this.f7311d.e(i3, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7311d.k(obj);
    }
}
