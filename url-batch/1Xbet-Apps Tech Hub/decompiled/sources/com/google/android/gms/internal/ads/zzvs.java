package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzvs implements zzyh {
    public long zza;
    public long zzb;
    public zzyg zzc;
    public zzvs zzd;

    public zzvs(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvs zzb() {
        this.zzc = null;
        zzvs zzvsVar = this.zzd;
        this.zzd = null;
        return zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyg zzc() {
        zzyg zzygVar = this.zzc;
        zzygVar.getClass();
        return zzygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzyh zzd() {
        zzvs zzvsVar = this.zzd;
        if (zzvsVar == null || zzvsVar.zzc == null) {
            return null;
        }
        return zzvsVar;
    }

    public final void zze(long j, int i) {
        zzef.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
