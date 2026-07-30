package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import k2.C4637h;
import w2.InterfaceC5156d;
import w2.InterfaceC5157e;
import w2.InterfaceC5160h;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends InterfaceC5157e {
    View getBannerView();

    @Override // w2.InterfaceC5157e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // w2.InterfaceC5157e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // w2.InterfaceC5157e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC5160h interfaceC5160h, Bundle bundle, C4637h c4637h, InterfaceC5156d interfaceC5156d, Bundle bundle2);
}
