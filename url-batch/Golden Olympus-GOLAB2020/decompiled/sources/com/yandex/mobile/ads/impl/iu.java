package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iu {
    @NotNull
    public static List a(@NotNull hu creative) {
        yq0 b4;
        Intrinsics.checkNotNullParameter(creative, "creative");
        ku d4 = creative.d();
        List<C2276uf<?>> a4 = (d4 == null || (b4 = d4.b()) == null) ? null : b4.a();
        return a4 == null ? CollectionsKt.emptyList() : a4;
    }
}
