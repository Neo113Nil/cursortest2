package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
final class m extends AbstractFlow {
    private final f6.p block;

    public m(f6.p pVar) {
        this.block = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object invoke = this.block.invoke(fVar, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : y5.w.INSTANCE;
    }
}
