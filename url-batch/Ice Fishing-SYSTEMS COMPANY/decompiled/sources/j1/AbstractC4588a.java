package j1;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.media.AudioFocusRequest;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4588a {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannelGroup d(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder e() {
        return new AudioFocusRequest.Builder(2);
    }

    public static /* synthetic */ NotificationChannel w() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
