package defpackage;

import defpackage.h0;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class le1 extends s0 implements List, RandomAccess, Serializable {
    public static final le1 p;
    public Object[] m;
    public int n;
    public boolean o;

    static {
        le1 le1Var = new le1(0);
        le1Var.o = true;
        p = le1Var;
    }

    public le1(int i) {
        if (i >= 0) {
            this.m = new Object[i];
        } else {
            lh.e("capacity must be non-negative.");
            throw null;
        }
    }

    private final Object writeReplace() {
        if (this.o) {
            return new ej2(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.s0
    public final int a() {
        return this.n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        h0.a aVar = h0.m;
        int i2 = this.n;
        aVar.getClass();
        h0.a.b(i, i2);
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.m[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        f();
        h0.a aVar = h0.m;
        int i2 = this.n;
        aVar.getClass();
        h0.a.b(i, i2);
        int size = collection.size();
        d(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.s0
    public final Object b(int i) {
        f();
        h0.a aVar = h0.m;
        int i2 = this.n;
        aVar.getClass();
        h0.a.a(i, i2);
        return j(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        k(0, this.n);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        g(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.m[i + i3] = it.next();
        }
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.m[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.m;
            int i = this.n;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.b(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.o) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i, int i2) {
        int i3 = this.n + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.m;
        if (i3 > objArr.length) {
            h0.a aVar = h0.m;
            int length = objArr.length;
            aVar.getClass();
            int d = h0.a.d(length, i3);
            Object[] objArr2 = this.m;
            objArr2.getClass();
            this.m = Arrays.copyOf(objArr2, d);
        }
        Object[] objArr3 = this.m;
        ni.e(i + i2, i, this.n, objArr3, objArr3);
        this.n += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h0.a aVar = h0.m;
        int i2 = this.n;
        aVar.getClass();
        h0.a.a(i, i2);
        return this.m[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.m;
        int i = this.n;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.n; i++) {
            if (Intrinsics.b(this.m[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.n == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.m;
        Object obj = objArr[i];
        ni.e(i, i + 1, this.n, objArr, objArr);
        Object[] objArr2 = this.m;
        int i2 = this.n - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.n--;
        return obj;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.m;
        ni.e(i, i + i2, this.n, objArr, objArr);
        Object[] objArr2 = this.m;
        int i3 = this.n;
        z71.O(objArr2, i3 - i2, i3);
        this.n -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.m;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.m;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        ni.e(i + i4, i2 + i, this.n, objArr, objArr);
        Object[] objArr3 = this.m;
        int i7 = this.n;
        z71.O(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.n -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.n - 1; i >= 0; i--) {
            if (Intrinsics.b(this.m[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h0.a aVar = h0.m;
        int i2 = this.n;
        aVar.getClass();
        h0.a.b(i, i2);
        return new sx0(this, i);
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
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        f();
        return l(0, this.n, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        f();
        return l(0, this.n, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        h0.a aVar = h0.m;
        int i2 = this.n;
        aVar.getClass();
        h0.a.a(i, i2);
        Object[] objArr = this.m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        h0.a aVar = h0.m;
        int i3 = this.n;
        aVar.getClass();
        h0.a.c(i, i2, i3);
        return new ke1(this.m, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.n;
        Object[] objArr2 = this.m;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ni.e(0, 0, i, objArr2, objArr);
        int i2 = this.n;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return z71.c(this.m, 0, this.n, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ le1(Object obj) {
        this(10);
    }

    public le1() {
        this((Object) null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.n;
        ((AbstractList) this).modCount++;
        g(i, 1);
        this.m[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        f();
        int size = collection.size();
        d(this.n, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ni.j(this.m, 0, this.n);
    }
}
