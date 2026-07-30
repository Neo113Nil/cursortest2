package e;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.e f117b;

    public f(c0.e eVar) {
        this.f117b = eVar;
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
        ((a) this.f117b.f73d).clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((a) this.f117b.f73d).g(obj) >= 0;
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
        return ((a) this.f117b.f73d).f102d == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f117b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        c0.e eVar = this.f117b;
        int g2 = ((a) eVar.f73d).g(obj);
        if (g2 < 0) {
            return false;
        }
        eVar.c(g2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        c0.e eVar = this.f117b;
        int i2 = ((a) eVar.f73d).f102d;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(eVar.b(i3, 1))) {
                eVar.c(i3);
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
        c0.e eVar = this.f117b;
        int i2 = ((a) eVar.f73d).f102d;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(eVar.b(i3, 1))) {
                eVar.c(i3);
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
        return ((a) this.f117b.f73d).f102d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        c0.e eVar = this.f117b;
        int i2 = ((a) eVar.f73d).f102d;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = eVar.b(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f117b.g(objArr, 1);
    }
}
