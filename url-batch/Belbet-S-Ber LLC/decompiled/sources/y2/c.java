package y2;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x2.d;
import x2.g;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends d implements RandomAccess, Serializable {
    public static final c i;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f4109f;

    /* renamed from: g, reason: collision with root package name */
    public int f4110g;
    public boolean h;

    static {
        c cVar = new c(0);
        cVar.h = true;
        i = cVar;
    }

    public c(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f4109f = new Object[i4];
    }

    @Override // x2.d
    public final int a() {
        return this.f4110g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i4 = this.f4110g;
        ((AbstractList) this).modCount++;
        g(i4, 1);
        this.f4109f[i4] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i3.d.e(collection, "elements");
        f();
        int size = collection.size();
        d(this.f4110g, collection, size);
        return size > 0;
    }

    @Override // x2.d
    public final Object b(int i4) {
        f();
        int i5 = this.f4110g;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
        }
        return h(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f4110g);
    }

    public final void d(int i4, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        g(i4, i5);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.f4109f[i4 + i6] = it.next();
        }
    }

    public final void e(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        g(i4, 1);
        this.f4109f[i4] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f4109f;
            int i4 = this.f4110g;
            if (i4 == list.size()) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i3.d.a(objArr[i5], list.get(i5))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i4, int i5) {
        int i6 = this.f4110g + i5;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4109f;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i7 = length + (length >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i7);
            i3.d.d(copyOf, "copyOf(...)");
            this.f4109f = copyOf;
        }
        Object[] objArr2 = this.f4109f;
        g.H(objArr2, objArr2, i4 + i5, i4, this.f4110g);
        this.f4110g += i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.f4110g;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
        }
        return this.f4109f[i4];
    }

    public final Object h(int i4) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f4109f;
        Object obj = objArr[i4];
        g.H(objArr, objArr, i4, i4 + 1, this.f4110g);
        Object[] objArr2 = this.f4109f;
        int i5 = this.f4110g - 1;
        i3.d.e(objArr2, "<this>");
        objArr2[i5] = null;
        this.f4110g--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f4109f;
        int i4 = this.f4110g;
        int i5 = 1;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            i5 = (i5 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i5;
    }

    public final void i(int i4, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f4109f;
        g.H(objArr, objArr, i4, i4 + i5, this.f4110g);
        Object[] objArr2 = this.f4109f;
        int i6 = this.f4110g;
        i3.d.e(objArr2, "<this>");
        for (int i7 = i6 - i5; i7 < i6; i7++) {
            objArr2[i7] = null;
        }
        this.f4110g -= i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i4 = 0; i4 < this.f4110g; i4++) {
            if (i3.d.a(this.f4109f[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4110g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i4, int i5, Collection collection, boolean z4) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i4 + i6;
            if (collection.contains(this.f4109f[i8]) == z4) {
                Object[] objArr = this.f4109f;
                i6++;
                objArr[i7 + i4] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        Object[] objArr2 = this.f4109f;
        g.H(objArr2, objArr2, i4 + i7, i5 + i4, this.f4110g);
        Object[] objArr3 = this.f4109f;
        int i10 = this.f4110g;
        i3.d.e(objArr3, "<this>");
        for (int i11 = i10 - i9; i11 < i10; i11++) {
            objArr3[i11] = null;
        }
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4110g -= i9;
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i4 = this.f4110g - 1; i4 >= 0; i4--) {
            if (i3.d.a(this.f4109f[i4], obj)) {
                return i4;
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
        i3.d.e(collection, "elements");
        f();
        return j(0, this.f4110g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        i3.d.e(collection, "elements");
        f();
        return j(0, this.f4110g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        f();
        int i5 = this.f4110g;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
        }
        Object[] objArr = this.f4109f;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i5) {
        s.a.i(i4, i5, this.f4110g);
        return new b(this.f4109f, i4, i5 - i4, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i3.d.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f4110g;
        if (length < i4) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4109f, 0, i4, objArr.getClass());
            i3.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        g.H(this.f4109f, objArr, 0, 0, i4);
        int i5 = this.f4110g;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return s.a.b(this.f4109f, 0, this.f4110g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        int i5 = this.f4110g;
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
        }
        return new a(this, i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        i3.d.e(collection, "elements");
        f();
        int i5 = this.f4110g;
        if (i4 >= 0 && i4 <= i5) {
            int size = collection.size();
            d(i4, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        f();
        int i5 = this.f4110g;
        if (i4 >= 0 && i4 <= i5) {
            ((AbstractList) this).modCount++;
            g(i4, 1);
            this.f4109f[i4] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return g.J(this.f4109f, 0, this.f4110g);
    }
}
