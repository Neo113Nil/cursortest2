package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r32 {
    @Nullable
    public static Object a(@NotNull Callable tryBlock, @Nullable Object obj, @NotNull String whileWhat, @NotNull String whatIsNull) {
        Intrinsics.checkNotNullParameter(tryBlock, "tryBlock");
        Intrinsics.checkNotNullParameter(whileWhat, "whileWhat");
        Intrinsics.checkNotNullParameter(whatIsNull, "whatIsNull");
        if (obj == null) {
            ap0.f(new Object[0]);
            return null;
        }
        try {
            return tryBlock.call();
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }
}
