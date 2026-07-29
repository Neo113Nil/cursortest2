package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;

/* loaded from: classes2.dex */
public final class zzct {
    static Object lock = new Object();
    static WakeLock zzabg;
    private static Boolean zzqo;

    public static void onReceive(Context context, Intent intent) {
        zzcm zzbu = zzat.zzc(context).zzbu();
        if (intent == null) {
            zzbu.zzt("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzbu.zza("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zze = zzcu.zze(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (lock) {
                context.startService(intent2);
                if (zze) {
                    try {
                        if (zzabg == null) {
                            WakeLock wakeLock = new WakeLock(context, 1, "Analytics WakeLock");
                            zzabg = wakeLock;
                            wakeLock.setReferenceCounted(false);
                        }
                        zzabg.acquire(1000L);
                    } catch (SecurityException unused) {
                        zzbu.zzt("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }

    public static boolean zza(Context context) {
        Preconditions.checkNotNull(context);
        if (zzqo != null) {
            return zzqo.booleanValue();
        }
        boolean zza = zzdd.zza(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzqo = Boolean.valueOf(zza);
        return zza;
    }
}
