package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhdz {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhdz(int i, int i2, zzhdy zzhdyVar) {
        this.zza = zzhdm.zzc(i);
        this.zzb = zzhdm.zzc(i2);
    }

    public final zzhdz zza(zzhec zzhecVar) {
        this.zzb.add(zzhecVar);
        return this;
    }

    public final zzhdz zzb(zzhec zzhecVar) {
        this.zza.add(zzhecVar);
        return this;
    }

    public final zzhea zzc() {
        return new zzhea(this.zza, this.zzb, null);
    }
}
