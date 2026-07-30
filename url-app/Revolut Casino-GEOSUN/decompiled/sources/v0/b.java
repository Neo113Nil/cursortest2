package v0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends AbstractList implements List {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f3008h = new Object[0];

    /* renamed from: e, reason: collision with root package name */
    public int f3009e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3010f = f3008h;

    /* renamed from: g, reason: collision with root package name */
    public int f3011g;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f3010f.length;
        while (i2 < length && it.hasNext()) {
            this.f3010f[i2] = it.next();
            i2++;
        }
        int i3 = this.f3009e;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f3010f[i4] = it.next();
        }
        this.f3011g = collection.size() + this.f3011g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f3011g;
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
        g();
        b(this.f3011g + 1);
        int f2 = f(this.f3009e + i2);
        int i5 = this.f3011g;
        if (i2 < ((i5 + 1) >> 1)) {
            if (f2 == 0) {
                Object[] objArr = this.f3010f;
                F0.i.e(objArr, "<this>");
                f2 = objArr.length;
            }
            int i6 = f2 - 1;
            int i7 = this.f3009e;
            if (i7 == 0) {
                Object[] objArr2 = this.f3010f;
                F0.i.e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i7 - 1;
            }
            int i8 = this.f3009e;
            if (i6 >= i8) {
                Object[] objArr3 = this.f3010f;
                objArr3[i3] = objArr3[i8];
                c.B(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.f3010f;
                c.B(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.f3010f;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.B(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f3010f[i6] = obj;
            this.f3009e = i3;
        } else {
            int f3 = f(this.f3009e + i5);
            if (f2 < f3) {
                Object[] objArr6 = this.f3010f;
                c.B(objArr6, objArr6, f2 + 1, f2, f3);
            } else {
                Object[] objArr7 = this.f3010f;
                c.B(objArr7, objArr7, 1, 0, f3);
                Object[] objArr8 = this.f3010f;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.B(objArr8, objArr8, f2 + 1, f2, objArr8.length - 1);
            }
            this.f3010f[f2] = obj;
        }
        this.f3011g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        F0.i.e(collection, "elements");
        int i3 = this.f3011g;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.f3011g) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.f3011g);
        int f2 = f(this.f3009e + this.f3011g);
        int f3 = f(this.f3009e + i2);
        int size = collection.size();
        if (i2 < ((this.f3011g + 1) >> 1)) {
            int i4 = this.f3009e;
            int i5 = i4 - size;
            if (f3 < i4) {
                Object[] objArr = this.f3010f;
                c.B(objArr, objArr, i5, i4, objArr.length);
                if (size >= f3) {
                    Object[] objArr2 = this.f3010f;
                    c.B(objArr2, objArr2, objArr2.length - size, 0, f3);
                } else {
                    Object[] objArr3 = this.f3010f;
                    c.B(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f3010f;
                    c.B(objArr4, objArr4, 0, size, f3);
                }
            } else if (i5 >= 0) {
                Object[] objArr5 = this.f3010f;
                c.B(objArr5, objArr5, i5, i4, f3);
            } else {
                Object[] objArr6 = this.f3010f;
                i5 += objArr6.length;
                int i6 = f3 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    c.B(objArr6, objArr6, i5, i4, f3);
                } else {
                    c.B(objArr6, objArr6, i5, i4, i4 + length);
                    Object[] objArr7 = this.f3010f;
                    c.B(objArr7, objArr7, 0, this.f3009e + length, f3);
                }
            }
            this.f3009e = i5;
            a(d(f3 - size), collection);
        } else {
            int i7 = f3 + size;
            if (f3 < f2) {
                int i8 = size + f2;
                Object[] objArr8 = this.f3010f;
                if (i8 <= objArr8.length) {
                    c.B(objArr8, objArr8, i7, f3, f2);
                } else if (i7 >= objArr8.length) {
                    c.B(objArr8, objArr8, i7 - objArr8.length, f3, f2);
                } else {
                    int length2 = f2 - (i8 - objArr8.length);
                    c.B(objArr8, objArr8, 0, length2, f2);
                    Object[] objArr9 = this.f3010f;
                    c.B(objArr9, objArr9, i7, f3, length2);
                }
            } else {
                Object[] objArr10 = this.f3010f;
                c.B(objArr10, objArr10, size, 0, f2);
                Object[] objArr11 = this.f3010f;
                if (i7 >= objArr11.length) {
                    c.B(objArr11, objArr11, i7 - objArr11.length, f3, objArr11.length);
                } else {
                    c.B(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f3010f;
                    c.B(objArr12, objArr12, i7, f3, objArr12.length - size);
                }
            }
            a(f3, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f3011g + 1);
        int i2 = this.f3009e;
        if (i2 == 0) {
            Object[] objArr = this.f3010f;
            F0.i.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f3009e = i3;
        this.f3010f[i3] = obj;
        this.f3011g++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f3011g + 1);
        this.f3010f[f(this.f3009e + this.f3011g)] = obj;
        this.f3011g++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f3010f;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f3008h) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f3010f = new Object[i2];
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
        c.B(objArr, objArr2, 0, this.f3009e, objArr.length);
        Object[] objArr3 = this.f3010f;
        int length2 = objArr3.length;
        int i4 = this.f3009e;
        c.B(objArr3, objArr2, length2 - i4, 0, i4);
        this.f3009e = 0;
        this.f3010f = objArr2;
    }

    public final int c(int i2) {
        F0.i.e(this.f3010f, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f3009e, f(this.f3009e + this.f3011g));
        }
        this.f3009e = 0;
        this.f3011g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        return i2 < 0 ? i2 + this.f3010f.length : i2;
    }

    public final void e(int i2, int i3) {
        if (i2 < i3) {
            Object[] objArr = this.f3010f;
            F0.i.e(objArr, "<this>");
            Arrays.fill(objArr, i2, i3, (Object) null);
        } else {
            Object[] objArr2 = this.f3010f;
            Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
            Object[] objArr3 = this.f3010f;
            F0.i.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i3, (Object) null);
        }
    }

    public final int f(int i2) {
        Object[] objArr = this.f3010f;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f3011g;
        if (i2 >= 0 && i2 < i3) {
            return this.f3010f[f(this.f3009e + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int f2 = f(this.f3009e + this.f3011g);
        int i3 = this.f3009e;
        if (i3 < f2) {
            while (i3 < f2) {
                if (F0.i.a(obj, this.f3010f[i3])) {
                    i2 = this.f3009e;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < f2) {
            return -1;
        }
        int length = this.f3010f.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < f2; i4++) {
                    if (F0.i.a(obj, this.f3010f[i4])) {
                        i3 = i4 + this.f3010f.length;
                        i2 = this.f3009e;
                    }
                }
                return -1;
            }
            if (F0.i.a(obj, this.f3010f[i3])) {
                i2 = this.f3009e;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3011g == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int f2 = f(this.f3009e + this.f3011g);
        int i3 = this.f3009e;
        if (i3 < f2) {
            length = f2 - 1;
            if (i3 <= length) {
                while (!F0.i.a(obj, this.f3010f[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f3009e;
                return length - i2;
            }
            return -1;
        }
        if (i3 > f2) {
            int i4 = f2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f3010f;
                    F0.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f3009e;
                    if (i5 <= length) {
                        while (!F0.i.a(obj, this.f3010f[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f3009e;
                    }
                } else {
                    if (F0.i.a(obj, this.f3010f[i4])) {
                        length = i4 + this.f3010f.length;
                        i2 = this.f3009e;
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
        int i3 = this.f3011g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        g();
        int f2 = f(this.f3009e + i2);
        Object[] objArr = this.f3010f;
        Object obj = objArr[f2];
        if (i2 < (this.f3011g >> 1)) {
            int i4 = this.f3009e;
            if (f2 >= i4) {
                c.B(objArr, objArr, i4 + 1, i4, f2);
            } else {
                c.B(objArr, objArr, 1, 0, f2);
                Object[] objArr2 = this.f3010f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f3009e;
                c.B(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f3010f;
            int i6 = this.f3009e;
            objArr3[i6] = null;
            this.f3009e = c(i6);
        } else {
            int f3 = f((size() - 1) + this.f3009e);
            if (f2 <= f3) {
                Object[] objArr4 = this.f3010f;
                c.B(objArr4, objArr4, f2, f2 + 1, f3 + 1);
            } else {
                Object[] objArr5 = this.f3010f;
                c.B(objArr5, objArr5, f2, f2 + 1, objArr5.length);
                Object[] objArr6 = this.f3010f;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.B(objArr6, objArr6, 0, 1, f3 + 1);
            }
            this.f3010f[f3] = null;
        }
        this.f3011g--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f2;
        F0.i.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f3010f.length != 0) {
            int f3 = f(this.f3009e + this.f3011g);
            int i2 = this.f3009e;
            if (i2 < f3) {
                f2 = i2;
                while (i2 < f3) {
                    Object obj = this.f3010f[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f3010f[f2] = obj;
                        f2++;
                    }
                    i2++;
                }
                Object[] objArr = this.f3010f;
                F0.i.e(objArr, "<this>");
                Arrays.fill(objArr, f2, f3, (Object) null);
            } else {
                int length = this.f3010f.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f3010f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f3010f[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                f2 = f(i3);
                for (int i4 = 0; i4 < f3; i4++) {
                    Object[] objArr3 = this.f3010f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f3010f[f2] = obj3;
                        f2 = c(f2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f3011g = d(f2 - this.f3009e);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f3010f;
        int i2 = this.f3009e;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f3009e = c(i2);
        this.f3011g--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f2 = f((size() - 1) + this.f3009e);
        Object[] objArr = this.f3010f;
        Object obj = objArr[f2];
        objArr[f2] = null;
        this.f3011g--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        int i4 = this.f3011g;
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
        }
        int i5 = i3 - i2;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.f3011g) {
            clear();
            return;
        }
        if (i5 == 1) {
            remove(i2);
            return;
        }
        g();
        if (i2 < this.f3011g - i3) {
            int f2 = f((i2 - 1) + this.f3009e);
            int f3 = f((i3 - 1) + this.f3009e);
            while (i2 > 0) {
                int i6 = f2 + 1;
                int min = Math.min(i2, Math.min(i6, f3 + 1));
                Object[] objArr = this.f3010f;
                int i7 = f3 - min;
                int i8 = f2 - min;
                c.B(objArr, objArr, i7 + 1, i8 + 1, i6);
                f2 = d(i8);
                f3 = d(i7);
                i2 -= min;
            }
            int f4 = f(this.f3009e + i5);
            e(this.f3009e, f4);
            this.f3009e = f4;
        } else {
            int f5 = f(this.f3009e + i3);
            int f6 = f(this.f3009e + i2);
            int i9 = this.f3011g;
            while (true) {
                i9 -= i3;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f3010f;
                i3 = Math.min(i9, Math.min(objArr2.length - f5, objArr2.length - f6));
                Object[] objArr3 = this.f3010f;
                int i10 = f5 + i3;
                c.B(objArr3, objArr3, f6, f5, i10);
                f5 = f(i10);
                f6 = f(f6 + i3);
            }
            int f7 = f(this.f3009e + this.f3011g);
            e(d(f7 - i5), f7);
        }
        this.f3011g -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f2;
        F0.i.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f3010f.length != 0) {
            int f3 = f(this.f3009e + this.f3011g);
            int i2 = this.f3009e;
            if (i2 < f3) {
                f2 = i2;
                while (i2 < f3) {
                    Object obj = this.f3010f[i2];
                    if (collection.contains(obj)) {
                        this.f3010f[f2] = obj;
                        f2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f3010f;
                F0.i.e(objArr, "<this>");
                Arrays.fill(objArr, f2, f3, (Object) null);
            } else {
                int length = this.f3010f.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f3010f;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f3010f[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                f2 = f(i3);
                for (int i4 = 0; i4 < f3; i4++) {
                    Object[] objArr3 = this.f3010f;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f3010f[f2] = obj3;
                        f2 = c(f2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f3011g = d(f2 - this.f3009e);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f3011g;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int f2 = f(this.f3009e + i2);
        Object[] objArr = this.f3010f;
        Object obj2 = objArr[f2];
        objArr[f2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3011g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f3011g]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        F0.i.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f3011g;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            F0.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f2 = f(this.f3009e + this.f3011g);
        int i3 = this.f3009e;
        if (i3 < f2) {
            c.B(this.f3010f, objArr, 0, i3, f2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f3010f;
            c.B(objArr2, objArr, 0, this.f3009e, objArr2.length);
            Object[] objArr3 = this.f3010f;
            c.B(objArr3, objArr, objArr3.length - this.f3009e, 0, f2);
        }
        int i4 = this.f3011g;
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
        F0.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f3011g);
        a(f(this.f3009e + this.f3011g), collection);
        return true;
    }
}
