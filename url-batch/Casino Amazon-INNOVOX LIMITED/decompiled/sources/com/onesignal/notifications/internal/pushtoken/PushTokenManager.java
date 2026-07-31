package com.onesignal.notifications.internal.pushtoken;

import androidx.core.app.NotificationCompat;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushTokenManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u000e\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/onesignal/notifications/internal/pushtoken/PushTokenManager;", "Lcom/onesignal/notifications/internal/pushtoken/IPushTokenManager;", "_pushRegistrator", "Lcom/onesignal/notifications/internal/registration/IPushRegistrator;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "(Lcom/onesignal/notifications/internal/registration/IPushRegistrator;Lcom/onesignal/core/internal/device/IDeviceService;)V", "pushToken", "", "getPushToken", "()Ljava/lang/String;", "setPushToken", "(Ljava/lang/String;)V", "pushTokenStatus", "Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "getPushTokenStatus", "()Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "setPushTokenStatus", "(Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;)V", "pushStatusRuntimeError", "", NotificationCompat.CATEGORY_STATUS, "retrievePushToken", "Lcom/onesignal/notifications/internal/pushtoken/PushTokenResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushTokenManager implements IPushTokenManager {
    private final IDeviceService _deviceService;
    private final IPushRegistrator _pushRegistrator;
    private String pushToken;
    private SubscriptionStatus pushTokenStatus;

    /* compiled from: PushTokenManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IDeviceService.JetpackLibraryStatus.values().length];
            try {
                iArr[IDeviceService.JetpackLibraryStatus.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IDeviceService.JetpackLibraryStatus.OUTDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PushTokenManager(IPushRegistrator _pushRegistrator, IDeviceService _deviceService) {
        Intrinsics.checkNotNullParameter(_pushRegistrator, "_pushRegistrator");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        this._pushRegistrator = _pushRegistrator;
        this._deviceService = _deviceService;
        this.pushTokenStatus = SubscriptionStatus.NO_PERMISSION;
    }

    public final SubscriptionStatus getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    public final void setPushTokenStatus(SubscriptionStatus subscriptionStatus) {
        Intrinsics.checkNotNullParameter(subscriptionStatus, "<set-?>");
        this.pushTokenStatus = subscriptionStatus;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.pushtoken.IPushTokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(Continuation<? super PushTokenResponse> continuation) {
        PushTokenManager$retrievePushToken$1 pushTokenManager$retrievePushToken$1;
        int i;
        PushTokenManager pushTokenManager;
        IPushRegistrator.RegisterResult registerResult;
        if (continuation instanceof PushTokenManager$retrievePushToken$1) {
            pushTokenManager$retrievePushToken$1 = (PushTokenManager$retrievePushToken$1) continuation;
            if ((pushTokenManager$retrievePushToken$1.label & Integer.MIN_VALUE) != 0) {
                pushTokenManager$retrievePushToken$1.label -= Integer.MIN_VALUE;
                Object obj = pushTokenManager$retrievePushToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pushTokenManager$retrievePushToken$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i2 == 1) {
                        Logging.info$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = SubscriptionStatus.MISSING_JETPACK_LIBRARY;
                    } else if (i2 == 2) {
                        Logging.info$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = SubscriptionStatus.OUTDATED_JETPACK_LIBRARY;
                    } else {
                        IPushRegistrator iPushRegistrator = this._pushRegistrator;
                        pushTokenManager$retrievePushToken$1.L$0 = this;
                        pushTokenManager$retrievePushToken$1.label = 1;
                        obj = iPushRegistrator.registerForPush(pushTokenManager$retrievePushToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pushTokenManager = this;
                    }
                    pushTokenManager = this;
                    return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushTokenManager = (PushTokenManager) pushTokenManager$retrievePushToken$1.L$0;
                ResultKt.throwOnFailure(obj);
                registerResult = (IPushRegistrator.RegisterResult) obj;
                if (registerResult.getStatus().getValue() != SubscriptionStatus.SUBSCRIBED.getValue()) {
                    pushTokenManager.pushTokenStatus = registerResult.getStatus();
                } else if (registerResult.getStatus().getValue() < SubscriptionStatus.SUBSCRIBED.getValue()) {
                    if (pushTokenManager.pushToken == null && (pushTokenManager.pushTokenStatus == SubscriptionStatus.NO_PERMISSION || pushTokenManager.pushStatusRuntimeError(pushTokenManager.pushTokenStatus))) {
                        pushTokenManager.pushTokenStatus = registerResult.getStatus();
                    }
                } else if (pushTokenManager.pushStatusRuntimeError(pushTokenManager.pushTokenStatus)) {
                    pushTokenManager.pushTokenStatus = registerResult.getStatus();
                }
                pushTokenManager.pushToken = registerResult.getId();
                return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
            }
        }
        pushTokenManager$retrievePushToken$1 = new PushTokenManager$retrievePushToken$1(this, continuation);
        Object obj2 = pushTokenManager$retrievePushToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pushTokenManager$retrievePushToken$1.label;
        if (i != 0) {
        }
        registerResult = (IPushRegistrator.RegisterResult) obj2;
        if (registerResult.getStatus().getValue() != SubscriptionStatus.SUBSCRIBED.getValue()) {
        }
        pushTokenManager.pushToken = registerResult.getId();
        return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
    }

    private final boolean pushStatusRuntimeError(SubscriptionStatus status) {
        return status.getValue() < -6;
    }
}
