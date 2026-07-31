package w1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements List, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final o.e0 f7745d = new o.e0(16);

    /* renamed from: e, reason: collision with root package name */
    public final o.z f7746e = new o.z(16);

    /* renamed from: f, reason: collision with root package name */
    public int f7747f = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        long a8 = f.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.f7747f + 1;
        int t3 = s6.a.t(this);
        if (i > t3) {
            return a8;
        }
        while (true) {
            o.z zVar = this.f7746e;
            if (i < 0) {
                zVar.getClass();
                break;
            }
            if (i >= zVar.f5570b) {
                break;
            }
            long j7 = zVar.f5569a[i];
            if (f.h(j7, a8) < 0) {
                a8 = j7;
            }
            if ((f.k(a8) >= 0.0f || !f.p(a8)) && i != t3) {
                i++;
            }
        }
        p.a.d("Index must be between 0 and size");
        throw null;
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

    public final void b(int i, int i8) {
        if (i >= i8) {
            return;
        }
        this.f7745d.k(i, i8);
        o.z zVar = this.f7746e;
        if (i >= 0) {
            int i9 = zVar.f5570b;
            if (i <= i9 && i8 >= 0 && i8 <= i9) {
                if (i8 < i) {
                    p.a.c("The end index must be < start index");
                    throw null;
                }
                if (i8 != i) {
                    if (i8 < i9) {
                        long[] jArr = zVar.f5569a;
                        d6.l.G(jArr, jArr, i, i8, i9);
                    }
                    zVar.f5570b -= i8 - i;
                    return;
                }
                return;
            }
        } else {
            zVar.getClass();
        }
        p.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f7747f = -1;
        this.f7745d.c();
        this.f7746e.f5570b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof y0.l) && indexOf((y0.l) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((y0.l) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object e8 = this.f7745d.e(i);
        q6.i.c(e8, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (y0.l) e8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y0.l)) {
            return -1;
        }
        y0.l lVar = (y0.l) obj;
        int t3 = s6.a.t(this);
        if (t3 >= 0) {
            int i = 0;
            while (!q6.i.a(this.f7745d.e(i), lVar)) {
                if (i != t3) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7745d.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e6.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y0.l)) {
            return -1;
        }
        y0.l lVar = (y0.l) obj;
        for (int t3 = s6.a.t(this); -1 < t3; t3--) {
            if (q6.i.a(this.f7745d.e(t3), lVar)) {
                return t3;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e6.a(this, 0, 7);
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
        return this.f7745d.f5443b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i8) {
        return new o(this, i, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q6.h.a(this);
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
        return new e6.a(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return q6.h.b(this, objArr);
    }
}
