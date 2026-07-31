package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d10 {
    public static int a(@NotNull Context context, float f4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC3185a.c(TypedValue.applyDimension(1, f4, context.getResources().getDisplayMetrics()));
    }
}
