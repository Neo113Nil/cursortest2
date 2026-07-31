package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f5417d;

    public b(e eVar) {
        this.f5417d = eVar;
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
        this.f5417d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5417d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f5417d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f5417d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (eVar.f5542f == set.size()) {
                return eVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f5417d;
        int i = 0;
        for (int i8 = eVar.f5542f - 1; i8 >= 0; i8--) {
            Object f6 = eVar.f(i8);
            i += f6 == null ? 0 : f6.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5417d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f5417d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f5417d;
        int d8 = eVar.d(obj);
        if (d8 < 0) {
            return false;
        }
        eVar.g(d8);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f5417d.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f5417d;
        int i = eVar.f5542f;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            if (!collection.contains(eVar.f(i8))) {
                eVar.g(i8);
            }
        }
        return i != eVar.f5542f;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5417d.f5542f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f5417d;
        int i = eVar.f5542f;
        Object[] objArr = new Object[i];
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.f(i8);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f5417d;
        int i = eVar.f5542f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.f(i8);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
