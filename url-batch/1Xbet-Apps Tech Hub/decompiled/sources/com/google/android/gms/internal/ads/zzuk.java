package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzuk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzuk(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzuk(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzuk(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuk)) {
            return false;
        }
        zzuk zzukVar = (zzuk) obj;
        return this.zza.equals(zzukVar.zza) && this.zzb == zzukVar.zzb && this.zzc == zzukVar.zzc && this.zzd == zzukVar.zzd && this.zze == zzukVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzuk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzuk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzuk(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
