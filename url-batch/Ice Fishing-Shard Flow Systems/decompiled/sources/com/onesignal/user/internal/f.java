package com.onesignal.user.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {
    public static final boolean switchUserIv(l userSwitcher, Y3.e subscriptionModelStore, com.onesignal.core.internal.config.b configModel, boolean z7) {
        Y3.d dVar;
        Intrinsics.checkNotNullParameter(userSwitcher, "userSwitcher");
        Intrinsics.checkNotNullParameter(subscriptionModelStore, "subscriptionModelStore");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        if (!z7) {
            return false;
        }
        String pushSubscriptionId = configModel.getPushSubscriptionId();
        if (pushSubscriptionId != null && (dVar = (Y3.d) subscriptionModelStore.get(pushSubscriptionId)) != null) {
            dVar.setDisabledInternally(true);
        }
        l.createAndSwitchToNewUser$default(userSwitcher, true, null, 2, null);
        return true;
    }
}
