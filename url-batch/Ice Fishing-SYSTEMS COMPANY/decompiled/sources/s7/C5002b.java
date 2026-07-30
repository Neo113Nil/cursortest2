package s7;

import a.AbstractC0415a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r7.AbstractC4974e;
import r7.AbstractC4978i;
import t0.AbstractC5051n;

/* renamed from: s7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5002b extends AbstractC4974e implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public Object[] f40493n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40494u;

    /* renamed from: v, reason: collision with root package name */
    public int f40495v;

    /* renamed from: w, reason: collision with root package name */
    public final C5002b f40496w;

    /* renamed from: x, reason: collision with root package name */
    public final C5003c f40497x;

    public C5002b(Object[] backing, int i, int i4, C5002b c5002b, C5003c root) {
        int i9;
        kotlin.jvm.internal.h.e(backing, "backing");
        kotlin.jvm.internal.h.e(root, "root");
        this.f40493n = backing;
        this.f40494u = i;
        this.f40495v = i4;
        this.f40496w = c5002b;
        this.f40497x = root;
        i9 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i9;
    }

    @Override // r7.AbstractC4974e
    public final int a() {
        g();
        return this.f40495v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f40494u + this.f40495v, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        int size = elements.size();
        e(this.f40494u + this.f40495v, elements, size);
        return size > 0;
    }

    @Override // r7.AbstractC4974e
    public final Object c(int i) {
        h();
        g();
        int i4 = this.f40495v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return i(this.f40494u + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f40494u, this.f40495v);
    }

    public final void e(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        C5003c c5003c = this.f40497x;
        C5002b c5002b = this.f40496w;
        if (c5002b != null) {
            c5002b.e(i, collection, i4);
        } else {
            C5003c c5003c2 = C5003c.f40498w;
            c5003c.e(i, collection, i4);
        }
        this.f40493n = c5003c.f40499n;
        this.f40495v += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return AbstractC0415a.c(this.f40493n, this.f40494u, this.f40495v, (List) obj);
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C5003c c5003c = this.f40497x;
        C5002b c5002b = this.f40496w;
        if (c5002b != null) {
            c5002b.f(i, obj);
        } else {
            C5003c c5003c2 = C5003c.f40498w;
            c5003c.f(i, obj);
        }
        this.f40493n = c5003c.f40499n;
        this.f40495v++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.f40497x).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i4 = this.f40495v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return this.f40493n[this.f40494u + i];
    }

    public final void h() {
        if (this.f40497x.f40501v) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f40493n;
        int i = this.f40495v;
        int i4 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            Object obj = objArr[this.f40494u + i9];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i) {
        Object i4;
        ((AbstractList) this).modCount++;
        C5002b c5002b = this.f40496w;
        if (c5002b != null) {
            i4 = c5002b.i(i);
        } else {
            C5003c c5003c = C5003c.f40498w;
            i4 = this.f40497x.i(i);
        }
        this.f40495v--;
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.f40495v; i++) {
            if (kotlin.jvm.internal.h.a(this.f40493n[this.f40494u + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f40495v == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        C5002b c5002b = this.f40496w;
        if (c5002b != null) {
            c5002b.j(i, i4);
        } else {
            C5003c c5003c = C5003c.f40498w;
            this.f40497x.j(i, i4);
        }
        this.f40495v -= i4;
    }

    public final int k(int i, int i4, Collection collection, boolean z8) {
        int k6;
        C5002b c5002b = this.f40496w;
        if (c5002b != null) {
            k6 = c5002b.k(i, i4, collection, z8);
        } else {
            C5003c c5003c = C5003c.f40498w;
            k6 = this.f40497x.k(i, i4, collection, z8);
        }
        if (k6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f40495v -= k6;
        return k6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.f40495v - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.h.a(this.f40493n[this.f40494u + i], obj)) {
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
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        return k(this.f40494u, this.f40495v, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        return k(this.f40494u, this.f40495v, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i4 = this.f40495v;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f40493n;
        int i9 = this.f40494u;
        Object obj2 = objArr[i9 + i];
        objArr[i9 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        com.bumptech.glide.g.D(i, i4, this.f40495v);
        return new C5002b(this.f40493n, this.f40494u + i, i4 - i, this, this.f40497x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        g();
        int length = array.length;
        int i = this.f40495v;
        int i4 = this.f40494u;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f40493n, i4, i + i4, array.getClass());
            kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC4978i.I(0, i4, i + i4, this.f40493n, array);
        int i9 = this.f40495v;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return AbstractC0415a.d(this.f40493n, this.f40494u, this.f40495v, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i4 = this.f40495v;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
        }
        return new C5001a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i4 = this.f40495v;
        if (i >= 0 && i <= i4) {
            f(this.f40494u + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        h();
        g();
        int i4 = this.f40495v;
        if (i >= 0 && i <= i4) {
            int size = elements.size();
            e(this.f40494u + i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC5051n.c(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f40493n;
        int i = this.f40495v;
        int i4 = this.f40494u;
        return AbstractC4978i.L(objArr, i4, i + i4);
    }
}
