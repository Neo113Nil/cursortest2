package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbn;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdou implements zzhpx {
    private final zzhqg zza;

    private zzdou(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdou zza(zzhqg zzhqgVar) {
        return new zzdou(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbn.zza.EnumC0009zza enumC0009zza = ((zzcvj) this.zza).zza().zzp.zza == 3 ? zzbbn.zza.EnumC0009zza.REWARDED_INTERSTITIAL : zzbbn.zza.EnumC0009zza.REWARD_BASED_VIDEO_AD;
        zzhqf.zzb(enumC0009zza);
        return enumC0009zza;
    }
}
