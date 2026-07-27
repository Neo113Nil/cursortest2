package com.onesignal.user.internal;

import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LogoutHelperIvExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean switchUserIv(UserSwitcher userSwitcher, SubscriptionModelStore subscriptionModelStore, ConfigModel configModel, boolean z) {
        SubscriptionModel subscriptionModel;
        i.e(userSwitcher, "userSwitcher");
        i.e(subscriptionModelStore, "subscriptionModelStore");
        i.e(configModel, "configModel");
        if (!z) {
            return false;
        }
        String pushSubscriptionId = configModel.getPushSubscriptionId();
        if (pushSubscriptionId != null && (subscriptionModel = (SubscriptionModel) subscriptionModelStore.get(pushSubscriptionId)) != null) {
            subscriptionModel.setDisabledInternally(true);
        }
        UserSwitcher.createAndSwitchToNewUser$default(userSwitcher, true, null, 2, null);
        return true;
    }
}
