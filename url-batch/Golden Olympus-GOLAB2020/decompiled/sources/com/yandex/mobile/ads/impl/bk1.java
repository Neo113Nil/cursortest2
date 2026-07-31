package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bk1 {
    @NotNull
    public static ak1 a(@NotNull String adapter, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new ak1(adapter, null, null, new mk1(nk1.f29662d, str, num), null);
    }

    @NotNull
    public static ak1 a() {
        wj1 error = wj1.f34094f;
        Intrinsics.checkNotNullParameter(error, "error");
        return a(StringUtils.UNDEFINED, error.b(), Integer.valueOf(error.a()));
    }
}
