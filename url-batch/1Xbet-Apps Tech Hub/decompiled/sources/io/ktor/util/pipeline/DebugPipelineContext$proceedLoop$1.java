package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DebugPipelineContext.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {0}, l = {80}, m = "proceedLoop", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class DebugPipelineContext$proceedLoop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugPipelineContext<TSubject, TContext> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugPipelineContext$proceedLoop$1(DebugPipelineContext<TSubject, TContext> debugPipelineContext, Continuation<? super DebugPipelineContext$proceedLoop$1> continuation) {
        super(continuation);
        this.this$0 = debugPipelineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object proceedLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        proceedLoop = this.this$0.proceedLoop(this);
        return proceedLoop;
    }
}
