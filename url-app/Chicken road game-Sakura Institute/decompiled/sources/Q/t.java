package Q;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends F {

    /* renamed from: c, reason: collision with root package name */
    public J.c f3890c;

    /* renamed from: d, reason: collision with root package name */
    public int f3891d;

    /* renamed from: e, reason: collision with root package name */
    public int f3892e;

    public t(J.c cVar) {
        this.f3890c = cVar;
    }

    @Override // Q.F
    public final void a(F f4) {
        synchronized (w.f3897a) {
            Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f3890c = ((t) f4).f3890c;
            this.f3891d = ((t) f4).f3891d;
            this.f3892e = ((t) f4).f3892e;
            Unit unit = Unit.f7487a;
        }
    }

    @Override // Q.F
    public final F b() {
        return new t(this.f3890c);
    }
}
