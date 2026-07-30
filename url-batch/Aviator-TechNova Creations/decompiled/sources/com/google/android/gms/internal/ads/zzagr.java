package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzagr implements zzafy {
    final /* synthetic */ zzagt zza;
    private final long zzb;

    public zzagr(zzagt zzagtVar, long j) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        zzagt zzagtVar = this.zza;
        zzafw zzg = zzagtVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzagtVar.zzh().length; i++) {
            zzafw zzg2 = zzagtVar.zzh()[i].zzg(j);
            if (zzg2.zza.zzc < zzg.zza.zzc) {
                zzg = zzg2;
            }
        }
        return zzg;
    }
}
