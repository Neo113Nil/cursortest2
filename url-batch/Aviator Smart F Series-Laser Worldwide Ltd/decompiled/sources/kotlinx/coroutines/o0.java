package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
class o0 extends a implements n0 {
    public o0(CoroutineContext coroutineContext, boolean z7) {
        super(coroutineContext, true, z7);
    }

    static /* synthetic */ <T> Object await$suspendImpl(o0 o0Var, kotlin.coroutines.c cVar) {
        Object awaitInternal = o0Var.awaitInternal(cVar);
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.n0
    public Object await(kotlin.coroutines.c cVar) {
        return await$suspendImpl(this, cVar);
    }

    @Override // kotlinx.coroutines.n0
    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.n0
    public kotlinx.coroutines.selects.e getOnAwait() {
        kotlinx.coroutines.selects.e onAwaitInternal = getOnAwaitInternal();
        kotlin.jvm.internal.s.checkNotNull(onAwaitInternal, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return onAwaitInternal;
    }
}
