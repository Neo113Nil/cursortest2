package u0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b extends AbstractList implements List {

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f1181e = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public int f1182b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1183c = f1181e;

    /* renamed from: d, reason: collision with root package name */
    public int f1184d;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1183c.length;
        while (i2 < length && it.hasNext()) {
            this.f1183c[i2] = it.next();
            i2++;
        }
        int i3 = this.f1182b;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f1183c[i4] = it.next();
        }
        this.f1184d = collection.size() + this.f1184d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f1184d;
        if (i2 < 0 || i2 > i4) {
            f0.l.g("index: ", i2, ", size: ", i4);
            return;
        }
        if (i2 == i4) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        b(i4 + 1);
        int d2 = d(this.f1182b + i2);
        int i5 = this.f1184d;
        if (i2 < ((i5 + 1) >> 1)) {
            if (d2 == 0) {
                Object[] objArr = this.f1183c;
                objArr.getClass();
                i3 = objArr.length - 1;
            } else {
                i3 = d2 - 1;
            }
            int i6 = this.f1182b;
            if (i6 == 0) {
                Object[] objArr2 = this.f1183c;
                objArr2.getClass();
                i6 = objArr2.length;
            }
            int i7 = i6 - 1;
            int i8 = this.f1182b;
            Object[] objArr3 = this.f1183c;
            if (i3 >= i8) {
                objArr3[i7] = objArr3[i8];
                c.G(objArr3, objArr3, i8, i8 + 1, i3 + 1);
            } else {
                c.G(objArr3, objArr3, i8 - 1, i8, objArr3.length);
                Object[] objArr4 = this.f1183c;
                objArr4[objArr4.length - 1] = objArr4[0];
                c.G(objArr4, objArr4, 0, 1, i3 + 1);
            }
            this.f1183c[i3] = obj;
            this.f1182b = i7;
        } else {
            int d3 = d(this.f1182b + i5);
            Object[] objArr5 = this.f1183c;
            if (d2 < d3) {
                c.G(objArr5, objArr5, d2 + 1, d2, d3);
            } else {
                c.G(objArr5, objArr5, 1, 0, d3);
                Object[] objArr6 = this.f1183c;
                objArr6[0] = objArr6[objArr6.length - 1];
                c.G(objArr6, objArr6, d2 + 1, d2, objArr6.length - 1);
            }
            this.f1183c[d2] = obj;
        }
        this.f1184d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        int i3 = this.f1184d;
        if (i2 < 0 || i2 > i3) {
            f0.l.g("index: ", i2, ", size: ", i3);
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f1184d;
        if (i2 == i4) {
            return addAll(collection);
        }
        b(collection.size() + i4);
        int d2 = d(this.f1182b + this.f1184d);
        int d3 = d(this.f1182b + i2);
        int size = collection.size();
        if (i2 >= ((this.f1184d + 1) >> 1)) {
            int i5 = d3 + size;
            Object[] objArr = this.f1183c;
            if (d3 < d2) {
                int i6 = size + d2;
                if (i6 <= objArr.length) {
                    c.G(objArr, objArr, i5, d3, d2);
                } else if (i5 >= objArr.length) {
                    c.G(objArr, objArr, i5 - objArr.length, d3, d2);
                } else {
                    int length = d2 - (i6 - objArr.length);
                    c.G(objArr, objArr, 0, length, d2);
                    Object[] objArr2 = this.f1183c;
                    c.G(objArr2, objArr2, i5, d3, length);
                }
            } else {
                c.G(objArr, objArr, size, 0, d2);
                Object[] objArr3 = this.f1183c;
                if (i5 >= objArr3.length) {
                    c.G(objArr3, objArr3, i5 - objArr3.length, d3, objArr3.length);
                } else {
                    c.G(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f1183c;
                    c.G(objArr4, objArr4, i5, d3, objArr4.length - size);
                }
            }
            a(d3, collection);
            return true;
        }
        int i7 = this.f1182b;
        int i8 = i7 - size;
        Object[] objArr5 = this.f1183c;
        if (d3 < i7) {
            c.G(objArr5, objArr5, i8, i7, objArr5.length);
            Object[] objArr6 = this.f1183c;
            if (size >= d3) {
                c.G(objArr6, objArr6, objArr6.length - size, 0, d3);
            } else {
                c.G(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f1183c;
                c.G(objArr7, objArr7, 0, size, d3);
            }
        } else if (i8 >= 0) {
            c.G(objArr5, objArr5, i8, i7, d3);
        } else {
            i8 += objArr5.length;
            int i9 = d3 - i7;
            int length2 = objArr5.length - i8;
            if (length2 >= i9) {
                c.G(objArr5, objArr5, i8, i7, d3);
            } else {
                c.G(objArr5, objArr5, i8, i7, i7 + length2);
                Object[] objArr8 = this.f1183c;
                c.G(objArr8, objArr8, 0, this.f1182b + length2, d3);
            }
        }
        this.f1182b = i8;
        int i10 = d3 - size;
        if (i10 < 0) {
            i10 += this.f1183c.length;
        }
        a(i10, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        b(this.f1184d + 1);
        int i2 = this.f1182b;
        if (i2 == 0) {
            Object[] objArr = this.f1183c;
            objArr.getClass();
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f1182b = i3;
        this.f1183c[i3] = obj;
        this.f1184d++;
    }

    public final void addLast(Object obj) {
        b(this.f1184d + 1);
        this.f1183c[d(this.f1182b + this.f1184d)] = obj;
        this.f1184d++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            f0.l.b("Deque is too big.");
            return;
        }
        Object[] objArr = this.f1183c;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f1181e) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f1183c = new Object[i2];
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
        c.G(objArr, objArr2, 0, this.f1182b, objArr.length);
        Object[] objArr3 = this.f1183c;
        int length2 = objArr3.length;
        int i4 = this.f1182b;
        c.G(objArr3, objArr2, length2 - i4, 0, i4);
        this.f1182b = 0;
        this.f1183c = objArr2;
    }

    public final int c(int i2) {
        this.f1183c.getClass();
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int d2 = d(this.f1182b + this.f1184d);
        int i2 = this.f1182b;
        if (i2 < d2) {
            Object[] objArr = this.f1183c;
            objArr.getClass();
            Arrays.fill(objArr, i2, d2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1183c;
            Arrays.fill(objArr2, this.f1182b, objArr2.length, (Object) null);
            Object[] objArr3 = this.f1183c;
            objArr3.getClass();
            Arrays.fill(objArr3, 0, d2, (Object) null);
        }
        this.f1182b = 0;
        this.f1184d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        Object[] objArr = this.f1183c;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f1184d;
        if (i2 >= 0 && i2 < i3) {
            return this.f1183c[d(this.f1182b + i2)];
        }
        f0.l.g("index: ", i2, ", size: ", i3);
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int d2 = d(this.f1182b + this.f1184d);
        int i3 = this.f1182b;
        if (i3 < d2) {
            while (i3 < d2) {
                if (d1.h.a(obj, this.f1183c[i3])) {
                    i2 = this.f1182b;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < d2) {
            return -1;
        }
        int length = this.f1183c.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < d2; i4++) {
                    if (d1.h.a(obj, this.f1183c[i4])) {
                        i3 = i4 + this.f1183c.length;
                        i2 = this.f1182b;
                    }
                }
                return -1;
            }
            if (d1.h.a(obj, this.f1183c[i3])) {
                i2 = this.f1182b;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1184d == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int d2 = d(this.f1182b + this.f1184d);
        int i3 = this.f1182b;
        if (i3 < d2) {
            length = d2 - 1;
            if (i3 <= length) {
                while (!d1.h.a(obj, this.f1183c[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f1182b;
                return length - i2;
            }
            return -1;
        }
        if (i3 > d2) {
            while (true) {
                d2--;
                Object[] objArr = this.f1183c;
                if (-1 >= d2) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.f1182b;
                    if (i4 <= length) {
                        while (!d1.h.a(obj, this.f1183c[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i2 = this.f1182b;
                    }
                } else if (d1.h.a(obj, objArr[d2])) {
                    length = d2 + this.f1183c.length;
                    i2 = this.f1182b;
                    break;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f1184d;
        if (i2 < 0 || i2 >= i3) {
            f0.l.g("index: ", i2, ", size: ", i3);
            return null;
        }
        if (i2 == i3 - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int d2 = d(this.f1182b + i2);
        Object[] objArr = this.f1183c;
        Object obj = objArr[d2];
        int i4 = this.f1184d;
        int i5 = i4 >> 1;
        int i6 = this.f1182b;
        if (i2 < i5) {
            if (d2 >= i6) {
                c.G(objArr, objArr, i6 + 1, i6, d2);
            } else {
                c.G(objArr, objArr, 1, 0, d2);
                Object[] objArr2 = this.f1183c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f1182b;
                c.G(objArr2, objArr2, i7 + 1, i7, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1183c;
            int i8 = this.f1182b;
            objArr3[i8] = null;
            this.f1182b = c(i8);
        } else {
            int d3 = d((i4 - 1) + i6);
            Object[] objArr4 = this.f1183c;
            if (d2 <= d3) {
                c.G(objArr4, objArr4, d2, d2 + 1, d3 + 1);
            } else {
                c.G(objArr4, objArr4, d2, d2 + 1, objArr4.length);
                Object[] objArr5 = this.f1183c;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.G(objArr5, objArr5, 0, 1, d3 + 1);
            }
            this.f1183c[d3] = null;
        }
        this.f1184d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int d2;
        Object[] objArr;
        collection.getClass();
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1183c.length != 0) {
            int d3 = d(this.f1182b + this.f1184d);
            int i2 = this.f1182b;
            if (i2 < d3) {
                d2 = i2;
                while (true) {
                    objArr = this.f1183c;
                    if (i2 >= d3) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f1183c[d2] = obj;
                        d2++;
                    }
                    i2++;
                }
                objArr.getClass();
                Arrays.fill(objArr, d2, d3, (Object) null);
            } else {
                int length = this.f1183c.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f1183c;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f1183c[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                d2 = d(i3);
                for (int i4 = 0; i4 < d3; i4++) {
                    Object[] objArr3 = this.f1183c;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f1183c[d2] = obj3;
                        d2 = c(d2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = d2 - this.f1182b;
                if (i5 < 0) {
                    i5 += this.f1183c.length;
                }
                this.f1184d = i5;
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f1183c;
        int i2 = this.f1182b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f1182b = c(i2);
        this.f1184d--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int d2 = d((size() - 1) + this.f1182b);
        Object[] objArr = this.f1183c;
        Object obj = objArr[d2];
        objArr[d2] = null;
        this.f1184d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int d2;
        Object[] objArr;
        collection.getClass();
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f1183c.length != 0) {
            int d3 = d(this.f1182b + this.f1184d);
            int i2 = this.f1182b;
            if (i2 < d3) {
                d2 = i2;
                while (true) {
                    objArr = this.f1183c;
                    if (i2 >= d3) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.f1183c[d2] = obj;
                        d2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                objArr.getClass();
                Arrays.fill(objArr, d2, d3, (Object) null);
            } else {
                int length = this.f1183c.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f1183c;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f1183c[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                d2 = d(i3);
                for (int i4 = 0; i4 < d3; i4++) {
                    Object[] objArr3 = this.f1183c;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f1183c[d2] = obj3;
                        d2 = c(d2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = d2 - this.f1182b;
                if (i5 < 0) {
                    i5 += this.f1183c.length;
                }
                this.f1184d = i5;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f1184d;
        if (i2 < 0 || i2 >= i3) {
            f0.l.g("index: ", i2, ", size: ", i3);
            return null;
        }
        int d2 = d(this.f1182b + i2);
        Object[] objArr = this.f1183c;
        Object obj2 = objArr[d2];
        objArr[d2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1184d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.f1184d;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int d2 = d(this.f1182b + this.f1184d);
        int i3 = this.f1182b;
        if (i3 < d2) {
            c.G(this.f1183c, objArr, 0, i3, d2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1183c;
            c.G(objArr2, objArr, 0, this.f1182b, objArr2.length);
            Object[] objArr3 = this.f1183c;
            c.G(objArr3, objArr, objArr3.length - this.f1182b, 0, d2);
        }
        int length2 = objArr.length;
        int i4 = this.f1184d;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f1184d]);
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
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.f1184d);
        a(d(this.f1182b + this.f1184d), collection);
        return true;
    }
}
