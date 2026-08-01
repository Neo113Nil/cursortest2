package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdm {
    public final int zzb;
    private final zzdc zzg;
    private final int[] zzh;
    private final boolean[] zzi;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdl
    };

    public zzdm(zzdc zzdcVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzdcVar.zzb;
        this.zzb = 1;
        this.zzg = zzdcVar;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdm zzdmVar = (zzdm) obj;
            if (this.zzg.equals(zzdmVar.zzg) && Arrays.equals(this.zzh, zzdmVar.zzh) && Arrays.equals(this.zzi, zzdmVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int i) {
        return this.zzg.zzb(0);
    }

    public final boolean zzc() {
        for (boolean z : this.zzi) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zzi[0];
    }
}
