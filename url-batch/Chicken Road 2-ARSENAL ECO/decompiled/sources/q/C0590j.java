package q;

import Q.n;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590j implements Collection {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f5737f;

    public C0590j(n nVar) {
        this.f5737f = nVar;
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
        this.f5737f.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5737f.g(obj) >= 0;
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
        return this.f5737f.e() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0587g(this.f5737f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        n nVar = this.f5737f;
        int g7 = nVar.g(obj);
        if (g7 < 0) {
            return false;
        }
        nVar.i(g7);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        n nVar = this.f5737f;
        int e4 = nVar.e();
        int i7 = 0;
        boolean z5 = false;
        while (i7 < e4) {
            if (collection.contains(nVar.c(i7, 1))) {
                nVar.i(i7);
                i7--;
                e4--;
                z5 = true;
            }
            i7++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        n nVar = this.f5737f;
        int e4 = nVar.e();
        int i7 = 0;
        boolean z5 = false;
        while (i7 < e4) {
            if (!collection.contains(nVar.c(i7, 1))) {
                nVar.i(i7);
                i7--;
                e4--;
                z5 = true;
            }
            i7++;
        }
        return z5;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5737f.e();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f5737f.o(objArr, 1);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        n nVar = this.f5737f;
        int e4 = nVar.e();
        Object[] objArr = new Object[e4];
        for (int i7 = 0; i7 < e4; i7++) {
            objArr[i7] = nVar.c(i7, 1);
        }
        return objArr;
    }
}
