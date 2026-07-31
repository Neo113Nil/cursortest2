package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.LogoutHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneSignalImp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp$logoutSuspend$2", f = "OneSignalImp.kt", i = {}, l = {787}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalImp$logoutSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$logoutSuspend$2(OneSignalImp oneSignalImp, Continuation<? super OneSignalImp$logoutSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = oneSignalImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSignalImp$logoutSuspend$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneSignalImp$logoutSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object suspendUntilInit;
        LogoutHelper logoutHelper;
        LogoutHelper logoutHelper2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Logging.log(LogLevel.DEBUG, "logoutSuspend()");
            this.label = 1;
            suspendUntilInit = this.this$0.suspendUntilInit("logout", this);
            if (suspendUntilInit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        logoutHelper = this.this$0.getLogoutHelper();
        LogoutHelper.LogoutEnqueueContext switchUser$com_onesignal_core = logoutHelper.switchUser$com_onesignal_core();
        if (switchUser$com_onesignal_core == null) {
            return Unit.INSTANCE;
        }
        logoutHelper2 = this.this$0.getLogoutHelper();
        logoutHelper2.enqueueLogout$com_onesignal_core(switchUser$com_onesignal_core);
        return Unit.INSTANCE;
    }
}
