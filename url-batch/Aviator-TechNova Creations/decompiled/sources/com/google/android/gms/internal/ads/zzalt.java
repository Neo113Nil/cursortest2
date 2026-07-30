package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
abstract class zzalt {
    private zzagh zzb;
    private zzaex zzc;
    private zzalp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzaln zza = new zzaln();
    private zzalr zzj = new zzalr();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzalr();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzer zzerVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) throws IOException;

    final void zze(zzaex zzaexVar, zzagh zzaghVar) {
        this.zzc = zzaexVar;
        this.zzb = zzaghVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzi(j2);
            zzalp zzalpVar = this.zzd;
            String str = zzfj.zza;
            zzalpVar.zzb(this.zze);
            this.zzh = 2;
        }
    }

    final int zzg(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zzb.getClass();
        String str = zzfj.zza;
        int i = this.zzh;
        if (i != 0) {
            if (i == 1) {
                zzaevVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long zza = this.zzd.zza(zzaevVar);
            if (zza >= 0) {
                zzafvVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                zzafy zzc = this.zzd.zzc();
                zzc.getClass();
                this.zzc.zzw(zzc);
                this.zzb.zzN(zzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzaevVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzer zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j = this.zzg;
                if (j + zzb >= this.zze) {
                    long zzh = zzh(j);
                    this.zzb.zzc(zzd, zzd.zze());
                    this.zzb.zze(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
            return 0;
        }
        while (true) {
            zzaln zzalnVar = this.zza;
            if (!zzalnVar.zzb(zzaevVar)) {
                this.zzh = 3;
                return -1;
            }
            long zzn = zzaevVar.zzn();
            long j2 = this.zzf;
            this.zzk = zzn - j2;
            if (!zzc(zzalnVar.zzd(), j2, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzz(zzvVar);
                    this.zzm = true;
                }
                zzalp zzalpVar = this.zzj.zzb;
                if (zzalpVar != null) {
                    this.zzd = zzalpVar;
                } else if (zzaevVar.zzo() == -1) {
                    this.zzd = new zzals(null);
                } else {
                    zzalo zzc2 = zzalnVar.zzc();
                    this.zzd = new zzali(this, this.zzf, zzaevVar.zzo(), zzc2.zzd + zzc2.zze, zzc2.zzb, (zzc2.zza & 4) != 0);
                }
                this.zzh = 2;
                zzalnVar.zze();
                return 0;
            }
            this.zzf = zzaevVar.zzn();
        }
    }

    protected final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    protected void zzj(long j) {
        this.zzg = j;
    }
}
