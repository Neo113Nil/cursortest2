package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface InstreamAdListener {
    void onError(@NotNull String str);

    void onInstreamAdCompleted();

    void onInstreamAdPrepared();
}
