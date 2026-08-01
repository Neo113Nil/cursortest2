package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcvw implements zzdds, zzczv {
    private final Clock zza;
    private final zzcvy zzb;
    private final zzfeq zzc;
    private final String zzd;

    zzcvw(Clock clock, zzcvy zzcvyVar, zzfeq zzfeqVar, String str) {
        this.zza = clock;
        this.zzb = zzcvyVar;
        this.zzc = zzfeqVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        zzfeq zzfeqVar = this.zzc;
        this.zzb.zzd(zzfeqVar.zzf, this.zzd, this.zza.elapsedRealtime());
    }
}
