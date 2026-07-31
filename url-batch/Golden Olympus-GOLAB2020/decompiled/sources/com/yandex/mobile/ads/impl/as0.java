package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class as0 {
    public static final void a(@NotNull xr0 xr0Var, @NotNull String key, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(xr0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = null;
        if (list != null) {
            List<String> list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                str = CollectionsKt.joinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            }
        }
        xr0Var.a(key, str);
    }
}
