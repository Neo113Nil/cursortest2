package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class r41 implements q41 {
    @Override // com.yandex.mobile.ads.impl.q41
    @Nullable
    public final ProgressBar a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.q41
    @Nullable
    public final View b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.q41
    @Nullable
    public final View c(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return container.findViewById(R.id.close);
    }
}
