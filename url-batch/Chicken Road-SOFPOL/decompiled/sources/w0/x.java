package w0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m0.p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x implements List, r6.b {

    /* renamed from: d, reason: collision with root package name */
    public final p f7574d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7575e;

    /* renamed from: f, reason: collision with root package name */
    public int f7576f;

    /* renamed from: g, reason: collision with root package name */
    public int f7577g;

    public x(p pVar, int i, int i8) {
        this.f7574d = pVar;
        this.f7575e = i;
        this.f7576f = q.g(pVar);
        this.f7577g = i8 - i;
    }

    public final void a() {
        if (q.g(this.f7574d) != this.f7576f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f7575e + this.f7577g;
        p pVar = this.f7574d;
        pVar.add(i, obj);
        this.f7577g++;
        this.f7576f = q.g(pVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f7577g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f7577g > 0) {
            a();
            int i = this.f7577g;
            int i8 = this.f7575e;
            p pVar = this.f7574d;
            pVar.e(i8, i + i8);
            this.f7577g = 0;
            this.f7576f = q.g(pVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        q.a(i, this.f7577g);
        return this.f7574d.get(this.f7575e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.f7577g;
        int i8 = this.f7575e;
        Iterator it = r2.o.u0(i8, i + i8).iterator();
        while (it.hasNext()) {
            int nextInt = ((d6.x) it).nextInt();
            if (q6.i.a(obj, this.f7574d.get(nextInt))) {
                return nextInt - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7577g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.f7577g;
        int i8 = this.f7575e;
        for (int i9 = (i + i8) - 1; i9 >= i8; i9--) {
            if (q6.i.a(obj, this.f7574d.get(i9))) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        q0.c cVar;
        f k3;
        boolean b8;
        a();
        p pVar = this.f7574d;
        int i8 = this.f7575e;
        int i9 = this.f7577g + i8;
        int size = pVar.size();
        do {
            synchronized (q.f7547a) {
                t tVar = pVar.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.g f6 = cVar.f();
            f6.subList(i8, i9).retainAll(collection);
            q0.c c8 = f6.c();
            if (q6.i.a(c8, cVar)) {
                break;
            }
            t tVar3 = pVar.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, pVar, k3), i, c8, true);
            }
            m.n(k3, pVar);
        } while (!b8);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.f7576f = q.g(this.f7574d);
            this.f7577g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        q.a(i, this.f7577g);
        a();
        int i8 = i + this.f7575e;
        p pVar = this.f7574d;
        Object obj2 = pVar.set(i8, obj);
        this.f7576f = q.g(pVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7577g;
    }

    @Override // java.util.List
    public final List subList(int i, int i8) {
        if (!(i >= 0 && i <= i8 && i8 <= this.f7577g)) {
            p1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i9 = this.f7575e;
        return new x(this.f7574d, i + i9, i8 + i9);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q6.h.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        q6.q qVar = new q6.q();
        qVar.f6203d = i - 1;
        return new d6.z(qVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return q6.h.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i8 = i + this.f7575e;
        p pVar = this.f7574d;
        boolean addAll = pVar.addAll(i8, collection);
        if (addAll) {
            this.f7577g = collection.size() + this.f7577g;
            this.f7576f = q.g(pVar);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i8 = this.f7575e + i;
        p pVar = this.f7574d;
        Object remove = pVar.remove(i8);
        this.f7577g--;
        this.f7576f = q.g(pVar);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i8 = this.f7575e + i;
        p pVar = this.f7574d;
        pVar.add(i8, obj);
        this.f7577g++;
        this.f7576f = q.g(pVar);
    }
}
