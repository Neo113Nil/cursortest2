package m4;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f19184f = new Object[0];

    static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f19185a;

        /* renamed from: b, reason: collision with root package name */
        int f19186b;

        /* renamed from: c, reason: collision with root package name */
        boolean f19187c;

        a(int i7) {
            h.b(i7, "initialCapacity");
            this.f19185a = new Object[i7];
            this.f19186b = 0;
        }

        private void e(int i7) {
            Object[] objArr = this.f19185a;
            if (objArr.length < i7) {
                this.f19185a = Arrays.copyOf(objArr, b.c(objArr.length, i7));
            } else if (!this.f19187c) {
                return;
            } else {
                this.f19185a = (Object[]) objArr.clone();
            }
            this.f19187c = false;
        }

        @Override // m4.o.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(this.f19186b + collection.size());
                if (collection instanceof o) {
                    this.f19186b = ((o) collection).j(this.f19185a, this.f19186b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e7) {
            l4.j.i(e7);
            e(this.f19186b + 1);
            Object[] objArr = this.f19185a;
            int i7 = this.f19186b;
            this.f19186b = i7 + 1;
            objArr[i7] = e7;
            return this;
        }
    }

    public static abstract class b<E> {
        b() {
        }

        static int c(int i7, int i8) {
            if (i8 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            if (i9 < 0) {
                return Integer.MAX_VALUE;
            }
            return i9;
        }

        public abstract b<E> a(E e7);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    o() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public q<E> i() {
        return isEmpty() ? q.x() : q.p(toArray());
    }

    int j(Object[] objArr, int i7) {
        s0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
        return i7;
    }

    Object[] k() {
        return null;
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    int m() {
        throw new UnsupportedOperationException();
    }

    abstract boolean n();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public abstract s0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f19184f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        l4.j.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] k7 = k();
            if (k7 != null) {
                return (T[]) i0.a(k7, m(), l(), tArr);
            }
            tArr = (T[]) g0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        j(tArr, 0);
        return tArr;
    }
}
