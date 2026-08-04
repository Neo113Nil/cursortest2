package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzko {
    public final zzup zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    zzko(zzup zzupVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        zzghc.zza(!z5 || z3);
        if (z4 && !z3) {
            z6 = false;
        }
        zzghc.zza(z6);
        this.zza = zzupVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzko zzkoVar = (zzko) obj;
            if (this.zzb == zzkoVar.zzb && this.zzc == zzkoVar.zzc && this.zzd == zzkoVar.zzd && this.zze == zzkoVar.zze && this.zzh == zzkoVar.zzh && this.zzi == zzkoVar.zzi && this.zzj == zzkoVar.zzj && Objects.equals(this.zza, zzkoVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        long j2 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzko zza(long j) {
        return j == this.zzb ? this : new zzko(this.zza, j, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzko zzb(long j) {
        return j == this.zzc ? this : new zzko(this.zza, this.zzb, j, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
