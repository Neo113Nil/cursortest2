package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import w2.InterfaceC5156d;
import w2.InterfaceC5157e;
import w2.k;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends InterfaceC5157e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, k kVar, Bundle bundle, InterfaceC5156d interfaceC5156d, Bundle bundle2);

    void showInterstitial();
}
