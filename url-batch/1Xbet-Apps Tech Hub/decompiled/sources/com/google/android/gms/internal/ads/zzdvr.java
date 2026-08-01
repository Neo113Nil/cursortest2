package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdvr extends zzbmd {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfjw zzd;
    final /* synthetic */ zzccf zze;
    final /* synthetic */ zzdvs zzf;

    zzdvr(zzdvs zzdvsVar, Object obj, String str, long j, zzfjw zzfjwVar, zzccf zzccfVar) {
        this.zzf = zzdvsVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfjwVar;
        this.zze = zzccfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(String str) {
        zzdtz zzdtzVar;
        zzdfd zzdfdVar;
        zzfkk zzfkkVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdtzVar = this.zzf.zzl;
            zzdtzVar.zzb(this.zzb, "error");
            zzdfdVar = this.zzf.zzo;
            zzdfdVar.zzb(this.zzb, "error");
            zzfkkVar = this.zzf.zzp;
            zzfjw zzfjwVar = this.zzd;
            zzfjwVar.zzc(str);
            zzfjwVar.zzf(false);
            zzfkkVar.zzb(zzfjwVar.zzl());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzf() {
        zzdtz zzdtzVar;
        zzdfd zzdfdVar;
        zzfkk zzfkkVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdtzVar = this.zzf.zzl;
            zzdtzVar.zzd(this.zzb);
            zzdfdVar = this.zzf.zzo;
            zzdfdVar.zzd(this.zzb);
            zzfkkVar = this.zzf.zzp;
            zzfjw zzfjwVar = this.zzd;
            zzfjwVar.zzf(true);
            zzfkkVar.zzb(zzfjwVar.zzl());
            this.zze.zzc(true);
        }
    }
}
