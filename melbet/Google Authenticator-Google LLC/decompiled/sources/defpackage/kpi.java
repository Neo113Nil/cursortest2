package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpi extends kpf {
    private static final Object[] b = new Object[0];
    public int a;
    private int c;
    private Object[] d = b;

    private final int c(int i) {
        return i == 0 ? ixc.I(this.d) : i - 1;
    }

    private final int d(int i) {
        if (i == ixc.I(this.d)) {
            return 0;
        }
        return i + 1;
    }

    private final int e(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int f(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == b) {
            this.d = new Object[ksl.f(i, 10)];
            return;
        }
        Object[] objArr2 = new Object[ixc.W(length, i)];
        ixc.O(objArr, objArr2, 0, this.c, length);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i2 = this.c;
        ixc.O(objArr3, objArr2, length2 - i2, 0, i2);
        this.c = 0;
        this.d = objArr2;
    }

    private final void i(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            ixc.E(objArr, null, i, i2);
        } else {
            ixc.E(objArr, null, i, objArr.length);
            ixc.E(this.d, null, 0, i2);
        }
    }

    private final void j() {
        this.modCount++;
    }

    @Override // defpackage.kpf
    public final int a() {
        return this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ixc.U(i, this.a);
        if (i == this.a) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        h(this.a + 1);
        int f = f(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int c = c(f);
            int c2 = c(this.c);
            int i3 = this.c;
            Object[] objArr = this.d;
            if (c >= i3) {
                objArr[c2] = objArr[i3];
                ixc.O(objArr, objArr, i3, i3 + 1, c + 1);
            } else {
                ixc.O(objArr, objArr, i3 - 1, i3, objArr.length);
                Object[] objArr2 = this.d;
                objArr2[objArr2.length - 1] = objArr2[0];
                ixc.O(objArr2, objArr2, 0, 1, c + 1);
            }
            this.d[c] = obj;
            this.c = c2;
        } else {
            int f2 = f(this.c + i2);
            Object[] objArr3 = this.d;
            if (f < f2) {
                ixc.O(objArr3, objArr3, f + 1, f, f2);
            } else {
                ixc.O(objArr3, objArr3, 1, 0, f2);
                Object[] objArr4 = this.d;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                ixc.O(objArr4, objArr4, f + 1, f, length);
            }
            this.d[f] = obj;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        ixc.U(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        j();
        h(this.a + collection.size());
        int f = f(this.c + this.a);
        int f2 = f(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (f2 >= i2) {
                Object[] objArr = this.d;
                if (i3 >= 0) {
                    ixc.O(objArr, objArr, i3, i2, f2);
                } else {
                    int length = objArr.length;
                    i3 += length;
                    int i4 = length - i3;
                    if (i4 >= f2 - i2) {
                        ixc.O(objArr, objArr, i3, i2, f2);
                    } else {
                        ixc.O(objArr, objArr, i3, i2, i2 + i4);
                        Object[] objArr2 = this.d;
                        ixc.O(objArr2, objArr2, 0, this.c + i4, f2);
                    }
                }
            } else {
                Object[] objArr3 = this.d;
                ixc.O(objArr3, objArr3, i3, i2, objArr3.length);
                Object[] objArr4 = this.d;
                if (size >= f2) {
                    ixc.O(objArr4, objArr4, objArr4.length - size, 0, f2);
                } else {
                    ixc.O(objArr4, objArr4, objArr4.length - size, 0, size);
                    Object[] objArr5 = this.d;
                    ixc.O(objArr5, objArr5, 0, size, f2);
                }
            }
            this.c = i3;
            g(e(f2 - size), collection);
        } else {
            int i5 = f2 + size;
            Object[] objArr6 = this.d;
            if (f2 < f) {
                int i6 = size + f;
                int length2 = objArr6.length;
                if (i6 <= length2) {
                    ixc.O(objArr6, objArr6, i5, f2, f);
                } else if (i5 >= length2) {
                    ixc.O(objArr6, objArr6, i5 - length2, f2, f);
                } else {
                    int i7 = f - (i6 - length2);
                    ixc.O(objArr6, objArr6, 0, i7, f);
                    Object[] objArr7 = this.d;
                    ixc.O(objArr7, objArr7, i5, f2, i7);
                }
            } else {
                ixc.O(objArr6, objArr6, size, 0, f);
                Object[] objArr8 = this.d;
                int length3 = objArr8.length;
                if (i5 >= length3) {
                    ixc.O(objArr8, objArr8, i5 - length3, f2, length3);
                } else {
                    ixc.O(objArr8, objArr8, 0, length3 - size, length3);
                    Object[] objArr9 = this.d;
                    ixc.O(objArr9, objArr9, i5, f2, objArr9.length - size);
                }
            }
            g(f2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        h(this.a + 1);
        int c = c(this.c);
        this.c = c;
        this.d[c] = obj;
        this.a++;
    }

    public final void addLast(Object obj) {
        j();
        h(this.a + 1);
        this.d[f(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.kpf
    public final Object b(int i) {
        ixc.T(i, this.a);
        if (i == this.a - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int f = f(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[f];
        int i2 = this.a;
        int i3 = i2 >> 1;
        int i4 = this.c;
        if (i < i3) {
            if (f >= i4) {
                ixc.O(objArr, objArr, i4 + 1, i4, f);
            } else {
                ixc.O(objArr, objArr, 1, 0, f);
                Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i5 = this.c;
                ixc.O(objArr2, objArr2, i5 + 1, i5, length);
            }
            Object[] objArr3 = this.d;
            int i6 = this.c;
            objArr3[i6] = null;
            this.c = d(i6);
        } else {
            int f2 = f(i4 + (i2 - 1));
            Object[] objArr4 = this.d;
            if (f <= f2) {
                ixc.O(objArr4, objArr4, f, f + 1, f2 + 1);
            } else {
                ixc.O(objArr4, objArr4, f, f + 1, objArr4.length);
                Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                ixc.O(objArr5, objArr5, 0, 1, f2 + 1);
            }
            this.d[f2] = null;
        }
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            i(this.c, f(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ixc.T(i, this.a);
        return this.d[f(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int f = f(this.c + this.a);
        int i2 = this.c;
        if (i2 < f) {
            while (i2 < f) {
                if (!ksp.b(obj, this.d[i2])) {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || i2 < f) {
            return -1;
        }
        int length = this.d.length;
        while (i2 < length) {
            if (!ksp.b(obj, this.d[i2])) {
                i2++;
            }
        }
        for (int i3 = 0; i3 < f; i3++) {
            if (ksp.b(obj, this.d[i3])) {
                i2 = i3 + this.d.length;
                i = this.c;
                return i2 - i;
            }
        }
        return -1;
        i = this.c;
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int I;
        int i;
        int f = f(this.c + this.a);
        int i2 = this.c;
        if (i2 < f) {
            I = f - 1;
            if (i2 <= I) {
                while (!ksp.b(obj, this.d[I])) {
                    if (I != i2) {
                        I--;
                    }
                }
                i = this.c;
            }
            return -1;
        }
        if (!isEmpty() && i2 >= f) {
            int i3 = f - 1;
            while (true) {
                Object[] objArr = this.d;
                if (i3 < 0) {
                    I = ixc.I(objArr);
                    int i4 = this.c;
                    if (i4 <= I) {
                        while (!ksp.b(obj, this.d[I])) {
                            if (I != i4) {
                                I--;
                            }
                        }
                    }
                } else {
                    if (ksp.b(obj, objArr[i3])) {
                        I = i3 + this.d.length;
                        i = this.c;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
        return I - i;
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
        int f;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int f2 = f(this.c + this.a);
        int i = this.c;
        if (i < f2) {
            f = i;
            while (true) {
                objArr = this.d;
                if (i >= f2) {
                    break;
                }
                Object obj = objArr[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[f] = obj;
                    f++;
                }
                i++;
            }
            ixc.E(objArr, null, f, f2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.d;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            f = f(i2);
            for (int i3 = 0; i3 < f2; i3++) {
                Object[] objArr3 = this.d;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[f] = obj3;
                    f = d(f);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        j();
        this.a = e(f - this.c);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = d(i);
        this.a--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int f = f(this.c + (this.a - 1));
        Object[] objArr = this.d;
        Object obj = objArr[f];
        objArr[f] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ixc.V(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                b(i);
                return;
            }
            j();
            int i4 = this.a - i2;
            int i5 = this.c;
            if (i < i4) {
                int f = f(i5 + (i - 1));
                int f2 = f(this.c + (i2 - 1));
                while (i > 0) {
                    int i6 = f + 1;
                    int min = Math.min(i, Math.min(i6, f2 + 1));
                    Object[] objArr = this.d;
                    int i7 = f2 - min;
                    int i8 = f - min;
                    ixc.O(objArr, objArr, i7 + 1, i8 + 1, i6);
                    f = e(i8);
                    f2 = e(i7);
                    i -= min;
                }
                int f3 = f(this.c + i3);
                i(this.c, f3);
                this.c = f3;
            } else {
                int f4 = f(i5 + i2);
                int f5 = f(this.c + i);
                int i9 = this.a;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = Math.min(i9, Math.min(length - f4, length - f5));
                    Object[] objArr2 = this.d;
                    int i10 = f4 + i2;
                    ixc.O(objArr2, objArr2, f5, f4, i10);
                    f4 = f(i10);
                    f5 = f(f5 + i2);
                }
                int f6 = f(this.c + this.a);
                i(e(f6 - i3), f6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int f2 = f(this.c + this.a);
        int i = this.c;
        if (i < f2) {
            f = i;
            while (true) {
                objArr = this.d;
                if (i >= f2) {
                    break;
                }
                Object obj = objArr[i];
                if (collection.contains(obj)) {
                    this.d[f] = obj;
                    f++;
                } else {
                    z = true;
                }
                i++;
            }
            ixc.E(objArr, null, f, f2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr2 = this.d;
                Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            f = f(i2);
            for (int i3 = 0; i3 < f2; i3++) {
                Object[] objArr3 = this.d;
                Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[f] = obj3;
                    f = d(f);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        j();
        this.a = e(f - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ixc.T(i, this.a);
        int f = f(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[f];
        objArr[f] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int f = f(this.c + this.a);
        int i2 = this.c;
        if (i2 < f) {
            ixc.P(this.d, objArr, i2, f, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            ixc.O(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.d;
            ixc.O(objArr3, objArr, objArr3.length - this.c, 0, f);
        }
        ixc.A(this.a, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.a]);
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
        j();
        h(this.a + collection.size());
        g(f(this.c + this.a), collection);
        return true;
    }
}
