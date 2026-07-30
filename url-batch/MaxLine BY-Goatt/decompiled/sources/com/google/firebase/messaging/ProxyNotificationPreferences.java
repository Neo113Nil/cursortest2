package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import defpackage.ev1;
import defpackage.th;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z;
    }

    public static void setProxyNotificationsInitialized(Context context, boolean z) {
        SharedPreferences.Editor edit = getPreference(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }

    public static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z) {
        if (Build.VERSION.SDK_INT < 29 || isProxyNotificationRetentionSet(getPreference(context), z)) {
            return;
        }
        gmsRpc.setRetainProxiedNotifications(z).e(new th(1), new ev1() { // from class: com.google.firebase.messaging.g
            @Override // defpackage.ev1
            public final void onSuccess(Object obj) {
                ProxyNotificationPreferences.setProxyRetentionPreferences(context, z);
            }
        });
    }

    public static void setProxyRetentionPreferences(Context context, boolean z) {
        SharedPreferences.Editor edit = getPreference(context).edit();
        edit.putBoolean("proxy_retention", z);
        edit.apply();
    }
}
