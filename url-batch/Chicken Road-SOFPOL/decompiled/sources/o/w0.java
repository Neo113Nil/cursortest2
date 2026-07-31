package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 implements Collection, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5561d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5562e;

    public w0() {
        int i = q0.f5524a;
        this.f5562e = new f0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f5562e).a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((f0) this.f5562e).b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5561d) {
            case 0:
                return ((j0) this.f5562e).d(obj);
            default:
                return ((f0) this.f5562e).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5561d) {
            case 0:
                q6.i.e(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((j0) this.f5562e).d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((f0) this.f5562e).c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5561d) {
            case 0:
                return ((j0) this.f5562e).i();
            default:
                return ((f0) this.f5562e).f5453g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5561d) {
            case 0:
                return r2.r.E(new g(this, null, 2));
            default:
                f0 f0Var = (f0) this.f5562e;
                f0Var.getClass();
                return new h0(new i0(f0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f5562e).g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f5562e).g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5561d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f5562e).i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f5561d) {
            case 0:
                return ((j0) this.f5562e).f5486e;
            default:
                return ((f0) this.f5562e).f5453g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f5561d) {
        }
        return q6.h.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5561d) {
            case 0:
                q6.i.e(objArr, "array");
                break;
        }
        return q6.h.b(this, objArr);
    }

    public w0(j0 j0Var) {
        q6.i.e(j0Var, "parent");
        this.f5562e = j0Var;
    }
}
