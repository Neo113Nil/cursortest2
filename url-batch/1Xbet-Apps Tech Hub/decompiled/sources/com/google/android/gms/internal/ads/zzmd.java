package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzmd {
    public static final zzmd zza;
    public static final zzmd zzb;
    public static final zzmd zzc;
    public static final zzmd zzd;
    public static final zzmd zze;
    public final long zzf;
    public final long zzg;

    static {
        zzmd zzmdVar = new zzmd(0L, 0L);
        zza = zzmdVar;
        zzb = new zzmd(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzmd(Long.MAX_VALUE, 0L);
        zzd = new zzmd(0L, Long.MAX_VALUE);
        zze = zzmdVar;
    }

    public zzmd(long j, long j2) {
        zzef.zzd(j >= 0);
        zzef.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmd zzmdVar = (zzmd) obj;
            if (this.zzf == zzmdVar.zzf && this.zzg == zzmdVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
