package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi
@RestrictTo
/* loaded from: classes3.dex */
class NotificationApiHelperForO {
    static boolean isChannelEnabled(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance == 0) {
                return false;
            }
        }
        return true;
    }

    static Notification copyNotificationOntoChannel(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        NotificationChannel notificationChannel;
        int importance;
        notificationManager.createNotificationChannel(NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(str, str2, 3));
        notificationChannel = notificationManager.getNotificationChannel(str);
        importance = notificationChannel.getImportance();
        if (importance == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }
}
