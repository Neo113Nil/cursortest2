package o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0306a f3704a;

    public j(C0306a c0306a) {
        this.f3704a = c0306a;
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
        this.f3704a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3704a.f(obj) >= 0;
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
        return this.f3704a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f3704a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0306a c0306a = this.f3704a;
        int f2 = c0306a.f(obj);
        if (f2 < 0) {
            return false;
        }
        c0306a.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0306a c0306a = this.f3704a;
        int d2 = c0306a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d2) {
            if (collection.contains(c0306a.b(i, 1))) {
                c0306a.g(i);
                i--;
                d2--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0306a c0306a = this.f3704a;
        int d2 = c0306a.d();
        int i = 0;
        boolean z2 = false;
        while (i < d2) {
            if (!collection.contains(c0306a.b(i, 1))) {
                c0306a.g(i);
                i--;
                d2--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3704a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0306a c0306a = this.f3704a;
        int d2 = c0306a.d();
        Object[] objArr = new Object[d2];
        for (int i = 0; i < d2; i++) {
            objArr[i] = c0306a.b(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3704a.i(objArr, 1);
    }
}
