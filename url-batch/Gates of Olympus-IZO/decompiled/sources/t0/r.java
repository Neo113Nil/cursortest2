package t0;

import a2.InterfaceC0184a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class r implements List, InterfaceC0184a {

    /* renamed from: g, reason: collision with root package name */
    public int f7952g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f7949d = new Object[16];

    /* renamed from: e, reason: collision with root package name */
    public long[] f7950e = new long[16];

    /* renamed from: f, reason: collision with root package name */
    public int f7951f = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7953h = true;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long a3 = AbstractC0898f.a(Float.POSITIVE_INFINITY, false);
        int i3 = this.f7951f + 1;
        int b02 = M1.m.b0(this);
        if (i3 <= b02) {
            while (true) {
                long j3 = this.f7950e[i3];
                if (AbstractC0898f.h(j3, a3) < 0) {
                    a3 = j3;
                }
                if (Float.intBitsToFloat((int) (a3 >> 32)) < 0.0f && ((int) (4294967295L & a3)) != 0) {
                    return a3;
                }
                if (i3 == b02) {
                    break;
                }
                i3++;
            }
        }
        return a3;
    }

    public final void c(U.k kVar, float f3, boolean z3, Y1.a aVar) {
        int i3 = this.f7951f;
        int i4 = i3 + 1;
        this.f7951f = i4;
        Object[] objArr = this.f7949d;
        if (i4 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f7949d = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f7950e, length);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            this.f7950e = copyOf2;
        }
        Object[] objArr2 = this.f7949d;
        int i5 = this.f7951f;
        objArr2[i5] = kVar;
        this.f7950e[i5] = AbstractC0898f.a(f3, z3);
        d();
        aVar.b();
        this.f7951f = i3;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f7951f = -1;
        d();
        this.f7953h = true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof U.k) && indexOf((U.k) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((U.k) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        int i3 = this.f7951f + 1;
        int b02 = M1.m.b0(this);
        if (i3 <= b02) {
            while (true) {
                this.f7949d[i3] = null;
                if (i3 == b02) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f7952g = this.f7951f + 1;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        Object obj = this.f7949d[i3];
        Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (U.k) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof U.k)) {
            return -1;
        }
        U.k kVar = (U.k) obj;
        int b02 = M1.m.b0(this);
        if (b02 < 0) {
            return -1;
        }
        int i3 = 0;
        while (!Z1.i.a(this.f7949d[i3], kVar)) {
            if (i3 == b02) {
                return -1;
            }
            i3++;
        }
        return i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7952g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new N1.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof U.k)) {
            return -1;
        }
        U.k kVar = (U.k) obj;
        for (int b02 = M1.m.b0(this); -1 < b02; b02--) {
            if (Z1.i.a(this.f7949d[b02], kVar)) {
                return b02;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new N1.a(this, 0, 7);
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
        return this.f7952g;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        return new C0909q(this, i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
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
        return new N1.a(this, i3, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return Z1.h.b(this, objArr);
    }
}
