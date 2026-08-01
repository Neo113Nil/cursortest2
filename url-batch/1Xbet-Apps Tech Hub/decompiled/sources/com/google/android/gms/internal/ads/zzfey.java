package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfey implements zzgax {
    final /* synthetic */ zzcgv zza;
    final /* synthetic */ zzcpo zzb;
    final /* synthetic */ zzfla zzc;
    final /* synthetic */ zzeep zzd;

    zzfey(zzcgv zzcgvVar, zzcpo zzcpoVar, zzfla zzflaVar, zzeep zzeepVar) {
        this.zza = zzcgvVar;
        this.zzb = zzcpoVar;
        this.zzc = zzflaVar;
        this.zzd = zzeepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpo zzcpoVar;
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjB)).booleanValue() || (zzcpoVar = this.zzb) == null) {
                this.zzc.zzc(str, null);
                return;
            } else {
                zzcpoVar.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zze());
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i = 2;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzz(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgn)).booleanValue() || !this.zza.zzD().zzT) {
                i = 1;
            }
        }
        this.zzd.zzd(new zzeer(currentTimeMillis, str2, str, i));
    }
}
