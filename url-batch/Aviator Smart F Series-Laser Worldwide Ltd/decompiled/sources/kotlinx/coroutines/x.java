package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class x extends JobSupport implements w {
    public x(l1 l1Var) {
        super(true);
        initParentJob(l1Var);
    }

    @Override // kotlinx.coroutines.w, kotlinx.coroutines.n0
    public Object await(kotlin.coroutines.c cVar) {
        Object awaitInternal = awaitInternal(cVar);
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.w
    public boolean complete(Object obj) {
        return makeCompleting$kotlinx_coroutines_core(obj);
    }

    @Override // kotlinx.coroutines.w
    public boolean completeExceptionally(Throwable th) {
        return makeCompleting$kotlinx_coroutines_core(new b0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.w, kotlinx.coroutines.n0
    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.w, kotlinx.coroutines.n0
    public kotlinx.coroutines.selects.e getOnAwait() {
        kotlinx.coroutines.selects.e onAwaitInternal = getOnAwaitInternal();
        kotlin.jvm.internal.s.checkNotNull(onAwaitInternal, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return onAwaitInternal;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
