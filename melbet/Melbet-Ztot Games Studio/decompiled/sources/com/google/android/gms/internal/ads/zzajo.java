package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
abstract class zzajo {
    private zzadp zzb;
    private zzacn zzc;
    private zzajj zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajh zza = new zzajh();
    private zzajl zzj = new zzajl();

    protected abstract long zza(zzek zzekVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzajl();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzek zzekVar, long j, zzajl zzajlVar) throws IOException;

    final int zze(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        zzdi.zzb(this.zzb);
        int i = zzet.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzaclVar)) {
                long zzf = zzaclVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzaclVar.zzf();
                } else {
                    zzaf zzafVar = this.zzj.zza;
                    this.zzi = zzafVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzl(zzafVar);
                        this.zzm = true;
                    }
                    zzajj zzajjVar = this.zzj.zzb;
                    if (zzajjVar != null) {
                        this.zzd = zzajjVar;
                    } else if (zzaclVar.zzd() == -1) {
                        this.zzd = new zzajn(null);
                    } else {
                        zzaji zzb = this.zza.zzb();
                        this.zzd = new zzajd(this, this.zzf, zzaclVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzaby) zzaclVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long zzd = this.zzd.zzd(zzaclVar);
        if (zzd >= 0) {
            zzadfVar.zza = zzd;
            return 1;
        }
        if (zzd < -1) {
            zzi(-(zzd + 2));
        }
        if (!this.zzl) {
            zzadi zze = this.zzd.zze();
            zzdi.zzb(zze);
            this.zzc.zzO(zze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzaclVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzek zza = this.zza.zza();
        long zza2 = zza(zza);
        if (zza2 >= 0) {
            long j2 = this.zzg;
            if (j2 + zza2 >= this.zze) {
                long zzf2 = zzf(j2);
                this.zzb.zzq(zza, zza.zze());
                this.zzb.zzs(zzf2, 1, zza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += zza2;
        return 0;
    }

    protected final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    final void zzh(zzacn zzacnVar, zzadp zzadpVar) {
        this.zzc = zzacnVar;
        this.zzb = zzadpVar;
        zzb(true);
    }

    protected void zzi(long j) {
        this.zzg = j;
    }

    final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzajj zzajjVar = this.zzd;
            int i = zzet.zza;
            zzajjVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
