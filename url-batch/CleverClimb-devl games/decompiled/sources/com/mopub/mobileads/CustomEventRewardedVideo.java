package com.mopub.mobileads;

/* loaded from: classes2.dex */
public abstract class CustomEventRewardedVideo extends CustomEventRewardedAd {

    @Deprecated
    protected interface CustomEventRewardedVideoListener {
    }

    @Deprecated
    protected CustomEventRewardedVideoListener getVideoListenerForSdk() {
        return null;
    }

    @Deprecated
    protected abstract boolean hasVideoAvailable();

    @Deprecated
    protected abstract void showVideo();

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean isReady() {
        return hasVideoAvailable();
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void show() {
        showVideo();
    }
}
