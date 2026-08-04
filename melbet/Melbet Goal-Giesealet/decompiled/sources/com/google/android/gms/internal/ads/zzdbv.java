package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdbv implements zzhpx {
    private final zzdbs zza;

    private zzdbv(zzdbs zzdbsVar) {
        this.zza = zzdbsVar;
    }

    public static zzdbv zza(zzdbs zzdbsVar) {
        return new zzdbv(zzdbsVar);
    }

    public static Set zzc(zzdbs zzdbsVar) {
        Set emptySet = Collections.emptySet();
        zzhqf.zzb(emptySet);
        return emptySet;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
