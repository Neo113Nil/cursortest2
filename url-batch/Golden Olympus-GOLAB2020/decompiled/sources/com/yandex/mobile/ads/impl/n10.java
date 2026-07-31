package com.yandex.mobile.ads.impl;

import O1.C1039s4;
import com.yandex.div.core.DivPreloader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n10 extends q10 {
    @Override // com.yandex.mobile.ads.impl.q10, com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.areEqual("linear_progress_view", type);
    }

    @Override // com.yandex.mobile.ads.impl.q10, com.yandex.div.core.DivCustomContainerViewAdapter
    @NotNull
    public /* bridge */ /* synthetic */ DivPreloader.PreloadReference preload(@NotNull C1039s4 c1039s4, @NotNull DivPreloader.Callback callback) {
        return super.preload(c1039s4, callback);
    }
}
