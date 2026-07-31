package com.onesignal.debug.internal.crash;

import com.onesignal.debug.internal.crash.OtelAnrDetector;
import com.onesignal.otel.IOtelCrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OtelAnrDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.debug.internal.crash.OtelAnrDetector$reportBackgroundBlock$1", f = "OtelAnrDetector.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OtelAnrDetector$reportBackgroundBlock$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OtelAnrDetector.BackgroundMainThreadBlockException $blockException;
    final /* synthetic */ Thread $mainThread;
    int label;
    final /* synthetic */ OtelAnrDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtelAnrDetector$reportBackgroundBlock$1(OtelAnrDetector otelAnrDetector, Thread thread, OtelAnrDetector.BackgroundMainThreadBlockException backgroundMainThreadBlockException, Continuation<? super OtelAnrDetector$reportBackgroundBlock$1> continuation) {
        super(2, continuation);
        this.this$0 = otelAnrDetector;
        this.$mainThread = thread;
        this.$blockException = backgroundMainThreadBlockException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtelAnrDetector$reportBackgroundBlock$1(this.this$0, this.$mainThread, this.$blockException, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OtelAnrDetector$reportBackgroundBlock$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IOtelCrashReporter iOtelCrashReporter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            iOtelCrashReporter = this.this$0.crashReporter;
            this.label = 1;
            if (iOtelCrashReporter.saveNonFatal(this.$mainThread, this.$blockException, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
