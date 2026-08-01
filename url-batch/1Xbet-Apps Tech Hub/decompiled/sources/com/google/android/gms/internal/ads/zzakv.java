package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzakv {
    private final zzajy zza;
    private final zzfq zzb;
    private final zzfi zzc = new zzfi(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzakv(zzajy zzajyVar, zzfq zzfqVar) {
        this.zza = zzajyVar;
        this.zzb = zzfqVar;
    }

    public final void zza(zzfj zzfjVar) throws zzcf {
        long j;
        long j2;
        zzfjVar.zzC(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzfi zzfiVar = this.zzc;
        zzfjVar.zzC(zzfiVar.zza, 0, zzfiVar.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzl(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (this.zzf || !this.zze) {
                j2 = zzd;
            } else {
                this.zzc.zzl(4);
                this.zzc.zzl(1);
                int zzd4 = this.zzc.zzd(15) << 15;
                this.zzc.zzl(1);
                j2 = zzd;
                long zzd5 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb(zzd4 | (this.zzc.zzd(3) << 30) | zzd5);
                this.zzf = true;
            }
            j = this.zzb.zzb((j2 << 30) | zzd2 | zzd3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzfjVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
