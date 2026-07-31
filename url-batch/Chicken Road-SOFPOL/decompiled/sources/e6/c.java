package e6;

import a0.q;
import d6.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends d6.g implements RandomAccess, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final c f2513g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2514d;

    /* renamed from: e, reason: collision with root package name */
    public int f2515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2516f;

    static {
        c cVar = new c(0);
        cVar.f2516f = true;
        f2513g = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f2514d = new Object[i];
    }

    @Override // d6.g
    public final int a() {
        return this.f2515e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.f2515e;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f2514d[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i.e(collection, "elements");
        g();
        int size = collection.size();
        e(this.f2515e, collection, size);
        return size > 0;
    }

    @Override // d6.g
    public final Object b(int i) {
        g();
        int i8 = this.f2515e;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        return i(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f2515e);
    }

    public final void e(int i, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        h(i, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f2514d[i + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f2514d;
            int i = this.f2515e;
            if (i == list.size()) {
                for (int i8 = 0; i8 < i; i8++) {
                    if (i.a(objArr[i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.f2514d[i] = obj;
    }

    public final void g() {
        if (this.f2516f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i8 = this.f2515e;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        return this.f2514d[i];
    }

    public final void h(int i, int i8) {
        int i9 = this.f2515e + i8;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2514d;
        if (i9 > objArr.length) {
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                i10 = i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            i.d(copyOf, "copyOf(...)");
            this.f2514d = copyOf;
        }
        Object[] objArr2 = this.f2514d;
        l.H(objArr2, objArr2, i + i8, i, this.f2515e);
        this.f2515e += i8;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f2514d;
        int i = this.f2515e;
        int i8 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[i9];
            i8 = (i8 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i8;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f2514d;
        Object obj = objArr[i];
        l.H(objArr, objArr, i, i + 1, this.f2515e);
        Object[] objArr2 = this.f2514d;
        int i8 = this.f2515e - 1;
        i.e(objArr2, "<this>");
        objArr2[i8] = null;
        this.f2515e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f2515e; i++) {
            if (i.a(this.f2514d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2515e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f2514d;
        l.H(objArr, objArr, i, i + i8, this.f2515e);
        Object[] objArr2 = this.f2514d;
        int i9 = this.f2515e;
        a.a.x(objArr2, i9 - i8, i9);
        this.f2515e -= i8;
    }

    public final int k(int i, int i8, Collection collection, boolean z3) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i + i9;
            if (collection.contains(this.f2514d[i11]) == z3) {
                Object[] objArr = this.f2514d;
                i9++;
                objArr[i10 + i] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f2514d;
        l.H(objArr2, objArr2, i + i10, i8 + i, this.f2515e);
        Object[] objArr3 = this.f2514d;
        int i13 = this.f2515e;
        a.a.x(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2515e -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f2515e - 1; i >= 0; i--) {
            if (i.a(this.f2514d[i], obj)) {
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
        g();
        return k(0, this.f2515e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        i.e(collection, "elements");
        g();
        return k(0, this.f2515e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i8 = this.f2515e;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        Object[] objArr = this.f2514d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i8) {
        s6.a.j(i, i8, this.f2515e);
        return new b(this.f2514d, i, i8 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f2515e;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f2514d, 0, i, objArr.getClass());
            i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        l.H(this.f2514d, objArr, 0, 0, i);
        int i8 = this.f2515e;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.a.d(this.f2514d, 0, this.f2515e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i8 = this.f2515e;
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        i.e(collection, "elements");
        g();
        int i8 = this.f2515e;
        if (i >= 0 && i <= i8) {
            int size = collection.size();
            e(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i8 = this.f2515e;
        if (i >= 0 && i <= i8) {
            ((AbstractList) this).modCount++;
            h(i, 1);
            this.f2514d[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(q.i("index: ", i, ", size: ", i8));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return l.K(this.f2514d, 0, this.f2515e);
    }
}
