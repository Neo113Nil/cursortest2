package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n71 {
    @Nullable
    public static Float a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
            return null;
        }
    }
}
