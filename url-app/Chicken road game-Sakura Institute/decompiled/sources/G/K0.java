package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K0 extends Q.F {

    /* renamed from: c, reason: collision with root package name */
    public long f2715c;

    public K0(long j4) {
        this.f2715c = j4;
    }

    @Override // Q.F
    public final void a(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f2715c = ((K0) f4).f2715c;
    }

    @Override // Q.F
    public final Q.F b() {
        return new K0(this.f2715c);
    }
}
