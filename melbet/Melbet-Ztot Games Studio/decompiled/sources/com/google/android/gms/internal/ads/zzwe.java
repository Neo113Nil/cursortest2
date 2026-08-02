package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzwe implements zzvx {
    private final zzvx zza;
    private final long zzb;

    public zzwe(zzvx zzvxVar, long j) {
        this.zza = zzvxVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zza(zzjz zzjzVar, zzhd zzhdVar, int i) {
        int zza = this.zza.zza(zzjzVar, zzhdVar, i);
        if (zza != -4) {
            return zza;
        }
        zzhdVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvx zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final boolean zze() {
        return this.zza.zze();
    }
}
