package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3218h extends AbstractC3215e {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f41091e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f41092f = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private int f41093b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f41094c = f41092f;

    /* renamed from: d, reason: collision with root package name */
    private int f41095d;

    /* renamed from: kotlin.collections.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void f(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f41094c.length;
        while (i4 < length && it.hasNext()) {
            this.f41094c[i4] = it.next();
            i4++;
        }
        int i5 = this.f41093b;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f41094c[i6] = it.next();
        }
        this.f41095d = size() + collection.size();
    }

    private final void g(int i4) {
        Object[] objArr = new Object[i4];
        Object[] objArr2 = this.f41094c;
        C3222l.h(objArr2, objArr, 0, this.f41093b, objArr2.length);
        Object[] objArr3 = this.f41094c;
        int length = objArr3.length;
        int i5 = this.f41093b;
        C3222l.h(objArr3, objArr, length - i5, 0, i5);
        this.f41093b = 0;
        this.f41094c = objArr;
    }

    private final int h(int i4) {
        return i4 == 0 ? C3223m.M(this.f41094c) : i4 - 1;
    }

    private final void k(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f41094c;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f41092f) {
            this.f41094c = new Object[kotlin.ranges.g.d(i4, 10)];
        } else {
            g(AbstractC3213c.Companion.e(objArr.length, i4));
        }
    }

    private final int l(int i4) {
        if (i4 == C3223m.M(this.f41094c)) {
            return 0;
        }
        return i4 + 1;
    }

    private final int n(int i4) {
        return i4 < 0 ? i4 + this.f41094c.length : i4;
    }

    private final int o(int i4) {
        Object[] objArr = this.f41094c;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        k(size() + elements.size());
        f(o(this.f41093b + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        k(size() + 1);
        int h4 = h(this.f41093b);
        this.f41093b = h4;
        this.f41094c[h4] = obj;
        this.f41095d = size() + 1;
    }

    public final void addLast(Object obj) {
        k(size() + 1);
        this.f41094c[o(this.f41093b + size())] = obj;
        this.f41095d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int o4 = o(this.f41093b + size());
        int i4 = this.f41093b;
        if (i4 < o4) {
            C3222l.n(this.f41094c, null, i4, o4);
        } else if (!isEmpty()) {
            Object[] objArr = this.f41094c;
            C3222l.n(objArr, null, this.f41093b, objArr.length);
            C3222l.n(this.f41094c, null, 0, o4);
        }
        this.f41093b = 0;
        this.f41095d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC3215e
    public int d() {
        return this.f41095d;
    }

    @Override // kotlin.collections.AbstractC3215e
    public Object e(int i4) {
        AbstractC3213c.Companion.b(i4, size());
        if (i4 == C3227q.getLastIndex(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        int o4 = o(this.f41093b + i4);
        Object obj = this.f41094c[o4];
        if (i4 < (size() >> 1)) {
            int i5 = this.f41093b;
            if (o4 >= i5) {
                Object[] objArr = this.f41094c;
                C3222l.h(objArr, objArr, i5 + 1, i5, o4);
            } else {
                Object[] objArr2 = this.f41094c;
                C3222l.h(objArr2, objArr2, 1, 0, o4);
                Object[] objArr3 = this.f41094c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f41093b;
                C3222l.h(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.f41094c;
            int i7 = this.f41093b;
            objArr4[i7] = null;
            this.f41093b = l(i7);
        } else {
            int o5 = o(this.f41093b + C3227q.getLastIndex(this));
            if (o4 <= o5) {
                Object[] objArr5 = this.f41094c;
                C3222l.h(objArr5, objArr5, o4, o4 + 1, o5 + 1);
            } else {
                Object[] objArr6 = this.f41094c;
                C3222l.h(objArr6, objArr6, o4, o4 + 1, objArr6.length);
                Object[] objArr7 = this.f41094c;
                objArr7[objArr7.length - 1] = objArr7[0];
                C3222l.h(objArr7, objArr7, 0, 1, o5 + 1);
            }
            this.f41094c[o5] = null;
        }
        this.f41095d = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i4) {
        AbstractC3213c.Companion.b(i4, size());
        return this.f41094c[o(this.f41093b + i4)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i4;
        int o4 = o(this.f41093b + size());
        int i5 = this.f41093b;
        if (i5 < o4) {
            while (i5 < o4) {
                if (Intrinsics.areEqual(obj, this.f41094c[i5])) {
                    i4 = this.f41093b;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < o4) {
            return -1;
        }
        int length = this.f41094c.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < o4; i6++) {
                    if (Intrinsics.areEqual(obj, this.f41094c[i6])) {
                        i5 = i6 + this.f41094c.length;
                        i4 = this.f41093b;
                    }
                }
                return -1;
            }
            if (Intrinsics.areEqual(obj, this.f41094c[i5])) {
                i4 = this.f41093b;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int M3;
        int i4;
        int o4 = o(this.f41093b + size());
        int i5 = this.f41093b;
        if (i5 < o4) {
            M3 = o4 - 1;
            if (i5 <= M3) {
                while (!Intrinsics.areEqual(obj, this.f41094c[M3])) {
                    if (M3 != i5) {
                        M3--;
                    }
                }
                i4 = this.f41093b;
                return M3 - i4;
            }
            return -1;
        }
        if (i5 > o4) {
            int i6 = o4 - 1;
            while (true) {
                if (-1 >= i6) {
                    M3 = C3223m.M(this.f41094c);
                    int i7 = this.f41093b;
                    if (i7 <= M3) {
                        while (!Intrinsics.areEqual(obj, this.f41094c[M3])) {
                            if (M3 != i7) {
                                M3--;
                            }
                        }
                        i4 = this.f41093b;
                    }
                } else {
                    if (Intrinsics.areEqual(obj, this.f41094c[i6])) {
                        M3 = i6 + this.f41094c.length;
                        i4 = this.f41093b;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    public final Object m() {
        if (isEmpty()) {
            return null;
        }
        return this.f41094c[o(this.f41093b + C3227q.getLastIndex(this))];
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int o4;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f41094c.length != 0) {
            int o5 = o(this.f41093b + size());
            int i4 = this.f41093b;
            if (i4 < o5) {
                o4 = i4;
                while (i4 < o5) {
                    Object obj = this.f41094c[i4];
                    if (elements.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f41094c[o4] = obj;
                        o4++;
                    }
                    i4++;
                }
                C3222l.n(this.f41094c, null, o4, o5);
            } else {
                int length = this.f41094c.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f41094c;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f41094c[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                o4 = o(i5);
                for (int i6 = 0; i6 < o5; i6++) {
                    Object[] objArr2 = this.f41094c;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f41094c[o4] = obj3;
                        o4 = l(o4);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                this.f41095d = n(o4 - this.f41093b);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f41094c;
        int i4 = this.f41093b;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f41093b = l(i4);
        this.f41095d = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int o4 = o(this.f41093b + C3227q.getLastIndex(this));
        Object[] objArr = this.f41094c;
        Object obj = objArr[o4];
        objArr[o4] = null;
        this.f41095d = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int o4;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f41094c.length != 0) {
            int o5 = o(this.f41093b + size());
            int i4 = this.f41093b;
            if (i4 < o5) {
                o4 = i4;
                while (i4 < o5) {
                    Object obj = this.f41094c[i4];
                    if (elements.contains(obj)) {
                        this.f41094c[o4] = obj;
                        o4++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                C3222l.n(this.f41094c, null, o4, o5);
            } else {
                int length = this.f41094c.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f41094c;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (elements.contains(obj2)) {
                        this.f41094c[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                o4 = o(i5);
                for (int i6 = 0; i6 < o5; i6++) {
                    Object[] objArr2 = this.f41094c;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.f41094c[o4] = obj3;
                        o4 = l(o4);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                this.f41095d = n(o4 - this.f41093b);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i4, Object obj) {
        AbstractC3213c.Companion.b(i4, size());
        int o4 = o(this.f41093b + i4);
        Object[] objArr = this.f41094c;
        Object obj2 = objArr[o4];
        objArr[o4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = C3220j.a(array, size());
        }
        Object[] objArr = array;
        int o4 = o(this.f41093b + size());
        int i4 = this.f41093b;
        if (i4 < o4) {
            C3222l.j(this.f41094c, objArr, 0, i4, o4, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f41094c;
            C3222l.h(objArr2, objArr, 0, this.f41093b, objArr2.length);
            Object[] objArr3 = this.f41094c;
            C3222l.h(objArr3, objArr, objArr3.length - this.f41093b, 0, o4);
        }
        return C3226p.terminateCollectionToArray(size(), objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        AbstractC3213c.Companion.c(i4, size());
        if (i4 == size()) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        k(size() + 1);
        int o4 = o(this.f41093b + i4);
        if (i4 < ((size() + 1) >> 1)) {
            int h4 = h(o4);
            int h5 = h(this.f41093b);
            int i5 = this.f41093b;
            if (h4 >= i5) {
                Object[] objArr = this.f41094c;
                objArr[h5] = objArr[i5];
                C3222l.h(objArr, objArr, i5, i5 + 1, h4 + 1);
            } else {
                Object[] objArr2 = this.f41094c;
                C3222l.h(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                Object[] objArr3 = this.f41094c;
                objArr3[objArr3.length - 1] = objArr3[0];
                C3222l.h(objArr3, objArr3, 0, 1, h4 + 1);
            }
            this.f41094c[h4] = obj;
            this.f41093b = h5;
        } else {
            int o5 = o(this.f41093b + size());
            if (o4 < o5) {
                Object[] objArr4 = this.f41094c;
                C3222l.h(objArr4, objArr4, o4 + 1, o4, o5);
            } else {
                Object[] objArr5 = this.f41094c;
                C3222l.h(objArr5, objArr5, 1, 0, o5);
                Object[] objArr6 = this.f41094c;
                objArr6[0] = objArr6[objArr6.length - 1];
                C3222l.h(objArr6, objArr6, o4 + 1, o4, objArr6.length - 1);
            }
            this.f41094c[o4] = obj;
        }
        this.f41095d = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC3213c.Companion.c(i4, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i4 == size()) {
            return addAll(elements);
        }
        k(size() + elements.size());
        int o4 = o(this.f41093b + size());
        int o5 = o(this.f41093b + i4);
        int size = elements.size();
        if (i4 < ((size() + 1) >> 1)) {
            int i5 = this.f41093b;
            int i6 = i5 - size;
            if (o5 < i5) {
                Object[] objArr = this.f41094c;
                C3222l.h(objArr, objArr, i6, i5, objArr.length);
                if (size >= o5) {
                    Object[] objArr2 = this.f41094c;
                    C3222l.h(objArr2, objArr2, objArr2.length - size, 0, o5);
                } else {
                    Object[] objArr3 = this.f41094c;
                    C3222l.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f41094c;
                    C3222l.h(objArr4, objArr4, 0, size, o5);
                }
            } else if (i6 >= 0) {
                Object[] objArr5 = this.f41094c;
                C3222l.h(objArr5, objArr5, i6, i5, o5);
            } else {
                Object[] objArr6 = this.f41094c;
                i6 += objArr6.length;
                int i7 = o5 - i5;
                int length = objArr6.length - i6;
                if (length >= i7) {
                    C3222l.h(objArr6, objArr6, i6, i5, o5);
                } else {
                    C3222l.h(objArr6, objArr6, i6, i5, i5 + length);
                    Object[] objArr7 = this.f41094c;
                    C3222l.h(objArr7, objArr7, 0, this.f41093b + length, o5);
                }
            }
            this.f41093b = i6;
            f(n(o5 - size), elements);
        } else {
            int i8 = o5 + size;
            if (o5 < o4) {
                int i9 = size + o4;
                Object[] objArr8 = this.f41094c;
                if (i9 <= objArr8.length) {
                    C3222l.h(objArr8, objArr8, i8, o5, o4);
                } else if (i8 >= objArr8.length) {
                    C3222l.h(objArr8, objArr8, i8 - objArr8.length, o5, o4);
                } else {
                    int length2 = o4 - (i9 - objArr8.length);
                    C3222l.h(objArr8, objArr8, 0, length2, o4);
                    Object[] objArr9 = this.f41094c;
                    C3222l.h(objArr9, objArr9, i8, o5, length2);
                }
            } else {
                Object[] objArr10 = this.f41094c;
                C3222l.h(objArr10, objArr10, size, 0, o4);
                Object[] objArr11 = this.f41094c;
                if (i8 >= objArr11.length) {
                    C3222l.h(objArr11, objArr11, i8 - objArr11.length, o5, objArr11.length);
                } else {
                    C3222l.h(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f41094c;
                    C3222l.h(objArr12, objArr12, i8, o5, objArr12.length - size);
                }
            }
            f(o5, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
