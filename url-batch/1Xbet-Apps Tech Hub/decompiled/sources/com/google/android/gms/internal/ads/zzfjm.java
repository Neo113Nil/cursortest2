package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfjm {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfjm(Context context, zzcbt zzcbtVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzcbtVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzD(this.zza) ? "0" : "1");
        zzbcu zzbcuVar = zzbdc.zza;
        List zzb = com.google.android.gms.ads.internal.client.zzba.zza().zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgT)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkx)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzA(this.zza) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjj)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzca)).booleanValue()) {
                map.put("plugin", zzfun.zzc(com.google.android.gms.ads.internal.zzt.zzo().zzn()));
            }
        }
    }
}
