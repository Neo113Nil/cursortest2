package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdox implements zzhfc {
    private final zzhfu zza;

    public zzdox(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbc.zza.EnumC0008zza enumC0008zza = ((zzcwh) this.zza).zza().zzo.zza == 3 ? zzbbc.zza.EnumC0008zza.REWARDED_INTERSTITIAL : zzbbc.zza.EnumC0008zza.REWARD_BASED_VIDEO_AD;
        zzhfk.zzb(enumC0008zza);
        return enumC0008zza;
    }
}
