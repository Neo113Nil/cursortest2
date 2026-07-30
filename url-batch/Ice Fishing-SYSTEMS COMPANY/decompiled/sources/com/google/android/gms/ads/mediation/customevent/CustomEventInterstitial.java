package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import w2.InterfaceC5156d;
import x2.InterfaceC5208a;
import x2.InterfaceC5210c;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends InterfaceC5208a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, InterfaceC5210c interfaceC5210c, String str, InterfaceC5156d interfaceC5156d, Bundle bundle);

    void showInterstitial();
}
