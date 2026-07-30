package q0;

import d0.x2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements u, List, RandomAccess, s6.c {

    /* renamed from: f, reason: collision with root package name */
    public p f7440f;

    public q() {
        k0.i iVar = k0.i.f5316g;
        p pVar = new p(iVar);
        if (n.f7426a.j() != null) {
            p pVar2 = new p(iVar);
            pVar2.f7464a = 1;
            pVar.f7465b = pVar2;
        }
        this.f7440f = pVar;
    }

    @Override // q0.u
    public final w a() {
        return this.f7440f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        k0.c cVar;
        boolean z8;
        g k8;
        do {
            Object obj2 = r.f7441a;
            synchronized (obj2) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            k0.c m8 = cVar.m(obj);
            z8 = false;
            if (m8.equals(cVar)) {
                return false;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj2) {
                    int i8 = pVar4.f7438d;
                    if (i8 == i7) {
                        pVar4.f7437c = m8;
                        pVar4.f7439e++;
                        pVar4.f7438d = i8 + 1;
                        z8 = true;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return y(new x2(i7, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g k8;
        p pVar = this.f7440f;
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (n.f7427b) {
            k8 = n.k();
            p pVar2 = (p) n.w(pVar, this, k8);
            synchronized (r.f7441a) {
                pVar2.f7437c = k0.i.f5316g;
                pVar2.f7438d++;
                pVar2.f7439e++;
            }
        }
        n.n(k8, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return w().f7437c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return w().f7437c.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return w().f7437c.get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return w().f7437c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return w().f7437c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return w().f7437c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new f6.a(this, 0);
    }

    @Override // q0.u
    public final void m(w wVar) {
        wVar.f7465b = this.f7440f;
        this.f7440f = (p) wVar;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i8;
        k0.c cVar;
        g k8;
        boolean z8;
        Object obj = get(i7);
        do {
            Object obj2 = r.f7441a;
            synchronized (obj2) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i8 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            k0.c z9 = cVar.z(i7);
            if (z9.equals(cVar)) {
                break;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj2) {
                    int i9 = pVar4.f7438d;
                    if (i9 == i8) {
                        pVar4.f7437c = z9;
                        z8 = true;
                        pVar4.f7439e++;
                        pVar4.f7438d = i9 + 1;
                    } else {
                        z8 = false;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7;
        k0.c cVar;
        boolean z8;
        g k8;
        do {
            Object obj = r.f7441a;
            synchronized (obj) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            z8 = false;
            k0.c y4 = cVar.y(new k0.b(0, collection));
            if (r6.k.a(y4, cVar)) {
                return false;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj) {
                    int i8 = pVar4.f7438d;
                    if (i8 == i7) {
                        pVar4.f7437c = y4;
                        pVar4.f7439e++;
                        pVar4.f7438d = i8 + 1;
                        z8 = true;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return y(new k0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        int i8;
        k0.c cVar;
        g k8;
        boolean z8;
        Object obj2 = get(i7);
        do {
            Object obj3 = r.f7441a;
            synchronized (obj3) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i8 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            k0.c A = cVar.A(i7, obj);
            if (A.equals(cVar)) {
                break;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj3) {
                    int i9 = pVar4.f7438d;
                    if (i9 == i8) {
                        pVar4.f7437c = A;
                        pVar4.f7438d = i9 + 1;
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return w().f7437c.a();
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        if (i7 >= 0 && i7 <= i8 && i8 <= size()) {
            return new x(this, i7, i8);
        }
        g0.d.R("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r6.j.a(this);
    }

    public final String toString() {
        p pVar = this.f7440f;
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((p) n.i(pVar)).f7437c + ")@" + hashCode();
    }

    public final p w() {
        p pVar = this.f7440f;
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (p) n.t(pVar, this);
    }

    public final int x() {
        p pVar = this.f7440f;
        r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((p) n.i(pVar)).f7439e;
    }

    public final boolean y(q6.c cVar) {
        int i7;
        k0.c cVar2;
        Object f9;
        g k8;
        boolean z8;
        do {
            Object obj = r.f7441a;
            synchronized (obj) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f7438d;
                cVar2 = pVar2.f7437c;
            }
            r6.k.c(cVar2);
            k0.f x8 = cVar2.x();
            f9 = cVar.f(x8);
            k0.c m8 = x8.m();
            if (r6.k.a(m8, cVar2)) {
                break;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj) {
                    int i8 = pVar4.f7438d;
                    if (i8 == i7) {
                        pVar4.f7437c = m8;
                        pVar4.f7438d = i8 + 1;
                        z8 = true;
                        pVar4.f7439e++;
                    } else {
                        z8 = false;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return ((Boolean) f9).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        k0.c cVar;
        boolean z8;
        g k8;
        do {
            Object obj = r.f7441a;
            synchronized (obj) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            k0.c w4 = cVar.w(collection);
            z8 = false;
            if (r6.k.a(w4, cVar)) {
                return false;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj) {
                    int i8 = pVar4.f7438d;
                    if (i8 == i7) {
                        pVar4.f7437c = w4;
                        pVar4.f7439e++;
                        pVar4.f7438d = i8 + 1;
                        z8 = true;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new f6.a(this, i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r6.j.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        k0.c cVar;
        g k8;
        boolean z8;
        do {
            Object obj2 = r.f7441a;
            synchronized (obj2) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i8 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            k0.c g9 = cVar.g(i7, obj);
            if (g9.equals(cVar)) {
                return;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj2) {
                    int i9 = pVar4.f7438d;
                    if (i9 == i8) {
                        pVar4.f7437c = g9;
                        z8 = true;
                        pVar4.f7439e++;
                        pVar4.f7438d = i9 + 1;
                    } else {
                        z8 = false;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        k0.c cVar;
        boolean z8;
        g k8;
        do {
            Object obj2 = r.f7441a;
            synchronized (obj2) {
                p pVar = this.f7440f;
                r6.k.d(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f7438d;
                cVar = pVar2.f7437c;
            }
            r6.k.c(cVar);
            int indexOf = cVar.indexOf(obj);
            k0.c z9 = indexOf != -1 ? cVar.z(indexOf) : cVar;
            z8 = false;
            if (z9.equals(cVar)) {
                return false;
            }
            p pVar3 = this.f7440f;
            r6.k.d(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f7427b) {
                k8 = n.k();
                p pVar4 = (p) n.w(pVar3, this, k8);
                synchronized (obj2) {
                    int i8 = pVar4.f7438d;
                    if (i8 == i7) {
                        pVar4.f7437c = z9;
                        pVar4.f7439e++;
                        pVar4.f7438d = i8 + 1;
                        z8 = true;
                    }
                }
            }
            n.n(k8, this);
        } while (!z8);
        return true;
    }
}
