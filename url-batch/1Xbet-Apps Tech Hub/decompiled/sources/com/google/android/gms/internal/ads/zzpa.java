package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzpa {
    public static final zzpa zza = new zzoy().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzpa(zzoy zzoyVar, zzoz zzozVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzoyVar.zza;
        this.zzb = z;
        z2 = zzoyVar.zzb;
        this.zzc = z2;
        z3 = zzoyVar.zzc;
        this.zzd = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzpa zzpaVar = (zzpa) obj;
            if (this.zzb == zzpaVar.zzb && this.zzc == zzpaVar.zzc && this.zzd == zzpaVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
