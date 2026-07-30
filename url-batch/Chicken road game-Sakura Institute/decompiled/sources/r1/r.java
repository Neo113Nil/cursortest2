package r1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements List, s6.a {

    /* renamed from: i, reason: collision with root package name */
    public int f7889i;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f7886f = new Object[16];

    /* renamed from: g, reason: collision with root package name */
    public long[] f7887g = new long[16];

    /* renamed from: h, reason: collision with root package name */
    public int f7888h = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7890j = true;

    public final long a() {
        long a3 = f.a(Float.POSITIVE_INFINITY, false);
        int i7 = this.f7888h + 1;
        int W = e6.m.W(this);
        if (i7 <= W) {
            while (true) {
                long j8 = this.f7887g[i7];
                if (f.h(j8, a3) < 0) {
                    a3 = j8;
                }
                if (Float.intBitsToFloat((int) (a3 >> 32)) < 0.0f && ((int) (4294967295L & a3)) != 0) {
                    return a3;
                }
                if (i7 == W) {
                    break;
                }
                i7++;
            }
        }
        return a3;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f7888h = -1;
        m();
        this.f7890j = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof s0.n) && indexOf((s0.n) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((s0.n) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void g(s0.n nVar, float f9, boolean z8, q6.a aVar) {
        int i7 = this.f7888h;
        int i8 = i7 + 1;
        this.f7888h = i8;
        Object[] objArr = this.f7886f;
        if (i8 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f7886f = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f7887g, length);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f7887g = copyOf2;
        }
        Object[] objArr2 = this.f7886f;
        int i9 = this.f7888h;
        objArr2[i9] = nVar;
        this.f7887g[i9] = f.a(f9, z8);
        m();
        aVar.a();
        this.f7888h = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object obj = this.f7886f[i7];
        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (s0.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof s0.n)) {
            return -1;
        }
        s0.n nVar = (s0.n) obj;
        int W = e6.m.W(this);
        if (W >= 0) {
            int i7 = 0;
            while (!r6.k.a(this.f7886f[i7], nVar)) {
                if (i7 != W) {
                    i7++;
                }
            }
            return i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7889i == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new f6.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof s0.n)) {
            return -1;
        }
        s0.n nVar = (s0.n) obj;
        for (int W = e6.m.W(this); -1 < W; W--) {
            if (r6.k.a(this.f7886f[W], nVar)) {
                return W;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new f6.a(this, 0, 7);
    }

    public final void m() {
        int i7 = this.f7888h + 1;
        int W = e6.m.W(this);
        if (i7 <= W) {
            while (true) {
                this.f7886f[i7] = null;
                if (i7 == W) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f7889i = this.f7888h + 1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
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

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7889i;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        return new q(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r6.j.a(this);
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
    public final ListIterator listIterator(int i7) {
        return new f6.a(this, i7, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r6.j.b(this, objArr);
    }
}
