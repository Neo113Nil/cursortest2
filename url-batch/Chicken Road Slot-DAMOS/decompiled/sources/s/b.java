package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f8266d;

    public b(e eVar) {
        this.f8266d = eVar;
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
        this.f8266d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8266d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8266d.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f8266d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (eVar.f8369i == set.size()) {
                return eVar.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f8266d;
        int i3 = 0;
        for (int i10 = eVar.f8369i - 1; i10 >= 0; i10--) {
            Object e2 = eVar.e(i10);
            i3 += e2 == null ? 0 : e2.hashCode();
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8266d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f8266d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f8266d;
        int c10 = eVar.c(obj);
        if (c10 < 0) {
            return false;
        }
        eVar.f(c10);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f8266d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f8266d;
        int i3 = eVar.f8369i;
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            if (!collection.contains(eVar.e(i10))) {
                eVar.f(i10);
            }
        }
        return i3 != eVar.f8369i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8266d.f8369i;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f8266d;
        int i3 = eVar.f8369i;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = eVar.e(i10);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f8266d;
        int i3 = eVar.f8369i;
        Object[] objArr = new Object[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = eVar.e(i10);
        }
        return objArr;
    }
}
