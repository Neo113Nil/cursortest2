package C;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(int i3) {
        return new AudioFocusRequest.Builder(i3);
    }

    public static /* synthetic */ Locale.LanguageRange q(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void s() {
    }
}
