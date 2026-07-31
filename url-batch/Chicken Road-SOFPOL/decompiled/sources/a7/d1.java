package a7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d1 extends g6.a implements s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final d1 f250e = new d1(r.f297e);

    @Override // a7.s0
    public final boolean b() {
        return true;
    }

    @Override // a7.s0
    public final k j(a1 a1Var) {
        return e1.f253d;
    }

    @Override // a7.s0
    public final CancellationException p() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // a7.s0
    public final e0 q(boolean z3, boolean z7, v0 v0Var) {
        return e1.f253d;
    }

    @Override // a7.s0
    public final Object r(i6.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // a7.s0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // a7.s0
    public final e0 w(p6.c cVar) {
        return e1.f253d;
    }

    @Override // a7.s0
    public final void a(CancellationException cancellationException) {
    }
}
