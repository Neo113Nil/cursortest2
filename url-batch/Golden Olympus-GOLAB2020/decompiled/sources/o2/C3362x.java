package o2;

import a2.AbstractC1241b;
import kotlin.jvm.internal.Intrinsics;
import w2.InterfaceC3509c;

/* renamed from: o2.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3362x extends D0 implements InterfaceC3360w {
    public C3362x(InterfaceC3359v0 interfaceC3359v0) {
        super(true);
        h0(interfaceC3359v0);
    }

    @Override // o2.InterfaceC3360w
    public boolean J(Object obj) {
        return n0(obj);
    }

    @Override // o2.D0
    public boolean Z() {
        return true;
    }

    @Override // o2.Q
    public Object await(kotlin.coroutines.d dVar) {
        Object D4 = D(dVar);
        AbstractC1241b.f();
        return D4;
    }

    @Override // o2.Q
    public Object getCompleted() {
        return U();
    }

    @Override // o2.Q
    public InterfaceC3509c getOnAwait() {
        InterfaceC3509c Y3 = Y();
        Intrinsics.checkNotNull(Y3, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return Y3;
    }

    @Override // o2.InterfaceC3360w
    public boolean o(Throwable th) {
        return n0(new C3308B(th, false, 2, null));
    }
}
