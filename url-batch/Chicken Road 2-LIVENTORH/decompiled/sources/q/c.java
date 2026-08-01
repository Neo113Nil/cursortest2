package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements Set {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3019f;

    public c(f fVar) {
        this.f3019f = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f3019f.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3019f.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f3019f.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        f fVar = this.f3019f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (fVar.f3036h == set.size()) {
                return fVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        f fVar = this.f3019f;
        int i = 0;
        for (int i4 = fVar.f3036h - 1; i4 >= 0; i4--) {
            Object f2 = fVar.f(i4);
            i += f2 == null ? 0 : f2.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f3019f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3019f, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f3019f;
        int d = fVar.d(obj);
        if (d < 0) {
            return false;
        }
        fVar.g(d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f3019f.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f3019f;
        int i = fVar.f3036h;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            if (!collection.contains(fVar.f(i4))) {
                fVar.g(i4);
            }
        }
        return i != fVar.f3036h;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3019f.f3036h;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f3019f;
        int i = fVar.f3036h;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.f(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f3019f;
        int i = fVar.f3036h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.f(i4);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
