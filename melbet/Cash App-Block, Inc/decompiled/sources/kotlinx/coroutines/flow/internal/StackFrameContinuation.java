package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: classes3.dex */
public final class StackFrameContinuation implements Continuation, CoroutineStackFrame {
    public final CoroutineContext context;
    public final ChannelFlowKt$withContextUndispatched$1 uCont;

    public StackFrameContinuation(ChannelFlowKt$withContextUndispatched$1 channelFlowKt$withContextUndispatched$1, CoroutineContext coroutineContext) {
        this.uCont = channelFlowKt$withContextUndispatched$1;
        this.context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.uCont;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
