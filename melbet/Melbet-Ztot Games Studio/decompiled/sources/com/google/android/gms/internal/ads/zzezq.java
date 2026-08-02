package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzezq implements zzgcf {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzfju zzc;
    final /* synthetic */ zzezs zzd;
    final /* synthetic */ zzezt zze;

    zzezq(zzezt zzeztVar, zzemz zzemzVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzezs zzezsVar) {
        this.zza = zzemzVar;
        this.zzb = zzfkfVar;
        this.zzc = zzfjuVar;
        this.zzd = zzezsVar;
        this.zze = zzeztVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcou, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        zzfcc zzfccVar;
        zzfaj zzfajVar;
        zzcvw zzm;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        Executor executor;
        zzfccVar = this.zze.zze;
        zzcou zzcouVar = (zzcou) zzfccVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcouVar == null ? zzfgi.zzb(th, null) : zzcouVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcouVar != null) {
                zzcouVar.zzc().zzdB(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhq)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfaj zzfajVar2;
                            zzfajVar2 = zzezq.this.zze.zzd;
                            zzfajVar2.zzdB(zzb);
                        }
                    });
                }
            } else {
                zzfajVar = this.zze.zzd;
                zzfajVar.zzdB(zzb);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzh();
            }
            zzfgd.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzh;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zza(zzb);
                zzfjuVar.zzh(th);
                zzfjuVar.zzg(false);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzc(zzb);
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzh(th);
                zzfjuVar2.zzg(false);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        zzfaj zzfajVar;
        zzcru zzcruVar = (zzcru) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhq)).booleanValue()) {
                zzday zzo = zzcruVar.zzo();
                zzfajVar = this.zze.zzd;
                zzo.zzb(zzfajVar);
            }
            this.zza.zzb(zzcruVar);
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzh;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zzb(zzcruVar.zzq().zzb);
                zzfjuVar.zzd(zzcruVar.zzm().zzg());
                zzfjuVar.zzg(true);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzg(zzcruVar.zzq().zzb);
                zzfkfVar.zze(zzcruVar.zzm().zzg());
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzg(true);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }
}
