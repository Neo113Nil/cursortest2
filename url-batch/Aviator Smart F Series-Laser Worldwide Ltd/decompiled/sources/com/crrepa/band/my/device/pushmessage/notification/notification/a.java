package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.app.Notification;
import android.widget.RemoteViews;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

/* loaded from: classes2.dex */
public abstract class a {
    private static final String TAG = "a";
    protected NotificationCompat.Builder builder;
    protected Notification notification;
    protected int notificationId;
    protected String tag;

    public a(NotificationCompat.Builder builder, int i8, String str) {
        this.builder = builder;
        this.notificationId = i8;
        this.tag = str;
    }

    public Notification build() {
        Notification build = this.builder.build();
        this.notification = build;
        return build;
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    protected Notification notificationNotify() {
        String str = this.tag;
        return str != null ? notificationNotify(str, this.notificationId) : notificationNotify(this.notificationId);
    }

    public void setBigContentView(RemoteViews remoteViews) {
        this.notification.bigContentView = remoteViews;
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    protected Notification notificationNotify(int i8) {
        NotificationManagerCompat.from(e.mSingleton.mContext).notify(i8, this.notification);
        return this.notification;
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    protected Notification notificationNotify(String str, int i8) {
        NotificationManagerCompat.from(e.mSingleton.mContext).notify(str, i8, this.notification);
        return this.notification;
    }
}
