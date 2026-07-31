package T1;

import A.k;
import S.x;
import f2.j;
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
public final class a extends S1.f implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4338d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4339e;

    /* renamed from: f, reason: collision with root package name */
    public int f4340f;

    /* renamed from: g, reason: collision with root package name */
    public final a f4341g;

    /* renamed from: h, reason: collision with root package name */
    public final b f4342h;

    public a(Object[] objArr, int i3, int i4, a aVar, b bVar) {
        int i5;
        j.f(objArr, "backing");
        j.f(bVar, "root");
        this.f4338d = objArr;
        this.f4339e = i3;
        this.f4340f = i4;
        this.f4341g = aVar;
        this.f4342h = bVar;
        i5 = ((AbstractList) bVar).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.f4339e + this.f4340f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.f(collection, "elements");
        l();
        k();
        int size = collection.size();
        i(this.f4339e + this.f4340f, collection, size);
        return size > 0;
    }

    @Override // S1.f
    public final int b() {
        k();
        return this.f4340f;
    }

    @Override // S1.f
    public final Object c(int i3) {
        l();
        k();
        int i4 = this.f4340f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        return m(this.f4339e + i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.f4339e, this.f4340f);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof List) {
                if (O2.d.m(this.f4338d, this.f4339e, this.f4340f, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        k();
        int i4 = this.f4340f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        return this.f4338d[this.f4339e + i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.f4338d;
        int i3 = this.f4340f;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[this.f4339e + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final void i(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        b bVar = this.f4342h;
        a aVar = this.f4341g;
        if (aVar != null) {
            aVar.i(i3, collection, i4);
        } else {
            b bVar2 = b.f4343g;
            bVar.i(i3, collection, i4);
        }
        this.f4338d = bVar.f4344d;
        this.f4340f += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i3 = 0; i3 < this.f4340f; i3++) {
            if (j.a(this.f4338d[this.f4339e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.f4340f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f4342h;
        a aVar = this.f4341g;
        if (aVar != null) {
            aVar.j(i3, obj);
        } else {
            b bVar2 = b.f4343g;
            bVar.j(i3, obj);
        }
        this.f4338d = bVar.f4344d;
        this.f4340f++;
    }

    public final void k() {
        int i3;
        i3 = ((AbstractList) this.f4342h).modCount;
        if (i3 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.f4342h.f4346f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i3 = this.f4340f - 1; i3 >= 0; i3--) {
            if (j.a(this.f4338d[this.f4339e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object m(int i3) {
        Object m3;
        ((AbstractList) this).modCount++;
        a aVar = this.f4341g;
        if (aVar != null) {
            m3 = aVar.m(i3);
        } else {
            b bVar = b.f4343g;
            m3 = this.f4342h.m(i3);
        }
        this.f4340f--;
        return m3;
    }

    public final void n(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f4341g;
        if (aVar != null) {
            aVar.n(i3, i4);
        } else {
            b bVar = b.f4343g;
            this.f4342h.n(i3, i4);
        }
        this.f4340f -= i4;
    }

    public final int o(int i3, int i4, Collection collection, boolean z3) {
        int o3;
        a aVar = this.f4341g;
        if (aVar != null) {
            o3 = aVar.o(i3, i4, collection, z3);
        } else {
            b bVar = b.f4343g;
            o3 = this.f4342h.o(i3, i4, collection, z3);
        }
        if (o3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4340f -= o3;
        return o3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        j.f(collection, "elements");
        l();
        k();
        return o(this.f4339e, this.f4340f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.f(collection, "elements");
        l();
        k();
        return o(this.f4339e, this.f4340f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        l();
        k();
        int i4 = this.f4340f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f4338d;
        int i5 = this.f4339e;
        Object obj2 = objArr[i5 + i3];
        objArr[i5 + i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        l0.c.n(i3, i4, this.f4340f);
        return new a(this.f4338d, this.f4339e + i3, i4 - i3, this, this.f4342h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.f(objArr, "array");
        k();
        int length = objArr.length;
        int i3 = this.f4340f;
        int i4 = this.f4339e;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4338d, i4, i3 + i4, objArr.getClass());
            j.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        S1.k.m0(this.f4338d, objArr, 0, i4, i3 + i4);
        int i5 = this.f4340f;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return O2.d.n(this.f4338d, this.f4339e, this.f4340f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        k();
        int i4 = this.f4340f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        return new x(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        l();
        k();
        int i4 = this.f4340f;
        if (i3 >= 0 && i3 <= i4) {
            j(this.f4339e + i3, obj);
            return;
        }
        throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        j.f(collection, "elements");
        l();
        k();
        int i4 = this.f4340f;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            i(this.f4339e + i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f4338d;
        int i3 = this.f4340f;
        int i4 = this.f4339e;
        return S1.k.q0(objArr, i4, i3 + i4);
    }
}
