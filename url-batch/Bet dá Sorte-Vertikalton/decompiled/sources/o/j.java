package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0257a f3355a;

    public j(C0257a c0257a) {
        this.f3355a = c0257a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f3355a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3355a.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3355a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f3355a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0257a c0257a = this.f3355a;
        int f2 = c0257a.f(obj);
        if (f2 < 0) {
            return false;
        }
        c0257a.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0257a c0257a = this.f3355a;
        int d = c0257a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d) {
            if (collection.contains(c0257a.b(i, 1))) {
                c0257a.g(i);
                i--;
                d--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0257a c0257a = this.f3355a;
        int d = c0257a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d) {
            if (!collection.contains(c0257a.b(i, 1))) {
                c0257a.g(i);
                i--;
                d--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3355a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0257a c0257a = this.f3355a;
        int d = c0257a.d();
        Object[] objArr = new Object[d];
        for (int i = 0; i < d; i++) {
            objArr[i] = c0257a.b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3355a.i(objArr, 1);
    }
}
