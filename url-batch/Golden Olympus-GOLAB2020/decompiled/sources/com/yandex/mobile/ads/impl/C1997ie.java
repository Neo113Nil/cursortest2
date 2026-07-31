package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1997ie {
    @Nullable
    public static final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }

    @Nullable
    public static final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }
}
