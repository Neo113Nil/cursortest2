package id;

import a2.r;
import b1.d0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends kotlin.collections.l implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4680d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4681e;

    /* renamed from: i, reason: collision with root package name */
    public int f4682i;

    /* renamed from: r, reason: collision with root package name */
    public final b f4683r;

    /* renamed from: s, reason: collision with root package name */
    public final d f4684s;

    public b(Object[] objArr, int i3, int i10, b bVar, d dVar) {
        int i11;
        objArr.getClass();
        dVar.getClass();
        this.f4680d = objArr;
        this.f4681e = i3;
        this.f4682i = i10;
        this.f4683r = bVar;
        this.f4684s = dVar;
        i11 = ((AbstractList) dVar).modCount;
        ((AbstractList) this).modCount = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        i();
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.b(i3, i10);
        g(this.f4681e + i3, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        collection.getClass();
        i();
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.b(i3, i10);
        int size = collection.size();
        f(this.f4681e + i3, collection, size);
        return size > 0;
    }

    @Override // kotlin.collections.l
    public final int b() {
        h();
        return this.f4682i;
    }

    @Override // kotlin.collections.l
    public final Object c(int i3) {
        i();
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.a(i3, i10);
        return k(this.f4681e + i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        m(this.f4681e, this.f4682i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f4680d;
            int i3 = this.f4682i;
            if (i3 == list.size()) {
                for (int i10 = 0; i10 < i3; i10++) {
                    if (Intrinsics.a(objArr[this.f4681e + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i3, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        d dVar = this.f4684s;
        b bVar = this.f4683r;
        if (bVar != null) {
            bVar.f(i3, collection, i10);
        } else {
            d dVar2 = d.f4686s;
            dVar.f(i3, collection, i10);
        }
        this.f4680d = dVar.f4687d;
        this.f4682i += i10;
    }

    public final void g(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        d dVar = this.f4684s;
        b bVar = this.f4683r;
        if (bVar != null) {
            bVar.g(i3, obj);
        } else {
            d dVar2 = d.f4686s;
            dVar.g(i3, obj);
        }
        this.f4680d = dVar.f4687d;
        this.f4682i++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.a(i3, i10);
        return this.f4680d[this.f4681e + i3];
    }

    public final void h() {
        int i3;
        i3 = ((AbstractList) this.f4684s).modCount;
        if (i3 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.f4680d;
        int i3 = this.f4682i;
        int i10 = 1;
        for (int i11 = 0; i11 < i3; i11++) {
            Object obj = objArr[this.f4681e + i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    public final void i() {
        if (this.f4684s.f4689i) {
            r.a();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i3 = 0; i3 < this.f4682i; i3++) {
            if (Intrinsics.a(this.f4680d[this.f4681e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.f4682i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object k(int i3) {
        Object k10;
        ((AbstractList) this).modCount++;
        b bVar = this.f4683r;
        if (bVar != null) {
            k10 = bVar.k(i3);
        } else {
            d dVar = d.f4686s;
            k10 = this.f4684s.k(i3);
        }
        this.f4682i--;
        return k10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i3 = this.f4682i - 1; i3 >= 0; i3--) {
            if (Intrinsics.a(this.f4680d[this.f4681e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.b(i3, i10);
        return new d0(this, i3);
    }

    public final void m(int i3, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f4683r;
        if (bVar != null) {
            bVar.m(i3, i10);
        } else {
            d dVar = d.f4686s;
            this.f4684s.m(i3, i10);
        }
        this.f4682i -= i10;
    }

    public final int n(int i3, int i10, Collection collection, boolean z10) {
        int n10;
        b bVar = this.f4683r;
        if (bVar != null) {
            n10 = bVar.n(i3, i10, collection, z10);
        } else {
            d dVar = d.f4686s;
            n10 = this.f4684s.n(i3, i10, collection, z10);
        }
        if (n10 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4682i -= n10;
        return n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return n(this.f4681e, this.f4682i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return n(this.f4681e, this.f4682i, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        i();
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.a(i3, i10);
        Object[] objArr = this.f4680d;
        int i11 = this.f4681e + i3;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i10) {
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i11 = this.f4682i;
        cVar.getClass();
        kotlin.collections.c.c(i3, i10, i11);
        return new b(this.f4680d, this.f4681e + i3, i10 - i3, this, this.f4684s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i3 = this.f4682i;
        Object[] objArr2 = this.f4680d;
        int i10 = this.f4681e;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i10, i3 + i10, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        v.d(0, i10, i3 + i10, objArr2, objArr);
        int i11 = this.f4682i;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return k7.e.d(this.f4680d, this.f4681e, this.f4682i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.f4681e + this.f4682i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.f4681e + this.f4682i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.f4680d;
        int i3 = this.f4682i;
        int i10 = this.f4681e;
        return v.h(objArr, i10, i3 + i10);
    }
}
