package com.onesignal.notifications.services;

import com.onesignal.OneSignal;
import com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: ADMMessageHandler.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.services.ADMMessageHandler$onRegistrationError$1", f = "ADMMessageHandler.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ADMMessageHandler$onRegistrationError$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    ADMMessageHandler$onRegistrationError$1(Continuation<? super ADMMessageHandler$onRegistrationError$1> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ADMMessageHandler$onRegistrationError$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ADMMessageHandler$onRegistrationError$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((IPushRegistratorCallback) OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class)).fireCallback(null, this) == coroutine_suspended) {
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
