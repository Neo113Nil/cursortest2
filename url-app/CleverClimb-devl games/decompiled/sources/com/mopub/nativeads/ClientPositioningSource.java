package com.mopub.nativeads;

import android.os.Handler;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import com.mopub.nativeads.PositioningSource;

/* loaded from: classes2.dex */
class ClientPositioningSource implements PositioningSource {
    private final Handler mHandler = new Handler();
    private final MoPubNativeAdPositioning.MoPubClientPositioning mPositioning;

    ClientPositioningSource(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        this.mPositioning = MoPubNativeAdPositioning.clone(moPubClientPositioning);
    }

    @Override // com.mopub.nativeads.PositioningSource
    public void loadPositions(String str, final PositioningSource.PositioningListener positioningListener) {
        this.mHandler.post(new Runnable() { // from class: com.mopub.nativeads.ClientPositioningSource.1
            @Override // java.lang.Runnable
            public void run() {
                positioningListener.onLoad(ClientPositioningSource.this.mPositioning);
            }
        });
    }
}
