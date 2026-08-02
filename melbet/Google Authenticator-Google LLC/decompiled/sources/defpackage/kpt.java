package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpt extends kpf implements List, RandomAccess, Serializable {
    public static final kpt a;
    public Object[] b;
    public int c;
    public boolean d;

    static {
        kpt kptVar = new kpt(0);
        kptVar.d = true;
        a = kptVar;
    }

    public kpt(int i) {
        this.b = ixd.h(i);
    }

    private final void j(int i, int i2) {
        int i3 = this.c + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i3 > length) {
            objArr = ixd.i(objArr, ixc.W(length, i3));
            this.b = objArr;
        }
        ixc.O(objArr, objArr, i + i2, i, this.c);
        this.c += i2;
    }

    private final void k() {
        this.modCount++;
    }

    private final Object writeReplace() {
        if (this.d) {
            return new kqb(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.kpf
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        ixc.U(i, this.c);
        g(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        ixc.U(i, this.c);
        int size = collection.size();
        f(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.kpf
    public final Object b(int i) {
        h();
        ixc.T(i, this.c);
        return e(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        i(0, this.c);
    }

    public final int d(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.b;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(objArr[i6]) == z) {
                Object[] objArr2 = this.b;
                objArr2[i + i4] = objArr2[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        ixc.O(objArr, objArr, i + i4, i + i2, this.c);
        Object[] objArr3 = this.b;
        int i8 = this.c;
        ixd.f(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            k();
        }
        this.c -= i7;
        return i7;
    }

    public final Object e(int i) {
        k();
        Object[] objArr = this.b;
        Object obj = objArr[i];
        ixc.O(objArr, objArr, i, i + 1, this.c);
        ixd.e(this.b, this.c - 1);
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ixd.g(this.b, 0, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        k();
        j(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i + i3] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        k();
        j(i, 1);
        this.b[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ixc.T(i, this.c);
        return this.b[i];
    }

    public final void h() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return ixd.c(this.b, 0, this.c);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            k();
        }
        Object[] objArr = this.b;
        ixc.O(objArr, objArr, i, i + i2, this.c);
        Object[] objArr2 = this.b;
        int i3 = this.c;
        ixd.f(objArr2, i3 - i2, i3);
        this.c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.c; i++) {
            if (ksp.b(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (ksp.b(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ixc.U(i, this.c);
        return new kps(this, i, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
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
        return d(0, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        return d(0, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        ixc.T(i, this.c);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ixc.V(i, i2, this.c);
        return new kpr(this.b, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.b;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ixc.O(objArr2, objArr, 0, 0, i);
        ixc.A(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ixd.d(this.b, 0, this.c, this);
    }

    public kpt() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g(this.c, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        f(this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ixc.F(this.b, 0, this.c);
    }
}
