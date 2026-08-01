package a2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 implements Collection, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f59e;

    public b1() {
        int i3 = s.o0.f8351a;
        this.f59e = new s.e0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f58d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f58d) {
            case 0:
                ((s.e0) this.f59e).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).c(obj);
            default:
                return ((s.h0) this.f59e).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f58d) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((s.e0) this.f59e).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((s.h0) this.f59e).d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).g == 0;
            default:
                return ((s.h0) this.f59e).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f58d) {
            case 0:
                s.e0 e0Var = (s.e0) this.f59e;
                e0Var.getClass();
                return new de.e(new s.g0(e0Var));
            default:
                return de.h.a(new o0.g(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f58d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f58d) {
            case 0:
                return ((s.e0) this.f59e).g;
            default:
                return ((s.h0) this.f59e).f8316e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f58d) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return wd.i.b(this, objArr);
    }

    public b1(s.h0 h0Var) {
        h0Var.getClass();
        this.f59e = h0Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f58d) {
        }
        return wd.i.a(this);
    }
}
