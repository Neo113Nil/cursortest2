package com.mopub.nativeads;

import com.mopub.nativeads.MoPubNativeAdPositioning;

/* loaded from: classes2.dex */
interface PositioningSource {

    public interface PositioningListener {
        void onFailed();

        void onLoad(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning);
    }

    void loadPositions(String str, PositioningListener positioningListener);
}
