package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfkk {
    private final zzdsm zza;
    private final String zzb;

    zzfkk(zzdsm zzdsmVar, Context context) {
        CharSequence charSequence;
        this.zza = zzdsmVar;
        zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
        try {
            charSequence = Wrappers.packageManager(context).getApplicationLabel(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get application name", e);
            charSequence = "";
        }
        this.zzb = charSequence.toString();
    }

    private final void zzq(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdsl zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc("app", this.zzb);
        zza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("pas", Integer.toString(i3));
        zza.zzc("pv", "2");
        zza.zzc("ad_unit_id", str3);
        zza.zzc("pid", str2);
        zza.zzd();
    }

    private final void zzr(String str, String str2, long j, int i, int i2, String str3, zzfkr zzfkrVar, String str4) {
        zzdsl zza = this.zza.zza();
        zza.zzc(str2, Long.toString(j));
        zza.zzc("app", this.zzb);
        if (zzfkrVar != null) {
            zza.zzc("ad_unit_id", zzfkrVar.zza());
            zza.zzc("ad_format", zzfkrVar.zzb());
            zza.zzc("pid", zzfkrVar.zzc());
        }
        zza.zzc("action", str);
        if (str3 != null) {
            zza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zza.zzc("cache_size", Integer.toString(i2));
        }
        zza.zzc("pv", str4);
        zza.zzd();
    }

    public final void zza(int i, long j, zzfkr zzfkrVar, String str) {
        zzdsl zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("app", this.zzb);
        zza.zzc("ad_format", zzfkrVar.zzb());
        zza.zzc("ad_unit_id", zzfkrVar.zza());
        zza.zzc("pid", zzfkrVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdsl zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("app", this.zzb);
        zza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String lowerCase = adFormat.name().toLowerCase(Locale.ENGLISH);
            String.valueOf(lowerCase);
            String valueOf = String.valueOf(lowerCase);
            zza.zzc(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfkr zzfkrVar) {
        zzdsl zza = this.zza.zza();
        zza.zzc("action", "cache_resize");
        zza.zzc("cs_ts", Long.toString(j));
        zza.zzc("app", this.zzb);
        zza.zzc("orig_ma", Integer.toString(i));
        zza.zzc("max_ads", Integer.toString(i2));
        zza.zzc("ad_format", zzfkrVar.zzb());
        zza.zzc("ad_unit_id", zzfkrVar.zza());
        zza.zzc("pid", zzfkrVar.zzc());
        zza.zzc("pv", "1");
        zza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzfkr zzfkrVar, String str2) {
        zzdsl zza = this.zza.zza();
        zza.zzc("plaac_ts", Long.toString(j));
        zza.zzc("app", this.zzb);
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "is_ad_available");
        if (zzfkrVar != null) {
            zza.zzc("ad_unit_id", zzfkrVar.zza());
            zza.zzc("pid", zzfkrVar.zzc());
            zza.zzc("ad_format", zzfkrVar.zzb());
        }
        if (l != null) {
            zza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zze(long j, String str) {
        zzr("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfkr zzfkrVar, int i, int i2, String str) {
        zzr("poll_ad", "ppac_ts", j, i, i2, null, zzfkrVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfkr zzfkrVar, String str2) {
        zzr("poll_ad", "psvroc_ts", j, i, i2, str, zzfkrVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzfkr zzfkrVar, String str2) {
        zzdsl zza = this.zza.zza();
        zza.zzc("ppla_ts", Long.toString(j));
        zza.zzc("app", this.zzb);
        zza.zzc("ad_format", zzfkrVar.zzb());
        zza.zzc("ad_unit_id", zzfkrVar.zza());
        zza.zzc("pid", zzfkrVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "poll_ad");
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zzi(long j, String str, zzfkr zzfkrVar, int i, int i2, String str2) {
        zzr("paa", "pano_ts", j, i, i2, str, zzfkrVar, str2);
    }

    public final void zzj(long j, zzfkr zzfkrVar, int i, String str) {
        zzr("pae", "paeo_ts", j, i, 0, null, zzfkrVar, str);
    }

    public final void zzk(long j, zzfkr zzfkrVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzdsl zza = this.zza.zza();
        zza.zzc("action", "pftla");
        zza.zzc("pftlat_ts", Long.toString(j));
        zza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zza.zzc("app", this.zzb);
        zza.zzc("ad_format", zzfkrVar.zzb());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("ad_unit_id", zzfkrVar.zza());
        zza.zzc("pid", zzfkrVar.zzc());
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzq("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzq("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzq("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzq("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzq("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }
}
