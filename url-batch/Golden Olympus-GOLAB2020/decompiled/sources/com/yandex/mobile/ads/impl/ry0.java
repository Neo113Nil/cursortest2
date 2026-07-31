package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ry0 implements InterfaceC2188qi {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2188qi
    public final int a(@NotNull Context context, int i4, @NotNull cf1 orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return (i4 <= 632 || 90.0f > ((float) lh2.a(context, orientation)) * 0.15f) ? 50 : 90;
    }
}
