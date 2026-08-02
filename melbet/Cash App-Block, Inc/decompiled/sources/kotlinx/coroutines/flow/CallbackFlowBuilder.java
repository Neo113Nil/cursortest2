package kotlinx.coroutines.flow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CallbackFlowBuilder extends ChannelFlowBuilder {
    public final Function2 block;

    public CallbackFlowBuilder(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i, bufferOverflow, 0);
        this.block = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectTo(ProducerScope producerScope, Continuation continuation) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        int i;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i2 = callbackFlowBuilder$collectTo$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                callbackFlowBuilder$collectTo$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = callbackFlowBuilder$collectTo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callbackFlowBuilder$collectTo$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    callbackFlowBuilder$collectTo$1.L$0 = producerScope;
                    callbackFlowBuilder$collectTo$1.label = 1;
                    if (super.collectTo(producerScope, callbackFlowBuilder$collectTo$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    producerScope = callbackFlowBuilder$collectTo$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((ProducerCoroutine) producerScope)._channel.isClosedForSend()) {
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
        Object obj3 = callbackFlowBuilder$collectTo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callbackFlowBuilder$collectTo$1.label;
        if (i != 0) {
        }
        if (!((ProducerCoroutine) producerScope)._channel.isClosedForSend()) {
        }
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.block, coroutineContext, i, bufferOverflow);
    }
}
