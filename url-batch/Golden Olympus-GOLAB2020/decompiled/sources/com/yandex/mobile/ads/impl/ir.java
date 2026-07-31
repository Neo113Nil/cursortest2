package com.yandex.mobile.ads.impl;

import android.content.Context;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ir implements InterfaceC2188qi {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2188qi
    public final int a(@NotNull Context context, int i4, @NotNull cf1 orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return kotlin.ranges.g.d(kotlin.ranges.g.g(i4 > 655 ? AbstractC3185a.b((i4 / 728.0d) * 90.0d) : i4 > 632 ? 81 : i4 > 526 ? AbstractC3185a.b((i4 / 468.0d) * 60.0d) : i4 > 432 ? 68 : AbstractC3185a.b((i4 / 320.0d) * 50.0d), (int) kotlin.ranges.g.f(100.0f, lh2.a(context, orientation) * 0.15f)), 50);
    }
}
