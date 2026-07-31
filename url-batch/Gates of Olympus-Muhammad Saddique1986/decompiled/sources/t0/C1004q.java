package t0;

import g2.InterfaceC0439a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004q implements List, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final int f8776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f8778f;

    public C1004q(r rVar, int i3, int i4) {
        this.f8778f = rVar;
        this.f8776d = i3;
        this.f8777e = i4;
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

    @Override // java.util.List
    public final Object get(int i3) {
        Object obj = this.f8778f.f8783d[i3 + this.f8776d];
        f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (U.p) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof U.p)) {
            return -1;
        }
        U.p pVar = (U.p) obj;
        int i3 = this.f8776d;
        int i4 = this.f8777e;
        if (i3 > i4) {
            return -1;
        }
        int i5 = i3;
        while (!f2.j.a(this.f8778f.f8783d[i5], pVar)) {
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
        int i3 = this.f8776d;
        return new S.x(this.f8778f, i3, i3, this.f8777e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof U.p)) {
            return -1;
        }
        U.p pVar = (U.p) obj;
        int i3 = this.f8777e;
        int i4 = this.f8776d;
        if (i4 > i3) {
            return -1;
        }
        while (!f2.j.a(this.f8778f.f8783d[i3], pVar)) {
            if (i3 == i4) {
                return -1;
            }
            i3--;
        }
        return i3 - i4;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i3 = this.f8776d;
        return new S.x(this.f8778f, i3, i3, this.f8777e);
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
        return this.f8777e - this.f8776d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        int i5 = this.f8776d;
        return new C1004q(this.f8778f, i3 + i5, i5 + i4);
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
        int i4 = this.f8776d;
        int i5 = this.f8777e;
        return new S.x(this.f8778f, i3 + i4, i4, i5);
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
