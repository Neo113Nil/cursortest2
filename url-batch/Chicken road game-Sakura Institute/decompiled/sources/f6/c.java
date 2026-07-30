package f6;

import e6.k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends e6.f implements RandomAccess, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final c f3406i;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3407f;

    /* renamed from: g, reason: collision with root package name */
    public int f3408g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3409h;

    static {
        c cVar = new c(0);
        cVar.f3409h = true;
        f3406i = cVar;
    }

    public c(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f3407f = new Object[i7];
    }

    public final Object A(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f3407f;
        Object obj = objArr[i7];
        k.X(objArr, objArr, i7, i7 + 1, this.f3408g);
        Object[] objArr2 = this.f3407f;
        int i8 = this.f3408g - 1;
        r6.k.f(objArr2, "<this>");
        objArr2[i8] = null;
        this.f3408g--;
        return obj;
    }

    public final void B(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f3407f;
        k.X(objArr, objArr, i7, i7 + i8, this.f3408g);
        Object[] objArr2 = this.f3407f;
        int i9 = this.f3408g;
        r4.a.R(objArr2, i9 - i8, i9);
        this.f3408g -= i8;
    }

    public final int C(int i7, int i8, Collection collection, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f3407f[i11]) == z8) {
                Object[] objArr = this.f3407f;
                i9++;
                objArr[i10 + i7] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f3407f;
        k.X(objArr2, objArr2, i7 + i10, i8 + i7, this.f3408g);
        Object[] objArr3 = this.f3407f;
        int i13 = this.f3408g;
        r4.a.R(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3408g -= i12;
        return i12;
    }

    @Override // e6.f
    public final int a() {
        return this.f3408g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        y();
        int i7 = this.f3408g;
        ((AbstractList) this).modCount++;
        z(i7, 1);
        this.f3407f[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        r6.k.f(collection, "elements");
        y();
        int size = collection.size();
        w(this.f3408g, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        y();
        B(0, this.f3408g);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f3407f;
            int i7 = this.f3408g;
            if (i7 == list.size()) {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (r6.k.a(objArr[i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final Object g(int i7) {
        y();
        int i8 = this.f3408g;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return A(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f3408g;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return this.f3407f[i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f3407f;
        int i7 = this.f3408g;
        int i8 = 1;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            i8 = (i8 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f3408g; i7++) {
            if (r6.k.a(this.f3407f[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3408g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f3408g - 1; i7 >= 0; i7--) {
            if (r6.k.a(this.f3407f[i7], obj)) {
                return i7;
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
        y();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        r6.k.f(collection, "elements");
        y();
        return C(0, this.f3408g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        r6.k.f(collection, "elements");
        y();
        return C(0, this.f3408g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        y();
        int i8 = this.f3408g;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        Object[] objArr = this.f3407f;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        j1.c.O(i7, i8, this.f3408g);
        return new b(this.f3407f, i7, i8 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        r6.k.f(objArr, "array");
        int length = objArr.length;
        int i7 = this.f3408g;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f3407f, 0, i7, objArr.getClass());
            r6.k.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        k.X(this.f3407f, objArr, 0, 0, i7);
        int i8 = this.f3408g;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return r4.a.n(this.f3407f, 0, this.f3408g, this);
    }

    public final void w(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        z(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f3407f[i7 + i9] = it.next();
        }
    }

    public final void x(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        z(i7, 1);
        this.f3407f[i7] = obj;
    }

    public final void y() {
        if (this.f3409h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void z(int i7, int i8) {
        int i9 = this.f3408g + i8;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f3407f;
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
            r6.k.e(copyOf, "copyOf(...)");
            this.f3407f = copyOf;
        }
        Object[] objArr2 = this.f3407f;
        k.X(objArr2, objArr2, i7 + i8, i7, this.f3408g);
        this.f3408g += i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        int i8 = this.f3408g;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return new a(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        r6.k.f(collection, "elements");
        y();
        int i8 = this.f3408g;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            w(i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        y();
        int i8 = this.f3408g;
        if (i7 >= 0 && i7 <= i8) {
            ((AbstractList) this).modCount++;
            z(i7, 1);
            this.f3407f[i7] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return k.b0(this.f3407f, 0, this.f3408g);
    }
}
