package m5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l5.AbstractC0501e;
import l5.AbstractC0505i;

/* renamed from: m5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526c extends AbstractC0501e implements RandomAccess, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final C0526c f5456i;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5457f;

    /* renamed from: g, reason: collision with root package name */
    public int f5458g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5459h;

    static {
        C0526c c0526c = new C0526c(0);
        c0526c.f5459h = true;
        f5456i = c0526c;
    }

    public C0526c(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f5457f = new Object[i7];
    }

    @Override // l5.AbstractC0501e
    public final int a() {
        return this.f5458g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i7 = this.f5458g;
        ((AbstractList) this).modCount++;
        g(i7, 1);
        this.f5457f[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        f();
        int size = elements.size();
        d(this.f5458g, elements, size);
        return size > 0;
    }

    @Override // l5.AbstractC0501e
    public final Object b(int i7) {
        f();
        int i8 = this.f5458g;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return h(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f5458g);
    }

    public final void d(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        g(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f5457f[i7 + i9] = it.next();
        }
    }

    public final void e(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        g(i7, 1);
        this.f5457f[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f5457f;
            int i7 = this.f5458g;
            if (i7 == list.size()) {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (kotlin.jvm.internal.i.a(objArr[i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f5459h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i7, int i8) {
        int i9 = this.f5458g + i8;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f5457f;
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
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f5457f = copyOf;
        }
        Object[] objArr2 = this.f5457f;
        AbstractC0505i.G(objArr2, objArr2, i7 + i8, i7, this.f5458g);
        this.f5458g += i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f5458g;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return this.f5457f[i7];
    }

    public final Object h(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f5457f;
        Object obj = objArr[i7];
        AbstractC0505i.G(objArr, objArr, i7, i7 + 1, this.f5458g);
        Object[] objArr2 = this.f5457f;
        int i8 = this.f5458g - 1;
        kotlin.jvm.internal.i.e(objArr2, "<this>");
        objArr2[i8] = null;
        this.f5458g--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f5457f;
        int i7 = this.f5458g;
        int i8 = 1;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            i8 = (i8 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i8;
    }

    public final void i(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f5457f;
        AbstractC0505i.G(objArr, objArr, i7, i7 + i8, this.f5458g);
        Object[] objArr2 = this.f5457f;
        int i9 = this.f5458g;
        A3.c.a0(i9 - i8, i9, objArr2);
        this.f5458g -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f5458g; i7++) {
            if (kotlin.jvm.internal.i.a(this.f5457f[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5458g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i7, int i8, Collection collection, boolean z5) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f5457f[i11]) == z5) {
                Object[] objArr = this.f5457f;
                i9++;
                objArr[i10 + i7] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f5457f;
        AbstractC0505i.G(objArr2, objArr2, i7 + i10, i8 + i7, this.f5458g);
        Object[] objArr3 = this.f5457f;
        int i13 = this.f5458g;
        A3.c.a0(i13 - i12, i13, objArr3);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5458g -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f5458g - 1; i7 >= 0; i7--) {
            if (kotlin.jvm.internal.i.a(this.f5457f[i7], obj)) {
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
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        f();
        return j(0, this.f5458g, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        f();
        return j(0, this.f5458g, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        f();
        int i8 = this.f5458g;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        Object[] objArr = this.f5457f;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        i6.g.h(i7, i8, this.f5458g);
        return new C0525b(this.f5457f, i7, i8 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i7 = this.f5458g;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f5457f, 0, i7, array.getClass());
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0505i.G(this.f5457f, array, 0, 0, i7);
        int i8 = this.f5458g;
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return A3.c.z(this.f5457f, 0, this.f5458g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        int i8 = this.f5458g;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return new C0524a(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        f();
        int i8 = this.f5458g;
        if (i7 >= 0 && i7 <= i8) {
            int size = elements.size();
            d(i7, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        f();
        int i8 = this.f5458g;
        if (i7 >= 0 && i7 <= i8) {
            ((AbstractList) this).modCount++;
            g(i7, 1);
            this.f5457f[i7] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0505i.I(0, this.f5458g, this.f5457f);
    }
}
