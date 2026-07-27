package r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z2.C1441y;

/* loaded from: classes.dex */
public final class r implements List, N2.a {

    /* renamed from: j, reason: collision with root package name */
    public int f9838j;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9835d = new Object[16];

    /* renamed from: e, reason: collision with root package name */
    public long[] f9836e = new long[16];

    /* renamed from: i, reason: collision with root package name */
    public int f9837i = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9839k = true;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f9837i = -1;
        s();
        this.f9839k = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof S.n) && indexOf((S.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((S.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final long e() {
        long a4 = AbstractC1065f.a(Float.POSITIVE_INFINITY, false);
        int i2 = this.f9837i + 1;
        int d4 = C1441y.d(this);
        if (i2 <= d4) {
            while (true) {
                long j4 = this.f9836e[i2];
                if (AbstractC1065f.h(j4, a4) < 0) {
                    a4 = j4;
                }
                if (Float.intBitsToFloat((int) (a4 >> 32)) < 0.0f && ((int) (4294967295L & a4)) != 0) {
                    return a4;
                }
                if (i2 == d4) {
                    break;
                }
                i2++;
            }
        }
        return a4;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object obj = this.f9835d[i2];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (S.n) obj;
    }

    public final void h(S.n nVar, float f4, boolean z4, Function0 function0) {
        int i2 = this.f9837i;
        int i4 = i2 + 1;
        this.f9837i = i4;
        Object[] objArr = this.f9835d;
        if (i4 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f9835d = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f9836e, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f9836e = copyOf2;
        }
        Object[] objArr2 = this.f9835d;
        int i5 = this.f9837i;
        objArr2[i5] = nVar;
        this.f9836e[i5] = AbstractC1065f.a(f4, z4);
        s();
        function0.invoke();
        this.f9837i = i2;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof S.n)) {
            return -1;
        }
        S.n nVar = (S.n) obj;
        int d4 = C1441y.d(this);
        if (d4 < 0) {
            return -1;
        }
        int i2 = 0;
        while (!Intrinsics.a(this.f9835d[i2], nVar)) {
            if (i2 == d4) {
                return -1;
            }
            i2++;
        }
        return i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f9838j == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new A2.b(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof S.n)) {
            return -1;
        }
        S.n nVar = (S.n) obj;
        for (int d4 = C1441y.d(this); -1 < d4; d4--) {
            if (Intrinsics.a(this.f9835d[d4], nVar)) {
                return d4;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new A2.b(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void s() {
        int i2 = this.f9837i + 1;
        int d4 = C1441y.d(this);
        if (i2 <= d4) {
            while (true) {
                this.f9835d[i2] = null;
                if (i2 == d4) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f9838j = this.f9837i + 1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f9838j;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i2, int i4) {
        return new C1076q(this, i2, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new A2.b(this, i2, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return M2.o.b(this, objArr);
    }
}
