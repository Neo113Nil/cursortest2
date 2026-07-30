package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class th0 extends f0 implements RandomAccess, Serializable {
    public Object[] d;
    public final int e;
    public int g;
    public final th0 h;
    public final vh0 i;

    public th0(Object[] objArr, int i, int i2, th0 th0Var, vh0 vh0Var) {
        int i3;
        objArr.getClass();
        vh0Var.getClass();
        this.d = objArr;
        this.e = i;
        this.g = i2;
        this.h = th0Var;
        this.i = vh0Var;
        i3 = ((AbstractList) vh0Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // defpackage.f0
    public final int a() {
        g();
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        s sVar = w.d;
        int i2 = this.g;
        sVar.getClass();
        s.b(i, i2);
        f(this.e + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        s sVar = w.d;
        int i2 = this.g;
        sVar.getClass();
        s.b(i, i2);
        int size = collection.size();
        e(this.e + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.f0
    public final Object b(int i) {
        h();
        g();
        s sVar = w.d;
        int i2 = this.g;
        sVar.getClass();
        s.a(i, i2);
        return i(this.e + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.e, this.g);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        vh0 vh0Var = this.i;
        th0 th0Var = this.h;
        if (th0Var != null) {
            th0Var.e(i, collection, i2);
        } else {
            vh0 vh0Var2 = vh0.i;
            vh0Var.e(i, collection, i2);
        }
        this.d = vh0Var.d;
        this.g += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.g;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.a(objArr[this.e + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        vh0 vh0Var = this.i;
        th0 th0Var = this.h;
        if (th0Var != null) {
            th0Var.f(i, obj);
        } else {
            vh0 vh0Var2 = vh0.i;
            vh0Var.f(i, obj);
        }
        this.d = vh0Var.d;
        this.g++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.i).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        s sVar = w.d;
        int i2 = this.g;
        sVar.getClass();
        s.a(i, i2);
        return this.d[this.e + i];
    }

    public final void h() {
        if (this.i.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.d;
        int i = this.g;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.e + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final Object i(int i) {
        Object i2;
        ((AbstractList) this).modCount++;
        th0 th0Var = this.h;
        if (th0Var != null) {
            i2 = th0Var.i(i);
        } else {
            vh0 vh0Var = vh0.i;
            i2 = this.i.i(i);
        }
        this.g--;
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.g; i++) {
            if (Intrinsics.a(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        th0 th0Var = this.h;
        if (th0Var != null) {
            th0Var.j(i, i2);
        } else {
            vh0 vh0Var = vh0.i;
            this.i.j(i, i2);
        }
        this.g -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int k;
        th0 th0Var = this.h;
        if (th0Var != null) {
            k = th0Var.k(i, i2, collection, z);
        } else {
            vh0 vh0Var = vh0.i;
            k = this.i.k(i, i2, collection, z);
        }
        if (k > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= k;
        return k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.g - 1; i >= 0; i--) {
            if (Intrinsics.a(this.d[this.e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        s sVar = w.d;
        int i2 = this.g;
        sVar.getClass();
        s.b(i, i2);
        return new g60(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.e, this.g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.e, this.g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        s sVar = w.d;
        int i2 = this.g;
        sVar.getClass();
        s.a(i, i2);
        Object[] objArr = this.d;
        int i3 = this.e + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        s sVar = w.d;
        int i3 = this.g;
        sVar.getClass();
        s.c(i, i2, i3);
        return new th0(this.d, this.e + i, i2 - i, this, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.g;
        Object[] objArr2 = this.d;
        int i2 = this.e;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        w9.c(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return t90.e(this.d, this.e, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.e + this.g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        e(this.e + this.g, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.d;
        int i = this.g;
        int i2 = this.e;
        return w9.f(objArr, i2, i + i2);
    }
}
