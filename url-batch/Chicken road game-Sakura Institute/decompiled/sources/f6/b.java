package f6;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends e6.f implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3401f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3402g;

    /* renamed from: h, reason: collision with root package name */
    public int f3403h;

    /* renamed from: i, reason: collision with root package name */
    public final b f3404i;

    /* renamed from: j, reason: collision with root package name */
    public final c f3405j;

    public b(Object[] objArr, int i7, int i8, b bVar, c cVar) {
        int i9;
        k.f(objArr, "backing");
        k.f(cVar, "root");
        this.f3401f = objArr;
        this.f3402g = i7;
        this.f3403h = i8;
        this.f3404i = bVar;
        this.f3405j = cVar;
        i9 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i9;
    }

    public final Object A(int i7) {
        Object A;
        ((AbstractList) this).modCount++;
        b bVar = this.f3404i;
        if (bVar != null) {
            A = bVar.A(i7);
        } else {
            c cVar = c.f3406i;
            A = this.f3405j.A(i7);
        }
        this.f3403h--;
        return A;
    }

    public final void B(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f3404i;
        if (bVar != null) {
            bVar.B(i7, i8);
        } else {
            c cVar = c.f3406i;
            this.f3405j.B(i7, i8);
        }
        this.f3403h -= i8;
    }

    public final int C(int i7, int i8, Collection collection, boolean z8) {
        int C;
        b bVar = this.f3404i;
        if (bVar != null) {
            C = bVar.C(i7, i8, collection, z8);
        } else {
            c cVar = c.f3406i;
            C = this.f3405j.C(i7, i8, collection, z8);
        }
        if (C > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3403h -= C;
        return C;
    }

    @Override // e6.f
    public final int a() {
        y();
        return this.f3403h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        z();
        y();
        x(this.f3402g + this.f3403h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.f(collection, "elements");
        z();
        y();
        int size = collection.size();
        w(this.f3402g + this.f3403h, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        z();
        y();
        B(this.f3402g, this.f3403h);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        y();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f3401f;
            int i7 = this.f3403h;
            if (i7 == list.size()) {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (k.a(objArr[this.f3402g + i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // e6.f
    public final Object g(int i7) {
        z();
        y();
        int i8 = this.f3403h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return A(this.f3402g + i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        y();
        int i8 = this.f3403h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return this.f3401f[this.f3402g + i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        y();
        Object[] objArr = this.f3401f;
        int i7 = this.f3403h;
        int i8 = 1;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[this.f3402g + i9];
            i8 = (i8 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        y();
        for (int i7 = 0; i7 < this.f3403h; i7++) {
            if (k.a(this.f3401f[this.f3402g + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        y();
        return this.f3403h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        y();
        for (int i7 = this.f3403h - 1; i7 >= 0; i7--) {
            if (k.a(this.f3401f[this.f3402g + i7], obj)) {
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
        z();
        y();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        k.f(collection, "elements");
        z();
        y();
        return C(this.f3402g, this.f3403h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.f(collection, "elements");
        z();
        y();
        return C(this.f3402g, this.f3403h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        z();
        y();
        int i8 = this.f3403h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        Object[] objArr = this.f3401f;
        int i9 = this.f3402g;
        Object obj2 = objArr[i9 + i7];
        objArr[i9 + i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        j1.c.O(i7, i8, this.f3403h);
        return new b(this.f3401f, this.f3402g + i7, i8 - i7, this, this.f3405j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.f(objArr, "array");
        y();
        int length = objArr.length;
        int i7 = this.f3403h;
        int i8 = this.f3402g;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f3401f, i8, i7 + i8, objArr.getClass());
            k.e(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        e6.k.X(this.f3401f, objArr, 0, i8, i7 + i8);
        int i9 = this.f3403h;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        y();
        return r4.a.n(this.f3401f, this.f3402g, this.f3403h, this);
    }

    public final void w(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        c cVar = this.f3405j;
        b bVar = this.f3404i;
        if (bVar != null) {
            bVar.w(i7, collection, i8);
        } else {
            c cVar2 = c.f3406i;
            cVar.w(i7, collection, i8);
        }
        this.f3401f = cVar.f3407f;
        this.f3403h += i8;
    }

    public final void x(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f3405j;
        b bVar = this.f3404i;
        if (bVar != null) {
            bVar.x(i7, obj);
        } else {
            c cVar2 = c.f3406i;
            cVar.x(i7, obj);
        }
        this.f3401f = cVar.f3407f;
        this.f3403h++;
    }

    public final void y() {
        int i7;
        i7 = ((AbstractList) this.f3405j).modCount;
        if (i7 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void z() {
        if (this.f3405j.f3409h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        y();
        int i8 = this.f3403h;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        return new a(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        z();
        y();
        int i8 = this.f3403h;
        if (i7 >= 0 && i7 <= i8) {
            x(this.f3402g + i7, obj);
            return;
        }
        throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        k.f(collection, "elements");
        z();
        y();
        int i8 = this.f3403h;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            w(this.f3402g + i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        y();
        Object[] objArr = this.f3401f;
        int i7 = this.f3403h;
        int i8 = this.f3402g;
        return e6.k.b0(objArr, i8, i7 + i8);
    }
}
