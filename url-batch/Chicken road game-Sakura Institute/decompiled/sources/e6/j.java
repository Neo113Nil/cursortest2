package e6;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f2819i = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public int f2820f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f2821g;

    /* renamed from: h, reason: collision with root package name */
    public int f2822h;

    public j() {
        this.f2821g = f2819i;
    }

    public final void A(int i7, int i8) {
        if (i7 < i8) {
            k.c0(i7, i8, null, this.f2821g);
            return;
        }
        Object[] objArr = this.f2821g;
        k.c0(i7, objArr.length, null, objArr);
        k.c0(0, i8, null, this.f2821g);
    }

    public final int B(int i7) {
        Object[] objArr = this.f2821g;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void C() {
        ((AbstractList) this).modCount++;
    }

    @Override // e6.f
    public final int a() {
        return this.f2822h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int i9 = this.f2822h;
        if (i7 < 0 || i7 > i9) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i9, "index: ", ", size: "));
        }
        if (i7 == i9) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        C();
        w(this.f2822h + 1);
        int B = B(this.f2820f + i7);
        int i10 = this.f2822h;
        if (i7 < ((i10 + 1) >> 1)) {
            if (B == 0) {
                Object[] objArr = this.f2821g;
                r6.k.f(objArr, "<this>");
                B = objArr.length;
            }
            int i11 = B - 1;
            int i12 = this.f2820f;
            if (i12 == 0) {
                Object[] objArr2 = this.f2821g;
                r6.k.f(objArr2, "<this>");
                i8 = objArr2.length - 1;
            } else {
                i8 = i12 - 1;
            }
            int i13 = this.f2820f;
            if (i11 >= i13) {
                Object[] objArr3 = this.f2821g;
                objArr3[i8] = objArr3[i13];
                k.X(objArr3, objArr3, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr4 = this.f2821g;
                k.X(objArr4, objArr4, i13 - 1, i13, objArr4.length);
                Object[] objArr5 = this.f2821g;
                objArr5[objArr5.length - 1] = objArr5[0];
                k.X(objArr5, objArr5, 0, 1, i11 + 1);
            }
            this.f2821g[i11] = obj;
            this.f2820f = i8;
        } else {
            int B2 = B(i10 + this.f2820f);
            if (B < B2) {
                Object[] objArr6 = this.f2821g;
                k.X(objArr6, objArr6, B + 1, B, B2);
            } else {
                Object[] objArr7 = this.f2821g;
                k.X(objArr7, objArr7, 1, 0, B2);
                Object[] objArr8 = this.f2821g;
                objArr8[0] = objArr8[objArr8.length - 1];
                k.X(objArr8, objArr8, B + 1, B, objArr8.length - 1);
            }
            this.f2821g[B] = obj;
        }
        this.f2822h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        r6.k.f(collection, "elements");
        int i8 = this.f2822h;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == this.f2822h) {
            return addAll(collection);
        }
        C();
        w(collection.size() + this.f2822h);
        int B = B(this.f2822h + this.f2820f);
        int B2 = B(this.f2820f + i7);
        int size = collection.size();
        if (i7 >= ((this.f2822h + 1) >> 1)) {
            int i9 = B2 + size;
            if (B2 < B) {
                int i10 = size + B;
                Object[] objArr = this.f2821g;
                if (i10 <= objArr.length) {
                    k.X(objArr, objArr, i9, B2, B);
                } else if (i9 >= objArr.length) {
                    k.X(objArr, objArr, i9 - objArr.length, B2, B);
                } else {
                    int length = B - (i10 - objArr.length);
                    k.X(objArr, objArr, 0, length, B);
                    Object[] objArr2 = this.f2821g;
                    k.X(objArr2, objArr2, i9, B2, length);
                }
            } else {
                Object[] objArr3 = this.f2821g;
                k.X(objArr3, objArr3, size, 0, B);
                Object[] objArr4 = this.f2821g;
                if (i9 >= objArr4.length) {
                    k.X(objArr4, objArr4, i9 - objArr4.length, B2, objArr4.length);
                } else {
                    k.X(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f2821g;
                    k.X(objArr5, objArr5, i9, B2, objArr5.length - size);
                }
            }
            m(B2, collection);
            return true;
        }
        int i11 = this.f2820f;
        int i12 = i11 - size;
        if (B2 < i11) {
            Object[] objArr6 = this.f2821g;
            k.X(objArr6, objArr6, i12, i11, objArr6.length);
            if (size >= B2) {
                Object[] objArr7 = this.f2821g;
                k.X(objArr7, objArr7, objArr7.length - size, 0, B2);
            } else {
                Object[] objArr8 = this.f2821g;
                k.X(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f2821g;
                k.X(objArr9, objArr9, 0, size, B2);
            }
        } else if (i12 >= 0) {
            Object[] objArr10 = this.f2821g;
            k.X(objArr10, objArr10, i12, i11, B2);
        } else {
            Object[] objArr11 = this.f2821g;
            i12 += objArr11.length;
            int i13 = B2 - i11;
            int length2 = objArr11.length - i12;
            if (length2 >= i13) {
                k.X(objArr11, objArr11, i12, i11, B2);
            } else {
                k.X(objArr11, objArr11, i12, i11, i11 + length2);
                Object[] objArr12 = this.f2821g;
                k.X(objArr12, objArr12, 0, this.f2820f + length2, B2);
            }
        }
        this.f2820f = i12;
        m(z(B2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        C();
        w(this.f2822h + 1);
        int i7 = this.f2820f;
        if (i7 == 0) {
            Object[] objArr = this.f2821g;
            r6.k.f(objArr, "<this>");
            i7 = objArr.length;
        }
        int i8 = i7 - 1;
        this.f2820f = i8;
        this.f2821g[i8] = obj;
        this.f2822h++;
    }

    public final void addLast(Object obj) {
        C();
        w(a() + 1);
        this.f2821g[B(a() + this.f2820f)] = obj;
        this.f2822h = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            C();
            A(this.f2820f, B(a() + this.f2820f));
        }
        this.f2820f = 0;
        this.f2822h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2821g[this.f2820f];
    }

    @Override // e6.f
    public final Object g(int i7) {
        int i8 = this.f2822h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, i8, "index: ", ", size: "));
        }
        if (i7 == m.W(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        C();
        int B = B(this.f2820f + i7);
        Object[] objArr = this.f2821g;
        Object obj = objArr[B];
        if (i7 < (this.f2822h >> 1)) {
            int i9 = this.f2820f;
            if (B >= i9) {
                k.X(objArr, objArr, i9 + 1, i9, B);
            } else {
                k.X(objArr, objArr, 1, 0, B);
                Object[] objArr2 = this.f2821g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f2820f;
                k.X(objArr2, objArr2, i10 + 1, i10, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2821g;
            int i11 = this.f2820f;
            objArr3[i11] = null;
            this.f2820f = x(i11);
        } else {
            int B2 = B(m.W(this) + this.f2820f);
            if (B <= B2) {
                Object[] objArr4 = this.f2821g;
                k.X(objArr4, objArr4, B, B + 1, B2 + 1);
            } else {
                Object[] objArr5 = this.f2821g;
                k.X(objArr5, objArr5, B, B + 1, objArr5.length);
                Object[] objArr6 = this.f2821g;
                objArr6[objArr6.length - 1] = objArr6[0];
                k.X(objArr6, objArr6, 0, 1, B2 + 1);
            }
            this.f2821g[B2] = null;
        }
        this.f2822h--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int a3 = a();
        if (i7 < 0 || i7 >= a3) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, a3, "index: ", ", size: "));
        }
        return this.f2821g[B(this.f2820f + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int B = B(a() + this.f2820f);
        int i8 = this.f2820f;
        if (i8 < B) {
            while (i8 < B) {
                if (r6.k.a(obj, this.f2821g[i8])) {
                    i7 = this.f2820f;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 < B) {
            return -1;
        }
        int length = this.f2821g.length;
        while (true) {
            if (i8 >= length) {
                for (int i9 = 0; i9 < B; i9++) {
                    if (r6.k.a(obj, this.f2821g[i9])) {
                        i8 = i9 + this.f2821g.length;
                        i7 = this.f2820f;
                    }
                }
                return -1;
            }
            if (r6.k.a(obj, this.f2821g[i8])) {
                i7 = this.f2820f;
                break;
            }
            i8++;
        }
        return i8 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f2821g[B(m.W(this) + this.f2820f)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int B = B(this.f2822h + this.f2820f);
        int i8 = this.f2820f;
        if (i8 < B) {
            length = B - 1;
            if (i8 <= length) {
                while (!r6.k.a(obj, this.f2821g[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f2820f;
                return length - i7;
            }
            return -1;
        }
        if (i8 > B) {
            int i9 = B - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f2821g;
                    r6.k.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f2820f;
                    if (i10 <= length) {
                        while (!r6.k.a(obj, this.f2821g[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i7 = this.f2820f;
                    }
                } else {
                    if (r6.k.a(obj, this.f2821g[i9])) {
                        length = i9 + this.f2821g.length;
                        i7 = this.f2820f;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    public final void m(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2821g.length;
        while (i7 < length && it.hasNext()) {
            this.f2821g[i7] = it.next();
            i7++;
        }
        int i8 = this.f2820f;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f2821g[i9] = it.next();
        }
        this.f2822h = collection.size() + this.f2822h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        g(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int B;
        r6.k.f(collection, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f2821g.length != 0) {
            int B2 = B(a() + this.f2820f);
            int i7 = this.f2820f;
            if (i7 < B2) {
                B = i7;
                while (i7 < B2) {
                    Object obj = this.f2821g[i7];
                    if (collection.contains(obj)) {
                        z8 = true;
                    } else {
                        this.f2821g[B] = obj;
                        B++;
                    }
                    i7++;
                }
                k.c0(B, B2, null, this.f2821g);
            } else {
                int length = this.f2821g.length;
                boolean z9 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f2821g;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z9 = true;
                    } else {
                        this.f2821g[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                B = B(i8);
                for (int i9 = 0; i9 < B2; i9++) {
                    Object[] objArr2 = this.f2821g;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z9 = true;
                    } else {
                        this.f2821g[B] = obj3;
                        B = x(B);
                    }
                }
                z8 = z9;
            }
            if (z8) {
                C();
                this.f2822h = z(B - this.f2820f);
            }
        }
        return z8;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        C();
        Object[] objArr = this.f2821g;
        int i7 = this.f2820f;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f2820f = x(i7);
        this.f2822h = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        C();
        int B = B(m.W(this) + this.f2820f);
        Object[] objArr = this.f2821g;
        Object obj = objArr[B];
        objArr[B] = null;
        this.f2822h = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        j1.c.O(i7, i8, this.f2822h);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f2822h) {
            clear();
            return;
        }
        if (i9 == 1) {
            g(i7);
            return;
        }
        C();
        if (i7 < this.f2822h - i8) {
            int B = B((i7 - 1) + this.f2820f);
            int B2 = B((i8 - 1) + this.f2820f);
            while (i7 > 0) {
                int i10 = B + 1;
                int min = Math.min(i7, Math.min(i10, B2 + 1));
                Object[] objArr = this.f2821g;
                int i11 = B2 - min;
                int i12 = B - min;
                k.X(objArr, objArr, i11 + 1, i12 + 1, i10);
                B = z(i12);
                B2 = z(i11);
                i7 -= min;
            }
            int B3 = B(this.f2820f + i9);
            A(this.f2820f, B3);
            this.f2820f = B3;
        } else {
            int B4 = B(this.f2820f + i8);
            int B5 = B(this.f2820f + i7);
            int i13 = this.f2822h;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2821g;
                i8 = Math.min(i13, Math.min(objArr2.length - B4, objArr2.length - B5));
                Object[] objArr3 = this.f2821g;
                int i14 = B4 + i8;
                k.X(objArr3, objArr3, B5, B4, i14);
                B4 = B(i14);
                B5 = B(B5 + i8);
            }
            int B6 = B(this.f2822h + this.f2820f);
            A(z(B6 - i9), B6);
        }
        this.f2822h -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int B;
        r6.k.f(collection, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f2821g.length != 0) {
            int B2 = B(a() + this.f2820f);
            int i7 = this.f2820f;
            if (i7 < B2) {
                B = i7;
                while (i7 < B2) {
                    Object obj = this.f2821g[i7];
                    if (collection.contains(obj)) {
                        this.f2821g[B] = obj;
                        B++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                k.c0(B, B2, null, this.f2821g);
            } else {
                int length = this.f2821g.length;
                boolean z9 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f2821g;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f2821g[i8] = obj2;
                        i8++;
                    } else {
                        z9 = true;
                    }
                    i7++;
                }
                B = B(i8);
                for (int i9 = 0; i9 < B2; i9++) {
                    Object[] objArr2 = this.f2821g;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f2821g[B] = obj3;
                        B = x(B);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                C();
                this.f2822h = z(B - this.f2820f);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int a3 = a();
        if (i7 < 0 || i7 >= a3) {
            throw new IndexOutOfBoundsException(r6.i.b(i7, a3, "index: ", ", size: "));
        }
        int B = B(this.f2820f + i7);
        Object[] objArr = this.f2821g;
        Object obj2 = objArr[B];
        objArr[B] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public final void w(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2821g;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f2819i) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f2821g = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i8 = length + (length >> 1);
        if (i8 - i7 < 0) {
            i8 = i7;
        }
        if (i8 - 2147483639 > 0) {
            i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i8];
        k.X(objArr, objArr2, 0, this.f2820f, objArr.length);
        Object[] objArr3 = this.f2821g;
        int length2 = objArr3.length;
        int i9 = this.f2820f;
        k.X(objArr3, objArr2, length2 - i9, 0, i9);
        this.f2820f = 0;
        this.f2821g = objArr2;
    }

    public final int x(int i7) {
        r6.k.f(this.f2821g, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final Object y() {
        if (isEmpty()) {
            return null;
        }
        return this.f2821g[B(m.W(this) + this.f2820f)];
    }

    public final int z(int i7) {
        return i7 < 0 ? i7 + this.f2821g.length : i7;
    }

    public j(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = f2819i;
        } else if (i7 > 0) {
            objArr = new Object[i7];
        } else {
            throw new IllegalArgumentException(a0.m.i("Illegal Capacity: ", i7));
        }
        this.f2821g = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        r6.k.f(objArr, "array");
        int length = objArr.length;
        int i7 = this.f2822h;
        if (length < i7) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            r6.k.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int B = B(this.f2822h + this.f2820f);
        int i8 = this.f2820f;
        if (i8 < B) {
            k.Z(this.f2821g, objArr, i8, B, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2821g;
            k.X(objArr2, objArr, 0, this.f2820f, objArr2.length);
            Object[] objArr3 = this.f2821g;
            k.X(objArr3, objArr, objArr3.length - this.f2820f, 0, B);
        }
        int i9 = this.f2822h;
        if (i9 < objArr.length) {
            objArr[i9] = null;
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
        r6.k.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        C();
        w(collection.size() + a());
        m(B(a() + this.f2820f), collection);
        return true;
    }
}
