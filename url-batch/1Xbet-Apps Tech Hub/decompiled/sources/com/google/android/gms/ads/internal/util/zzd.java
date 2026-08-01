package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzccd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = zzcbm.zza;
        if (((Boolean) zzber.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || zzcbm.zzl()) {
                    return;
                }
                ListenableFuture zzb = new zzc(context).zzb();
                zzcbn.zzi("Updating ad debug logging enablement.");
                zzccd.zza(zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                zzcbn.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
