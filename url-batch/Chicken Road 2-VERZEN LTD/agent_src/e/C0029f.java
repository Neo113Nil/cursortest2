package e;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029f implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.e f485b;

    public C0029f(B.e eVar) {
        this.f485b = eVar;
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
        ((C0024a) this.f485b.f10d).clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C0024a) this.f485b.f10d).g(obj) >= 0;
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
        return ((C0024a) this.f485b.f10d).f470d == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0026c(this.f485b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        B.e eVar = this.f485b;
        int g2 = ((C0024a) eVar.f10d).g(obj);
        if (g2 < 0) {
            return false;
        }
        eVar.c(g2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        B.e eVar = this.f485b;
        int i2 = ((C0024a) eVar.f10d).f470d;
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
        B.e eVar = this.f485b;
        int i2 = ((C0024a) eVar.f10d).f470d;
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
        return ((C0024a) this.f485b.f10d).f470d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        B.e eVar = this.f485b;
        int i2 = ((C0024a) eVar.f10d).f470d;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = eVar.b(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f485b.i(objArr, 1);
    }
}
