package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejc extends zzeje {
    private final zzciq zza;
    private final zzdip zzb;
    private final zzcxp zzc;
    private final zzddy zzd;
    private final zzejp zze;
    private final zzega zzf;

    public zzejc(zzciq zzciqVar, zzdip zzdipVar, zzcxp zzcxpVar, zzddy zzddyVar, zzejp zzejpVar, zzega zzegaVar) {
        this.zza = zzciqVar;
        this.zzb = zzdipVar;
        this.zzc = zzcxpVar;
        this.zzd = zzddyVar;
        this.zze = zzejpVar;
        this.zzf = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeje
    protected final ListenableFuture zzc(zzfeq zzfeqVar, Bundle bundle, zzfdu zzfduVar, zzfeh zzfehVar) {
        zzcxp zzcxpVar = this.zzc;
        zzcxpVar.zzi(zzfeqVar);
        zzcxpVar.zzf(bundle);
        zzcxpVar.zzg(new zzcxj(zzfehVar, zzfduVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdq)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzciq zzciqVar = this.zza;
        zzcxp zzcxpVar2 = this.zzc;
        zzdit zzh = zzciqVar.zzh();
        zzh.zzf(zzcxpVar2.zzj());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcrm(null));
        zzcuz zza = zzh.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
