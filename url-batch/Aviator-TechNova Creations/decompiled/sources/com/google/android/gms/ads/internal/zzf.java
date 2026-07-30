package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdxz zzdxzVar, zzfoe zzfoeVar, zzfor zzforVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdxzVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(optString)) {
            zzfoeVar.zzk(optString);
        }
        zzfoeVar.zzd(optBoolean);
        zzforVar.zzb(zzfoeVar.zzm());
        return zzgzo.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdxz zzdxzVar, String str, long j) {
        if (zzdxzVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoe)).booleanValue()) {
                zzdxy zza = zzdxzVar.zza();
                zza.zzc("action", "lat_init");
                zza.zzc(str, Long.toString(j));
                zza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfor zzforVar, zzdxz zzdxzVar, Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzforVar, zzdxzVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcdp zzcdpVar, zzfor zzforVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzcdpVar, zzcdpVar != null ? zzcdpVar.zze() : null, str, null, zzforVar, null, null, z);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcdp zzcdpVar, String str, String str2, Runnable runnable, final zzfor zzforVar, final zzdxz zzdxzVar, final Long l, boolean z2) {
        zzfoe zzfoeVar;
        Exception exc;
        ListenableFuture zzb;
        zzgyw zzgywVar;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcdpVar != null && !TextUtils.isEmpty(zzcdpVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcdpVar.zzb() <= ((Long) zzbd.zzc().zzd(zzbhe.zzfa)).longValue() && zzcdpVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfoe zzn = zzfoe.zzn(context, 4);
        zzn.zza();
        zzbsz zzb2 = zzt.zzr().zzb(this.zza, versionInfoParcel, zzforVar);
        zzbst zzbstVar = zzbsw.zza;
        zzbsp zza = zzb2.zza("google.afma.config.fetchAppSettings", zzbstVar, zzbstVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbgv zzbgvVar = zzbhe.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkW)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzb = zza.zzb(jSONObject);
                try {
                    zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzf.zzd(l, zzdxzVar, zzn, zzforVar, (JSONObject) obj);
                        }
                    };
                    zzfoeVar = zzn;
                } catch (Exception e) {
                    e = e;
                    zzfoeVar = zzn;
                }
            } catch (Exception e2) {
                exc = e2;
                zzfoeVar = zzn;
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfoeVar.zzj(exc);
                zzfoeVar.zzd(false);
                zzforVar.zzb(zzfoeVar.zzm());
            }
        } catch (Exception e3) {
            e = e3;
            zzfoeVar = zzn;
        }
        try {
            zzgzy zzgzyVar = zzcei.zzg;
            ListenableFuture zzj = zzgzo.zzj(zzb, zzgywVar, zzgzyVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzgzyVar);
            }
            if (l != null) {
                zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzf.zzf(zzdxzVar, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                    }
                }, zzgzyVar);
            }
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
                zzcel.zzb(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcel.zza(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e4) {
            e = e4;
            exc = e;
            int i42 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
            zzfoeVar.zzj(exc);
            zzfoeVar.zzd(false);
            zzforVar.zzb(zzfoeVar.zzm());
        }
    }
}
