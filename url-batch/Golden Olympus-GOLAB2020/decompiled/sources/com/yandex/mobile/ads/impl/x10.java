package com.yandex.mobile.ads.impl;

import O1.C0933m5;
import O1.InterfaceC0752c3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x10 {
    @Nullable
    public static C0933m5 a(@NotNull InterfaceC0752c3 divBase, @NotNull String extensionId) {
        Intrinsics.checkNotNullParameter(divBase, "divBase");
        Intrinsics.checkNotNullParameter(extensionId, "extensionId");
        List<C0933m5> extensions = divBase.getExtensions();
        if (extensions == null) {
            return null;
        }
        for (C0933m5 c0933m5 : extensions) {
            if (Intrinsics.areEqual(extensionId, c0933m5.f6988a)) {
                return c0933m5;
            }
        }
        return null;
    }
}
