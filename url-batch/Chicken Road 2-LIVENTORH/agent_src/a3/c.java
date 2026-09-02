package a3;

import a.y;
import androidx.fragment.app.w0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends a {
    public static final Object[] i = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public int f109f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f110g = i;

    /* renamed from: h, reason: collision with root package name */
    public int f111h;

    @Override // a3.a
    public final int a() {
        return this.f111h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i6 = this.f111h;
        if (i4 < 0 || i4 > i6) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i4, ", size: ", i6));
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
        d(this.f111h + 1);
        int h4 = h(this.f109f + i4);
        int i7 = this.f111h;
        if (i4 < ((i7 + 1) >> 1)) {
            if (h4 == 0) {
                Object[] objArr = this.f110g;
                f3.d.e(objArr, "<this>");
                h4 = objArr.length;
            }
            int i8 = h4 - 1;
            int i9 = this.f109f;
            if (i9 == 0) {
                Object[] objArr2 = this.f110g;
                f3.d.e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f109f;
            if (i8 >= i10) {
                Object[] objArr3 = this.f110g;
                objArr3[i5] = objArr3[i10];
                d.X(objArr3, objArr3, i10, i10 + 1, i8 + 1);
            } else {
                Object[] objArr4 = this.f110g;
                d.X(objArr4, objArr4, i10 - 1, i10, objArr4.length);
                Object[] objArr5 = this.f110g;
                objArr5[objArr5.length - 1] = objArr5[0];
                d.X(objArr5, objArr5, 0, 1, i8 + 1);
            }
            this.f110g[i8] = obj;
            this.f109f = i5;
        } else {
            int h5 = h(i7 + this.f109f);
            if (h4 < h5) {
                Object[] objArr6 = this.f110g;
                d.X(objArr6, objArr6, h4 + 1, h4, h5);
            } else {
                Object[] objArr7 = this.f110g;
                d.X(objArr7, objArr7, 1, 0, h5);
                Object[] objArr8 = this.f110g;
                objArr8[0] = objArr8[objArr8.length - 1];
                d.X(objArr8, objArr8, h4 + 1, h4, objArr8.length - 1);
            }
            this.f110g[h4] = obj;
        }
        this.f111h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        f3.d.e(collection, "elements");
        int i5 = this.f111h;
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i4, ", size: ", i5));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == this.f111h) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f111h);
        int h4 = h(this.f111h + this.f109f);
        int h5 = h(this.f109f + i4);
        int size = collection.size();
        if (i4 >= ((this.f111h + 1) >> 1)) {
            int i6 = h5 + size;
            if (h5 < h4) {
                int i7 = size + h4;
                Object[] objArr = this.f110g;
                if (i7 <= objArr.length) {
                    d.X(objArr, objArr, i6, h5, h4);
                } else if (i6 >= objArr.length) {
                    d.X(objArr, objArr, i6 - objArr.length, h5, h4);
                } else {
                    int length = h4 - (i7 - objArr.length);
                    d.X(objArr, objArr, 0, length, h4);
                    Object[] objArr2 = this.f110g;
                    d.X(objArr2, objArr2, i6, h5, length);
                }
            } else {
                Object[] objArr3 = this.f110g;
                d.X(objArr3, objArr3, size, 0, h4);
                Object[] objArr4 = this.f110g;
                if (i6 >= objArr4.length) {
                    d.X(objArr4, objArr4, i6 - objArr4.length, h5, objArr4.length);
                } else {
                    d.X(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f110g;
                    d.X(objArr5, objArr5, i6, h5, objArr5.length - size);
                }
            }
            c(h5, collection);
            return true;
        }
        int i8 = this.f109f;
        int i9 = i8 - size;
        if (h5 < i8) {
            Object[] objArr6 = this.f110g;
            d.X(objArr6, objArr6, i9, i8, objArr6.length);
            if (size >= h5) {
                Object[] objArr7 = this.f110g;
                d.X(objArr7, objArr7, objArr7.length - size, 0, h5);
            } else {
                Object[] objArr8 = this.f110g;
                d.X(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f110g;
                d.X(objArr9, objArr9, 0, size, h5);
            }
        } else if (i9 >= 0) {
            Object[] objArr10 = this.f110g;
            d.X(objArr10, objArr10, i9, i8, h5);
        } else {
            Object[] objArr11 = this.f110g;
            i9 += objArr11.length;
            int i10 = h5 - i8;
            int length2 = objArr11.length - i9;
            if (length2 >= i10) {
                d.X(objArr11, objArr11, i9, i8, h5);
            } else {
                d.X(objArr11, objArr11, i9, i8, i8 + length2);
                Object[] objArr12 = this.f110g;
                d.X(objArr12, objArr12, 0, this.f109f + length2, h5);
            }
        }
        this.f109f = i9;
        c(f(h5 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f111h + 1);
        int i4 = this.f109f;
        if (i4 == 0) {
            Object[] objArr = this.f110g;
            f3.d.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f109f = i5;
        this.f110g[i5] = obj;
        this.f111h++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f110g[h(a() + this.f109f)] = obj;
        this.f111h = a() + 1;
    }

    @Override // a3.a
    public final Object b(int i4) {
        int i5 = this.f111h;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i4, ", size: ", i5));
        }
        if (i4 == a() - 1) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        i();
        int h4 = h(this.f109f + i4);
        Object[] objArr = this.f110g;
        Object obj = objArr[h4];
        if (i4 < (this.f111h >> 1)) {
            int i6 = this.f109f;
            if (h4 >= i6) {
                d.X(objArr, objArr, i6 + 1, i6, h4);
            } else {
                d.X(objArr, objArr, 1, 0, h4);
                Object[] objArr2 = this.f110g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f109f;
                d.X(objArr2, objArr2, i7 + 1, i7, objArr2.length - 1);
            }
            Object[] objArr3 = this.f110g;
            int i8 = this.f109f;
            objArr3[i8] = null;
            this.f109f = e(i8);
        } else {
            int h5 = h((a() - 1) + this.f109f);
            if (h4 <= h5) {
                Object[] objArr4 = this.f110g;
                d.X(objArr4, objArr4, h4, h4 + 1, h5 + 1);
            } else {
                Object[] objArr5 = this.f110g;
                d.X(objArr5, objArr5, h4, h4 + 1, objArr5.length);
                Object[] objArr6 = this.f110g;
                objArr6[objArr6.length - 1] = objArr6[0];
                d.X(objArr6, objArr6, 0, 1, h5 + 1);
            }
            this.f110g[h5] = null;
        }
        this.f111h--;
        return obj;
    }

    public final void c(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f110g.length;
        while (i4 < length && it.hasNext()) {
            this.f110g[i4] = it.next();
            i4++;
        }
        int i5 = this.f109f;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f110g[i6] = it.next();
        }
        this.f111h = collection.size() + this.f111h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f109f, h(a() + this.f109f));
        }
        this.f109f = 0;
        this.f111h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f110g;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f110g = new Object[i4];
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
        d.X(objArr, objArr2, 0, this.f109f, objArr.length);
        Object[] objArr3 = this.f110g;
        int length2 = objArr3.length;
        int i6 = this.f109f;
        d.X(objArr3, objArr2, length2 - i6, 0, i6);
        this.f109f = 0;
        this.f110g = objArr2;
    }

    public final int e(int i4) {
        f3.d.e(this.f110g, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    public final int f(int i4) {
        return i4 < 0 ? i4 + this.f110g.length : i4;
    }

    public final void g(int i4, int i5) {
        if (i4 < i5) {
            Object[] objArr = this.f110g;
            f3.d.e(objArr, "<this>");
            Arrays.fill(objArr, i4, i5, (Object) null);
        } else {
            Object[] objArr2 = this.f110g;
            Arrays.fill(objArr2, i4, objArr2.length, (Object) null);
            Object[] objArr3 = this.f110g;
            f3.d.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i5, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int a2 = a();
        if (i4 < 0 || i4 >= a2) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i4, ", size: ", a2));
        }
        return this.f110g[h(this.f109f + i4)];
    }

    public final int h(int i4) {
        Object[] objArr = this.f110g;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int h4 = h(a() + this.f109f);
        int i5 = this.f109f;
        if (i5 < h4) {
            while (i5 < h4) {
                if (f3.d.a(obj, this.f110g[i5])) {
                    i4 = this.f109f;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i5 = this.f109f) < h4) {
            return -1;
        }
        int length = this.f110g.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < h4; i6++) {
                    if (f3.d.a(obj, this.f110g[i6])) {
                        i5 = i6 + this.f110g.length;
                        i4 = this.f109f;
                    }
                }
                return -1;
            }
            if (f3.d.a(obj, this.f110g[i5])) {
                i4 = this.f109f;
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
        int h4 = h(this.f111h + this.f109f);
        int i5 = this.f109f;
        if (i5 < h4) {
            length = h4 - 1;
            if (i5 <= length) {
                while (!f3.d.a(obj, this.f110g[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f109f;
                return length - i4;
            }
            return -1;
        }
        if (!isEmpty() && this.f109f >= h4) {
            int i6 = h4 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f110g;
                    f3.d.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f109f;
                    if (i7 <= length) {
                        while (!f3.d.a(obj, this.f110g[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f109f;
                    }
                } else {
                    if (f3.d.a(obj, this.f110g[i6])) {
                        length = i6 + this.f110g.length;
                        i4 = this.f109f;
                        break;
                    }
                    i6--;
                }
            }
            return length - i4;
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
        int h4;
        f3.d.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f110g.length != 0) {
            int h5 = h(this.f111h + this.f109f);
            int i4 = this.f109f;
            if (i4 < h5) {
                h4 = i4;
                while (i4 < h5) {
                    Object obj = this.f110g[i4];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f110g[h4] = obj;
                        h4++;
                    }
                    i4++;
                }
                Object[] objArr = this.f110g;
                f3.d.e(objArr, "<this>");
                Arrays.fill(objArr, h4, h5, (Object) null);
            } else {
                int length = this.f110g.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f110g;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f110g[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                h4 = h(i5);
                for (int i6 = 0; i6 < h5; i6++) {
                    Object[] objArr3 = this.f110g;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f110g[h4] = obj3;
                        h4 = e(h4);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                i();
                this.f111h = f(h4 - this.f109f);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f110g;
        int i4 = this.f109f;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f109f = e(i4);
        this.f111h = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h4 = h((a() - 1) + this.f109f);
        Object[] objArr = this.f110g;
        Object obj = objArr[h4];
        objArr[h4] = null;
        this.f111h--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        y.h(i4, i5, this.f111h);
        int i6 = i5 - i4;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f111h) {
            clear();
            return;
        }
        if (i6 == 1) {
            b(i4);
            return;
        }
        i();
        if (i4 < this.f111h - i5) {
            int h4 = h(this.f109f + (i4 - 1));
            int h5 = h(this.f109f + (i5 - 1));
            while (i4 > 0) {
                int i7 = h4 + 1;
                int min = Math.min(i4, Math.min(i7, h5 + 1));
                Object[] objArr = this.f110g;
                int i8 = h5 - min;
                int i9 = h4 - min;
                d.X(objArr, objArr, i8 + 1, i9 + 1, i7);
                h4 = f(i9);
                h5 = f(i8);
                i4 -= min;
            }
            int h6 = h(this.f109f + i6);
            g(this.f109f, h6);
            this.f109f = h6;
        } else {
            int h7 = h(this.f109f + i5);
            int h8 = h(this.f109f + i4);
            int i10 = this.f111h;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f110g;
                i5 = Math.min(i10, Math.min(objArr2.length - h7, objArr2.length - h8));
                Object[] objArr3 = this.f110g;
                int i11 = h7 + i5;
                d.X(objArr3, objArr3, h8, h7, i11);
                h7 = h(i11);
                h8 = h(h8 + i5);
            }
            int h9 = h(this.f111h + this.f109f);
            g(f(h9 - i6), h9);
        }
        this.f111h -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h4;
        f3.d.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f110g.length != 0) {
            int h5 = h(this.f111h + this.f109f);
            int i4 = this.f109f;
            if (i4 < h5) {
                h4 = i4;
                while (i4 < h5) {
                    Object obj = this.f110g[i4];
                    if (collection.contains(obj)) {
                        this.f110g[h4] = obj;
                        h4++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                Object[] objArr = this.f110g;
                f3.d.e(objArr, "<this>");
                Arrays.fill(objArr, h4, h5, (Object) null);
            } else {
                int length = this.f110g.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f110g;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f110g[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                h4 = h(i5);
                for (int i6 = 0; i6 < h5; i6++) {
                    Object[] objArr3 = this.f110g;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f110g[h4] = obj3;
                        h4 = e(h4);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                i();
                this.f111h = f(h4 - this.f109f);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int a2 = a();
        if (i4 < 0 || i4 >= a2) {
            throw new IndexOutOfBoundsException(w0.e("index: ", i4, ", size: ", a2));
        }
        int h4 = h(this.f109f + i4);
        Object[] objArr = this.f110g;
        Object obj2 = objArr[h4];
        objArr[h4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        f3.d.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f111h;
        if (length < i4) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            f3.d.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int h4 = h(this.f111h + this.f109f);
        int i5 = this.f109f;
        if (i5 < h4) {
            d.Y(this.f110g, objArr, i5, h4, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f110g;
            d.X(objArr2, objArr, 0, this.f109f, objArr2.length);
            Object[] objArr3 = this.f110g;
            d.X(objArr3, objArr, objArr3.length - this.f109f, 0, h4);
        }
        int i6 = this.f111h;
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
        f3.d.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + a());
        c(h(a() + this.f109f), collection);
        return true;
    }
}
