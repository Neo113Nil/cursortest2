package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s41 implements q41 {
    @Override // com.yandex.mobile.ads.impl.q41
    @Nullable
    public final ProgressBar a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ProgressBar) container.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.q41
    @Nullable
    public final View b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewWithTag("skip_button");
    }

    @Override // com.yandex.mobile.ads.impl.q41
    @Nullable
    public final View c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewWithTag("close");
    }
}
