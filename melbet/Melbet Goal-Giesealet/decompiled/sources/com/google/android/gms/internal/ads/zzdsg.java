package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.hermes.intl.Constants;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdsg {
    private final ConcurrentHashMap zza;
    private final zzbyz zzb;
    private final zzfdc zzc;
    private final String zzd;
    private final String zze;
    private final zzauu zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdsg(Context context, zzdsr zzdsrVar, zzbyz zzbyzVar, zzfdc zzfdcVar, String str, String str2, zzauu zzauuVar) {
        ActivityManager.MemoryInfo zze;
        ConcurrentHashMap zzd = zzdsrVar.zzd();
        this.zza = zzd;
        this.zzb = zzbyzVar;
        this.zzc = zzfdcVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzauuVar;
        this.zzh = context;
        zzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkp)).booleanValue()) {
            zzaup zzb = zzauuVar.zzb();
            if (zzb instanceof com.google.android.gms.ads.internal.zzk) {
                zzd.put("asv", ((com.google.android.gms.ads.internal.zzk) zzb).zzc());
            } else if (zzb instanceof zzcgu) {
                zzd.put("asv", ((zzcgu) zzb).zza());
            } else {
                zzd.put("asv", "NA");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcr)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcz)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(zze.availMem));
                zzd("mem_tt", String.valueOf(zze.totalMem));
                zzd("low_m", true != zze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcB)).booleanValue()) {
            zzd("ad_unit_id", zzfdcVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhq)).booleanValue()) {
            int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfdcVar) - 1;
            if (zzg == 0) {
                zzd.put("request_id", str);
                zzd.put("scar", Constants.CASEFIRST_FALSE);
                return;
            }
            if (zzg == 1) {
                zzd.put("request_id", str);
                zzd.put("se", "query_g");
            } else if (zzg == 2) {
                zzd.put("se", "r_adinfo");
            } else if (zzg != 3) {
                zzd.put("se", "r_both");
            } else {
                zzd.put("se", "r_adstring");
            }
            zzd.put("scar", "true");
            zzd("ragent", zzfdcVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfdcVar.zzd)));
        }
    }

    public final void zza(zzfcu zzfcuVar) {
        zzfct zzfctVar = zzfcuVar.zzb;
        List list = zzfctVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfcj) list.get(0)).zzb;
            zzd("ad_format", zzfcj.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfctVar.zzb.zzb);
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzod)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }
}
