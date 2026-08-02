package kotlinx.coroutines.flow;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material3.SliderState$drag$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class SubscribedSharedFlow implements SharedFlow {
    public final SliderState$drag$2 action;
    public final SharedFlowImpl sharedFlow;

    public SubscribedSharedFlow(SharedFlowImpl sharedFlowImpl, SliderState$drag$2 sliderState$drag$2) {
        this.sharedFlow = sharedFlowImpl;
        this.action = sliderState$drag$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1;
        int i;
        if (continuation instanceof SubscribedSharedFlow$collect$1) {
            subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1) continuation;
            int i2 = subscribedSharedFlow$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                subscribedSharedFlow$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = subscribedSharedFlow$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscribedSharedFlow$collect$1.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(flowCollector, this.action);
                subscribedSharedFlow$collect$1.label = 1;
                this.sharedFlow.collect(subscribedFlowCollector, subscribedSharedFlow$collect$1);
                return coroutineSingletons;
            }
        }
        subscribedSharedFlow$collect$1 = new SubscribedSharedFlow$collect$1(this, continuation);
        Object obj2 = subscribedSharedFlow$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscribedSharedFlow$collect$1.label;
        if (i == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.sharedFlow.getReplayCache();
    }
}
