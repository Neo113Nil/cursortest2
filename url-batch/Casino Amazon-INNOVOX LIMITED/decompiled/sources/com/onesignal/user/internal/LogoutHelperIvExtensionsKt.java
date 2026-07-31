package com.onesignal.user.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogoutHelperIvExtensions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"switchUserIv", "", "userSwitcher", "Lcom/onesignal/user/internal/UserSwitcher;", "subscriptionModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "configModel", "Lcom/onesignal/core/internal/config/ConfigModel;", "ivBehaviorActive", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogoutHelperIvExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean switchUserIv(UserSwitcher userSwitcher, SubscriptionModelStore subscriptionModelStore, ConfigModel configModel, boolean z) {
        SubscriptionModel subscriptionModel;
        Intrinsics.checkNotNullParameter(userSwitcher, "userSwitcher");
        Intrinsics.checkNotNullParameter(subscriptionModelStore, "subscriptionModelStore");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
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
