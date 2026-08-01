package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdtk {
    private final ConcurrentHashMap zza;
    private final zzcba zzb;
    private final zzfeq zzc;
    private final String zzd;
    private final String zze;

    public zzdtk(zzdtu zzdtuVar, zzcba zzcbaVar, zzfeq zzfeqVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdtuVar.zzc();
        this.zza = zzc;
        this.zzb = zzcbaVar;
        this.zzc = zzfeqVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgZ)).booleanValue()) {
            int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfeqVar);
            int i = zze - 1;
            if (i == 0) {
                zzc.put("scar", "false");
                return;
            }
            if (i == 1) {
                zzc.put("se", "query_g");
            } else if (i == 2) {
                zzc.put("se", "r_adinfo");
            } else if (i != 3) {
                zzc.put("se", "r_both");
            } else {
                zzc.put("se", "r_adstring");
            }
            zzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhz)).booleanValue()) {
                zzc.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
            }
            if (zze == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzfeqVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzfeqVar.zzd)));
        }
    }

    private final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfeh zzfehVar) {
        if (!zzfehVar.zzb.zza.isEmpty()) {
            switch (((zzfdu) zzfehVar.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzm() ? "0" : "1");
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        zzd("gqi", zzfehVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
