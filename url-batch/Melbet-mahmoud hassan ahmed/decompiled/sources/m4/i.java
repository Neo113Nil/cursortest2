package m4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {

    static class a<E> extends AbstractCollection<E> {

        /* renamed from: f, reason: collision with root package name */
        final Collection<E> f19151f;

        /* renamed from: g, reason: collision with root package name */
        final l4.k<? super E> f19152g;

        a(Collection<E> collection, l4.k<? super E> kVar) {
            this.f19151f = collection;
            this.f19152g = kVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e7) {
            l4.j.d(this.f19152g.apply(e7));
            return this.f19151f.add(e7);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                l4.j.d(this.f19152g.apply(it.next()));
            }
            return this.f19151f.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            t.f(this.f19151f, this.f19152g);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (i.c(this.f19151f, obj)) {
                return this.f19152g.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return i.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !t.a(this.f19151f, this.f19152g);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return u.g(this.f19151f.iterator(), this.f19152g);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f19151f.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f19151f.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f19152g.apply(next) && collection.contains(next)) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f19151f.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f19152g.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f19151f.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (this.f19152g.apply(it.next())) {
                    i7++;
                }
            }
            return i7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return w.i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) w.i(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i7) {
        h.b(i7, "size");
        return new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
    }

    static boolean c(Collection<?> collection, Object obj) {
        l4.j.i(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
