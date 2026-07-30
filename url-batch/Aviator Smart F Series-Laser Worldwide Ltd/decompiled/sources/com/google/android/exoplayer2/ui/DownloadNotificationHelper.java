package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    @RequiresApi(31)
    private static final class Api31 {
        private Api31() {
        }

        @DoNotInline
        @SuppressLint({"WrongConstant"})
        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, @DrawableRes int i8, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i9) {
        return buildNotification(context, i8, pendingIntent, str, i9, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, @DrawableRes int i8, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i9, int i10, int i11, boolean z7, boolean z8, boolean z9) {
        this.notificationBuilder.setSmallIcon(i8);
        this.notificationBuilder.setContentTitle(i9 == 0 ? null : context.getResources().getString(i9));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i10, i11, z7);
        this.notificationBuilder.setOngoing(z8);
        this.notificationBuilder.setShowWhen(z9);
        if (Util.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i8, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i8, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int i8, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i8, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, @DrawableRes int i8, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list) {
        return buildProgressNotification(context, i8, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Notification buildProgressNotification(Context context, @DrawableRes int i8, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list, int i9) {
        boolean z7;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        float f8 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = true;
        for (int i15 = 0; i15 < list.size(); i15++) {
            Download download = list.get(i15);
            int i16 = download.state;
            if (i16 != 0) {
                if (i16 != 2) {
                    if (i16 == 5) {
                        z13 = true;
                    } else if (i16 != 7) {
                    }
                }
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f8 += percentDownloaded;
                    z14 = false;
                }
                z12 |= download.getBytesDownloaded() > 0;
                i14++;
                z10 = true;
            } else {
                z11 = true;
            }
        }
        if (!z10) {
            if (z11 && i9 != 0) {
                i10 = (i9 & 2) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi : (i9 & 1) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network : com.google.android.exoplayer2.core.R.string.exo_download_paused;
                z7 = false;
            } else if (z13) {
                i11 = com.google.android.exoplayer2.core.R.string.exo_download_removing;
            } else {
                z7 = true;
                i10 = 0;
            }
            if (z7) {
                i12 = 0;
                i13 = 0;
                z8 = false;
            } else if (z10) {
                int i17 = (int) (f8 / i14);
                if (z14 && z12) {
                    z9 = true;
                }
                i13 = i17;
                z8 = z9;
                i12 = 100;
            } else {
                i12 = 100;
                i13 = 0;
                z8 = true;
            }
            return buildNotification(context, i8, pendingIntent, str, i10, i12, i13, z8, true, false);
        }
        i11 = com.google.android.exoplayer2.core.R.string.exo_download_downloading;
        i10 = i11;
        z7 = true;
        if (z7) {
        }
        return buildNotification(context, i8, pendingIntent, str, i10, i12, i13, z8, true, false);
    }
}
