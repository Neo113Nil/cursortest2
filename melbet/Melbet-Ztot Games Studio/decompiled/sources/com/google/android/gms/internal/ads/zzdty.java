package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzdty extends zzbwm {
    final /* synthetic */ zzdua zza;

    zzdty(zzdua zzduaVar) {
        this.zza = zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zze(int i) throws RemoteException {
        zzdtp zzdtpVar;
        long j;
        zzdua zzduaVar = this.zza;
        zzdtpVar = zzduaVar.zzb;
        j = zzduaVar.zza;
        zzdtpVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtp zzdtpVar;
        long j;
        zzdua zzduaVar = this.zza;
        zzdtpVar = zzduaVar.zzb;
        j = zzduaVar.zza;
        zzdtpVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final void zzg() throws RemoteException {
        zzdtp zzdtpVar;
        long j;
        zzdua zzduaVar = this.zza;
        zzdtpVar = zzduaVar.zzb;
        j = zzduaVar.zza;
        zzdtpVar.zzp(j);
    }
}
