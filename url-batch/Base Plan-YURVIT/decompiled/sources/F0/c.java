package F0;

import a.AbstractC0086a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends E0.a implements RandomAccess, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final c f464h;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f465e;

    /* renamed from: f, reason: collision with root package name */
    public int f466f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f467g;

    static {
        c cVar = new c(0);
        cVar.f467g = true;
        f464h = cVar;
    }

    public c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f465e = new Object[i2];
    }

    @Override // E0.a
    public final int a() {
        return this.f466f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i2 = this.f466f;
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f465e[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        P0.h.e(collection, "elements");
        f();
        int size = collection.size();
        d(this.f466f, collection, size);
        return size > 0;
    }

    @Override // E0.a
    public final Object b(int i2) {
        f();
        int i3 = this.f466f;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        return h(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f466f);
    }

    public final void d(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        g(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f465e[i2 + i4] = it.next();
        }
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f465e[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f465e;
            int i2 = this.f466f;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (P0.h.a(objArr[i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f467g) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i2, int i3) {
        int i4 = this.f466f + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f465e;
        if (i4 > objArr.length) {
            int length = objArr.length;
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i5);
            P0.h.d(copyOf, "copyOf(...)");
            this.f465e = copyOf;
        }
        Object[] objArr2 = this.f465e;
        E0.e.O(objArr2, objArr2, i2 + i3, i2, this.f466f);
        this.f466f += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f466f;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        return this.f465e[i2];
    }

    public final Object h(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f465e;
        Object obj = objArr[i2];
        E0.e.O(objArr, objArr, i2, i2 + 1, this.f466f);
        Object[] objArr2 = this.f465e;
        int i3 = this.f466f - 1;
        P0.h.e(objArr2, "<this>");
        objArr2[i3] = null;
        this.f466f--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f465e;
        int i2 = this.f466f;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f465e;
        E0.e.O(objArr, objArr, i2, i2 + i3, this.f466f);
        Object[] objArr2 = this.f465e;
        int i4 = this.f466f;
        AbstractC0086a.D(objArr2, i4 - i3, i4);
        this.f466f -= i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f466f; i2++) {
            if (P0.h.a(this.f465e[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f466f == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i3, Collection collection, boolean z2) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f465e[i6]) == z2) {
                Object[] objArr = this.f465e;
                i4++;
                objArr[i5 + i2] = objArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        Object[] objArr2 = this.f465e;
        E0.e.O(objArr2, objArr2, i2 + i5, i3 + i2, this.f466f);
        Object[] objArr3 = this.f465e;
        int i8 = this.f466f;
        AbstractC0086a.D(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f466f -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f466f - 1; i2 >= 0; i2--) {
            if (P0.h.a(this.f465e[i2], obj)) {
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
        f();
        return j(0, this.f466f, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        P0.h.e(collection, "elements");
        f();
        return j(0, this.f466f, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        f();
        int i3 = this.f466f;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        Object[] objArr = this.f465e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC0086a.f(i2, i3, this.f466f);
        return new b(this.f465e, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        P0.h.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f466f;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f465e, 0, i2, objArr.getClass());
            P0.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        E0.e.O(this.f465e, objArr, 0, 0, i2);
        int i3 = this.f466f;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0086a.b(this.f465e, 0, this.f466f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.f466f;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        return new a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        P0.h.e(collection, "elements");
        f();
        int i3 = this.f466f;
        if (i2 >= 0 && i2 <= i3) {
            int size = collection.size();
            d(i2, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        f();
        int i3 = this.f466f;
        if (i2 >= 0 && i2 <= i3) {
            ((AbstractList) this).modCount++;
            g(i2, 1);
            this.f465e[i2] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return E0.e.P(this.f465e, 0, this.f466f);
    }
}
