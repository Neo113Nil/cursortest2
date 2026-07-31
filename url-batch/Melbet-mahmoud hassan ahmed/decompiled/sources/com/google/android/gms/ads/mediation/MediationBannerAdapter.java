package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import c3.e;
import c3.f;
import c3.i;
import r2.h;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends f {
    @RecentlyNonNull
    View getBannerView();

    @Override // c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull h hVar, @RecentlyNonNull e eVar, Bundle bundle2);
}
