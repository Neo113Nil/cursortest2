package c2;

import E1.AbstractC0033i;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204b extends AbstractList implements List, m2.a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f2630d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f2631a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f2632b = f2630d;

    /* renamed from: c, reason: collision with root package name */
    public int f2633c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f2633c;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i5, "index: ", ", size: "));
        }
        if (i3 == i5) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        h();
        c(this.f2633c + 1);
        int g3 = g(this.f2631a + i3);
        int i6 = this.f2633c;
        if (i3 < ((i6 + 1) >> 1)) {
            if (g3 == 0) {
                Object[] objArr = this.f2632b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                g3 = objArr.length;
            }
            int i7 = g3 - 1;
            int i8 = this.f2631a;
            if (i8 == 0) {
                Object[] objArr2 = this.f2632b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                i4 = objArr2.length - 1;
            } else {
                i4 = i8 - 1;
            }
            int i9 = this.f2631a;
            if (i7 >= i9) {
                Object[] objArr3 = this.f2632b;
                objArr3[i4] = objArr3[i9];
                c.R(i9, i9 + 1, i7 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f2632b;
                c.R(i9 - 1, i9, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f2632b;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.R(0, 1, i7 + 1, objArr5, objArr5);
            }
            this.f2632b[i7] = obj;
            this.f2631a = i4;
        } else {
            int g4 = g(this.f2631a + i6);
            if (g3 < g4) {
                Object[] objArr6 = this.f2632b;
                c.R(g3 + 1, g3, g4, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f2632b;
                c.R(1, 0, g4, objArr7, objArr7);
                Object[] objArr8 = this.f2632b;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.R(g3 + 1, g3, objArr8.length - 1, objArr8, objArr8);
            }
            this.f2632b[g3] = obj;
        }
        this.f2633c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i4 = this.f2633c;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i3 == this.f2633c) {
            return addAll(elements);
        }
        h();
        c(elements.size() + this.f2633c);
        int g3 = g(this.f2631a + this.f2633c);
        int g4 = g(this.f2631a + i3);
        int size = elements.size();
        if (i3 >= ((this.f2633c + 1) >> 1)) {
            int i5 = g4 + size;
            if (g4 < g3) {
                int i6 = size + g3;
                Object[] objArr = this.f2632b;
                if (i6 <= objArr.length) {
                    c.R(i5, g4, g3, objArr, objArr);
                } else if (i5 >= objArr.length) {
                    c.R(i5 - objArr.length, g4, g3, objArr, objArr);
                } else {
                    int length = g3 - (i6 - objArr.length);
                    c.R(0, length, g3, objArr, objArr);
                    Object[] objArr2 = this.f2632b;
                    c.R(i5, g4, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f2632b;
                c.R(size, 0, g3, objArr3, objArr3);
                Object[] objArr4 = this.f2632b;
                if (i5 >= objArr4.length) {
                    c.R(i5 - objArr4.length, g4, objArr4.length, objArr4, objArr4);
                } else {
                    c.R(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f2632b;
                    c.R(i5, g4, objArr5.length - size, objArr5, objArr5);
                }
            }
            b(g4, elements);
            return true;
        }
        int i7 = this.f2631a;
        int i8 = i7 - size;
        if (g4 < i7) {
            Object[] objArr6 = this.f2632b;
            c.R(i8, i7, objArr6.length, objArr6, objArr6);
            if (size >= g4) {
                Object[] objArr7 = this.f2632b;
                c.R(objArr7.length - size, 0, g4, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f2632b;
                c.R(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f2632b;
                c.R(0, size, g4, objArr9, objArr9);
            }
        } else if (i8 >= 0) {
            Object[] objArr10 = this.f2632b;
            c.R(i8, i7, g4, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f2632b;
            i8 += objArr11.length;
            int i9 = g4 - i7;
            int length2 = objArr11.length - i8;
            if (length2 >= i9) {
                c.R(i8, i7, g4, objArr11, objArr11);
            } else {
                c.R(i8, i7, i7 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f2632b;
                c.R(0, this.f2631a + length2, g4, objArr12, objArr12);
            }
        }
        this.f2631a = i8;
        b(e(g4 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        h();
        c(this.f2633c + 1);
        int i3 = this.f2631a;
        if (i3 == 0) {
            Object[] objArr = this.f2632b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i3 = objArr.length;
        }
        int i4 = i3 - 1;
        this.f2631a = i4;
        this.f2632b[i4] = obj;
        this.f2633c++;
    }

    public final void addLast(Object obj) {
        h();
        c(this.f2633c + 1);
        this.f2632b[g(this.f2631a + this.f2633c)] = obj;
        this.f2633c++;
    }

    public final void b(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2632b.length;
        while (i3 < length && it.hasNext()) {
            this.f2632b[i3] = it.next();
            i3++;
        }
        int i4 = this.f2631a;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f2632b[i5] = it.next();
        }
        this.f2633c = collection.size() + this.f2633c;
    }

    public final void c(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2632b;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f2630d) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f2632b = new Object[i3];
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
        c.R(0, this.f2631a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f2632b;
        int length2 = objArr3.length;
        int i5 = this.f2631a;
        c.R(length2 - i5, 0, i5, objArr3, objArr2);
        this.f2631a = 0;
        this.f2632b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            h();
            f(this.f2631a, g(this.f2631a + this.f2633c));
        }
        this.f2631a = 0;
        this.f2633c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i3) {
        kotlin.jvm.internal.j.e(this.f2632b, "<this>");
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int e(int i3) {
        return i3 < 0 ? i3 + this.f2632b.length : i3;
    }

    public final void f(int i3, int i4) {
        if (i3 < i4) {
            Object[] objArr = this.f2632b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, (Object) null);
        } else {
            Object[] objArr2 = this.f2632b;
            Arrays.fill(objArr2, i3, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2632b;
            kotlin.jvm.internal.j.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i4, (Object) null);
        }
    }

    public final int g(int i3) {
        Object[] objArr = this.f2632b;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f2633c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "index: ", ", size: "));
        }
        return this.f2632b[g(this.f2631a + i3)];
    }

    public final void h() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int g3 = g(this.f2631a + this.f2633c);
        int i4 = this.f2631a;
        if (i4 < g3) {
            while (i4 < g3) {
                if (kotlin.jvm.internal.j.a(obj, this.f2632b[i4])) {
                    i3 = this.f2631a;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 < g3) {
            return -1;
        }
        int length = this.f2632b.length;
        while (true) {
            if (i4 >= length) {
                for (int i5 = 0; i5 < g3; i5++) {
                    if (kotlin.jvm.internal.j.a(obj, this.f2632b[i5])) {
                        i4 = i5 + this.f2632b.length;
                        i3 = this.f2631a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.a(obj, this.f2632b[i4])) {
                i3 = this.f2631a;
                break;
            }
            i4++;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2633c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int g3 = g(this.f2631a + this.f2633c);
        int i4 = this.f2631a;
        if (i4 < g3) {
            length = g3 - 1;
            if (i4 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f2632b[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f2631a;
                return length - i3;
            }
            return -1;
        }
        if (i4 > g3) {
            int i5 = g3 - 1;
            while (true) {
                if (-1 >= i5) {
                    Object[] objArr = this.f2632b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i6 = this.f2631a;
                    if (i6 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f2632b[length])) {
                            if (length != i6) {
                                length--;
                            }
                        }
                        i3 = this.f2631a;
                    }
                } else {
                    if (kotlin.jvm.internal.j.a(obj, this.f2632b[i5])) {
                        length = i5 + this.f2632b.length;
                        i3 = this.f2631a;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        int i4 = this.f2633c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "index: ", ", size: "));
        }
        if (i3 == size() - 1) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        h();
        int g3 = g(this.f2631a + i3);
        Object[] objArr = this.f2632b;
        Object obj = objArr[g3];
        if (i3 < (this.f2633c >> 1)) {
            int i5 = this.f2631a;
            if (g3 >= i5) {
                c.R(i5 + 1, i5, g3, objArr, objArr);
            } else {
                c.R(1, 0, g3, objArr, objArr);
                Object[] objArr2 = this.f2632b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f2631a;
                c.R(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f2632b;
            int i7 = this.f2631a;
            objArr3[i7] = null;
            this.f2631a = d(i7);
        } else {
            int g4 = g((size() - 1) + this.f2631a);
            if (g3 <= g4) {
                Object[] objArr4 = this.f2632b;
                c.R(g3, g3 + 1, g4 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f2632b;
                c.R(g3, g3 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f2632b;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.R(0, 1, g4 + 1, objArr6, objArr6);
            }
            this.f2632b[g4] = null;
        }
        this.f2633c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int g3;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f2632b.length != 0) {
            int g4 = g(this.f2631a + this.f2633c);
            int i3 = this.f2631a;
            if (i3 < g4) {
                g3 = i3;
                while (i3 < g4) {
                    Object obj = this.f2632b[i3];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f2632b[g3] = obj;
                        g3++;
                    }
                    i3++;
                }
                Object[] objArr = this.f2632b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                Arrays.fill(objArr, g3, g4, (Object) null);
            } else {
                int length = this.f2632b.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f2632b;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f2632b[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                g3 = g(i4);
                for (int i5 = 0; i5 < g4; i5++) {
                    Object[] objArr3 = this.f2632b;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f2632b[g3] = obj3;
                        g3 = d(g3);
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.f2633c = e(g3 - this.f2631a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        Object[] objArr = this.f2632b;
        int i3 = this.f2631a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f2631a = d(i3);
        this.f2633c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        h();
        int g3 = g((size() - 1) + this.f2631a);
        Object[] objArr = this.f2632b;
        Object obj = objArr[g3];
        objArr[g3] = null;
        this.f2633c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        int i5 = this.f2633c;
        if (i3 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(AbstractC0033i.g(i3, i4, "fromIndex: ", " > toIndex: "));
        }
        int i6 = i4 - i3;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f2633c) {
            clear();
            return;
        }
        if (i6 == 1) {
            remove(i3);
            return;
        }
        h();
        if (i3 < this.f2633c - i4) {
            int g3 = g((i3 - 1) + this.f2631a);
            int g4 = g((i4 - 1) + this.f2631a);
            while (i3 > 0) {
                int i7 = g3 + 1;
                int min = Math.min(i3, Math.min(i7, g4 + 1));
                Object[] objArr = this.f2632b;
                int i8 = g4 - min;
                int i9 = g3 - min;
                c.R(i8 + 1, i9 + 1, i7, objArr, objArr);
                g3 = e(i9);
                g4 = e(i8);
                i3 -= min;
            }
            int g5 = g(this.f2631a + i6);
            f(this.f2631a, g5);
            this.f2631a = g5;
        } else {
            int g6 = g(this.f2631a + i4);
            int g7 = g(this.f2631a + i3);
            int i10 = this.f2633c;
            while (true) {
                i10 -= i4;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2632b;
                i4 = Math.min(i10, Math.min(objArr2.length - g6, objArr2.length - g7));
                Object[] objArr3 = this.f2632b;
                int i11 = g6 + i4;
                c.R(g7, g6, i11, objArr3, objArr3);
                g6 = g(i11);
                g7 = g(g7 + i4);
            }
            int g8 = g(this.f2631a + this.f2633c);
            f(e(g8 - i6), g8);
        }
        this.f2633c -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int g3;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f2632b.length != 0) {
            int g4 = g(this.f2631a + this.f2633c);
            int i3 = this.f2631a;
            if (i3 < g4) {
                g3 = i3;
                while (i3 < g4) {
                    Object obj = this.f2632b[i3];
                    if (elements.contains(obj)) {
                        this.f2632b[g3] = obj;
                        g3++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                Object[] objArr = this.f2632b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                Arrays.fill(objArr, g3, g4, (Object) null);
            } else {
                int length = this.f2632b.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.f2632b;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj2)) {
                        this.f2632b[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                g3 = g(i4);
                for (int i5 = 0; i5 < g4; i5++) {
                    Object[] objArr3 = this.f2632b;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (elements.contains(obj3)) {
                        this.f2632b[g3] = obj3;
                        g3 = d(g3);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                h();
                this.f2633c = e(g3 - this.f2631a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int i4 = this.f2633c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "index: ", ", size: "));
        }
        int g3 = g(this.f2631a + i3);
        Object[] objArr = this.f2632b;
        Object obj2 = objArr[g3];
        objArr[g3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2633c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f2633c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i3 = this.f2633c;
        if (length < i3) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i3);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int g3 = g(this.f2631a + this.f2633c);
        int i4 = this.f2631a;
        if (i4 < g3) {
            c.S(i4, g3, 2, this.f2632b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f2632b;
            c.R(0, this.f2631a, objArr.length, objArr, array);
            Object[] objArr2 = this.f2632b;
            c.R(objArr2.length - this.f2631a, 0, g3, objArr2, array);
        }
        int i5 = this.f2633c;
        if (i5 < array.length) {
            array[i5] = null;
        }
        return array;
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
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        h();
        c(elements.size() + this.f2633c);
        b(g(this.f2631a + this.f2633c), elements);
        return true;
    }
}
