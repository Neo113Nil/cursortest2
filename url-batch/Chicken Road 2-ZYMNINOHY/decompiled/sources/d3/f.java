package d3;

import E.AbstractC0005f;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* loaded from: classes.dex */
public final class f extends AbstractList implements List, InterfaceC1349a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f8326d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f8327a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8328b = f8326d;

    /* renamed from: c, reason: collision with root package name */
    public int f8329c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i6 = this.f8329c;
        if (i4 < 0 || i4 > i6) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i6, "index: ", ", size: "));
        }
        if (i4 == i6) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        h();
        c(this.f8329c + 1);
        int g4 = g(this.f8327a + i4);
        int i7 = this.f8329c;
        if (i4 < ((i7 + 1) >> 1)) {
            if (g4 == 0) {
                Object[] objArr = this.f8328b;
                kotlin.jvm.internal.i.e(objArr, "<this>");
                g4 = objArr.length;
            }
            int i8 = g4 - 1;
            int i9 = this.f8327a;
            if (i9 == 0) {
                Object[] objArr2 = this.f8328b;
                kotlin.jvm.internal.i.e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f8327a;
            if (i8 >= i10) {
                Object[] objArr3 = this.f8328b;
                objArr3[i5] = objArr3[i10];
                g.Q(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f8328b;
                g.Q(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f8328b;
                objArr5[objArr5.length - 1] = objArr5[0];
                g.Q(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f8328b[i8] = obj;
            this.f8327a = i5;
        } else {
            int g5 = g(this.f8327a + i7);
            if (g4 < g5) {
                Object[] objArr6 = this.f8328b;
                g.Q(g4 + 1, g4, g5, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f8328b;
                g.Q(1, 0, g5, objArr7, objArr7);
                Object[] objArr8 = this.f8328b;
                objArr8[0] = objArr8[objArr8.length - 1];
                g.Q(g4 + 1, g4, objArr8.length - 1, objArr8, objArr8);
            }
            this.f8328b[g4] = obj;
        }
        this.f8329c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i5 = this.f8329c;
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i4 == this.f8329c) {
            return addAll(elements);
        }
        h();
        c(elements.size() + this.f8329c);
        int g4 = g(this.f8327a + this.f8329c);
        int g5 = g(this.f8327a + i4);
        int size = elements.size();
        if (i4 >= ((this.f8329c + 1) >> 1)) {
            int i6 = g5 + size;
            if (g5 < g4) {
                int i7 = size + g4;
                Object[] objArr = this.f8328b;
                if (i7 <= objArr.length) {
                    g.Q(i6, g5, g4, objArr, objArr);
                } else if (i6 >= objArr.length) {
                    g.Q(i6 - objArr.length, g5, g4, objArr, objArr);
                } else {
                    int length = g4 - (i7 - objArr.length);
                    g.Q(0, length, g4, objArr, objArr);
                    Object[] objArr2 = this.f8328b;
                    g.Q(i6, g5, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f8328b;
                g.Q(size, 0, g4, objArr3, objArr3);
                Object[] objArr4 = this.f8328b;
                if (i6 >= objArr4.length) {
                    g.Q(i6 - objArr4.length, g5, objArr4.length, objArr4, objArr4);
                } else {
                    g.Q(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f8328b;
                    g.Q(i6, g5, objArr5.length - size, objArr5, objArr5);
                }
            }
            b(g5, elements);
            return true;
        }
        int i8 = this.f8327a;
        int i9 = i8 - size;
        if (g5 < i8) {
            Object[] objArr6 = this.f8328b;
            g.Q(i9, i8, objArr6.length, objArr6, objArr6);
            if (size >= g5) {
                Object[] objArr7 = this.f8328b;
                g.Q(objArr7.length - size, 0, g5, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f8328b;
                g.Q(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f8328b;
                g.Q(0, size, g5, objArr9, objArr9);
            }
        } else if (i9 >= 0) {
            Object[] objArr10 = this.f8328b;
            g.Q(i9, i8, g5, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f8328b;
            i9 += objArr11.length;
            int i10 = g5 - i8;
            int length2 = objArr11.length - i9;
            if (length2 >= i10) {
                g.Q(i9, i8, g5, objArr11, objArr11);
            } else {
                g.Q(i9, i8, i8 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f8328b;
                g.Q(0, this.f8327a + length2, g5, objArr12, objArr12);
            }
        }
        this.f8327a = i9;
        b(e(g5 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        h();
        c(this.f8329c + 1);
        int i4 = this.f8327a;
        if (i4 == 0) {
            Object[] objArr = this.f8328b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f8327a = i5;
        this.f8328b[i5] = obj;
        this.f8329c++;
    }

    public final void addLast(Object obj) {
        h();
        c(this.f8329c + 1);
        this.f8328b[g(this.f8327a + this.f8329c)] = obj;
        this.f8329c++;
    }

    public final void b(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f8328b.length;
        while (i4 < length && it.hasNext()) {
            this.f8328b[i4] = it.next();
            i4++;
        }
        int i5 = this.f8327a;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f8328b[i6] = it.next();
        }
        this.f8329c = collection.size() + this.f8329c;
    }

    public final void c(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f8328b;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f8326d) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f8328b = new Object[i4];
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
        g.Q(0, this.f8327a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f8328b;
        int length2 = objArr3.length;
        int i6 = this.f8327a;
        g.Q(length2 - i6, 0, i6, objArr3, objArr2);
        this.f8327a = 0;
        this.f8328b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.f8327a, g(this.f8327a + this.f8329c));
        }
        this.f8327a = 0;
        this.f8329c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i4) {
        kotlin.jvm.internal.i.e(this.f8328b, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    public final int e(int i4) {
        return i4 < 0 ? i4 + this.f8328b.length : i4;
    }

    public final void f(int i4, int i5) {
        if (i4 < i5) {
            g.S(this.f8328b, i4, i5);
            return;
        }
        Object[] objArr = this.f8328b;
        g.S(objArr, i4, objArr.length);
        g.S(this.f8328b, 0, i5);
    }

    public final int g(int i4) {
        Object[] objArr = this.f8328b;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.f8329c;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "index: ", ", size: "));
        }
        return this.f8328b[g(this.f8327a + i4)];
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    public final Object i(int i4) {
        int i5 = this.f8329c;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "index: ", ", size: "));
        }
        if (i4 == size() - 1) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        h();
        int g4 = g(this.f8327a + i4);
        Object[] objArr = this.f8328b;
        Object obj = objArr[g4];
        if (i4 < (this.f8329c >> 1)) {
            int i6 = this.f8327a;
            if (g4 >= i6) {
                g.Q(i6 + 1, i6, g4, objArr, objArr);
            } else {
                g.Q(1, 0, g4, objArr, objArr);
                Object[] objArr2 = this.f8328b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f8327a;
                g.Q(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f8328b;
            int i8 = this.f8327a;
            objArr3[i8] = null;
            this.f8327a = d(i8);
        } else {
            int g5 = g((size() - 1) + this.f8327a);
            if (g4 <= g5) {
                Object[] objArr4 = this.f8328b;
                g.Q(g4, g4 + 1, g5 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f8328b;
                g.Q(g4, g4 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f8328b;
                objArr6[objArr6.length - 1] = objArr6[0];
                g.Q(0, 1, g5 + 1, objArr6, objArr6);
            }
            this.f8328b[g5] = null;
        }
        this.f8329c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int g4 = g(this.f8327a + this.f8329c);
        int i5 = this.f8327a;
        if (i5 < g4) {
            while (i5 < g4) {
                if (kotlin.jvm.internal.i.a(obj, this.f8328b[i5])) {
                    i4 = this.f8327a;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < g4) {
            return -1;
        }
        int length = this.f8328b.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < g4; i6++) {
                    if (kotlin.jvm.internal.i.a(obj, this.f8328b[i6])) {
                        i5 = i6 + this.f8328b.length;
                        i4 = this.f8327a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.i.a(obj, this.f8328b[i5])) {
                i4 = this.f8327a;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f8329c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int g4 = g(this.f8327a + this.f8329c);
        int i5 = this.f8327a;
        if (i5 < g4) {
            length = g4 - 1;
            if (i5 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f8328b[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f8327a;
                return length - i4;
            }
            return -1;
        }
        if (i5 > g4) {
            int i6 = g4 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f8328b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f8327a;
                    if (i7 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f8328b[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f8327a;
                    }
                } else {
                    if (kotlin.jvm.internal.i.a(obj, this.f8328b[i6])) {
                        length = i6 + this.f8328b.length;
                        i4 = this.f8327a;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return i(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int g4;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f8328b.length != 0) {
            int g5 = g(this.f8327a + this.f8329c);
            int i4 = this.f8327a;
            if (i4 < g5) {
                g4 = i4;
                while (i4 < g5) {
                    Object obj = this.f8328b[i4];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f8328b[g4] = obj;
                        g4++;
                    }
                    i4++;
                }
                g.S(this.f8328b, g4, g5);
            } else {
                int length = this.f8328b.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f8328b;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f8328b[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                g4 = g(i5);
                for (int i6 = 0; i6 < g5; i6++) {
                    Object[] objArr2 = this.f8328b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f8328b[g4] = obj3;
                        g4 = d(g4);
                    }
                }
                z = z4;
            }
            if (z) {
                h();
                this.f8329c = e(g4 - this.f8327a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        Object[] objArr = this.f8328b;
        int i4 = this.f8327a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f8327a = d(i4);
        this.f8329c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        int g4 = g((size() - 1) + this.f8327a);
        Object[] objArr = this.f8328b;
        Object obj = objArr[g4];
        objArr[g4] = null;
        this.f8329c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        U.i.a(i4, i5, this.f8329c);
        int i6 = i5 - i4;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f8329c) {
            clear();
            return;
        }
        if (i6 == 1) {
            i(i4);
            return;
        }
        h();
        if (i4 < this.f8329c - i5) {
            int g4 = g(this.f8327a + (i4 - 1));
            int g5 = g(this.f8327a + (i5 - 1));
            while (i4 > 0) {
                int i7 = g4 + 1;
                int min = Math.min(i4, Math.min(i7, g5 + 1));
                Object[] objArr = this.f8328b;
                int i8 = g5 - min;
                int i9 = g4 - min;
                g.Q(i8 + 1, i9 + 1, i7, objArr, objArr);
                g4 = e(i9);
                g5 = e(i8);
                i4 -= min;
            }
            int g6 = g(this.f8327a + i6);
            f(this.f8327a, g6);
            this.f8327a = g6;
        } else {
            int g7 = g(this.f8327a + i5);
            int g8 = g(this.f8327a + i4);
            int i10 = this.f8329c;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f8328b;
                i5 = Math.min(i10, Math.min(objArr2.length - g7, objArr2.length - g8));
                Object[] objArr3 = this.f8328b;
                int i11 = g7 + i5;
                g.Q(g8, g7, i11, objArr3, objArr3);
                g7 = g(i11);
                g8 = g(g8 + i5);
            }
            int g9 = g(this.f8327a + this.f8329c);
            f(e(g9 - i6), g9);
        }
        this.f8329c -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int g4;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f8328b.length != 0) {
            int g5 = g(this.f8327a + this.f8329c);
            int i4 = this.f8327a;
            if (i4 < g5) {
                g4 = i4;
                while (i4 < g5) {
                    Object obj = this.f8328b[i4];
                    if (elements.contains(obj)) {
                        this.f8328b[g4] = obj;
                        g4++;
                    } else {
                        z = true;
                    }
                    i4++;
                }
                g.S(this.f8328b, g4, g5);
            } else {
                int length = this.f8328b.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f8328b;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        this.f8328b[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                g4 = g(i5);
                for (int i6 = 0; i6 < g5; i6++) {
                    Object[] objArr2 = this.f8328b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.f8328b[g4] = obj3;
                        g4 = d(g4);
                    } else {
                        z4 = true;
                    }
                }
                z = z4;
            }
            if (z) {
                h();
                this.f8329c = e(g4 - this.f8327a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i5 = this.f8329c;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "index: ", ", size: "));
        }
        int g4 = g(this.f8327a + i4);
        Object[] objArr = this.f8328b;
        Object obj2 = objArr[g4];
        objArr[g4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8329c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f8329c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        i(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i4 = this.f8329c;
        if (length < i4) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i4);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int g4 = g(this.f8327a + this.f8329c);
        int i5 = this.f8327a;
        if (i5 < g4) {
            g.R(i5, g4, 2, this.f8328b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f8328b;
            g.Q(0, this.f8327a, objArr.length, objArr, array);
            Object[] objArr2 = this.f8328b;
            g.Q(objArr2.length - this.f8327a, 0, g4, objArr2, array);
        }
        int i6 = this.f8329c;
        if (i6 < array.length) {
            array[i6] = null;
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
        h();
        c(elements.size() + this.f8329c);
        b(g(this.f8327a + this.f8329c), elements);
        return true;
    }
}
