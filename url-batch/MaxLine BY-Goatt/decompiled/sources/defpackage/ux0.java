package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ux0 implements List, k71 {
    public final jn1 m = new jn1(16);
    public final dn1 n = new dn1(16);
    public int o = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        long a = s03.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.o + 1;
        int i2 = this.m.b - 1;
        if (i > i2) {
            return a;
        }
        while (true) {
            dn1 dn1Var = this.n;
            if (i < 0) {
                dn1Var.getClass();
                break;
            }
            if (i >= dn1Var.b) {
                break;
            }
            long j = dn1Var.a[i];
            if (j8.q(j, a) < 0) {
                a = j;
            }
            if ((j8.E(a) >= 0.0f || !j8.M(a)) && i != i2) {
                i++;
            }
        }
        a.c("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.m.k(i, i2);
        dn1 dn1Var = this.n;
        if (i >= 0) {
            int i3 = dn1Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    lh.e("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = dn1Var.a;
                            ni.g(jArr, jArr, i, i2, i3);
                        }
                        dn1Var.b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            dn1Var.getClass();
        }
        a.c("Index must be between 0 and size");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.o = -1;
        this.m.c();
        this.n.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof ul1) && indexOf((ul1) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((ul1) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object e = this.m.e(i);
        e.getClass();
        return (ul1) e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof ul1)) {
            return -1;
        }
        ul1 ul1Var = (ul1) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!Intrinsics.b(this.m.e(i), ul1Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.m.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new sx0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof ul1)) {
            return -1;
        }
        ul1 ul1Var = (ul1) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (Intrinsics.b(this.m.e(size), ul1Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new sx0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
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

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.m.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new tx0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ll3.W(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ll3.X(this, objArr);
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
    public final ListIterator listIterator(int i) {
        return new sx0(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
