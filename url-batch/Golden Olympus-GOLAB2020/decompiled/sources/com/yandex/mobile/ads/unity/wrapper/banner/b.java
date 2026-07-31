package com.yandex.mobile.ads.unity.wrapper.banner;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;

/* loaded from: classes3.dex */
abstract class b {
    static BannerAdView a(Context context, String str, BannerAdSize bannerAdSize) {
        BannerAdView bannerAdView = new BannerAdView(context);
        bannerAdView.setAdUnitId(str);
        bannerAdView.setAdSize(bannerAdSize);
        return bannerAdView;
    }
}
