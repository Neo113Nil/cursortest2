package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdqg implements zzhdp {
    private final zzhec zza;

    public zzdqg(zzhec zzhecVar) {
        this.zza = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzayz zzayzVar = ((zzcxy) this.zza).zza().zzo.zza == 3 ? zzayz.REWARDED_INTERSTITIAL : zzayz.REWARD_BASED_VIDEO_AD;
        zzhdx.zzb(zzayzVar);
        return zzayzVar;
    }
}
