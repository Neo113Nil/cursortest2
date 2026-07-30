package defpackage;

import defpackage.h0;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ke1 extends s0 implements RandomAccess, Serializable {
    public Object[] m;
    public final int n;
    public int o;
    public final ke1 p;
    public final le1 q;

    public ke1(Object[] objArr, int i, int i2, ke1 ke1Var, le1 le1Var) {
        int i3;
        objArr.getClass();
        le1Var.getClass();
        this.m = objArr;
        this.n = i;
        this.o = i2;
        this.p = ke1Var;
        this.q = le1Var;
        i3 = ((AbstractList) le1Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.q.o) {
            return new ej2(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.s0
    public final int a() {
        f();
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.b(i, i2);
        e(this.n + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.b(i, i2);
        int size = collection.size();
        d(this.n + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.s0
    public final Object b(int i) {
        g();
        f();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.a(i, i2);
        return j(this.n + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        k(this.n, this.o);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        le1 le1Var = this.q;
        ke1 ke1Var = this.p;
        if (ke1Var != null) {
            ke1Var.d(i, collection, i2);
        } else {
            le1 le1Var2 = le1.p;
            le1Var.d(i, collection, i2);
        }
        this.m = le1Var.m;
        this.o += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        le1 le1Var = this.q;
        ke1 ke1Var = this.p;
        if (ke1Var != null) {
            ke1Var.e(i, obj);
        } else {
            le1 le1Var2 = le1.p;
            le1Var.e(i, obj);
        }
        this.m = le1Var.m;
        this.o++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.m;
            int i = this.o;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.b(objArr[this.n + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.q).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.q.o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.a(i, i2);
        return this.m[this.n + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.m;
        int i = this.o;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.n + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.o; i++) {
            if (Intrinsics.b(this.m[this.n + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.o == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        Object j;
        ((AbstractList) this).modCount++;
        ke1 ke1Var = this.p;
        if (ke1Var != null) {
            j = ke1Var.j(i);
        } else {
            le1 le1Var = le1.p;
            j = this.q.j(i);
        }
        this.o--;
        return j;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ke1 ke1Var = this.p;
        if (ke1Var != null) {
            ke1Var.k(i, i2);
        } else {
            le1 le1Var = le1.p;
            this.q.k(i, i2);
        }
        this.o -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int l;
        ke1 ke1Var = this.p;
        if (ke1Var != null) {
            l = ke1Var.l(i, i2, collection, z);
        } else {
            le1 le1Var = le1.p;
            l = this.q.l(i, i2, collection, z);
        }
        if (l > 0) {
            ((AbstractList) this).modCount++;
        }
        this.o -= l;
        return l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.o - 1; i >= 0; i--) {
            if (Intrinsics.b(this.m[this.n + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.b(i, i2);
        return new sx0(this, i);
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
        collection.getClass();
        g();
        f();
        return l(this.n, this.o, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return l(this.n, this.o, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.a(i, i2);
        Object[] objArr = this.m;
        int i3 = this.n + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        h0.a aVar = h0.m;
        int i3 = this.o;
        aVar.getClass();
        h0.a.c(i, i2, i3);
        return new ke1(this.m, this.n + i, i2 - i, this, this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.o;
        Object[] objArr2 = this.m;
        int i2 = this.n;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        ni.e(0, i2, i + i2, objArr2, objArr);
        int i3 = this.o;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return z71.c(this.m, this.n, this.o, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.n + this.o, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.n + this.o, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.m;
        int i = this.o;
        int i2 = this.n;
        return ni.j(objArr, i2, i + i2);
    }
}
