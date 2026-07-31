package com.onesignal.notifications.internal.registration.impl;

import androidx.work.WorkRequest;
import com.amazon.device.messaging.ADM;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: PushRegistratorADM.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/onesignal/notifications/internal/registration/impl/PushRegistratorADM;", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator;", "Lcom/onesignal/notifications/internal/registration/impl/IPushRegistratorCallback;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "(Lcom/onesignal/core/internal/application/IApplicationService;)V", "waiter", "Lcom/onesignal/common/threading/WaiterWithValue;", "", "fireCallback", "", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerForPush", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator$RegisterResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushRegistratorADM implements IPushRegistrator, IPushRegistratorCallback {
    private final IApplicationService _applicationService;
    private WaiterWithValue<String> waiter;

    public PushRegistratorADM(IApplicationService _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        PushRegistratorADM$registerForPush$1 pushRegistratorADM$registerForPush$1;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof PushRegistratorADM$registerForPush$1) {
            pushRegistratorADM$registerForPush$1 = (PushRegistratorADM$registerForPush$1) continuation;
            if ((pushRegistratorADM$registerForPush$1.label & Integer.MIN_VALUE) != 0) {
                pushRegistratorADM$registerForPush$1.label -= Integer.MIN_VALUE;
                Object obj = pushRegistratorADM$registerForPush$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushRegistratorADM$registerForPush$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.waiter = new WaiterWithValue<>();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = adm.getRegistrationId();
                    if (objectRef2.element != 0) {
                        Logging.debug$default("ADM Already registered with ID:" + ((String) objectRef2.element), null, 2, null);
                        return new IPushRegistrator.RegisterResult((String) objectRef2.element, SubscriptionStatus.SUBSCRIBED);
                    }
                    adm.startRegister();
                    PushRegistratorADM$registerForPush$2 pushRegistratorADM$registerForPush$2 = new PushRegistratorADM$registerForPush$2(objectRef2, this, null);
                    pushRegistratorADM$registerForPush$1.L$0 = objectRef2;
                    pushRegistratorADM$registerForPush$1.label = 1;
                    if (TimeoutKt.withTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, pushRegistratorADM$registerForPush$2, pushRegistratorADM$registerForPush$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) pushRegistratorADM$registerForPush$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0) {
                    Logging.debug$default("ADM registered with ID:" + ((String) objectRef.element), null, 2, null);
                    return new IPushRegistrator.RegisterResult((String) objectRef.element, SubscriptionStatus.SUBSCRIBED);
                }
                Logging.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.ERROR);
            }
        }
        pushRegistratorADM$registerForPush$1 = new PushRegistratorADM$registerForPush$1(this, continuation);
        Object obj2 = pushRegistratorADM$registerForPush$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushRegistratorADM$registerForPush$1.label;
        if (i != 0) {
        }
        if (objectRef.element == 0) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, Continuation<? super Unit> continuation) {
        WaiterWithValue<String> waiterWithValue = this.waiter;
        if (waiterWithValue != null) {
            waiterWithValue.wake(str);
        }
        return Unit.INSTANCE;
    }
}
