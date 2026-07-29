package com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.b;
import com.google.ads.mediation.MediationAdRequest;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends CustomEvent {
    void requestBannerAd(CustomEventBannerListener customEventBannerListener, Activity activity, String str, String str2, b bVar, MediationAdRequest mediationAdRequest, Object obj);
}
