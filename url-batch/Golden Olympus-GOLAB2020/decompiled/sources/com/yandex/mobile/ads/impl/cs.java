package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class cs implements ds {
    @Override // com.yandex.mobile.ads.impl.ds
    @NotNull
    public final List<bs> a(@NotNull mh0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return CollectionsKt.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.ds
    public final void a(@NotNull mh0 url, @NotNull List<bs> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
