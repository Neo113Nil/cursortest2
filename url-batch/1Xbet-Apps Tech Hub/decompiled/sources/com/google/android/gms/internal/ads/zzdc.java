package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdc {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdb
    };

    public zzdc(String str, zzam... zzamVarArr) {
        this.zzc = str;
        this.zzg = zzamVarArr;
        int zzb = zzce.zzb(zzamVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzce.zzb(zzamVarArr[0].zzl) : zzb;
        zzd(zzamVarArr[0].zzd);
        int i = zzamVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdc zzdcVar = (zzdc) obj;
            if (this.zzc.equals(zzdcVar.zzc) && Arrays.equals(this.zzg, zzdcVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = hashCode;
        return hashCode;
    }

    public final int zza(zzam zzamVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzamVar == this.zzg[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzam zzb(int i) {
        return this.zzg[i];
    }

    public final zzdc zzc(String str) {
        return new zzdc(str, this.zzg);
    }
}
