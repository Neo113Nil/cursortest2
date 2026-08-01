package Y0;

import G1.AbstractC0001b;
import H1.l;
import X0.j;
import a.AbstractC0058a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends X0.f implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f1394a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1395b;

    /* renamed from: c, reason: collision with root package name */
    public int f1396c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1397d;
    public final c e;

    public b(Object[] objArr, int i, int i2, b bVar, c cVar) {
        int i3;
        j1.h.e(objArr, "backing");
        j1.h.e(cVar, "root");
        this.f1394a = objArr;
        this.f1395b = i;
        this.f1396c = i2;
        this.f1397d = bVar;
        this.e = cVar;
        i3 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // X0.f
    public final int a() {
        f();
        return this.f1396c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f1395b + this.f1396c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j1.h.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f1395b + this.f1396c, collection, size);
        return size > 0;
    }

    @Override // X0.f
    public final Object b(int i) {
        g();
        f();
        int i2 = this.f1396c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return h(this.f1395b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f1395b, this.f1396c);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        c cVar = this.e;
        b bVar = this.f1397d;
        if (bVar != null) {
            bVar.d(i, collection, i2);
        } else {
            c cVar2 = c.f1398d;
            cVar.d(i, collection, i2);
        }
        this.f1394a = cVar.f1399a;
        this.f1396c += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.e;
        b bVar = this.f1397d;
        if (bVar != null) {
            bVar.e(i, obj);
        } else {
            c cVar2 = c.f1398d;
            cVar.e(i, obj);
        }
        this.f1394a = cVar.f1399a;
        this.f1396c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                if (l.a(this.f1394a, this.f1395b, this.f1396c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.e).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.e.f1401c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.f1396c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return this.f1394a[this.f1395b + i];
    }

    public final Object h(int i) {
        Object h2;
        ((AbstractList) this).modCount++;
        b bVar = this.f1397d;
        if (bVar != null) {
            h2 = bVar.h(i);
        } else {
            c cVar = c.f1398d;
            h2 = this.e.h(i);
        }
        this.f1396c--;
        return h2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f1394a;
        int i = this.f1396c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.f1395b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f1397d;
        if (bVar != null) {
            bVar.i(i, i2);
        } else {
            c cVar = c.f1398d;
            this.e.i(i, i2);
        }
        this.f1396c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f1396c; i++) {
            if (j1.h.a(this.f1394a[this.f1395b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f1396c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z2) {
        int j;
        b bVar = this.f1397d;
        if (bVar != null) {
            j = bVar.j(i, i2, collection, z2);
        } else {
            c cVar = c.f1398d;
            j = this.e.j(i, i2, collection, z2);
        }
        if (j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1396c -= j;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f1396c - 1; i >= 0; i--) {
            if (j1.h.a(this.f1394a[this.f1395b + i], obj)) {
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
        j1.h.e(collection, "elements");
        g();
        f();
        return j(this.f1395b, this.f1396c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j1.h.e(collection, "elements");
        g();
        f();
        return j(this.f1395b, this.f1396c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.f1396c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f1394a;
        int i3 = this.f1395b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC0058a.j(i, i2, this.f1396c);
        return new b(this.f1394a, this.f1395b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j1.h.e(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.f1396c;
        int i2 = this.f1395b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1394a, i2, i + i2, objArr.getClass());
            j1.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        j.n0(this.f1394a, objArr, 0, i2, i + i2);
        int i3 = this.f1396c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return l.b(this.f1394a, this.f1395b, this.f1396c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.f1396c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.f1396c;
        if (i >= 0 && i <= i2) {
            e(this.f1395b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        j1.h.e(collection, "elements");
        g();
        f();
        int i2 = this.f1396c;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(this.f1395b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f1394a;
        int i = this.f1396c;
        int i2 = this.f1395b;
        int i3 = i + i2;
        j1.h.e(objArr, "<this>");
        H1.d.q(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        j1.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }
}
