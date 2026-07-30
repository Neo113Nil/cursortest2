package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdvj {
    private final zzdxz zza;

    zzdvj(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    public final boolean zza(zzfyu zzfyuVar) {
        if (zzfyuVar.zzj()) {
            zzdxy zza = this.zza.zza();
            zza.zzc("action", "aq_ad_closed");
            zza.zzc("gqi", zzfyuVar.zza());
            zza.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
            zza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
            zza.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
            return Boolean.valueOf(zza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
        }
        zzdxy zza2 = this.zza.zza();
        zza2.zzc("action", "aq_ad_kill");
        zza2.zzc("gqi", zzfyuVar.zza());
        zza2.zzc("aq_ad_duration", String.valueOf(zzfyuVar.zzb()));
        zza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfyuVar.zzc()));
        zza2.zzc("aq_time_away", String.valueOf(zzfyuVar.zzg()));
        zza2.zzc("aq_is_os_kill", String.valueOf(zzfyuVar.zze()));
        return Boolean.valueOf(zza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
    }
}
