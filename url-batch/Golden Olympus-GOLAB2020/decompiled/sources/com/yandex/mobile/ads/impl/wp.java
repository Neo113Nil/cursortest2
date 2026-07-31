package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wp {
    @NotNull
    public static xp a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new xp(new yp(), new zp(), zr0.a(context, context.getPackageName() + "_preferences"));
    }
}
