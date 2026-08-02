package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpr extends kpf implements List, RandomAccess, Serializable {
    public Object[] a;
    public final int b;
    public int c;
    public final kpt d;
    private final kpr e;

    public kpr(Object[] objArr, int i, int i2, kpr kprVar, kpt kptVar) {
        objArr.getClass();
        kptVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = kprVar;
        this.d = kptVar;
        this.modCount = kptVar.modCount;
    }

    private final int d(int i, int i2, Collection collection, boolean z) {
        int d;
        kpr kprVar = this.e;
        if (kprVar != null) {
            d = kprVar.d(i, i2, collection, z);
        } else {
            kpt kptVar = this.d;
            kpt kptVar2 = kpt.a;
            d = kptVar.d(i, i2, collection, z);
        }
        if (d > 0) {
            j();
        }
        this.c -= d;
        return d;
    }

    private final Object e(int i) {
        Object e;
        j();
        kpr kprVar = this.e;
        if (kprVar != null) {
            e = kprVar.e(i);
        } else {
            kpt kptVar = this.d;
            kpt kptVar2 = kpt.a;
            e = kptVar.e(i);
        }
        this.c--;
        return e;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        kpr kprVar = this.e;
        if (kprVar != null) {
            kprVar.f(i, collection, i2);
        } else {
            kpt kptVar = this.d;
            kpt kptVar2 = kpt.a;
            kptVar.f(i, collection, i2);
        }
        kpt kptVar3 = this.d;
        kpt kptVar4 = kpt.a;
        this.a = kptVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        kpr kprVar = this.e;
        if (kprVar != null) {
            kprVar.g(i, obj);
        } else {
            kpt kptVar = this.d;
            kpt kptVar2 = kpt.a;
            kptVar.g(i, obj);
        }
        kpt kptVar3 = this.d;
        kpt kptVar4 = kpt.a;
        this.a = kptVar3.b;
        this.c++;
    }

    private final void h() {
        kpt kptVar = kpt.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        kpr kprVar = this.e;
        if (kprVar != null) {
            kprVar.k(i, i2);
        } else {
            kpt kptVar = this.d;
            kpt kptVar2 = kpt.a;
            kptVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        kpt kptVar = kpt.a;
        return this.d.d;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (l()) {
            return new kqb(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.kpf
    public final int a() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        ixc.U(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        ixc.U(i, this.c);
        int i2 = this.b + i;
        int size = collection.size();
        f(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.kpf
    public final Object b(int i) {
        i();
        h();
        ixc.T(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ixd.g(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        ixc.T(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return ixd.c(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (ksp.b(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (ksp.b(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        ixc.U(i, this.c);
        return new kps(this, i, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
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
        i();
        h();
        return d(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return d(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        ixc.T(i, this.c);
        int i2 = this.b;
        Object[] objArr = this.a;
        int i3 = i2 + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ixc.V(i, i2, this.c);
        return new kpr(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        Object[] objArr2 = this.a;
        if (length >= i) {
            int i2 = this.b;
            ixc.O(objArr2, objArr, 0, i2, i + i2);
            ixc.A(this.c, objArr);
            return objArr;
        }
        int i3 = this.b;
        Object[] copyOfRange = Arrays.copyOfRange(objArr2, i3, i + i3, objArr.getClass());
        copyOfRange.getClass();
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return ixd.d(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return ixc.F(objArr, i, this.c + i);
    }
}
