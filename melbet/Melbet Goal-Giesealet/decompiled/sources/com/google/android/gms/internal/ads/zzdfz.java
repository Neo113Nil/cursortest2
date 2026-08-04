package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdfz implements zzhpx {
    private final zzhqg zza;

    private zzdfz(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdfz zza(zzhqg zzhqgVar) {
        return new zzdfz(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzddr((zzdgs) this.zza.zzb(), zzbzh.zzg));
        zzhqf.zzb(singleton);
        return singleton;
    }
}
