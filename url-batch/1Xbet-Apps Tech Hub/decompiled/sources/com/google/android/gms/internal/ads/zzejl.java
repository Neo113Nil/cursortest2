package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejl extends zzeje {
    private final zzciq zza;
    private final zzcxp zzb;
    private final zzddy zzc;
    private final zzejp zzd;

    @Nullable
    private final zzfei zze;
    private final zzega zzf;

    public zzejl(zzciq zzciqVar, zzcxp zzcxpVar, zzddy zzddyVar, @Nullable zzfei zzfeiVar, zzejp zzejpVar, zzega zzegaVar) {
        this.zza = zzciqVar;
        this.zzb = zzcxpVar;
        this.zzc = zzddyVar;
        this.zze = zzfeiVar;
        this.zzd = zzejpVar;
        this.zzf = zzegaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeje
    protected final ListenableFuture zzc(zzfeq zzfeqVar, Bundle bundle, zzfdu zzfduVar, zzfeh zzfehVar) {
        zzfei zzfeiVar;
        zzcxp zzcxpVar = this.zzb;
        zzcxpVar.zzi(zzfeqVar);
        zzcxpVar.zzf(bundle);
        zzcxpVar.zzg(new zzcxj(zzfehVar, zzfduVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdp)).booleanValue() && (zzfeiVar = this.zze) != null) {
            this.zzb.zzh(zzfeiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdq)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzciq zzciqVar = this.zza;
        zzcxp zzcxpVar2 = this.zzb;
        zzdqc zzi = zzciqVar.zzi();
        zzi.zzd(zzcxpVar2.zzj());
        zzi.zzc(this.zzc);
        zzcuz zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
