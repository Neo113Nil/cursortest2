package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdxt {
    private final ConcurrentHashMap zza;
    private final zzcdz zzb;
    private final zzfjk zzc;
    private final String zzd;
    private final String zze;
    private final zzazh zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdxt(Context context, zzdye zzdyeVar, zzcdz zzcdzVar, zzfjk zzfjkVar, String str, String str2, zzazh zzazhVar) {
        ActivityManager.MemoryInfo zze;
        ConcurrentHashMap zzd = zzdyeVar.zzd();
        this.zza = zzd;
        this.zzb = zzcdzVar;
        this.zzc = zzfjkVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzazhVar;
        this.zzh = context;
        zzd.put(FirebaseAnalytics.Param.AD_FORMAT, str2.toUpperCase(Locale.ROOT));
        zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcS)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(zze.availMem));
                zzd("mem_tt", String.valueOf(zze.totalMem));
                zzd("low_m", true != zze.lowMemory ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcU)).booleanValue()) {
            zzd("ad_unit_id", zzfjkVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
            if (zzg == 0) {
                zzd.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzd.put("scar", "false");
                return;
            }
            if (zzg == 1) {
                zzd.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzd.put("se", "query_g");
            } else if (zzg == 2) {
                zzd.put("se", "r_adinfo");
            } else if (zzg != 3) {
                zzd.put("se", "r_both");
            } else {
                zzd.put("se", "r_adstring");
            }
            zzd.put("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            zzd("ragent", zzfjkVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd)));
        }
    }

    public final void zza(zzfjc zzfjcVar) {
        zzfjb zzfjbVar = zzfjcVar.zzb;
        List list = zzfjbVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfir) list.get(0)).zzb;
            zzd(FirebaseAnalytics.Param.AD_FORMAT, zzfir.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfjbVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Bundle zze() {
        return this.zzg;
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoL)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkX)).booleanValue()) {
            zzazc zzb = this.zzf.zzb();
            if (zzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzb).zzc());
            } else if (zzb instanceof zzclz) {
                this.zza.put("asv", ((zzclz) zzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
