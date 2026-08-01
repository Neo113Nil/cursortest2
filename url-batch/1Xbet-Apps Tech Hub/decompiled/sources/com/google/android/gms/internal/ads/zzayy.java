package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzayy implements zzgwq {
    static final zzgwq zza = new zzayy();

    private zzayy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwq
    public final boolean zza(int i) {
        zzayz zzayzVar;
        zzayz zzayzVar2 = zzayz.AD_INITIATER_UNSPECIFIED;
        switch (i) {
            case 0:
                zzayzVar = zzayz.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                zzayzVar = zzayz.BANNER;
                break;
            case 2:
                zzayzVar = zzayz.DFP_BANNER;
                break;
            case 3:
                zzayzVar = zzayz.INTERSTITIAL;
                break;
            case 4:
                zzayzVar = zzayz.DFP_INTERSTITIAL;
                break;
            case 5:
                zzayzVar = zzayz.NATIVE_EXPRESS;
                break;
            case 6:
                zzayzVar = zzayz.AD_LOADER;
                break;
            case 7:
                zzayzVar = zzayz.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zzayzVar = zzayz.BANNER_SEARCH_ADS;
                break;
            case 9:
                zzayzVar = zzayz.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zzayzVar = zzayz.APP_OPEN;
                break;
            case 11:
                zzayzVar = zzayz.REWARDED_INTERSTITIAL;
                break;
            default:
                zzayzVar = null;
                break;
        }
        return zzayzVar != null;
    }
}
