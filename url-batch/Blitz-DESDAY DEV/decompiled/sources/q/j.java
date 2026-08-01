package q;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0256a f3366a;

    public j(C0256a c0256a) {
        this.f3366a = c0256a;
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
        this.f3366a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3366a.f(obj) >= 0;
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
        return this.f3366a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f3366a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0256a c0256a = this.f3366a;
        int f2 = c0256a.f(obj);
        if (f2 < 0) {
            return false;
        }
        c0256a.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0256a c0256a = this.f3366a;
        int d = c0256a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d) {
            if (collection.contains(c0256a.b(i, 1))) {
                c0256a.g(i);
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
        C0256a c0256a = this.f3366a;
        int d = c0256a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d) {
            if (!collection.contains(c0256a.b(i, 1))) {
                c0256a.g(i);
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
        return this.f3366a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0256a c0256a = this.f3366a;
        int d = c0256a.d();
        Object[] objArr = new Object[d];
        for (int i = 0; i < d; i++) {
            objArr[i] = c0256a.b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3366a.i(objArr, 1);
    }
}
