package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcqy {
    private final zzfje zza;
    private final zzdtp zzb;
    private final zzfeh zzc;

    public zzcqy(zzdtp zzdtpVar, zzfeh zzfehVar, zzfje zzfjeVar) {
        this.zza = zzfjeVar;
        this.zzb = zzdtpVar;
        this.zzc = zzfehVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
            zzfje zzfjeVar = this.zza;
            zzfeh zzfehVar = this.zzc;
            zzfjd zzb = zzfjd.zzb("ad_closed");
            zzb.zzg(zzfehVar.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j));
            zzb.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzb.zza("acr", zzb(i));
            zzfjeVar.zzb(zzb);
            return;
        }
        zzdtp zzdtpVar = this.zzb;
        zzfeh zzfehVar2 = this.zzc;
        zzdto zza = zzdtpVar.zza();
        zza.zze(zzfehVar2.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zza.zzb("acr", zzb(i));
        zza.zzg();
    }
}
