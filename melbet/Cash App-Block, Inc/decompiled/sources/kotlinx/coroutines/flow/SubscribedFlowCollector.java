package kotlinx.coroutines.flow;

import androidx.compose.material3.SliderState$drag$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SubscribedFlowCollector implements FlowCollector {
    public final SliderState$drag$2 action;
    public final FlowCollector collector;

    public SubscribedFlowCollector(FlowCollector flowCollector, SliderState$drag$2 sliderState$drag$2) {
        this.collector = flowCollector;
        this.action = sliderState$drag$2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return this.collector.emit(obj, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r4).onSubscription(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onSubscription(ContinuationImpl continuationImpl) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        int i;
        FlowCollector flowCollector;
        Throwable th;
        SafeCollector safeCollector;
        if (continuationImpl instanceof SubscribedFlowCollector$onSubscription$1) {
            subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1) continuationImpl;
            int i2 = subscribedFlowCollector$onSubscription$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                subscribedFlowCollector$onSubscription$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = subscribedFlowCollector$onSubscription$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscribedFlowCollector$onSubscription$1.label;
                flowCollector = this.collector;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeCollector safeCollector2 = new SafeCollector(flowCollector, subscribedFlowCollector$onSubscription$1.getContext());
                    try {
                        SliderState$drag$2 sliderState$drag$2 = this.action;
                        subscribedFlowCollector$onSubscription$1.L$0 = safeCollector2;
                        subscribedFlowCollector$onSubscription$1.label = 1;
                        if (sliderState$drag$2.invoke(safeCollector2, subscribedFlowCollector$onSubscription$1) != coroutineSingletons) {
                            safeCollector = safeCollector2;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                safeCollector = subscribedFlowCollector$onSubscription$1.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    safeCollector.releaseIntercepted();
                    throw th;
                }
                safeCollector.releaseIntercepted();
                if (flowCollector instanceof SubscribedFlowCollector) {
                    return Unit.INSTANCE;
                }
                subscribedFlowCollector$onSubscription$1.L$0 = null;
                subscribedFlowCollector$onSubscription$1.label = 2;
            }
        }
        subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, continuationImpl);
        Object obj2 = subscribedFlowCollector$onSubscription$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscribedFlowCollector$onSubscription$1.label;
        flowCollector = this.collector;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        if (flowCollector instanceof SubscribedFlowCollector) {
        }
    }
}
