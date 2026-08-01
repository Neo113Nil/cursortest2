package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbs {
    public final String zzc;
    public final zzbl zzd;

    @Deprecated
    public final zzbl zze;
    public final zzbi zzf;
    public final zzby zzg;
    public final zzay zzh;

    @Deprecated
    public final zzba zzi;
    public final zzbo zzj;
    public static final zzbs zza = new zzau().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzar
    };

    /* synthetic */ zzbs(String str, zzba zzbaVar, zzbl zzblVar, zzbi zzbiVar, zzby zzbyVar, zzbo zzboVar, zzbr zzbrVar) {
        this.zzc = str;
        this.zzd = zzblVar;
        this.zze = zzblVar;
        this.zzf = zzbiVar;
        this.zzg = zzbyVar;
        this.zzh = zzbaVar;
        this.zzi = zzbaVar;
        this.zzj = zzboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbs)) {
            return false;
        }
        zzbs zzbsVar = (zzbs) obj;
        return zzfs.zzF(this.zzc, zzbsVar.zzc) && this.zzh.equals(zzbsVar.zzh) && zzfs.zzF(this.zzd, zzbsVar.zzd) && zzfs.zzF(this.zzf, zzbsVar.zzf) && zzfs.zzF(this.zzg, zzbsVar.zzg) && zzfs.zzF(this.zzj, zzbsVar.zzj);
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() * 31;
        zzbl zzblVar = this.zzd;
        return (((((((hashCode + (zzblVar != null ? zzblVar.hashCode() : 0)) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
