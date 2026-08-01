package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzld {
    public final zzuk zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzld(zzuk zzukVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzef.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzef.zzd(z5);
        this.zza = zzukVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzld zzldVar = (zzld) obj;
            if (this.zzb == zzldVar.zzb && this.zzc == zzldVar.zzc && this.zzd == zzldVar.zzd && this.zze == zzldVar.zze && this.zzg == zzldVar.zzg && this.zzh == zzldVar.zzh && this.zzi == zzldVar.zzi && zzfs.zzF(this.zza, zzldVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        long j2 = this.zzd;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzld zza(long j) {
        return j == this.zzc ? this : new zzld(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzld zzb(long j) {
        return j == this.zzb ? this : new zzld(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
