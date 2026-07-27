package z2;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;

@Metadata
/* renamed from: z2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433q<E> extends AbstractC1428l {

    /* renamed from: j, reason: collision with root package name */
    public static final a f11954j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final Object[] f11955k = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f11956d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f11957e = f11955k;

    /* renamed from: i, reason: collision with root package name */
    public int f11958i;

    @Metadata
    /* renamed from: z2.q$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int B(int i2) {
        if (i2 == C1439w.u(this.f11957e)) {
            return 0;
        }
        return i2 + 1;
    }

    public final Object C() {
        if (isEmpty()) {
            return null;
        }
        return this.f11957e[F(C1441y.d(this) + this.f11956d)];
    }

    public final int D(int i2) {
        return i2 < 0 ? i2 + this.f11957e.length : i2;
    }

    public final void E(int i2, int i4) {
        if (i2 < i4) {
            C1436t.k(this.f11957e, i2, i4);
            return;
        }
        Object[] objArr = this.f11957e;
        C1436t.k(objArr, i2, objArr.length);
        C1436t.k(this.f11957e, 0, i4);
    }

    public final int F(int i2) {
        Object[] objArr = this.f11957e;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void G() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        G();
        w(elements.size() + e());
        s(F(e() + this.f11956d), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        G();
        w(this.f11958i + 1);
        int i2 = this.f11956d;
        int u4 = i2 == 0 ? C1439w.u(this.f11957e) : i2 - 1;
        this.f11956d = u4;
        this.f11957e[u4] = obj;
        this.f11958i++;
    }

    public final void addLast(Object obj) {
        G();
        w(e() + 1);
        this.f11957e[F(e() + this.f11956d)] = obj;
        this.f11958i = e() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            G();
            E(this.f11956d, F(e() + this.f11956d));
        }
        this.f11956d = 0;
        this.f11958i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // z2.AbstractC1428l
    public final int e() {
        return this.f11958i;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f11957e[this.f11956d];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f11958i;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        return this.f11957e[F(this.f11956d + i2)];
    }

    @Override // z2.AbstractC1428l
    public final Object h(int i2) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f11958i;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        if (i2 == C1441y.d(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        G();
        int F3 = F(this.f11956d + i2);
        Object[] objArr = this.f11957e;
        Object obj = objArr[F3];
        if (i2 < (this.f11958i >> 1)) {
            int i5 = this.f11956d;
            if (F3 >= i5) {
                C1436t.f(objArr, objArr, i5 + 1, i5, F3);
            } else {
                C1436t.f(objArr, objArr, 1, 0, F3);
                Object[] objArr2 = this.f11957e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f11956d;
                C1436t.f(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.f11957e;
            int i7 = this.f11956d;
            objArr3[i7] = null;
            this.f11956d = B(i7);
        } else {
            int F4 = F(C1441y.d(this) + this.f11956d);
            if (F3 <= F4) {
                Object[] objArr4 = this.f11957e;
                C1436t.f(objArr4, objArr4, F3, F3 + 1, F4 + 1);
            } else {
                Object[] objArr5 = this.f11957e;
                C1436t.f(objArr5, objArr5, F3, F3 + 1, objArr5.length);
                Object[] objArr6 = this.f11957e;
                objArr6[objArr6.length - 1] = objArr6[0];
                C1436t.f(objArr6, objArr6, 0, 1, F4 + 1);
            }
            this.f11957e[F4] = null;
        }
        this.f11958i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int F3 = F(e() + this.f11956d);
        int i4 = this.f11956d;
        if (i4 < F3) {
            while (i4 < F3) {
                if (Intrinsics.a(obj, this.f11957e[i4])) {
                    i2 = this.f11956d;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 < F3) {
            return -1;
        }
        int length = this.f11957e.length;
        while (true) {
            if (i4 >= length) {
                for (int i5 = 0; i5 < F3; i5++) {
                    if (Intrinsics.a(obj, this.f11957e[i5])) {
                        i4 = i5 + this.f11957e.length;
                        i2 = this.f11956d;
                    }
                }
                return -1;
            }
            if (Intrinsics.a(obj, this.f11957e[i4])) {
                i2 = this.f11956d;
                break;
            }
            i4++;
        }
        return i4 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return e() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f11957e[F(C1441y.d(this) + this.f11956d)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int u4;
        int i2;
        int F3 = F(e() + this.f11956d);
        int i4 = this.f11956d;
        if (i4 < F3) {
            u4 = F3 - 1;
            if (i4 <= u4) {
                while (!Intrinsics.a(obj, this.f11957e[u4])) {
                    if (u4 != i4) {
                        u4--;
                    }
                }
                i2 = this.f11956d;
                return u4 - i2;
            }
            return -1;
        }
        if (i4 > F3) {
            int i5 = F3 - 1;
            while (true) {
                if (-1 >= i5) {
                    u4 = C1439w.u(this.f11957e);
                    int i6 = this.f11956d;
                    if (i6 <= u4) {
                        while (!Intrinsics.a(obj, this.f11957e[u4])) {
                            if (u4 != i6) {
                                u4--;
                            }
                        }
                        i2 = this.f11956d;
                    }
                } else {
                    if (Intrinsics.a(obj, this.f11957e[i5])) {
                        u4 = i5 + this.f11957e.length;
                        i2 = this.f11956d;
                        break;
                    }
                    i5--;
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
        h(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int F3;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f11957e.length != 0) {
            int F4 = F(this.f11958i + this.f11956d);
            int i2 = this.f11956d;
            if (i2 < F4) {
                F3 = i2;
                while (i2 < F4) {
                    Object obj = this.f11957e[i2];
                    if (elements.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f11957e[F3] = obj;
                        F3++;
                    }
                    i2++;
                }
                C1436t.k(this.f11957e, F3, F4);
            } else {
                int length = this.f11957e.length;
                boolean z5 = false;
                int i4 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f11957e;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f11957e[i4] = obj2;
                        i4++;
                    }
                    i2++;
                }
                F3 = F(i4);
                for (int i5 = 0; i5 < F4; i5++) {
                    Object[] objArr2 = this.f11957e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f11957e[F3] = obj3;
                        F3 = B(F3);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                G();
                this.f11958i = D(F3 - this.f11956d);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        G();
        Object[] objArr = this.f11957e;
        int i2 = this.f11956d;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f11956d = B(i2);
        this.f11958i = e() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        G();
        int F3 = F(C1441y.d(this) + this.f11956d);
        Object[] objArr = this.f11957e;
        Object obj = objArr[F3];
        objArr[F3] = null;
        this.f11958i = e() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i4) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i5 = this.f11958i;
        aVar.getClass();
        AbstractC1420d.a.d(i2, i4, i5);
        int i6 = i4 - i2;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f11958i) {
            clear();
            return;
        }
        if (i6 == 1) {
            h(i2);
            return;
        }
        G();
        if (i2 < this.f11958i - i4) {
            int F3 = F((i2 - 1) + this.f11956d);
            int F4 = F((i4 - 1) + this.f11956d);
            while (i2 > 0) {
                int i7 = F3 + 1;
                int min = Math.min(i2, Math.min(i7, F4 + 1));
                Object[] objArr = this.f11957e;
                int i8 = F4 - min;
                int i9 = F3 - min;
                C1436t.f(objArr, objArr, i8 + 1, i9 + 1, i7);
                F3 = D(i9);
                F4 = D(i8);
                i2 -= min;
            }
            int F5 = F(this.f11956d + i6);
            E(this.f11956d, F5);
            this.f11956d = F5;
        } else {
            int F6 = F(this.f11956d + i4);
            int F7 = F(this.f11956d + i2);
            int i10 = this.f11958i;
            while (true) {
                i10 -= i4;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f11957e;
                i4 = Math.min(i10, Math.min(objArr2.length - F6, objArr2.length - F7));
                Object[] objArr3 = this.f11957e;
                int i11 = F6 + i4;
                C1436t.f(objArr3, objArr3, F7, F6, i11);
                F6 = F(i11);
                F7 = F(F7 + i4);
            }
            int F8 = F(this.f11958i + this.f11956d);
            E(D(F8 - i6), F8);
        }
        this.f11958i -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int F3;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f11957e.length != 0) {
            int F4 = F(this.f11958i + this.f11956d);
            int i2 = this.f11956d;
            if (i2 < F4) {
                F3 = i2;
                while (i2 < F4) {
                    Object obj = this.f11957e[i2];
                    if (elements.contains(obj)) {
                        this.f11957e[F3] = obj;
                        F3++;
                    } else {
                        z4 = true;
                    }
                    i2++;
                }
                C1436t.k(this.f11957e, F3, F4);
            } else {
                int length = this.f11957e.length;
                boolean z5 = false;
                int i4 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f11957e;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f11957e[i4] = obj2;
                        i4++;
                    } else {
                        z5 = true;
                    }
                    i2++;
                }
                F3 = F(i4);
                for (int i5 = 0; i5 < F4; i5++) {
                    Object[] objArr2 = this.f11957e;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (elements.contains(obj3)) {
                        this.f11957e[F3] = obj3;
                        F3 = B(F3);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                G();
                this.f11958i = D(F3 - this.f11956d);
            }
        }
        return z4;
    }

    public final void s(int i2, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f11957e.length;
        while (i2 < length && it.hasNext()) {
            this.f11957e[i2] = it.next();
            i2++;
        }
        int i4 = this.f11956d;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f11957e[i5] = it.next();
        }
        this.f11958i = collection.size() + e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f11958i;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        int F3 = F(this.f11956d + i2);
        Object[] objArr = this.f11957e;
        Object obj2 = objArr[F3];
        objArr[F3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    public final void w(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f11957e;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f11955k) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f11957e = new Object[i2];
            return;
        }
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[AbstractC1420d.a.e(length, i2)];
        Object[] objArr3 = this.f11957e;
        C1436t.f(objArr3, objArr2, 0, this.f11956d, objArr3.length);
        Object[] objArr4 = this.f11957e;
        int length2 = objArr4.length;
        int i4 = this.f11956d;
        C1436t.f(objArr4, objArr2, length2 - i4, 0, i4);
        this.f11956d = 0;
        this.f11957e = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f11958i;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        if (i2 == this.f11958i) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        G();
        w(this.f11958i + 1);
        int F3 = F(this.f11956d + i2);
        int i5 = this.f11958i;
        if (i2 < ((i5 + 1) >> 1)) {
            int u4 = F3 == 0 ? C1439w.u(this.f11957e) : F3 - 1;
            int i6 = this.f11956d;
            int u5 = i6 == 0 ? C1439w.u(this.f11957e) : i6 - 1;
            int i7 = this.f11956d;
            if (u4 >= i7) {
                Object[] objArr = this.f11957e;
                objArr[u5] = objArr[i7];
                C1436t.f(objArr, objArr, i7, i7 + 1, u4 + 1);
            } else {
                Object[] objArr2 = this.f11957e;
                C1436t.f(objArr2, objArr2, i7 - 1, i7, objArr2.length);
                Object[] objArr3 = this.f11957e;
                objArr3[objArr3.length - 1] = objArr3[0];
                C1436t.f(objArr3, objArr3, 0, 1, u4 + 1);
            }
            this.f11957e[u4] = obj;
            this.f11956d = u5;
        } else {
            int F4 = F(i5 + this.f11956d);
            if (F3 < F4) {
                Object[] objArr4 = this.f11957e;
                C1436t.f(objArr4, objArr4, F3 + 1, F3, F4);
            } else {
                Object[] objArr5 = this.f11957e;
                C1436t.f(objArr5, objArr5, 1, 0, F4);
                Object[] objArr6 = this.f11957e;
                objArr6[0] = objArr6[objArr6.length - 1];
                C1436t.f(objArr6, objArr6, F3 + 1, F3, objArr6.length - 1);
            }
            this.f11957e[F3] = obj;
        }
        this.f11958i++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i2 = this.f11958i;
        if (length < i2) {
            Intrinsics.checkNotNullParameter(array, "reference");
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i2);
            Intrinsics.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int F3 = F(this.f11958i + this.f11956d);
        int i4 = this.f11956d;
        if (i4 < F3) {
            C1436t.h(this.f11957e, array, i4, F3, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f11957e;
            C1436t.f(objArr, array, 0, this.f11956d, objArr.length);
            Object[] objArr2 = this.f11957e;
            C1436t.f(objArr2, array, objArr2.length - this.f11956d, 0, F3);
        }
        int i5 = this.f11958i;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i5 < array.length) {
            array[i5] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f11958i;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.f11958i) {
            return addAll(elements);
        }
        G();
        w(elements.size() + this.f11958i);
        int F3 = F(this.f11958i + this.f11956d);
        int F4 = F(this.f11956d + i2);
        int size = elements.size();
        if (i2 < ((this.f11958i + 1) >> 1)) {
            int i5 = this.f11956d;
            int i6 = i5 - size;
            if (F4 < i5) {
                Object[] objArr = this.f11957e;
                C1436t.f(objArr, objArr, i6, i5, objArr.length);
                if (size >= F4) {
                    Object[] objArr2 = this.f11957e;
                    C1436t.f(objArr2, objArr2, objArr2.length - size, 0, F4);
                } else {
                    Object[] objArr3 = this.f11957e;
                    C1436t.f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f11957e;
                    C1436t.f(objArr4, objArr4, 0, size, F4);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f11957e;
                C1436t.f(objArr5, objArr5, i6, i5, F4);
            } else {
                Object[] objArr6 = this.f11957e;
                i6 += objArr6.length;
                int i7 = F4 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    C1436t.f(objArr6, objArr6, i6, i5, F4);
                } else {
                    C1436t.f(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f11957e;
                    C1436t.f(objArr7, objArr7, 0, this.f11956d + length, F4);
                }
            }
            this.f11956d = i6;
            s(D(F4 - size), elements);
        } else {
            int i8 = F4 + size;
            if (F4 < F3) {
                int i9 = size + F3;
                Object[] objArr8 = this.f11957e;
                if (i9 <= objArr8.length) {
                    C1436t.f(objArr8, objArr8, i8, F4, F3);
                } else if (i8 >= objArr8.length) {
                    C1436t.f(objArr8, objArr8, i8 - objArr8.length, F4, F3);
                } else {
                    int length2 = F3 - (i9 - objArr8.length);
                    C1436t.f(objArr8, objArr8, 0, length2, F3);
                    Object[] objArr9 = this.f11957e;
                    C1436t.f(objArr9, objArr9, i8, F4, length2);
                }
            } else {
                Object[] objArr10 = this.f11957e;
                C1436t.f(objArr10, objArr10, size, 0, F3);
                Object[] objArr11 = this.f11957e;
                if (i8 >= objArr11.length) {
                    C1436t.f(objArr11, objArr11, i8 - objArr11.length, F4, objArr11.length);
                } else {
                    C1436t.f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f11957e;
                    C1436t.f(objArr12, objArr12, i8, F4, objArr12.length - size);
                }
            }
            s(F4, elements);
        }
        return true;
    }
}
