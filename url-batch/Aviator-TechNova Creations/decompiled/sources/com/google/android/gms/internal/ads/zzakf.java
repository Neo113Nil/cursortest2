package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzakf implements zzakb {
    private final zzer zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzakf(zzfv zzfvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zza = zzerVar;
        zzerVar.zzh(12);
        this.zzc = zzerVar.zzH() & 255;
        this.zzb = zzerVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzs = this.zza.zzs();
        this.zze = zzs;
        return (zzs & 240) >> 4;
    }
}
