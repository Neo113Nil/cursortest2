package com.onesignal.notifications.internal.display.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.onesignal.notifications.activities.NotificationOpenedActivity;
import com.onesignal.notifications.activities.NotificationOpenedActivityAndroid22AndOlder;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private final Context context;
    private final Class<?> notificationOpenedClassAndroid22AndOlder;
    private final Class<?> notificationOpenedClassAndroid23Plus;

    public a(Context context) {
        context.getClass();
        this.context = context;
        this.notificationOpenedClassAndroid23Plus = NotificationOpenedActivity.class;
        this.notificationOpenedClassAndroid22AndOlder = NotificationOpenedActivityAndroid22AndOlder.class;
    }

    @hd.a
    private final Intent getNewBaseIntentAndroidAPI22AndOlder() {
        Intent intent = new Intent(this.context, this.notificationOpenedClassAndroid22AndOlder);
        intent.addFlags(403177472);
        return intent;
    }

    private final Intent getNewBaseIntentAndroidAPI23Plus() {
        return new Intent(this.context, this.notificationOpenedClassAndroid23Plus);
    }

    public final Context getContext() {
        return this.context;
    }

    public final PendingIntent getNewActionPendingIntent(int i3, Intent intent) {
        intent.getClass();
        return PendingIntent.getActivity(this.context, i3, intent, 201326592);
    }

    public final Intent getNewBaseIntent(int i3) {
        Intent addFlags = getNewBaseIntentAndroidAPI23Plus().putExtra("androidNotificationId", i3).addFlags(603979776);
        addFlags.getClass();
        return addFlags;
    }
}
