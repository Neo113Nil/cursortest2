package I;

import M2.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import u3.l;

/* loaded from: classes.dex */
public final class a implements List, N2.c {

    /* renamed from: d, reason: collision with root package name */
    public final d f3324d;

    public a(d dVar) {
        this.f3324d = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f3324d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f3324d;
        return dVar.e(dVar.f3332i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f3324d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3324d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f3324d;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        l.O(i2, this);
        return this.f3324d.f3330d[i2];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f3324d.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3324d.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f3324d;
        int i2 = dVar.f3332i;
        if (i2 > 0) {
            int i4 = i2 - 1;
            Object[] objArr = dVar.f3330d;
            while (!Intrinsics.a(obj, objArr[i4])) {
                i4--;
                if (i4 < 0) {
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f3324d.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f3324d;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = dVar.f3332i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.m(it.next());
        }
        return i2 != dVar.f3332i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f3324d;
        int i2 = dVar.f3332i;
        for (int i4 = i2 - 1; -1 < i4; i4--) {
            if (!collection.contains(dVar.f3330d[i4])) {
                dVar.n(i4);
            }
        }
        return i2 != dVar.f3332i;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        l.O(i2, this);
        Object[] objArr = this.f3324d.f3330d;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3324d.f3332i;
    }

    @Override // java.util.List
    public final List subList(int i2, int i4) {
        l.P(this, i2, i4);
        return new b(this, i2, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return o.a(this);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        this.f3324d.a(i2, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new c(i2, this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        l.O(i2, this);
        return this.f3324d.n(i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return o.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return this.f3324d.e(i2, collection);
    }
}
