package com.facebook.react.devsupport.inspector;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FrameTimingsObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.facebook.react.devsupport.inspector.FrameTimingsObserver$emitFrameEvent$1", f = "FrameTimingsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class FrameTimingsObserver$emitFrameEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $beginTimestamp;
    final /* synthetic */ long $endTimestamp;
    final /* synthetic */ int $frameId;
    final /* synthetic */ byte[] $screenshot;
    final /* synthetic */ int $threadId;
    int label;
    final /* synthetic */ FrameTimingsObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameTimingsObserver$emitFrameEvent$1(FrameTimingsObserver frameTimingsObserver, int i, int i2, long j, long j2, byte[] bArr, Continuation<? super FrameTimingsObserver$emitFrameEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = frameTimingsObserver;
        this.$frameId = i;
        this.$threadId = i2;
        this.$beginTimestamp = j;
        this.$endTimestamp = j2;
        this.$screenshot = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FrameTimingsObserver$emitFrameEvent$1(this.this$0, this.$frameId, this.$threadId, this.$beginTimestamp, this.$endTimestamp, this.$screenshot, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FrameTimingsObserver$emitFrameEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            function1 = this.this$0.onFrameTimingSequence;
            function1.invoke(new FrameTimingSequence(this.$frameId, this.$threadId, this.$beginTimestamp, this.$endTimestamp, this.$screenshot));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
