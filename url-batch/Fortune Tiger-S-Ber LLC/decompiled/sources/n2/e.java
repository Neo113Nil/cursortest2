package n2;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends AbstractList implements List, v2.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f2950i = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public int f2951f;
    public Object[] g = f2950i;
    public int h;

    public final void a(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.g.length;
        while (i4 < length && it.hasNext()) {
            this.g[i4] = it.next();
            i4++;
        }
        int i5 = this.f2951f;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.g[i6] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i6 = this.h;
        if (i4 < 0 || i4 > i6) {
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i6);
        }
        if (i4 == i6) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.h + 1);
        int f4 = f(this.f2951f + i4);
        int i7 = this.h;
        if (i4 < ((i7 + 1) >> 1)) {
            if (f4 == 0) {
                Object[] objArr = this.g;
                u2.c.e(objArr, "<this>");
                f4 = objArr.length;
            }
            int i8 = f4 - 1;
            int i9 = this.f2951f;
            if (i9 == 0) {
                Object[] objArr2 = this.g;
                u2.c.e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f2951f;
            if (i8 >= i10) {
                Object[] objArr3 = this.g;
                objArr3[i5] = objArr3[i10];
                f.D(objArr3, objArr3, i10, i10 + 1, i8 + 1);
            } else {
                Object[] objArr4 = this.g;
                f.D(objArr4, objArr4, i10 - 1, i10, objArr4.length);
                Object[] objArr5 = this.g;
                objArr5[objArr5.length - 1] = objArr5[0];
                f.D(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.g[i8] = obj;
            this.f2951f = i5;
        } else {
            int f5 = f(this.f2951f + i7);
            if (f4 < f5) {
                Object[] objArr6 = this.g;
                f.D(objArr6, objArr6, f4 + 1, f4, f5);
            } else {
                Object[] objArr7 = this.g;
                f.D(objArr7, objArr7, 1, 0, f5);
                Object[] objArr8 = this.g;
                objArr8[0] = objArr8[objArr8.length - 1];
                f.D(objArr8, objArr8, f4 + 1, f4, objArr8.length - 1);
            }
            this.g[f4] = obj;
        }
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        u2.c.e(collection, "elements");
        int i5 = this.h;
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == this.h) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.h);
        int f4 = f(this.f2951f + this.h);
        int f5 = f(this.f2951f + i4);
        int size = collection.size();
        if (i4 >= ((this.h + 1) >> 1)) {
            int i6 = f5 + size;
            if (f5 < f4) {
                int i7 = size + f4;
                Object[] objArr = this.g;
                if (i7 <= objArr.length) {
                    f.D(objArr, objArr, i6, f5, f4);
                } else if (i6 >= objArr.length) {
                    f.D(objArr, objArr, i6 - objArr.length, f5, f4);
                } else {
                    int length = f4 - (i7 - objArr.length);
                    f.D(objArr, objArr, 0, length, f4);
                    Object[] objArr2 = this.g;
                    f.D(objArr2, objArr2, i6, f5, length);
                }
            } else {
                Object[] objArr3 = this.g;
                f.D(objArr3, objArr3, size, 0, f4);
                Object[] objArr4 = this.g;
                if (i6 >= objArr4.length) {
                    f.D(objArr4, objArr4, i6 - objArr4.length, f5, objArr4.length);
                } else {
                    f.D(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.g;
                    f.D(objArr5, objArr5, i6, f5, objArr5.length - size);
                }
            }
            a(f5, collection);
            return true;
        }
        int i8 = this.f2951f;
        int i9 = i8 - size;
        if (f5 < i8) {
            Object[] objArr6 = this.g;
            f.D(objArr6, objArr6, i9, i8, objArr6.length);
            if (size >= f5) {
                Object[] objArr7 = this.g;
                f.D(objArr7, objArr7, objArr7.length - size, 0, f5);
            } else {
                Object[] objArr8 = this.g;
                f.D(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.g;
                f.D(objArr9, objArr9, 0, size, f5);
            }
        } else if (i9 >= 0) {
            Object[] objArr10 = this.g;
            f.D(objArr10, objArr10, i9, i8, f5);
        } else {
            Object[] objArr11 = this.g;
            i9 += objArr11.length;
            int i10 = f5 - i8;
            int length2 = objArr11.length - i9;
            if (length2 >= i10) {
                f.D(objArr11, objArr11, i9, i8, f5);
            } else {
                f.D(objArr11, objArr11, i9, i8, i8 + length2);
                Object[] objArr12 = this.g;
                f.D(objArr12, objArr12, 0, this.f2951f + length2, f5);
            }
        }
        this.f2951f = i9;
        a(d(f5 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.h + 1);
        int i4 = this.f2951f;
        if (i4 == 0) {
            Object[] objArr = this.g;
            u2.c.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f2951f = i5;
        this.g[i5] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.h + 1);
        this.g[f(this.f2951f + this.h)] = obj;
        this.h++;
    }

    public final void b(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.g;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f2950i) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.g = new Object[i4];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i4 < 0) {
            i5 = i4;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        f.D(objArr, objArr2, 0, this.f2951f, objArr.length);
        Object[] objArr3 = this.g;
        int length2 = objArr3.length;
        int i6 = this.f2951f;
        f.D(objArr3, objArr2, length2 - i6, 0, i6);
        this.f2951f = 0;
        this.g = objArr2;
    }

    public final int c(int i4) {
        u2.c.e(this.g, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f2951f, f(this.f2951f + this.h));
        }
        this.f2951f = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        return i4 < 0 ? i4 + this.g.length : i4;
    }

    public final void e(int i4, int i5) {
        if (i4 < i5) {
            f.F(this.g, i4, i5);
            return;
        }
        Object[] objArr = this.g;
        f.F(objArr, i4, objArr.length);
        f.F(this.g, 0, i5);
    }

    public final int f(int i4) {
        Object[] objArr = this.g;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.h;
        if (i4 >= 0 && i4 < i5) {
            return this.g[f(this.f2951f + i4)];
        }
        throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int f4 = f(this.f2951f + this.h);
        int i5 = this.f2951f;
        if (i5 < f4) {
            while (i5 < f4) {
                if (u2.c.a(obj, this.g[i5])) {
                    i4 = this.f2951f;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < f4) {
            return -1;
        }
        int length = this.g.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < f4; i6++) {
                    if (u2.c.a(obj, this.g[i6])) {
                        i5 = i6 + this.g.length;
                        i4 = this.f2951f;
                    }
                }
                return -1;
            }
            if (u2.c.a(obj, this.g[i5])) {
                i4 = this.f2951f;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int f4 = f(this.f2951f + this.h);
        int i5 = this.f2951f;
        if (i5 < f4) {
            length = f4 - 1;
            if (i5 <= length) {
                while (!u2.c.a(obj, this.g[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f2951f;
                return length - i4;
            }
            return -1;
        }
        if (i5 > f4) {
            int i6 = f4 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.g;
                    u2.c.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f2951f;
                    if (i7 <= length) {
                        while (!u2.c.a(obj, this.g[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f2951f;
                    }
                } else {
                    if (u2.c.a(obj, this.g[i6])) {
                        length = i6 + this.g.length;
                        i4 = this.f2951f;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        int i5 = this.h;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }
        if (i4 == h.D(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        g();
        int f4 = f(this.f2951f + i4);
        Object[] objArr = this.g;
        Object obj = objArr[f4];
        if (i4 < (this.h >> 1)) {
            int i6 = this.f2951f;
            if (f4 >= i6) {
                f.D(objArr, objArr, i6 + 1, i6, f4);
            } else {
                f.D(objArr, objArr, 1, 0, f4);
                Object[] objArr2 = this.g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f2951f;
                f.D(objArr2, objArr2, i7 + 1, i7, objArr2.length - 1);
            }
            Object[] objArr3 = this.g;
            int i8 = this.f2951f;
            objArr3[i8] = null;
            this.f2951f = c(i8);
        } else {
            int f5 = f(h.D(this) + this.f2951f);
            if (f4 <= f5) {
                Object[] objArr4 = this.g;
                f.D(objArr4, objArr4, f4, f4 + 1, f5 + 1);
            } else {
                Object[] objArr5 = this.g;
                f.D(objArr5, objArr5, f4, f4 + 1, objArr5.length);
                Object[] objArr6 = this.g;
                objArr6[objArr6.length - 1] = objArr6[0];
                f.D(objArr6, objArr6, 0, 1, f5 + 1);
            }
            this.g[f5] = null;
        }
        this.h--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f4;
        u2.c.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.g.length != 0) {
            int f5 = f(this.f2951f + this.h);
            int i4 = this.f2951f;
            if (i4 < f5) {
                f4 = i4;
                while (i4 < f5) {
                    Object obj = this.g[i4];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.g[f4] = obj;
                        f4++;
                    }
                    i4++;
                }
                f.F(this.g, f4, f5);
            } else {
                int length = this.g.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.g;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.g[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                f4 = f(i5);
                for (int i6 = 0; i6 < f5; i6++) {
                    Object[] objArr2 = this.g;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.g[f4] = obj3;
                        f4 = c(f4);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                g();
                this.h = d(f4 - this.f2951f);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.g;
        int i4 = this.f2951f;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f2951f = c(i4);
        this.h--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f4 = f(h.D(this) + this.f2951f);
        Object[] objArr = this.g;
        Object obj = objArr[f4];
        objArr[f4] = null;
        this.h--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        m0.a.h(i4, i5, this.h);
        int i6 = i5 - i4;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.h) {
            clear();
            return;
        }
        if (i6 == 1) {
            remove(i4);
            return;
        }
        g();
        if (i4 < this.h - i5) {
            int f4 = f((i4 - 1) + this.f2951f);
            int f5 = f((i5 - 1) + this.f2951f);
            while (i4 > 0) {
                int i7 = f4 + 1;
                int min = Math.min(i4, Math.min(i7, f5 + 1));
                Object[] objArr = this.g;
                int i8 = f5 - min;
                int i9 = f4 - min;
                f.D(objArr, objArr, i8 + 1, i9 + 1, i7);
                f4 = d(i9);
                f5 = d(i8);
                i4 -= min;
            }
            int f6 = f(this.f2951f + i6);
            e(this.f2951f, f6);
            this.f2951f = f6;
        } else {
            int f7 = f(this.f2951f + i5);
            int f8 = f(this.f2951f + i4);
            int i10 = this.h;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.g;
                i5 = Math.min(i10, Math.min(objArr2.length - f7, objArr2.length - f8));
                Object[] objArr3 = this.g;
                int i11 = f7 + i5;
                f.D(objArr3, objArr3, f8, f7, i11);
                f7 = f(i11);
                f8 = f(f8 + i5);
            }
            int f9 = f(this.f2951f + this.h);
            e(d(f9 - i6), f9);
        }
        this.h -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f4;
        u2.c.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.g.length != 0) {
            int f5 = f(this.f2951f + this.h);
            int i4 = this.f2951f;
            if (i4 < f5) {
                f4 = i4;
                while (i4 < f5) {
                    Object obj = this.g[i4];
                    if (collection.contains(obj)) {
                        this.g[f4] = obj;
                        f4++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                f.F(this.g, f4, f5);
            } else {
                int length = this.g.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.g;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        this.g[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                f4 = f(i5);
                for (int i6 = 0; i6 < f5; i6++) {
                    Object[] objArr2 = this.g;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        this.g[f4] = obj3;
                        f4 = c(f4);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                g();
                this.h = d(f4 - this.f2951f);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i5 = this.h;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
        }
        int f4 = f(this.f2951f + i4);
        Object[] objArr = this.g;
        Object obj2 = objArr[f4];
        objArr[f4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.h]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        u2.c.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.h;
        if (length < i4) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            u2.c.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f4 = f(this.f2951f + this.h);
        int i5 = this.f2951f;
        if (i5 < f4) {
            f.E(this.g, objArr, i5, f4, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.g;
            f.D(objArr2, objArr, 0, this.f2951f, objArr2.length);
            Object[] objArr3 = this.g;
            f.D(objArr3, objArr, objArr3.length - this.f2951f, 0, f4);
        }
        int i6 = this.h;
        if (i6 < objArr.length) {
            objArr[i6] = null;
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
        u2.c.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.h);
        a(f(this.f2951f + this.h), collection);
        return true;
    }
}
