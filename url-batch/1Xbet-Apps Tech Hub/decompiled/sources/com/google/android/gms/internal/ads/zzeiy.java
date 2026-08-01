package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeiy implements zzgax {
    final /* synthetic */ zzfdu zza;
    final /* synthetic */ zzeiz zzb;

    zzeiy(zzeiz zzeizVar, zzfdu zzfduVar) {
        this.zzb = zzeizVar;
        this.zza = zzfduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzeja zzejaVar;
        zzeja zzejaVar2;
        zzeja zzejaVar3;
        synchronized (this.zzb) {
            zzejaVar = this.zzb.zzh;
            zzejaVar.zzb(th, this.zza);
            zzejaVar2 = this.zzb.zzh;
            if (zzejaVar2.zze()) {
                zzeiz zzeizVar = this.zzb;
                zzejaVar3 = zzeizVar.zzh;
                zzeizVar.zze(zzejaVar3.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeja zzejaVar;
        zzeja zzejaVar2;
        zzeja zzejaVar3;
        zzejq zzejqVar = (zzejq) obj;
        synchronized (this.zzb) {
            zzejaVar = this.zzb.zzh;
            zzejaVar.zzc(zzejqVar, this.zza);
            zzejaVar2 = this.zzb.zzh;
            if (zzejaVar2.zze()) {
                zzeiz zzeizVar = this.zzb;
                zzejaVar3 = zzeizVar.zzh;
                zzeizVar.zze(zzejaVar3.zza());
            }
        }
    }
}
