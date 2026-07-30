package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m9 extends f0 {
    public static final l9 h = new l9(null);
    public static final Object[] i = new Object[0];
    public int d;
    public Object[] e = i;
    public int g;

    @Override // defpackage.f0
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        s sVar = w.d;
        int i4 = this.g;
        sVar.getClass();
        s.b(i2, i4);
        if (i2 == this.g) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        k();
        e(this.g + 1);
        int j = j(this.d + i2);
        int i5 = this.g;
        if (i2 < ((i5 + 1) >> 1)) {
            if (j == 0) {
                Object[] objArr = this.e;
                objArr.getClass();
                i3 = objArr.length - 1;
            } else {
                i3 = j - 1;
            }
            int i6 = this.d;
            if (i6 == 0) {
                Object[] objArr2 = this.e;
                objArr2.getClass();
                i6 = objArr2.length;
            }
            int i7 = i6 - 1;
            int i8 = this.d;
            Object[] objArr3 = this.e;
            if (i3 >= i8) {
                objArr3[i7] = objArr3[i8];
                w9.c(objArr3, objArr3, i8, i8 + 1, i3 + 1);
            } else {
                w9.c(objArr3, objArr3, i8 - 1, i8, objArr3.length);
                Object[] objArr4 = this.e;
                objArr4[objArr4.length - 1] = objArr4[0];
                w9.c(objArr4, objArr4, 0, 1, i3 + 1);
            }
            this.e[i3] = obj;
            this.d = i7;
        } else {
            int j2 = j(i5 + this.d);
            Object[] objArr5 = this.e;
            if (j < j2) {
                w9.c(objArr5, objArr5, j + 1, j, j2);
            } else {
                w9.c(objArr5, objArr5, 1, 0, j2);
                Object[] objArr6 = this.e;
                objArr6[0] = objArr6[objArr6.length - 1];
                w9.c(objArr6, objArr6, j + 1, j, objArr6.length - 1);
            }
            this.e[j] = obj;
        }
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        s sVar = w.d;
        int i3 = this.g;
        sVar.getClass();
        s.b(i2, i3);
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.g) {
            return addAll(collection);
        }
        k();
        e(collection.size() + this.g);
        int j = j(this.g + this.d);
        int j2 = j(this.d + i2);
        int size = collection.size();
        if (i2 >= ((this.g + 1) >> 1)) {
            int i4 = j2 + size;
            Object[] objArr = this.e;
            if (j2 < j) {
                int i5 = size + j;
                if (i5 <= objArr.length) {
                    w9.c(objArr, objArr, i4, j2, j);
                } else if (i4 >= objArr.length) {
                    w9.c(objArr, objArr, i4 - objArr.length, j2, j);
                } else {
                    int length = j - (i5 - objArr.length);
                    w9.c(objArr, objArr, 0, length, j);
                    Object[] objArr2 = this.e;
                    w9.c(objArr2, objArr2, i4, j2, length);
                }
            } else {
                w9.c(objArr, objArr, size, 0, j);
                Object[] objArr3 = this.e;
                if (i4 >= objArr3.length) {
                    w9.c(objArr3, objArr3, i4 - objArr3.length, j2, objArr3.length);
                } else {
                    w9.c(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.e;
                    w9.c(objArr4, objArr4, i4, j2, objArr4.length - size);
                }
            }
            d(j2, collection);
            return true;
        }
        int i6 = this.d;
        int i7 = i6 - size;
        Object[] objArr5 = this.e;
        if (j2 < i6) {
            w9.c(objArr5, objArr5, i7, i6, objArr5.length);
            Object[] objArr6 = this.e;
            if (size >= j2) {
                w9.c(objArr6, objArr6, objArr6.length - size, 0, j2);
            } else {
                w9.c(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.e;
                w9.c(objArr7, objArr7, 0, size, j2);
            }
        } else if (i7 >= 0) {
            w9.c(objArr5, objArr5, i7, i6, j2);
        } else {
            i7 += objArr5.length;
            int i8 = j2 - i6;
            int length2 = objArr5.length - i7;
            if (length2 >= i8) {
                w9.c(objArr5, objArr5, i7, i6, j2);
            } else {
                w9.c(objArr5, objArr5, i7, i6, i6 + length2);
                Object[] objArr8 = this.e;
                w9.c(objArr8, objArr8, 0, this.d + length2, j2);
            }
        }
        this.d = i7;
        d(h(j2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        e(this.g + 1);
        int i2 = this.d;
        if (i2 == 0) {
            Object[] objArr = this.e;
            objArr.getClass();
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.d = i3;
        this.e[i3] = obj;
        this.g++;
    }

    public final void addLast(Object obj) {
        k();
        e(a() + 1);
        this.e[j(a() + this.d)] = obj;
        this.g = a() + 1;
    }

    @Override // defpackage.f0
    public final Object b(int i2) {
        s sVar = w.d;
        int i3 = this.g;
        sVar.getClass();
        s.a(i2, i3);
        if (i2 == a() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        k();
        int j = j(this.d + i2);
        Object[] objArr = this.e;
        Object obj = objArr[j];
        int i4 = this.g >> 1;
        int i5 = this.d;
        if (i2 < i4) {
            if (j >= i5) {
                w9.c(objArr, objArr, i5 + 1, i5, j);
            } else {
                w9.c(objArr, objArr, 1, 0, j);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.d;
                w9.c(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i7 = this.d;
            objArr3[i7] = null;
            this.d = f(i7);
        } else {
            int j2 = j((a() - 1) + i5);
            Object[] objArr4 = this.e;
            if (j <= j2) {
                w9.c(objArr4, objArr4, j, j + 1, j2 + 1);
            } else {
                w9.c(objArr4, objArr4, j, j + 1, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                w9.c(objArr5, objArr5, 0, 1, j2 + 1);
            }
            this.e[j2] = null;
        }
        this.g--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.d, j(a() + this.d));
        }
        this.d = 0;
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i2 < length && it.hasNext()) {
            this.e[i2] = it.next();
            i2++;
        }
        int i3 = this.d;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.e[i4] = it.next();
        }
        this.g = collection.size() + this.g;
    }

    public final void e(int i2) {
        if (i2 < 0) {
            dd0.j("Deque is too big.");
            return;
        }
        Object[] objArr = this.e;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.e = new Object[i2];
            return;
        }
        s sVar = w.d;
        int length = objArr.length;
        sVar.getClass();
        Object[] objArr2 = new Object[s.d(length, i2)];
        Object[] objArr3 = this.e;
        w9.c(objArr3, objArr2, 0, this.d, objArr3.length);
        Object[] objArr4 = this.e;
        int length2 = objArr4.length;
        int i3 = this.d;
        w9.c(objArr4, objArr2, length2 - i3, 0, i3);
        this.d = 0;
        this.e = objArr2;
    }

    public final int f(int i2) {
        this.e.getClass();
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.e[j((size() - 1) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        s sVar = w.d;
        int i3 = this.g;
        sVar.getClass();
        s.a(i2, i3);
        return this.e[j(this.d + i2)];
    }

    public final int h(int i2) {
        return i2 < 0 ? i2 + this.e.length : i2;
    }

    public final void i(int i2, int i3) {
        Object[] objArr = this.e;
        if (i2 < i3) {
            w9.g(objArr, i2, i3);
        } else {
            Arrays.fill(objArr, i2, objArr.length, (Object) null);
            w9.g(this.e, 0, i3);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int j = j(a() + this.d);
        int i3 = this.d;
        if (i3 < j) {
            while (i3 < j) {
                if (Intrinsics.a(obj, this.e[i3])) {
                    i2 = this.d;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < j) {
            return -1;
        }
        int length = this.e.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < j; i4++) {
                    if (Intrinsics.a(obj, this.e[i4])) {
                        i3 = i4 + this.e.length;
                        i2 = this.d;
                    }
                }
                return -1;
            }
            if (Intrinsics.a(obj, this.e[i3])) {
                i2 = this.d;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i2) {
        Object[] objArr = this.e;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.e[j((size() - 1) + this.d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int j = j(this.g + this.d);
        int i3 = this.d;
        if (i3 < j) {
            length = j - 1;
            if (i3 <= length) {
                while (!Intrinsics.a(obj, this.e[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.d;
                return length - i2;
            }
            return -1;
        }
        if (i3 > j) {
            while (true) {
                j--;
                Object[] objArr = this.e;
                if (-1 >= j) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.d;
                    if (i4 <= length) {
                        while (!Intrinsics.a(obj, this.e[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i2 = this.d;
                    }
                } else if (Intrinsics.a(obj, objArr[j])) {
                    length = j + this.e.length;
                    i2 = this.d;
                    break;
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
        int j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int j2 = j(this.g + this.d);
            int i2 = this.d;
            if (i2 < j2) {
                j = i2;
                while (true) {
                    objArr = this.e;
                    if (i2 >= j2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.e[j] = obj;
                        j++;
                    }
                    i2++;
                }
                w9.g(objArr, j, j2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.e[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                j = j(i3);
                for (int i4 = 0; i4 < j2; i4++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.e[j] = obj3;
                        j = f(j);
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(j - this.d);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        Object[] objArr = this.e;
        int i2 = this.d;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.d = f(i2);
        this.g = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        int j = j((size() - 1) + this.d);
        Object[] objArr = this.e;
        Object obj = objArr[j];
        objArr[j] = null;
        this.g = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        s sVar = w.d;
        int i4 = this.g;
        sVar.getClass();
        s.c(i2, i3, i4);
        int i5 = i3 - i2;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.g) {
            clear();
            return;
        }
        if (i5 == 1) {
            b(i2);
            return;
        }
        k();
        int i6 = this.g - i3;
        int i7 = this.d;
        if (i2 < i6) {
            int j = j((i2 - 1) + i7);
            int j2 = j(this.d + (i3 - 1));
            while (i2 > 0) {
                int i8 = j + 1;
                int min = Math.min(i2, Math.min(i8, j2 + 1));
                Object[] objArr = this.e;
                int i9 = j2 - min;
                int i10 = j - min;
                w9.c(objArr, objArr, i9 + 1, i10 + 1, i8);
                j = h(i10);
                j2 = h(i9);
                i2 -= min;
            }
            int j3 = j(this.d + i5);
            i(this.d, j3);
            this.d = j3;
        } else {
            int j4 = j(i7 + i3);
            int j5 = j(this.d + i2);
            int i11 = this.g;
            while (true) {
                i11 -= i3;
                if (i11 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i3 = Math.min(i11, Math.min(objArr2.length - j4, objArr2.length - j5));
                Object[] objArr3 = this.e;
                int i12 = j4 + i3;
                w9.c(objArr3, objArr3, j5, j4, i12);
                j4 = j(i12);
                j5 = j(j5 + i3);
            }
            int j6 = j(this.g + this.d);
            i(h(j6 - i5), j6);
        }
        this.g -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.e.length != 0) {
            int j2 = j(this.g + this.d);
            int i2 = this.d;
            if (i2 < j2) {
                j = i2;
                while (true) {
                    objArr = this.e;
                    if (i2 >= j2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.e[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                w9.g(objArr, j, j2);
            } else {
                int length = this.e.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.e[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                j = j(i3);
                for (int i4 = 0; i4 < j2; i4++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.e[j] = obj3;
                        j = f(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(j - this.d);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        s sVar = w.d;
        int i3 = this.g;
        sVar.getClass();
        s.a(i2, i3);
        int j = j(this.d + i2);
        Object[] objArr = this.e;
        Object obj2 = objArr[j];
        objArr[j] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.g;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int j = j(this.g + this.d);
        int i3 = this.d;
        if (i3 < j) {
            w9.e(this.e, objArr, i3, j, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.e;
            w9.c(objArr2, objArr, 0, this.d, objArr2.length);
            Object[] objArr3 = this.e;
            w9.c(objArr3, objArr, objArr3.length - this.d, 0, j);
        }
        int i4 = this.g;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        e(collection.size() + a());
        d(j(a() + this.d), collection);
        return true;
    }
}
