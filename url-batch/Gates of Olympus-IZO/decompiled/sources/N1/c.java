package N1;

import H2.AbstractC0080b;
import M1.B;
import M1.k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends M1.f implements RandomAccess, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final c f2864g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2865d;

    /* renamed from: e, reason: collision with root package name */
    public int f2866e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2867f;

    static {
        c cVar = new c(0);
        cVar.f2867f = true;
        f2864g = cVar;
    }

    public c(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f2865d = new Object[i3];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i3 = this.f2866e;
        ((AbstractList) this).modCount++;
        l(i3, 1);
        this.f2865d[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Z1.i.f(collection, "elements");
        k();
        int size = collection.size();
        i(this.f2866e, collection, size);
        return size > 0;
    }

    @Override // M1.f
    public final int b() {
        return this.f2866e;
    }

    @Override // M1.f
    public final Object c(int i3) {
        k();
        int i4 = this.f2866e;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return m(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.f2866e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!B.m(this.f2865d, 0, this.f2866e, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f2866e;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return this.f2865d[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f2865d;
        int i3 = this.f2866e;
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
            this.f2865d[i3 + i5] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f2866e; i3++) {
            if (Z1.i.a(this.f2865d[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2866e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        l(i3, 1);
        this.f2865d[i3] = obj;
    }

    public final void k() {
        if (this.f2867f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i3, int i4) {
        int i5 = this.f2866e + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2865d;
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
            Z1.i.e(copyOf, "copyOf(...)");
            this.f2865d = copyOf;
        }
        Object[] objArr2 = this.f2865d;
        k.X(objArr2, objArr2, i3 + i4, i3, this.f2866e);
        this.f2866e += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f2866e - 1; i3 >= 0; i3--) {
            if (Z1.i.a(this.f2865d[i3], obj)) {
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
        Object[] objArr = this.f2865d;
        Object obj = objArr[i3];
        k.X(objArr, objArr, i3, i3 + 1, this.f2866e);
        Object[] objArr2 = this.f2865d;
        int i4 = this.f2866e - 1;
        Z1.i.f(objArr2, "<this>");
        objArr2[i4] = null;
        this.f2866e--;
        return obj;
    }

    public final void n(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f2865d;
        k.X(objArr, objArr, i3, i3 + i4, this.f2866e);
        Object[] objArr2 = this.f2865d;
        int i5 = this.f2866e;
        B.L(objArr2, i5 - i4, i5);
        this.f2866e -= i4;
    }

    public final int o(int i3, int i4, Collection collection, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i3 + i5;
            if (collection.contains(this.f2865d[i7]) == z3) {
                Object[] objArr = this.f2865d;
                i5++;
                objArr[i6 + i3] = objArr[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        Object[] objArr2 = this.f2865d;
        k.X(objArr2, objArr2, i3 + i6, i4 + i3, this.f2866e);
        Object[] objArr3 = this.f2865d;
        int i9 = this.f2866e;
        B.L(objArr3, i9 - i8, i9);
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2866e -= i8;
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
        Z1.i.f(collection, "elements");
        k();
        return o(0, this.f2866e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Z1.i.f(collection, "elements");
        k();
        return o(0, this.f2866e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        k();
        int i4 = this.f2866e;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f2865d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        I2.d.r(i3, i4, this.f2866e);
        return new b(this.f2865d, i3, i4 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Z1.i.f(objArr, "array");
        int length = objArr.length;
        int i3 = this.f2866e;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f2865d, 0, i3, objArr.getClass());
            Z1.i.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        k.X(this.f2865d, objArr, 0, 0, i3);
        int i4 = this.f2866e;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return B.n(this.f2865d, 0, this.f2866e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        int i4 = this.f2866e;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return new a(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        Z1.i.f(collection, "elements");
        k();
        int i4 = this.f2866e;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            i(i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        k();
        int i4 = this.f2866e;
        if (i3 >= 0 && i3 <= i4) {
            ((AbstractList) this).modCount++;
            l(i3, 1);
            this.f2865d[i3] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k.b0(this.f2865d, 0, this.f2866e);
    }
}
