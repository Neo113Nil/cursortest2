package com.yandex.mobile.ads.video.playback.model;

import com.yandex.mobile.ads.impl.gc2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface MediaFile extends gc2 {
    int getAdHeight();

    int getAdWidth();

    @Nullable
    String getApiFramework();

    @Nullable
    Integer getBitrate();

    @Nullable
    String getMediaType();

    @Override // com.yandex.mobile.ads.impl.gc2
    @NotNull
    String getUrl();
}
