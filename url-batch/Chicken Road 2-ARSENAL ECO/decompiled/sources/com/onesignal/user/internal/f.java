package com.onesignal.user.internal;

/* loaded from: classes.dex */
public abstract class f {
    public static final boolean switchUserIv(l userSwitcher, w3.e subscriptionModelStore, com.onesignal.core.internal.config.b configModel, boolean z5) {
        w3.d dVar;
        kotlin.jvm.internal.i.e(userSwitcher, "userSwitcher");
        kotlin.jvm.internal.i.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.i.e(configModel, "configModel");
        if (!z5) {
            return false;
        }
        String pushSubscriptionId = configModel.getPushSubscriptionId();
        if (pushSubscriptionId != null && (dVar = (w3.d) subscriptionModelStore.get(pushSubscriptionId)) != null) {
            dVar.setDisabledInternally(true);
        }
        l.createAndSwitchToNewUser$default(userSwitcher, true, null, 2, null);
        return true;
    }
}
