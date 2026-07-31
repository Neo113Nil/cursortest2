package com.yandex.mobile.ads.impl;

import android.content.Context;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kt1 implements InterfaceC2188qi {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2188qi
    public final int a(@NotNull Context context, int i4, @NotNull cf1 orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return AbstractC3185a.c(kotlin.ranges.g.c(kotlin.ranges.g.f(orientation == cf1.f24192c ? 90.0f : 100.0f, lh2.a(context, orientation) * 0.15f), 50.0f));
    }
}
