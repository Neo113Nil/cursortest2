package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.app.Notification;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class f extends a {
    public f(NotificationCompat.Builder builder, int i8, String str) {
        super(builder, i8, str);
    }

    @Override // com.crrepa.band.my.device.pushmessage.notification.notification.a
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public Notification build() {
        super.build();
        return super.notificationNotify();
    }
}
