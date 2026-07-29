package com.aiming.mdt.nativead;

import android.app.Activity;
import com.aiming.mdt.a.ViewOnAttachStateChangeListenerC0069;

/* loaded from: classes.dex */
public class NativeAd {
    private ViewOnAttachStateChangeListenerC0069 mNative;

    public NativeAd(Activity activity, String str, NativeAdListener nativeAdListener) {
        this.mNative = new ViewOnAttachStateChangeListenerC0069(activity, str, nativeAdListener);
    }

    public void destroy() {
        this.mNative.mo73();
    }

    public void loadAd() {
        this.mNative.m898();
    }

    public void registerNativeAdView(NativeAdView nativeAdView) {
        this.mNative.m219(nativeAdView);
    }
}
