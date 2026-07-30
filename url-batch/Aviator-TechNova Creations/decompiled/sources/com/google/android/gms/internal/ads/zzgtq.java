package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgtq extends zzgts {
    zzgtq() {
        super(null);
    }

    static final zzgts zzf(int i) {
        zzgts zzgtsVar;
        zzgts zzgtsVar2;
        zzgts zzgtsVar3;
        if (i < 0) {
            zzgtsVar3 = zzgts.zzb;
            return zzgtsVar3;
        }
        if (i > 0) {
            zzgtsVar2 = zzgts.zzc;
            return zzgtsVar2;
        }
        zzgtsVar = zzgts.zza;
        return zzgtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final zzgts zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final int zze() {
        return 0;
    }
}
