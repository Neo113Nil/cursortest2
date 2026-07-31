package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m4.o;

/* loaded from: classes.dex */
public abstract class q<E> extends o<E> implements List<E>, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final t0<Object> f19194g = new b(j0.f19154j, 0);

    public static final class a<E> extends o.a<E> {
        public a() {
            this(4);
        }

        a(int i7) {
            super(i7);
        }

        @Override // m4.o.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e7) {
            super.d(e7);
            return this;
        }

        public a<E> g(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public q<E> h() {
            this.f19187c = true;
            return q.q(this.f19185a, this.f19186b);
        }
    }

    static class b<E> extends m4.a<E> {

        /* renamed from: h, reason: collision with root package name */
        private final q<E> f19195h;

        b(q<E> qVar, int i7) {
            super(qVar.size(), i7);
            this.f19195h = qVar;
        }

        @Override // m4.a
        protected E a(int i7) {
            return this.f19195h.get(i7);
        }
    }

    class c extends q<E> {

        /* renamed from: h, reason: collision with root package name */
        final transient int f19196h;

        /* renamed from: i, reason: collision with root package name */
        final transient int f19197i;

        c(int i7, int i8) {
            this.f19196h = i7;
            this.f19197i = i8;
        }

        @Override // m4.q, java.util.List
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public q<E> subList(int i7, int i8) {
            l4.j.m(i7, i8, this.f19197i);
            q qVar = q.this;
            int i9 = this.f19196h;
            return qVar.subList(i7 + i9, i8 + i9);
        }

        @Override // java.util.List
        public E get(int i7) {
            l4.j.g(i7, this.f19197i);
            return q.this.get(i7 + this.f19196h);
        }

        @Override // m4.q, m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // m4.o
        Object[] k() {
            return q.this.k();
        }

        @Override // m4.o
        int l() {
            return q.this.m() + this.f19196h + this.f19197i;
        }

        @Override // m4.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // m4.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }

        @Override // m4.o
        int m() {
            return q.this.m() + this.f19196h;
        }

        @Override // m4.o
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19197i;
        }
    }

    q() {
    }

    public static <E> q<E> B(E e7, E e8, E e9, E e10, E e11) {
        return s(e7, e8, e9, e10, e11);
    }

    static <E> q<E> p(Object[] objArr) {
        return q(objArr, objArr.length);
    }

    static <E> q<E> q(Object[] objArr, int i7) {
        return i7 == 0 ? x() : new j0(objArr, i7);
    }

    public static <E> a<E> r() {
        return new a<>();
    }

    private static <E> q<E> s(Object... objArr) {
        return p(g0.b(objArr));
    }

    public static <E> q<E> t(Collection<? extends E> collection) {
        if (!(collection instanceof o)) {
            return s(collection.toArray());
        }
        q<E> i7 = ((o) collection).i();
        return i7.n() ? p(i7.toArray()) : i7;
    }

    public static <E> q<E> u(E[] eArr) {
        return eArr.length == 0 ? x() : s((Object[]) eArr.clone());
    }

    public static <E> q<E> x() {
        return (q<E>) j0.f19154j;
    }

    public static <E> q<E> y(E e7) {
        return s(e7);
    }

    public static <E> q<E> z(E e7, E e8) {
        return s(e7, e8);
    }

    @Override // java.util.List
    /* renamed from: C */
    public q<E> subList(int i7, int i8) {
        l4.j.m(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? x() : D(i7, i8);
    }

    q<E> D(int i7, int i8) {
        return new c(i7, i8 - i7);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return w.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (((i7 * 31) + get(i8).hashCode()) ^ (-1)) ^ (-1);
        }
        return i7;
    }

    @Override // m4.o
    @Deprecated
    public final q<E> i() {
        return this;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Override // m4.o
    int j(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.f(this, obj);
    }

    @Override // m4.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public s0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public t0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public t0<E> listIterator(int i7) {
        l4.j.k(i7, size());
        return isEmpty() ? (t0<E>) f19194g : new b(this, i7);
    }
}
