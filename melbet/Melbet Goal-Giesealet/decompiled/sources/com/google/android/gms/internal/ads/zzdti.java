package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdti implements zzhpx {
    private final zzhqg zza;

    private zzdti(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdti zza(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdti(zzdtbVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzg = zzdtb.zzg((zzdtl) this.zza.zzb(), zzfgc.zzc());
        zzhqf.zzb(zzg);
        return zzg;
    }
}
