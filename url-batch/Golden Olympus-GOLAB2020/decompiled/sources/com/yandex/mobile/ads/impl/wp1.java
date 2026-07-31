package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wp1 {
    @NotNull
    public static String a(@NotNull mh0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String c4 = url.c();
        String e4 = url.e();
        if (e4 == null) {
            return c4;
        }
        return c4 + "?" + e4;
    }
}
