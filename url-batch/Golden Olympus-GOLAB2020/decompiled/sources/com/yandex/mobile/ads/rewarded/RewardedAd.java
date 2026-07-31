package com.yandex.mobile.ads.rewarded;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface RewardedAd {
    @NotNull
    AdInfo getInfo();

    void setAdEventListener(@Nullable RewardedAdEventListener rewardedAdEventListener);

    void show(@NotNull Activity activity);
}
