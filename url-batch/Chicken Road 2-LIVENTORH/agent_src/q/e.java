package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3023f;

    public e(f fVar) {
        this.f3023f = fVar;
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
        this.f3023f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3023f.a(obj) >= 0;
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
        return this.f3023f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3023f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f3023f;
        int a2 = fVar.a(obj);
        if (a2 < 0) {
            return false;
        }
        fVar.g(a2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f3023f;
        int i = fVar.f3036h;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i) {
            if (collection.contains(fVar.i(i4))) {
                fVar.g(i4);
                i4--;
                i--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f3023f;
        int i = fVar.f3036h;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i) {
            if (!collection.contains(fVar.i(i4))) {
                fVar.g(i4);
                i4--;
                i--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3023f.f3036h;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f3023f;
        int i = fVar.f3036h;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.i(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f3023f;
        int i = fVar.f3036h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.i(i4);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
