package com.aiming.mdt.mediation;

import com.aiming.mdt.nativead.AdInfo;
import com.aiming.mdt.nativead.NativeAdView;

/* loaded from: classes.dex */
public abstract class CustomNativeEvent extends CustomAdEvent {
    protected AdInfo mAdInfo = new AdInfo();

    public abstract void registerNativeView(NativeAdView nativeAdView);
}
