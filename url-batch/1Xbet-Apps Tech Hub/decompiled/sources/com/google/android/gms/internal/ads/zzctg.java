package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzctg implements zzczv, zzavq {
    private final zzfdu zza;
    private final zzcyz zzb;
    private final zzdae zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzctg(zzfdu zzfduVar, zzcyz zzcyzVar, zzdae zzdaeVar) {
        this.zza = zzfduVar;
        this.zzb = zzcyzVar;
        this.zzc = zzdaeVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzbu(zzavp zzavpVar) {
        if (this.zza.zzf == 1 && zzavpVar.zzj) {
            zza();
        }
        if (zzavpVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final synchronized void zzr() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
