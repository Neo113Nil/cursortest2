package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzffl {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzcbn.zzi("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        zzcbn.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzcbg.zzy(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zzcbn.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(th, str);
    }
}
