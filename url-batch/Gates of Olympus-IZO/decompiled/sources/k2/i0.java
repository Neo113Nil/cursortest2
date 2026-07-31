package k2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class i0 extends P1.a implements X {

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f5367e = new i0(C0547t.f5390e);

    @Override // k2.X
    public final G L(Y1.c cVar) {
        return j0.f5370d;
    }

    @Override // k2.X
    public final InterfaceC0539k O(f0 f0Var) {
        return j0.f5370d;
    }

    @Override // k2.X
    public final boolean b() {
        return true;
    }

    @Override // k2.X
    public final G e(boolean z3, boolean z4, a0 a0Var) {
        return j0.f5370d;
    }

    @Override // k2.X
    public final Object h(R1.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // k2.X
    public final CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // k2.X
    public final boolean p() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // k2.X
    public final void a(CancellationException cancellationException) {
    }
}
