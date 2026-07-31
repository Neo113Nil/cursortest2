package S;

import I.C0143d;
import e2.InterfaceC0424c;
import g2.InterfaceC0441c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t implements y, List, RandomAccess, InterfaceC0441c {

    /* renamed from: d, reason: collision with root package name */
    public r f4257d;

    public t() {
        M.j jVar = M.j.f3446e;
        r rVar = new r(jVar);
        if (p.f4240a.g() != null) {
            r rVar2 = new r(jVar);
            rVar2.f4174a = 1;
            rVar.f4175b = rVar2;
        }
        this.f4257d = rVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj2 = u.f4258a;
            synchronized (obj2) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i3 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.c d3 = cVar.d(obj);
            z3 = false;
            if (d3.equals(cVar)) {
                return false;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj2) {
                    int i4 = rVar4.f4252d;
                    if (i4 == i3) {
                        rVar4.f4251c = d3;
                        rVar4.f4253e++;
                        rVar4.f4252d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return k(new s(i3, collection));
    }

    @Override // S.y
    public final A c() {
        return this.f4257d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i k3;
        r rVar = this.f4257d;
        f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (p.f4241b) {
            k3 = p.k();
            r rVar2 = (r) p.w(rVar, this, k3);
            synchronized (u.f4258a) {
                rVar2.f4251c = M.j.f3446e;
                rVar2.f4252d++;
                rVar2.f4253e++;
            }
        }
        p.n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return i().f4251c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return i().f4251c.containsAll(collection);
    }

    @Override // S.y
    public final void d(A a3) {
        a3.f4175b = this.f4257d;
        this.f4257d = (r) a3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return i().f4251c.get(i3);
    }

    public final r i() {
        r rVar = this.f4257d;
        f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (r) p.t(rVar, this);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return i().f4251c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return i().f4251c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final int j() {
        r rVar = this.f4257d;
        f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((r) p.i(rVar)).f4253e;
    }

    public final boolean k(InterfaceC0424c interfaceC0424c) {
        int i3;
        M.c cVar;
        Object n3;
        i k3;
        boolean z3;
        do {
            Object obj = u.f4258a;
            synchronized (obj) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i3 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.g j3 = cVar.j();
            n3 = interfaceC0424c.n(j3);
            M.c d3 = j3.d();
            if (f2.j.a(d3, cVar)) {
                break;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj) {
                    int i4 = rVar4.f4252d;
                    if (i4 == i3) {
                        rVar4.f4251c = d3;
                        rVar4.f4252d = i4 + 1;
                        z3 = true;
                        rVar4.f4253e++;
                    } else {
                        z3 = false;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return ((Boolean) n3).booleanValue();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return i().f4251c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new x(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        int i4;
        M.c cVar;
        i k3;
        boolean z3;
        Object obj = get(i3);
        do {
            Object obj2 = u.f4258a;
            synchronized (obj2) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i4 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.c l3 = cVar.l(i3);
            if (f2.j.a(l3, cVar)) {
                break;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj2) {
                    int i5 = rVar4.f4252d;
                    if (i5 == i4) {
                        rVar4.f4251c = l3;
                        z3 = true;
                        rVar4.f4253e++;
                        rVar4.f4252d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj = u.f4258a;
            synchronized (obj) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i3 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.c k4 = cVar.k(new M.b(0, collection));
            z3 = false;
            if (f2.j.a(k4, cVar)) {
                return false;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj) {
                    int i4 = rVar4.f4252d;
                    if (i4 == i3) {
                        rVar4.f4251c = k4;
                        rVar4.f4253e++;
                        rVar4.f4252d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return k(new M.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        int i4;
        M.c cVar;
        i k3;
        boolean z3;
        Object obj2 = get(i3);
        do {
            Object obj3 = u.f4258a;
            synchronized (obj3) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i4 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.c m3 = cVar.m(i3, obj);
            if (m3.equals(cVar)) {
                break;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj3) {
                    int i5 = rVar4.f4252d;
                    if (i5 == i4) {
                        rVar4.f4251c = m3;
                        rVar4.f4252d = i5 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return i().f4251c.b();
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        if (i3 >= 0 && i3 <= i4 && i4 <= size()) {
            return new C(this, i3, i4);
        }
        C0143d.S("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
    }

    public final String toString() {
        r rVar = this.f4257d;
        f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((r) p.i(rVar)).f4251c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj = u.f4258a;
            synchronized (obj) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i3 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.c i4 = cVar.i(collection);
            z3 = false;
            if (f2.j.a(i4, cVar)) {
                return false;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj) {
                    int i5 = rVar4.f4252d;
                    if (i5 == i3) {
                        rVar4.f4251c = i4;
                        rVar4.f4253e++;
                        rVar4.f4252d = i5 + 1;
                        z3 = true;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new x(this, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f2.i.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        M.c cVar;
        i k3;
        boolean z3;
        do {
            Object obj2 = u.f4258a;
            synchronized (obj2) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i4 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            M.c c2 = cVar.c(i3, obj);
            if (c2.equals(cVar)) {
                return;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj2) {
                    int i5 = rVar4.f4252d;
                    if (i5 == i4) {
                        rVar4.f4251c = c2;
                        z3 = true;
                        rVar4.f4253e++;
                        rVar4.f4252d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj2 = u.f4258a;
            synchronized (obj2) {
                r rVar = this.f4257d;
                f2.j.d(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                r rVar2 = (r) p.i(rVar);
                i3 = rVar2.f4252d;
                cVar = rVar2.f4251c;
            }
            f2.j.c(cVar);
            int indexOf = cVar.indexOf(obj);
            M.c l3 = indexOf != -1 ? cVar.l(indexOf) : cVar;
            z3 = false;
            if (f2.j.a(l3, cVar)) {
                return false;
            }
            r rVar3 = this.f4257d;
            f2.j.d(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (p.f4241b) {
                k3 = p.k();
                r rVar4 = (r) p.w(rVar3, this, k3);
                synchronized (obj2) {
                    int i4 = rVar4.f4252d;
                    if (i4 == i3) {
                        rVar4.f4251c = l3;
                        rVar4.f4253e++;
                        rVar4.f4252d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            p.n(k3, this);
        } while (!z3);
        return true;
    }
}
