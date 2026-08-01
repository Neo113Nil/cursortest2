package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejf extends zzeje {
    private final zzciq zza;
    private final zzcxp zzb;
    private final zzddy zzc;
    private final zzejp zzd;
    private final zzega zze;

    zzejf(zzciq zzciqVar, zzcxp zzcxpVar, zzddy zzddyVar, zzejp zzejpVar, zzega zzegaVar) {
        this.zza = zzciqVar;
        this.zzb = zzcxpVar;
        this.zzc = zzddyVar;
        this.zzd = zzejpVar;
        this.zze = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeje
    protected final ListenableFuture zzc(zzfeq zzfeqVar, Bundle bundle, zzfdu zzfduVar, zzfeh zzfehVar) {
        zzcxp zzcxpVar = this.zzb;
        zzcxpVar.zzi(zzfeqVar);
        zzcxpVar.zzf(bundle);
        zzcxpVar.zzg(new zzcxj(zzfehVar, zzfduVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdq)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzciq zzciqVar = this.zza;
        zzcxp zzcxpVar2 = this.zzb;
        zzcrc zzd = zzciqVar.zzd();
        zzd.zzd(zzcxpVar2.zzj());
        zzd.zzc(this.zzc);
        zzcuz zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
