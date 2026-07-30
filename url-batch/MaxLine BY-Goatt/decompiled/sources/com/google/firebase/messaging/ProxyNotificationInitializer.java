package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import defpackage.jt2;
import defpackage.kt2;
import defpackage.mi2;
import defpackage.th;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ProxyNotificationInitializer {
    private static final String MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    private static boolean allowedToUse(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void initialize(Context context) {
        if (ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            return;
        }
        setEnableProxyNotification(new th(1), context, shouldEnableProxyNotification(context));
    }

    public static boolean isProxyNotificationEnabled(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (!Log.isLoggable(Constants.TAG, 3)) {
                    return true;
                }
                Log.d(Constants.TAG, "GMS core is set for proxying");
                return true;
            }
        } else if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Platform doesn't support proxying.");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setEnableProxyNotification$0(Context context, boolean z, kt2 kt2Var) {
        try {
            if (!allowedToUse(context)) {
                Log.e(Constants.TAG, "error configuring notification delegate for package " + context.getPackageName());
            } else {
                ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            kt2Var.c(null);
        }
    }

    public static jt2 setEnableProxyNotification(Executor executor, final Context context, final boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return mi2.j(null);
        }
        final kt2 kt2Var = new kt2();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.f
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.lambda$setEnableProxyNotification$0(context, z, kt2Var);
            }
        });
        return kt2Var.a;
    }

    private static boolean shouldEnableProxyNotification(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(MANIFEST_METADATA_NOTIFICATION_DELEGATION_ENABLED);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
