package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzdtv extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdtp zza;
    final /* synthetic */ zzdtw zzb;

    zzdtv(zzdtw zzdtwVar, zzdtp zzdtpVar) {
        this.zza = zzdtpVar;
        this.zzb = zzdtwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j;
        zzdtw zzdtwVar = this.zzb;
        zzdtp zzdtpVar = this.zza;
        j = zzdtwVar.zza;
        zzdtpVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j;
        zzdtw zzdtwVar = this.zzb;
        zzdtp zzdtpVar = this.zza;
        j = zzdtwVar.zza;
        zzdtpVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        long j;
        zzdtw zzdtwVar = this.zzb;
        zzdtp zzdtpVar = this.zza;
        j = zzdtwVar.zza;
        zzdtpVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdtw zzdtwVar = this.zzb;
        zzdtp zzdtpVar = this.zza;
        j = zzdtwVar.zza;
        zzdtpVar.zzd(j, zzeVar.zza);
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
        zzdtw zzdtwVar = this.zzb;
        zzdtp zzdtpVar = this.zza;
        j = zzdtwVar.zza;
        zzdtpVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j;
        zzdtw zzdtwVar = this.zzb;
        zzdtp zzdtpVar = this.zza;
        j = zzdtwVar.zza;
        zzdtpVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
