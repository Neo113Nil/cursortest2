package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d81 {
    public static long a(@NotNull C2360y7 adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        gs n4 = adResponse.n();
        Long u4 = adResponse.u();
        if (u4 == null) {
            u4 = n4 == gs.f26282f ? 5000L : 0L;
        }
        return u4.longValue();
    }
}
