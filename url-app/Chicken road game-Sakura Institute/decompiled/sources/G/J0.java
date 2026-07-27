package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J0 extends Q.F {

    /* renamed from: c, reason: collision with root package name */
    public int f2711c;

    public J0(int i2) {
        this.f2711c = i2;
    }

    @Override // Q.F
    public final void a(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f2711c = ((J0) f4).f2711c;
    }

    @Override // Q.F
    public final Q.F b() {
        return new J0(this.f2711c);
    }
}
