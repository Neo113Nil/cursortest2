package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
final class SubscribedSharedFlow implements n {
    private final f6.p action;
    private final n sharedFlow;

    public SubscribedSharedFlow(n nVar, f6.p pVar) {
        this.sharedFlow = nVar;
        this.action = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1) cVar;
            int i9 = subscribedSharedFlow$collect$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                subscribedSharedFlow$collect$1.label = i9 - Integer.MIN_VALUE;
                Object obj = subscribedSharedFlow$collect$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = subscribedSharedFlow$collect$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    n nVar = this.sharedFlow;
                    SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(fVar, this.action);
                    subscribedSharedFlow$collect$1.label = 1;
                    if (nVar.collect(subscribedFlowCollector, subscribedSharedFlow$collect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, cVar);
        Object obj2 = subscribedSharedFlow$collect$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = subscribedSharedFlow$collect$1.label;
        if (i8 != 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.flow.n
    public List<Object> getReplayCache() {
        return this.sharedFlow.getReplayCache();
    }
}
