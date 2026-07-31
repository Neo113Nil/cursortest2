package com.onesignal.notifications.internal.registration.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.device.IDeviceService;
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

/* compiled from: PushRegistratorHMS.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/onesignal/notifications/internal/registration/impl/PushRegistratorHMS;", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator;", "Lcom/onesignal/notifications/internal/registration/impl/IPushRegistratorCallback;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "(Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/core/internal/application/IApplicationService;)V", "waiter", "Lcom/onesignal/common/threading/WaiterWithValue;", "", "fireCallback", "", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHMSTokenTask", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator$RegisterResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerForPush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushRegistratorHMS implements IPushRegistrator, IPushRegistratorCallback {
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final IApplicationService _applicationService;
    private final IDeviceService _deviceService;
    private WaiterWithValue<String> waiter;

    public PushRegistratorHMS(IDeviceService _deviceService, IApplicationService _applicationService) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("HMS ApiException getting Huawei push token!", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r5.getStatusCode() == 907135000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r5 = com.onesignal.user.internal.subscriptions.SubscriptionStatus.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r5 = new com.onesignal.notifications.internal.registration.IPushRegistrator.RegisterResult(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r5 = com.onesignal.user.internal.subscriptions.SubscriptionStatus.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(Continuation<? super IPushRegistrator.RegisterResult> continuation) {
        PushRegistratorHMS$registerForPush$1 pushRegistratorHMS$registerForPush$1;
        int i;
        if (continuation instanceof PushRegistratorHMS$registerForPush$1) {
            pushRegistratorHMS$registerForPush$1 = (PushRegistratorHMS$registerForPush$1) continuation;
            if ((pushRegistratorHMS$registerForPush$1.label & Integer.MIN_VALUE) != 0) {
                pushRegistratorHMS$registerForPush$1.label -= Integer.MIN_VALUE;
                Object obj = pushRegistratorHMS$registerForPush$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushRegistratorHMS$registerForPush$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Context appContext = this._applicationService.getAppContext();
                    pushRegistratorHMS$registerForPush$1.label = 1;
                    obj = getHMSTokenTask(appContext, pushRegistratorHMS$registerForPush$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                IPushRegistrator.RegisterResult registerResult = (IPushRegistrator.RegisterResult) obj;
                Intrinsics.checkNotNull(registerResult);
                return registerResult;
            }
        }
        pushRegistratorHMS$registerForPush$1 = new PushRegistratorHMS$registerForPush$1(this, continuation);
        Object obj2 = pushRegistratorHMS$registerForPush$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushRegistratorHMS$registerForPush$1.label;
        if (i != 0) {
        }
        IPushRegistrator.RegisterResult registerResult2 = (IPushRegistrator.RegisterResult) obj2;
        Intrinsics.checkNotNull(registerResult2);
        return registerResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getHMSTokenTask(Context context, Continuation<? super IPushRegistrator.RegisterResult> continuation) throws ApiException {
        PushRegistratorHMS$getHMSTokenTask$1 pushRegistratorHMS$getHMSTokenTask$1;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof PushRegistratorHMS$getHMSTokenTask$1) {
            pushRegistratorHMS$getHMSTokenTask$1 = (PushRegistratorHMS$getHMSTokenTask$1) continuation;
            if ((pushRegistratorHMS$getHMSTokenTask$1.label & Integer.MIN_VALUE) != 0) {
                pushRegistratorHMS$getHMSTokenTask$1.label -= Integer.MIN_VALUE;
                Object obj = pushRegistratorHMS$getHMSTokenTask$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushRegistratorHMS$getHMSTokenTask$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.MISSING_HMS_PUSHKIT_LIBRARY);
                    }
                    this.waiter = new WaiterWithValue<>();
                    String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                    HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = hmsInstanceId.getToken(string, "HCM");
                    if (!TextUtils.isEmpty((CharSequence) objectRef2.element)) {
                        Logging.info$default("Device registered for HMS, push token = " + ((String) objectRef2.element), null, 2, null);
                        return new IPushRegistrator.RegisterResult((String) objectRef2.element, SubscriptionStatus.SUBSCRIBED);
                    }
                    PushRegistratorHMS$getHMSTokenTask$2 pushRegistratorHMS$getHMSTokenTask$2 = new PushRegistratorHMS$getHMSTokenTask$2(objectRef2, this, null);
                    pushRegistratorHMS$getHMSTokenTask$1.L$0 = objectRef2;
                    pushRegistratorHMS$getHMSTokenTask$1.label = 1;
                    if (TimeoutKt.withTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, pushRegistratorHMS$getHMSTokenTask$2, pushRegistratorHMS$getHMSTokenTask$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) pushRegistratorHMS$getHMSTokenTask$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element == 0) {
                    Logging.debug$default("HMS registered with ID:" + ((String) objectRef.element), null, 2, null);
                    return new IPushRegistrator.RegisterResult((String) objectRef.element, SubscriptionStatus.SUBSCRIBED);
                }
                Logging.warn$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.HMS_TOKEN_TIMEOUT);
            }
        }
        pushRegistratorHMS$getHMSTokenTask$1 = new PushRegistratorHMS$getHMSTokenTask$1(this, continuation);
        Object obj2 = pushRegistratorHMS$getHMSTokenTask$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushRegistratorHMS$getHMSTokenTask$1.label;
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
