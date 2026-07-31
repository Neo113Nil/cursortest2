package com.onesignal.debug.internal.crash;

import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.otel.crash.OtelCrashUploader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: OneSignalCrashUploaderWrapper.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.debug.internal.crash.OneSignalCrashUploaderWrapper$start$1", f = "OneSignalCrashUploaderWrapper.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalCrashUploaderWrapper$start$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneSignalCrashUploaderWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalCrashUploaderWrapper$start$1(OneSignalCrashUploaderWrapper oneSignalCrashUploaderWrapper, Continuation<? super OneSignalCrashUploaderWrapper$start$1> continuation) {
        super(1, continuation);
        this.this$0 = oneSignalCrashUploaderWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OneSignalCrashUploaderWrapper$start$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OneSignalCrashUploaderWrapper$start$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OtelCrashUploader uploader;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                uploader = this.this$0.getUploader();
                this.label = 1;
                if (uploader.start(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th) {
            Logging.warn("OneSignal: Crash uploader failed to start: " + th.getMessage(), th);
        }
        return Unit.INSTANCE;
    }
}
