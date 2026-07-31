package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

/* loaded from: classes12.dex */
public class NotificationChannelGroupCompat {

    public static class Builder {
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static NotificationChannelGroup createNotificationChannelGroup(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @DoNotInline
        static String getId(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @DoNotInline
        static CharSequence getName(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }

        @DoNotInline
        static List<NotificationChannel> getChannels(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @DoNotInline
        static String getGroup(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static boolean isBlocked(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        @DoNotInline
        static String getDescription(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        @DoNotInline
        static void setDescription(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }
}
