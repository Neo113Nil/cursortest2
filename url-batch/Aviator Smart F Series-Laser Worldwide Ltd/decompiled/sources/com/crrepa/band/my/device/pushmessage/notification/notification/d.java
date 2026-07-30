package com.crrepa.band.my.device.pushmessage.notification.notification;

import android.app.Notification;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;

/* loaded from: classes2.dex */
public class d extends a {
    public d(NotificationCompat.Builder builder, int i8, String str) {
        super(builder, i8, str);
    }

    @Override // com.crrepa.band.my.device.pushmessage.notification.notification.a
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public Notification build() {
        super.build();
        return super.notificationNotify();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public d update(int i8, int i9, int i10, boolean z7) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(e.mSingleton.mContext);
        builder.setProgress(i10, i9, z7);
        this.notification = builder.build();
        notificationNotify(i8);
        return this;
    }

    public d value(int i8, int i9, boolean z7) {
        this.builder.setProgress(i9, i8, z7);
        return this;
    }
}
