package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzwu implements zzxy {
    protected final zzdc zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzwu(zzdc zzdcVar, int[] iArr, int i) {
        int length = iArr.length;
        zzef.zzf(length > 0);
        zzdcVar.getClass();
        this.zza = zzdcVar;
        this.zzb = length;
        this.zzd = new zzam[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzdcVar.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzam) obj2).zzi - ((zzam) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzdcVar.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwu zzwuVar = (zzwu) obj;
            if (this.zza.equals(zzwuVar.zza) && Arrays.equals(this.zzc, zzwuVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zza(int i) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzam zzd(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzdc zze() {
        return this.zza;
    }
}
