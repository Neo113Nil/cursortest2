package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzahy implements zzahv {
    private final zzfj zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzahy(zzahr zzahrVar) {
        zzfj zzfjVar = zzahrVar.zza;
        this.zza = zzfjVar;
        zzfjVar.zzG(12);
        this.zzc = zzfjVar.zzo() & 255;
        this.zzb = zzfjVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzl();
        }
        if (i == 16) {
            return this.zza.zzp();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzl = this.zza.zzl();
        this.zze = zzl;
        return (zzl & 240) >> 4;
    }
}
