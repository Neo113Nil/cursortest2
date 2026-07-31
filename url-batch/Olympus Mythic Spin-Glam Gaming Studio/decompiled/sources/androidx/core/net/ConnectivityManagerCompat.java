package androidx.core.net;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes12.dex */
public final class ConnectivityManagerCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface RestrictBackgroundStatus {
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static int getRestrictBackgroundStatus(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }
}
