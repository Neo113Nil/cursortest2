package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzabq {
    protected final zzabk zza;
    protected final zzabp zzb;
    protected zzabm zzc;
    private final int zzd;

    protected zzabq(zzabn zzabnVar, zzabp zzabpVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzabpVar;
        this.zzd = i;
        this.zza = new zzabk(zzabnVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzacf zzacfVar, long j, zzadb zzadbVar) {
        if (j == zzacfVar.zzf()) {
            return 0;
        }
        zzadbVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzacf zzacfVar, long j) throws IOException {
        long zzf = j - zzacfVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzabu) zzacfVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzabm zzabmVar = this.zzc;
            zzef.zzb(zzabmVar);
            j = zzabmVar.zzf;
            j2 = zzabmVar.zzg;
            long j12 = j2 - j;
            int i2 = this.zzd;
            j3 = zzabmVar.zzh;
            if (j12 <= i2) {
                zzc(false, j);
                return zzf(zzacfVar, j, zzadbVar);
            }
            if (!zzg(zzacfVar, j3)) {
                return zzf(zzacfVar, j3, zzadbVar);
            }
            zzacfVar.zzj();
            zzabp zzabpVar = this.zzb;
            j4 = zzabmVar.zzb;
            zzabo zza = zzabpVar.zza(zzacfVar, j4);
            i = zza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzacfVar, j3, zzadbVar);
            }
            if (i == -2) {
                j10 = zza.zzc;
                j11 = zza.zzd;
                zzabm.zzh(zzabmVar, j10, j11);
            } else {
                if (i != -1) {
                    j5 = zza.zzd;
                    zzg(zzacfVar, j5);
                    j6 = zza.zzd;
                    zzc(true, j6);
                    j7 = zza.zzd;
                    return zzf(zzacfVar, j7, zzadbVar);
                }
                j8 = zza.zzc;
                j9 = zza.zzd;
                zzabm.zzg(zzabmVar, j8, j9);
            }
        }
    }

    public final zzade zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzabm zzabmVar = this.zzc;
        if (zzabmVar != null) {
            j6 = zzabmVar.zza;
            if (j6 == j) {
                return;
            }
        }
        zzabk zzabkVar = this.zza;
        long zzf = zzabkVar.zzf(j);
        j2 = zzabkVar.zzc;
        j3 = zzabkVar.zzd;
        j4 = zzabkVar.zze;
        j5 = zzabkVar.zzf;
        this.zzc = new zzabm(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
