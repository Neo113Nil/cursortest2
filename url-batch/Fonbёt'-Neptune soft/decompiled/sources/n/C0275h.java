package n;

import I.C0079n;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275h implements Collection {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0079n f3250e;

    public C0275h(C0079n c0079n) {
        this.f3250e = c0079n;
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
        ((C0268a) this.f3250e.f692h).clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C0268a) this.f3250e.f692h).f(obj) >= 0;
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
        return ((C0268a) this.f3250e.f692h).f3257g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0272e(this.f3250e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0079n c0079n = this.f3250e;
        int f2 = ((C0268a) c0079n.f692h).f(obj);
        if (f2 < 0) {
            return false;
        }
        c0079n.b(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0079n c0079n = this.f3250e;
        int i2 = ((C0268a) c0079n.f692h).f3257g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(c0079n.a(i3, 1))) {
                c0079n.b(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0079n c0079n = this.f3250e;
        int i2 = ((C0268a) c0079n.f692h).f3257g;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(c0079n.a(i3, 1))) {
                c0079n.b(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C0268a) this.f3250e.f692h).f3257g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0079n c0079n = this.f3250e;
        int i2 = ((C0268a) c0079n.f692h).f3257g;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0079n.a(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f3250e.k(1, objArr);
    }
}
