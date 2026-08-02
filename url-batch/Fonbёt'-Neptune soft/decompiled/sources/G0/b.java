package G0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends AbstractList implements List, R0.a {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f485h = new Object[0];

    /* renamed from: e, reason: collision with root package name */
    public int f486e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f487f = f485h;

    /* renamed from: g, reason: collision with root package name */
    public int f488g;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f487f.length;
        while (i2 < length && it.hasNext()) {
            this.f487f[i2] = it.next();
            i2++;
        }
        int i3 = this.f486e;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f487f[i4] = it.next();
        }
        this.f488g = collection.size() + this.f488g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f488g;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i4);
        }
        if (i2 == i4) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        b(i4 + 1);
        int d2 = d(this.f486e + i2);
        int i5 = this.f488g;
        if (i2 < ((i5 + 1) >> 1)) {
            if (d2 == 0) {
                Object[] objArr = this.f487f;
                Q0.h.e(objArr, "<this>");
                d2 = objArr.length;
            }
            int i6 = d2 - 1;
            int i7 = this.f486e;
            if (i7 == 0) {
                Object[] objArr2 = this.f487f;
                Q0.h.e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i7 - 1;
            }
            int i8 = this.f486e;
            if (i6 >= i8) {
                Object[] objArr3 = this.f487f;
                objArr3[i3] = objArr3[i8];
                c.S(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.f487f;
                c.S(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.f487f;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.S(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f487f[i6] = obj;
            this.f486e = i3;
        } else {
            int d3 = d(this.f486e + i5);
            if (d2 < d3) {
                Object[] objArr6 = this.f487f;
                c.S(objArr6, objArr6, d2 + 1, d2, d3);
            } else {
                Object[] objArr7 = this.f487f;
                c.S(objArr7, objArr7, 1, 0, d3);
                Object[] objArr8 = this.f487f;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.S(objArr8, objArr8, d2 + 1, d2, objArr8.length - 1);
            }
            this.f487f[d2] = obj;
        }
        this.f488g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        Q0.h.e(collection, "elements");
        int i3 = this.f488g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f488g;
        if (i2 == i4) {
            return addAll(collection);
        }
        b(collection.size() + i4);
        int d2 = d(this.f486e + this.f488g);
        int d3 = d(this.f486e + i2);
        int size = collection.size();
        if (i2 < ((this.f488g + 1) >> 1)) {
            int i5 = this.f486e;
            int i6 = i5 - size;
            if (d3 < i5) {
                Object[] objArr = this.f487f;
                c.S(objArr, objArr, i6, i5, objArr.length);
                if (size >= d3) {
                    Object[] objArr2 = this.f487f;
                    c.S(objArr2, objArr2, objArr2.length - size, 0, d3);
                } else {
                    Object[] objArr3 = this.f487f;
                    c.S(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f487f;
                    c.S(objArr4, objArr4, 0, size, d3);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f487f;
                c.S(objArr5, objArr5, i6, i5, d3);
            } else {
                Object[] objArr6 = this.f487f;
                i6 += objArr6.length;
                int i7 = d3 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    c.S(objArr6, objArr6, i6, i5, d3);
                } else {
                    c.S(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f487f;
                    c.S(objArr7, objArr7, 0, this.f486e + length, d3);
                }
            }
            this.f486e = i6;
            int i8 = d3 - size;
            if (i8 < 0) {
                i8 += this.f487f.length;
            }
            a(i8, collection);
        } else {
            int i9 = d3 + size;
            if (d3 < d2) {
                int i10 = size + d2;
                Object[] objArr8 = this.f487f;
                if (i10 <= objArr8.length) {
                    c.S(objArr8, objArr8, i9, d3, d2);
                } else if (i9 >= objArr8.length) {
                    c.S(objArr8, objArr8, i9 - objArr8.length, d3, d2);
                } else {
                    int length2 = d2 - (i10 - objArr8.length);
                    c.S(objArr8, objArr8, 0, length2, d2);
                    Object[] objArr9 = this.f487f;
                    c.S(objArr9, objArr9, i9, d3, length2);
                }
            } else {
                Object[] objArr10 = this.f487f;
                c.S(objArr10, objArr10, size, 0, d2);
                Object[] objArr11 = this.f487f;
                if (i9 >= objArr11.length) {
                    c.S(objArr11, objArr11, i9 - objArr11.length, d3, objArr11.length);
                } else {
                    c.S(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f487f;
                    c.S(objArr12, objArr12, i9, d3, objArr12.length - size);
                }
            }
            a(d3, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        b(this.f488g + 1);
        int i2 = this.f486e;
        if (i2 == 0) {
            Object[] objArr = this.f487f;
            Q0.h.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f486e = i3;
        this.f487f[i3] = obj;
        this.f488g++;
    }

    public final void addLast(Object obj) {
        b(this.f488g + 1);
        this.f487f[d(this.f486e + this.f488g)] = obj;
        this.f488g++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f487f;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f485h) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f487f = new Object[i2];
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
        c.S(objArr, objArr2, 0, this.f486e, objArr.length);
        Object[] objArr3 = this.f487f;
        int length2 = objArr3.length;
        int i4 = this.f486e;
        c.S(objArr3, objArr2, length2 - i4, 0, i4);
        this.f486e = 0;
        this.f487f = objArr2;
    }

    public final int c(int i2) {
        Q0.h.e(this.f487f, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int d2 = d(this.f486e + this.f488g);
        int i2 = this.f486e;
        if (i2 < d2) {
            Object[] objArr = this.f487f;
            Q0.h.e(objArr, "<this>");
            Arrays.fill(objArr, i2, d2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f487f;
            Arrays.fill(objArr2, this.f486e, objArr2.length, (Object) null);
            Object[] objArr3 = this.f487f;
            Q0.h.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, d2, (Object) null);
        }
        this.f486e = 0;
        this.f488g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        Object[] objArr = this.f487f;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f488g;
        if (i2 >= 0 && i2 < i3) {
            return this.f487f[d(this.f486e + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int d2 = d(this.f486e + this.f488g);
        int i3 = this.f486e;
        if (i3 < d2) {
            while (i3 < d2) {
                if (Q0.h.a(obj, this.f487f[i3])) {
                    i2 = this.f486e;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < d2) {
            return -1;
        }
        int length = this.f487f.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < d2; i4++) {
                    if (Q0.h.a(obj, this.f487f[i4])) {
                        i3 = i4 + this.f487f.length;
                        i2 = this.f486e;
                    }
                }
                return -1;
            }
            if (Q0.h.a(obj, this.f487f[i3])) {
                i2 = this.f486e;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f488g == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int d2 = d(this.f486e + this.f488g);
        int i3 = this.f486e;
        if (i3 < d2) {
            length = d2 - 1;
            if (i3 <= length) {
                while (!Q0.h.a(obj, this.f487f[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f486e;
                return length - i2;
            }
            return -1;
        }
        if (i3 > d2) {
            int i4 = d2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f487f;
                    Q0.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f486e;
                    if (i5 <= length) {
                        while (!Q0.h.a(obj, this.f487f[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f486e;
                    }
                } else {
                    if (Q0.h.a(obj, this.f487f[i4])) {
                        length = i4 + this.f487f.length;
                        i2 = this.f486e;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f488g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int d2 = d(this.f486e + i2);
        Object[] objArr = this.f487f;
        Object obj = objArr[d2];
        if (i2 < (this.f488g >> 1)) {
            int i4 = this.f486e;
            if (d2 >= i4) {
                c.S(objArr, objArr, i4 + 1, i4, d2);
            } else {
                c.S(objArr, objArr, 1, 0, d2);
                Object[] objArr2 = this.f487f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f486e;
                c.S(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f487f;
            int i6 = this.f486e;
            objArr3[i6] = null;
            this.f486e = c(i6);
        } else {
            int d3 = d((size() - 1) + this.f486e);
            if (d2 <= d3) {
                Object[] objArr4 = this.f487f;
                c.S(objArr4, objArr4, d2, d2 + 1, d3 + 1);
            } else {
                Object[] objArr5 = this.f487f;
                c.S(objArr5, objArr5, d2, d2 + 1, objArr5.length);
                Object[] objArr6 = this.f487f;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.S(objArr6, objArr6, 0, 1, d3 + 1);
            }
            this.f487f[d3] = null;
        }
        this.f488g--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int d2;
        Q0.h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f487f.length != 0) {
            int d3 = d(this.f486e + this.f488g);
            int i2 = this.f486e;
            if (i2 < d3) {
                d2 = i2;
                while (i2 < d3) {
                    Object obj = this.f487f[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f487f[d2] = obj;
                        d2++;
                    }
                    i2++;
                }
                Object[] objArr = this.f487f;
                Q0.h.e(objArr, "<this>");
                Arrays.fill(objArr, d2, d3, (Object) null);
            } else {
                int length = this.f487f.length;
                int i3 = i2;
                boolean z3 = false;
                while (i2 < length) {
                    Object[] objArr2 = this.f487f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f487f[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                d2 = d(i3);
                for (int i4 = 0; i4 < d3; i4++) {
                    Object[] objArr3 = this.f487f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f487f[d2] = obj3;
                        d2 = c(d2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = d2 - this.f486e;
                if (i5 < 0) {
                    i5 += this.f487f.length;
                }
                this.f488g = i5;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f487f;
        int i2 = this.f486e;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f486e = c(i2);
        this.f488g--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int d2 = d((size() - 1) + this.f486e);
        Object[] objArr = this.f487f;
        Object obj = objArr[d2];
        objArr[d2] = null;
        this.f488g--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int d2;
        Q0.h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f487f.length != 0) {
            int d3 = d(this.f486e + this.f488g);
            int i2 = this.f486e;
            if (i2 < d3) {
                d2 = i2;
                while (i2 < d3) {
                    Object obj = this.f487f[i2];
                    if (collection.contains(obj)) {
                        this.f487f[d2] = obj;
                        d2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f487f;
                Q0.h.e(objArr, "<this>");
                Arrays.fill(objArr, d2, d3, (Object) null);
            } else {
                int length = this.f487f.length;
                int i3 = i2;
                boolean z3 = false;
                while (i2 < length) {
                    Object[] objArr2 = this.f487f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f487f[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                d2 = d(i3);
                for (int i4 = 0; i4 < d3; i4++) {
                    Object[] objArr3 = this.f487f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f487f[d2] = obj3;
                        d2 = c(d2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = d2 - this.f486e;
                if (i5 < 0) {
                    i5 += this.f487f.length;
                }
                this.f488g = i5;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f488g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int d2 = d(this.f486e + i2);
        Object[] objArr = this.f487f;
        Object obj2 = objArr[d2];
        objArr[d2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f488g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f488g]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Q0.h.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f488g;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            Q0.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int d2 = d(this.f486e + this.f488g);
        int i3 = this.f486e;
        if (i3 < d2) {
            c.S(this.f487f, objArr, 0, i3, d2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f487f;
            c.S(objArr2, objArr, 0, this.f486e, objArr2.length);
            Object[] objArr3 = this.f487f;
            c.S(objArr3, objArr, objArr3.length - this.f486e, 0, d2);
        }
        int i4 = this.f488g;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Q0.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.f488g);
        a(d(this.f486e + this.f488g), collection);
        return true;
    }
}
