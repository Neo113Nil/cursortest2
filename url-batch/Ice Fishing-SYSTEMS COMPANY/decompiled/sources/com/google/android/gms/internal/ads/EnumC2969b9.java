package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC2969b9 implements InterfaceC3308hL {
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


    /* renamed from: n, reason: collision with root package name */
    public final int f29427n;

    EnumC2969b9(int i) {
        this.f29427n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3308hL
    public final int a() {
        return this.f29427n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f29427n);
    }
}
