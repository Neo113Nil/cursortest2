package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaht {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfj zzf;
    private final zzfj zzg;
    private int zzh;
    private int zzi;

    public zzaht(zzfj zzfjVar, zzfj zzfjVar2, boolean z) throws zzcf {
        this.zzg = zzfjVar;
        this.zzf = zzfjVar2;
        this.zze = z;
        zzfjVar2.zzG(12);
        this.zza = zzfjVar2.zzo();
        zzfjVar.zzG(12);
        this.zzi = zzfjVar.zzo();
        zzaci.zzb(zzfjVar.zzf() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzu() : this.zzf.zzt();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzo();
            this.zzg.zzH(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzo() : -1;
        }
        return true;
    }
}
