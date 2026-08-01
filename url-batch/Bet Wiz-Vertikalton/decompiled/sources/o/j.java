package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0276a f3228a;

    public j(C0276a c0276a) {
        this.f3228a = c0276a;
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
        this.f3228a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3228a.f(obj) >= 0;
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
        return this.f3228a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f3228a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0276a c0276a = this.f3228a;
        int f2 = c0276a.f(obj);
        if (f2 < 0) {
            return false;
        }
        c0276a.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0276a c0276a = this.f3228a;
        int d = c0276a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d) {
            if (collection.contains(c0276a.b(i, 1))) {
                c0276a.g(i);
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
        C0276a c0276a = this.f3228a;
        int d = c0276a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d) {
            if (!collection.contains(c0276a.b(i, 1))) {
                c0276a.g(i);
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
        return this.f3228a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0276a c0276a = this.f3228a;
        int d = c0276a.d();
        Object[] objArr = new Object[d];
        for (int i = 0; i < d; i++) {
            objArr[i] = c0276a.b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3228a.i(objArr, 1);
    }
}
