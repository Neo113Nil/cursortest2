package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzux implements zzxy {
    private final zzxy zza;
    private final zzdc zzb;

    public zzux(zzxy zzxyVar, zzdc zzdcVar) {
        this.zza = zzxyVar;
        this.zzb = zzdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzux)) {
            return false;
        }
        zzux zzuxVar = (zzux) obj;
        return this.zza.equals(zzuxVar.zza) && this.zzb.equals(zzuxVar.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zza(int i) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzam zzd(int i) {
        return this.zza.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzdc zze() {
        return this.zzb;
    }
}
