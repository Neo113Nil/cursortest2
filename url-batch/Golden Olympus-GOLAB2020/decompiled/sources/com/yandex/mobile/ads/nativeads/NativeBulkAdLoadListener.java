package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface NativeBulkAdLoadListener {
    void onAdsFailedToLoad(@NotNull AdRequestError adRequestError);

    void onAdsLoaded(@NotNull List<NativeAd> list);
}
