package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcjr implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzcjr(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbwl zzb() {
        Context zza = ((zzciw) this.zza).zza();
        zzfkk zzfkkVar = (zzfkk) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcbt.zza(), zzfkkVar).zza("google.afma.request.getAdDictionary", zzbor.zza, zzbor.zza);
        zzbou zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzcbt.zza(), zzfkkVar);
        zzboo zzbooVar = zzbor.zza;
        return new zzbwk(zza, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbooVar, zzbooVar));
    }
}
