package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface InstreamAdBreakEventListener {
    void onInstreamAdBreakCompleted();

    void onInstreamAdBreakError(@NotNull String str);

    void onInstreamAdBreakPrepared();

    void onInstreamAdBreakStarted();
}
