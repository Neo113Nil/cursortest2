package id;

import a2.r;
import b1.d0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends kotlin.collections.l implements List, RandomAccess, Serializable {

    /* renamed from: r, reason: collision with root package name */
    private static final c f4685r = new c(null);

    /* renamed from: s, reason: collision with root package name */
    public static final d f4686s;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4687d;

    /* renamed from: e, reason: collision with root package name */
    public int f4688e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4689i;

    static {
        d dVar = new d(0);
        dVar.f4689i = true;
        f4686s = dVar;
    }

    public d(int i3) {
        if (i3 >= 0) {
            this.f4687d = new Object[i3];
        } else {
            a1.e("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.b(i3, i10);
        ((AbstractList) this).modCount++;
        i(i3, 1);
        this.f4687d[i3] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        collection.getClass();
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.b(i3, i10);
        int size = collection.size();
        f(i3, collection, size);
        return size > 0;
    }

    @Override // kotlin.collections.l
    public final int b() {
        return this.f4688e;
    }

    @Override // kotlin.collections.l
    public final Object c(int i3) {
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.a(i3, i10);
        return k(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        m(0, this.f4688e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f4687d;
            int i3 = this.f4688e;
            if (i3 == list.size()) {
                for (int i10 = 0; i10 < i3; i10++) {
                    if (Intrinsics.a(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i3, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        i(i3, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f4687d[i3 + i11] = it.next();
        }
    }

    public final void g(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        i(i3, 1);
        this.f4687d[i3] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.a(i3, i10);
        return this.f4687d[i3];
    }

    public final void h() {
        if (this.f4689i) {
            r.a();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f4687d;
        int i3 = this.f4688e;
        int i10 = 1;
        for (int i11 = 0; i11 < i3; i11++) {
            Object obj = objArr[i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    public final void i(int i3, int i10) {
        int i11 = this.f4688e + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4687d;
        if (i11 > objArr.length) {
            kotlin.collections.c cVar = kotlin.collections.f.f5563d;
            int length = objArr.length;
            cVar.getClass();
            int d10 = kotlin.collections.c.d(length, i11);
            Object[] objArr2 = this.f4687d;
            objArr2.getClass();
            this.f4687d = Arrays.copyOf(objArr2, d10);
        }
        Object[] objArr3 = this.f4687d;
        v.d(i3 + i10, i3, this.f4688e, objArr3, objArr3);
        this.f4688e += i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f4688e; i3++) {
            if (Intrinsics.a(this.f4687d[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4688e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object k(int i3) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f4687d;
        Object obj = objArr[i3];
        v.d(i3, i3 + 1, this.f4688e, objArr, objArr);
        Object[] objArr2 = this.f4687d;
        int i10 = this.f4688e - 1;
        objArr2.getClass();
        objArr2[i10] = null;
        this.f4688e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f4688e - 1; i3 >= 0; i3--) {
            if (Intrinsics.a(this.f4687d[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.b(i3, i10);
        return new d0(this, i3);
    }

    public final void m(int i3, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f4687d;
        v.d(i3, i3 + i10, this.f4688e, objArr, objArr);
        Object[] objArr2 = this.f4687d;
        int i11 = this.f4688e;
        k7.e.M(objArr2, i11 - i10, i11);
        this.f4688e -= i10;
    }

    public final int n(int i3, int i10, Collection collection, boolean z10) {
        Object[] objArr;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.f4687d;
            if (i11 >= i10) {
                break;
            }
            int i13 = i3 + i11;
            if (collection.contains(objArr[i13]) == z10) {
                Object[] objArr2 = this.f4687d;
                i11++;
                objArr2[i12 + i3] = objArr2[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        v.d(i3 + i12, i10 + i3, this.f4688e, objArr, objArr);
        Object[] objArr3 = this.f4687d;
        int i15 = this.f4688e;
        k7.e.M(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4688e -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        return n(0, this.f4688e, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        return n(0, this.f4688e, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        h();
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i10 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.a(i3, i10);
        Object[] objArr = this.f4687d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i10) {
        kotlin.collections.c cVar = kotlin.collections.f.f5563d;
        int i11 = this.f4688e;
        cVar.getClass();
        kotlin.collections.c.c(i3, i10, i11);
        return new b(this.f4687d, i3, i10 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i3 = this.f4688e;
        Object[] objArr2 = this.f4687d;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i3, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        v.d(0, 0, i3, objArr2, objArr);
        int i10 = this.f4688e;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return k7.e.d(this.f4687d, 0, this.f4688e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public /* synthetic */ d(int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10 : i3);
    }

    public d() {
        this(0, 1, null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i3 = this.f4688e;
        ((AbstractList) this).modCount++;
        i(i3, 1);
        this.f4687d[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        f(this.f4688e, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return v.h(this.f4687d, 0, this.f4688e);
    }
}
