package com.facebook.react.devsupport.inspector;

import com.facebook.react.devsupport.inspector.FrameTimingsObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FrameTimingsObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.facebook.react.devsupport.inspector.FrameTimingsObserver$encodeFrame$1", f = "FrameTimingsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class FrameTimingsObserver$encodeFrame$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FrameTimingsObserver.FrameData $frameData;
    int label;
    final /* synthetic */ FrameTimingsObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FrameTimingsObserver$encodeFrame$1(FrameTimingsObserver frameTimingsObserver, FrameTimingsObserver.FrameData frameData, Continuation<? super FrameTimingsObserver$encodeFrame$1> continuation) {
        super(2, continuation);
        this.this$0 = frameTimingsObserver;
        this.$frameData = frameData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FrameTimingsObserver$encodeFrame$1(this.this$0, this.$frameData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FrameTimingsObserver$encodeFrame$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        byte[] encodeScreenshot;
        AtomicBoolean atomicBoolean;
        AtomicReference atomicReference;
        byte[] encodeScreenshot2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                encodeScreenshot = this.this$0.encodeScreenshot(this.$frameData.getBitmap());
                this.this$0.emitFrameEvent(this.$frameData.getFrameId(), this.$frameData.getThreadId(), this.$frameData.getBeginTimestamp(), this.$frameData.getEndTimestamp(), encodeScreenshot);
                this.$frameData.getBitmap().recycle();
                atomicBoolean = this.this$0.encodingInProgress;
                atomicBoolean.set(false);
                atomicReference = this.this$0.lastFrameBuffer;
                FrameTimingsObserver.FrameData frameData = (FrameTimingsObserver.FrameData) atomicReference.getAndSet(null);
                if (frameData != null) {
                    try {
                        encodeScreenshot2 = this.this$0.encodeScreenshot(frameData.getBitmap());
                        this.this$0.emitFrameEvent(frameData.getFrameId(), frameData.getThreadId(), frameData.getBeginTimestamp(), frameData.getEndTimestamp(), encodeScreenshot2);
                    } finally {
                        frameData.getBitmap().recycle();
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$frameData.getBitmap().recycle();
                throw th;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
