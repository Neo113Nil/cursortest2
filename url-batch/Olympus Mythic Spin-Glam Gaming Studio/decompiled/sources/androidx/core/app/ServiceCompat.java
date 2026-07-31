package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public final class ServiceCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StopForegroundFlags {
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static void stopForeground(Service service, int i) {
            service.stopForeground(i);
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void startForeground(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 255);
            }
        }
    }

    @RequiresApi
    static class Api34Impl {
        @DoNotInline
        static void startForeground(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 1073745919);
            }
        }
    }
}
