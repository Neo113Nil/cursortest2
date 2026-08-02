package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzfvj;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzu.zzp();
        map.put("device", zzt.zzr());
        map.put("app", this.zzb);
        zzu.zzp();
        map.put("is_lite_sdk", true != zzt.zzE(this.zza) ? "0" : "1");
        zzbbn zzbbnVar = zzbbw.zza;
        List zzb = zzba.zza().zzb();
        if (((Boolean) zzba.zzc().zza(zzbbw.zzgj)).booleanValue()) {
            zzb.addAll(zzu.zzo().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zza(zzbbw.zzku)).booleanValue()) {
            zzu.zzp();
            map.put("is_bstar", true == zzt.zzB(this.zza) ? "1" : "0");
        }
        if (((Boolean) zzba.zzc().zza(zzbbw.zziA)).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbbw.zzbZ)).booleanValue()) {
                map.put("plugin", zzfvj.zzc(zzu.zzo().zzn()));
            }
        }
    }
}
