package T0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends AbstractList implements List, c1.a {
    public static final Object[] d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f823a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f824b = d;

    /* renamed from: c, reason: collision with root package name */
    public int f825c;

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f824b.length;
        while (i < length && it.hasNext()) {
            this.f824b[i] = it.next();
            i++;
        }
        int i2 = this.f823a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f824b[i3] = it.next();
        }
        this.f825c = collection.size() + this.f825c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f825c;
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
        b(this.f825c + 1);
        int f2 = f(this.f823a + i);
        int i4 = this.f825c;
        if (i < ((i4 + 1) >> 1)) {
            if (f2 == 0) {
                Object[] objArr = this.f824b;
                b1.d.e(objArr, "<this>");
                f2 = objArr.length;
            }
            int i5 = f2 - 1;
            int i6 = this.f823a;
            if (i6 == 0) {
                Object[] objArr2 = this.f824b;
                b1.d.e(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f823a;
            if (i5 >= i7) {
                Object[] objArr3 = this.f824b;
                objArr3[i2] = objArr3[i7];
                g.k0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f824b;
                g.k0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f824b;
                objArr5[objArr5.length - 1] = objArr5[0];
                g.k0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f824b[i5] = obj;
            this.f823a = i2;
        } else {
            int f3 = f(this.f823a + i4);
            if (f2 < f3) {
                Object[] objArr6 = this.f824b;
                g.k0(objArr6, objArr6, f2 + 1, f2, f3);
            } else {
                Object[] objArr7 = this.f824b;
                g.k0(objArr7, objArr7, 1, 0, f3);
                Object[] objArr8 = this.f824b;
                objArr8[0] = objArr8[objArr8.length - 1];
                g.k0(objArr8, objArr8, f2 + 1, f2, objArr8.length - 1);
            }
            this.f824b[f2] = obj;
        }
        this.f825c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b1.d.e(collection, "elements");
        int i2 = this.f825c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f825c) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.f825c);
        int f2 = f(this.f823a + this.f825c);
        int f3 = f(this.f823a + i);
        int size = collection.size();
        if (i < ((this.f825c + 1) >> 1)) {
            int i3 = this.f823a;
            int i4 = i3 - size;
            if (f3 < i3) {
                Object[] objArr = this.f824b;
                g.k0(objArr, objArr, i4, i3, objArr.length);
                if (size >= f3) {
                    Object[] objArr2 = this.f824b;
                    g.k0(objArr2, objArr2, objArr2.length - size, 0, f3);
                } else {
                    Object[] objArr3 = this.f824b;
                    g.k0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f824b;
                    g.k0(objArr4, objArr4, 0, size, f3);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f824b;
                g.k0(objArr5, objArr5, i4, i3, f3);
            } else {
                Object[] objArr6 = this.f824b;
                i4 += objArr6.length;
                int i5 = f3 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    g.k0(objArr6, objArr6, i4, i3, f3);
                } else {
                    g.k0(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f824b;
                    g.k0(objArr7, objArr7, 0, this.f823a + length, f3);
                }
            }
            this.f823a = i4;
            a(d(f3 - size), collection);
        } else {
            int i6 = f3 + size;
            if (f3 < f2) {
                int i7 = size + f2;
                Object[] objArr8 = this.f824b;
                if (i7 <= objArr8.length) {
                    g.k0(objArr8, objArr8, i6, f3, f2);
                } else if (i6 >= objArr8.length) {
                    g.k0(objArr8, objArr8, i6 - objArr8.length, f3, f2);
                } else {
                    int length2 = f2 - (i7 - objArr8.length);
                    g.k0(objArr8, objArr8, 0, length2, f2);
                    Object[] objArr9 = this.f824b;
                    g.k0(objArr9, objArr9, i6, f3, length2);
                }
            } else {
                Object[] objArr10 = this.f824b;
                g.k0(objArr10, objArr10, size, 0, f2);
                Object[] objArr11 = this.f824b;
                if (i6 >= objArr11.length) {
                    g.k0(objArr11, objArr11, i6 - objArr11.length, f3, objArr11.length);
                } else {
                    g.k0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f824b;
                    g.k0(objArr12, objArr12, i6, f3, objArr12.length - size);
                }
            }
            a(f3, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f825c + 1);
        int i = this.f823a;
        if (i == 0) {
            Object[] objArr = this.f824b;
            b1.d.e(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f823a = i2;
        this.f824b[i2] = obj;
        this.f825c++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f825c + 1);
        this.f824b[f(this.f823a + this.f825c)] = obj;
        this.f825c++;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f824b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.f824b = new Object[i];
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
        g.k0(objArr, objArr2, 0, this.f823a, objArr.length);
        Object[] objArr3 = this.f824b;
        int length2 = objArr3.length;
        int i3 = this.f823a;
        g.k0(objArr3, objArr2, length2 - i3, 0, i3);
        this.f823a = 0;
        this.f824b = objArr2;
    }

    public final int c(int i) {
        b1.d.e(this.f824b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f823a, f(this.f823a + this.f825c));
        }
        this.f823a = 0;
        this.f825c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        return i < 0 ? i + this.f824b.length : i;
    }

    public final void e(int i, int i2) {
        if (i < i2) {
            g.m0(this.f824b, i, i2);
            return;
        }
        Object[] objArr = this.f824b;
        g.m0(objArr, i, objArr.length);
        g.m0(this.f824b, 0, i2);
    }

    public final int f(int i) {
        Object[] objArr = this.f824b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f825c;
        if (i >= 0 && i < i2) {
            return this.f824b[f(this.f823a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int f2 = f(this.f823a + this.f825c);
        int i2 = this.f823a;
        if (i2 < f2) {
            while (i2 < f2) {
                if (b1.d.a(obj, this.f824b[i2])) {
                    i = this.f823a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < f2) {
            return -1;
        }
        int length = this.f824b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < f2; i3++) {
                    if (b1.d.a(obj, this.f824b[i3])) {
                        i2 = i3 + this.f824b.length;
                        i = this.f823a;
                    }
                }
                return -1;
            }
            if (b1.d.a(obj, this.f824b[i2])) {
                i = this.f823a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f825c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int f2 = f(this.f823a + this.f825c);
        int i2 = this.f823a;
        if (i2 < f2) {
            length = f2 - 1;
            if (i2 <= length) {
                while (!b1.d.a(obj, this.f824b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f823a;
                return length - i;
            }
            return -1;
        }
        if (i2 > f2) {
            int i3 = f2 - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f824b;
                    b1.d.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f823a;
                    if (i4 <= length) {
                        while (!b1.d.a(obj, this.f824b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f823a;
                    }
                } else {
                    if (b1.d.a(obj, this.f824b[i3])) {
                        length = i3 + this.f824b.length;
                        i = this.f823a;
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
        int i2 = this.f825c;
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
        int f2 = f(this.f823a + i);
        Object[] objArr = this.f824b;
        Object obj = objArr[f2];
        if (i < (this.f825c >> 1)) {
            int i3 = this.f823a;
            if (f2 >= i3) {
                g.k0(objArr, objArr, i3 + 1, i3, f2);
            } else {
                g.k0(objArr, objArr, 1, 0, f2);
                Object[] objArr2 = this.f824b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f823a;
                g.k0(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f824b;
            int i5 = this.f823a;
            objArr3[i5] = null;
            this.f823a = c(i5);
        } else {
            int f3 = f((size() - 1) + this.f823a);
            if (f2 <= f3) {
                Object[] objArr4 = this.f824b;
                g.k0(objArr4, objArr4, f2, f2 + 1, f3 + 1);
            } else {
                Object[] objArr5 = this.f824b;
                g.k0(objArr5, objArr5, f2, f2 + 1, objArr5.length);
                Object[] objArr6 = this.f824b;
                objArr6[objArr6.length - 1] = objArr6[0];
                g.k0(objArr6, objArr6, 0, 1, f3 + 1);
            }
            this.f824b[f3] = null;
        }
        this.f825c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f2;
        b1.d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f824b.length != 0) {
            int f3 = f(this.f823a + this.f825c);
            int i = this.f823a;
            if (i < f3) {
                f2 = i;
                while (i < f3) {
                    Object obj = this.f824b[i];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f824b[f2] = obj;
                        f2++;
                    }
                    i++;
                }
                g.m0(this.f824b, f2, f3);
            } else {
                int length = this.f824b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f824b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f824b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                f2 = f(i2);
                for (int i3 = 0; i3 < f3; i3++) {
                    Object[] objArr2 = this.f824b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f824b[f2] = obj3;
                        f2 = c(f2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f825c = d(f2 - this.f823a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f824b;
        int i = this.f823a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f823a = c(i);
        this.f825c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f2 = f((size() - 1) + this.f823a);
        Object[] objArr = this.f824b;
        Object obj = objArr[f2];
        objArr[f2] = null;
        this.f825c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        u1.d.l(i, i2, this.f825c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f825c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        g();
        if (i < this.f825c - i2) {
            int f2 = f((i - 1) + this.f823a);
            int f3 = f((i2 - 1) + this.f823a);
            while (i > 0) {
                int i4 = f2 + 1;
                int min = Math.min(i, Math.min(i4, f3 + 1));
                Object[] objArr = this.f824b;
                int i5 = f3 - min;
                int i6 = f2 - min;
                g.k0(objArr, objArr, i5 + 1, i6 + 1, i4);
                f2 = d(i6);
                f3 = d(i5);
                i -= min;
            }
            int f4 = f(this.f823a + i3);
            e(this.f823a, f4);
            this.f823a = f4;
        } else {
            int f5 = f(this.f823a + i2);
            int f6 = f(this.f823a + i);
            int i7 = this.f825c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f824b;
                i2 = Math.min(i7, Math.min(objArr2.length - f5, objArr2.length - f6));
                Object[] objArr3 = this.f824b;
                int i8 = f5 + i2;
                g.k0(objArr3, objArr3, f6, f5, i8);
                f5 = f(i8);
                f6 = f(f6 + i2);
            }
            int f7 = f(this.f823a + this.f825c);
            e(d(f7 - i3), f7);
        }
        this.f825c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f2;
        b1.d.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f824b.length != 0) {
            int f3 = f(this.f823a + this.f825c);
            int i = this.f823a;
            if (i < f3) {
                f2 = i;
                while (i < f3) {
                    Object obj = this.f824b[i];
                    if (collection.contains(obj)) {
                        this.f824b[f2] = obj;
                        f2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                g.m0(this.f824b, f2, f3);
            } else {
                int length = this.f824b.length;
                boolean z3 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f824b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f824b[i2] = obj2;
                        i2++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                f2 = f(i2);
                for (int i3 = 0; i3 < f3; i3++) {
                    Object[] objArr2 = this.f824b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f824b[f2] = obj3;
                        f2 = c(f2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f825c = d(f2 - this.f823a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f825c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int f2 = f(this.f823a + i);
        Object[] objArr = this.f824b;
        Object obj2 = objArr[f2];
        objArr[f2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f825c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f825c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        b1.d.e(objArr, "array");
        int length = objArr.length;
        int i = this.f825c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            b1.d.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f2 = f(this.f823a + this.f825c);
        int i2 = this.f823a;
        if (i2 < f2) {
            g.k0(this.f824b, objArr, 0, i2, f2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f824b;
            g.k0(objArr2, objArr, 0, this.f823a, objArr2.length);
            Object[] objArr3 = this.f824b;
            g.k0(objArr3, objArr, objArr3.length - this.f823a, 0, f2);
        }
        int i3 = this.f825c;
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
        b1.d.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f825c);
        a(f(this.f823a + this.f825c), collection);
        return true;
    }
}
