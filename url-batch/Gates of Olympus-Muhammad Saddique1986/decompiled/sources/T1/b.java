package T1;

import A.k;
import S.x;
import f2.j;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends S1.f implements RandomAccess, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f4343g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4344d;

    /* renamed from: e, reason: collision with root package name */
    public int f4345e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4346f;

    static {
        b bVar = new b(0);
        bVar.f4346f = true;
        f4343g = bVar;
    }

    public b(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f4344d = new Object[i3];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i3 = this.f4345e;
        ((AbstractList) this).modCount++;
        l(i3, 1);
        this.f4344d[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.f(collection, "elements");
        k();
        int size = collection.size();
        i(this.f4345e, collection, size);
        return size > 0;
    }

    @Override // S1.f
    public final int b() {
        return this.f4345e;
    }

    @Override // S1.f
    public final Object c(int i3) {
        k();
        int i4 = this.f4345e;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        return m(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.f4345e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!O2.d.m(this.f4344d, 0, this.f4345e, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f4345e;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        return this.f4344d[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f4344d;
        int i3 = this.f4345e;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final void i(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        l(i3, i4);
        Iterator it = collection.iterator();
        for (int i5 = 0; i5 < i4; i5++) {
            this.f4344d[i3 + i5] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f4345e; i3++) {
            if (j.a(this.f4344d[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4345e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        l(i3, 1);
        this.f4344d[i3] = obj;
    }

    public final void k() {
        if (this.f4346f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i3, int i4) {
        int i5 = this.f4345e + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4344d;
        if (i5 > objArr.length) {
            int length = objArr.length;
            int i6 = length + (length >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            j.e(copyOf, "copyOf(...)");
            this.f4344d = copyOf;
        }
        Object[] objArr2 = this.f4344d;
        S1.k.m0(objArr2, objArr2, i3 + i4, i3, this.f4345e);
        this.f4345e += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f4345e - 1; i3 >= 0; i3--) {
            if (j.a(this.f4344d[i3], obj)) {
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
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f4344d;
        Object obj = objArr[i3];
        S1.k.m0(objArr, objArr, i3, i3 + 1, this.f4345e);
        Object[] objArr2 = this.f4344d;
        int i4 = this.f4345e - 1;
        j.f(objArr2, "<this>");
        objArr2[i4] = null;
        this.f4345e--;
        return obj;
    }

    public final void n(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f4344d;
        S1.k.m0(objArr, objArr, i3, i3 + i4, this.f4345e);
        Object[] objArr2 = this.f4344d;
        int i5 = this.f4345e;
        O2.d.d0(objArr2, i5 - i4, i5);
        this.f4345e -= i4;
    }

    public final int o(int i3, int i4, Collection collection, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i3 + i5;
            if (collection.contains(this.f4344d[i7]) == z3) {
                Object[] objArr = this.f4344d;
                i5++;
                objArr[i6 + i3] = objArr[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        Object[] objArr2 = this.f4344d;
        S1.k.m0(objArr2, objArr2, i3 + i6, i4 + i3, this.f4345e);
        Object[] objArr3 = this.f4344d;
        int i9 = this.f4345e;
        O2.d.d0(objArr3, i9 - i8, i9);
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4345e -= i8;
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        k();
        return o(0, this.f4345e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.f(collection, "elements");
        k();
        return o(0, this.f4345e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        k();
        int i4 = this.f4345e;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f4344d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        l0.c.n(i3, i4, this.f4345e);
        return new a(this.f4344d, i3, i4 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.f(objArr, "array");
        int length = objArr.length;
        int i3 = this.f4345e;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4344d, 0, i3, objArr.getClass());
            j.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        S1.k.m0(this.f4344d, objArr, 0, 0, i3);
        int i4 = this.f4345e;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return O2.d.n(this.f4344d, 0, this.f4345e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        int i4 = this.f4345e;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
        }
        return new x(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        j.f(collection, "elements");
        k();
        int i4 = this.f4345e;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            i(i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        k();
        int i4 = this.f4345e;
        if (i3 >= 0 && i3 <= i4) {
            ((AbstractList) this).modCount++;
            l(i3, 1);
            this.f4344d[i3] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(k.f(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return S1.k.q0(this.f4344d, 0, this.f4345e);
    }
}
