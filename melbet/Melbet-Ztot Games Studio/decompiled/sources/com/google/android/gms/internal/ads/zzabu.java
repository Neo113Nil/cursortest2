package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public class zzabu {
    protected final zzabo zza;
    protected final zzabt zzb;
    protected zzabq zzc;
    private final int zzd;

    protected zzabu(zzabr zzabrVar, zzabt zzabtVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzabtVar;
        this.zzd = i;
        this.zza = new zzabo(zzabrVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzacl zzaclVar, long j, zzadf zzadfVar) {
        if (j == zzaclVar.zzf()) {
            return 0;
        }
        zzadfVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzacl zzaclVar, long j) throws IOException {
        long zzf = j - zzaclVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzaby) zzaclVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
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
            zzabq zzabqVar = this.zzc;
            zzdi.zzb(zzabqVar);
            j = zzabqVar.zzf;
            j2 = zzabqVar.zzg;
            long j12 = j2 - j;
            int i2 = this.zzd;
            j3 = zzabqVar.zzh;
            if (j12 <= i2) {
                zzc(false, j);
                return zzf(zzaclVar, j, zzadfVar);
            }
            if (!zzg(zzaclVar, j3)) {
                return zzf(zzaclVar, j3, zzadfVar);
            }
            zzaclVar.zzj();
            zzabt zzabtVar = this.zzb;
            j4 = zzabqVar.zzb;
            zzabs zza = zzabtVar.zza(zzaclVar, j4);
            i = zza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzaclVar, j3, zzadfVar);
            }
            if (i == -2) {
                j10 = zza.zzc;
                j11 = zza.zzd;
                zzabq.zzh(zzabqVar, j10, j11);
            } else {
                if (i != -1) {
                    j5 = zza.zzd;
                    zzg(zzaclVar, j5);
                    j6 = zza.zzd;
                    zzc(true, j6);
                    j7 = zza.zzd;
                    return zzf(zzaclVar, j7, zzadfVar);
                }
                j8 = zza.zzc;
                j9 = zza.zzd;
                zzabq.zzg(zzabqVar, j8, j9);
            }
        }
    }

    public final zzadi zzb() {
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
        zzabq zzabqVar = this.zzc;
        if (zzabqVar != null) {
            j6 = zzabqVar.zza;
            if (j6 == j) {
                return;
            }
        }
        zzabo zzaboVar = this.zza;
        long zzf = zzaboVar.zzf(j);
        j2 = zzaboVar.zzc;
        j3 = zzaboVar.zzd;
        j4 = zzaboVar.zze;
        j5 = zzaboVar.zzf;
        this.zzc = new zzabq(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
