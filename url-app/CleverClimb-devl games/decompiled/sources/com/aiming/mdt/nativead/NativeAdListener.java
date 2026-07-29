package com.aiming.mdt.nativead;

import com.aiming.mdt.core.AdListener;

/* loaded from: classes.dex */
public interface NativeAdListener extends AdListener {
    void onAdClicked();

    void onAdReady(AdInfo adInfo);
}
