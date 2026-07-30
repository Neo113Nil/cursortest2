package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633l extends AbstractC0629h {

    /* renamed from: l, reason: collision with root package name */
    public static final C0632k f6134l = new C0632k(null);

    /* renamed from: m, reason: collision with root package name */
    public static final Object[] f6135m = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f6136d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f6137e = f6135m;

    /* renamed from: i, reason: collision with root package name */
    public int f6138i;

    @Override // kotlin.collections.AbstractC0629h
    public final int a() {
        return this.f6138i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        i();
        d(elements.size() + a());
        c(h(a() + this.f6136d), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f6138i + 1);
        int i2 = this.f6136d;
        if (i2 == 0) {
            Object[] objArr = this.f6137e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            i2 = objArr.length;
        }
        int i5 = i2 - 1;
        this.f6136d = i5;
        this.f6137e[i5] = obj;
        this.f6138i++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f6137e[h(a() + this.f6136d)] = obj;
        this.f6138i = a() + 1;
    }

    @Override // kotlin.collections.AbstractC0629h
    public final Object b(int i2) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f6138i;
        c0624c.getClass();
        C0624c.b(i2, i5);
        if (i2 == r.c(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        i();
        int h7 = h(this.f6136d + i2);
        Object[] objArr = this.f6137e;
        Object obj = objArr[h7];
        if (i2 < (this.f6138i >> 1)) {
            int i7 = this.f6136d;
            if (h7 >= i7) {
                o.e(objArr, objArr, i7 + 1, i7, h7);
            } else {
                o.e(objArr, objArr, 1, 0, h7);
                Object[] objArr2 = this.f6137e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i8 = this.f6136d;
                o.e(objArr2, objArr2, i8 + 1, i8, objArr2.length - 1);
            }
            Object[] objArr3 = this.f6137e;
            int i9 = this.f6136d;
            objArr3[i9] = null;
            this.f6136d = e(i9);
        } else {
            int h8 = h(r.c(this) + this.f6136d);
            if (h7 <= h8) {
                Object[] objArr4 = this.f6137e;
                o.e(objArr4, objArr4, h7, h7 + 1, h8 + 1);
            } else {
                Object[] objArr5 = this.f6137e;
                o.e(objArr5, objArr5, h7, h7 + 1, objArr5.length);
                Object[] objArr6 = this.f6137e;
                objArr6[objArr6.length - 1] = objArr6[0];
                o.e(objArr6, objArr6, 0, 1, h8 + 1);
            }
            this.f6137e[h8] = null;
        }
        this.f6138i--;
        return obj;
    }

    public final void c(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f6137e.length;
        while (i2 < length && it.hasNext()) {
            this.f6137e[i2] = it.next();
            i2++;
        }
        int i5 = this.f6136d;
        for (int i7 = 0; i7 < i5 && it.hasNext(); i7++) {
            this.f6137e[i7] = it.next();
        }
        this.f6138i = collection.size() + this.f6138i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f6136d, h(a() + this.f6136d));
        }
        this.f6136d = 0;
        this.f6138i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f6137e;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f6135m) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f6137e = new Object[i2];
            return;
        }
        C0624c c0624c = AbstractC0627f.f6131d;
        int length = objArr.length;
        c0624c.getClass();
        Object[] objArr2 = new Object[C0624c.e(length, i2)];
        Object[] objArr3 = this.f6137e;
        o.e(objArr3, objArr2, 0, this.f6136d, objArr3.length);
        Object[] objArr4 = this.f6137e;
        int length2 = objArr4.length;
        int i5 = this.f6136d;
        o.e(objArr4, objArr2, length2 - i5, 0, i5);
        this.f6136d = 0;
        this.f6137e = objArr2;
    }

    public final int e(int i2) {
        Intrinsics.checkNotNullParameter(this.f6137e, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final int f(int i2) {
        return i2 < 0 ? i2 + this.f6137e.length : i2;
    }

    public final void g(int i2, int i5) {
        if (i2 < i5) {
            o.i(this.f6137e, i2, i5);
            return;
        }
        Object[] objArr = this.f6137e;
        o.i(objArr, i2, objArr.length);
        o.i(this.f6137e, 0, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f6138i;
        c0624c.getClass();
        C0624c.b(i2, i5);
        return this.f6137e[h(this.f6136d + i2)];
    }

    public final int h(int i2) {
        Object[] objArr = this.f6137e;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int h7 = h(a() + this.f6136d);
        int i5 = this.f6136d;
        if (i5 < h7) {
            while (i5 < h7) {
                if (Intrinsics.a(obj, this.f6137e[i5])) {
                    i2 = this.f6136d;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i5 = this.f6136d) < h7) {
            return -1;
        }
        int length = this.f6137e.length;
        while (true) {
            if (i5 >= length) {
                for (int i7 = 0; i7 < h7; i7++) {
                    if (Intrinsics.a(obj, this.f6137e[i7])) {
                        i5 = i7 + this.f6137e.length;
                        i2 = this.f6136d;
                    }
                }
                return -1;
            }
            if (Intrinsics.a(obj, this.f6137e[i5])) {
                i2 = this.f6136d;
                break;
            }
            i5++;
        }
        return i5 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int h7 = h(this.f6138i + this.f6136d);
        int i5 = this.f6136d;
        if (i5 < h7) {
            length = h7 - 1;
            if (i5 <= length) {
                while (!Intrinsics.a(obj, this.f6137e[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i2 = this.f6136d;
                return length - i2;
            }
            return -1;
        }
        if (!isEmpty() && this.f6136d >= h7) {
            int i7 = h7 - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f6137e;
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    length = objArr.length - 1;
                    int i8 = this.f6136d;
                    if (i8 <= length) {
                        while (!Intrinsics.a(obj, this.f6137e[length])) {
                            if (length != i8) {
                                length--;
                            }
                        }
                        i2 = this.f6136d;
                    }
                } else {
                    if (Intrinsics.a(obj, this.f6137e[i7])) {
                        length = i7 + this.f6137e.length;
                        i2 = this.f6136d;
                        break;
                    }
                    i7--;
                }
            }
            return length - i2;
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
    public final boolean removeAll(Collection elements) {
        int h7;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f6137e.length != 0) {
            int h8 = h(this.f6138i + this.f6136d);
            int i2 = this.f6136d;
            if (i2 < h8) {
                h7 = i2;
                while (i2 < h8) {
                    Object obj = this.f6137e[i2];
                    if (elements.contains(obj)) {
                        z7 = true;
                    } else {
                        this.f6137e[h7] = obj;
                        h7++;
                    }
                    i2++;
                }
                o.i(this.f6137e, h7, h8);
            } else {
                int length = this.f6137e.length;
                boolean z8 = false;
                int i5 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f6137e;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f6137e[i5] = obj2;
                        i5++;
                    }
                    i2++;
                }
                h7 = h(i5);
                for (int i7 = 0; i7 < h8; i7++) {
                    Object[] objArr2 = this.f6137e;
                    Object obj3 = objArr2[i7];
                    objArr2[i7] = null;
                    if (elements.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f6137e[h7] = obj3;
                        h7 = e(h7);
                    }
                }
                z7 = z8;
            }
            if (z7) {
                i();
                this.f6138i = f(h7 - this.f6136d);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f6137e;
        int i2 = this.f6136d;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f6136d = e(i2);
        this.f6138i = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h7 = h(r.c(this) + this.f6136d);
        Object[] objArr = this.f6137e;
        Object obj = objArr[h7];
        objArr[h7] = null;
        this.f6138i = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i5) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i7 = this.f6138i;
        c0624c.getClass();
        C0624c.d(i2, i5, i7);
        int i8 = i5 - i2;
        if (i8 == 0) {
            return;
        }
        if (i8 == this.f6138i) {
            clear();
            return;
        }
        if (i8 == 1) {
            b(i2);
            return;
        }
        i();
        if (i2 < this.f6138i - i5) {
            int h7 = h(this.f6136d + (i2 - 1));
            int h8 = h(this.f6136d + (i5 - 1));
            while (i2 > 0) {
                int i9 = h7 + 1;
                int min = Math.min(i2, Math.min(i9, h8 + 1));
                Object[] objArr = this.f6137e;
                int i10 = h8 - min;
                int i11 = h7 - min;
                o.e(objArr, objArr, i10 + 1, i11 + 1, i9);
                h7 = f(i11);
                h8 = f(i10);
                i2 -= min;
            }
            int h9 = h(this.f6136d + i8);
            g(this.f6136d, h9);
            this.f6136d = h9;
        } else {
            int h10 = h(this.f6136d + i5);
            int h11 = h(this.f6136d + i2);
            int i12 = this.f6138i;
            while (true) {
                i12 -= i5;
                if (i12 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f6137e;
                i5 = Math.min(i12, Math.min(objArr2.length - h10, objArr2.length - h11));
                Object[] objArr3 = this.f6137e;
                int i13 = h10 + i5;
                o.e(objArr3, objArr3, h11, h10, i13);
                h10 = h(i13);
                h11 = h(h11 + i5);
            }
            int h12 = h(this.f6138i + this.f6136d);
            g(f(h12 - i8), h12);
        }
        this.f6138i -= i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int h7;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f6137e.length != 0) {
            int h8 = h(this.f6138i + this.f6136d);
            int i2 = this.f6136d;
            if (i2 < h8) {
                h7 = i2;
                while (i2 < h8) {
                    Object obj = this.f6137e[i2];
                    if (elements.contains(obj)) {
                        this.f6137e[h7] = obj;
                        h7++;
                    } else {
                        z7 = true;
                    }
                    i2++;
                }
                o.i(this.f6137e, h7, h8);
            } else {
                int length = this.f6137e.length;
                boolean z8 = false;
                int i5 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f6137e;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f6137e[i5] = obj2;
                        i5++;
                    } else {
                        z8 = true;
                    }
                    i2++;
                }
                h7 = h(i5);
                for (int i7 = 0; i7 < h8; i7++) {
                    Object[] objArr2 = this.f6137e;
                    Object obj3 = objArr2[i7];
                    objArr2[i7] = null;
                    if (elements.contains(obj3)) {
                        this.f6137e[h7] = obj3;
                        h7 = e(h7);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                i();
                this.f6138i = f(h7 - this.f6136d);
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f6138i;
        c0624c.getClass();
        C0624c.b(i2, i5);
        int h7 = h(this.f6136d + i2);
        Object[] objArr = this.f6137e;
        Object obj2 = objArr[h7];
        objArr[h7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i5;
        C0624c c0624c = AbstractC0627f.f6131d;
        int i7 = this.f6138i;
        c0624c.getClass();
        C0624c.c(i2, i7);
        if (i2 == this.f6138i) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f6138i + 1);
        int h7 = h(this.f6136d + i2);
        int i8 = this.f6138i;
        if (i2 < ((i8 + 1) >> 1)) {
            if (h7 == 0) {
                Object[] objArr = this.f6137e;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                h7 = objArr.length;
            }
            int i9 = h7 - 1;
            int i10 = this.f6136d;
            if (i10 == 0) {
                Object[] objArr2 = this.f6137e;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i10 - 1;
            }
            int i11 = this.f6136d;
            if (i9 >= i11) {
                Object[] objArr3 = this.f6137e;
                objArr3[i5] = objArr3[i11];
                o.e(objArr3, objArr3, i11, i11 + 1, i9 + 1);
            } else {
                Object[] objArr4 = this.f6137e;
                o.e(objArr4, objArr4, i11 - 1, i11, objArr4.length);
                Object[] objArr5 = this.f6137e;
                objArr5[objArr5.length - 1] = objArr5[0];
                o.e(objArr5, objArr5, 0, 1, i9 + 1);
            }
            this.f6137e[i9] = obj;
            this.f6136d = i5;
        } else {
            int h8 = h(i8 + this.f6136d);
            if (h7 < h8) {
                Object[] objArr6 = this.f6137e;
                o.e(objArr6, objArr6, h7 + 1, h7, h8);
            } else {
                Object[] objArr7 = this.f6137e;
                o.e(objArr7, objArr7, 1, 0, h8);
                Object[] objArr8 = this.f6137e;
                objArr8[0] = objArr8[objArr8.length - 1];
                o.e(objArr8, objArr8, h7 + 1, h7, objArr8.length - 1);
            }
            this.f6137e[h7] = obj;
        }
        this.f6138i++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i2 = this.f6138i;
        if (length < i2) {
            Intrinsics.checkNotNullParameter(array, "reference");
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i2);
            Intrinsics.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int h7 = h(this.f6138i + this.f6136d);
        int i5 = this.f6136d;
        if (i5 < h7) {
            o.f(this.f6137e, array, i5, h7, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f6137e;
            o.e(objArr, array, 0, this.f6136d, objArr.length);
            Object[] objArr2 = this.f6137e;
            o.e(objArr2, array, objArr2.length - this.f6136d, 0, h7);
        }
        int i7 = this.f6138i;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f6138i;
        c0624c.getClass();
        C0624c.c(i2, i5);
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.f6138i) {
            return addAll(elements);
        }
        i();
        d(elements.size() + this.f6138i);
        int h7 = h(this.f6138i + this.f6136d);
        int h8 = h(this.f6136d + i2);
        int size = elements.size();
        if (i2 < ((this.f6138i + 1) >> 1)) {
            int i7 = this.f6136d;
            int i8 = i7 - size;
            if (h8 < i7) {
                Object[] objArr = this.f6137e;
                o.e(objArr, objArr, i8, i7, objArr.length);
                if (size >= h8) {
                    Object[] objArr2 = this.f6137e;
                    o.e(objArr2, objArr2, objArr2.length - size, 0, h8);
                } else {
                    Object[] objArr3 = this.f6137e;
                    o.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f6137e;
                    o.e(objArr4, objArr4, 0, size, h8);
                }
            } else if (i8 >= 0) {
                Object[] objArr5 = this.f6137e;
                o.e(objArr5, objArr5, i8, i7, h8);
            } else {
                Object[] objArr6 = this.f6137e;
                i8 += objArr6.length;
                int i9 = h8 - i7;
                int length = objArr6.length - i8;
                if (length >= i9) {
                    o.e(objArr6, objArr6, i8, i7, h8);
                } else {
                    o.e(objArr6, objArr6, i8, i7, i7 + length);
                    Object[] objArr7 = this.f6137e;
                    o.e(objArr7, objArr7, 0, this.f6136d + length, h8);
                }
            }
            this.f6136d = i8;
            c(f(h8 - size), elements);
            return true;
        }
        int i10 = h8 + size;
        if (h8 < h7) {
            int i11 = size + h7;
            Object[] objArr8 = this.f6137e;
            if (i11 <= objArr8.length) {
                o.e(objArr8, objArr8, i10, h8, h7);
            } else if (i10 >= objArr8.length) {
                o.e(objArr8, objArr8, i10 - objArr8.length, h8, h7);
            } else {
                int length2 = h7 - (i11 - objArr8.length);
                o.e(objArr8, objArr8, 0, length2, h7);
                Object[] objArr9 = this.f6137e;
                o.e(objArr9, objArr9, i10, h8, length2);
            }
        } else {
            Object[] objArr10 = this.f6137e;
            o.e(objArr10, objArr10, size, 0, h7);
            Object[] objArr11 = this.f6137e;
            if (i10 >= objArr11.length) {
                o.e(objArr11, objArr11, i10 - objArr11.length, h8, objArr11.length);
            } else {
                o.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                Object[] objArr12 = this.f6137e;
                o.e(objArr12, objArr12, i10, h8, objArr12.length - size);
            }
        }
        c(h8, elements);
        return true;
    }
}
