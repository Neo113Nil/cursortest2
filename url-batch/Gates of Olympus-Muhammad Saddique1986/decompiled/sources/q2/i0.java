package q2;

import e2.InterfaceC0424c;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class i0 extends V1.a implements X {

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f7906e = new i0(C0832t.f7929e);

    @Override // q2.X
    public final boolean b() {
        return true;
    }

    @Override // q2.X
    public final CancellationException g() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // q2.X
    public final boolean h() {
        return false;
    }

    @Override // q2.X
    public final Object r(X1.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // q2.X
    public final G w(boolean z3, boolean z4, a0 a0Var) {
        return j0.f7909d;
    }

    @Override // q2.X
    public final G x(InterfaceC0424c interfaceC0424c) {
        return j0.f7909d;
    }

    @Override // q2.X
    public final InterfaceC0824k z(f0 f0Var) {
        return j0.f7909d;
    }

    @Override // q2.X
    public final void a(CancellationException cancellationException) {
    }
}
