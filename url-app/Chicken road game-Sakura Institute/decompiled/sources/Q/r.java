package Q;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1411O;
import z2.C1442z;

/* loaded from: classes.dex */
public final class r implements Set, N2.f {

    /* renamed from: d, reason: collision with root package name */
    public final y f3888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3889e;

    public r(y yVar, int i2) {
        this.f3889e = i2;
        this.f3888d = yVar;
    }

    private final boolean e(Collection collection) {
        J.e eVar;
        int i2;
        AbstractC0274j k4;
        boolean z4;
        Collection<Map.Entry> collection2 = collection;
        int a4 = C1411O.a(C1442z.h(collection2, 10));
        if (a4 < 16) {
            a4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a4);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        y yVar = this.f3888d;
        boolean z5 = false;
        do {
            synchronized (w.f3898b) {
                x xVar = yVar.f3901d;
                Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x xVar2 = (x) q.i(xVar);
                eVar = xVar2.f3899c;
                i2 = xVar2.f3900d;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(eVar);
            J.d a5 = eVar.a();
            Iterator it = yVar.f3902e.iterator();
            while (((C) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((C) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    a5.remove(entry2.getKey());
                    z5 = true;
                }
            }
            Unit unit2 = Unit.f7487a;
            J.e j4 = a5.j();
            if (Intrinsics.a(j4, eVar)) {
                break;
            }
            x xVar3 = yVar.f3901d;
            Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (q.f3878b) {
                k4 = q.k();
                x xVar4 = (x) q.w(xVar3, yVar, k4);
                synchronized (w.f3898b) {
                    int i4 = xVar4.f3900d;
                    if (i4 == i2) {
                        xVar4.f3899c = j4;
                        xVar4.f3900d = i4 + 1;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, yVar);
        } while (!z4);
        return z5;
    }

    private final boolean h(Collection collection) {
        J.e eVar;
        int i2;
        AbstractC0274j k4;
        boolean z4;
        Set K3 = C1403G.K(collection);
        y yVar = this.f3888d;
        boolean z5 = false;
        do {
            synchronized (w.f3898b) {
                x xVar = yVar.f3901d;
                Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x xVar2 = (x) q.i(xVar);
                eVar = xVar2.f3899c;
                i2 = xVar2.f3900d;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(eVar);
            J.d a4 = eVar.a();
            Iterator it = yVar.f3902e.iterator();
            while (((C) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C) it).next();
                if (!K3.contains(entry.getKey())) {
                    a4.remove(entry.getKey());
                    z5 = true;
                }
            }
            Unit unit2 = Unit.f7487a;
            J.e j4 = a4.j();
            if (Intrinsics.a(j4, eVar)) {
                break;
            }
            x xVar3 = yVar.f3901d;
            Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (q.f3878b) {
                k4 = q.k();
                x xVar4 = (x) q.w(xVar3, yVar, k4);
                synchronized (w.f3898b) {
                    int i4 = xVar4.f3900d;
                    if (i4 == i2) {
                        xVar4.f3899c = j4;
                        xVar4.f3900d = i4 + 1;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, yVar);
        } while (!z4);
        return z5;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3889e) {
            case 0:
                w.g();
                throw null;
            case 1:
                w.g();
                throw null;
            default:
                w.g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3889e) {
            case 0:
                w.g();
                throw null;
            case 1:
                w.g();
                throw null;
            default:
                w.g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f3888d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3889e) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof N2.a) && !(obj instanceof N2.d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.a(this.f3888d.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f3888d.containsKey(obj);
            default:
                return this.f3888d.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3889e) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f3888d.containsKey(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f3888d.containsValue(it3.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f3888d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3889e) {
            case 0:
                y yVar = this.f3888d;
                return new C(yVar, ((J.b) yVar.b().f3899c.entrySet()).iterator(), 0);
            case 1:
                y yVar2 = this.f3888d;
                return new C(yVar2, ((J.b) yVar2.b().f3899c.entrySet()).iterator(), 1);
            default:
                y yVar3 = this.f3888d;
                return new C(yVar3, ((J.b) yVar3.b().f3899c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.f3889e) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof N2.a) || (obj instanceof N2.d))) {
                    if (this.f3888d.remove(((Map.Entry) obj).getKey()) != null) {
                        break;
                    }
                }
                break;
            case 1:
                if (this.f3888d.remove(obj) != null) {
                }
                break;
            default:
                y yVar = this.f3888d;
                Iterator it = yVar.f3902e.iterator();
                while (true) {
                    if (((C) it).hasNext()) {
                        obj2 = ((C) it).next();
                        if (Intrinsics.a(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    yVar.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        J.e eVar;
        int i2;
        AbstractC0274j k4;
        boolean z4;
        switch (this.f3889e) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z5 = false;
                    while (it.hasNext()) {
                        if (this.f3888d.remove(((Map.Entry) it.next()).getKey()) != null || z5) {
                            z5 = true;
                        }
                    }
                    return z5;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z6 = false;
                    while (it2.hasNext()) {
                        if (this.f3888d.remove(it2.next()) != null || z6) {
                            z6 = true;
                        }
                    }
                    return z6;
                    break;
                }
                break;
            default:
                Set K3 = C1403G.K(collection);
                y yVar = this.f3888d;
                boolean z7 = false;
                do {
                    synchronized (w.f3898b) {
                        x xVar = yVar.f3901d;
                        Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        x xVar2 = (x) q.i(xVar);
                        eVar = xVar2.f3899c;
                        i2 = xVar2.f3900d;
                        Unit unit = Unit.f7487a;
                    }
                    Intrinsics.c(eVar);
                    J.d a4 = eVar.a();
                    Iterator it3 = yVar.f3902e.iterator();
                    while (((C) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C) it3).next();
                        if (K3.contains(entry.getValue())) {
                            a4.remove(entry.getKey());
                            z7 = true;
                        }
                    }
                    Unit unit2 = Unit.f7487a;
                    J.e j4 = a4.j();
                    if (!Intrinsics.a(j4, eVar)) {
                        x xVar3 = yVar.f3901d;
                        Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (q.f3878b) {
                            k4 = q.k();
                            x xVar4 = (x) q.w(xVar3, yVar, k4);
                            synchronized (w.f3898b) {
                                int i4 = xVar4.f3900d;
                                if (i4 == i2) {
                                    xVar4.f3899c = j4;
                                    xVar4.f3900d = i4 + 1;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                        }
                        q.n(k4, yVar);
                    }
                    return z7;
                } while (!z4);
                return z7;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        J.e eVar;
        int i2;
        AbstractC0274j k4;
        boolean z4;
        switch (this.f3889e) {
            case 0:
                return e(collection);
            case 1:
                return h(collection);
            default:
                Set K3 = C1403G.K(collection);
                y yVar = this.f3888d;
                boolean z5 = false;
                do {
                    synchronized (w.f3898b) {
                        x xVar = yVar.f3901d;
                        Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        x xVar2 = (x) q.i(xVar);
                        eVar = xVar2.f3899c;
                        i2 = xVar2.f3900d;
                        Unit unit = Unit.f7487a;
                    }
                    Intrinsics.c(eVar);
                    J.d a4 = eVar.a();
                    Iterator it = yVar.f3902e.iterator();
                    while (((C) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C) it).next();
                        if (!K3.contains(entry.getValue())) {
                            a4.remove(entry.getKey());
                            z5 = true;
                        }
                    }
                    Unit unit2 = Unit.f7487a;
                    J.e j4 = a4.j();
                    if (!Intrinsics.a(j4, eVar)) {
                        x xVar3 = yVar.f3901d;
                        Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (q.f3878b) {
                            k4 = q.k();
                            x xVar4 = (x) q.w(xVar3, yVar, k4);
                            synchronized (w.f3898b) {
                                int i4 = xVar4.f3900d;
                                if (i4 == i2) {
                                    xVar4.f3899c = j4;
                                    xVar4.f3900d = i4 + 1;
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                        }
                        q.n(k4, yVar);
                    }
                    return z5;
                } while (!z4);
                return z5;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f3888d.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return M2.o.b(this, objArr);
    }
}
