package com.aiming.mdt.video;

import com.aiming.mdt.core.AdListener;

/* loaded from: classes.dex */
public interface VideoAdListener extends AdListener {
    void onAdClicked();

    void onAdClosed(boolean z);

    void onAdReady();

    void onAdRewarded();
}
