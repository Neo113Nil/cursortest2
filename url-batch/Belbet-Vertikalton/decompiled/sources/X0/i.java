package X0;

import G1.AbstractC0001b;
import a.AbstractC0058a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f1378d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f1379a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1380b = f1378d;

    /* renamed from: c, reason: collision with root package name */
    public int f1381c;

    @Override // X0.f
    public final int a() {
        return this.f1381c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f1381c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i3, "index: ", ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f1381c + 1);
        int h2 = h(this.f1379a + i);
        int i4 = this.f1381c;
        if (i < ((i4 + 1) >> 1)) {
            if (h2 == 0) {
                Object[] objArr = this.f1380b;
                j1.h.e(objArr, "<this>");
                h2 = objArr.length;
            }
            int i5 = h2 - 1;
            int i6 = this.f1379a;
            if (i6 == 0) {
                Object[] objArr2 = this.f1380b;
                j1.h.e(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f1379a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f1380b;
                objArr3[i2] = objArr3[i7];
                j.n0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f1380b;
                j.n0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f1380b;
                objArr5[objArr5.length - 1] = objArr5[0];
                j.n0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f1380b[i5] = obj;
            this.f1379a = i2;
        } else {
            int h3 = h(i4 + this.f1379a);
            if (h2 < h3) {
                Object[] objArr6 = this.f1380b;
                j.n0(objArr6, objArr6, h2 + 1, h2, h3);
            } else {
                Object[] objArr7 = this.f1380b;
                j.n0(objArr7, objArr7, 1, 0, h3);
                Object[] objArr8 = this.f1380b;
                objArr8[0] = objArr8[objArr8.length - 1];
                j.n0(objArr8, objArr8, h2 + 1, h2, objArr8.length - 1);
            }
            this.f1380b[h2] = obj;
        }
        this.f1381c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        j1.h.e(collection, "elements");
        int i2 = this.f1381c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f1381c) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f1381c);
        int h2 = h(this.f1381c + this.f1379a);
        int h3 = h(this.f1379a + i);
        int size = collection.size();
        if (i < ((this.f1381c + 1) >> 1)) {
            int i3 = this.f1379a;
            int i4 = i3 - size;
            if (h3 < i3) {
                Object[] objArr = this.f1380b;
                j.n0(objArr, objArr, i4, i3, objArr.length);
                if (size >= h3) {
                    Object[] objArr2 = this.f1380b;
                    j.n0(objArr2, objArr2, objArr2.length - size, 0, h3);
                } else {
                    Object[] objArr3 = this.f1380b;
                    j.n0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1380b;
                    j.n0(objArr4, objArr4, 0, size, h3);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f1380b;
                j.n0(objArr5, objArr5, i4, i3, h3);
            } else {
                Object[] objArr6 = this.f1380b;
                i4 += objArr6.length;
                int i5 = h3 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    j.n0(objArr6, objArr6, i4, i3, h3);
                } else {
                    j.n0(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f1380b;
                    j.n0(objArr7, objArr7, 0, this.f1379a + length, h3);
                }
            }
            this.f1379a = i4;
            c(f(h3 - size), collection);
        } else {
            int i6 = h3 + size;
            if (h3 < h2) {
                int i7 = size + h2;
                Object[] objArr8 = this.f1380b;
                if (i7 <= objArr8.length) {
                    j.n0(objArr8, objArr8, i6, h3, h2);
                } else if (i6 >= objArr8.length) {
                    j.n0(objArr8, objArr8, i6 - objArr8.length, h3, h2);
                } else {
                    int length2 = h2 - (i7 - objArr8.length);
                    j.n0(objArr8, objArr8, 0, length2, h2);
                    Object[] objArr9 = this.f1380b;
                    j.n0(objArr9, objArr9, i6, h3, length2);
                }
            } else {
                Object[] objArr10 = this.f1380b;
                j.n0(objArr10, objArr10, size, 0, h2);
                Object[] objArr11 = this.f1380b;
                if (i6 >= objArr11.length) {
                    j.n0(objArr11, objArr11, i6 - objArr11.length, h3, objArr11.length);
                } else {
                    j.n0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1380b;
                    j.n0(objArr12, objArr12, i6, h3, objArr12.length - size);
                }
            }
            c(h3, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f1381c + 1);
        int i = this.f1379a;
        if (i == 0) {
            Object[] objArr = this.f1380b;
            j1.h.e(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f1379a = i2;
        this.f1380b[i2] = obj;
        this.f1381c++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f1380b[h(a() + this.f1379a)] = obj;
        this.f1381c = a() + 1;
    }

    @Override // X0.f
    public final Object b(int i) {
        int i2 = this.f1381c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int h2 = h(this.f1379a + i);
        Object[] objArr = this.f1380b;
        Object obj = objArr[h2];
        if (i < (this.f1381c >> 1)) {
            int i3 = this.f1379a;
            if (h2 >= i3) {
                j.n0(objArr, objArr, i3 + 1, i3, h2);
            } else {
                j.n0(objArr, objArr, 1, 0, h2);
                Object[] objArr2 = this.f1380b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f1379a;
                j.n0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1380b;
            int i5 = this.f1379a;
            objArr3[i5] = null;
            this.f1379a = e(i5);
        } else {
            int h3 = h((size() - 1) + this.f1379a);
            if (h2 <= h3) {
                Object[] objArr4 = this.f1380b;
                j.n0(objArr4, objArr4, h2, h2 + 1, h3 + 1);
            } else {
                Object[] objArr5 = this.f1380b;
                j.n0(objArr5, objArr5, h2, h2 + 1, objArr5.length);
                Object[] objArr6 = this.f1380b;
                objArr6[objArr6.length - 1] = objArr6[0];
                j.n0(objArr6, objArr6, 0, 1, h3 + 1);
            }
            this.f1380b[h3] = null;
        }
        this.f1381c--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1380b.length;
        while (i < length && it.hasNext()) {
            this.f1380b[i] = it.next();
            i++;
        }
        int i2 = this.f1379a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f1380b[i3] = it.next();
        }
        this.f1381c = collection.size() + a();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f1379a, h(a() + this.f1379a));
        }
        this.f1379a = 0;
        this.f1381c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1380b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f1378d) {
            if (i < 10) {
                i = 10;
            }
            this.f1380b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        j.n0(objArr, objArr2, 0, this.f1379a, objArr.length);
        Object[] objArr3 = this.f1380b;
        int length2 = objArr3.length;
        int i3 = this.f1379a;
        j.n0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f1379a = 0;
        this.f1380b = objArr2;
    }

    public final int e(int i) {
        j1.h.e(this.f1380b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.f1380b.length : i;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            j.o0(this.f1380b, i, i2);
            return;
        }
        Object[] objArr = this.f1380b;
        j.o0(objArr, i, objArr.length);
        j.o0(this.f1380b, 0, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a2 = a();
        if (i < 0 || i >= a2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, a2, "index: ", ", size: "));
        }
        return this.f1380b[h(this.f1379a + i)];
    }

    public final int h(int i) {
        Object[] objArr = this.f1380b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int h2 = h(a() + this.f1379a);
        int i2 = this.f1379a;
        if (i2 < h2) {
            while (i2 < h2) {
                if (j1.h.a(obj, this.f1380b[i2])) {
                    i = this.f1379a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < h2) {
            return -1;
        }
        int length = this.f1380b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < h2; i3++) {
                    if (j1.h.a(obj, this.f1380b[i3])) {
                        i2 = i3 + this.f1380b.length;
                        i = this.f1379a;
                    }
                }
                return -1;
            }
            if (j1.h.a(obj, this.f1380b[i2])) {
                i = this.f1379a;
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

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int h2 = h(this.f1381c + this.f1379a);
        int i2 = this.f1379a;
        if (i2 < h2) {
            length = h2 - 1;
            if (i2 <= length) {
                while (!j1.h.a(obj, this.f1380b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1379a;
                return length - i;
            }
            return -1;
        }
        if (i2 > h2) {
            int i3 = h2 - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f1380b;
                    j1.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f1379a;
                    if (i4 <= length) {
                        while (!j1.h.a(obj, this.f1380b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f1379a;
                    }
                } else {
                    if (j1.h.a(obj, this.f1380b[i3])) {
                        length = i3 + this.f1380b.length;
                        i = this.f1379a;
                        break;
                    }
                    i3--;
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
        int h2;
        j1.h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1380b.length != 0) {
            int h3 = h(this.f1381c + this.f1379a);
            int i = this.f1379a;
            if (i < h3) {
                h2 = i;
                while (i < h3) {
                    Object obj = this.f1380b[i];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1380b[h2] = obj;
                        h2++;
                    }
                    i++;
                }
                j.o0(this.f1380b, h2, h3);
            } else {
                int length = this.f1380b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1380b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1380b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                h2 = h(i2);
                for (int i3 = 0; i3 < h3; i3++) {
                    Object[] objArr2 = this.f1380b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1380b[h2] = obj3;
                        h2 = e(h2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f1381c = f(h2 - this.f1379a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f1380b;
        int i = this.f1379a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1379a = e(i);
        this.f1381c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h2 = h((size() - 1) + this.f1379a);
        Object[] objArr = this.f1380b;
        Object obj = objArr[h2];
        objArr[h2] = null;
        this.f1381c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC0058a.j(i, i2, this.f1381c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f1381c) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        i();
        if (i < this.f1381c - i2) {
            int h2 = h((i - 1) + this.f1379a);
            int h3 = h((i2 - 1) + this.f1379a);
            while (i > 0) {
                int i4 = h2 + 1;
                int min = Math.min(i, Math.min(i4, h3 + 1));
                Object[] objArr = this.f1380b;
                int i5 = h3 - min;
                int i6 = h2 - min;
                j.n0(objArr, objArr, i5 + 1, i6 + 1, i4);
                h2 = f(i6);
                h3 = f(i5);
                i -= min;
            }
            int h4 = h(this.f1379a + i3);
            g(this.f1379a, h4);
            this.f1379a = h4;
        } else {
            int h5 = h(this.f1379a + i2);
            int h6 = h(this.f1379a + i);
            int i7 = this.f1381c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1380b;
                i2 = Math.min(i7, Math.min(objArr2.length - h5, objArr2.length - h6));
                Object[] objArr3 = this.f1380b;
                int i8 = h5 + i2;
                j.n0(objArr3, objArr3, h6, h5, i8);
                h5 = h(i8);
                h6 = h(h6 + i2);
            }
            int h7 = h(this.f1381c + this.f1379a);
            g(f(h7 - i3), h7);
        }
        this.f1381c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h2;
        j1.h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1380b.length != 0) {
            int h3 = h(this.f1381c + this.f1379a);
            int i = this.f1379a;
            if (i < h3) {
                h2 = i;
                while (i < h3) {
                    Object obj = this.f1380b[i];
                    if (collection.contains(obj)) {
                        this.f1380b[h2] = obj;
                        h2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j.o0(this.f1380b, h2, h3);
            } else {
                int length = this.f1380b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1380b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1380b[i2] = obj2;
                        i2++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                h2 = h(i2);
                for (int i3 = 0; i3 < h3; i3++) {
                    Object[] objArr2 = this.f1380b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1380b[h2] = obj3;
                        h2 = e(h2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f1381c = f(h2 - this.f1379a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a2 = a();
        if (i < 0 || i >= a2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, a2, "index: ", ", size: "));
        }
        int h2 = h(this.f1379a + i);
        Object[] objArr = this.f1380b;
        Object obj2 = objArr[h2];
        objArr[h2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j1.h.e(objArr, "array");
        int length = objArr.length;
        int i = this.f1381c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            j1.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int h2 = h(this.f1381c + this.f1379a);
        int i2 = this.f1379a;
        if (i2 < h2) {
            j.n0(this.f1380b, objArr, 0, i2, h2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1380b;
            j.n0(objArr2, objArr, 0, this.f1379a, objArr2.length);
            Object[] objArr3 = this.f1380b;
            j.n0(objArr3, objArr, objArr3.length - this.f1379a, 0, h2);
        }
        int i3 = this.f1381c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
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
        j1.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.f1379a), collection);
        return true;
    }
}
