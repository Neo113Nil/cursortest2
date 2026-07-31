package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class Q extends AbstractC3213c {

    /* renamed from: b, reason: collision with root package name */
    private final List f41055b;

    public static final class a implements ListIterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final ListIterator f41056b;

        a(int i4) {
            int g4;
            List list = Q.this.f41055b;
            g4 = C3231v.g(Q.this, i4);
            this.f41056b = list.listIterator(g4);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f41056b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f41056b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f41056b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int f4;
            f4 = C3231v.f(Q.this, this.f41056b.previousIndex());
            return f4;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f41056b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int f4;
            f4 = C3231v.f(Q.this, this.f41056b.nextIndex());
            return f4;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Q(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f41055b = delegate;
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public Object get(int i4) {
        int e4;
        List list = this.f41055b;
        e4 = C3231v.e(this, i4);
        return list.get(e4);
    }

    @Override // kotlin.collections.AbstractC3211a
    public int getSize() {
        return this.f41055b.size();
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC3213c, java.util.List
    public ListIterator listIterator(int i4) {
        return new a(i4);
    }
}
