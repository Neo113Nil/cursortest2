package e6;

import a0.q;
import d6.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends d6.g implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2508d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2509e;

    /* renamed from: f, reason: collision with root package name */
    public int f2510f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2511g;

    /* renamed from: h, reason: collision with root package name */
    public final c f2512h;

    public b(Object[] objArr, int i, int i8, b bVar, c cVar) {
        int i9;
        i.e(objArr, "backing");
        i.e(cVar, "root");
        this.f2508d = objArr;
        this.f2509e = i;
        this.f2510f = i8;
        this.f2511g = bVar;
        this.f2512h = cVar;
        i9 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i9;
    }

    @Override // d6.g
    public final int a() {
        g();
        return this.f2510f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f2509e + this.f2510f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i.e(collection, "elements");
        h();
        g();
        int size = collection.size();
        e(this.f2509e + this.f2510f, collection, size);
        return size > 0;
    }

    @Override // d6.g
    public final Object b(int i) {
        h();
        g();
        int i8 = this.f2510f;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        return i(this.f2509e + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f2509e, this.f2510f);
    }

    public final void e(int i, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2512h;
        b bVar = this.f2511g;
        if (bVar != null) {
            bVar.e(i, collection, i8);
        } else {
            c cVar2 = c.f2513g;
            cVar.e(i, collection, i8);
        }
        this.f2508d = cVar.f2514d;
        this.f2510f += i8;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f2508d;
            int i = this.f2510f;
            if (i == list.size()) {
                for (int i8 = 0; i8 < i; i8++) {
                    if (i.a(objArr[this.f2509e + i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f2512h;
        b bVar = this.f2511g;
        if (bVar != null) {
            bVar.f(i, obj);
        } else {
            c cVar2 = c.f2513g;
            cVar.f(i, obj);
        }
        this.f2508d = cVar.f2514d;
        this.f2510f++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.f2512h).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i8 = this.f2510f;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        return this.f2508d[this.f2509e + i];
    }

    public final void h() {
        if (this.f2512h.f2516f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f2508d;
        int i = this.f2510f;
        int i8 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[this.f2509e + i9];
            i8 = (i8 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i8;
    }

    public final Object i(int i) {
        Object i8;
        ((AbstractList) this).modCount++;
        b bVar = this.f2511g;
        if (bVar != null) {
            i8 = bVar.i(i);
        } else {
            c cVar = c.f2513g;
            i8 = this.f2512h.i(i);
        }
        this.f2510f--;
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.f2510f; i++) {
            if (i.a(this.f2508d[this.f2509e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f2510f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f2511g;
        if (bVar != null) {
            bVar.j(i, i8);
        } else {
            c cVar = c.f2513g;
            this.f2512h.j(i, i8);
        }
        this.f2510f -= i8;
    }

    public final int k(int i, int i8, Collection collection, boolean z3) {
        int k3;
        b bVar = this.f2511g;
        if (bVar != null) {
            k3 = bVar.k(i, i8, collection, z3);
        } else {
            c cVar = c.f2513g;
            k3 = this.f2512h.k(i, i8, collection, z3);
        }
        if (k3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2510f -= k3;
        return k3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.f2510f - 1; i >= 0; i--) {
            if (i.a(this.f2508d[this.f2509e + i], obj)) {
                return i;
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
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        i.e(collection, "elements");
        h();
        g();
        return k(this.f2509e, this.f2510f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        i.e(collection, "elements");
        h();
        g();
        return k(this.f2509e, this.f2510f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i8 = this.f2510f;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        Object[] objArr = this.f2508d;
        int i9 = this.f2509e;
        Object obj2 = objArr[i9 + i];
        objArr[i9 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i8) {
        s6.a.j(i, i8, this.f2510f);
        return new b(this.f2508d, this.f2509e + i, i8 - i, this, this.f2512h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        g();
        int length = objArr.length;
        int i = this.f2510f;
        int i8 = this.f2509e;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f2508d, i8, i + i8, objArr.getClass());
            i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        l.H(this.f2508d, objArr, 0, i8, i + i8);
        int i9 = this.f2510f;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return a.a.d(this.f2508d, this.f2509e, this.f2510f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i8 = this.f2510f;
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i8 = this.f2510f;
        if (i >= 0 && i <= i8) {
            f(this.f2509e + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        i.e(collection, "elements");
        h();
        g();
        int i8 = this.f2510f;
        if (i >= 0 && i <= i8) {
            int size = collection.size();
            e(this.f2509e + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f2508d;
        int i = this.f2510f;
        int i8 = this.f2509e;
        return l.K(objArr, i8, i + i8);
    }
}
