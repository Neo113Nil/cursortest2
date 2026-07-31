package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum xr implements cq3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: r, reason: collision with root package name */
    private static final dq3<xr> f14325r = new dq3<xr>() { // from class: com.google.android.gms.internal.ads.vr
    };

    /* renamed from: f, reason: collision with root package name */
    private final int f14327f;

    xr(int i7) {
        this.f14327f = i7;
    }

    public static xr b(int i7) {
        switch (i7) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case c4.w0.f2149o /* 7 */:
                return DFP_BANNER;
            case c4.w0.f2150p /* 8 */:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static eq3 d() {
        return wr.f13921a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14327f);
    }

    public final int zza() {
        return this.f14327f;
    }
}
