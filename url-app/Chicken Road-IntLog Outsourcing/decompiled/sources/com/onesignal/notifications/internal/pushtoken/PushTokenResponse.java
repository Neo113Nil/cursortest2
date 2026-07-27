package com.onesignal.notifications.internal.pushtoken;

import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PushTokenResponse {
    private final SubscriptionStatus status;
    private final String token;

    public PushTokenResponse(String str, SubscriptionStatus status) {
        i.e(status, "status");
        this.token = str;
        this.status = status;
    }

    public final SubscriptionStatus getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
