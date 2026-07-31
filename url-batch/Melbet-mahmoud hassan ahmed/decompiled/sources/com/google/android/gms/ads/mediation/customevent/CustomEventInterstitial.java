package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c3.e;
import d3.d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends d3.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull d dVar, String str, @RecentlyNonNull e eVar, Bundle bundle);

    void showInterstitial();
}
