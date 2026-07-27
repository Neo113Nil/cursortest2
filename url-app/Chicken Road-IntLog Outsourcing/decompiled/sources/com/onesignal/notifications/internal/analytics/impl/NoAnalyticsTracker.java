package com.onesignal.notifications.internal.analytics.impl;

import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NoAnalyticsTracker implements IAnalyticsTracker {
    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackInfluenceOpenEvent() {
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackOpenedEvent(String notificationId, String campaign) {
        i.e(notificationId, "notificationId");
        i.e(campaign, "campaign");
    }

    @Override // com.onesignal.notifications.internal.analytics.IAnalyticsTracker
    public void trackReceivedEvent(String notificationId, String campaign) {
        i.e(notificationId, "notificationId");
        i.e(campaign, "campaign");
    }
}
