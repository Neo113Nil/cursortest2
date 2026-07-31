package F0;

import a.AbstractC0086a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends E0.a implements RandomAccess, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public Object[] f459e;

    /* renamed from: f, reason: collision with root package name */
    public final int f460f;

    /* renamed from: g, reason: collision with root package name */
    public int f461g;

    /* renamed from: h, reason: collision with root package name */
    public final b f462h;

    /* renamed from: i, reason: collision with root package name */
    public final c f463i;

    public b(Object[] objArr, int i2, int i3, b bVar, c cVar) {
        int i4;
        P0.h.e(objArr, "backing");
        P0.h.e(cVar, "root");
        this.f459e = objArr;
        this.f460f = i2;
        this.f461g = i3;
        this.f462h = bVar;
        this.f463i = cVar;
        i4 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i4;
    }

    @Override // E0.a
    public final int a() {
        f();
        return this.f461g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f460f + this.f461g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        P0.h.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f460f + this.f461g, collection, size);
        return size > 0;
    }

    @Override // E0.a
    public final Object b(int i2) {
        g();
        f();
        int i3 = this.f461g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        return h(this.f460f + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f460f, this.f461g);
    }

    public final void d(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        c cVar = this.f463i;
        b bVar = this.f462h;
        if (bVar != null) {
            bVar.d(i2, collection, i3);
        } else {
            c cVar2 = c.f464h;
            cVar.d(i2, collection, i3);
        }
        this.f459e = cVar.f465e;
        this.f461g += i3;
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f463i;
        b bVar = this.f462h;
        if (bVar != null) {
            bVar.e(i2, obj);
        } else {
            c cVar2 = c.f464h;
            cVar.e(i2, obj);
        }
        this.f459e = cVar.f465e;
        this.f461g++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f459e;
            int i2 = this.f461g;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (P0.h.a(objArr[this.f460f + i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i2;
        i2 = ((AbstractList) this.f463i).modCount;
        if (i2 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f463i.f467g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        f();
        int i3 = this.f461g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        return this.f459e[this.f460f + i2];
    }

    public final Object h(int i2) {
        Object h2;
        ((AbstractList) this).modCount++;
        b bVar = this.f462h;
        if (bVar != null) {
            h2 = bVar.h(i2);
        } else {
            c cVar = c.f464h;
            h2 = this.f463i.h(i2);
        }
        this.f461g--;
        return h2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f459e;
        int i2 = this.f461g;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.f460f + i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f462h;
        if (bVar != null) {
            bVar.i(i2, i3);
        } else {
            c cVar = c.f464h;
            this.f463i.i(i2, i3);
        }
        this.f461g -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i2 = 0; i2 < this.f461g; i2++) {
            if (P0.h.a(this.f459e[this.f460f + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f461g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i3, Collection collection, boolean z2) {
        int j2;
        b bVar = this.f462h;
        if (bVar != null) {
            j2 = bVar.j(i2, i3, collection, z2);
        } else {
            c cVar = c.f464h;
            j2 = this.f463i.j(i2, i3, collection, z2);
        }
        if (j2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f461g -= j2;
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i2 = this.f461g - 1; i2 >= 0; i2--) {
            if (P0.h.a(this.f459e[this.f460f + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        P0.h.e(collection, "elements");
        g();
        f();
        return j(this.f460f, this.f461g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        P0.h.e(collection, "elements");
        g();
        f();
        return j(this.f460f, this.f461g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        g();
        f();
        int i3 = this.f461g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        Object[] objArr = this.f459e;
        int i4 = this.f460f;
        Object obj2 = objArr[i4 + i2];
        objArr[i4 + i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0086a.f(i2, i3, this.f461g);
        return new b(this.f459e, this.f460f + i2, i3 - i2, this, this.f463i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        P0.h.e(objArr, "array");
        f();
        int length = objArr.length;
        int i2 = this.f461g;
        int i3 = this.f460f;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f459e, i3, i2 + i3, objArr.getClass());
            P0.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        E0.e.O(this.f459e, objArr, 0, i3, i2 + i3);
        int i4 = this.f461g;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return AbstractC0086a.b(this.f459e, this.f460f, this.f461g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        f();
        int i3 = this.f461g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        return new a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        g();
        f();
        int i3 = this.f461g;
        if (i2 >= 0 && i2 <= i3) {
            e(this.f460f + i2, obj);
            return;
        }
        throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        P0.h.e(collection, "elements");
        g();
        f();
        int i3 = this.f461g;
        if (i2 >= 0 && i2 <= i3) {
            int size = collection.size();
            d(this.f460f + i2, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f459e;
        int i2 = this.f461g;
        int i3 = this.f460f;
        return E0.e.P(objArr, i3, i2 + i3);
    }
}
