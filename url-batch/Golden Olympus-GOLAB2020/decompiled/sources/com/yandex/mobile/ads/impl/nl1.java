package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nl1 {
    @NotNull
    public static String a(long j4) {
        long ceil = (long) Math.ceil(j4 / 1000);
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ceil / 60), Long.valueOf(ceil % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
