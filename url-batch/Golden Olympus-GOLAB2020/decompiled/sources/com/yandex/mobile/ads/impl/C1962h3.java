package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1962h3 {
    public static final void a(@NotNull String adType, @NotNull ArrayList errors) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(errors, "errors");
        if (errors.isEmpty()) {
            return;
        }
        po0.a(C2284v0.a(new Object[]{adType, CollectionsKt.joinToString$default(errors, "\n - ", "\n - ", null, 0, null, null, 60, null)}, 2, "Found following errors for %s ad type: %s", "format(...)"), new Object[0]);
    }

    public static final void a(@NotNull String adConfigurationInfo) {
        Intrinsics.checkNotNullParameter(adConfigurationInfo, "adConfigurationInfo");
        po0.b(C2284v0.a(new Object[]{adConfigurationInfo}, 1, "Ad type %s was integrated successfully", "format(...)"), new Object[0]);
    }
}
