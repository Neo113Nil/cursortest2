package d6;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends g {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f2319g = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f2320d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2321e;

    /* renamed from: f, reason: collision with root package name */
    public int f2322f;

    public k() {
        this.f2321e = f2319g;
    }

    @Override // d6.g
    public final int a() {
        return this.f2322f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i8;
        int i9 = this.f2322f;
        if (i < 0 || i > i9) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", i9));
        }
        if (i == i9) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        l();
        e(this.f2322f + 1);
        int k3 = k(this.f2320d + i);
        int i10 = this.f2322f;
        if (i < ((i10 + 1) >> 1)) {
            if (k3 == 0) {
                Object[] objArr = this.f2321e;
                q6.i.e(objArr, "<this>");
                k3 = objArr.length;
            }
            int i11 = k3 - 1;
            int i12 = this.f2320d;
            if (i12 == 0) {
                Object[] objArr2 = this.f2321e;
                q6.i.e(objArr2, "<this>");
                i8 = objArr2.length - 1;
            } else {
                i8 = i12 - 1;
            }
            int i13 = this.f2320d;
            if (i11 >= i13) {
                Object[] objArr3 = this.f2321e;
                objArr3[i8] = objArr3[i13];
                l.H(objArr3, objArr3, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr4 = this.f2321e;
                l.H(objArr4, objArr4, i13 - 1, i13, objArr4.length);
                Object[] objArr5 = this.f2321e;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.H(objArr5, objArr5, 0, 1, i11 + 1);
            }
            this.f2321e[i11] = obj;
            this.f2320d = i8;
        } else {
            int k7 = k(i10 + this.f2320d);
            if (k3 < k7) {
                Object[] objArr6 = this.f2321e;
                l.H(objArr6, objArr6, k3 + 1, k3, k7);
            } else {
                Object[] objArr7 = this.f2321e;
                l.H(objArr7, objArr7, 1, 0, k7);
                Object[] objArr8 = this.f2321e;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.H(objArr8, objArr8, k3 + 1, k3, objArr8.length - 1);
            }
            this.f2321e[k3] = obj;
        }
        this.f2322f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        q6.i.e(collection, "elements");
        int i8 = this.f2322f;
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", i8));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f2322f) {
            return addAll(collection);
        }
        l();
        e(collection.size() + this.f2322f);
        int k3 = k(this.f2322f + this.f2320d);
        int k7 = k(this.f2320d + i);
        int size = collection.size();
        if (i >= ((this.f2322f + 1) >> 1)) {
            int i9 = k7 + size;
            if (k7 < k3) {
                int i10 = size + k3;
                Object[] objArr = this.f2321e;
                if (i10 <= objArr.length) {
                    l.H(objArr, objArr, i9, k7, k3);
                } else if (i9 >= objArr.length) {
                    l.H(objArr, objArr, i9 - objArr.length, k7, k3);
                } else {
                    int length = k3 - (i10 - objArr.length);
                    l.H(objArr, objArr, 0, length, k3);
                    Object[] objArr2 = this.f2321e;
                    l.H(objArr2, objArr2, i9, k7, length);
                }
            } else {
                Object[] objArr3 = this.f2321e;
                l.H(objArr3, objArr3, size, 0, k3);
                Object[] objArr4 = this.f2321e;
                if (i9 >= objArr4.length) {
                    l.H(objArr4, objArr4, i9 - objArr4.length, k7, objArr4.length);
                } else {
                    l.H(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f2321e;
                    l.H(objArr5, objArr5, i9, k7, objArr5.length - size);
                }
            }
            c(k7, collection);
            return true;
        }
        int i11 = this.f2320d;
        int i12 = i11 - size;
        if (k7 < i11) {
            Object[] objArr6 = this.f2321e;
            l.H(objArr6, objArr6, i12, i11, objArr6.length);
            if (size >= k7) {
                Object[] objArr7 = this.f2321e;
                l.H(objArr7, objArr7, objArr7.length - size, 0, k7);
            } else {
                Object[] objArr8 = this.f2321e;
                l.H(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f2321e;
                l.H(objArr9, objArr9, 0, size, k7);
            }
        } else if (i12 >= 0) {
            Object[] objArr10 = this.f2321e;
            l.H(objArr10, objArr10, i12, i11, k7);
        } else {
            Object[] objArr11 = this.f2321e;
            i12 += objArr11.length;
            int i13 = k7 - i11;
            int length2 = objArr11.length - i12;
            if (length2 >= i13) {
                l.H(objArr11, objArr11, i12, i11, k7);
            } else {
                l.H(objArr11, objArr11, i12, i11, i11 + length2);
                Object[] objArr12 = this.f2321e;
                l.H(objArr12, objArr12, 0, this.f2320d + length2, k7);
            }
        }
        this.f2320d = i12;
        c(i(k7 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        e(this.f2322f + 1);
        int i = this.f2320d;
        if (i == 0) {
            Object[] objArr = this.f2321e;
            q6.i.e(objArr, "<this>");
            i = objArr.length;
        }
        int i8 = i - 1;
        this.f2320d = i8;
        this.f2321e[i8] = obj;
        this.f2322f++;
    }

    public final void addLast(Object obj) {
        l();
        e(a() + 1);
        this.f2321e[k(a() + this.f2320d)] = obj;
        this.f2322f = a() + 1;
    }

    @Override // d6.g
    public final Object b(int i) {
        int i8 = this.f2322f;
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", i8));
        }
        if (i == s6.a.t(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        l();
        int k3 = k(this.f2320d + i);
        Object[] objArr = this.f2321e;
        Object obj = objArr[k3];
        if (i < (this.f2322f >> 1)) {
            int i9 = this.f2320d;
            if (k3 >= i9) {
                l.H(objArr, objArr, i9 + 1, i9, k3);
            } else {
                l.H(objArr, objArr, 1, 0, k3);
                Object[] objArr2 = this.f2321e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f2320d;
                l.H(objArr2, objArr2, i10 + 1, i10, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2321e;
            int i11 = this.f2320d;
            objArr3[i11] = null;
            this.f2320d = g(i11);
        } else {
            int k7 = k(s6.a.t(this) + this.f2320d);
            if (k3 <= k7) {
                Object[] objArr4 = this.f2321e;
                l.H(objArr4, objArr4, k3, k3 + 1, k7 + 1);
            } else {
                Object[] objArr5 = this.f2321e;
                l.H(objArr5, objArr5, k3, k3 + 1, objArr5.length);
                Object[] objArr6 = this.f2321e;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.H(objArr6, objArr6, 0, 1, k7 + 1);
            }
            this.f2321e[k7] = null;
        }
        this.f2322f--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2321e.length;
        while (i < length && it.hasNext()) {
            this.f2321e[i] = it.next();
            i++;
        }
        int i8 = this.f2320d;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f2321e[i9] = it.next();
        }
        this.f2322f = collection.size() + this.f2322f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.f2320d, k(a() + this.f2320d));
        }
        this.f2320d = 0;
        this.f2322f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2321e;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f2319g) {
            if (i < 10) {
                i = 10;
            }
            this.f2321e = new Object[i];
            return;
        }
        int length = objArr.length;
        int i8 = length + (length >> 1);
        if (i8 - i < 0) {
            i8 = i;
        }
        if (i8 - 2147483639 > 0) {
            i8 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i8];
        l.H(objArr, objArr2, 0, this.f2320d, objArr.length);
        Object[] objArr3 = this.f2321e;
        int length2 = objArr3.length;
        int i9 = this.f2320d;
        l.H(objArr3, objArr2, length2 - i9, 0, i9);
        this.f2320d = 0;
        this.f2321e = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.f2321e[this.f2320d];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2321e[this.f2320d];
    }

    public final int g(int i) {
        q6.i.e(this.f2321e, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a8 = a();
        if (i < 0 || i >= a8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", a8));
        }
        return this.f2321e[k(this.f2320d + i)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.f2321e[k(s6.a.t(this) + this.f2320d)];
    }

    public final int i(int i) {
        return i < 0 ? i + this.f2321e.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int k3 = k(a() + this.f2320d);
        int i8 = this.f2320d;
        if (i8 < k3) {
            while (i8 < k3) {
                if (q6.i.a(obj, this.f2321e[i8])) {
                    i = this.f2320d;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 < k3) {
            return -1;
        }
        int length = this.f2321e.length;
        while (true) {
            if (i8 >= length) {
                for (int i9 = 0; i9 < k3; i9++) {
                    if (q6.i.a(obj, this.f2321e[i9])) {
                        i8 = i9 + this.f2321e.length;
                        i = this.f2320d;
                    }
                }
                return -1;
            }
            if (q6.i.a(obj, this.f2321e[i8])) {
                i = this.f2320d;
                break;
            }
            i8++;
        }
        return i8 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i, int i8) {
        if (i < i8) {
            l.L(this.f2321e, i, i8);
            return;
        }
        Object[] objArr = this.f2321e;
        l.L(objArr, i, objArr.length);
        l.L(this.f2321e, 0, i8);
    }

    public final int k(int i) {
        Object[] objArr = this.f2321e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2321e[k(s6.a.t(this) + this.f2320d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int k3 = k(this.f2322f + this.f2320d);
        int i8 = this.f2320d;
        if (i8 < k3) {
            length = k3 - 1;
            if (i8 <= length) {
                while (!q6.i.a(obj, this.f2321e[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i = this.f2320d;
                return length - i;
            }
            return -1;
        }
        if (i8 > k3) {
            int i9 = k3 - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f2321e;
                    q6.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f2320d;
                    if (i10 <= length) {
                        while (!q6.i.a(obj, this.f2321e[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i = this.f2320d;
                    }
                } else {
                    if (q6.i.a(obj, this.f2321e[i9])) {
                        length = i9 + this.f2321e.length;
                        i = this.f2320d;
                        break;
                    }
                    i9--;
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
        int k3;
        q6.i.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f2321e.length != 0) {
            int k7 = k(this.f2322f + this.f2320d);
            int i = this.f2320d;
            if (i < k7) {
                k3 = i;
                while (i < k7) {
                    Object obj = this.f2321e[i];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f2321e[k3] = obj;
                        k3++;
                    }
                    i++;
                }
                l.L(this.f2321e, k3, k7);
            } else {
                int length = this.f2321e.length;
                boolean z7 = false;
                int i8 = i;
                while (i < length) {
                    Object[] objArr = this.f2321e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f2321e[i8] = obj2;
                        i8++;
                    }
                    i++;
                }
                k3 = k(i8);
                for (int i9 = 0; i9 < k7; i9++) {
                    Object[] objArr2 = this.f2321e;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f2321e[k3] = obj3;
                        k3 = g(k3);
                    }
                }
                z3 = z7;
            }
            if (z3) {
                l();
                this.f2322f = i(k3 - this.f2320d);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        Object[] objArr = this.f2321e;
        int i = this.f2320d;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2320d = g(i);
        this.f2322f = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        int k3 = k(s6.a.t(this) + this.f2320d);
        Object[] objArr = this.f2321e;
        Object obj = objArr[k3];
        objArr[k3] = null;
        this.f2322f = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i8) {
        s6.a.j(i, i8, this.f2322f);
        int i9 = i8 - i;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f2322f) {
            clear();
            return;
        }
        if (i9 == 1) {
            b(i);
            return;
        }
        l();
        if (i < this.f2322f - i8) {
            int k3 = k(this.f2320d + (i - 1));
            int k7 = k(this.f2320d + (i8 - 1));
            while (i > 0) {
                int i10 = k3 + 1;
                int min = Math.min(i, Math.min(i10, k7 + 1));
                Object[] objArr = this.f2321e;
                int i11 = k7 - min;
                int i12 = k3 - min;
                l.H(objArr, objArr, i11 + 1, i12 + 1, i10);
                k3 = i(i12);
                k7 = i(i11);
                i -= min;
            }
            int k8 = k(this.f2320d + i9);
            j(this.f2320d, k8);
            this.f2320d = k8;
        } else {
            int k9 = k(this.f2320d + i8);
            int k10 = k(this.f2320d + i);
            int i13 = this.f2322f;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2321e;
                i8 = Math.min(i13, Math.min(objArr2.length - k9, objArr2.length - k10));
                Object[] objArr3 = this.f2321e;
                int i14 = k9 + i8;
                l.H(objArr3, objArr3, k10, k9, i14);
                k9 = k(i14);
                k10 = k(k10 + i8);
            }
            int k11 = k(this.f2322f + this.f2320d);
            j(i(k11 - i9), k11);
        }
        this.f2322f -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int k3;
        q6.i.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f2321e.length != 0) {
            int k7 = k(this.f2322f + this.f2320d);
            int i = this.f2320d;
            if (i < k7) {
                k3 = i;
                while (i < k7) {
                    Object obj = this.f2321e[i];
                    if (collection.contains(obj)) {
                        this.f2321e[k3] = obj;
                        k3++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                l.L(this.f2321e, k3, k7);
            } else {
                int length = this.f2321e.length;
                boolean z7 = false;
                int i8 = i;
                while (i < length) {
                    Object[] objArr = this.f2321e;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f2321e[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i++;
                }
                k3 = k(i8);
                for (int i9 = 0; i9 < k7; i9++) {
                    Object[] objArr2 = this.f2321e;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f2321e[k3] = obj3;
                        k3 = g(k3);
                    } else {
                        z7 = true;
                    }
                }
                z3 = z7;
            }
            if (z3) {
                l();
                this.f2322f = i(k3 - this.f2320d);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a8 = a();
        if (i < 0 || i >= a8) {
            throw new IndexOutOfBoundsException(a0.q.i("index: ", i, ", size: ", a8));
        }
        int k3 = k(this.f2320d + i);
        Object[] objArr = this.f2321e;
        Object obj2 = objArr[k3];
        objArr[k3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f2319g;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(a0.q.h("Illegal Capacity: ", i));
        }
        this.f2321e = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        q6.i.e(objArr, "array");
        int length = objArr.length;
        int i = this.f2322f;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            q6.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int k3 = k(this.f2322f + this.f2320d);
        int i8 = this.f2320d;
        if (i8 < k3) {
            l.J(this.f2321e, objArr, i8, k3, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2321e;
            l.H(objArr2, objArr, 0, this.f2320d, objArr2.length);
            Object[] objArr3 = this.f2321e;
            l.H(objArr3, objArr, objArr3.length - this.f2320d, 0, k3);
        }
        int i9 = this.f2322f;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        q6.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        l();
        e(collection.size() + a());
        c(k(a() + this.f2320d), collection);
        return true;
    }
}
