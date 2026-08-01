package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zze extends zzcbn {
    public static void zza(String str) {
        if (zzc()) {
            if (str == null || str.length() <= 4000) {
                Log.v(AdRequest.LOGTAG, str);
                return;
            }
            boolean z = true;
            for (String str2 : zza.zzd(str)) {
                if (z) {
                    Log.v(AdRequest.LOGTAG, str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzc() {
        return zzm(2) && ((Boolean) zzbey.zza.zze()).booleanValue();
    }
}
