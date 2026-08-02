package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaah {
    private final zzaag zza;
    private final zzaal zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;

    public zzaah(Context context, zzaag zzaagVar, long j) {
        this.zza = zzaagVar;
        this.zzb = new zzaal(context);
    }

    private final void zzp(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r6 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r21 >= r25) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
    
        if (r18.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(long j, long j2, long j3, long j4, boolean z, zzaaf zzaafVar) throws zzhw {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        zzaaf.zzg(zzaafVar);
        if (this.zze == -9223372036854775807L) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzd(j);
            this.zzg = j;
        }
        long j11 = (long) ((j - j2) / this.zzj);
        if (this.zzc) {
            j11 -= zzet.zzr(SystemClock.elapsedRealtime()) - j3;
        }
        zzaafVar.zza = j11;
        j5 = zzaafVar.zza;
        boolean z2 = false;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i = this.zzd;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        long zzr = zzet.zzr(SystemClock.elapsedRealtime()) - this.zzf;
                        if (this.zzc) {
                            if (j5 < -30000) {
                            }
                        }
                    }
                }
                return 0;
            }
        }
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        zzaal zzaalVar = this.zzb;
        long nanoTime = System.nanoTime();
        j6 = zzaafVar.zza;
        zzaafVar.zzb = zzaalVar.zza((j6 * 1000) + nanoTime);
        j7 = zzaafVar.zzb;
        zzaafVar.zza = (j7 - nanoTime) / 1000;
        if (this.zzh != -9223372036854775807L && !this.zzi) {
            z2 = true;
        }
        zzaag zzaagVar = this.zza;
        j8 = zzaafVar.zza;
        if (j8 < -500000 && !z && ((zzaaa) zzaagVar).zzaR(j2, z2)) {
            return 4;
        }
        j9 = zzaafVar.zza;
        if (j9 < -30000 && !z) {
            return z2 ? 3 : 2;
        }
        j10 = zzaafVar.zza;
        return j10 > 50000 ? 5 : 1;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzp(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzp(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzet.zzr(SystemClock.elapsedRealtime());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzp(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(float f) {
        this.zzb.zzc(f);
    }

    public final void zzl(Surface surface) {
        this.zzb.zzi(surface);
        zzp(1);
    }

    public final void zzm(float f) {
        this.zzj = f;
        this.zzb.zze(f);
    }

    public final boolean zzn(boolean z) {
        if (!z || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            r0 = SystemClock.elapsedRealtime() < this.zzh;
            return r0;
        }
        this.zzh = -9223372036854775807L;
        return r0;
    }

    public final boolean zzo() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzet.zzr(SystemClock.elapsedRealtime());
        return i != 3;
    }
}
