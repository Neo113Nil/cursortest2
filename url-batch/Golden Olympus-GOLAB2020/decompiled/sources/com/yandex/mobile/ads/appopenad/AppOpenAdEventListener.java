package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface AppOpenAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(@NotNull AdError adError);

    void onAdImpression(@Nullable ImpressionData impressionData);

    void onAdShown();
}
