package c2;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements List, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final s.d0 f1628d = new s.d0(16);

    /* renamed from: e, reason: collision with root package name */
    public final s.y f1629e = new s.y(16);

    /* renamed from: i, reason: collision with root package name */
    public int f1630i = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b() {
        long a9 = k.a(Float.POSITIVE_INFINITY, false, false);
        int i3 = this.f1630i + 1;
        int i10 = this.f1628d.f8285b - 1;
        if (i3 > i10) {
            return a9;
        }
        while (true) {
            s.y yVar = this.f1629e;
            if (i3 < 0) {
                yVar.getClass();
                break;
            }
            if (i3 >= yVar.f8398b) {
                break;
            }
            long j = yVar.f8397a[i3];
            if (k.g(j, a9) < 0) {
                a9 = j;
            }
            if ((k.k(a9) >= 0.0f || !k.p(a9)) && i3 != i10) {
                i3++;
            }
        }
        kotlin.collections.i0.g("Index must be between 0 and size");
        return 0L;
    }

    public final void c(int i3, int i10) {
        if (i3 >= i10) {
            return;
        }
        this.f1628d.l(i3, i10);
        s.y yVar = this.f1629e;
        if (i3 >= 0) {
            int i11 = yVar.f8398b;
            if (i3 <= i11 && i10 >= 0 && i10 <= i11) {
                if (i10 < i3) {
                    te.a1.e("The end index must be < start index");
                    return;
                } else {
                    if (i10 != i3) {
                        if (i10 < i11) {
                            long[] jArr = yVar.f8397a;
                            kotlin.collections.v.e(jArr, jArr, i3, i10, i11);
                        }
                        yVar.f8398b -= i10 - i3;
                        return;
                    }
                    return;
                }
            }
        } else {
            yVar.getClass();
        }
        kotlin.collections.i0.g("Index must be between 0 and size");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f1630i = -1;
        this.f1628d.d();
        this.f1629e.f8398b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof d1.k) && indexOf((d1.k) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d1.k) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object f3 = this.f1628d.f(i3);
        f3.getClass();
        return (d1.k) f3;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof d1.k)) {
            return -1;
        }
        d1.k kVar = (d1.k) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (!Intrinsics.a(this.f1628d.f(i3), kVar)) {
                if (i3 != size) {
                    i3++;
                }
            }
            return i3;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1628d.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b1.d0(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof d1.k)) {
            return -1;
        }
        d1.k kVar = (d1.k) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (Intrinsics.a(this.f1628d.f(size), kVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new b1.d0(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
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
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1628d.f8285b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        return new n(this, i3, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wd.i.b(this, objArr);
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
    public final ListIterator listIterator(int i3) {
        return new b1.d0(this, i3, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
