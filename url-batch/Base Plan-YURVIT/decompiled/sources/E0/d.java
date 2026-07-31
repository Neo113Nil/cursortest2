package E0;

import a.AbstractC0086a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f212h = new Object[0];

    /* renamed from: e, reason: collision with root package name */
    public int f213e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f214f = f212h;

    /* renamed from: g, reason: collision with root package name */
    public int f215g;

    @Override // E0.a
    public final int a() {
        return this.f215g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f215g;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i4));
        }
        if (i2 == i4) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f215g + 1);
        int h2 = h(this.f213e + i2);
        int i5 = this.f215g;
        if (i2 < ((i5 + 1) >> 1)) {
            if (h2 == 0) {
                Object[] objArr = this.f214f;
                P0.h.e(objArr, "<this>");
                h2 = objArr.length;
            }
            int i6 = h2 - 1;
            int i7 = this.f213e;
            if (i7 == 0) {
                Object[] objArr2 = this.f214f;
                P0.h.e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i7 - 1;
            }
            int i8 = this.f213e;
            if (i6 >= i8) {
                Object[] objArr3 = this.f214f;
                objArr3[i3] = objArr3[i8];
                e.O(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.f214f;
                e.O(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.f214f;
                objArr5[objArr5.length - 1] = objArr5[0];
                e.O(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f214f[i6] = obj;
            this.f213e = i3;
        } else {
            int h3 = h(i5 + this.f213e);
            if (h2 < h3) {
                Object[] objArr6 = this.f214f;
                e.O(objArr6, objArr6, h2 + 1, h2, h3);
            } else {
                Object[] objArr7 = this.f214f;
                e.O(objArr7, objArr7, 1, 0, h3);
                Object[] objArr8 = this.f214f;
                objArr8[0] = objArr8[objArr8.length - 1];
                e.O(objArr8, objArr8, h2 + 1, h2, objArr8.length - 1);
            }
            this.f214f[h2] = obj;
        }
        this.f215g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        P0.h.e(collection, "elements");
        int i3 = this.f215g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.f215g) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f215g);
        int h2 = h(this.f215g + this.f213e);
        int h3 = h(this.f213e + i2);
        int size = collection.size();
        if (i2 >= ((this.f215g + 1) >> 1)) {
            int i4 = h3 + size;
            if (h3 < h2) {
                int i5 = size + h2;
                Object[] objArr = this.f214f;
                if (i5 <= objArr.length) {
                    e.O(objArr, objArr, i4, h3, h2);
                } else if (i4 >= objArr.length) {
                    e.O(objArr, objArr, i4 - objArr.length, h3, h2);
                } else {
                    int length = h2 - (i5 - objArr.length);
                    e.O(objArr, objArr, 0, length, h2);
                    Object[] objArr2 = this.f214f;
                    e.O(objArr2, objArr2, i4, h3, length);
                }
            } else {
                Object[] objArr3 = this.f214f;
                e.O(objArr3, objArr3, size, 0, h2);
                Object[] objArr4 = this.f214f;
                if (i4 >= objArr4.length) {
                    e.O(objArr4, objArr4, i4 - objArr4.length, h3, objArr4.length);
                } else {
                    e.O(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f214f;
                    e.O(objArr5, objArr5, i4, h3, objArr5.length - size);
                }
            }
            c(h3, collection);
            return true;
        }
        int i6 = this.f213e;
        int i7 = i6 - size;
        if (h3 < i6) {
            Object[] objArr6 = this.f214f;
            e.O(objArr6, objArr6, i7, i6, objArr6.length);
            if (size >= h3) {
                Object[] objArr7 = this.f214f;
                e.O(objArr7, objArr7, objArr7.length - size, 0, h3);
            } else {
                Object[] objArr8 = this.f214f;
                e.O(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f214f;
                e.O(objArr9, objArr9, 0, size, h3);
            }
        } else if (i7 >= 0) {
            Object[] objArr10 = this.f214f;
            e.O(objArr10, objArr10, i7, i6, h3);
        } else {
            Object[] objArr11 = this.f214f;
            i7 += objArr11.length;
            int i8 = h3 - i6;
            int length2 = objArr11.length - i7;
            if (length2 >= i8) {
                e.O(objArr11, objArr11, i7, i6, h3);
            } else {
                e.O(objArr11, objArr11, i7, i6, i6 + length2);
                Object[] objArr12 = this.f214f;
                e.O(objArr12, objArr12, 0, this.f213e + length2, h3);
            }
        }
        this.f213e = i7;
        c(f(h3 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f215g + 1);
        int i2 = this.f213e;
        if (i2 == 0) {
            Object[] objArr = this.f214f;
            P0.h.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f213e = i3;
        this.f214f[i3] = obj;
        this.f215g++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f214f[h(a() + this.f213e)] = obj;
        this.f215g = a() + 1;
    }

    @Override // E0.a
    public final Object b(int i2) {
        int i3 = this.f215g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", i3));
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        i();
        int h2 = h(this.f213e + i2);
        Object[] objArr = this.f214f;
        Object obj = objArr[h2];
        if (i2 < (this.f215g >> 1)) {
            int i4 = this.f213e;
            if (h2 >= i4) {
                e.O(objArr, objArr, i4 + 1, i4, h2);
            } else {
                e.O(objArr, objArr, 1, 0, h2);
                Object[] objArr2 = this.f214f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f213e;
                e.O(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f214f;
            int i6 = this.f213e;
            objArr3[i6] = null;
            this.f213e = e(i6);
        } else {
            int h3 = h((size() - 1) + this.f213e);
            if (h2 <= h3) {
                Object[] objArr4 = this.f214f;
                e.O(objArr4, objArr4, h2, h2 + 1, h3 + 1);
            } else {
                Object[] objArr5 = this.f214f;
                e.O(objArr5, objArr5, h2, h2 + 1, objArr5.length);
                Object[] objArr6 = this.f214f;
                objArr6[objArr6.length - 1] = objArr6[0];
                e.O(objArr6, objArr6, 0, 1, h3 + 1);
            }
            this.f214f[h3] = null;
        }
        this.f215g--;
        return obj;
    }

    public final void c(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f214f.length;
        while (i2 < length && it.hasNext()) {
            this.f214f[i2] = it.next();
            i2++;
        }
        int i3 = this.f213e;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f214f[i4] = it.next();
        }
        this.f215g = collection.size() + this.f215g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f213e, h(a() + this.f213e));
        }
        this.f213e = 0;
        this.f215g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f214f;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f212h) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f214f = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        e.O(objArr, objArr2, 0, this.f213e, objArr.length);
        Object[] objArr3 = this.f214f;
        int length2 = objArr3.length;
        int i4 = this.f213e;
        e.O(objArr3, objArr2, length2 - i4, 0, i4);
        this.f213e = 0;
        this.f214f = objArr2;
    }

    public final int e(int i2) {
        P0.h.e(this.f214f, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final int f(int i2) {
        return i2 < 0 ? i2 + this.f214f.length : i2;
    }

    public final void g(int i2, int i3) {
        if (i2 < i3) {
            Object[] objArr = this.f214f;
            P0.h.e(objArr, "<this>");
            Arrays.fill(objArr, i2, i3, (Object) null);
        } else {
            Object[] objArr2 = this.f214f;
            Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
            Object[] objArr3 = this.f214f;
            P0.h.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i3, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int a2 = a();
        if (i2 < 0 || i2 >= a2) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", a2));
        }
        return this.f214f[h(this.f213e + i2)];
    }

    public final int h(int i2) {
        Object[] objArr = this.f214f;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int h2 = h(a() + this.f213e);
        int i3 = this.f213e;
        if (i3 < h2) {
            while (i3 < h2) {
                if (P0.h.a(obj, this.f214f[i3])) {
                    i2 = this.f213e;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < h2) {
            return -1;
        }
        int length = this.f214f.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < h2; i4++) {
                    if (P0.h.a(obj, this.f214f[i4])) {
                        i3 = i4 + this.f214f.length;
                        i2 = this.f213e;
                    }
                }
                return -1;
            }
            if (P0.h.a(obj, this.f214f[i3])) {
                i2 = this.f213e;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int h2 = h(this.f215g + this.f213e);
        int i3 = this.f213e;
        if (i3 < h2) {
            length = h2 - 1;
            if (i3 <= length) {
                while (!P0.h.a(obj, this.f214f[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f213e;
                return length - i2;
            }
            return -1;
        }
        if (i3 > h2) {
            int i4 = h2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f214f;
                    P0.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f213e;
                    if (i5 <= length) {
                        while (!P0.h.a(obj, this.f214f[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f213e;
                    }
                } else {
                    if (P0.h.a(obj, this.f214f[i4])) {
                        length = i4 + this.f214f.length;
                        i2 = this.f213e;
                        break;
                    }
                    i4--;
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
        P0.h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f214f.length != 0) {
            int h3 = h(this.f215g + this.f213e);
            int i2 = this.f213e;
            if (i2 < h3) {
                h2 = i2;
                while (i2 < h3) {
                    Object obj = this.f214f[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f214f[h2] = obj;
                        h2++;
                    }
                    i2++;
                }
                Object[] objArr = this.f214f;
                P0.h.e(objArr, "<this>");
                Arrays.fill(objArr, h2, h3, (Object) null);
            } else {
                int length = this.f214f.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f214f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f214f[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                h2 = h(i3);
                for (int i4 = 0; i4 < h3; i4++) {
                    Object[] objArr3 = this.f214f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f214f[h2] = obj3;
                        h2 = e(h2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f215g = f(h2 - this.f213e);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f214f;
        int i2 = this.f213e;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f213e = e(i2);
        this.f215g = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h2 = h((size() - 1) + this.f213e);
        Object[] objArr = this.f214f;
        Object obj = objArr[h2];
        objArr[h2] = null;
        this.f215g--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        AbstractC0086a.f(i2, i3, this.f215g);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.f215g) {
            clear();
            return;
        }
        if (i4 == 1) {
            b(i2);
            return;
        }
        i();
        if (i2 < this.f215g - i3) {
            int h2 = h(this.f213e + (i2 - 1));
            int h3 = h(this.f213e + (i3 - 1));
            while (i2 > 0) {
                int i5 = h2 + 1;
                int min = Math.min(i2, Math.min(i5, h3 + 1));
                Object[] objArr = this.f214f;
                int i6 = h3 - min;
                int i7 = h2 - min;
                e.O(objArr, objArr, i6 + 1, i7 + 1, i5);
                h2 = f(i7);
                h3 = f(i6);
                i2 -= min;
            }
            int h4 = h(this.f213e + i4);
            g(this.f213e, h4);
            this.f213e = h4;
        } else {
            int h5 = h(this.f213e + i3);
            int h6 = h(this.f213e + i2);
            int i8 = this.f215g;
            while (true) {
                i8 -= i3;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f214f;
                i3 = Math.min(i8, Math.min(objArr2.length - h5, objArr2.length - h6));
                Object[] objArr3 = this.f214f;
                int i9 = h5 + i3;
                e.O(objArr3, objArr3, h6, h5, i9);
                h5 = h(i9);
                h6 = h(h6 + i3);
            }
            int h7 = h(this.f215g + this.f213e);
            g(f(h7 - i4), h7);
        }
        this.f215g -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h2;
        P0.h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f214f.length != 0) {
            int h3 = h(this.f215g + this.f213e);
            int i2 = this.f213e;
            if (i2 < h3) {
                h2 = i2;
                while (i2 < h3) {
                    Object obj = this.f214f[i2];
                    if (collection.contains(obj)) {
                        this.f214f[h2] = obj;
                        h2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f214f;
                P0.h.e(objArr, "<this>");
                Arrays.fill(objArr, h2, h3, (Object) null);
            } else {
                int length = this.f214f.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f214f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f214f[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                h2 = h(i3);
                for (int i4 = 0; i4 < h3; i4++) {
                    Object[] objArr3 = this.f214f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f214f[h2] = obj3;
                        h2 = e(h2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f215g = f(h2 - this.f213e);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int a2 = a();
        if (i2 < 0 || i2 >= a2) {
            throw new IndexOutOfBoundsException(L.d.f("index: ", i2, ", size: ", a2));
        }
        int h2 = h(this.f213e + i2);
        Object[] objArr = this.f214f;
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
        P0.h.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f215g;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            P0.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int h2 = h(this.f215g + this.f213e);
        int i3 = this.f213e;
        if (i3 < h2) {
            e.O(this.f214f, objArr, 0, i3, h2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f214f;
            e.O(objArr2, objArr, 0, this.f213e, objArr2.length);
            Object[] objArr3 = this.f214f;
            e.O(objArr3, objArr, objArr3.length - this.f213e, 0, h2);
        }
        int i4 = this.f215g;
        if (i4 < objArr.length) {
            objArr[i4] = null;
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
        P0.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.f213e), collection);
        return true;
    }
}
