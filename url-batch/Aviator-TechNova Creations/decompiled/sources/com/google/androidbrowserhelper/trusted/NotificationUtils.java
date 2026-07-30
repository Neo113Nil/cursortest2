package com.google.androidbrowserhelper.trusted;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

/* loaded from: classes4.dex */
public class NotificationUtils {
    private NotificationUtils() {
    }

    public static boolean areNotificationsEnabled(Context context, String str) {
        NotificationChannel notificationChannel;
        if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            return Build.VERSION.SDK_INT < 26 || (notificationChannel = NotificationManagerCompat.from(context).getNotificationChannel(channelNameToId(str))) == null || notificationChannel.getImportance() != 0;
        }
        return false;
    }

    public static void createNotificationChannel(Context context, String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManagerCompat.from(context).createNotificationChannel(new NotificationChannel(channelNameToId(str), str, 3));
    }

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }
}
