package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: r, reason: collision with root package name */
    public static final r f5579r = new r(null);

    /* renamed from: s, reason: collision with root package name */
    public static final Object[] f5580s = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f5581d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f5582e;

    /* renamed from: i, reason: collision with root package name */
    public int f5583i;

    public s(int i3) {
        Object[] objArr;
        if (i3 == 0) {
            objArr = f5580s;
        } else {
            if (i3 <= 0) {
                a1.e(v4.a.j(i3, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i3];
        }
        this.f5582e = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        c cVar = f.f5563d;
        int i11 = this.f5583i;
        cVar.getClass();
        c.b(i3, i11);
        if (i3 == this.f5583i) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        o();
        f(this.f5583i + 1);
        int n10 = n(this.f5581d + i3);
        int i12 = this.f5583i;
        if (i3 < ((i12 + 1) >> 1)) {
            if (n10 == 0) {
                Object[] objArr = this.f5582e;
                objArr.getClass();
                i10 = objArr.length - 1;
            } else {
                i10 = n10 - 1;
            }
            int i13 = this.f5581d;
            if (i13 == 0) {
                Object[] objArr2 = this.f5582e;
                objArr2.getClass();
                i13 = objArr2.length;
            }
            int i14 = i13 - 1;
            int i15 = this.f5581d;
            Object[] objArr3 = this.f5582e;
            if (i10 >= i15) {
                objArr3[i14] = objArr3[i15];
                v.d(i15, i15 + 1, i10 + 1, objArr3, objArr3);
            } else {
                v.d(i15 - 1, i15, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.f5582e;
                objArr4[objArr4.length - 1] = objArr4[0];
                v.d(0, 1, i10 + 1, objArr4, objArr4);
            }
            this.f5582e[i10] = obj;
            this.f5581d = i14;
        } else {
            int n11 = n(i12 + this.f5581d);
            Object[] objArr5 = this.f5582e;
            if (n10 < n11) {
                v.d(n10 + 1, n10, n11, objArr5, objArr5);
            } else {
                v.d(1, 0, n11, objArr5, objArr5);
                Object[] objArr6 = this.f5582e;
                objArr6[0] = objArr6[objArr6.length - 1];
                v.d(n10 + 1, n10, objArr6.length - 1, objArr6, objArr6);
            }
            this.f5582e[n10] = obj;
        }
        this.f5583i++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        collection.getClass();
        c cVar = f.f5563d;
        int i10 = this.f5583i;
        cVar.getClass();
        c.b(i3, i10);
        if (collection.isEmpty()) {
            return false;
        }
        if (i3 == this.f5583i) {
            return addAll(collection);
        }
        o();
        f(collection.size() + this.f5583i);
        int n10 = n(this.f5583i + this.f5581d);
        int n11 = n(this.f5581d + i3);
        int size = collection.size();
        if (i3 >= ((this.f5583i + 1) >> 1)) {
            int i11 = n11 + size;
            Object[] objArr = this.f5582e;
            if (n11 < n10) {
                int i12 = size + n10;
                if (i12 <= objArr.length) {
                    v.d(i11, n11, n10, objArr, objArr);
                } else if (i11 >= objArr.length) {
                    v.d(i11 - objArr.length, n11, n10, objArr, objArr);
                } else {
                    int length = n10 - (i12 - objArr.length);
                    v.d(0, length, n10, objArr, objArr);
                    Object[] objArr2 = this.f5582e;
                    v.d(i11, n11, length, objArr2, objArr2);
                }
            } else {
                v.d(size, 0, n10, objArr, objArr);
                Object[] objArr3 = this.f5582e;
                if (i11 >= objArr3.length) {
                    v.d(i11 - objArr3.length, n11, objArr3.length, objArr3, objArr3);
                } else {
                    v.d(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f5582e;
                    v.d(i11, n11, objArr4.length - size, objArr4, objArr4);
                }
            }
            e(n11, collection);
            return true;
        }
        int i13 = this.f5581d;
        int i14 = i13 - size;
        Object[] objArr5 = this.f5582e;
        if (n11 < i13) {
            v.d(i14, i13, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f5582e;
            if (size >= n11) {
                v.d(objArr6.length - size, 0, n11, objArr6, objArr6);
            } else {
                v.d(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f5582e;
                v.d(0, size, n11, objArr7, objArr7);
            }
        } else if (i14 >= 0) {
            v.d(i14, i13, n11, objArr5, objArr5);
        } else {
            i14 += objArr5.length;
            int i15 = n11 - i13;
            int length2 = objArr5.length - i14;
            if (length2 >= i15) {
                v.d(i14, i13, n11, objArr5, objArr5);
            } else {
                v.d(i14, i13, i13 + length2, objArr5, objArr5);
                Object[] objArr8 = this.f5582e;
                v.d(0, this.f5581d + length2, n11, objArr8, objArr8);
            }
        }
        this.f5581d = i14;
        e(k(n11 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        f(this.f5583i + 1);
        int i3 = this.f5581d;
        if (i3 == 0) {
            Object[] objArr = this.f5582e;
            objArr.getClass();
            i3 = objArr.length;
        }
        int i10 = i3 - 1;
        this.f5581d = i10;
        this.f5582e[i10] = obj;
        this.f5583i++;
    }

    public final void addLast(Object obj) {
        o();
        f(b() + 1);
        this.f5582e[n(b() + this.f5581d)] = obj;
        this.f5583i = b() + 1;
    }

    @Override // kotlin.collections.l
    public final int b() {
        return this.f5583i;
    }

    @Override // kotlin.collections.l
    public final Object c(int i3) {
        c cVar = f.f5563d;
        int i10 = this.f5583i;
        cVar.getClass();
        c.a(i3, i10);
        if (i3 == b() - 1) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        o();
        int n10 = n(this.f5581d + i3);
        Object[] objArr = this.f5582e;
        Object obj = objArr[n10];
        int i11 = this.f5583i >> 1;
        int i12 = this.f5581d;
        if (i3 < i11) {
            if (n10 >= i12) {
                v.d(i12 + 1, i12, n10, objArr, objArr);
            } else {
                v.d(1, 0, n10, objArr, objArr);
                Object[] objArr2 = this.f5582e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f5581d;
                v.d(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f5582e;
            int i14 = this.f5581d;
            objArr3[i14] = null;
            this.f5581d = h(i14);
        } else {
            int n11 = n((b() - 1) + i12);
            Object[] objArr4 = this.f5582e;
            if (n10 <= n11) {
                v.d(n10, n10 + 1, n11 + 1, objArr4, objArr4);
            } else {
                v.d(n10, n10 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f5582e;
                objArr5[objArr5.length - 1] = objArr5[0];
                v.d(0, 1, n11 + 1, objArr5, objArr5);
            }
            this.f5582e[n11] = null;
        }
        this.f5583i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.f5581d, n(b() + this.f5581d));
        }
        this.f5581d = 0;
        this.f5583i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f5582e.length;
        while (i3 < length && it.hasNext()) {
            this.f5582e[i3] = it.next();
            i3++;
        }
        int i10 = this.f5581d;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f5582e[i11] = it.next();
        }
        this.f5583i = collection.size() + this.f5583i;
    }

    public final void f(int i3) {
        if (i3 < 0) {
            i0.l("Deque is too big.");
            return;
        }
        Object[] objArr = this.f5582e;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f5580s) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f5582e = new Object[i3];
            return;
        }
        c cVar = f.f5563d;
        int length = objArr.length;
        cVar.getClass();
        Object[] objArr2 = new Object[c.d(length, i3)];
        Object[] objArr3 = this.f5582e;
        v.d(0, this.f5581d, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f5582e;
        int length2 = objArr4.length;
        int i10 = this.f5581d;
        v.d(length2 - i10, 0, i10, objArr4, objArr2);
        this.f5581d = 0;
        this.f5582e = objArr2;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f5582e[this.f5581d];
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f5582e[this.f5581d];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c cVar = f.f5563d;
        int i10 = this.f5583i;
        cVar.getClass();
        c.a(i3, i10);
        return this.f5582e[n(this.f5581d + i3)];
    }

    public final int h(int i3) {
        this.f5582e.getClass();
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.f5582e[n((size() - 1) + this.f5581d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int n10 = n(b() + this.f5581d);
        int i10 = this.f5581d;
        if (i10 < n10) {
            while (i10 < n10) {
                if (Intrinsics.a(obj, this.f5582e[i10])) {
                    i3 = this.f5581d;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i10 = this.f5581d) < n10) {
            return -1;
        }
        int length = this.f5582e.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < n10; i11++) {
                    if (Intrinsics.a(obj, this.f5582e[i11])) {
                        i10 = i11 + this.f5582e.length;
                        i3 = this.f5581d;
                    }
                }
                return -1;
            }
            if (Intrinsics.a(obj, this.f5582e[i10])) {
                i3 = this.f5581d;
                break;
            }
            i10++;
        }
        return i10 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final int k(int i3) {
        return i3 < 0 ? i3 + this.f5582e.length : i3;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f5582e[n((size() - 1) + this.f5581d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int n10 = n(this.f5583i + this.f5581d);
        int i10 = this.f5581d;
        if (i10 < n10) {
            length = n10 - 1;
            if (i10 <= length) {
                while (!Intrinsics.a(obj, this.f5582e[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i3 = this.f5581d;
                return length - i3;
            }
            return -1;
        }
        if (!isEmpty() && this.f5581d >= n10) {
            while (true) {
                n10--;
                Object[] objArr = this.f5582e;
                if (-1 >= n10) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i11 = this.f5581d;
                    if (i11 <= length) {
                        while (!Intrinsics.a(obj, this.f5582e[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i3 = this.f5581d;
                    }
                } else if (Intrinsics.a(obj, objArr[n10])) {
                    length = n10 + this.f5582e.length;
                    i3 = this.f5581d;
                    break;
                }
            }
            return length - i3;
        }
        return -1;
    }

    public final void m(int i3, int i10) {
        Object[] objArr = this.f5582e;
        if (i3 < i10) {
            v.i(objArr, i3, i10);
        } else {
            Arrays.fill(objArr, i3, objArr.length, (Object) null);
            v.i(this.f5582e, 0, i10);
        }
    }

    public final int n(int i3) {
        Object[] objArr = this.f5582e;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int n10;
        Object[] objArr;
        collection.getClass();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f5582e.length != 0) {
            int n11 = n(this.f5583i + this.f5581d);
            int i3 = this.f5581d;
            if (i3 < n11) {
                n10 = i3;
                while (true) {
                    objArr = this.f5582e;
                    if (i3 >= n11) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f5582e[n10] = obj;
                        n10++;
                    }
                    i3++;
                }
                v.i(objArr, n10, n11);
            } else {
                int length = this.f5582e.length;
                boolean z11 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f5582e;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f5582e[i10] = obj2;
                        i10++;
                    }
                    i3++;
                }
                n10 = n(i10);
                for (int i11 = 0; i11 < n11; i11++) {
                    Object[] objArr3 = this.f5582e;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f5582e[n10] = obj3;
                        n10 = h(n10);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                o();
                this.f5583i = k(n10 - this.f5581d);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.f5582e;
        int i3 = this.f5581d;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f5581d = h(i3);
        this.f5583i = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int n10 = n((size() - 1) + this.f5581d);
        Object[] objArr = this.f5582e;
        Object obj = objArr[n10];
        objArr[n10] = null;
        this.f5583i = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        c cVar = f.f5563d;
        int i11 = this.f5583i;
        cVar.getClass();
        c.c(i3, i10, i11);
        int i12 = i10 - i3;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f5583i) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i3);
            return;
        }
        o();
        int i13 = this.f5583i - i10;
        int i14 = this.f5581d;
        if (i3 < i13) {
            int n10 = n((i3 - 1) + i14);
            int n11 = n(this.f5581d + (i10 - 1));
            while (i3 > 0) {
                int i15 = n10 + 1;
                int min = Math.min(i3, Math.min(i15, n11 + 1));
                Object[] objArr = this.f5582e;
                int i16 = n11 - min;
                int i17 = n10 - min;
                v.d(i16 + 1, i17 + 1, i15, objArr, objArr);
                n10 = k(i17);
                n11 = k(i16);
                i3 -= min;
            }
            int n12 = n(this.f5581d + i12);
            m(this.f5581d, n12);
            this.f5581d = n12;
        } else {
            int n13 = n(i14 + i10);
            int n14 = n(this.f5581d + i3);
            int i18 = this.f5583i;
            while (true) {
                i18 -= i10;
                if (i18 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f5582e;
                i10 = Math.min(i18, Math.min(objArr2.length - n13, objArr2.length - n14));
                Object[] objArr3 = this.f5582e;
                int i19 = n13 + i10;
                v.d(n14, n13, i19, objArr3, objArr3);
                n13 = n(i19);
                n14 = n(n14 + i10);
            }
            int n15 = n(this.f5583i + this.f5581d);
            m(k(n15 - i12), n15);
        }
        this.f5583i -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int n10;
        Object[] objArr;
        collection.getClass();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f5582e.length != 0) {
            int n11 = n(this.f5583i + this.f5581d);
            int i3 = this.f5581d;
            if (i3 < n11) {
                n10 = i3;
                while (true) {
                    objArr = this.f5582e;
                    if (i3 >= n11) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        this.f5582e[n10] = obj;
                        n10++;
                    } else {
                        z10 = true;
                    }
                    i3++;
                }
                v.i(objArr, n10, n11);
            } else {
                int length = this.f5582e.length;
                boolean z11 = false;
                int i10 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f5582e;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f5582e[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i3++;
                }
                n10 = n(i10);
                for (int i11 = 0; i11 < n11; i11++) {
                    Object[] objArr3 = this.f5582e;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        this.f5582e[n10] = obj3;
                        n10 = h(n10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                o();
                this.f5583i = k(n10 - this.f5581d);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        c cVar = f.f5563d;
        int i10 = this.f5583i;
        cVar.getClass();
        c.a(i3, i10);
        int n10 = n(this.f5581d + i3);
        Object[] objArr = this.f5582e;
        Object obj2 = objArr[n10];
        objArr[n10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i3 = this.f5583i;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int n10 = n(this.f5583i + this.f5581d);
        int i10 = this.f5581d;
        if (i10 < n10) {
            v.g(i10, n10, 2, this.f5582e, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f5582e;
            v.d(0, this.f5581d, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f5582e;
            v.d(objArr3.length - this.f5581d, 0, n10, objArr3, objArr);
        }
        int i11 = this.f5583i;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    public s() {
        this.f5582e = f5580s;
    }

    public s(t0 t0Var) {
        Object[] b10 = wd.i.b(t0Var, new Object[0]);
        this.f5582e = b10;
        this.f5583i = b10.length;
        if (b10.length == 0) {
            this.f5582e = f5580s;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
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
        o();
        f(collection.size() + b());
        e(n(b() + this.f5581d), collection);
        return true;
    }
}
