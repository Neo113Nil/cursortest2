package r0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076q implements List, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f9832d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9833e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f9834i;

    public C1076q(r rVar, int i2, int i4) {
        this.f9834i = rVar;
        this.f9832d = i2;
        this.f9833e = i4;
    }

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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    @Override // java.util.List
    public final Object get(int i2) {
        Object obj = this.f9834i.f9835d[i2 + this.f9832d];
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (S.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof S.n)) {
            return -1;
        }
        S.n nVar = (S.n) obj;
        int i2 = this.f9832d;
        int i4 = this.f9833e;
        if (i2 > i4) {
            return -1;
        }
        int i5 = i2;
        while (!Intrinsics.a(this.f9834i.f9835d[i5], nVar)) {
            if (i5 == i4) {
                return -1;
            }
            i5++;
        }
        return i5 - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f9832d;
        return new A2.b(this.f9834i, i2, i2, this.f9833e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof S.n)) {
            return -1;
        }
        S.n nVar = (S.n) obj;
        int i2 = this.f9833e;
        int i4 = this.f9832d;
        if (i4 > i2) {
            return -1;
        }
        while (!Intrinsics.a(this.f9834i.f9835d[i2], nVar)) {
            if (i2 == i4) {
                return -1;
            }
            i2--;
        }
        return i2 - i4;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i2 = this.f9832d;
        return new A2.b(this.f9834i, i2, i2, this.f9833e);
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

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f9833e - this.f9832d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i2, int i4) {
        int i5 = this.f9832d;
        return new C1076q(this.f9834i, i2 + i5, i5 + i4);
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
        int i4 = this.f9832d;
        int i5 = this.f9833e;
        return new A2.b(this.f9834i, i2 + i4, i4, i5);
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
