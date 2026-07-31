package com.yandex.mobile.ads.rewarded;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface Reward {
    int getAmount();

    @NotNull
    String getType();
}
