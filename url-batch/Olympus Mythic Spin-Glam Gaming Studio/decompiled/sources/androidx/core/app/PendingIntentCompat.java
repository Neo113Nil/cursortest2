package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes13.dex */
public final class PendingIntentCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    public static PendingIntent getActivity(Context context, int i, Intent intent, int i2, boolean z) {
        return PendingIntent.getActivity(context, i, intent, addMutabilityFlags(z, i2));
    }

    private static int addMutabilityFlags(boolean z, int i) {
        int i2;
        if (!z) {
            i2 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i2 = 33554432;
        }
        return i | i2;
    }

    @RequiresApi
    private static class Api23Impl {
        @DoNotInline
        public static void send(@NonNull PendingIntent pendingIntent, @NonNull Context context, int i, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
        }
    }

    @RequiresApi
    private static class Api26Impl {
        @DoNotInline
        public static PendingIntent getForegroundService(Context context, int i, Intent intent, int i2) {
            return PendingIntent.getForegroundService(context, i, intent, i2);
        }
    }

    private static class GatedCallback implements Closeable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete;
        private boolean mSuccess;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }
    }
}
