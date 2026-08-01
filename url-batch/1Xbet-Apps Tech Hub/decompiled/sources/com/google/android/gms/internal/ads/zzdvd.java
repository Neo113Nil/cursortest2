package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdvd extends zzbxp {
    final /* synthetic */ zzdvf zza;

    zzdvd(zzdvf zzdvfVar) {
        this.zza = zzdvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zze(int i) throws RemoteException {
        zzduu zzduuVar;
        long j;
        zzdvf zzdvfVar = this.zza;
        zzduuVar = zzdvfVar.zzb;
        j = zzdvfVar.zza;
        zzduuVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzduu zzduuVar;
        long j;
        zzdvf zzdvfVar = this.zza;
        zzduuVar = zzdvfVar.zzb;
        j = zzdvfVar.zza;
        zzduuVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zzg() throws RemoteException {
        zzduu zzduuVar;
        long j;
        zzdvf zzdvfVar = this.zza;
        zzduuVar = zzdvfVar.zzb;
        j = zzdvfVar.zza;
        zzduuVar.zzp(j);
    }
}
