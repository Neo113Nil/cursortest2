package io.flutter.view;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* synthetic */ NotificationChannel c(int i2, String str, String str2) {
        return new NotificationChannel(str, str2, i2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel e(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel f(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannelGroup g(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ NotificationChannel z() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
