package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xs {
    @NotNull
    public static qs a(@NotNull InstreamAd instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        if (instreamAd instanceof ql2) {
            return ((ql2) instreamAd).a();
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }
}
