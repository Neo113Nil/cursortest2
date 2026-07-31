package o2;

import a2.AbstractC1241b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import w2.InterfaceC3509c;

/* loaded from: classes3.dex */
class S extends AbstractC3317a implements Q {
    public S(CoroutineContext coroutineContext, boolean z4) {
        super(coroutineContext, true, z4);
    }

    static /* synthetic */ Object S0(S s4, kotlin.coroutines.d dVar) {
        Object D4 = s4.D(dVar);
        AbstractC1241b.f();
        return D4;
    }

    @Override // o2.Q
    public Object await(kotlin.coroutines.d dVar) {
        return S0(this, dVar);
    }

    @Override // o2.Q
    public Object getCompleted() {
        return U();
    }

    @Override // o2.Q
    public InterfaceC3509c getOnAwait() {
        InterfaceC3509c Y3 = Y();
        Intrinsics.checkNotNull(Y3, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return Y3;
    }
}
