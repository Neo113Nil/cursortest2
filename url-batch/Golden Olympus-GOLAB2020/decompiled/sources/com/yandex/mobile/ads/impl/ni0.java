package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ni0 {
    private static String a(String str, ImageView.ScaleType scaleType) {
        return "#S" + scaleType.ordinal() + str;
    }

    @NotNull
    public static String b(@NotNull String url, @NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        return a(url, scaleType);
    }

    @NotNull
    public static String a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return a(url, ImageView.ScaleType.CENTER_INSIDE);
    }
}
