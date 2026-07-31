package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jd0 implements InterfaceC2246t8 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2246t8
    public final boolean a(@NotNull Context context, @NotNull vy1 sizeInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        return sizeInfo.c(context) > 0 && sizeInfo.a(context) > 0;
    }
}
