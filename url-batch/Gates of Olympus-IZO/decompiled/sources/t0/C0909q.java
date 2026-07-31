package t0;

import a2.InterfaceC0184a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909q implements List, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final int f7946d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f7948f;

    public C0909q(r rVar, int i3, int i4) {
        this.f7948f = rVar;
        this.f7946d = i3;
        this.f7947e = i4;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    @Override // java.util.List
    public final Object get(int i3) {
        Object obj = this.f7948f.f7949d[i3 + this.f7946d];
        Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (U.k) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof U.k)) {
            return -1;
        }
        U.k kVar = (U.k) obj;
        int i3 = this.f7946d;
        int i4 = this.f7947e;
        if (i3 > i4) {
            return -1;
        }
        int i5 = i3;
        while (!Z1.i.a(this.f7948f.f7949d[i5], kVar)) {
            if (i5 == i4) {
                return -1;
            }
            i5++;
        }
        return i5 - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i3 = this.f7946d;
        return new N1.a(this.f7948f, i3, i3, this.f7947e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof U.k)) {
            return -1;
        }
        U.k kVar = (U.k) obj;
        int i3 = this.f7947e;
        int i4 = this.f7946d;
        if (i4 > i3) {
            return -1;
        }
        while (!Z1.i.a(this.f7948f.f7949d[i3], kVar)) {
            if (i3 == i4) {
                return -1;
            }
            i3--;
        }
        return i3 - i4;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i3 = this.f7946d;
        return new N1.a(this.f7948f, i3, i3, this.f7947e);
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
        return this.f7947e - this.f7946d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        int i5 = this.f7946d;
        return new C0909q(this.f7948f, i3 + i5, i5 + i4);
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
        int i4 = this.f7946d;
        int i5 = this.f7947e;
        return new N1.a(this.f7948f, i3 + i4, i4, i5);
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
