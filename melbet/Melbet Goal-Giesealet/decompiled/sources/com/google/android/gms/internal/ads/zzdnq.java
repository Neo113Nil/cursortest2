package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzdnq implements zzgoq {
    final /* synthetic */ zzfcj zza;
    final /* synthetic */ zzfcm zzb;
    final /* synthetic */ zzcmi zzc;
    final /* synthetic */ zzdnx zzd;

    zzdnq(zzdnx zzdnxVar, zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar) {
        this.zza = zzfcjVar;
        this.zzb = zzfcmVar;
        this.zzc = zzcmiVar;
        Objects.requireNonNull(zzdnxVar);
        this.zzd = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcek zzcekVar = (zzcek) obj;
        zzfcj zzfcjVar = this.zza;
        zzcekVar.zzaD(zzfcjVar, this.zzb);
        zzcgi zzP = zzcekVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkU)).booleanValue() && zzP != null) {
            zzcmi zzcmiVar = this.zzc;
            zzdnx zzdnxVar = this.zzd;
            zzP.zzd(zzcmiVar, zzdnxVar.zzm(), zzdnxVar.zzn());
            zzP.zze(zzcmiVar, zzdnxVar.zzm(), zzdnxVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznQ)).booleanValue() || zzP == null) {
            return;
        }
        zzP.zzb(zzfcjVar);
    }
}
