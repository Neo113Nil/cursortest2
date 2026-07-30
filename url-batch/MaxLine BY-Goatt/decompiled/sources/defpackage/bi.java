package defpackage;

import defpackage.h0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bi<E> extends s0 {
    public static final a p = new a(null);
    public static final Object[] q = new Object[0];
    public int m;
    public Object[] n;
    public int o;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public bi(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = q;
        } else {
            if (i <= 0) {
                lh.e(in1.k(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.n = objArr;
    }

    @Override // defpackage.s0
    public final int a() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.b(i, i2);
        if (i == this.o) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        l();
        d(this.o + 1);
        int k = k(this.m + i);
        int i3 = this.o;
        if (i < ((i3 + 1) >> 1)) {
            int s = k == 0 ? oi.s(this.n) : k - 1;
            int i4 = this.m;
            int s2 = i4 == 0 ? oi.s(this.n) : i4 - 1;
            int i5 = this.m;
            Object[] objArr = this.n;
            if (s >= i5) {
                objArr[s2] = objArr[i5];
                ni.e(i5, i5 + 1, s + 1, objArr, objArr);
            } else {
                ni.e(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.n;
                objArr2[objArr2.length - 1] = objArr2[0];
                ni.e(0, 1, s + 1, objArr2, objArr2);
            }
            this.n[s] = obj;
            this.m = s2;
        } else {
            int k2 = k(i3 + this.m);
            Object[] objArr3 = this.n;
            if (k < k2) {
                ni.e(k + 1, k, k2, objArr3, objArr3);
            } else {
                ni.e(1, 0, k2, objArr3, objArr3);
                Object[] objArr4 = this.n;
                objArr4[0] = objArr4[objArr4.length - 1];
                ni.e(k + 1, k, objArr4.length - 1, objArr4, objArr4);
            }
            this.n[k] = obj;
        }
        this.o++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.b(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.o) {
            return addAll(collection);
        }
        l();
        d(collection.size() + this.o);
        int k = k(this.o + this.m);
        int k2 = k(this.m + i);
        int size = collection.size();
        if (i >= ((this.o + 1) >> 1)) {
            int i3 = k2 + size;
            Object[] objArr = this.n;
            if (k2 < k) {
                int i4 = size + k;
                if (i4 <= objArr.length) {
                    ni.e(i3, k2, k, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    ni.e(i3 - objArr.length, k2, k, objArr, objArr);
                } else {
                    int length = k - (i4 - objArr.length);
                    ni.e(0, length, k, objArr, objArr);
                    Object[] objArr2 = this.n;
                    ni.e(i3, k2, length, objArr2, objArr2);
                }
            } else {
                ni.e(size, 0, k, objArr, objArr);
                Object[] objArr3 = this.n;
                if (i3 >= objArr3.length) {
                    ni.e(i3 - objArr3.length, k2, objArr3.length, objArr3, objArr3);
                } else {
                    ni.e(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.n;
                    ni.e(i3, k2, objArr4.length - size, objArr4, objArr4);
                }
            }
            c(k2, collection);
            return true;
        }
        int i5 = this.m;
        int i6 = i5 - size;
        Object[] objArr5 = this.n;
        if (k2 < i5) {
            ni.e(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.n;
            if (size >= k2) {
                ni.e(objArr6.length - size, 0, k2, objArr6, objArr6);
            } else {
                ni.e(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.n;
                ni.e(0, size, k2, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            ni.e(i6, i5, k2, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = k2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                ni.e(i6, i5, k2, objArr5, objArr5);
            } else {
                ni.e(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.n;
                ni.e(0, this.m + length2, k2, objArr8, objArr8);
            }
        }
        this.m = i6;
        c(g(k2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        d(this.o + 1);
        int i = this.m;
        int s = i == 0 ? oi.s(this.n) : i - 1;
        this.m = s;
        this.n[s] = obj;
        this.o++;
    }

    public final void addLast(Object obj) {
        l();
        d(a() + 1);
        this.n[k(a() + this.m)] = obj;
        this.o = a() + 1;
    }

    @Override // defpackage.s0
    public final Object b(int i) {
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.a(i, i2);
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        l();
        int k = k(this.m + i);
        Object[] objArr = this.n;
        Object obj = objArr[k];
        int i3 = this.o >> 1;
        int i4 = this.m;
        if (i < i3) {
            if (k >= i4) {
                ni.e(i4 + 1, i4, k, objArr, objArr);
            } else {
                ni.e(1, 0, k, objArr, objArr);
                Object[] objArr2 = this.n;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.m;
                ni.e(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.n;
            int i6 = this.m;
            objArr3[i6] = null;
            this.m = e(i6);
        } else {
            int k2 = k((a() - 1) + i4);
            Object[] objArr4 = this.n;
            if (k <= k2) {
                ni.e(k, k + 1, k2 + 1, objArr4, objArr4);
            } else {
                ni.e(k, k + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.n;
                objArr5[objArr5.length - 1] = objArr5[0];
                ni.e(0, 1, k2 + 1, objArr5, objArr5);
            }
            this.n[k2] = null;
        }
        this.o--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.n.length;
        while (i < length && it.hasNext()) {
            this.n[i] = it.next();
            i++;
        }
        int i2 = this.m;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.n[i3] = it.next();
        }
        this.o = collection.size() + this.o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.m, k(a() + this.m));
        }
        this.m = 0;
        this.o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            lh.g("Deque is too big.");
            return;
        }
        Object[] objArr = this.n;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == q) {
            if (i < 10) {
                i = 10;
            }
            this.n = new Object[i];
            return;
        }
        h0.a aVar = h0.m;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[h0.a.d(length, i)];
        Object[] objArr3 = this.n;
        ni.e(0, this.m, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.n;
        int length2 = objArr4.length;
        int i2 = this.m;
        ni.e(length2 - i2, 0, i2, objArr4, objArr2);
        this.m = 0;
        this.n = objArr2;
    }

    public final int e(int i) {
        if (i == oi.s(this.n)) {
            return 0;
        }
        return i + 1;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.n[k((size() - 1) + this.m)];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.n[this.m];
        }
        ch2.k("ArrayDeque is empty.");
        return null;
    }

    public final int g(int i) {
        return i < 0 ? i + this.n.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.a(i, i2);
        return this.n[k(this.m + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int k = k(a() + this.m);
        int i2 = this.m;
        if (i2 < k) {
            while (i2 < k) {
                if (Intrinsics.b(obj, this.n[i2])) {
                    i = this.m;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < k) {
            return -1;
        }
        int length = this.n.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < k; i3++) {
                    if (Intrinsics.b(obj, this.n[i3])) {
                        i2 = i3 + this.n.length;
                        i = this.m;
                    }
                }
                return -1;
            }
            if (Intrinsics.b(obj, this.n[i2])) {
                i = this.m;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i, int i2) {
        Object[] objArr = this.n;
        if (i < i2) {
            ni.k(i, i2, null, objArr);
        } else {
            ni.k(i, objArr.length, null, objArr);
            ni.k(0, i2, null, this.n);
        }
    }

    public final int k(int i) {
        Object[] objArr = this.n;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            ch2.k("ArrayDeque is empty.");
            return null;
        }
        return this.n[k((size() - 1) + this.m)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int s;
        int i;
        int k = k(a() + this.m);
        int i2 = this.m;
        if (i2 < k) {
            s = k - 1;
            if (i2 <= s) {
                while (!Intrinsics.b(obj, this.n[s])) {
                    if (s != i2) {
                        s--;
                    }
                }
                i = this.m;
                return s - i;
            }
            return -1;
        }
        if (i2 > k) {
            while (true) {
                k--;
                Object[] objArr = this.n;
                if (-1 >= k) {
                    s = oi.s(objArr);
                    int i3 = this.m;
                    if (i3 <= s) {
                        while (!Intrinsics.b(obj, this.n[s])) {
                            if (s != i3) {
                                s--;
                            }
                        }
                        i = this.m;
                    }
                } else if (Intrinsics.b(obj, objArr[k])) {
                    s = k + this.n.length;
                    i = this.m;
                    break;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int k;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.n.length != 0) {
            int k2 = k(a() + this.m);
            int i = this.m;
            if (i < k2) {
                k = i;
                while (true) {
                    objArr = this.n;
                    if (i >= k2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.n[k] = obj;
                        k++;
                    }
                    i++;
                }
                ni.k(k, k2, null, objArr);
            } else {
                int length = this.n.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.n;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.n[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                k = k(i2);
                for (int i3 = 0; i3 < k2; i3++) {
                    Object[] objArr3 = this.n;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.n[k] = obj3;
                        k = e(k);
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.o = g(k - this.m);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            ch2.k("ArrayDeque is empty.");
            return null;
        }
        l();
        Object[] objArr = this.n;
        int i = this.m;
        Object obj = objArr[i];
        objArr[i] = null;
        this.m = e(i);
        this.o = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            ch2.k("ArrayDeque is empty.");
            return null;
        }
        l();
        int k = k((size() - 1) + this.m);
        Object[] objArr = this.n;
        Object obj = objArr[k];
        objArr[k] = null;
        this.o = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        h0.a aVar = h0.m;
        int i3 = this.o;
        aVar.getClass();
        h0.a.c(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.o) {
            clear();
            return;
        }
        if (i4 == 1) {
            b(i);
            return;
        }
        l();
        int i5 = this.o - i2;
        int i6 = this.m;
        if (i < i5) {
            int k = k((i - 1) + i6);
            int k2 = k(this.m + (i2 - 1));
            while (i > 0) {
                int i7 = k + 1;
                int min = Math.min(i, Math.min(i7, k2 + 1));
                Object[] objArr = this.n;
                int i8 = k2 - min;
                int i9 = k - min;
                ni.e(i8 + 1, i9 + 1, i7, objArr, objArr);
                k = g(i9);
                k2 = g(i8);
                i -= min;
            }
            int k3 = k(this.m + i4);
            j(this.m, k3);
            this.m = k3;
        } else {
            int k4 = k(i6 + i2);
            int k5 = k(this.m + i);
            int i10 = this.o;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.n;
                i2 = Math.min(i10, Math.min(objArr2.length - k4, objArr2.length - k5));
                Object[] objArr3 = this.n;
                int i11 = k4 + i2;
                ni.e(k5, k4, i11, objArr3, objArr3);
                k4 = k(i11);
                k5 = k(k5 + i2);
            }
            int k6 = k(this.o + this.m);
            j(g(k6 - i4), k6);
        }
        this.o -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int k;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.n.length != 0) {
            int k2 = k(a() + this.m);
            int i = this.m;
            if (i < k2) {
                k = i;
                while (true) {
                    objArr = this.n;
                    if (i >= k2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.n[k] = obj;
                        k++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ni.k(k, k2, null, objArr);
            } else {
                int length = this.n.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.n;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.n[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                k = k(i2);
                for (int i3 = 0; i3 < k2; i3++) {
                    Object[] objArr3 = this.n;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.n[k] = obj3;
                        k = e(k);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.o = g(k - this.m);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h0.a aVar = h0.m;
        int i2 = this.o;
        aVar.getClass();
        h0.a.a(i, i2);
        int k = k(this.m + i);
        Object[] objArr = this.n;
        Object obj2 = objArr[k];
        objArr[k] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.o;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int k = k(this.o + this.m);
        int i2 = this.m;
        if (i2 < k) {
            ni.i(i2, k, 2, this.n, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.n;
            ni.e(0, this.m, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.n;
            ni.e(objArr3.length - this.m, 0, k, objArr3, objArr);
        }
        int i3 = this.o;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public bi() {
        this.n = q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        l();
        d(collection.size() + a());
        c(k(a() + this.m), collection);
        return true;
    }
}
