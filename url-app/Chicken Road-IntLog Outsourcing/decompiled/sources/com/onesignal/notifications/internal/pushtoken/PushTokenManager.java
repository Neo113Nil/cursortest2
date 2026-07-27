package com.onesignal.notifications.internal.pushtoken;

import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import e5.g;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class PushTokenManager implements IPushTokenManager {
    private final IDeviceService _deviceService;
    private final IPushRegistrator _pushRegistrator;
    private String pushToken;
    private SubscriptionStatus pushTokenStatus;

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
        i.e(_pushRegistrator, "_pushRegistrator");
        i.e(_deviceService, "_deviceService");
        this._pushRegistrator = _pushRegistrator;
        this._deviceService = _deviceService;
        this.pushTokenStatus = SubscriptionStatus.NO_PERMISSION;
    }

    private final boolean pushStatusRuntimeError(SubscriptionStatus subscriptionStatus) {
        return subscriptionStatus.getValue() < -6;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final SubscriptionStatus getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.pushtoken.IPushTokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(InterfaceC1218d interfaceC1218d) {
        PushTokenManager$retrievePushToken$1 pushTokenManager$retrievePushToken$1;
        int i2;
        PushTokenManager pushTokenManager;
        int value;
        SubscriptionStatus subscriptionStatus;
        SubscriptionStatus subscriptionStatus2;
        if (interfaceC1218d instanceof PushTokenManager$retrievePushToken$1) {
            pushTokenManager$retrievePushToken$1 = (PushTokenManager$retrievePushToken$1) interfaceC1218d;
            int i3 = pushTokenManager$retrievePushToken$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pushTokenManager$retrievePushToken$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pushTokenManager$retrievePushToken$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = pushTokenManager$retrievePushToken$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    int i6 = WhenMappings.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i6 == 1) {
                        Logging.info$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = SubscriptionStatus.MISSING_JETPACK_LIBRARY;
                    } else if (i6 != 2) {
                        IPushRegistrator iPushRegistrator = this._pushRegistrator;
                        pushTokenManager$retrievePushToken$1.L$0 = this;
                        pushTokenManager$retrievePushToken$1.label = 1;
                        obj = iPushRegistrator.registerForPush(pushTokenManager$retrievePushToken$1);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        pushTokenManager = this;
                    } else {
                        Logging.info$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = SubscriptionStatus.OUTDATED_JETPACK_LIBRARY;
                    }
                    pushTokenManager = this;
                    return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pushTokenManager = (PushTokenManager) pushTokenManager$retrievePushToken$1.L$0;
                g.y(obj);
                IPushRegistrator.RegisterResult registerResult = (IPushRegistrator.RegisterResult) obj;
                value = registerResult.getStatus().getValue();
                subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
                if (value != subscriptionStatus.getValue()) {
                    pushTokenManager.pushTokenStatus = registerResult.getStatus();
                } else if (registerResult.getStatus().getValue() < subscriptionStatus.getValue()) {
                    if (pushTokenManager.pushToken == null && ((subscriptionStatus2 = pushTokenManager.pushTokenStatus) == SubscriptionStatus.NO_PERMISSION || pushTokenManager.pushStatusRuntimeError(subscriptionStatus2))) {
                        pushTokenManager.pushTokenStatus = registerResult.getStatus();
                    }
                } else if (pushTokenManager.pushStatusRuntimeError(pushTokenManager.pushTokenStatus)) {
                    pushTokenManager.pushTokenStatus = registerResult.getStatus();
                }
                pushTokenManager.pushToken = registerResult.getId();
                return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
            }
        }
        pushTokenManager$retrievePushToken$1 = new PushTokenManager$retrievePushToken$1(this, interfaceC1218d);
        Object obj2 = pushTokenManager$retrievePushToken$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = pushTokenManager$retrievePushToken$1.label;
        if (i2 != 0) {
        }
        IPushRegistrator.RegisterResult registerResult2 = (IPushRegistrator.RegisterResult) obj2;
        value = registerResult2.getStatus().getValue();
        subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
        if (value != subscriptionStatus.getValue()) {
        }
        pushTokenManager.pushToken = registerResult2.getId();
        return new PushTokenResponse(pushTokenManager.pushToken, pushTokenManager.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(SubscriptionStatus subscriptionStatus) {
        i.e(subscriptionStatus, "<set-?>");
        this.pushTokenStatus = subscriptionStatus;
    }
}
