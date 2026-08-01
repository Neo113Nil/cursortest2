package Y0;

import G1.AbstractC0001b;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends e {
    public static final Object[] d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f1510a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1511b = d;

    /* renamed from: c, reason: collision with root package name */
    public int f1512c;

    @Override // Y0.e
    public final int a() {
        return this.f1512c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f1512c;
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
        d(this.f1512c + 1);
        int h = h(this.f1510a + i);
        int i4 = this.f1512c;
        if (i < ((i4 + 1) >> 1)) {
            if (h == 0) {
                Object[] objArr = this.f1511b;
                k1.e.e(objArr, "<this>");
                h = objArr.length;
            }
            int i5 = h - 1;
            int i6 = this.f1510a;
            if (i6 == 0) {
                Object[] objArr2 = this.f1511b;
                k1.e.e(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f1510a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f1511b;
                objArr3[i2] = objArr3[i7];
                i.k0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f1511b;
                i.k0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f1511b;
                objArr5[objArr5.length - 1] = objArr5[0];
                i.k0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f1511b[i5] = obj;
            this.f1510a = i2;
        } else {
            int h2 = h(i4 + this.f1510a);
            if (h < h2) {
                Object[] objArr6 = this.f1511b;
                i.k0(objArr6, objArr6, h + 1, h, h2);
            } else {
                Object[] objArr7 = this.f1511b;
                i.k0(objArr7, objArr7, 1, 0, h2);
                Object[] objArr8 = this.f1511b;
                objArr8[0] = objArr8[objArr8.length - 1];
                i.k0(objArr8, objArr8, h + 1, h, objArr8.length - 1);
            }
            this.f1511b[h] = obj;
        }
        this.f1512c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k1.e.e(collection, "elements");
        int i2 = this.f1512c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f1512c) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f1512c);
        int h = h(this.f1512c + this.f1510a);
        int h2 = h(this.f1510a + i);
        int size = collection.size();
        if (i < ((this.f1512c + 1) >> 1)) {
            int i3 = this.f1510a;
            int i4 = i3 - size;
            if (h2 < i3) {
                Object[] objArr = this.f1511b;
                i.k0(objArr, objArr, i4, i3, objArr.length);
                if (size >= h2) {
                    Object[] objArr2 = this.f1511b;
                    i.k0(objArr2, objArr2, objArr2.length - size, 0, h2);
                } else {
                    Object[] objArr3 = this.f1511b;
                    i.k0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1511b;
                    i.k0(objArr4, objArr4, 0, size, h2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f1511b;
                i.k0(objArr5, objArr5, i4, i3, h2);
            } else {
                Object[] objArr6 = this.f1511b;
                i4 += objArr6.length;
                int i5 = h2 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    i.k0(objArr6, objArr6, i4, i3, h2);
                } else {
                    i.k0(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f1511b;
                    i.k0(objArr7, objArr7, 0, this.f1510a + length, h2);
                }
            }
            this.f1510a = i4;
            c(f(h2 - size), collection);
        } else {
            int i6 = h2 + size;
            if (h2 < h) {
                int i7 = size + h;
                Object[] objArr8 = this.f1511b;
                if (i7 <= objArr8.length) {
                    i.k0(objArr8, objArr8, i6, h2, h);
                } else if (i6 >= objArr8.length) {
                    i.k0(objArr8, objArr8, i6 - objArr8.length, h2, h);
                } else {
                    int length2 = h - (i7 - objArr8.length);
                    i.k0(objArr8, objArr8, 0, length2, h);
                    Object[] objArr9 = this.f1511b;
                    i.k0(objArr9, objArr9, i6, h2, length2);
                }
            } else {
                Object[] objArr10 = this.f1511b;
                i.k0(objArr10, objArr10, size, 0, h);
                Object[] objArr11 = this.f1511b;
                if (i6 >= objArr11.length) {
                    i.k0(objArr11, objArr11, i6 - objArr11.length, h2, objArr11.length);
                } else {
                    i.k0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1511b;
                    i.k0(objArr12, objArr12, i6, h2, objArr12.length - size);
                }
            }
            c(h2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f1512c + 1);
        int i = this.f1510a;
        if (i == 0) {
            Object[] objArr = this.f1511b;
            k1.e.e(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f1510a = i2;
        this.f1511b[i2] = obj;
        this.f1512c++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f1511b[h(a() + this.f1510a)] = obj;
        this.f1512c = a() + 1;
    }

    @Override // Y0.e
    public final Object b(int i) {
        int i2 = this.f1512c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        if (i == k.y0(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int h = h(this.f1510a + i);
        Object[] objArr = this.f1511b;
        Object obj = objArr[h];
        if (i < (this.f1512c >> 1)) {
            int i3 = this.f1510a;
            if (h >= i3) {
                i.k0(objArr, objArr, i3 + 1, i3, h);
            } else {
                i.k0(objArr, objArr, 1, 0, h);
                Object[] objArr2 = this.f1511b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f1510a;
                i.k0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1511b;
            int i5 = this.f1510a;
            objArr3[i5] = null;
            this.f1510a = e(i5);
        } else {
            int h2 = h(k.y0(this) + this.f1510a);
            if (h <= h2) {
                Object[] objArr4 = this.f1511b;
                i.k0(objArr4, objArr4, h, h + 1, h2 + 1);
            } else {
                Object[] objArr5 = this.f1511b;
                i.k0(objArr5, objArr5, h, h + 1, objArr5.length);
                Object[] objArr6 = this.f1511b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.k0(objArr6, objArr6, 0, 1, h2 + 1);
            }
            this.f1511b[h2] = null;
        }
        this.f1512c--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1511b.length;
        while (i < length && it.hasNext()) {
            this.f1511b[i] = it.next();
            i++;
        }
        int i2 = this.f1510a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f1511b[i3] = it.next();
        }
        this.f1512c = collection.size() + a();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f1510a, h(a() + this.f1510a));
        }
        this.f1510a = 0;
        this.f1512c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1511b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.f1511b = new Object[i];
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
        i.k0(objArr, objArr2, 0, this.f1510a, objArr.length);
        Object[] objArr3 = this.f1511b;
        int length2 = objArr3.length;
        int i3 = this.f1510a;
        i.k0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f1510a = 0;
        this.f1511b = objArr2;
    }

    public final int e(int i) {
        k1.e.e(this.f1511b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.f1511b.length : i;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            i.l0(this.f1511b, i, i2);
            return;
        }
        Object[] objArr = this.f1511b;
        i.l0(objArr, i, objArr.length);
        i.l0(this.f1511b, 0, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a2 = a();
        if (i < 0 || i >= a2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, a2, "index: ", ", size: "));
        }
        return this.f1511b[h(this.f1510a + i)];
    }

    public final int h(int i) {
        Object[] objArr = this.f1511b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int h = h(a() + this.f1510a);
        int i2 = this.f1510a;
        if (i2 < h) {
            while (i2 < h) {
                if (k1.e.a(obj, this.f1511b[i2])) {
                    i = this.f1510a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < h) {
            return -1;
        }
        int length = this.f1511b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < h; i3++) {
                    if (k1.e.a(obj, this.f1511b[i3])) {
                        i2 = i3 + this.f1511b.length;
                        i = this.f1510a;
                    }
                }
                return -1;
            }
            if (k1.e.a(obj, this.f1511b[i2])) {
                i = this.f1510a;
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
        int h = h(this.f1512c + this.f1510a);
        int i2 = this.f1510a;
        if (i2 < h) {
            length = h - 1;
            if (i2 <= length) {
                while (!k1.e.a(obj, this.f1511b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1510a;
                return length - i;
            }
            return -1;
        }
        if (i2 > h) {
            int i3 = h - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f1511b;
                    k1.e.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f1510a;
                    if (i4 <= length) {
                        while (!k1.e.a(obj, this.f1511b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f1510a;
                    }
                } else {
                    if (k1.e.a(obj, this.f1511b[i3])) {
                        length = i3 + this.f1511b.length;
                        i = this.f1510a;
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
        int h;
        k1.e.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1511b.length != 0) {
            int h2 = h(this.f1512c + this.f1510a);
            int i = this.f1510a;
            if (i < h2) {
                h = i;
                while (i < h2) {
                    Object obj = this.f1511b[i];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1511b[h] = obj;
                        h++;
                    }
                    i++;
                }
                i.l0(this.f1511b, h, h2);
            } else {
                int length = this.f1511b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1511b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1511b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                h = h(i2);
                for (int i3 = 0; i3 < h2; i3++) {
                    Object[] objArr2 = this.f1511b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1511b[h] = obj3;
                        h = e(h);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f1512c = f(h - this.f1510a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f1511b;
        int i = this.f1510a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1510a = e(i);
        this.f1512c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h = h(k.y0(this) + this.f1510a);
        Object[] objArr = this.f1511b;
        Object obj = objArr[h];
        objArr[h] = null;
        this.f1512c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        H1.d.l(i, i2, this.f1512c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f1512c) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        i();
        if (i < this.f1512c - i2) {
            int h = h((i - 1) + this.f1510a);
            int h2 = h((i2 - 1) + this.f1510a);
            while (i > 0) {
                int i4 = h + 1;
                int min = Math.min(i, Math.min(i4, h2 + 1));
                Object[] objArr = this.f1511b;
                int i5 = h2 - min;
                int i6 = h - min;
                i.k0(objArr, objArr, i5 + 1, i6 + 1, i4);
                h = f(i6);
                h2 = f(i5);
                i -= min;
            }
            int h3 = h(this.f1510a + i3);
            g(this.f1510a, h3);
            this.f1510a = h3;
        } else {
            int h4 = h(this.f1510a + i2);
            int h5 = h(this.f1510a + i);
            int i7 = this.f1512c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1511b;
                i2 = Math.min(i7, Math.min(objArr2.length - h4, objArr2.length - h5));
                Object[] objArr3 = this.f1511b;
                int i8 = h4 + i2;
                i.k0(objArr3, objArr3, h5, h4, i8);
                h4 = h(i8);
                h5 = h(h5 + i2);
            }
            int h6 = h(this.f1512c + this.f1510a);
            g(f(h6 - i3), h6);
        }
        this.f1512c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h;
        k1.e.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1511b.length != 0) {
            int h2 = h(this.f1512c + this.f1510a);
            int i = this.f1510a;
            if (i < h2) {
                h = i;
                while (i < h2) {
                    Object obj = this.f1511b[i];
                    if (collection.contains(obj)) {
                        this.f1511b[h] = obj;
                        h++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                i.l0(this.f1511b, h, h2);
            } else {
                int length = this.f1511b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f1511b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1511b[i2] = obj2;
                        i2++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                h = h(i2);
                for (int i3 = 0; i3 < h2; i3++) {
                    Object[] objArr2 = this.f1511b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1511b[h] = obj3;
                        h = e(h);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f1512c = f(h - this.f1510a);
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
        int h = h(this.f1510a + i);
        Object[] objArr = this.f1511b;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k1.e.e(objArr, "array");
        int length = objArr.length;
        int i = this.f1512c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            k1.e.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int h = h(this.f1512c + this.f1510a);
        int i2 = this.f1510a;
        if (i2 < h) {
            i.k0(this.f1511b, objArr, 0, i2, h);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1511b;
            i.k0(objArr2, objArr, 0, this.f1510a, objArr2.length);
            Object[] objArr3 = this.f1511b;
            i.k0(objArr3, objArr, objArr3.length - this.f1510a, 0, h);
        }
        int i3 = this.f1512c;
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
        k1.e.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.f1510a), collection);
        return true;
    }
}
