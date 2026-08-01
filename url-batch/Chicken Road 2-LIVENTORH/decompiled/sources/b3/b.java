package b3;

import a.y;
import androidx.fragment.app.w0;
import f3.d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends a3.a implements RandomAccess, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f731f;

    /* renamed from: g, reason: collision with root package name */
    public final int f732g;

    /* renamed from: h, reason: collision with root package name */
    public int f733h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final c f734j;

    public b(Object[] objArr, int i, int i4, b bVar, c cVar) {
        int i5;
        d.e(objArr, "backing");
        d.e(cVar, "root");
        this.f731f = objArr;
        this.f732g = i;
        this.f733h = i4;
        this.i = bVar;
        this.f734j = cVar;
        i5 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // a3.a
    public final int a() {
        f();
        return this.f733h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f732g + this.f733h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f732g + this.f733h, collection, size);
        return size > 0;
    }

    @Override // a3.a
    public final Object b(int i) {
        g();
        f();
        int i4 = this.f733h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i, ", size: ", i4));
        }
        return h(this.f732g + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f732g, this.f733h);
    }

    public final void d(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        c cVar = this.f734j;
        b bVar = this.i;
        if (bVar != null) {
            bVar.d(i, collection, i4);
        } else {
            c cVar2 = c.i;
            cVar.d(i, collection, i4);
        }
        this.f731f = cVar.f735f;
        this.f733h += i4;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f734j;
        b bVar = this.i;
        if (bVar != null) {
            bVar.e(i, obj);
        } else {
            c cVar2 = c.i;
            cVar.e(i, obj);
        }
        this.f731f = cVar.f735f;
        this.f733h++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f731f;
            int i = this.f733h;
            if (i == list.size()) {
                for (int i4 = 0; i4 < i; i4++) {
                    if (d.a(objArr[this.f732g + i4], list.get(i4))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.f734j).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f734j.f737h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i4 = this.f733h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i, ", size: ", i4));
        }
        return this.f731f[this.f732g + i];
    }

    public final Object h(int i) {
        Object h4;
        ((AbstractList) this).modCount++;
        b bVar = this.i;
        if (bVar != null) {
            h4 = bVar.h(i);
        } else {
            c cVar = c.i;
            h4 = this.f734j.h(i);
        }
        this.f733h--;
        return h4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f731f;
        int i = this.f733h;
        int i4 = 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[this.f732g + i5];
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
            this.f734j.i(i, i4);
        }
        this.f733h -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.f733h; i++) {
            if (d.a(this.f731f[this.f732g + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f733h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i4, Collection collection, boolean z3) {
        int j4;
        b bVar = this.i;
        if (bVar != null) {
            j4 = bVar.j(i, i4, collection, z3);
        } else {
            c cVar = c.i;
            j4 = this.f734j.j(i, i4, collection, z3);
        }
        if (j4 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f733h -= j4;
        return j4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.f733h - 1; i >= 0; i--) {
            if (d.a(this.f731f[this.f732g + i], obj)) {
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
        d.e(collection, "elements");
        g();
        f();
        return j(this.f732g, this.f733h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        d.e(collection, "elements");
        g();
        f();
        return j(this.f732g, this.f733h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i4 = this.f733h;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i, ", size: ", i4));
        }
        Object[] objArr = this.f731f;
        int i5 = this.f732g;
        Object obj2 = objArr[i5 + i];
        objArr[i5 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        y.h(i, i4, this.f733h);
        return new b(this.f731f, this.f732g + i, i4 - i, this, this.f734j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        d.e(objArr, "array");
        f();
        int length = objArr.length;
        int i = this.f733h;
        int i4 = this.f732g;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f731f, i4, i + i4, objArr.getClass());
            d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        a3.d.X(this.f731f, objArr, 0, i4, i + i4);
        int i5 = this.f733h;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return y.f(this.f731f, this.f732g, this.f733h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i4 = this.f733h;
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i, ", size: ", i4));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i4 = this.f733h;
        if (i >= 0 && i <= i4) {
            e(this.f732g + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(w0.e("index: ", i, ", size: ", i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d.e(collection, "elements");
        g();
        f();
        int i4 = this.f733h;
        if (i >= 0 && i <= i4) {
            int size = collection.size();
            d(this.f732g + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(w0.e("index: ", i, ", size: ", i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f731f;
        int i = this.f733h;
        int i4 = this.f732g;
        return a3.d.Z(objArr, i4, i + i4);
    }
}
