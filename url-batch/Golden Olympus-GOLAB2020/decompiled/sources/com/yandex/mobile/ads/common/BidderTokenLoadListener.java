package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface BidderTokenLoadListener {
    void onBidderTokenFailedToLoad(@NotNull String str);

    void onBidderTokenLoaded(@NotNull String str);
}
