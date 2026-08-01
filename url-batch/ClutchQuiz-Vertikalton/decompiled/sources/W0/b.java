package W0;

import X.V;
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
public final class b extends V0.a implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f899b;

    /* renamed from: c, reason: collision with root package name */
    public int f900c;
    public final b d;

    /* renamed from: e, reason: collision with root package name */
    public final c f901e;

    public b(Object[] objArr, int i, int i2, b bVar, c cVar) {
        int i3;
        g1.f.e(objArr, "backing");
        g1.f.e(cVar, "root");
        this.f898a = objArr;
        this.f899b = i;
        this.f900c = i2;
        this.d = bVar;
        this.f901e = cVar;
        i3 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // V0.a
    public final int a() {
        f();
        return this.f900c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f899b + this.f900c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g1.f.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f899b + this.f900c, collection, size);
        return size > 0;
    }

    @Override // V0.a
    public final Object b(int i) {
        g();
        f();
        int i2 = this.f900c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(V.d(i, i2, "index: ", ", size: "));
        }
        return h(this.f899b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f899b, this.f900c);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        c cVar = this.f901e;
        b bVar = this.d;
        if (bVar != null) {
            bVar.d(i, collection, i2);
        } else {
            c cVar2 = c.d;
            cVar.d(i, collection, i2);
        }
        this.f898a = cVar.f902a;
        this.f900c += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f901e;
        b bVar = this.d;
        if (bVar != null) {
            bVar.e(i, obj);
        } else {
            c cVar2 = c.d;
            cVar.e(i, obj);
        }
        this.f898a = cVar.f902a;
        this.f900c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                if (T.d.e(this.f898a, this.f899b, this.f900c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.f901e).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f901e.f904c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.f900c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(V.d(i, i2, "index: ", ", size: "));
        }
        return this.f898a[this.f899b + i];
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        b bVar = this.d;
        if (bVar != null) {
            h = bVar.h(i);
        } else {
            c cVar = c.d;
            h = this.f901e.h(i);
        }
        this.f900c--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f898a;
        int i = this.f900c;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.f899b + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.i(i, i2);
        } else {
            c cVar = c.d;
            this.f901e.i(i, i2);
        }
        this.f900c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f900c; i++) {
            if (g1.f.a(this.f898a[this.f899b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f900c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z2) {
        int j2;
        b bVar = this.d;
        if (bVar != null) {
            j2 = bVar.j(i, i2, collection, z2);
        } else {
            c cVar = c.d;
            j2 = this.f901e.j(i, i2, collection, z2);
        }
        if (j2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f900c -= j2;
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f900c - 1; i >= 0; i--) {
            if (g1.f.a(this.f898a[this.f899b + i], obj)) {
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
        g1.f.e(collection, "elements");
        g();
        f();
        return j(this.f899b, this.f900c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        g1.f.e(collection, "elements");
        g();
        f();
        return j(this.f899b, this.f900c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.f900c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(V.d(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.f898a;
        int i3 = this.f899b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        T.d.j(i, i2, this.f900c);
        return new b(this.f898a, this.f899b + i, i2 - i, this, this.f901e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        g1.f.e(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.f900c;
        int i2 = this.f899b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f898a, i2, i + i2, objArr.getClass());
            g1.f.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        V0.d.S(this.f898a, objArr, 0, i2, i + i2);
        int i3 = this.f900c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return T.d.f(this.f898a, this.f899b, this.f900c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.f900c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(V.d(i, i2, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.f900c;
        if (i >= 0 && i <= i2) {
            e(this.f899b + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(V.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        g1.f.e(collection, "elements");
        g();
        f();
        int i2 = this.f900c;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(this.f899b + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(V.d(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f898a;
        int i = this.f900c;
        int i2 = this.f899b;
        return V0.d.T(objArr, i2, i + i2);
    }
}
