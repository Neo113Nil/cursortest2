package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hw1 implements e62 {
    @Override // com.yandex.mobile.ads.impl.e62
    @NotNull
    public final d62 a(@NotNull r21 noticeTrackingManager, @NotNull no1 renderTrackingManager, @NotNull jk0 indicatorManager, @NotNull yg1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(noticeTrackingManager, "noticeTrackingManager");
        Intrinsics.checkNotNullParameter(renderTrackingManager, "renderTrackingManager");
        Intrinsics.checkNotNullParameter(indicatorManager, "indicatorManager");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        return new gw1(noticeTrackingManager, renderTrackingManager, indicatorManager, phoneStateTracker);
    }
}
