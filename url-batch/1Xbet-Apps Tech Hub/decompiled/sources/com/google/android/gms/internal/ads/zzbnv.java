package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbnv implements zzccj {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzfjw zzb;
    final /* synthetic */ zzbog zzc;

    zzbnv(zzbog zzbogVar, zzbof zzbofVar, zzfjw zzfjwVar) {
        this.zzc = zzbogVar;
        this.zza = zzbofVar;
        this.zzb = zzfjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbof zzbofVar;
        zzfkk zzfkkVar;
        zzfkk zzfkkVar2;
        zzbof zzbofVar2;
        zzbof zzbofVar3;
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            this.zzc.zzi = 0;
            zzbog zzbogVar = this.zzc;
            zzbofVar = zzbogVar.zzh;
            if (zzbofVar != null) {
                zzbof zzbofVar4 = this.zza;
                zzbofVar2 = zzbogVar.zzh;
                if (zzbofVar4 != zzbofVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbofVar3 = this.zzc.zzh;
                    zzbofVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbeo.zzd.zze()).booleanValue()) {
                zzbog zzbogVar2 = this.zzc;
                zzfkkVar = zzbogVar2.zze;
                if (zzfkkVar != null) {
                    zzfkkVar2 = zzbogVar2.zze;
                    zzfjw zzfjwVar = this.zzb;
                    zzfjwVar.zzf(true);
                    zzfkkVar2.zzb(zzfjwVar.zzl());
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
