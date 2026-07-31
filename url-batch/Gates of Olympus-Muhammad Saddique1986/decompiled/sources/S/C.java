package S;

import I.C0143d;
import g2.InterfaceC0441c;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class C implements List, InterfaceC0441c {

    /* renamed from: d, reason: collision with root package name */
    public final t f4179d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4180e;

    /* renamed from: f, reason: collision with root package name */
    public int f4181f;

    /* renamed from: g, reason: collision with root package name */
    public int f4182g;

    public C(t tVar, int i3, int i4) {
        this.f4179d = tVar;
        this.f4180e = i3;
        this.f4181f = tVar.j();
        this.f4182g = i4 - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i3 = this.f4180e + this.f4182g;
        t tVar = this.f4179d;
        tVar.add(i3, obj);
        this.f4182g++;
        this.f4181f = tVar.j();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f4182g, collection);
    }

    public final void b() {
        if (this.f4179d.j() != this.f4181f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i3;
        M.c cVar;
        i k3;
        boolean z3;
        if (this.f4182g > 0) {
            b();
            t tVar = this.f4179d;
            int i4 = this.f4180e;
            int i5 = this.f4182g + i4;
            tVar.getClass();
            do {
                Object obj = u.f4258a;
                synchronized (obj) {
                    r rVar = tVar.f4257d;
                    f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    r rVar2 = (r) p.i(rVar);
                    i3 = rVar2.f4252d;
                    cVar = rVar2.f4251c;
                }
                f2.j.c(cVar);
                M.g j3 = cVar.j();
                j3.subList(i4, i5).clear();
                M.c d3 = j3.d();
                if (f2.j.a(d3, cVar)) {
                    break;
                }
                r rVar3 = tVar.f4257d;
                f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (p.f4241b) {
                    k3 = p.k();
                    r rVar4 = (r) p.w(rVar3, tVar, k3);
                    synchronized (obj) {
                        int i6 = rVar4.f4252d;
                        if (i6 == i3) {
                            rVar4.f4251c = d3;
                            rVar4.f4252d = i6 + 1;
                            z3 = true;
                            rVar4.f4253e++;
                        } else {
                            z3 = false;
                        }
                    }
                }
                p.n(k3, tVar);
            } while (!z3);
            this.f4182g = 0;
            this.f4181f = this.f4179d.j();
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
    public final Object get(int i3) {
        b();
        u.a(i3, this.f4182g);
        return this.f4179d.get(this.f4180e + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i3 = this.f4182g;
        int i4 = this.f4180e;
        Iterator it = O2.d.g0(i4, i3 + i4).iterator();
        while (it.hasNext()) {
            int a3 = ((S1.A) it).a();
            if (f2.j.a(obj, this.f4179d.get(a3))) {
                return a3 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4182g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i3 = this.f4182g;
        int i4 = this.f4180e;
        for (int i5 = (i3 + i4) - 1; i5 >= i4; i5--) {
            if (f2.j.a(obj, this.f4179d.get(i5))) {
                return i5 - i4;
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
        int i3;
        M.c cVar;
        i k3;
        boolean z3;
        b();
        t tVar = this.f4179d;
        int i4 = this.f4180e;
        int i5 = this.f4182g + i4;
        int size = tVar.size();
        do {
            Object obj = u.f4258a;
            synchronized (obj) {
                r rVar = tVar.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i3 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.g j3 = cVar.j();
            j3.subList(i4, i5).retainAll(collection);
            M.c d3 = j3.d();
            if (f2.j.a(d3, cVar)) {
                break;
            }
            r rVar3 = tVar.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, tVar, k3);
                synchronized (obj) {
                    int i6 = rVar4.f4252d;
                    if (i6 == i3) {
                        rVar4.f4251c = d3;
                        rVar4.f4252d = i6 + 1;
                        rVar4.f4253e++;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            p.n(k3, tVar);
        } while (!z3);
        int size2 = size - tVar.size();
        if (size2 > 0) {
            this.f4181f = this.f4179d.j();
            this.f4182g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        u.a(i3, this.f4182g);
        b();
        int i4 = i3 + this.f4180e;
        t tVar = this.f4179d;
        Object obj2 = tVar.set(i4, obj);
        this.f4181f = tVar.j();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4182g;
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        if (!(i3 >= 0 && i3 <= i4 && i4 <= this.f4182g)) {
            C0143d.S("fromIndex or toIndex are out of bounds");
            throw null;
        }
        b();
        int i5 = this.f4180e;
        return new C(this.f4179d, i3 + i5, i4 + i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        b();
        f2.s sVar = new f2.s();
        sVar.f5830d = i3 - 1;
        return new B(sVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f2.i.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        b();
        int i4 = i3 + this.f4180e;
        t tVar = this.f4179d;
        boolean addAll = tVar.addAll(i4, collection);
        if (addAll) {
            this.f4182g = collection.size() + this.f4182g;
            this.f4181f = tVar.j();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        b();
        int i4 = this.f4180e + i3;
        t tVar = this.f4179d;
        Object remove = tVar.remove(i4);
        this.f4182g--;
        this.f4181f = tVar.j();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        b();
        int i4 = this.f4180e + i3;
        t tVar = this.f4179d;
        tVar.add(i4, obj);
        this.f4182g++;
        this.f4181f = tVar.j();
    }
}
