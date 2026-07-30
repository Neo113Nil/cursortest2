package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* loaded from: classes5.dex */
final class CallbackFlowBuilder extends c {
    private final f6.p block;

    public /* synthetic */ CallbackFlowBuilder(f6.p pVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, kotlin.jvm.internal.o oVar) {
        this(pVar, (i9 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.internal.ChannelFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        Object coroutine_suspended;
        int i8;
        if (cVar instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) cVar;
            int i9 = callbackFlowBuilder$collectTo$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label = i9 - Integer.MIN_VALUE;
                Object obj = callbackFlowBuilder$collectTo$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = callbackFlowBuilder$collectTo$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    callbackFlowBuilder$collectTo$1.L$0 = jVar;
                    callbackFlowBuilder$collectTo$1.label = 1;
                    if (super.collectTo(jVar, callbackFlowBuilder$collectTo$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (kotlinx.coroutines.channels.j) callbackFlowBuilder$collectTo$1.L$0;
                    y5.g.throwOnFailure(obj);
                }
                if (jVar.isClosedForSend()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return y5.w.INSTANCE;
            }
        }
        callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, cVar);
        Object obj2 = callbackFlowBuilder$collectTo$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = callbackFlowBuilder$collectTo$1.label;
        if (i8 != 0) {
        }
        if (jVar.isClosedForSend()) {
        }
    }

    @Override // kotlinx.coroutines.flow.c, kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.block, coroutineContext, i8, bufferOverflow);
    }

    public CallbackFlowBuilder(f6.p pVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(pVar, coroutineContext, i8, bufferOverflow);
        this.block = pVar;
    }
}
