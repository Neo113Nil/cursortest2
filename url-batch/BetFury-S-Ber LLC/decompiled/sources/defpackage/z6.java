package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class z6 extends o {
    public static final Object[] i = new Object[0];
    public int f;
    public Object[] g = i;
    public int h;

    @Override // defpackage.o
    public final int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.h;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException(r7.a(i2, i4, "index: ", ", size: "));
        }
        if (i2 == i4) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.h + 1);
        int h = h(this.f + i2);
        int i5 = this.h;
        if (i2 < ((i5 + 1) >> 1)) {
            if (h == 0) {
                Object[] objArr = this.g;
                objArr.getClass();
                i3 = objArr.length - 1;
            } else {
                i3 = h - 1;
            }
            int i6 = this.f;
            if (i6 == 0) {
                Object[] objArr2 = this.g;
                objArr2.getClass();
                i6 = objArr2.length;
            }
            int i7 = i6 - 1;
            int i8 = this.f;
            Object[] objArr3 = this.g;
            if (i3 >= i8) {
                objArr3[i7] = objArr3[i8];
                j7.Y(objArr3, objArr3, i8, i8 + 1, i3 + 1);
            } else {
                j7.Y(objArr3, objArr3, i8 - 1, i8, objArr3.length);
                Object[] objArr4 = this.g;
                objArr4[objArr4.length - 1] = objArr4[0];
                j7.Y(objArr4, objArr4, 0, 1, i3 + 1);
            }
            this.g[i3] = obj;
            this.f = i7;
        } else {
            int h2 = h(i5 + this.f);
            Object[] objArr5 = this.g;
            if (h < h2) {
                j7.Y(objArr5, objArr5, h + 1, h, h2);
            } else {
                j7.Y(objArr5, objArr5, 1, 0, h2);
                Object[] objArr6 = this.g;
                objArr6[0] = objArr6[objArr6.length - 1];
                j7.Y(objArr6, objArr6, h + 1, h, objArr6.length - 1);
            }
            this.g[h] = obj;
        }
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        int i3 = this.h;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(r7.a(i2, i3, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.h) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.h);
        int h = h(this.h + this.f);
        int h2 = h(this.f + i2);
        int size = collection.size();
        if (i2 >= ((this.h + 1) >> 1)) {
            int i4 = h2 + size;
            Object[] objArr = this.g;
            if (h2 < h) {
                int i5 = size + h;
                if (i5 <= objArr.length) {
                    j7.Y(objArr, objArr, i4, h2, h);
                } else if (i4 >= objArr.length) {
                    j7.Y(objArr, objArr, i4 - objArr.length, h2, h);
                } else {
                    int length = h - (i5 - objArr.length);
                    j7.Y(objArr, objArr, 0, length, h);
                    Object[] objArr2 = this.g;
                    j7.Y(objArr2, objArr2, i4, h2, length);
                }
            } else {
                j7.Y(objArr, objArr, size, 0, h);
                Object[] objArr3 = this.g;
                if (i4 >= objArr3.length) {
                    j7.Y(objArr3, objArr3, i4 - objArr3.length, h2, objArr3.length);
                } else {
                    j7.Y(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.g;
                    j7.Y(objArr4, objArr4, i4, h2, objArr4.length - size);
                }
            }
            c(h2, collection);
            return true;
        }
        int i6 = this.f;
        int i7 = i6 - size;
        Object[] objArr5 = this.g;
        if (h2 < i6) {
            j7.Y(objArr5, objArr5, i7, i6, objArr5.length);
            Object[] objArr6 = this.g;
            if (size >= h2) {
                j7.Y(objArr6, objArr6, objArr6.length - size, 0, h2);
            } else {
                j7.Y(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.g;
                j7.Y(objArr7, objArr7, 0, size, h2);
            }
        } else if (i7 >= 0) {
            j7.Y(objArr5, objArr5, i7, i6, h2);
        } else {
            i7 += objArr5.length;
            int i8 = h2 - i6;
            int length2 = objArr5.length - i7;
            if (length2 >= i8) {
                j7.Y(objArr5, objArr5, i7, i6, h2);
            } else {
                j7.Y(objArr5, objArr5, i7, i6, i6 + length2);
                Object[] objArr8 = this.g;
                j7.Y(objArr8, objArr8, 0, this.f + length2, h2);
            }
        }
        this.f = i7;
        c(f(h2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.h + 1);
        int i2 = this.f;
        if (i2 == 0) {
            Object[] objArr = this.g;
            objArr.getClass();
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f = i3;
        this.g[i3] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        i();
        d(a() + 1);
        this.g[h(a() + this.f)] = obj;
        this.h = a() + 1;
    }

    @Override // defpackage.o
    public final Object b(int i2) {
        int i3 = this.h;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(r7.a(i2, i3, "index: ", ", size: "));
        }
        if (i2 == a() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        i();
        int h = h(this.f + i2);
        Object[] objArr = this.g;
        Object obj = objArr[h];
        int i4 = this.h >> 1;
        int i5 = this.f;
        if (i2 < i4) {
            if (h >= i5) {
                j7.Y(objArr, objArr, i5 + 1, i5, h);
            } else {
                j7.Y(objArr, objArr, 1, 0, h);
                Object[] objArr2 = this.g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f;
                j7.Y(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.g;
            int i7 = this.f;
            objArr3[i7] = null;
            this.f = e(i7);
        } else {
            int h2 = h((a() - 1) + i5);
            Object[] objArr4 = this.g;
            if (h <= h2) {
                j7.Y(objArr4, objArr4, h, h + 1, h2 + 1);
            } else {
                j7.Y(objArr4, objArr4, h, h + 1, objArr4.length);
                Object[] objArr5 = this.g;
                objArr5[objArr5.length - 1] = objArr5[0];
                j7.Y(objArr5, objArr5, 0, 1, h2 + 1);
            }
            this.g[h2] = null;
        }
        this.h--;
        return obj;
    }

    public final void c(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.g.length;
        while (i2 < length && it.hasNext()) {
            this.g[i2] = it.next();
            i2++;
        }
        int i3 = this.f;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.g[i4] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f, h(a() + this.f));
        }
        this.f = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2) {
        if (i2 < 0) {
            s9.u("Deque is too big.");
            return;
        }
        Object[] objArr = this.g;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.g = new Object[i2];
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
        j7.Y(objArr, objArr2, 0, this.f, objArr.length);
        Object[] objArr3 = this.g;
        int length2 = objArr3.length;
        int i4 = this.f;
        j7.Y(objArr3, objArr2, length2 - i4, 0, i4);
        this.f = 0;
        this.g = objArr2;
    }

    public final int e(int i2) {
        this.g.getClass();
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final int f(int i2) {
        return i2 < 0 ? i2 + this.g.length : i2;
    }

    public final void g(int i2, int i3) {
        Object[] objArr = this.g;
        if (i2 < i3) {
            j7.a0(objArr, i2, i3);
        } else {
            Arrays.fill(objArr, i2, objArr.length, (Object) null);
            j7.a0(this.g, 0, i3);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int a = a();
        if (i2 < 0 || i2 >= a) {
            throw new IndexOutOfBoundsException(r7.a(i2, a, "index: ", ", size: "));
        }
        return this.g[h(this.f + i2)];
    }

    public final int h(int i2) {
        Object[] objArr = this.g;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int h = h(a() + this.f);
        int i3 = this.f;
        if (i3 < h) {
            while (i3 < h) {
                if (mv.c(obj, this.g[i3])) {
                    i2 = this.f;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < h) {
            return -1;
        }
        int length = this.g.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < h; i4++) {
                    if (mv.c(obj, this.g[i4])) {
                        i3 = i4 + this.g.length;
                        i2 = this.f;
                    }
                }
                return -1;
            }
            if (mv.c(obj, this.g[i3])) {
                i2 = this.f;
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

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int h = h(this.h + this.f);
        int i3 = this.f;
        if (i3 < h) {
            length = h - 1;
            if (i3 <= length) {
                while (!mv.c(obj, this.g[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f;
                return length - i2;
            }
            return -1;
        }
        if (i3 > h) {
            while (true) {
                h--;
                Object[] objArr = this.g;
                if (-1 >= h) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.f;
                    if (i4 <= length) {
                        while (!mv.c(obj, this.g[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i2 = this.f;
                    }
                } else if (mv.c(obj, objArr[h])) {
                    length = h + this.g.length;
                    i2 = this.f;
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
        int h;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.g.length != 0) {
            int h2 = h(this.h + this.f);
            int i2 = this.f;
            if (i2 < h2) {
                h = i2;
                while (true) {
                    objArr = this.g;
                    if (i2 >= h2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.g[h] = obj;
                        h++;
                    }
                    i2++;
                }
                j7.a0(objArr, h, h2);
            } else {
                int length = this.g.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.g;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.g[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                h = h(i3);
                for (int i4 = 0; i4 < h2; i4++) {
                    Object[] objArr3 = this.g;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.g[h] = obj3;
                        h = e(h);
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.h = f(h - this.f);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.g;
        int i2 = this.f;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f = e(i2);
        this.h = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int h = h((size() - 1) + this.f);
        Object[] objArr = this.g;
        Object obj = objArr[h];
        objArr[h] = null;
        this.h = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        bi.r(i2, i3, this.h);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.h) {
            clear();
            return;
        }
        if (i4 == 1) {
            b(i2);
            return;
        }
        i();
        int i5 = this.h - i3;
        int i6 = this.f;
        if (i2 < i5) {
            int h = h((i2 - 1) + i6);
            int h2 = h(this.f + (i3 - 1));
            while (i2 > 0) {
                int i7 = h + 1;
                int min = Math.min(i2, Math.min(i7, h2 + 1));
                Object[] objArr = this.g;
                int i8 = h2 - min;
                int i9 = h - min;
                j7.Y(objArr, objArr, i8 + 1, i9 + 1, i7);
                h = f(i9);
                h2 = f(i8);
                i2 -= min;
            }
            int h3 = h(this.f + i4);
            g(this.f, h3);
            this.f = h3;
        } else {
            int h4 = h(i6 + i3);
            int h5 = h(this.f + i2);
            int i10 = this.h;
            while (true) {
                i10 -= i3;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.g;
                i3 = Math.min(i10, Math.min(objArr2.length - h4, objArr2.length - h5));
                Object[] objArr3 = this.g;
                int i11 = h4 + i3;
                j7.Y(objArr3, objArr3, h5, h4, i11);
                h4 = h(i11);
                h5 = h(h5 + i3);
            }
            int h6 = h(this.h + this.f);
            g(f(h6 - i4), h6);
        }
        this.h -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int h;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.g.length != 0) {
            int h2 = h(this.h + this.f);
            int i2 = this.f;
            if (i2 < h2) {
                h = i2;
                while (true) {
                    objArr = this.g;
                    if (i2 >= h2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.g[h] = obj;
                        h++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                j7.a0(objArr, h, h2);
            } else {
                int length = this.g.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.g;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.g[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                h = h(i3);
                for (int i4 = 0; i4 < h2; i4++) {
                    Object[] objArr3 = this.g;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.g[h] = obj3;
                        h = e(h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.h = f(h - this.f);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int a = a();
        if (i2 < 0 || i2 >= a) {
            throw new IndexOutOfBoundsException(r7.a(i2, a, "index: ", ", size: "));
        }
        int h = h(this.f + i2);
        Object[] objArr = this.g;
        Object obj2 = objArr[h];
        objArr[h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.h;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int h = h(this.h + this.f);
        int i3 = this.f;
        if (i3 < h) {
            j7.Z(this.g, objArr, i3, h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.g;
            j7.Y(objArr2, objArr, 0, this.f, objArr2.length);
            Object[] objArr3 = this.g;
            j7.Y(objArr3, objArr, objArr3.length - this.f, 0, h);
        }
        int i4 = this.h;
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
        i();
        d(collection.size() + a());
        c(h(a() + this.f), collection);
        return true;
    }
}
