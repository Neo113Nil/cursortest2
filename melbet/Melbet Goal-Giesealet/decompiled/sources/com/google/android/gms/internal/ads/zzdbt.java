package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdbt implements zzhpx {
    private final zzdbs zza;
    private final zzhqg zzb;

    private zzdbt(zzdbs zzdbsVar, zzhqg zzhqgVar) {
        this.zza = zzdbsVar;
        this.zzb = zzhqgVar;
    }

    public static zzdbt zza(zzdbs zzdbsVar, zzhqg zzhqgVar) {
        return new zzdbt(zzdbsVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvu zzp = this.zza.zzp(((zzhqj) this.zzb).zzb());
        zzhqf.zzb(zzp);
        return zzp;
    }
}
