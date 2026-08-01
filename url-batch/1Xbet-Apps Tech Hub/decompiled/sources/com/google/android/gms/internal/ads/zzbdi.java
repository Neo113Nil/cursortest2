package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbdi {
    private final String zza = (String) zzbep.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbdi(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzD(context) ? "0" : "1");
        Future zzb = com.google.android.gms.ads.internal.zzt.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbwf) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbwf) zzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkx)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzA(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjj)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzca)).booleanValue() || zzfun.zzd(com.google.android.gms.ads.internal.zzt.zzo().zzn())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzt.zzo().zzn());
        }
    }

    final Context zza() {
        return this.zzc;
    }

    final String zzb() {
        return this.zzd;
    }

    final String zzc() {
        return this.zza;
    }

    final Map zzd() {
        return this.zzb;
    }
}
