package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import q6.h;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements List, r6.b {

    /* renamed from: d, reason: collision with root package name */
    public final e f5572d;

    public b(e eVar) {
        this.f5572d = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f5572d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f5572d;
        return eVar.e(eVar.f5580f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5572d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5572d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f5572d;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f.a(i, this);
        return this.f5572d.f5578d[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f5572d.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5572d.f5580f == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f5572d;
        Object[] objArr = eVar.f5578d;
        for (int i = eVar.f5580f - 1; i >= 0; i--) {
            if (i.a(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5572d.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f5572d;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = eVar.f5580f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.j(it.next());
        }
        return i != eVar.f5580f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f5572d;
        int i = eVar.f5580f;
        for (int i8 = i - 1; -1 < i8; i8--) {
            if (!collection.contains(eVar.f5578d[i8])) {
                eVar.k(i8);
            }
        }
        return i != eVar.f5580f;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        f.a(i, this);
        Object[] objArr = this.f5572d.f5578d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5572d.f5580f;
    }

    @Override // java.util.List
    public final List subList(int i, int i8) {
        f.b(this, i, i8);
        return new c(this, i, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return h.a(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f5572d.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        f.a(i, this);
        return this.f5572d.k(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return h.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f5572d.e(i, collection);
    }
}
