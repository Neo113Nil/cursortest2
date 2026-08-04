package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdth implements zzhpx {
    private final zzhqg zza;

    private zzdth(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdth zza(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdth(zzdtbVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = zzdtb.zzf((zzdtl) this.zza.zzb(), zzfgc.zzc());
        zzhqf.zzb(zzf);
        return zzf;
    }
}
