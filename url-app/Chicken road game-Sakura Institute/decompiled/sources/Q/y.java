package Q;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements D, Map, N2.e {

    /* renamed from: d, reason: collision with root package name */
    public x f3901d;

    /* renamed from: e, reason: collision with root package name */
    public final r f3902e;

    /* renamed from: i, reason: collision with root package name */
    public final r f3903i;

    /* renamed from: j, reason: collision with root package name */
    public final r f3904j;

    public y() {
        L.c cVar = L.c.f3459l;
        x xVar = new x(cVar);
        if (q.f3877a.j() != null) {
            x xVar2 = new x(cVar);
            xVar2.f3809a = 1;
            xVar.f3810b = xVar2;
        }
        this.f3901d = xVar;
        this.f3902e = new r(this, 0);
        this.f3903i = new r(this, 1);
        this.f3904j = new r(this, 2);
    }

    public final x b() {
        x xVar = this.f3901d;
        Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (x) q.t(xVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC0274j k4;
        x xVar = this.f3901d;
        Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        x xVar2 = (x) q.i(xVar);
        L.c cVar = L.c.f3459l;
        if (cVar != xVar2.f3899c) {
            x xVar3 = this.f3901d;
            Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (q.f3878b) {
                k4 = q.k();
                x xVar4 = (x) q.w(xVar3, this, k4);
                synchronized (w.f3898b) {
                    xVar4.f3899c = cVar;
                    xVar4.f3900d++;
                }
            }
            q.n(k4, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().f3899c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().f3899c.containsValue(obj);
    }

    @Override // Q.D
    public final void e(F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f3901d = (x) f4;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f3902e;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().f3899c.get(obj);
    }

    @Override // Q.D
    public final F h() {
        return this.f3901d;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().f3899c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f3903i;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        J.e eVar;
        int i2;
        Object put;
        AbstractC0274j k4;
        boolean z4;
        do {
            Object obj3 = w.f3898b;
            synchronized (obj3) {
                x xVar = this.f3901d;
                Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x xVar2 = (x) q.i(xVar);
                eVar = xVar2.f3899c;
                i2 = xVar2.f3900d;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(eVar);
            L.e eVar2 = (L.e) eVar.a();
            put = eVar2.put(obj, obj2);
            J.e j4 = eVar2.j();
            if (Intrinsics.a(j4, eVar)) {
                break;
            }
            x xVar3 = this.f3901d;
            Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (q.f3878b) {
                k4 = q.k();
                x xVar4 = (x) q.w(xVar3, this, k4);
                synchronized (obj3) {
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
            q.n(k4, this);
        } while (!z4);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        J.e eVar;
        int i2;
        AbstractC0274j k4;
        boolean z4;
        do {
            Object obj = w.f3898b;
            synchronized (obj) {
                x xVar = this.f3901d;
                Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x xVar2 = (x) q.i(xVar);
                eVar = xVar2.f3899c;
                i2 = xVar2.f3900d;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(eVar);
            L.e eVar2 = (L.e) eVar.a();
            eVar2.putAll(map);
            J.e j4 = eVar2.j();
            if (Intrinsics.a(j4, eVar)) {
                return;
            }
            x xVar3 = this.f3901d;
            Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (q.f3878b) {
                k4 = q.k();
                x xVar4 = (x) q.w(xVar3, this, k4);
                synchronized (obj) {
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
            q.n(k4, this);
        } while (!z4);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        J.e eVar;
        int i2;
        Object remove;
        AbstractC0274j k4;
        boolean z4;
        do {
            Object obj2 = w.f3898b;
            synchronized (obj2) {
                x xVar = this.f3901d;
                Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x xVar2 = (x) q.i(xVar);
                eVar = xVar2.f3899c;
                i2 = xVar2.f3900d;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(eVar);
            J.d a4 = eVar.a();
            remove = a4.remove(obj);
            J.e j4 = a4.j();
            if (Intrinsics.a(j4, eVar)) {
                break;
            }
            x xVar3 = this.f3901d;
            Intrinsics.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (q.f3878b) {
                k4 = q.k();
                x xVar4 = (x) q.w(xVar3, this, k4);
                synchronized (obj2) {
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
            q.n(k4, this);
        } while (!z4);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().f3899c.size();
    }

    public final String toString() {
        x xVar = this.f3901d;
        Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((x) q.i(xVar)).f3899c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f3904j;
    }
}
