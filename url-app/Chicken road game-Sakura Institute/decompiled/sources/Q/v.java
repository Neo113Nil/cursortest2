package Q;

import G.C0192d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements D, List, RandomAccess, N2.c {

    /* renamed from: d, reason: collision with root package name */
    public t f3896d;

    public v() {
        K.i iVar = K.i.f3442i;
        t tVar = new t(iVar);
        if (q.f3877a.j() != null) {
            t tVar2 = new t(iVar);
            tVar2.f3809a = 1;
            tVar.f3810b = tVar2;
        }
        this.f3896d = tVar;
    }

    public final int B() {
        t tVar = this.f3896d;
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((t) q.i(tVar)).f3892e;
    }

    public final boolean C(Function1 function1) {
        int i2;
        J.c cVar;
        Object invoke;
        AbstractC0274j k4;
        boolean z4;
        do {
            Object obj = w.f3897a;
            synchronized (obj) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i2 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            K.f a4 = cVar.a();
            invoke = function1.invoke(a4);
            J.c s4 = a4.s();
            if (Intrinsics.a(s4, cVar)) {
                break;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj) {
                    int i4 = tVar4.f3891d;
                    if (i4 == i2) {
                        tVar4.f3890c = s4;
                        tVar4.f3891d = i4 + 1;
                        tVar4.f3892e++;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2;
        J.c cVar;
        boolean z4;
        AbstractC0274j k4;
        do {
            Object obj2 = w.f3897a;
            synchronized (obj2) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i2 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            J.c add = cVar.add(obj);
            z4 = false;
            if (add.equals(cVar)) {
                return false;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj2) {
                    int i4 = tVar4.f3891d;
                    if (i4 == i2) {
                        tVar4.f3890c = add;
                        tVar4.f3892e++;
                        tVar4.f3891d = i4 + 1;
                        z4 = true;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        return C(new u(i2, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0274j k4;
        t tVar = this.f3896d;
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (q.f3878b) {
            k4 = q.k();
            t tVar2 = (t) q.w(tVar, this, k4);
            synchronized (w.f3897a) {
                tVar2.f3890c = K.i.f3442i;
                tVar2.f3891d++;
                tVar2.f3892e++;
            }
        }
        q.n(k4, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((K.c) w().f3890c).contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((K.c) w().f3890c).containsAll(collection);
    }

    @Override // Q.D
    public final void e(F f4) {
        f4.f3810b = this.f3896d;
        this.f3896d = (t) f4;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return w().f3890c.get(i2);
    }

    @Override // Q.D
    public final F h() {
        return this.f3896d;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return w().f3890c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return w().f3890c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return w().f3890c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new A2.b(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i4;
        J.c cVar;
        AbstractC0274j k4;
        boolean z4;
        Object obj = get(i2);
        do {
            Object obj2 = w.f3897a;
            synchronized (obj2) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i4 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            J.c l4 = cVar.l(i2);
            if (Intrinsics.a(l4, cVar)) {
                break;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj2) {
                    int i5 = tVar4.f3891d;
                    if (i5 == i4) {
                        tVar4.f3890c = l4;
                        tVar4.f3892e++;
                        tVar4.f3891d = i5 + 1;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2;
        J.c cVar;
        AbstractC0274j k4;
        boolean z4;
        do {
            Object obj = w.f3897a;
            synchronized (obj) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i2 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            J.c o4 = ((K.c) cVar).o(new K.b(0, collection));
            if (Intrinsics.a(o4, cVar)) {
                return false;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj) {
                    int i4 = tVar4.f3891d;
                    if (i4 == i2) {
                        tVar4.f3890c = o4;
                        tVar4.f3892e++;
                        tVar4.f3891d = i4 + 1;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return C(new K.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        int i4;
        J.c cVar;
        AbstractC0274j k4;
        boolean z4;
        Object obj2 = get(i2);
        do {
            Object obj3 = w.f3897a;
            synchronized (obj3) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i4 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            J.c cVar2 = cVar.set(i2, obj);
            if (cVar2.equals(cVar)) {
                break;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj3) {
                    int i5 = tVar4.f3891d;
                    if (i5 == i4) {
                        tVar4.f3890c = cVar2;
                        tVar4.f3891d = i5 + 1;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return w().f3890c.size();
    }

    @Override // java.util.List
    public final List subList(int i2, int i4) {
        if (i2 >= 0 && i2 <= i4 && i4 <= size()) {
            return new H(this, i2, i4);
        }
        C0192d.S("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    public final String toString() {
        t tVar = this.f3896d;
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((t) q.i(tVar)).f3890c + ")@" + hashCode();
    }

    public final t w() {
        t tVar = this.f3896d;
        Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (t) q.t(tVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i2;
        J.c cVar;
        boolean z4;
        AbstractC0274j k4;
        do {
            Object obj = w.f3897a;
            synchronized (obj) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i2 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            J.c addAll = cVar.addAll(collection);
            z4 = false;
            if (Intrinsics.a(addAll, cVar)) {
                return false;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj) {
                    int i4 = tVar4.f3891d;
                    if (i4 == i2) {
                        tVar4.f3890c = addAll;
                        tVar4.f3892e++;
                        tVar4.f3891d = i4 + 1;
                        z4 = true;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new A2.b(this, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return M2.o.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i4;
        J.c cVar;
        AbstractC0274j k4;
        boolean z4;
        do {
            Object obj2 = w.f3897a;
            synchronized (obj2) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i4 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            J.c add = cVar.add(i2, obj);
            if (add.equals(cVar)) {
                return;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj2) {
                    int i5 = tVar4.f3891d;
                    if (i5 == i4) {
                        tVar4.f3890c = add;
                        tVar4.f3892e++;
                        tVar4.f3891d = i5 + 1;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2;
        J.c cVar;
        boolean z4;
        AbstractC0274j k4;
        do {
            Object obj2 = w.f3897a;
            synchronized (obj2) {
                t tVar = this.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i2 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            K.c cVar2 = (K.c) cVar;
            int indexOf = cVar2.indexOf(obj);
            J.c cVar3 = cVar2;
            if (indexOf != -1) {
                cVar3 = cVar2.l(indexOf);
            }
            z4 = false;
            if (Intrinsics.a(cVar3, cVar)) {
                return false;
            }
            t tVar3 = this.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, this, k4);
                synchronized (obj2) {
                    int i4 = tVar4.f3891d;
                    if (i4 == i2) {
                        tVar4.f3890c = cVar3;
                        tVar4.f3892e++;
                        tVar4.f3891d = i4 + 1;
                        z4 = true;
                    }
                }
            }
            q.n(k4, this);
        } while (!z4);
        return true;
    }
}
