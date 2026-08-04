package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbmy implements zzbzq {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzbnp zzc;

    zzbmy(zzbnp zzbnpVar, zzbno zzbnoVar, zzfhr zzfhrVar) {
        this.zza = zzbnoVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            zzbnpVar.zzk(0);
            if (zzbnpVar.zzh() != null && this.zza != zzbnpVar.zzh()) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzbnpVar.zzh().zzc();
            }
            zzbnpVar.zzi(this.zza);
            if (((Boolean) zzbeb.zzd.zze()).booleanValue() && zzbnpVar.zzg() != null) {
                zzfie zzg = zzbnpVar.zzg();
                zzfhr zzfhrVar = this.zzb;
                zzfhrVar.zzd(true);
                zzg.zzb(zzfhrVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
