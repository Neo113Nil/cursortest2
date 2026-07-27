package G;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class I0 extends Q.F {

    /* renamed from: c, reason: collision with root package name */
    public float f2709c;

    public I0(float f4) {
        this.f2709c = f4;
    }

    @Override // Q.F
    public final void a(Q.F f4) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f2709c = ((I0) f4).f2709c;
    }

    @Override // Q.F
    public final Q.F b() {
        return new I0(this.f2709c);
    }
}
