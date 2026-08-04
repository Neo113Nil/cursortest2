package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzesv implements zzhpx {
    private final zzhqg zza;

    private zzesv(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzesv zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzesv(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzest zzb() {
        return new zzest(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
