package androidx.core.app;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes11.dex */
public class NotificationChannelCompat {

    public static class Builder {
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static NotificationChannel createNotificationChannel(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        @DoNotInline
        static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @DoNotInline
        static int getImportance(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @DoNotInline
        static CharSequence getName(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @DoNotInline
        static String getDescription(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @DoNotInline
        static void setDescription(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @DoNotInline
        static String getGroup(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @DoNotInline
        static void setGroup(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @DoNotInline
        static boolean canShowBadge(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @DoNotInline
        static void setShowBadge(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        @DoNotInline
        static Uri getSound(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @DoNotInline
        static void setSound(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @DoNotInline
        static AudioAttributes getAudioAttributes(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @DoNotInline
        static boolean shouldShowLights(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @DoNotInline
        static void enableLights(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        @DoNotInline
        static int getLightColor(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @DoNotInline
        static void setLightColor(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        @DoNotInline
        static boolean shouldVibrate(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }

        @DoNotInline
        static void enableVibration(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        @DoNotInline
        static long[] getVibrationPattern(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @DoNotInline
        static void setVibrationPattern(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @DoNotInline
        static boolean canBypassDnd(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @DoNotInline
        static int getLockscreenVisibility(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static boolean canBubble(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    @RequiresApi
    static class Api30Impl {
        @DoNotInline
        static String getParentChannelId(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        @DoNotInline
        static String getConversationId(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        @DoNotInline
        static void setConversationId(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }

        @DoNotInline
        static boolean isImportantConversation(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }
    }
}
