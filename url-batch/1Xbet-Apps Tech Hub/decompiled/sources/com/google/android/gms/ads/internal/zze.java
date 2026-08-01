package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzccd;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfkk;
import com.google.android.gms.internal.ads.zzgai;
import com.google.android.gms.internal.ads.zzgbb;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcbt zzcbtVar, String str, Runnable runnable, zzfkk zzfkkVar) {
        zzb(context, zzcbtVar, true, null, str, null, runnable, zzfkkVar);
    }

    final void zzb(Context context, zzcbt zzcbtVar, boolean z, zzcaq zzcaqVar, String str, String str2, Runnable runnable, final zzfkk zzfkkVar) {
        PackageInfo packageInfo;
        if (zzt.zzB().elapsedRealtime() - this.zzb < 5000) {
            zzcbn.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzB().elapsedRealtime();
        if (zzcaqVar != null && !TextUtils.isEmpty(zzcaqVar.zzc())) {
            if (zzt.zzB().currentTimeMillis() - zzcaqVar.zza() <= ((Long) zzba.zzc().zza(zzbdc.zzdV)).longValue() && zzcaqVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            zzcbn.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcbn.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfjw zza = zzfjv.zza(context, 4);
        zza.zzh();
        zzbok zza2 = zzt.zzf().zza(this.zza, zzcbtVar, zzfkkVar).zza("google.afma.config.fetchAppSettings", zzbor.zza, zzbor.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbcu zzbcuVar = zzbdc.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject.put("js", zzcbtVar.zza);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture zzb = zza2.zzb(jSONObject);
            ListenableFuture zzn = zzgbb.zzn(zzb, new zzgai() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    boolean optBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (optBoolean) {
                        zzt.zzo().zzi().zzu(jSONObject2.getString("appSettingsJson"));
                    }
                    zzfjw zzfjwVar = zza;
                    zzfkk zzfkkVar2 = zzfkk.this;
                    zzfjwVar.zzf(optBoolean);
                    zzfkkVar2.zzb(zzfjwVar.zzl());
                    return zzgbb.zzh(null);
                }
            }, zzcca.zzf);
            if (runnable != null) {
                zzb.addListener(runnable, zzcca.zzf);
            }
            zzccd.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e) {
            zzcbn.zzh("Error requesting application settings", e);
            zza.zzg(e);
            zza.zzf(false);
            zzfkkVar.zzb(zza.zzl());
        }
    }

    public final void zzc(Context context, zzcbt zzcbtVar, String str, zzcaq zzcaqVar, zzfkk zzfkkVar) {
        zzb(context, zzcbtVar, false, zzcaqVar, zzcaqVar != null ? zzcaqVar.zzb() : null, str, null, zzfkkVar);
    }
}
