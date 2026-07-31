package com.onesignal.notifications.bridges;

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

/* compiled from: OneSignalHmsEventBridge.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.bridges.OneSignalHmsEventBridge$onNewToken$1", f = "OneSignalHmsEventBridge.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalHmsEventBridge$onNewToken$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalHmsEventBridge$onNewToken$1(String str, Continuation<? super OneSignalHmsEventBridge$onNewToken$1> continuation) {
        super(1, continuation);
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OneSignalHmsEventBridge$onNewToken$1(this.$token, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OneSignalHmsEventBridge$onNewToken$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((IPushRegistratorCallback) OneSignal.INSTANCE.getServices().getService(IPushRegistratorCallback.class)).fireCallback(this.$token, this) == coroutine_suspended) {
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
