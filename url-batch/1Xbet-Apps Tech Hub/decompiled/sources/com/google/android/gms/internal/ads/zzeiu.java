package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeiu extends zzbri {
    final /* synthetic */ zzeiv zza;
    private final zzefy zzb;

    /* synthetic */ zzeiu(zzeiv zzeivVar, zzefy zzefyVar, zzeit zzeitVar) {
        this.zza = zzeivVar;
        this.zzb = zzefyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void zze(String str) throws RemoteException {
        ((zzehr) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzehr) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void zzg(zzbqg zzbqgVar) throws RemoteException {
        this.zza.zzc = zzbqgVar;
        ((zzehr) this.zzb.zzc).zzo();
    }
}
