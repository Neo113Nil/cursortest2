package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d52 implements c52 {
    @Override // com.yandex.mobile.ads.impl.c52
    @Nullable
    public final TextView a(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("timer_value");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.c52
    @Nullable
    public final View b(@NotNull View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("timer_container");
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }
}
