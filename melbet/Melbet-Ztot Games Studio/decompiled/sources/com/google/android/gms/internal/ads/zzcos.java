package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzcos {
    private final zzdsk zza;
    private final zzfex zzb;

    zzcos(zzdsk zzdskVar, zzfex zzfexVar) {
        this.zza = zzdskVar;
        this.zzb = zzfexVar;
    }

    public final void zza(long j, int i) {
        zzdsj zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        zza.zzb("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zza.zzf();
    }
}
