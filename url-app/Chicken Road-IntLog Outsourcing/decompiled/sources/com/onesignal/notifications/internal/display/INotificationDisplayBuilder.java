package com.onesignal.notifications.internal.display;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.display.impl.IntentGeneratorForAttachingToNotifications;
import com.onesignal.notifications.internal.display.impl.NotificationDisplayBuilder;
import org.json.JSONObject;
import u.p;

/* loaded from: classes.dex */
public interface INotificationDisplayBuilder {
    void addNotificationActionButtons(JSONObject jSONObject, IntentGeneratorForAttachingToNotifications intentGeneratorForAttachingToNotifications, p pVar, int i2, String str);

    void addXiaomiSettings(NotificationDisplayBuilder.OneSignalNotificationBuilder oneSignalNotificationBuilder, Notification notification);

    NotificationDisplayBuilder.OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(NotificationGenerationJob notificationGenerationJob);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i2);

    PendingIntent getNewDismissActionPendingIntent(int i2, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(p pVar);
}
