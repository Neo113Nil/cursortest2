package x2;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends d {
    public static final Object[] i = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public int f3883f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f3884g = i;
    public int h;

    @Override // x2.d
    public final int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i6 = this.h;
        if (i4 < 0 || i4 > i6) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i6, "index: ", ", size: "));
        }
        if (i4 == i6) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.h + 1);
        int h = h(this.f3883f + i4);
        int i7 = this.h;
        if (i4 < ((i7 + 1) >> 1)) {
            if (h == 0) {
                Object[] objArr = this.f3884g;
                i3.d.e(objArr, "<this>");
                h = objArr.length;
            }
            int i8 = h - 1;
            int i9 = this.f3883f;
            if (i9 == 0) {
                Object[] objArr2 = this.f3884g;
                i3.d.e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f3883f;
            if (i8 >= i10) {
                Object[] objArr3 = this.f3884g;
                objArr3[i5] = objArr3[i10];
                g.H(objArr3, objArr3, i10, i10 + 1, i8 + 1);
            } else {
                Object[] objArr4 = this.f3884g;
                g.H(objArr4, objArr4, i10 - 1, i10, objArr4.length);
                Object[] objArr5 = this.f3884g;
                objArr5[objArr5.length - 1] = objArr5[0];
                g.H(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.f3884g[i8] = obj;
            this.f3883f = i5;
        } else {
            int h5 = h(i7 + this.f3883f);
            if (h < h5) {
                Object[] objArr6 = this.f3884g;
                g.H(objArr6, objArr6, h + 1, h, h5);
            } else {
                Object[] objArr7 = this.f3884g;
                g.H(objArr7, objArr7, 1, 0, h5);
                Object[] objArr8 = this.f3884g;
                objArr8[0] = objArr8[objArr8.length - 1];
                g.H(objArr8, objArr8, h + 1, h, objArr8.length - 1);
            }
            this.f3884g[h] = obj;
        }
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        i3.d.e(collection, "elements");
        int i5 = this.h;
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == this.h) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.h);
        int h = h(this.h + this.f3883f);
        int h5 = h(this.f3883f + i4);
        int size = collection.size();
        if (i4 >= ((this.h + 1) >> 1)) {
            int i6 = h5 + size;
            if (h5 < h) {
                int i7 = size + h;
                Object[] objArr = this.f3884g;
                if (i7 <= objArr.length) {
                    g.H(objArr, objArr, i6, h5, h);
                } else if (i6 >= objArr.length) {
                    g.H(objArr, objArr, i6 - objArr.length, h5, h);
                } else {
                    int length = h - (i7 - objArr.length);
                    g.H(objArr, objArr, 0, length, h);
                    Object[] objArr2 = this.f3884g;
                    g.H(objArr2, objArr2, i6, h5, length);
                }
            } else {
                Object[] objArr3 = this.f3884g;
                g.H(objArr3, objArr3, size, 0, h);
                Object[] objArr4 = this.f3884g;
                if (i6 >= objArr4.length) {
                    g.H(objArr4, objArr4, i6 - objArr4.length, h5, objArr4.length);
                } else {
                    g.H(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f3884g;
                    g.H(objArr5, objArr5, i6, h5, objArr5.length - size);
                }
            }
            c(h5, collection);
            return true;
        }
        int i8 = this.f3883f;
        int i9 = i8 - size;
        if (h5 < i8) {
            Object[] objArr6 = this.f3884g;
            g.H(objArr6, objArr6, i9, i8, objArr6.length);
            if (size >= h5) {
                Object[] objArr7 = this.f3884g;
                g.H(objArr7, objArr7, objArr7.length - size, 0, h5);
            } else {
                Object[] objArr8 = this.f3884g;
                g.H(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f3884g;
                g.H(objArr9, objArr9, 0, size, h5);
            }
        } else if (i9 >= 0) {
            Object[] objArr10 = this.f3884g;
            g.H(objArr10, objArr10, i9, i8, h5);
        } else {
            Object[] objArr11 = this.f3884g;
            i9 += objArr11.length;
            int i10 = h5 - i8;
            int length2 = objArr11.length - i9;
            if (length2 >= i10) {
                g.H(objArr11, objArr11, i9, i8, h5);
            } else {
                g.H(objArr11, objArr11, i9, i8, i8 + length2);
                Object[] objArr12 = this.f3884g;
                g.H(objArr12, objArr12, 0, this.f3883f + length2, h5);
            }
        }
        this.f3883f = i9;
        c(f(h5 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.h + 1);
        int i4 = this.f3883f;
        if (i4 == 0) {
            Object[] objArr = this.f3884g;
            i3.d.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f3883f = i5;
        this.f3884g[i5] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f3884g[h(a() + this.f3883f)] = obj;
        this.h = a() + 1;
    }

    @Override // x2.d
    public final Object b(int i4) {
        int i5 = this.h;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, i5, "index: ", ", size: "));
        }
        if (i4 == i.A(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        i();
        int h = h(this.f3883f + i4);
        Object[] objArr = this.f3884g;
        Object obj = objArr[h];
        if (i4 < (this.h >> 1)) {
            int i6 = this.f3883f;
            if (h >= i6) {
                g.H(objArr, objArr, i6 + 1, i6, h);
            } else {
                g.H(objArr, objArr, 1, 0, h);
                Object[] objArr2 = this.f3884g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f3883f;
                g.H(objArr2, objArr2, i7 + 1, i7, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3884g;
            int i8 = this.f3883f;
            objArr3[i8] = null;
            this.f3883f = e(i8);
        } else {
            int h5 = h(i.A(this) + this.f3883f);
            if (h <= h5) {
                Object[] objArr4 = this.f3884g;
                g.H(objArr4, objArr4, h, h + 1, h5 + 1);
            } else {
                Object[] objArr5 = this.f3884g;
                g.H(objArr5, objArr5, h, h + 1, objArr5.length);
                Object[] objArr6 = this.f3884g;
                objArr6[objArr6.length - 1] = objArr6[0];
                g.H(objArr6, objArr6, 0, 1, h5 + 1);
            }
            this.f3884g[h5] = null;
        }
        this.h--;
        return obj;
    }

    public final void c(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3884g.length;
        while (i4 < length && it.hasNext()) {
            this.f3884g[i4] = it.next();
            i4++;
        }
        int i5 = this.f3883f;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f3884g[i6] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f3883f, h(a() + this.f3883f));
        }
        this.f3883f = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3884g;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f3884g = new Object[i4];
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
        g.H(objArr, objArr2, 0, this.f3883f, objArr.length);
        Object[] objArr3 = this.f3884g;
        int length2 = objArr3.length;
        int i6 = this.f3883f;
        g.H(objArr3, objArr2, length2 - i6, 0, i6);
        this.f3883f = 0;
        this.f3884g = objArr2;
    }

    public final int e(int i4) {
        i3.d.e(this.f3884g, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    public final int f(int i4) {
        return i4 < 0 ? i4 + this.f3884g.length : i4;
    }

    public final void g(int i4, int i5) {
        if (i4 < i5) {
            g.K(this.f3884g, i4, i5);
            return;
        }
        Object[] objArr = this.f3884g;
        g.K(objArr, i4, objArr.length);
        g.K(this.f3884g, 0, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int a5 = a();
        if (i4 < 0 || i4 >= a5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, a5, "index: ", ", size: "));
        }
        return this.f3884g[h(this.f3883f + i4)];
    }

    public final int h(int i4) {
        Object[] objArr = this.f3884g;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int h = h(a() + this.f3883f);
        int i5 = this.f3883f;
        if (i5 < h) {
            while (i5 < h) {
                if (i3.d.a(obj, this.f3884g[i5])) {
                    i4 = this.f3883f;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < h) {
            return -1;
        }
        int length = this.f3884g.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < h; i6++) {
                    if (i3.d.a(obj, this.f3884g[i6])) {
                        i5 = i6 + this.f3884g.length;
                        i4 = this.f3883f;
                    }
                }
                return -1;
            }
            if (i3.d.a(obj, this.f3884g[i5])) {
                i4 = this.f3883f;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int h = h(this.h + this.f3883f);
        int i5 = this.f3883f;
        if (i5 < h) {
            length = h - 1;
            if (i5 <= length) {
                while (!i3.d.a(obj, this.f3884g[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f3883f;
                return length - i4;
            }
            return -1;
        }
        if (i5 > h) {
            int i6 = h - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f3884g;
                    i3.d.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f3883f;
                    if (i7 <= length) {
                        while (!i3.d.a(obj, this.f3884g[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f3883f;
                    }
                } else {
                    if (i3.d.a(obj, this.f3884g[i6])) {
                        length = i6 + this.f3884g.length;
                        i4 = this.f3883f;
                        break;
                    }
                    i6--;
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
        i3.d.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f3884g.length != 0) {
            int h5 = h(this.h + this.f3883f);
            int i4 = this.f3883f;
            if (i4 < h5) {
                h = i4;
                while (i4 < h5) {
                    Object obj = this.f3884g[i4];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f3884g[h] = obj;
                        h++;
                    }
                    i4++;
                }
                g.K(this.f3884g, h, h5);
            } else {
                int length = this.f3884g.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f3884g;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f3884g[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                h = h(i5);
                for (int i6 = 0; i6 < h5; i6++) {
                    Object[] objArr2 = this.f3884g;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f3884g[h] = obj3;
                        h = e(h);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                i();
                this.h = f(h - this.f3883f);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f3884g;
        int i4 = this.f3883f;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f3883f = e(i4);
        this.h = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h = h(i.A(this) + this.f3883f);
        Object[] objArr = this.f3884g;
        Object obj = objArr[h];
        objArr[h] = null;
        this.h = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        s.a.i(i4, i5, this.h);
        int i6 = i5 - i4;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.h) {
            clear();
            return;
        }
        if (i6 == 1) {
            b(i4);
            return;
        }
        i();
        if (i4 < this.h - i5) {
            int h = h((i4 - 1) + this.f3883f);
            int h5 = h((i5 - 1) + this.f3883f);
            while (i4 > 0) {
                int i7 = h + 1;
                int min = Math.min(i4, Math.min(i7, h5 + 1));
                Object[] objArr = this.f3884g;
                int i8 = h5 - min;
                int i9 = h - min;
                g.H(objArr, objArr, i8 + 1, i9 + 1, i7);
                h = f(i9);
                h5 = f(i8);
                i4 -= min;
            }
            int h6 = h(this.f3883f + i6);
            g(this.f3883f, h6);
            this.f3883f = h6;
        } else {
            int h7 = h(this.f3883f + i5);
            int h8 = h(this.f3883f + i4);
            int i10 = this.h;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f3884g;
                i5 = Math.min(i10, Math.min(objArr2.length - h7, objArr2.length - h8));
                Object[] objArr3 = this.f3884g;
                int i11 = h7 + i5;
                g.H(objArr3, objArr3, h8, h7, i11);
                h7 = h(i11);
                h8 = h(h8 + i5);
            }
            int h9 = h(this.h + this.f3883f);
            g(f(h9 - i6), h9);
        }
        this.h -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h;
        i3.d.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f3884g.length != 0) {
            int h5 = h(this.h + this.f3883f);
            int i4 = this.f3883f;
            if (i4 < h5) {
                h = i4;
                while (i4 < h5) {
                    Object obj = this.f3884g[i4];
                    if (collection.contains(obj)) {
                        this.f3884g[h] = obj;
                        h++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                g.K(this.f3884g, h, h5);
            } else {
                int length = this.f3884g.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f3884g;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f3884g[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                h = h(i5);
                for (int i6 = 0; i6 < h5; i6++) {
                    Object[] objArr2 = this.f3884g;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f3884g[h] = obj3;
                        h = e(h);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                i();
                this.h = f(h - this.f3883f);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int a5 = a();
        if (i4 < 0 || i4 >= a5) {
            throw new IndexOutOfBoundsException(a4.b.d(i4, a5, "index: ", ", size: "));
        }
        int h = h(this.f3883f + i4);
        Object[] objArr = this.f3884g;
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
        i3.d.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.h;
        if (length < i4) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            i3.d.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int h = h(this.h + this.f3883f);
        int i5 = this.f3883f;
        if (i5 < h) {
            g.I(this.f3884g, objArr, i5, h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3884g;
            g.H(objArr2, objArr, 0, this.f3883f, objArr2.length);
            Object[] objArr3 = this.f3884g;
            g.H(objArr3, objArr, objArr3.length - this.f3883f, 0, h);
        }
        int i6 = this.h;
        if (i6 < objArr.length) {
            objArr[i6] = null;
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
        i3.d.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.f3883f), collection);
        return true;
    }
}
