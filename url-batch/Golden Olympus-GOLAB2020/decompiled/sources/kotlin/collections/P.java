package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class P extends AbstractC3215e {

    /* renamed from: b, reason: collision with root package name */
    private final List f41052b;

    public static final class a implements ListIterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final ListIterator f41053b;

        a(int i4) {
            int g4;
            List list = P.this.f41052b;
            g4 = C3231v.g(P.this, i4);
            this.f41053b = list.listIterator(g4);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f41053b.add(obj);
            this.f41053b.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f41053b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f41053b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f41053b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int f4;
            f4 = C3231v.f(P.this, this.f41053b.previousIndex());
            return f4;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f41053b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int f4;
            f4 = C3231v.f(P.this, this.f41053b.nextIndex());
            return f4;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f41053b.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f41053b.set(obj);
        }
    }

    public P(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f41052b = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        int g4;
        List list = this.f41052b;
        g4 = C3231v.g(this, i4);
        list.add(g4, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f41052b.clear();
    }

    @Override // kotlin.collections.AbstractC3215e
    public int d() {
        return this.f41052b.size();
    }

    @Override // kotlin.collections.AbstractC3215e
    public Object e(int i4) {
        int e4;
        List list = this.f41052b;
        e4 = C3231v.e(this, i4);
        return list.remove(e4);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i4) {
        int e4;
        List list = this.f41052b;
        e4 = C3231v.e(this, i4);
        return list.get(e4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i4, Object obj) {
        int e4;
        List list = this.f41052b;
        e4 = C3231v.e(this, i4);
        return list.set(e4, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i4) {
        return new a(i4);
    }
}
