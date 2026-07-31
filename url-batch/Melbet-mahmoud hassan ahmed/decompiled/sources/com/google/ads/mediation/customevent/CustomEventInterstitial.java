package com.google.ads.mediation.customevent;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial {
    /* synthetic */ void destroy();

    void requestInterstitialAd(@RecentlyNonNull q0.b bVar, @RecentlyNonNull Activity activity, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull com.google.ads.mediation.a aVar, @RecentlyNonNull Object obj);

    void showInterstitial();
}
