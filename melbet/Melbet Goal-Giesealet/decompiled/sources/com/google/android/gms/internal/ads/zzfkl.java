package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfkl implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzfkl(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzfkl zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzfkl(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfkk zzb() {
        return new zzfkk((zzdsm) this.zza.zzb(), ((zzchd) this.zzb).zza());
    }
}
