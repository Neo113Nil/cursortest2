package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
final class CancellableFlowImpl implements a {
    private final e flow;

    public CancellableFlowImpl(e eVar) {
        this.flow = eVar;
    }

    @Override // kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object collect = this.flow.collect(new CancellableFlowImpl$collect$2(fVar), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }
}
