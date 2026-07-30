package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresPermission;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.blankj.utilcode.util.z0;

/* loaded from: classes2.dex */
public class h0 {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    public static class a {
        public static final a DEFAULT_CHANNEL_CONFIG = new a(z0.getApp().getPackageName(), z0.getApp().getPackageName(), 3);
        private NotificationChannel mNotificationChannel;

        public a(String str, CharSequence charSequence, int i8) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel = x.a(str, charSequence, i8);
            }
        }

        public NotificationChannel getNotificationChannel() {
            return this.mNotificationChannel;
        }

        public a setBypassDnd(boolean z7) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setBypassDnd(z7);
            }
            return this;
        }

        public a setDescription(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setDescription(str);
            }
            return this;
        }

        public a setGroup(String str) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setGroup(str);
            }
            return this;
        }

        public a setImportance(int i8) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setImportance(i8);
            }
            return this;
        }

        public a setLightColor(int i8) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setLightColor(i8);
            }
            return this;
        }

        public a setLockscreenVisibility(int i8) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setLockscreenVisibility(i8);
            }
            return this;
        }

        public a setName(CharSequence charSequence) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setName(charSequence);
            }
            return this;
        }

        public a setShowBadge(boolean z7) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setShowBadge(z7);
            }
            return this;
        }

        public a setSound(Uri uri, AudioAttributes audioAttributes) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setSound(uri, audioAttributes);
            }
            return this;
        }

        public a setVibrationPattern(long[] jArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mNotificationChannel.setVibrationPattern(jArr);
            }
            return this;
        }
    }

    public static boolean areNotificationsEnabled() {
        return NotificationManagerCompat.from(z0.getApp()).areNotificationsEnabled();
    }

    public static void cancel(String str, int i8) {
        NotificationManagerCompat.from(z0.getApp()).cancel(str, i8);
    }

    public static void cancelAll() {
        NotificationManagerCompat.from(z0.getApp()).cancelAll();
    }

    public static Notification getNotification(a aVar, z0.b bVar) {
        String id;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            ((NotificationManager) z0.getApp().getSystemService("notification")).createNotificationChannel(aVar.getNotificationChannel());
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(z0.getApp());
        if (i8 >= 26) {
            id = aVar.mNotificationChannel.getId();
            builder.setChannelId(id);
        }
        if (bVar != null) {
            bVar.accept(builder);
        }
        return builder.build();
    }

    private static void invokePanels(String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(z0.getApp().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void notify(int i8, z0.b bVar) {
        notify(null, i8, a.DEFAULT_CHANNEL_CONFIG, bVar);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z7) {
        invokePanels(z7 ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static void cancel(int i8) {
        NotificationManagerCompat.from(z0.getApp()).cancel(i8);
    }

    public static void notify(String str, int i8, z0.b bVar) {
        notify(str, i8, a.DEFAULT_CHANNEL_CONFIG, bVar);
    }

    public static void notify(int i8, a aVar, z0.b bVar) {
        notify(null, i8, aVar, bVar);
    }

    public static void notify(String str, int i8, a aVar, z0.b bVar) {
        NotificationManagerCompat.from(z0.getApp()).notify(str, i8, getNotification(aVar, bVar));
    }
}
