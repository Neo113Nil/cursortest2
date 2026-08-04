package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhqi {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhqi(int i, int i2, zzhqh zzhqhVar) {
        this.zza = zzhpu.zza(i);
        this.zzb = zzhpu.zza(i2);
    }

    public final zzhqi zza(zzhqg zzhqgVar) {
        this.zza.add(zzhqgVar);
        return this;
    }

    public final zzhqi zzb(zzhqg zzhqgVar) {
        this.zzb.add(zzhqgVar);
        return this;
    }

    public final zzhqj zzc() {
        return new zzhqj(this.zza, this.zzb, null);
    }
}
