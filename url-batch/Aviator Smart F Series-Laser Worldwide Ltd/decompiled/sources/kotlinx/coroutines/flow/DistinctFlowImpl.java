package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
final class DistinctFlowImpl implements e {
    public final f6.p areEquivalent;
    public final f6.l keySelector;
    private final e upstream;

    public DistinctFlowImpl(e eVar, f6.l lVar, f6.p pVar) {
        this.upstream = eVar;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlinx.coroutines.internal.g0] */
    @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = kotlinx.coroutines.flow.internal.l.NULL;
        Object collect = this.upstream.collect(new DistinctFlowImpl$collect$2(this, ref$ObjectRef, fVar), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : y5.w.INSTANCE;
    }
}
