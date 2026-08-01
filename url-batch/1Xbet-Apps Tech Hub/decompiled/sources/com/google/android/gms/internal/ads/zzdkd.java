package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdkd implements zzgax {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdkf zzb;

    zzdkd(zzdkf zzdkfVar, String str, boolean z) {
        this.zzb = zzdkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfa)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdkk zzdkkVar;
        zzdkk zzdkkVar2;
        zzdkkVar = this.zzb.zze;
        zzdkkVar.zzT((zzcgv) obj);
        zzdkf zzdkfVar = this.zzb;
        zzdkkVar2 = zzdkfVar.zze;
        zzccf zzp = zzdkkVar2.zzp();
        zzflf zzf = zzdkfVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
