package i0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import r6.j;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements List, s6.c {

    /* renamed from: f, reason: collision with root package name */
    public final d f4834f;

    public a(d dVar) {
        this.f4834f = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f4834f.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f4834f;
        return dVar.f(dVar.f4842h, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f4834f.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4834f.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f4834f;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.a.h(i7, this);
        return this.f4834f.f4840f[i7];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f4834f.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4834f.l();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f4834f;
        int i7 = dVar.f4842h;
        if (i7 <= 0) {
            return -1;
        }
        int i8 = i7 - 1;
        Object[] objArr = dVar.f4840f;
        while (!k.a(obj, objArr[i8])) {
            i8--;
            if (i8 < 0) {
                return -1;
            }
        }
        return i8;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4834f.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f4834f;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i7 = dVar.f4842h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.n(it.next());
        }
        return i7 != dVar.f4842h;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f4834f;
        int i7 = dVar.f4842h;
        for (int i8 = i7 - 1; -1 < i8; i8--) {
            if (!collection.contains(dVar.f4840f[i8])) {
                dVar.o(i8);
            }
        }
        return i7 != dVar.f4842h;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        a.a.h(i7, this);
        Object[] objArr = this.f4834f.f4840f;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4834f.f4842h;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        a.a.i(this, i7, i8);
        return new b(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f4834f.a(i7, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new c(i7, this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        a.a.h(i7, this);
        return this.f4834f.o(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return this.f4834f.f(i7, collection);
    }
}
