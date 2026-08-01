package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpv implements zzbkt {
    private final zzczo zza;
    private final zzbxc zzb;
    private final String zzc;
    private final String zzd;

    public zzdpv(zzczo zzczoVar, zzfdu zzfduVar) {
        this.zza = zzczoVar;
        this.zzb = zzfduVar.zzm;
        this.zzc = zzfduVar.zzk;
        this.zzd = zzfduVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    @ParametersAreNonnullByDefault
    public final void zza(zzbxc zzbxcVar) {
        int i;
        String str;
        zzbxc zzbxcVar2 = this.zzb;
        if (zzbxcVar2 != null) {
            zzbxcVar = zzbxcVar2;
        }
        if (zzbxcVar != null) {
            str = zzbxcVar.zza;
            i = zzbxcVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbwn(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zzc() {
        this.zza.zzf();
    }
}
