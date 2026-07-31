package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xr {
    @NotNull
    public static final Context a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @NotNull
    public static final cf1 b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i4 = context.getResources().getConfiguration().orientation;
        return i4 != 1 ? i4 != 2 ? cf1.f24194e : cf1.f24192c : cf1.f24193d;
    }
}
