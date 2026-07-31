package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xy1 {
    public static final boolean a(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull vy1 responseSizeInfo, @NotNull InterfaceC2246t8 adSizeValidator, @NotNull vy1 containerSizeInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(responseSizeInfo, "responseSizeInfo");
        Intrinsics.checkNotNullParameter(adSizeValidator, "adSizeValidator");
        Intrinsics.checkNotNullParameter(containerSizeInfo, "containerSizeInfo");
        boolean a4 = adSizeValidator.a(context, responseSizeInfo);
        boolean O3 = adResponse.O();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        boolean a5 = C1801aa.a(applicationContext, responseSizeInfo, containerSizeInfo);
        if (O3) {
            return true;
        }
        return a4 && a5;
    }
}
