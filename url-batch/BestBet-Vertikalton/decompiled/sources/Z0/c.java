package Z0;

import G1.AbstractC0001b;
import H1.l;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends Y0.e implements RandomAccess, Serializable {
    public static final c d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1533a;

    /* renamed from: b, reason: collision with root package name */
    public int f1534b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1535c;

    static {
        c cVar = new c(0);
        cVar.f1535c = true;
        d = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f1533a = new Object[i];
    }

    @Override // Y0.e
    public final int a() {
        return this.f1534b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f1534b;
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.f1533a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k1.e.e(collection, "elements");
        f();
        int size = collection.size();
        d(this.f1534b, collection, size);
        return size > 0;
    }

    @Override // Y0.e
    public final Object b(int i) {
        f();
        int i2 = this.f1534b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return h(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f1534b);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        g(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1533a[i + i3] = it.next();
        }
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.f1533a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!l.h(this.f1533a, 0, this.f1534b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (this.f1535c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i, int i2) {
        int i3 = this.f1534b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f1533a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i4);
            k1.e.d(copyOf, "copyOf(...)");
            this.f1533a = copyOf;
        }
        Object[] objArr2 = this.f1533a;
        Y0.i.k0(objArr2, objArr2, i + i2, i, this.f1534b);
        this.f1534b += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f1534b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return this.f1533a[i];
    }

    public final Object h(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f1533a;
        Object obj = objArr[i];
        Y0.i.k0(objArr, objArr, i, i + 1, this.f1534b);
        Object[] objArr2 = this.f1533a;
        int i2 = this.f1534b - 1;
        k1.e.e(objArr2, "<this>");
        objArr2[i2] = null;
        this.f1534b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f1533a;
        int i = this.f1534b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f1533a;
        Y0.i.k0(objArr, objArr, i, i + i2, this.f1534b);
        Object[] objArr2 = this.f1533a;
        int i3 = this.f1534b;
        l.a0(objArr2, i3 - i2, i3);
        this.f1534b -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f1534b; i++) {
            if (k1.e.a(this.f1533a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1534b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f1533a[i5]) == z2) {
                Object[] objArr = this.f1533a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f1533a;
        Y0.i.k0(objArr2, objArr2, i + i4, i2 + i, this.f1534b);
        Object[] objArr3 = this.f1533a;
        int i7 = this.f1534b;
        l.a0(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1534b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f1534b - 1; i >= 0; i--) {
            if (k1.e.a(this.f1533a[i], obj)) {
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
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        k1.e.e(collection, "elements");
        f();
        return j(0, this.f1534b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k1.e.e(collection, "elements");
        f();
        return j(0, this.f1534b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        int i2 = this.f1534b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f1533a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        H1.d.l(i, i2, this.f1534b);
        return new b(this.f1533a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k1.e.e(objArr, "array");
        int length = objArr.length;
        int i = this.f1534b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1533a, 0, i, objArr.getClass());
            k1.e.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        Y0.i.k0(this.f1533a, objArr, 0, 0, i);
        int i2 = this.f1534b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l.i(this.f1533a, 0, this.f1534b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f1534b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k1.e.e(collection, "elements");
        f();
        int i2 = this.f1534b;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        int i2 = this.f1534b;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            g(i, 1);
            this.f1533a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f1533a;
        int i = this.f1534b;
        k1.e.e(objArr, "<this>");
        l.r(i, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i);
        k1.e.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }
}
