package S5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractC0627f;
import kotlin.collections.AbstractC0629h;
import kotlin.collections.C0624c;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends AbstractC0629h implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2513d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2514e;

    /* renamed from: i, reason: collision with root package name */
    public int f2515i;

    /* renamed from: l, reason: collision with root package name */
    public final c f2516l;

    /* renamed from: m, reason: collision with root package name */
    public final e f2517m;

    public c(Object[] backing, int i2, int i5, c cVar, e root) {
        int i7;
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f2513d = backing;
        this.f2514e = i2;
        this.f2515i = i5;
        this.f2516l = cVar;
        this.f2517m = root;
        i7 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i7;
    }

    @Override // kotlin.collections.AbstractC0629h
    public final int a() {
        f();
        return this.f2515i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f2514e + this.f2515i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        int size = elements.size();
        d(this.f2514e + this.f2515i, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC0629h
    public final Object b(int i2) {
        g();
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2515i;
        c0624c.getClass();
        C0624c.b(i2, i5);
        return h(this.f2514e + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f2514e, this.f2515i);
    }

    public final void d(int i2, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        e eVar = this.f2517m;
        c cVar = this.f2516l;
        if (cVar != null) {
            cVar.d(i2, collection, i5);
        } else {
            e eVar2 = e.f2519m;
            eVar.d(i2, collection, i5);
        }
        this.f2513d = eVar.f2520d;
        this.f2515i += i5;
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        e eVar = this.f2517m;
        c cVar = this.f2516l;
        if (cVar != null) {
            cVar.e(i2, obj);
        } else {
            e eVar2 = e.f2519m;
            eVar.e(i2, obj);
        }
        this.f2513d = eVar.f2520d;
        this.f2515i++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f2513d;
            int i2 = this.f2515i;
            if (i2 == list.size()) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (Intrinsics.a(objArr[this.f2514e + i5], list.get(i5))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i2;
        i2 = ((AbstractList) this.f2517m).modCount;
        if (i2 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f2517m.f2522i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2515i;
        c0624c.getClass();
        C0624c.b(i2, i5);
        return this.f2513d[this.f2514e + i2];
    }

    public final Object h(int i2) {
        Object h7;
        ((AbstractList) this).modCount++;
        c cVar = this.f2516l;
        if (cVar != null) {
            h7 = cVar.h(i2);
        } else {
            e eVar = e.f2519m;
            h7 = this.f2517m.h(i2);
        }
        this.f2515i--;
        return h7;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f2513d;
        int i2 = this.f2515i;
        int i5 = 1;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj = objArr[this.f2514e + i7];
            i5 = (i5 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i5;
    }

    public final void i(int i2, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f2516l;
        if (cVar != null) {
            cVar.i(i2, i5);
        } else {
            e eVar = e.f2519m;
            this.f2517m.i(i2, i5);
        }
        this.f2515i -= i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i2 = 0; i2 < this.f2515i; i2++) {
            if (Intrinsics.a(this.f2513d[this.f2514e + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f2515i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i5, Collection collection, boolean z7) {
        int j;
        c cVar = this.f2516l;
        if (cVar != null) {
            j = cVar.j(i2, i5, collection, z7);
        } else {
            e eVar = e.f2519m;
            j = this.f2517m.j(i2, i5, collection, z7);
        }
        if (j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2515i -= j;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i2 = this.f2515i - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.f2513d[this.f2514e + i2], obj)) {
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
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        return j(this.f2514e, this.f2515i, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        return j(this.f2514e, this.f2515i, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        g();
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2515i;
        c0624c.getClass();
        C0624c.b(i2, i5);
        Object[] objArr = this.f2513d;
        int i7 = this.f2514e + i2;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i5) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i7 = this.f2515i;
        c0624c.getClass();
        C0624c.d(i2, i5, i7);
        return new c(this.f2513d, this.f2514e + i2, i5 - i2, this, this.f2517m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        f();
        int length = array.length;
        int i2 = this.f2515i;
        int i5 = this.f2514e;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f2513d, i5, i2 + i5, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        o.e(this.f2513d, array, 0, i5, i2 + i5);
        int i7 = this.f2515i;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return P0.f.a(this.f2513d, this.f2514e, this.f2515i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2515i;
        c0624c.getClass();
        C0624c.c(i2, i5);
        return new b(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        g();
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2515i;
        c0624c.getClass();
        C0624c.c(i2, i5);
        e(this.f2514e + i2, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g();
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2515i;
        c0624c.getClass();
        C0624c.c(i2, i5);
        int size = elements.size();
        d(this.f2514e + i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f2513d;
        int i2 = this.f2515i;
        int i5 = this.f2514e;
        return o.h(objArr, i5, i2 + i5);
    }
}
