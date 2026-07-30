package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vh0 extends f0 implements List, RandomAccess, Serializable {
    private static final uh0 h = new uh0(null);
    public static final vh0 i;
    public Object[] d;
    public int e;
    public boolean g;

    static {
        vh0 vh0Var = new vh0(0);
        vh0Var.g = true;
        i = vh0Var;
    }

    public vh0(int i2) {
        if (i2 >= 0) {
            this.d = new Object[i2];
        } else {
            dd0.e("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.f0
    public final int a() {
        return this.e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        g();
        s sVar = w.d;
        int i3 = this.e;
        sVar.getClass();
        s.b(i2, i3);
        ((AbstractList) this).modCount++;
        h(i2, 1);
        this.d[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        g();
        s sVar = w.d;
        int i3 = this.e;
        sVar.getClass();
        s.b(i2, i3);
        int size = collection.size();
        e(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.f0
    public final Object b(int i2) {
        g();
        s sVar = w.d;
        int i3 = this.e;
        sVar.getClass();
        s.a(i2, i3);
        return i(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.e);
    }

    public final void e(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        h(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.d[i2 + i4] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i2 = this.e;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (Intrinsics.a(objArr[i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        h(i2, 1);
        this.d[i2] = obj;
    }

    public final void g() {
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        s sVar = w.d;
        int i3 = this.e;
        sVar.getClass();
        s.a(i2, i3);
        return this.d[i2];
    }

    public final void h(int i2, int i3) {
        int i4 = this.e + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.d;
        if (i4 > objArr.length) {
            s sVar = w.d;
            int length = objArr.length;
            sVar.getClass();
            int d = s.d(length, i4);
            Object[] objArr2 = this.d;
            objArr2.getClass();
            this.d = Arrays.copyOf(objArr2, d);
        }
        Object[] objArr3 = this.d;
        w9.c(objArr3, objArr3, i2 + i3, i2, this.e);
        this.e += i3;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.d;
        int i2 = this.e;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final Object i(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.d;
        Object obj = objArr[i2];
        w9.c(objArr, objArr, i2, i2 + 1, this.e);
        Object[] objArr2 = this.d;
        int i3 = this.e - 1;
        objArr2.getClass();
        objArr2[i3] = null;
        this.e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.e; i2++) {
            if (Intrinsics.a(this.d[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.d;
        w9.c(objArr, objArr, i2, i2 + i3, this.e);
        Object[] objArr2 = this.d;
        int i4 = this.e;
        t90.B(objArr2, i4 - i3, i4);
        this.e -= i3;
    }

    public final int k(int i2, int i3, Collection collection, boolean z) {
        Object[] objArr;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.d;
            if (i4 >= i3) {
                break;
            }
            int i6 = i2 + i4;
            if (collection.contains(objArr[i6]) == z) {
                Object[] objArr2 = this.d;
                i4++;
                objArr2[i5 + i2] = objArr2[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        w9.c(objArr, objArr, i2 + i5, i3 + i2, this.e);
        Object[] objArr3 = this.d;
        int i8 = this.e;
        t90.B(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.e -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.e - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.d[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        s sVar = w.d;
        int i3 = this.e;
        sVar.getClass();
        s.b(i2, i3);
        return new g60(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        g();
        return k(0, this.e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        return k(0, this.e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        g();
        s sVar = w.d;
        int i3 = this.e;
        sVar.getClass();
        s.a(i2, i3);
        Object[] objArr = this.d;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        s sVar = w.d;
        int i4 = this.e;
        sVar.getClass();
        s.c(i2, i3, i4);
        return new th0(this.d, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.e;
        Object[] objArr2 = this.d;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        w9.c(objArr2, objArr, 0, 0, i2);
        int i3 = this.e;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return t90.e(this.d, 0, this.e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ vh0(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }

    public vh0() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i2 = this.e;
        ((AbstractList) this).modCount++;
        h(i2, 1);
        this.d[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        int size = collection.size();
        e(this.e, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return w9.f(this.d, 0, this.e);
    }
}
