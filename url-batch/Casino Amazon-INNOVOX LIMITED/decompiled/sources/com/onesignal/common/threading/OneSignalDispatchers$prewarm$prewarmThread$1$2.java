package com.onesignal.common.threading;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: OneSignalDispatchers.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.common.threading.OneSignalDispatchers$prewarm$prewarmThread$1$2", f = "OneSignalDispatchers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class OneSignalDispatchers$prewarm$prewarmThread$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    OneSignalDispatchers$prewarm$prewarmThread$1$2(Continuation<? super OneSignalDispatchers$prewarm$prewarmThread$1$2> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OneSignalDispatchers$prewarm$prewarmThread$1$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OneSignalDispatchers$prewarm$prewarmThread$1$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
