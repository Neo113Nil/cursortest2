package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zk2 {
    @NotNull
    public static AdInfo a(@NotNull fs coreAdInfo) {
        Intrinsics.checkNotNullParameter(coreAdInfo, "coreAdInfo");
        C2200r8 a4 = coreAdInfo.a();
        return new AdInfo(coreAdInfo.b(), a4 != null ? new AdSize(a4.b(), a4.a()) : null, coreAdInfo.c());
    }
}
