package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f14641a;

    public b(e eVar) {
        this.f14641a = eVar;
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
        this.f14641a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14641a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f14641a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f14641a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (eVar.f14667c == set.size()) {
                return eVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f14641a;
        int i4 = 0;
        for (int i5 = eVar.f14667c - 1; i5 >= 0; i5--) {
            Object f4 = eVar.f(i5);
            i4 += f4 == null ? 0 : f4.hashCode();
        }
        return i4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f14641a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1342a(this.f14641a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f14641a;
        int d4 = eVar.d(obj);
        if (d4 < 0) {
            return false;
        }
        eVar.g(d4);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f14641a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f14641a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f14641a.f14667c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f14641a;
        int i4 = eVar.f14667c;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.f(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f14641a;
        int i4 = eVar.f14667c;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.f(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
