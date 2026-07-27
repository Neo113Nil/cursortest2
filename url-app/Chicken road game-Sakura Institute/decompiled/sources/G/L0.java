package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L0 extends Q.F {

    /* renamed from: c, reason: collision with root package name */
    public Object f2721c;

    public L0(Object obj) {
        this.f2721c = obj;
    }

    @Override // Q.F
    public final void a(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f2721c = ((L0) f4).f2721c;
    }

    @Override // Q.F
    public final Q.F b() {
        return new L0(this.f2721c);
    }
}
