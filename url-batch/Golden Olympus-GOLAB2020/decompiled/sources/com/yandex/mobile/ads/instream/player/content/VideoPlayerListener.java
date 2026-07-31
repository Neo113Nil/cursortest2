package com.yandex.mobile.ads.instream.player.content;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface VideoPlayerListener {
    void onVideoCompleted();

    void onVideoError();

    void onVideoPaused();

    void onVideoPrepared();

    void onVideoResumed();
}
