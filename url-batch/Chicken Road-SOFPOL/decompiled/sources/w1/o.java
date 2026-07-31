package w1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o implements List, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f7734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7736f;

    public o(p pVar, int i, int i8) {
        this.f7736f = pVar;
        this.f7734d = i;
        this.f7735e = i8;
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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        Object e8 = this.f7736f.f7745d.e(i + this.f7734d);
        q6.i.c(e8, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (y0.l) e8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y0.l)) {
            return -1;
        }
        y0.l lVar = (y0.l) obj;
        int i = this.f7734d;
        int i8 = this.f7735e;
        if (i <= i8) {
            int i9 = i;
            while (!q6.i.a(this.f7736f.f7745d.e(i9), lVar)) {
                if (i9 != i8) {
                    i9++;
                }
            }
            return i9 - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f7734d;
        return new e6.a(this.f7736f, i, i, this.f7735e);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y0.l)) {
            return -1;
        }
        y0.l lVar = (y0.l) obj;
        int i = this.f7735e;
        int i8 = this.f7734d;
        if (i8 <= i) {
            while (!q6.i.a(this.f7736f.f7745d.e(i), lVar)) {
                if (i != i8) {
                    i--;
                }
            }
            return i - i8;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.f7734d;
        return new e6.a(this.f7736f, i, i, this.f7735e);
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
        return this.f7735e - this.f7734d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i8) {
        int i9 = this.f7734d;
        return new o(this.f7736f, i + i9, i9 + i8);
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
        int i8 = this.f7734d;
        int i9 = this.f7735e;
        return new e6.a(this.f7736f, i + i8, i8, i9);
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
