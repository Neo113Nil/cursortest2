package q0;

import e6.b0;
import e6.e0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements List, s6.c {

    /* renamed from: f, reason: collision with root package name */
    public final q f7466f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7467g;

    /* renamed from: h, reason: collision with root package name */
    public int f7468h;

    /* renamed from: i, reason: collision with root package name */
    public int f7469i;

    public x(q qVar, int i7, int i8) {
        this.f7466f = qVar;
        this.f7467g = i7;
        this.f7468h = qVar.x();
        this.f7469i = i8 - i7;
    }

    public final void a() {
        if (this.f7466f.x() != this.f7468h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i7 = this.f7467g + this.f7469i;
        q qVar = this.f7466f;
        qVar.add(i7, obj);
        this.f7469i++;
        this.f7468h = qVar.x();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f7469i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7;
        k0.c cVar;
        g k8;
        boolean z8;
        if (this.f7469i > 0) {
            a();
            q qVar = this.f7466f;
            int i8 = this.f7467g;
            int i9 = this.f7469i + i8;
            do {
                Object obj = r.f7441a;
                synchronized (obj) {
                    p pVar = qVar.f7440f;
                    r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    p pVar2 = (p) n.i(pVar);
                    i7 = pVar2.f7438d;
                    cVar = pVar2.f7437c;
                }
                r6.k.c(cVar);
                k0.f x8 = cVar.x();
                x8.subList(i8, i9).clear();
                k0.c m8 = x8.m();
                if (r6.k.a(m8, cVar)) {
                    break;
                }
                p pVar3 = qVar.f7440f;
                r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (n.f7427b) {
                    k8 = n.k();
                    p pVar4 = (p) n.w(pVar3, qVar, k8);
                    synchronized (obj) {
                        int i10 = pVar4.f7438d;
                        if (i10 == i7) {
                            pVar4.f7437c = m8;
                            pVar4.f7438d = i10 + 1;
                            z8 = true;
                            pVar4.f7439e++;
                        } else {
                            z8 = false;
                        }
                    }
                }
                n.n(k8, qVar);
            } while (!z8);
            this.f7469i = 0;
            this.f7468h = this.f7466f.x();
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
    public final Object get(int i7) {
        a();
        r.a(i7, this.f7469i);
        return this.f7466f.get(this.f7467g + i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i7 = this.f7469i;
        int i8 = this.f7467g;
        Iterator it = v1.g.o(i8, i7 + i8).iterator();
        while (it.hasNext()) {
            int nextInt = ((b0) it).nextInt();
            if (r6.k.a(obj, this.f7466f.get(nextInt))) {
                return nextInt - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7469i == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i7 = this.f7469i;
        int i8 = this.f7467g;
        for (int i9 = (i7 + i8) - 1; i9 >= i8; i9--) {
            if (r6.k.a(obj, this.f7466f.get(i9))) {
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
            boolean z8 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7;
        k0.c cVar;
        g k8;
        boolean z8;
        a();
        q qVar = this.f7466f;
        int i8 = this.f7467g;
        int i9 = this.f7469i + i8;
        int size = qVar.size();
        do {
            Object obj = r.f7441a;
            synchronized (obj) {
                p pVar = qVar.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            k0.f x8 = cVar.x();
            x8.subList(i8, i9).retainAll(collection);
            k0.c m8 = x8.m();
            if (r6.k.a(m8, cVar)) {
                break;
            }
            p pVar3 = qVar.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, qVar, k8);
                synchronized (obj) {
                    int i10 = pVar4.f7438d;
                    if (i10 == i7) {
                        pVar4.f7437c = m8;
                        pVar4.f7438d = i10 + 1;
                        pVar4.f7439e++;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
            }
            n.n(k8, qVar);
        } while (!z8);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.f7468h = this.f7466f.x();
            this.f7469i -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        r.a(i7, this.f7469i);
        a();
        int i8 = i7 + this.f7467g;
        q qVar = this.f7466f;
        Object obj2 = qVar.set(i8, obj);
        this.f7468h = qVar.x();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7469i;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        if (!(i7 >= 0 && i7 <= i8 && i8 <= this.f7469i)) {
            g0.d.R("fromIndex or toIndex are out of bounds");
            throw null;
        }
        a();
        int i9 = this.f7467g;
        return new x(this.f7466f, i7 + i9, i8 + i9);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r6.j.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        a();
        r6.t tVar = new r6.t();
        tVar.f7966f = i7 - 1;
        return new e0(tVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r6.j.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        a();
        int i8 = i7 + this.f7467g;
        q qVar = this.f7466f;
        boolean addAll = qVar.addAll(i8, collection);
        if (addAll) {
            this.f7469i = collection.size() + this.f7469i;
            this.f7468h = qVar.x();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        a();
        int i8 = this.f7467g + i7;
        q qVar = this.f7466f;
        Object remove = qVar.remove(i8);
        this.f7469i--;
        this.f7468h = qVar.x();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        a();
        int i8 = this.f7467g + i7;
        q qVar = this.f7466f;
        qVar.add(i8, obj);
        this.f7469i++;
        this.f7468h = qVar.x();
    }
}
