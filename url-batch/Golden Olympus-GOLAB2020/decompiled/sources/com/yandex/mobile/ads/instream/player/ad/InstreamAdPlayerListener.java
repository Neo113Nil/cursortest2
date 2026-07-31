package com.yandex.mobile.ads.instream.player.ad;

import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface InstreamAdPlayerListener {
    void onAdBufferingFinished(@NotNull VideoAd videoAd);

    void onAdBufferingStarted(@NotNull VideoAd videoAd);

    void onAdCompleted(@NotNull VideoAd videoAd);

    void onAdPaused(@NotNull VideoAd videoAd);

    void onAdPrepared(@NotNull VideoAd videoAd);

    void onAdResumed(@NotNull VideoAd videoAd);

    void onAdSkipped(@NotNull VideoAd videoAd);

    void onAdStarted(@NotNull VideoAd videoAd);

    void onAdStopped(@NotNull VideoAd videoAd);

    void onError(@NotNull VideoAd videoAd, @NotNull InstreamAdPlayerError instreamAdPlayerError);

    void onVolumeChanged(@NotNull VideoAd videoAd, float f4);
}
