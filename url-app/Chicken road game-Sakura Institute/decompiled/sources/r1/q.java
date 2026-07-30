package r1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements List, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final int f7880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7881g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f7882h;

    public q(r rVar, int i7, int i8) {
        this.f7882h = rVar;
        this.f7880f = i7;
        this.f7881g = i8;
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    @Override // java.util.List
    public final Object get(int i7) {
        Object obj = this.f7882h.f7886f[i7 + this.f7880f];
        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (s0.n) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof s0.n)) {
            return -1;
        }
        s0.n nVar = (s0.n) obj;
        int i7 = this.f7880f;
        int i8 = this.f7881g;
        if (i7 <= i8) {
            int i9 = i7;
            while (!r6.k.a(this.f7882h.f7886f[i9], nVar)) {
                if (i9 != i8) {
                    i9++;
                }
            }
            return i9 - i7;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i7 = this.f7880f;
        return new f6.a(this.f7882h, i7, i7, this.f7881g);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof s0.n)) {
            return -1;
        }
        s0.n nVar = (s0.n) obj;
        int i7 = this.f7881g;
        int i8 = this.f7880f;
        if (i8 <= i7) {
            while (!r6.k.a(this.f7882h.f7886f[i7], nVar)) {
                if (i7 != i8) {
                    i7--;
                }
            }
            return i7 - i8;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i7 = this.f7880f;
        return new f6.a(this.f7882h, i7, i7, this.f7881g);
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
        return this.f7881g - this.f7880f;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        int i9 = this.f7880f;
        return new q(this.f7882h, i7 + i9, i9 + i8);
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
        int i8 = this.f7880f;
        int i9 = this.f7881g;
        return new f6.a(this.f7882h, i7 + i8, i8, i9);
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
