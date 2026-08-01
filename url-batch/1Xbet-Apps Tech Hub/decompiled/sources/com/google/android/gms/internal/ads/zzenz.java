package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzenz {
    private final zzdkv zza;
    private final zzenm zzb;
    private final zzcyk zzc;

    public zzenz(zzdkv zzdkvVar, zzfje zzfjeVar) {
        this.zza = zzdkvVar;
        final zzenm zzenmVar = new zzenm(zzfjeVar);
        this.zzb = zzenmVar;
        final zzbmv zzg = zzdkvVar.zzg();
        this.zzc = new zzcyk() { // from class: com.google.android.gms.internal.ads.zzeny
            @Override // com.google.android.gms.internal.ads.zzcyk
            public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzenm.this.zzbG(zzeVar);
                zzbmv zzbmvVar = zzg;
                if (zzbmvVar != null) {
                    try {
                        zzbmvVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        zzcbn.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbmvVar != null) {
                    try {
                        zzbmvVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        zzcbn.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcyk zza() {
        return this.zzc;
    }

    public final zzczv zzb() {
        return this.zzb;
    }

    public final zzdip zzc() {
        return new zzdip(this.zza, this.zzb.zzg());
    }

    public final zzenm zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzj(zzbhVar);
    }
}
