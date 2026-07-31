package P2;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel e(String str, int i7, String str2) {
        return new NotificationChannel(str, str2, i7);
    }

    public static /* synthetic */ NotificationChannelGroup f(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ Locale.LanguageRange p(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void r() {
    }
}
