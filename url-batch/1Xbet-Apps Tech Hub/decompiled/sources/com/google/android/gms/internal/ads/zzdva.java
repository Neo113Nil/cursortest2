package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdva extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzduu zza;
    final /* synthetic */ zzdvb zzb;

    zzdva(zzdvb zzdvbVar, zzduu zzduuVar) {
        this.zzb = zzdvbVar;
        this.zza = zzduuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j;
        zzdvb zzdvbVar = this.zzb;
        zzduu zzduuVar = this.zza;
        j = zzdvbVar.zza;
        zzduuVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j;
        zzdvb zzdvbVar = this.zzb;
        zzduu zzduuVar = this.zza;
        j = zzdvbVar.zza;
        zzduuVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        long j;
        zzdvb zzdvbVar = this.zzb;
        zzduu zzduuVar = this.zza;
        j = zzdvbVar.zza;
        zzduuVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdvb zzdvbVar = this.zzb;
        zzduu zzduuVar = this.zza;
        j = zzdvbVar.zza;
        zzduuVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j;
        zzdvb zzdvbVar = this.zzb;
        zzduu zzduuVar = this.zza;
        j = zzdvbVar.zza;
        zzduuVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j;
        zzdvb zzdvbVar = this.zzb;
        zzduu zzduuVar = this.zza;
        j = zzdvbVar.zza;
        zzduuVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
