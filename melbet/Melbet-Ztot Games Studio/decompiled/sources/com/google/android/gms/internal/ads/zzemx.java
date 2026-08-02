package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzemx {
    private final zzdjm zza;
    private final zzemk zzb;
    private final zzcwt zzc;

    public zzemx(zzdjm zzdjmVar, zzdsk zzdskVar) {
        this.zza = zzdjmVar;
        final zzemk zzemkVar = new zzemk(zzdskVar);
        this.zzb = zzemkVar;
        final zzblq zzg = zzdjmVar.zzg();
        this.zzc = new zzcwt() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // com.google.android.gms.internal.ads.zzcwt
            public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzemk.this.zzdB(zzeVar);
                zzblq zzblqVar = zzg;
                if (zzblqVar != null) {
                    try {
                        zzblqVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzblqVar != null) {
                    try {
                        zzblqVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcwt zza() {
        return this.zzc;
    }

    public final zzcye zzb() {
        return this.zzb;
    }

    public final zzdhg zzc() {
        return new zzdhg(this.zza, this.zzb.zzg());
    }

    public final zzemk zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzj(zzbhVar);
    }
}
