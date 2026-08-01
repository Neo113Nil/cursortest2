package e;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027f implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.e f541b;

    public C0027f(A.e eVar) {
        this.f541b = eVar;
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
        ((C0022a) this.f541b.f10e).clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C0022a) this.f541b.f10e).g(obj) >= 0;
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
        return ((C0022a) this.f541b.f10e).f526d == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0024c(this.f541b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        A.e eVar = this.f541b;
        int g2 = ((C0022a) eVar.f10e).g(obj);
        if (g2 < 0) {
            return false;
        }
        eVar.e(g2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        A.e eVar = this.f541b;
        int i2 = ((C0022a) eVar.f10e).f526d;
        int i3 = 0;
        boolean z = false;
        while (i3 < i2) {
            if (collection.contains(eVar.d(i3, 1))) {
                eVar.e(i3);
                i3--;
                i2--;
                z = true;
            }
            i3++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        A.e eVar = this.f541b;
        int i2 = ((C0022a) eVar.f10e).f526d;
        int i3 = 0;
        boolean z = false;
        while (i3 < i2) {
            if (!collection.contains(eVar.d(i3, 1))) {
                eVar.e(i3);
                i3--;
                i2--;
                z = true;
            }
            i3++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C0022a) this.f541b.f10e).f526d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        A.e eVar = this.f541b;
        int i2 = ((C0022a) eVar.f10e).f526d;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = eVar.d(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f541b.m(objArr, 1);
    }
}
