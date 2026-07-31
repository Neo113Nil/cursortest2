package m4;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends m4.b<T> {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Iterator f19210h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l4.k f19211i;

        a(Iterator it, l4.k kVar) {
            this.f19210h = it;
            this.f19211i = kVar;
        }

        @Override // m4.b
        protected T a() {
            while (this.f19210h.hasNext()) {
                T t6 = (T) this.f19210h.next();
                if (this.f19211i.apply(t6)) {
                    return t6;
                }
            }
            return b();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends s0<T> {

        /* renamed from: f, reason: collision with root package name */
        boolean f19212f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f19213g;

        b(Object obj) {
            this.f19213g = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f19212f;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f19212f) {
                throw new NoSuchElementException();
            }
            this.f19212f = true;
            return (T) this.f19213g;
        }
    }

    private enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            h.c(false);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        l4.j.i(collection);
        l4.j.i(it);
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= collection.add(it.next());
        }
        return z6;
    }

    public static <T> boolean b(Iterator<T> it, l4.k<? super T> kVar) {
        return l(it, kVar) != -1;
    }

    static void c(Iterator<?> it) {
        l4.j.i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !l4.i.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> s0<T> g(Iterator<T> it, l4.k<? super T> kVar) {
        l4.j.i(it);
        l4.j.i(kVar);
        return new a(it, kVar);
    }

    public static <T> T h(Iterator<T> it, l4.k<? super T> kVar) {
        l4.j.i(it);
        l4.j.i(kVar);
        while (it.hasNext()) {
            T next = it.next();
            if (kVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T i(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T j(Iterator<? extends T> it, T t6) {
        return it.hasNext() ? (T) i(it) : t6;
    }

    public static <T> T k(Iterator<? extends T> it, T t6) {
        return it.hasNext() ? it.next() : t6;
    }

    public static <T> int l(Iterator<T> it, l4.k<? super T> kVar) {
        l4.j.j(kVar, "predicate");
        int i7 = 0;
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    static <T> T m(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    public static boolean n(Iterator<?> it, Collection<?> collection) {
        l4.j.i(collection);
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    public static <T> boolean o(Iterator<T> it, l4.k<? super T> kVar) {
        l4.j.i(kVar);
        boolean z6 = false;
        while (it.hasNext()) {
            if (kVar.apply(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    public static <T> s0<T> p(T t6) {
        return new b(t6);
    }
}
