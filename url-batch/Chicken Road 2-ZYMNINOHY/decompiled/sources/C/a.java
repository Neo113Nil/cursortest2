package C;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder h(int i4) {
        return new AudioFocusRequest.Builder(i4);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest n(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void s() {
    }
}
