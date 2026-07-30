package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbrv implements zzcep {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ zzbsl zzc;

    zzbrv(zzbsl zzbslVar, zzbsk zzbskVar, zzfoe zzfoeVar) {
        this.zza = zzbskVar;
        this.zzb = zzfoeVar;
        Objects.requireNonNull(zzbslVar);
        this.zzc = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbsl zzbslVar = this.zzc;
        synchronized (zzbslVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            zzbslVar.zzl(1);
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzc();
            if (((Boolean) zzbix.zzd.zze()).booleanValue() && zzbslVar.zzh() != null) {
                zzfor zzh = zzbslVar.zzh();
                zzfoe zzfoeVar = this.zzb;
                zzfoeVar.zzk("Failed loading new engine");
                zzfoeVar.zzd(false);
                zzh.zzb(zzfoeVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
