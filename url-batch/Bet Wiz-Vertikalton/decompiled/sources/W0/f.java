package W0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends AbstractList implements List, f1.a {
    public static final Object[] d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f890a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f891b = d;

    /* renamed from: c, reason: collision with root package name */
    public int f892c;

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f891b.length;
        while (i < length && it.hasNext()) {
            this.f891b[i] = it.next();
            i++;
        }
        int i2 = this.f890a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f891b[i3] = it.next();
        }
        this.f892c = collection.size() + this.f892c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f892c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i3);
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.f892c + 1);
        int f2 = f(this.f890a + i);
        int i4 = this.f892c;
        if (i < ((i4 + 1) >> 1)) {
            if (f2 == 0) {
                Object[] objArr = this.f891b;
                e1.d.e(objArr, "<this>");
                f2 = objArr.length;
            }
            int i5 = f2 - 1;
            int i6 = this.f890a;
            if (i6 == 0) {
                Object[] objArr2 = this.f891b;
                e1.d.e(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f890a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f891b;
                objArr3[i2] = objArr3[i7];
                g.p0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f891b;
                g.p0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f891b;
                objArr5[objArr5.length - 1] = objArr5[0];
                g.p0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f891b[i5] = obj;
            this.f890a = i2;
        } else {
            int f3 = f(this.f890a + i4);
            if (f2 < f3) {
                Object[] objArr6 = this.f891b;
                g.p0(objArr6, objArr6, f2 + 1, f2, f3);
            } else {
                Object[] objArr7 = this.f891b;
                g.p0(objArr7, objArr7, 1, 0, f3);
                Object[] objArr8 = this.f891b;
                objArr8[0] = objArr8[objArr8.length - 1];
                g.p0(objArr8, objArr8, f2 + 1, f2, objArr8.length - 1);
            }
            this.f891b[f2] = obj;
        }
        this.f892c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e1.d.e(collection, "elements");
        int i2 = this.f892c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f892c) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.f892c);
        int f2 = f(this.f890a + this.f892c);
        int f3 = f(this.f890a + i);
        int size = collection.size();
        if (i < ((this.f892c + 1) >> 1)) {
            int i3 = this.f890a;
            int i4 = i3 - size;
            if (f3 < i3) {
                Object[] objArr = this.f891b;
                g.p0(objArr, objArr, i4, i3, objArr.length);
                if (size >= f3) {
                    Object[] objArr2 = this.f891b;
                    g.p0(objArr2, objArr2, objArr2.length - size, 0, f3);
                } else {
                    Object[] objArr3 = this.f891b;
                    g.p0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f891b;
                    g.p0(objArr4, objArr4, 0, size, f3);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f891b;
                g.p0(objArr5, objArr5, i4, i3, f3);
            } else {
                Object[] objArr6 = this.f891b;
                i4 += objArr6.length;
                int i5 = f3 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    g.p0(objArr6, objArr6, i4, i3, f3);
                } else {
                    g.p0(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f891b;
                    g.p0(objArr7, objArr7, 0, this.f890a + length, f3);
                }
            }
            this.f890a = i4;
            a(d(f3 - size), collection);
        } else {
            int i6 = f3 + size;
            if (f3 < f2) {
                int i7 = size + f2;
                Object[] objArr8 = this.f891b;
                if (i7 <= objArr8.length) {
                    g.p0(objArr8, objArr8, i6, f3, f2);
                } else if (i6 >= objArr8.length) {
                    g.p0(objArr8, objArr8, i6 - objArr8.length, f3, f2);
                } else {
                    int length2 = f2 - (i7 - objArr8.length);
                    g.p0(objArr8, objArr8, 0, length2, f2);
                    Object[] objArr9 = this.f891b;
                    g.p0(objArr9, objArr9, i6, f3, length2);
                }
            } else {
                Object[] objArr10 = this.f891b;
                g.p0(objArr10, objArr10, size, 0, f2);
                Object[] objArr11 = this.f891b;
                if (i6 >= objArr11.length) {
                    g.p0(objArr11, objArr11, i6 - objArr11.length, f3, objArr11.length);
                } else {
                    g.p0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f891b;
                    g.p0(objArr12, objArr12, i6, f3, objArr12.length - size);
                }
            }
            a(f3, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f892c + 1);
        int i = this.f890a;
        if (i == 0) {
            Object[] objArr = this.f891b;
            e1.d.e(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f890a = i2;
        this.f891b[i2] = obj;
        this.f892c++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f892c + 1);
        this.f891b[f(this.f890a + this.f892c)] = obj;
        this.f892c++;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f891b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.f891b = new Object[i];
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
        g.p0(objArr, objArr2, 0, this.f890a, objArr.length);
        Object[] objArr3 = this.f891b;
        int length2 = objArr3.length;
        int i3 = this.f890a;
        g.p0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f890a = 0;
        this.f891b = objArr2;
    }

    public final int c(int i) {
        e1.d.e(this.f891b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f890a, f(this.f890a + this.f892c));
        }
        this.f890a = 0;
        this.f892c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        return i < 0 ? i + this.f891b.length : i;
    }

    public final void e(int i, int i2) {
        if (i < i2) {
            g.r0(this.f891b, i, i2);
            return;
        }
        Object[] objArr = this.f891b;
        g.r0(objArr, i, objArr.length);
        g.r0(this.f891b, 0, i2);
    }

    public final int f(int i) {
        Object[] objArr = this.f891b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f892c;
        if (i >= 0 && i < i2) {
            return this.f891b[f(this.f890a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int f2 = f(this.f890a + this.f892c);
        int i2 = this.f890a;
        if (i2 < f2) {
            while (i2 < f2) {
                if (e1.d.a(obj, this.f891b[i2])) {
                    i = this.f890a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < f2) {
            return -1;
        }
        int length = this.f891b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < f2; i3++) {
                    if (e1.d.a(obj, this.f891b[i3])) {
                        i2 = i3 + this.f891b.length;
                        i = this.f890a;
                    }
                }
                return -1;
            }
            if (e1.d.a(obj, this.f891b[i2])) {
                i = this.f890a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f892c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int f2 = f(this.f890a + this.f892c);
        int i2 = this.f890a;
        if (i2 < f2) {
            length = f2 - 1;
            if (i2 <= length) {
                while (!e1.d.a(obj, this.f891b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f890a;
                return length - i;
            }
            return -1;
        }
        if (i2 > f2) {
            int i3 = f2 - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f891b;
                    e1.d.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f890a;
                    if (i4 <= length) {
                        while (!e1.d.a(obj, this.f891b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f890a;
                    }
                } else {
                    if (e1.d.a(obj, this.f891b[i3])) {
                        length = i3 + this.f891b.length;
                        i = this.f890a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.f892c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        g();
        int f2 = f(this.f890a + i);
        Object[] objArr = this.f891b;
        Object obj = objArr[f2];
        if (i < (this.f892c >> 1)) {
            int i3 = this.f890a;
            if (f2 >= i3) {
                g.p0(objArr, objArr, i3 + 1, i3, f2);
            } else {
                g.p0(objArr, objArr, 1, 0, f2);
                Object[] objArr2 = this.f891b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f890a;
                g.p0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f891b;
            int i5 = this.f890a;
            objArr3[i5] = null;
            this.f890a = c(i5);
        } else {
            int f3 = f((size() - 1) + this.f890a);
            if (f2 <= f3) {
                Object[] objArr4 = this.f891b;
                g.p0(objArr4, objArr4, f2, f2 + 1, f3 + 1);
            } else {
                Object[] objArr5 = this.f891b;
                g.p0(objArr5, objArr5, f2, f2 + 1, objArr5.length);
                Object[] objArr6 = this.f891b;
                objArr6[objArr6.length - 1] = objArr6[0];
                g.p0(objArr6, objArr6, 0, 1, f3 + 1);
            }
            this.f891b[f3] = null;
        }
        this.f892c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f2;
        e1.d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f891b.length != 0) {
            int f3 = f(this.f890a + this.f892c);
            int i = this.f890a;
            if (i < f3) {
                f2 = i;
                while (i < f3) {
                    Object obj = this.f891b[i];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f891b[f2] = obj;
                        f2++;
                    }
                    i++;
                }
                g.r0(this.f891b, f2, f3);
            } else {
                int length = this.f891b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f891b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f891b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                f2 = f(i2);
                for (int i3 = 0; i3 < f3; i3++) {
                    Object[] objArr2 = this.f891b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f891b[f2] = obj3;
                        f2 = c(f2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f892c = d(f2 - this.f890a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f891b;
        int i = this.f890a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f890a = c(i);
        this.f892c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f2 = f((size() - 1) + this.f890a);
        Object[] objArr = this.f891b;
        Object obj = objArr[f2];
        objArr[f2] = null;
        this.f892c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        x1.l.k(i, i2, this.f892c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f892c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        g();
        if (i < this.f892c - i2) {
            int f2 = f((i - 1) + this.f890a);
            int f3 = f((i2 - 1) + this.f890a);
            while (i > 0) {
                int i4 = f2 + 1;
                int min = Math.min(i, Math.min(i4, f3 + 1));
                Object[] objArr = this.f891b;
                int i5 = f3 - min;
                int i6 = f2 - min;
                g.p0(objArr, objArr, i5 + 1, i6 + 1, i4);
                f2 = d(i6);
                f3 = d(i5);
                i -= min;
            }
            int f4 = f(this.f890a + i3);
            e(this.f890a, f4);
            this.f890a = f4;
        } else {
            int f5 = f(this.f890a + i2);
            int f6 = f(this.f890a + i);
            int i7 = this.f892c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f891b;
                i2 = Math.min(i7, Math.min(objArr2.length - f5, objArr2.length - f6));
                Object[] objArr3 = this.f891b;
                int i8 = f5 + i2;
                g.p0(objArr3, objArr3, f6, f5, i8);
                f5 = f(i8);
                f6 = f(f6 + i2);
            }
            int f7 = f(this.f890a + this.f892c);
            e(d(f7 - i3), f7);
        }
        this.f892c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f2;
        e1.d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f891b.length != 0) {
            int f3 = f(this.f890a + this.f892c);
            int i = this.f890a;
            if (i < f3) {
                f2 = i;
                while (i < f3) {
                    Object obj = this.f891b[i];
                    if (collection.contains(obj)) {
                        this.f891b[f2] = obj;
                        f2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                g.r0(this.f891b, f2, f3);
            } else {
                int length = this.f891b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f891b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f891b[i2] = obj2;
                        i2++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                f2 = f(i2);
                for (int i3 = 0; i3 < f3; i3++) {
                    Object[] objArr2 = this.f891b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f891b[f2] = obj3;
                        f2 = c(f2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f892c = d(f2 - this.f890a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f892c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int f2 = f(this.f890a + i);
        Object[] objArr = this.f891b;
        Object obj2 = objArr[f2];
        objArr[f2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f892c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f892c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        e1.d.e(objArr, "array");
        int length = objArr.length;
        int i = this.f892c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            e1.d.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f2 = f(this.f890a + this.f892c);
        int i2 = this.f890a;
        if (i2 < f2) {
            g.p0(this.f891b, objArr, 0, i2, f2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f891b;
            g.p0(objArr2, objArr, 0, this.f890a, objArr2.length);
            Object[] objArr3 = this.f891b;
            g.p0(objArr3, objArr, objArr3.length - this.f890a, 0, f2);
        }
        int i3 = this.f892c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
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
        e1.d.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f892c);
        a(f(this.f890a + this.f892c), collection);
        return true;
    }
}
