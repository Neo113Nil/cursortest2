package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum jr implements cq3 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* renamed from: s, reason: collision with root package name */
    private static final dq3<jr> f7231s = new dq3<jr>() { // from class: com.google.android.gms.internal.ads.hr
    };

    /* renamed from: f, reason: collision with root package name */
    private final int f7233f;

    jr(int i7) {
        this.f7233f = i7;
    }

    public static jr b(int i7) {
        switch (i7) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case c4.w0.f2149o /* 7 */:
                return REWARD_BASED_VIDEO_AD;
            case c4.w0.f2150p /* 8 */:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    public static eq3 d() {
        return ir.f6747a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7233f);
    }

    public final int zza() {
        return this.f7233f;
    }
}
