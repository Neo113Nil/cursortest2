package l5;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: l5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504h extends AbstractC0501e {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f5298i = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public int f5299f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f5300g = f5298i;

    /* renamed from: h, reason: collision with root package name */
    public int f5301h;

    @Override // l5.AbstractC0501e
    public final int a() {
        return this.f5301h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int i9 = this.f5301h;
        if (i7 < 0 || i7 > i9) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i9, "index: ", ", size: "));
        }
        if (i7 == i9) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f5301h + 1);
        int h7 = h(this.f5299f + i7);
        int i10 = this.f5301h;
        if (i7 < ((i10 + 1) >> 1)) {
            if (h7 == 0) {
                Object[] objArr = this.f5300g;
                kotlin.jvm.internal.i.e(objArr, "<this>");
                h7 = objArr.length;
            }
            int i11 = h7 - 1;
            int i12 = this.f5299f;
            if (i12 == 0) {
                Object[] objArr2 = this.f5300g;
                kotlin.jvm.internal.i.e(objArr2, "<this>");
                i8 = objArr2.length - 1;
            } else {
                i8 = i12 - 1;
            }
            int i13 = this.f5299f;
            if (i11 >= i13) {
                Object[] objArr3 = this.f5300g;
                objArr3[i8] = objArr3[i13];
                AbstractC0505i.G(objArr3, objArr3, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr4 = this.f5300g;
                AbstractC0505i.G(objArr4, objArr4, i13 - 1, i13, objArr4.length);
                Object[] objArr5 = this.f5300g;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0505i.G(objArr5, objArr5, 0, 1, i11 + 1);
            }
            this.f5300g[i11] = obj;
            this.f5299f = i8;
        } else {
            int h8 = h(i10 + this.f5299f);
            if (h7 < h8) {
                Object[] objArr6 = this.f5300g;
                AbstractC0505i.G(objArr6, objArr6, h7 + 1, h7, h8);
            } else {
                Object[] objArr7 = this.f5300g;
                AbstractC0505i.G(objArr7, objArr7, 1, 0, h8);
                Object[] objArr8 = this.f5300g;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0505i.G(objArr8, objArr8, h7 + 1, h7, objArr8.length - 1);
            }
            this.f5300g[h7] = obj;
        }
        this.f5301h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i8 = this.f5301h;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == this.f5301h) {
            return addAll(elements);
        }
        i();
        d(elements.size() + this.f5301h);
        int h7 = h(this.f5301h + this.f5299f);
        int h8 = h(this.f5299f + i7);
        int size = elements.size();
        if (i7 >= ((this.f5301h + 1) >> 1)) {
            int i9 = h8 + size;
            if (h8 < h7) {
                int i10 = size + h7;
                Object[] objArr = this.f5300g;
                if (i10 <= objArr.length) {
                    AbstractC0505i.G(objArr, objArr, i9, h8, h7);
                } else if (i9 >= objArr.length) {
                    AbstractC0505i.G(objArr, objArr, i9 - objArr.length, h8, h7);
                } else {
                    int length = h7 - (i10 - objArr.length);
                    AbstractC0505i.G(objArr, objArr, 0, length, h7);
                    Object[] objArr2 = this.f5300g;
                    AbstractC0505i.G(objArr2, objArr2, i9, h8, length);
                }
            } else {
                Object[] objArr3 = this.f5300g;
                AbstractC0505i.G(objArr3, objArr3, size, 0, h7);
                Object[] objArr4 = this.f5300g;
                if (i9 >= objArr4.length) {
                    AbstractC0505i.G(objArr4, objArr4, i9 - objArr4.length, h8, objArr4.length);
                } else {
                    AbstractC0505i.G(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f5300g;
                    AbstractC0505i.G(objArr5, objArr5, i9, h8, objArr5.length - size);
                }
            }
            c(h8, elements);
            return true;
        }
        int i11 = this.f5299f;
        int i12 = i11 - size;
        if (h8 < i11) {
            Object[] objArr6 = this.f5300g;
            AbstractC0505i.G(objArr6, objArr6, i12, i11, objArr6.length);
            if (size >= h8) {
                Object[] objArr7 = this.f5300g;
                AbstractC0505i.G(objArr7, objArr7, objArr7.length - size, 0, h8);
            } else {
                Object[] objArr8 = this.f5300g;
                AbstractC0505i.G(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f5300g;
                AbstractC0505i.G(objArr9, objArr9, 0, size, h8);
            }
        } else if (i12 >= 0) {
            Object[] objArr10 = this.f5300g;
            AbstractC0505i.G(objArr10, objArr10, i12, i11, h8);
        } else {
            Object[] objArr11 = this.f5300g;
            i12 += objArr11.length;
            int i13 = h8 - i11;
            int length2 = objArr11.length - i12;
            if (length2 >= i13) {
                AbstractC0505i.G(objArr11, objArr11, i12, i11, h8);
            } else {
                AbstractC0505i.G(objArr11, objArr11, i12, i11, i11 + length2);
                Object[] objArr12 = this.f5300g;
                AbstractC0505i.G(objArr12, objArr12, 0, this.f5299f + length2, h8);
            }
        }
        this.f5299f = i12;
        c(f(h8 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f5301h + 1);
        int i7 = this.f5299f;
        if (i7 == 0) {
            Object[] objArr = this.f5300g;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i8 = i7 - 1;
        this.f5299f = i8;
        this.f5300g[i8] = obj;
        this.f5301h++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.f5300g[h(a() + this.f5299f)] = obj;
        this.f5301h = a() + 1;
    }

    @Override // l5.AbstractC0501e
    public final Object b(int i7) {
        int i8 = this.f5301h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        if (i7 == AbstractC0507k.y(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        i();
        int h7 = h(this.f5299f + i7);
        Object[] objArr = this.f5300g;
        Object obj = objArr[h7];
        if (i7 < (this.f5301h >> 1)) {
            int i9 = this.f5299f;
            if (h7 >= i9) {
                AbstractC0505i.G(objArr, objArr, i9 + 1, i9, h7);
            } else {
                AbstractC0505i.G(objArr, objArr, 1, 0, h7);
                Object[] objArr2 = this.f5300g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f5299f;
                AbstractC0505i.G(objArr2, objArr2, i10 + 1, i10, objArr2.length - 1);
            }
            Object[] objArr3 = this.f5300g;
            int i11 = this.f5299f;
            objArr3[i11] = null;
            this.f5299f = e(i11);
        } else {
            int h8 = h(AbstractC0507k.y(this) + this.f5299f);
            if (h7 <= h8) {
                Object[] objArr4 = this.f5300g;
                AbstractC0505i.G(objArr4, objArr4, h7, h7 + 1, h8 + 1);
            } else {
                Object[] objArr5 = this.f5300g;
                AbstractC0505i.G(objArr5, objArr5, h7, h7 + 1, objArr5.length);
                Object[] objArr6 = this.f5300g;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0505i.G(objArr6, objArr6, 0, 1, h8 + 1);
            }
            this.f5300g[h8] = null;
        }
        this.f5301h--;
        return obj;
    }

    public final void c(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f5300g.length;
        while (i7 < length && it.hasNext()) {
            this.f5300g[i7] = it.next();
            i7++;
        }
        int i8 = this.f5299f;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f5300g[i9] = it.next();
        }
        this.f5301h = collection.size() + this.f5301h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f5299f, h(a() + this.f5299f));
        }
        this.f5299f = 0;
        this.f5301h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f5300g;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f5298i) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f5300g = new Object[i7];
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
        AbstractC0505i.G(objArr, objArr2, 0, this.f5299f, objArr.length);
        Object[] objArr3 = this.f5300g;
        int length2 = objArr3.length;
        int i9 = this.f5299f;
        AbstractC0505i.G(objArr3, objArr2, length2 - i9, 0, i9);
        this.f5299f = 0;
        this.f5300g = objArr2;
    }

    public final int e(int i7) {
        kotlin.jvm.internal.i.e(this.f5300g, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final int f(int i7) {
        return i7 < 0 ? i7 + this.f5300g.length : i7;
    }

    public final void g(int i7, int i8) {
        if (i7 < i8) {
            AbstractC0505i.J(i7, i8, this.f5300g);
            return;
        }
        Object[] objArr = this.f5300g;
        AbstractC0505i.J(i7, objArr.length, objArr);
        AbstractC0505i.J(0, i8, this.f5300g);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int a7 = a();
        if (i7 < 0 || i7 >= a7) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, a7, "index: ", ", size: "));
        }
        return this.f5300g[h(this.f5299f + i7)];
    }

    public final int h(int i7) {
        Object[] objArr = this.f5300g;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int h7 = h(a() + this.f5299f);
        int i8 = this.f5299f;
        if (i8 < h7) {
            while (i8 < h7) {
                if (kotlin.jvm.internal.i.a(obj, this.f5300g[i8])) {
                    i7 = this.f5299f;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 < h7) {
            return -1;
        }
        int length = this.f5300g.length;
        while (true) {
            if (i8 >= length) {
                for (int i9 = 0; i9 < h7; i9++) {
                    if (kotlin.jvm.internal.i.a(obj, this.f5300g[i9])) {
                        i8 = i9 + this.f5300g.length;
                        i7 = this.f5299f;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.i.a(obj, this.f5300g[i8])) {
                i7 = this.f5299f;
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

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int h7 = h(this.f5301h + this.f5299f);
        int i8 = this.f5299f;
        if (i8 < h7) {
            length = h7 - 1;
            if (i8 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f5300g[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f5299f;
                return length - i7;
            }
            return -1;
        }
        if (i8 > h7) {
            int i9 = h7 - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f5300g;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f5299f;
                    if (i10 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f5300g[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i7 = this.f5299f;
                    }
                } else {
                    if (kotlin.jvm.internal.i.a(obj, this.f5300g[i9])) {
                        length = i9 + this.f5300g.length;
                        i7 = this.f5299f;
                        break;
                    }
                    i9--;
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
    public final boolean removeAll(Collection elements) {
        int h7;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f5300g.length != 0) {
            int h8 = h(this.f5301h + this.f5299f);
            int i7 = this.f5299f;
            if (i7 < h8) {
                h7 = i7;
                while (i7 < h8) {
                    Object obj = this.f5300g[i7];
                    if (elements.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f5300g[h7] = obj;
                        h7++;
                    }
                    i7++;
                }
                AbstractC0505i.J(h7, h8, this.f5300g);
            } else {
                int length = this.f5300g.length;
                boolean z6 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f5300g;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.f5300g[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                h7 = h(i8);
                for (int i9 = 0; i9 < h8; i9++) {
                    Object[] objArr2 = this.f5300g;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.f5300g[h7] = obj3;
                        h7 = e(h7);
                    }
                }
                z5 = z6;
            }
            if (z5) {
                i();
                this.f5301h = f(h7 - this.f5299f);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f5300g;
        int i7 = this.f5299f;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f5299f = e(i7);
        this.f5301h = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h7 = h(AbstractC0507k.y(this) + this.f5299f);
        Object[] objArr = this.f5300g;
        Object obj = objArr[h7];
        objArr[h7] = null;
        this.f5301h = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        i6.g.h(i7, i8, this.f5301h);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f5301h) {
            clear();
            return;
        }
        if (i9 == 1) {
            b(i7);
            return;
        }
        i();
        if (i7 < this.f5301h - i8) {
            int h7 = h(this.f5299f + (i7 - 1));
            int h8 = h(this.f5299f + (i8 - 1));
            while (i7 > 0) {
                int i10 = h7 + 1;
                int min = Math.min(i7, Math.min(i10, h8 + 1));
                Object[] objArr = this.f5300g;
                int i11 = h8 - min;
                int i12 = h7 - min;
                AbstractC0505i.G(objArr, objArr, i11 + 1, i12 + 1, i10);
                h7 = f(i12);
                h8 = f(i11);
                i7 -= min;
            }
            int h9 = h(this.f5299f + i9);
            g(this.f5299f, h9);
            this.f5299f = h9;
        } else {
            int h10 = h(this.f5299f + i8);
            int h11 = h(this.f5299f + i7);
            int i13 = this.f5301h;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f5300g;
                i8 = Math.min(i13, Math.min(objArr2.length - h10, objArr2.length - h11));
                Object[] objArr3 = this.f5300g;
                int i14 = h10 + i8;
                AbstractC0505i.G(objArr3, objArr3, h11, h10, i14);
                h10 = h(i14);
                h11 = h(h11 + i8);
            }
            int h12 = h(this.f5301h + this.f5299f);
            g(f(h12 - i9), h12);
        }
        this.f5301h -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int h7;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f5300g.length != 0) {
            int h8 = h(this.f5301h + this.f5299f);
            int i7 = this.f5299f;
            if (i7 < h8) {
                h7 = i7;
                while (i7 < h8) {
                    Object obj = this.f5300g[i7];
                    if (elements.contains(obj)) {
                        this.f5300g[h7] = obj;
                        h7++;
                    } else {
                        z5 = true;
                    }
                    i7++;
                }
                AbstractC0505i.J(h7, h8, this.f5300g);
            } else {
                int length = this.f5300g.length;
                boolean z6 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f5300g;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f5300g[i8] = obj2;
                        i8++;
                    } else {
                        z6 = true;
                    }
                    i7++;
                }
                h7 = h(i8);
                for (int i9 = 0; i9 < h8; i9++) {
                    Object[] objArr2 = this.f5300g;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        this.f5300g[h7] = obj3;
                        h7 = e(h7);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                i();
                this.f5301h = f(h7 - this.f5299f);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int a7 = a();
        if (i7 < 0 || i7 >= a7) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, a7, "index: ", ", size: "));
        }
        int h7 = h(this.f5299f + i7);
        Object[] objArr = this.f5300g;
        Object obj2 = objArr[h7];
        objArr[h7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i7 = this.f5301h;
        if (length < i7) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i7);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int h7 = h(this.f5301h + this.f5299f);
        int i8 = this.f5299f;
        if (i8 < h7) {
            AbstractC0505i.G(this.f5300g, array, 0, i8, h7);
        } else if (!isEmpty()) {
            Object[] objArr = this.f5300g;
            AbstractC0505i.G(objArr, array, 0, this.f5299f, objArr.length);
            Object[] objArr2 = this.f5300g;
            AbstractC0505i.G(objArr2, array, objArr2.length - this.f5299f, 0, h7);
        }
        int i9 = this.f5301h;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        i();
        d(elements.size() + a());
        c(h(a() + this.f5299f), elements);
        return true;
    }
}
