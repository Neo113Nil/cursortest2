package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzue extends zzda {
    private final zzbs zzc;

    public zzue(zzbs zzbsVar) {
        this.zzc = zzbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zza(Object obj) {
        return obj == zzud.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcx zzd(int i, zzcx zzcxVar, boolean z) {
        zzcxVar.zzl(z ? 0 : null, z ? zzud.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcz zze(int i, zzcz zzczVar, long j) {
        zzczVar.zza(zzcz.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzczVar.zzm = true;
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final Object zzf(int i) {
        return zzud.zzd;
    }
}
