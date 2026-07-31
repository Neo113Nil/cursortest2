package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import c3.e;
import c3.f;
import c3.n;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, Bundle bundle2);

    void showInterstitial();
}
