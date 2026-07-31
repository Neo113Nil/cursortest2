package com.yandex.mobile.ads.instream;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface InstreamAdBreakQueue<T> {
    int getCount();

    @Nullable
    T poll();
}
