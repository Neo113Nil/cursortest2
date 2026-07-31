package S;

import F.C0066t0;
import I.C0089d;
import a2.InterfaceC0186c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t implements x, List, RandomAccess, InterfaceC0186c {

    /* renamed from: d, reason: collision with root package name */
    public s f3248d;

    public t() {
        M.j jVar = M.j.f2755e;
        s sVar = new s(jVar);
        if (q.f3234a.g() != null) {
            s sVar2 = new s(jVar);
            sVar2.f3272a = 1;
            sVar.f3273b = sVar2;
        }
        this.f3248d = sVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj2 = u.f3249a;
            synchronized (obj2) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i3 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.c d3 = cVar.d(obj);
            z3 = false;
            if (d3.equals(cVar)) {
                return false;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj2) {
                    int i4 = sVar4.f3246d;
                    if (i4 == i3) {
                        sVar4.f3245c = d3;
                        sVar4.f3247e++;
                        sVar4.f3246d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            q.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return k(new C0066t0(i3, collection));
    }

    @Override // S.x
    public final z c() {
        return this.f3248d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i k3;
        s sVar = this.f3248d;
        Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (q.f3235b) {
            k3 = q.k();
            s sVar2 = (s) q.w(sVar, this, k3);
            synchronized (u.f3249a) {
                sVar2.f3245c = M.j.f2755e;
                sVar2.f3246d++;
                sVar2.f3247e++;
            }
        }
        q.n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return i().f3245c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return i().f3245c.containsAll(collection);
    }

    @Override // S.x
    public final void d(z zVar) {
        zVar.f3273b = this.f3248d;
        this.f3248d = (s) zVar;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return i().f3245c.get(i3);
    }

    public final s i() {
        s sVar = this.f3248d;
        Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (s) q.t(sVar, this);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return i().f3245c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return i().f3245c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final int j() {
        s sVar = this.f3248d;
        Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((s) q.i(sVar)).f3247e;
    }

    public final boolean k(Y1.c cVar) {
        int i3;
        M.c cVar2;
        Object j3;
        i k3;
        boolean z3;
        do {
            Object obj = u.f3249a;
            synchronized (obj) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i3 = sVar2.f3246d;
                cVar2 = sVar2.f3245c;
            }
            Z1.i.c(cVar2);
            M.g j4 = cVar2.j();
            j3 = cVar.j(j4);
            M.c d3 = j4.d();
            if (Z1.i.a(d3, cVar2)) {
                break;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj) {
                    int i4 = sVar4.f3246d;
                    if (i4 == i3) {
                        sVar4.f3245c = d3;
                        sVar4.f3246d = i4 + 1;
                        z3 = true;
                        sVar4.f3247e++;
                    } else {
                        z3 = false;
                    }
                }
            }
            q.n(k3, this);
        } while (!z3);
        return ((Boolean) j3).booleanValue();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return i().f3245c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new N1.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        int i4;
        M.c cVar;
        i k3;
        boolean z3;
        Object obj = get(i3);
        do {
            Object obj2 = u.f3249a;
            synchronized (obj2) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i4 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.c l3 = cVar.l(i3);
            if (Z1.i.a(l3, cVar)) {
                break;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj2) {
                    int i5 = sVar4.f3246d;
                    if (i5 == i4) {
                        sVar4.f3245c = l3;
                        z3 = true;
                        sVar4.f3247e++;
                        sVar4.f3246d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            q.n(k3, this);
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
            Object obj = u.f3249a;
            synchronized (obj) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i3 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.c k4 = cVar.k(new M.b(0, collection));
            z3 = false;
            if (Z1.i.a(k4, cVar)) {
                return false;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj) {
                    int i4 = sVar4.f3246d;
                    if (i4 == i3) {
                        sVar4.f3245c = k4;
                        sVar4.f3247e++;
                        sVar4.f3246d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            q.n(k3, this);
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
            Object obj3 = u.f3249a;
            synchronized (obj3) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i4 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.c m3 = cVar.m(i3, obj);
            if (m3.equals(cVar)) {
                break;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj3) {
                    int i5 = sVar4.f3246d;
                    if (i5 == i4) {
                        sVar4.f3245c = m3;
                        sVar4.f3246d = i5 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            q.n(k3, this);
        } while (!z3);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return i().f3245c.b();
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        if (i3 >= 0 && i3 <= i4 && i4 <= size()) {
            return new A(this, i3, i4);
        }
        C0089d.R("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
    }

    public final String toString() {
        s sVar = this.f3248d;
        Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((s) q.i(sVar)).f3245c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj = u.f3249a;
            synchronized (obj) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i3 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.c i4 = cVar.i(collection);
            z3 = false;
            if (Z1.i.a(i4, cVar)) {
                return false;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj) {
                    int i5 = sVar4.f3246d;
                    if (i5 == i3) {
                        sVar4.f3245c = i4;
                        sVar4.f3247e++;
                        sVar4.f3246d = i5 + 1;
                        z3 = true;
                    }
                }
            }
            q.n(k3, this);
        } while (!z3);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new N1.a(this, i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return Z1.h.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        M.c cVar;
        i k3;
        boolean z3;
        do {
            Object obj2 = u.f3249a;
            synchronized (obj2) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i4 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.c c3 = cVar.c(i3, obj);
            if (c3.equals(cVar)) {
                return;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj2) {
                    int i5 = sVar4.f3246d;
                    if (i5 == i4) {
                        sVar4.f3245c = c3;
                        z3 = true;
                        sVar4.f3247e++;
                        sVar4.f3246d = i5 + 1;
                    } else {
                        z3 = false;
                    }
                }
            }
            q.n(k3, this);
        } while (!z3);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i3;
        M.c cVar;
        boolean z3;
        i k3;
        do {
            Object obj2 = u.f3249a;
            synchronized (obj2) {
                s sVar = this.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i3 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            int indexOf = cVar.indexOf(obj);
            M.c l3 = indexOf != -1 ? cVar.l(indexOf) : cVar;
            z3 = false;
            if (Z1.i.a(l3, cVar)) {
                return false;
            }
            s sVar3 = this.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, this, k3);
                synchronized (obj2) {
                    int i4 = sVar4.f3246d;
                    if (i4 == i3) {
                        sVar4.f3245c = l3;
                        sVar4.f3247e++;
                        sVar4.f3246d = i4 + 1;
                        z3 = true;
                    }
                }
            }
            q.n(k3, this);
        } while (!z3);
        return true;
    }
}
