package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Set {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3102f;

    public c(f fVar) {
        this.f3102f = fVar;
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
        this.f3102f.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3102f.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f3102f.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        f fVar = this.f3102f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (fVar.h == set.size()) {
                return fVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        f fVar = this.f3102f;
        int i = 0;
        for (int i4 = fVar.h - 1; i4 >= 0; i4--) {
            Object f5 = fVar.f(i4);
            i += f5 == null ? 0 : f5.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f3102f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3102f, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f3102f;
        int d = fVar.d(obj);
        if (d < 0) {
            return false;
        }
        fVar.g(d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f3102f.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f3102f;
        int i = fVar.h;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            if (!collection.contains(fVar.f(i4))) {
                fVar.g(i4);
            }
        }
        return i != fVar.h;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3102f.h;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f3102f;
        int i = fVar.h;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.f(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f3102f;
        int i = fVar.h;
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
