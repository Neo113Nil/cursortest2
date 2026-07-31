package S1;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f4313g = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f4314d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f4315e = f4313g;

    /* renamed from: f, reason: collision with root package name */
    public int f4316f;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f4316f;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i5, "index: ", ", size: "));
        }
        if (i3 == i5) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        o();
        i(this.f4316f + 1);
        int n3 = n(this.f4314d + i3);
        int i6 = this.f4316f;
        if (i3 < ((i6 + 1) >> 1)) {
            if (n3 == 0) {
                Object[] objArr = this.f4315e;
                f2.j.f(objArr, "<this>");
                n3 = objArr.length;
            }
            int i7 = n3 - 1;
            int i8 = this.f4314d;
            if (i8 == 0) {
                Object[] objArr2 = this.f4315e;
                f2.j.f(objArr2, "<this>");
                i4 = objArr2.length - 1;
            } else {
                i4 = i8 - 1;
            }
            int i9 = this.f4314d;
            if (i7 >= i9) {
                Object[] objArr3 = this.f4315e;
                objArr3[i4] = objArr3[i9];
                k.m0(objArr3, objArr3, i9, i9 + 1, i7 + 1);
            } else {
                Object[] objArr4 = this.f4315e;
                k.m0(objArr4, objArr4, i9 - 1, i9, objArr4.length);
                Object[] objArr5 = this.f4315e;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.m0(objArr5, objArr5, 0, 1, i7 + 1);
            }
            this.f4315e[i7] = obj;
            this.f4314d = i4;
        } else {
            int n4 = n(i6 + this.f4314d);
            if (n3 < n4) {
                Object[] objArr6 = this.f4315e;
                k.m0(objArr6, objArr6, n3 + 1, n3, n4);
            } else {
                Object[] objArr7 = this.f4315e;
                k.m0(objArr7, objArr7, 1, 0, n4);
                Object[] objArr8 = this.f4315e;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.m0(objArr8, objArr8, n3 + 1, n3, objArr8.length - 1);
            }
            this.f4315e[n3] = obj;
        }
        this.f4316f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        f2.j.f(collection, "elements");
        int i4 = this.f4316f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i4, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i3 == this.f4316f) {
            return addAll(collection);
        }
        o();
        i(collection.size() + this.f4316f);
        int n3 = n(this.f4316f + this.f4314d);
        int n4 = n(this.f4314d + i3);
        int size = collection.size();
        if (i3 < ((this.f4316f + 1) >> 1)) {
            int i5 = this.f4314d;
            int i6 = i5 - size;
            if (n4 < i5) {
                Object[] objArr = this.f4315e;
                k.m0(objArr, objArr, i6, i5, objArr.length);
                if (size >= n4) {
                    Object[] objArr2 = this.f4315e;
                    k.m0(objArr2, objArr2, objArr2.length - size, 0, n4);
                } else {
                    Object[] objArr3 = this.f4315e;
                    k.m0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f4315e;
                    k.m0(objArr4, objArr4, 0, size, n4);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f4315e;
                k.m0(objArr5, objArr5, i6, i5, n4);
            } else {
                Object[] objArr6 = this.f4315e;
                i6 += objArr6.length;
                int i7 = n4 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    k.m0(objArr6, objArr6, i6, i5, n4);
                } else {
                    k.m0(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f4315e;
                    k.m0(objArr7, objArr7, 0, this.f4314d + length, n4);
                }
            }
            this.f4314d = i6;
            d(l(n4 - size), collection);
        } else {
            int i8 = n4 + size;
            if (n4 < n3) {
                int i9 = size + n3;
                Object[] objArr8 = this.f4315e;
                if (i9 <= objArr8.length) {
                    k.m0(objArr8, objArr8, i8, n4, n3);
                } else if (i8 >= objArr8.length) {
                    k.m0(objArr8, objArr8, i8 - objArr8.length, n4, n3);
                } else {
                    int length2 = n3 - (i9 - objArr8.length);
                    k.m0(objArr8, objArr8, 0, length2, n3);
                    Object[] objArr9 = this.f4315e;
                    k.m0(objArr9, objArr9, i8, n4, length2);
                }
            } else {
                Object[] objArr10 = this.f4315e;
                k.m0(objArr10, objArr10, size, 0, n3);
                Object[] objArr11 = this.f4315e;
                if (i8 >= objArr11.length) {
                    k.m0(objArr11, objArr11, i8 - objArr11.length, n4, objArr11.length);
                } else {
                    k.m0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f4315e;
                    k.m0(objArr12, objArr12, i8, n4, objArr12.length - size);
                }
            }
            d(n4, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        i(this.f4316f + 1);
        int i3 = this.f4314d;
        if (i3 == 0) {
            Object[] objArr = this.f4315e;
            f2.j.f(objArr, "<this>");
            i3 = objArr.length;
        }
        int i4 = i3 - 1;
        this.f4314d = i4;
        this.f4315e[i4] = obj;
        this.f4316f++;
    }

    public final void addLast(Object obj) {
        o();
        i(b() + 1);
        this.f4315e[n(b() + this.f4314d)] = obj;
        this.f4316f = b() + 1;
    }

    @Override // S1.f
    public final int b() {
        return this.f4316f;
    }

    @Override // S1.f
    public final Object c(int i3) {
        int i4 = this.f4316f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(A.k.f(i3, i4, "index: ", ", size: "));
        }
        if (i3 == m.z0(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        o();
        int n3 = n(this.f4314d + i3);
        Object[] objArr = this.f4315e;
        Object obj = objArr[n3];
        if (i3 < (this.f4316f >> 1)) {
            int i5 = this.f4314d;
            if (n3 >= i5) {
                k.m0(objArr, objArr, i5 + 1, i5, n3);
            } else {
                k.m0(objArr, objArr, 1, 0, n3);
                Object[] objArr2 = this.f4315e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f4314d;
                k.m0(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.f4315e;
            int i7 = this.f4314d;
            objArr3[i7] = null;
            this.f4314d = j(i7);
        } else {
            int n4 = n(m.z0(this) + this.f4314d);
            if (n3 <= n4) {
                Object[] objArr4 = this.f4315e;
                k.m0(objArr4, objArr4, n3, n3 + 1, n4 + 1);
            } else {
                Object[] objArr5 = this.f4315e;
                k.m0(objArr5, objArr5, n3, n3 + 1, objArr5.length);
                Object[] objArr6 = this.f4315e;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.m0(objArr6, objArr6, 0, 1, n4 + 1);
            }
            this.f4315e[n4] = null;
        }
        this.f4316f--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.f4314d, n(b() + this.f4314d));
        }
        this.f4314d = 0;
        this.f4316f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4315e.length;
        while (i3 < length && it.hasNext()) {
            this.f4315e[i3] = it.next();
            i3++;
        }
        int i4 = this.f4314d;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f4315e[i5] = it.next();
        }
        this.f4316f = collection.size() + b();
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f4315e[this.f4314d];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int b3 = b();
        if (i3 < 0 || i3 >= b3) {
            throw new IndexOutOfBoundsException(A.k.f(i3, b3, "index: ", ", size: "));
        }
        return this.f4315e[n(this.f4314d + i3)];
    }

    public final void i(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f4315e;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f4313g) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f4315e = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        k.m0(objArr, objArr2, 0, this.f4314d, objArr.length);
        Object[] objArr3 = this.f4315e;
        int length2 = objArr3.length;
        int i5 = this.f4314d;
        k.m0(objArr3, objArr2, length2 - i5, 0, i5);
        this.f4314d = 0;
        this.f4315e = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int n3 = n(b() + this.f4314d);
        int i4 = this.f4314d;
        if (i4 < n3) {
            while (i4 < n3) {
                if (f2.j.a(obj, this.f4315e[i4])) {
                    i3 = this.f4314d;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 < n3) {
            return -1;
        }
        int length = this.f4315e.length;
        while (true) {
            if (i4 >= length) {
                for (int i5 = 0; i5 < n3; i5++) {
                    if (f2.j.a(obj, this.f4315e[i5])) {
                        i4 = i5 + this.f4315e.length;
                        i3 = this.f4314d;
                    }
                }
                return -1;
            }
            if (f2.j.a(obj, this.f4315e[i4])) {
                i3 = this.f4314d;
                break;
            }
            i4++;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final int j(int i3) {
        f2.j.f(this.f4315e, "<this>");
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return this.f4315e[n(m.z0(this) + this.f4314d)];
    }

    public final int l(int i3) {
        return i3 < 0 ? i3 + this.f4315e.length : i3;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f4315e[n(m.z0(this) + this.f4314d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int n3 = n(this.f4316f + this.f4314d);
        int i4 = this.f4314d;
        if (i4 < n3) {
            length = n3 - 1;
            if (i4 <= length) {
                while (!f2.j.a(obj, this.f4315e[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f4314d;
                return length - i3;
            }
            return -1;
        }
        if (i4 > n3) {
            int i5 = n3 - 1;
            while (true) {
                if (-1 >= i5) {
                    Object[] objArr = this.f4315e;
                    f2.j.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i6 = this.f4314d;
                    if (i6 <= length) {
                        while (!f2.j.a(obj, this.f4315e[length])) {
                            if (length != i6) {
                                length--;
                            }
                        }
                        i3 = this.f4314d;
                    }
                } else {
                    if (f2.j.a(obj, this.f4315e[i5])) {
                        length = i5 + this.f4315e.length;
                        i3 = this.f4314d;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    public final void m(int i3, int i4) {
        if (i3 < i4) {
            k.r0(this.f4315e, null, i3, i4);
            return;
        }
        Object[] objArr = this.f4315e;
        Arrays.fill(objArr, i3, objArr.length, (Object) null);
        k.r0(this.f4315e, null, 0, i4);
    }

    public final int n(int i3) {
        Object[] objArr = this.f4315e;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int n3;
        f2.j.f(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f4315e.length != 0) {
            int n4 = n(this.f4316f + this.f4314d);
            int i3 = this.f4314d;
            if (i3 < n4) {
                n3 = i3;
                while (i3 < n4) {
                    Object obj = this.f4315e[i3];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f4315e[n3] = obj;
                        n3++;
                    }
                    i3++;
                }
                k.r0(this.f4315e, null, n3, n4);
            } else {
                int length = this.f4315e.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f4315e;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f4315e[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                n3 = n(i4);
                for (int i5 = 0; i5 < n4; i5++) {
                    Object[] objArr2 = this.f4315e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f4315e[n3] = obj3;
                        n3 = j(n3);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                o();
                this.f4316f = l(n3 - this.f4314d);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.f4315e;
        int i3 = this.f4314d;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f4314d = j(i3);
        this.f4316f = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int n3 = n(m.z0(this) + this.f4314d);
        Object[] objArr = this.f4315e;
        Object obj = objArr[n3];
        objArr[n3] = null;
        this.f4316f = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        l0.c.n(i3, i4, this.f4316f);
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.f4316f) {
            clear();
            return;
        }
        if (i5 == 1) {
            c(i3);
            return;
        }
        o();
        if (i3 < this.f4316f - i4) {
            int n3 = n((i3 - 1) + this.f4314d);
            int n4 = n((i4 - 1) + this.f4314d);
            while (i3 > 0) {
                int i6 = n3 + 1;
                int min = Math.min(i3, Math.min(i6, n4 + 1));
                Object[] objArr = this.f4315e;
                int i7 = n4 - min;
                int i8 = n3 - min;
                k.m0(objArr, objArr, i7 + 1, i8 + 1, i6);
                n3 = l(i8);
                n4 = l(i7);
                i3 -= min;
            }
            int n5 = n(this.f4314d + i5);
            m(this.f4314d, n5);
            this.f4314d = n5;
        } else {
            int n6 = n(this.f4314d + i4);
            int n7 = n(this.f4314d + i3);
            int i9 = this.f4316f;
            while (true) {
                i9 -= i4;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f4315e;
                i4 = Math.min(i9, Math.min(objArr2.length - n6, objArr2.length - n7));
                Object[] objArr3 = this.f4315e;
                int i10 = n6 + i4;
                k.m0(objArr3, objArr3, n7, n6, i10);
                n6 = n(i10);
                n7 = n(n7 + i4);
            }
            int n8 = n(this.f4316f + this.f4314d);
            m(l(n8 - i5), n8);
        }
        this.f4316f -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int n3;
        f2.j.f(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f4315e.length != 0) {
            int n4 = n(this.f4316f + this.f4314d);
            int i3 = this.f4314d;
            if (i3 < n4) {
                n3 = i3;
                while (i3 < n4) {
                    Object obj = this.f4315e[i3];
                    if (collection.contains(obj)) {
                        this.f4315e[n3] = obj;
                        n3++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                k.r0(this.f4315e, null, n3, n4);
            } else {
                int length = this.f4315e.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f4315e;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f4315e[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                n3 = n(i4);
                for (int i5 = 0; i5 < n4; i5++) {
                    Object[] objArr2 = this.f4315e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f4315e[n3] = obj3;
                        n3 = j(n3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                o();
                this.f4316f = l(n3 - this.f4314d);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int b3 = b();
        if (i3 < 0 || i3 >= b3) {
            throw new IndexOutOfBoundsException(A.k.f(i3, b3, "index: ", ", size: "));
        }
        int n3 = n(this.f4314d + i3);
        Object[] objArr = this.f4315e;
        Object obj2 = objArr[n3];
        objArr[n3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        f2.j.f(objArr, "array");
        int length = objArr.length;
        int i3 = this.f4316f;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            f2.j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int n3 = n(this.f4316f + this.f4314d);
        int i4 = this.f4314d;
        if (i4 < n3) {
            k.o0(this.f4315e, objArr, i4, n3, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f4315e;
            k.m0(objArr2, objArr, 0, this.f4314d, objArr2.length);
            Object[] objArr3 = this.f4315e;
            k.m0(objArr3, objArr, objArr3.length - this.f4314d, 0, n3);
        }
        int i5 = this.f4316f;
        if (i5 < objArr.length) {
            objArr[i5] = null;
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
        f2.j.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o();
        i(collection.size() + b());
        d(n(b() + this.f4314d), collection);
        return true;
    }
}
