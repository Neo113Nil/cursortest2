package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzacs {
    private final zzacr zza;
    private final zzacz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdn zzk = zzdn.zza;

    public zzacs(Context context, zzacr zzacrVar, long j) {
        this.zza = zzacrVar;
        this.zzb = new zzacz(context);
    }

    private final void zzo(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    public final void zza(int i) {
        if (i == 0) {
            this.zzd = 1;
        } else if (i != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
        this.zzb.zzd();
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f) {
        this.zzb.zzf(f);
    }

    public final boolean zzf() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzfj.zzq(this.zzk.zzb());
        return i != 3;
    }

    public final void zzg(zzdn zzdnVar) {
        this.zzk = zzdnVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z) {
        if (z && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final void zzj(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
    
        if (r17 > 100000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ca, code lost:
    
        if (r24 >= r28) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d1, code lost:
    
        if (r21.zzc != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzk(long j, long j2, long j3, long j4, boolean z, boolean z2, zzacq zzacqVar) throws zziw {
        long j5;
        zzacqVar.zzc();
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzg(j);
            this.zzg = j;
        }
        long j6 = (long) ((j - j2) / this.zzj);
        if (this.zzc) {
            j6 -= zzfj.zzq(this.zzk.zzb()) - j3;
        }
        zzacqVar.zze(j6);
        if (z && !z2) {
            return 3;
        }
        if (!this.zzl) {
            if (this.zza.zzao(zzacqVar.zzd(), j2, j3, z2, true)) {
                return 4;
            }
            if (this.zzc && zzacqVar.zzd() < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                return 3;
            }
            this.zzm = true;
            return 5;
        }
        long zzd = zzacqVar.zzd();
        boolean z3 = false;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i = this.zzd;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        j5 = -9223372036854775807L;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        j5 = -9223372036854775807L;
                        long zzq = zzfj.zzq(this.zzk.zzb()) - this.zzf;
                        if (this.zzc) {
                            long j7 = this.zze;
                            if (j7 != -9223372036854775807L) {
                                if (j7 != j2) {
                                    if (zzd < -30000) {
                                    }
                                }
                            }
                        }
                    }
                }
                return 0;
            }
            j5 = -9223372036854775807L;
        } else {
            j5 = -9223372036854775807L;
        }
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        long zzc = this.zzk.zzc();
        zzacqVar.zzg(this.zzb.zzi((zzacqVar.zzd() * 1000) + zzc, j));
        zzacqVar.zze((zzacqVar.zzf() - zzc) / 1000);
        if (this.zzh != j5 && !this.zzi) {
            z3 = true;
        }
        if (this.zza.zzao(zzacqVar.zzd(), j2, j3, z2, z3)) {
            return 4;
        }
        return (zzacqVar.zzd() >= -30000 || z2) ? zzacqVar.zzd() > 50000 ? 5 : 1 : z3 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzm(int i) {
        this.zzb.zza(i);
    }

    public final void zzn(float f) {
        zzgrc.zza(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }
}
