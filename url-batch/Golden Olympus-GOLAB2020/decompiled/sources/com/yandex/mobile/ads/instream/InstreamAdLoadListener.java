package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface InstreamAdLoadListener {
    void onInstreamAdFailedToLoad(@NotNull String str);

    void onInstreamAdLoaded(@NotNull InstreamAd instreamAd);
}
