package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes5.dex */
public final class SubscribedFlowCollector implements f {
    private final f6.p action;
    private final f collector;

    public SubscribedFlowCollector(f fVar, f6.p pVar) {
        this.collector = fVar;
        this.action = pVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(Object obj, kotlin.coroutines.c cVar) {
        return this.collector.emit(obj, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onSubscription(kotlin.coroutines.c cVar) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        Object coroutine_suspended;
        ?? r22;
        SafeCollector safeCollector;
        SubscribedFlowCollector subscribedFlowCollector;
        try {
            if (cVar instanceof SubscribedFlowCollector$onSubscription$1) {
                subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) cVar;
                int i8 = subscribedFlowCollector$onSubscription$1.label;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    subscribedFlowCollector$onSubscription$1.label = i8 - Integer.MIN_VALUE;
                    Object obj = subscribedFlowCollector$onSubscription$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    r22 = subscribedFlowCollector$onSubscription$1.label;
                    if (r22 != 0) {
                        y5.g.throwOnFailure(obj);
                        safeCollector = new SafeCollector(this.collector, subscribedFlowCollector$onSubscription$1.getContext());
                        f6.p pVar = this.action;
                        subscribedFlowCollector$onSubscription$1.L$0 = this;
                        subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
                        subscribedFlowCollector$onSubscription$1.label = 1;
                        if (pVar.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        subscribedFlowCollector = this;
                    } else {
                        if (r22 != 1) {
                            if (r22 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y5.g.throwOnFailure(obj);
                            return y5.w.INSTANCE;
                        }
                        safeCollector = (SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
                        subscribedFlowCollector = (SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    safeCollector.releaseIntercepted();
                    f fVar = subscribedFlowCollector.collector;
                    r22 = fVar instanceof SubscribedFlowCollector;
                    if (r22 != 0) {
                        return y5.w.INSTANCE;
                    }
                    subscribedFlowCollector$onSubscription$1.L$0 = null;
                    subscribedFlowCollector$onSubscription$1.L$1 = null;
                    subscribedFlowCollector$onSubscription$1.label = 2;
                    if (((SubscribedFlowCollector) fVar).onSubscription(subscribedFlowCollector$onSubscription$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return y5.w.INSTANCE;
                }
            }
            if (r22 != 0) {
            }
            safeCollector.releaseIntercepted();
            f fVar2 = subscribedFlowCollector.collector;
            r22 = fVar2 instanceof SubscribedFlowCollector;
            if (r22 != 0) {
            }
        } catch (Throwable th) {
            r22.releaseIntercepted();
            throw th;
        }
        subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, cVar);
        Object obj2 = subscribedFlowCollector$onSubscription$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        r22 = subscribedFlowCollector$onSubscription$1.label;
    }
}
