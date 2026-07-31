package com.monetization.ads.quality.base;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public interface AdQualityVerifierAdEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdWillDisplay();

    void onInvalidated();
}
