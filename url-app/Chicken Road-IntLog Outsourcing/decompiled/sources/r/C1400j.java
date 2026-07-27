package r;

import X.m;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: r.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f11706a;

    public C1400j(m mVar) {
        this.f11706a = mVar;
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
        this.f11706a.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11706a.g(obj) >= 0;
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
        return this.f11706a.e() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1397g(this.f11706a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        m mVar = this.f11706a;
        int g6 = mVar.g(obj);
        if (g6 < 0) {
            return false;
        }
        mVar.i(g6);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        m mVar = this.f11706a;
        int e3 = mVar.e();
        int i2 = 0;
        boolean z = false;
        while (i2 < e3) {
            if (collection.contains(mVar.c(i2, 1))) {
                mVar.i(i2);
                i2--;
                e3--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        m mVar = this.f11706a;
        int e3 = mVar.e();
        int i2 = 0;
        boolean z = false;
        while (i2 < e3) {
            if (!collection.contains(mVar.c(i2, 1))) {
                mVar.i(i2);
                i2--;
                e3--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f11706a.e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        m mVar = this.f11706a;
        int e3 = mVar.e();
        Object[] objArr = new Object[e3];
        for (int i2 = 0; i2 < e3; i2++) {
            objArr[i2] = mVar.c(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f11706a.o(1, objArr);
    }
}
