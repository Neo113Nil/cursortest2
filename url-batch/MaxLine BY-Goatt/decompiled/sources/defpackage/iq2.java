package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iq2 implements Collection, k71 {
    public final /* synthetic */ int m = 0;
    public final Object n;

    public iq2() {
        int i = vw1.a;
        this.n = new ln1(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.m) {
            case 0:
                ((ln1) this.n).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).c(obj);
            default:
                return ((tn1) this.n).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((ln1) obj).c(it.next())) {
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
                        if (!((tn1) obj).d(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).g == 0;
            default:
                return ((tn1) this.n).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.m) {
            case 0:
                ln1 ln1Var = (ln1) this.n;
                ln1Var.getClass();
                return new wu0(new nn1(ln1Var));
            default:
                return yi2.a(new bi0(3, null, this));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.m) {
            case 0:
                return ((ln1) this.n).g;
            default:
                return ((tn1) this.n).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.m) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return ll3.X(this, objArr);
    }

    public iq2(tn1 tn1Var) {
        tn1Var.getClass();
        this.n = tn1Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.m) {
        }
        return ll3.W(this);
    }
}
