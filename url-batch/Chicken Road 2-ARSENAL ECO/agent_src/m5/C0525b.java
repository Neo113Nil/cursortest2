package m5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l5.AbstractC0501e;
import l5.AbstractC0505i;

/* renamed from: m5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525b extends AbstractC0501e implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5451f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5452g;

    /* renamed from: h, reason: collision with root package name */
    public int f5453h;

    /* renamed from: i, reason: collision with root package name */
    public final C0525b f5454i;

    /* renamed from: j, reason: collision with root package name */
    public final C0526c f5455j;

    public C0525b(Object[] backing, int i7, int i8, C0525b c0525b, C0526c root) {
        int i9;
        kotlin.jvm.internal.i.e(backing, "backing");
        kotlin.jvm.internal.i.e(root, "root");
        this.f5451f = backing;
        this.f5452g = i7;
        this.f5453h = i8;
        this.f5454i = c0525b;
        this.f5455j = root;
        i9 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i9;
    }

    @Override // l5.AbstractC0501e
    public final int a() {
        f();
        return this.f5453h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f5452g + this.f5453h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        g();
        f();
        int size = elements.size();
        d(this.f5452g + this.f5453h, elements, size);
        return size > 0;
    }

    @Override // l5.AbstractC0501e
    public final Object b(int i7) {
        g();
        f();
        int i8 = this.f5453h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return h(this.f5452g + i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f5452g, this.f5453h);
    }

    public final void d(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        C0526c c0526c = this.f5455j;
        C0525b c0525b = this.f5454i;
        if (c0525b != null) {
            c0525b.d(i7, collection, i8);
        } else {
            C0526c c0526c2 = C0526c.f5456i;
            c0526c.d(i7, collection, i8);
        }
        this.f5451f = c0526c.f5457f;
        this.f5453h += i8;
    }

    public final void e(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        C0526c c0526c = this.f5455j;
        C0525b c0525b = this.f5454i;
        if (c0525b != null) {
            c0525b.e(i7, obj);
        } else {
            C0526c c0526c2 = C0526c.f5456i;
            c0526c.e(i7, obj);
        }
        this.f5451f = c0526c.f5457f;
        this.f5453h++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f5451f;
            int i7 = this.f5453h;
            if (i7 == list.size()) {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (kotlin.jvm.internal.i.a(objArr[this.f5452g + i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i7;
        i7 = ((AbstractList) this.f5455j).modCount;
        if (i7 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f5455j.f5459h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        f();
        int i8 = this.f5453h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return this.f5451f[this.f5452g + i7];
    }

    public final Object h(int i7) {
        Object h7;
        ((AbstractList) this).modCount++;
        C0525b c0525b = this.f5454i;
        if (c0525b != null) {
            h7 = c0525b.h(i7);
        } else {
            C0526c c0526c = C0526c.f5456i;
            h7 = this.f5455j.h(i7);
        }
        this.f5453h--;
        return h7;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f5451f;
        int i7 = this.f5453h;
        int i8 = 1;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[this.f5452g + i9];
            i8 = (i8 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i8;
    }

    public final void i(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0525b c0525b = this.f5454i;
        if (c0525b != null) {
            c0525b.i(i7, i8);
        } else {
            C0526c c0526c = C0526c.f5456i;
            this.f5455j.i(i7, i8);
        }
        this.f5453h -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i7 = 0; i7 < this.f5453h; i7++) {
            if (kotlin.jvm.internal.i.a(this.f5451f[this.f5452g + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f5453h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i7, int i8, Collection collection, boolean z5) {
        int j4;
        C0525b c0525b = this.f5454i;
        if (c0525b != null) {
            j4 = c0525b.j(i7, i8, collection, z5);
        } else {
            C0526c c0526c = C0526c.f5456i;
            j4 = this.f5455j.j(i7, i8, collection, z5);
        }
        if (j4 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5453h -= j4;
        return j4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i7 = this.f5453h - 1; i7 >= 0; i7--) {
            if (kotlin.jvm.internal.i.a(this.f5451f[this.f5452g + i7], obj)) {
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
        g();
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
        g();
        f();
        return j(this.f5452g, this.f5453h, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        g();
        f();
        return j(this.f5452g, this.f5453h, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        g();
        f();
        int i8 = this.f5453h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        Object[] objArr = this.f5451f;
        int i9 = this.f5452g;
        Object obj2 = objArr[i9 + i7];
        objArr[i9 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        i6.g.h(i7, i8, this.f5453h);
        return new C0525b(this.f5451f, this.f5452g + i7, i8 - i7, this, this.f5455j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        f();
        int length = array.length;
        int i7 = this.f5453h;
        int i8 = this.f5452g;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f5451f, i8, i7 + i8, array.getClass());
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0505i.G(this.f5451f, array, 0, i8, i7 + i8);
        int i9 = this.f5453h;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return A3.c.z(this.f5451f, this.f5452g, this.f5453h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        f();
        int i8 = this.f5453h;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return new C0524a(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        g();
        f();
        int i8 = this.f5453h;
        if (i7 >= 0 && i7 <= i8) {
            e(this.f5452g + i7, obj);
            return;
        }
        throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        g();
        f();
        int i8 = this.f5453h;
        if (i7 >= 0 && i7 <= i8) {
            int size = elements.size();
            d(this.f5452g + i7, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f5451f;
        int i7 = this.f5453h;
        int i8 = this.f5452g;
        return AbstractC0505i.I(i8, i7 + i8, objArr);
    }
}
