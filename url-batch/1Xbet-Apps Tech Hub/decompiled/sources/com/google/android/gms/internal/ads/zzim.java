package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzim {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzim(String str, zzam zzamVar, zzam zzamVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzef.zzd(z);
        zzef.zzc(str);
        this.zza = str;
        this.zzb = zzamVar;
        zzamVar2.getClass();
        this.zzc = zzamVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzim zzimVar = (zzim) obj;
            if (this.zzd == zzimVar.zzd && this.zze == zzimVar.zze && this.zza.equals(zzimVar.zza) && this.zzb.equals(zzimVar.zzb) && this.zzc.equals(zzimVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
