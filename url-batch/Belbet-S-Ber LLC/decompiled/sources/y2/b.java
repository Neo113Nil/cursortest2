package y2;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x2.d;
import x2.g;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends d implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f4106f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4107g;
    public int h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final c f4108j;

    public b(Object[] objArr, int i, int i4, b bVar, c cVar) {
        int i5;
        i3.d.e(objArr, "backing");
        i3.d.e(cVar, "root");
        this.f4106f = objArr;
        this.f4107g = i;
        this.h = i4;
        this.i = bVar;
        this.f4108j = cVar;
        i5 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // x2.d
    public final int a() {
        f();
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f4107g + this.h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i3.d.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f4107g + this.h, collection, size);
        return size > 0;
    }

    @Override // x2.d
    public final Object b(int i) {
        g();
        f();
        int i4 = this.h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
        }
        return h(this.f4107g + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f4107g, this.h);
    }

    public final void d(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        c cVar = this.f4108j;
        b bVar = this.i;
        if (bVar != null) {
            bVar.d(i, collection, i4);
        } else {
            c cVar2 = c.i;
            cVar.d(i, collection, i4);
        }
        this.f4106f = cVar.f4109f;
        this.h += i4;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f4108j;
        b bVar = this.i;
        if (bVar != null) {
            bVar.e(i, obj);
        } else {
            c cVar2 = c.i;
            cVar.e(i, obj);
        }
        this.f4106f = cVar.f4109f;
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f4106f;
            int i = this.h;
            if (i == list.size()) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (i3.d.a(objArr[this.f4107g + i4], list.get(i4))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.f4108j).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f4108j.h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i4 = this.h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
        }
        return this.f4106f[this.f4107g + i];
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        b bVar = this.i;
        if (bVar != null) {
            h = bVar.h(i);
        } else {
            c cVar = c.i;
            h = this.f4108j.h(i);
        }
        this.h--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f4106f;
        int i = this.h;
        int i4 = 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[this.f4107g + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final void i(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.i(i, i4);
        } else {
            c cVar = c.i;
            this.f4108j.i(i, i4);
        }
        this.h -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.h; i++) {
            if (i3.d.a(this.f4106f[this.f4107g + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i4, Collection collection, boolean z4) {
        int j2;
        b bVar = this.i;
        if (bVar != null) {
            j2 = bVar.j(i, i4, collection, z4);
        } else {
            c cVar = c.i;
            j2 = this.f4108j.j(i, i4, collection, z4);
        }
        if (j2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.h -= j2;
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.h - 1; i >= 0; i--) {
            if (i3.d.a(this.f4106f[this.f4107g + i], obj)) {
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
        g();
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
        g();
        f();
        return j(this.f4107g, this.h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        i3.d.e(collection, "elements");
        g();
        f();
        return j(this.f4107g, this.h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i4 = this.h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f4106f;
        int i5 = this.f4107g;
        Object obj2 = objArr[i5 + i];
        objArr[i5 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        s.a.i(i, i4, this.h);
        return new b(this.f4106f, this.f4107g + i, i4 - i, this, this.f4108j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        i3.d.e(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.h;
        int i4 = this.f4107g;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4106f, i4, i + i4, objArr.getClass());
            i3.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        g.H(this.f4106f, objArr, 0, i4, i + i4);
        int i5 = this.h;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return s.a.b(this.f4106f, this.f4107g, this.h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i4 = this.h;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i4 = this.h;
        if (i >= 0 && i <= i4) {
            e(this.f4107g + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        i3.d.e(collection, "elements");
        g();
        f();
        int i4 = this.h;
        if (i >= 0 && i <= i4) {
            int size = collection.size();
            d(this.f4107g + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(a4.b.d(i, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f4106f;
        int i = this.h;
        int i4 = this.f4107g;
        return g.J(objArr, i4, i + i4);
    }
}
