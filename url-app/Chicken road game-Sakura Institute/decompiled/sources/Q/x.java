package Q;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends F {

    /* renamed from: c, reason: collision with root package name */
    public J.e f3899c;

    /* renamed from: d, reason: collision with root package name */
    public int f3900d;

    public x(J.e eVar) {
        this.f3899c = eVar;
    }

    @Override // Q.F
    public final void a(F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        x xVar = (x) f4;
        synchronized (w.f3898b) {
            this.f3899c = xVar.f3899c;
            this.f3900d = xVar.f3900d;
            Unit unit = Unit.f7487a;
        }
    }

    @Override // Q.F
    public final F b() {
        return new x(this.f3899c);
    }
}
