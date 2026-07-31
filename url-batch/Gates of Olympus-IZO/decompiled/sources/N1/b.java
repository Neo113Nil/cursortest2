package N1;

import H2.AbstractC0080b;
import M1.B;
import M1.k;
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
public final class b extends M1.f implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2859d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2860e;

    /* renamed from: f, reason: collision with root package name */
    public int f2861f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2862g;

    /* renamed from: h, reason: collision with root package name */
    public final c f2863h;

    public b(Object[] objArr, int i3, int i4, b bVar, c cVar) {
        int i5;
        Z1.i.f(objArr, "backing");
        Z1.i.f(cVar, "root");
        this.f2859d = objArr;
        this.f2860e = i3;
        this.f2861f = i4;
        this.f2862g = bVar;
        this.f2863h = cVar;
        i5 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.f2860e + this.f2861f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Z1.i.f(collection, "elements");
        l();
        k();
        int size = collection.size();
        i(this.f2860e + this.f2861f, collection, size);
        return size > 0;
    }

    @Override // M1.f
    public final int b() {
        k();
        return this.f2861f;
    }

    @Override // M1.f
    public final Object c(int i3) {
        l();
        k();
        int i4 = this.f2861f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return m(this.f2860e + i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.f2860e, this.f2861f);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof List) {
                if (B.m(this.f2859d, this.f2860e, this.f2861f, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        k();
        int i4 = this.f2861f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return this.f2859d[this.f2860e + i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.f2859d;
        int i3 = this.f2861f;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[this.f2860e + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final void i(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2863h;
        b bVar = this.f2862g;
        if (bVar != null) {
            bVar.i(i3, collection, i4);
        } else {
            c cVar2 = c.f2864g;
            cVar.i(i3, collection, i4);
        }
        this.f2859d = cVar.f2865d;
        this.f2861f += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i3 = 0; i3 < this.f2861f; i3++) {
            if (Z1.i.a(this.f2859d[this.f2860e + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.f2861f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2863h;
        b bVar = this.f2862g;
        if (bVar != null) {
            bVar.j(i3, obj);
        } else {
            c cVar2 = c.f2864g;
            cVar.j(i3, obj);
        }
        this.f2859d = cVar.f2865d;
        this.f2861f++;
    }

    public final void k() {
        int i3;
        i3 = ((AbstractList) this.f2863h).modCount;
        if (i3 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.f2863h.f2867f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i3 = this.f2861f - 1; i3 >= 0; i3--) {
            if (Z1.i.a(this.f2859d[this.f2860e + i3], obj)) {
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
        b bVar = this.f2862g;
        if (bVar != null) {
            m3 = bVar.m(i3);
        } else {
            c cVar = c.f2864g;
            m3 = this.f2863h.m(i3);
        }
        this.f2861f--;
        return m3;
    }

    public final void n(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f2862g;
        if (bVar != null) {
            bVar.n(i3, i4);
        } else {
            c cVar = c.f2864g;
            this.f2863h.n(i3, i4);
        }
        this.f2861f -= i4;
    }

    public final int o(int i3, int i4, Collection collection, boolean z3) {
        int o3;
        b bVar = this.f2862g;
        if (bVar != null) {
            o3 = bVar.o(i3, i4, collection, z3);
        } else {
            c cVar = c.f2864g;
            o3 = this.f2863h.o(i3, i4, collection, z3);
        }
        if (o3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2861f -= o3;
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
        Z1.i.f(collection, "elements");
        l();
        k();
        return o(this.f2860e, this.f2861f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Z1.i.f(collection, "elements");
        l();
        k();
        return o(this.f2860e, this.f2861f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        l();
        k();
        int i4 = this.f2861f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f2859d;
        int i5 = this.f2860e;
        Object obj2 = objArr[i5 + i3];
        objArr[i5 + i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        I2.d.r(i3, i4, this.f2861f);
        return new b(this.f2859d, this.f2860e + i3, i4 - i3, this, this.f2863h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Z1.i.f(objArr, "array");
        k();
        int length = objArr.length;
        int i3 = this.f2861f;
        int i4 = this.f2860e;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f2859d, i4, i3 + i4, objArr.getClass());
            Z1.i.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        k.X(this.f2859d, objArr, 0, i4, i3 + i4);
        int i5 = this.f2861f;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return B.n(this.f2859d, this.f2860e, this.f2861f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        k();
        int i4 = this.f2861f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return new a(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        l();
        k();
        int i4 = this.f2861f;
        if (i3 >= 0 && i3 <= i4) {
            j(this.f2860e + i3, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        Z1.i.f(collection, "elements");
        l();
        k();
        int i4 = this.f2861f;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            i(this.f2860e + i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f2859d;
        int i3 = this.f2861f;
        int i4 = this.f2860e;
        return k.b0(objArr, i4, i3 + i4);
    }
}
