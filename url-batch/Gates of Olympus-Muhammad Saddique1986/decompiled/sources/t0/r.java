package t0;

import e2.InterfaceC0422a;
import g2.InterfaceC0439a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class r implements List, InterfaceC0439a {

    /* renamed from: g, reason: collision with root package name */
    public int f8786g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f8783d = new Object[16];

    /* renamed from: e, reason: collision with root package name */
    public long[] f8784e = new long[16];

    /* renamed from: f, reason: collision with root package name */
    public int f8785f = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8787h = true;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long a3 = AbstractC0993f.a(Float.POSITIVE_INFINITY, false);
        int i3 = this.f8785f + 1;
        int z02 = S1.m.z0(this);
        if (i3 <= z02) {
            while (true) {
                long j3 = this.f8784e[i3];
                if (AbstractC0993f.h(j3, a3) < 0) {
                    a3 = j3;
                }
                if (Float.intBitsToFloat((int) (a3 >> 32)) < 0.0f && ((int) (4294967295L & a3)) != 0) {
                    return a3;
                }
                if (i3 == z02) {
                    break;
                }
                i3++;
            }
        }
        return a3;
    }

    public final void c(U.p pVar, float f3, boolean z3, InterfaceC0422a interfaceC0422a) {
        int i3 = this.f8785f;
        int i4 = i3 + 1;
        this.f8785f = i4;
        Object[] objArr = this.f8783d;
        if (i4 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f8783d = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f8784e, length);
            f2.j.e(copyOf2, "copyOf(this, newSize)");
            this.f8784e = copyOf2;
        }
        Object[] objArr2 = this.f8783d;
        int i5 = this.f8785f;
        objArr2[i5] = pVar;
        this.f8784e[i5] = AbstractC0993f.a(f3, z3);
        d();
        interfaceC0422a.b();
        this.f8785f = i3;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f8785f = -1;
        d();
        this.f8787h = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof U.p) && indexOf((U.p) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((U.p) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i3 = this.f8785f + 1;
        int z02 = S1.m.z0(this);
        if (i3 <= z02) {
            while (true) {
                this.f8783d[i3] = null;
                if (i3 == z02) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f8786g = this.f8785f + 1;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object obj = this.f8783d[i3];
        f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (U.p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof U.p)) {
            return -1;
        }
        U.p pVar = (U.p) obj;
        int z02 = S1.m.z0(this);
        if (z02 < 0) {
            return -1;
        }
        int i3 = 0;
        while (!f2.j.a(this.f8783d[i3], pVar)) {
            if (i3 == z02) {
                return -1;
            }
            i3++;
        }
        return i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8786g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new S.x(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof U.p)) {
            return -1;
        }
        U.p pVar = (U.p) obj;
        for (int z02 = S1.m.z0(this); -1 < z02; z02--) {
            if (f2.j.a(this.f8783d[z02], pVar)) {
                return z02;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new S.x(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
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
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8786g;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        return new C1004q(this, i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
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
        return new S.x(this, i3, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f2.i.b(this, objArr);
    }
}
