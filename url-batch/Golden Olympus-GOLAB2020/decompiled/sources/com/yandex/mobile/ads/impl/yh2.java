package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yh2 implements az1 {
    @Override // com.yandex.mobile.ads.impl.az1
    public final void a(@NotNull View skipView) {
        Intrinsics.checkNotNullParameter(skipView, "skipView");
        skipView.setVisibility(0);
        skipView.setAlpha(0.4f);
        skipView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.az1
    public final void b(@NotNull View skipView) {
        Intrinsics.checkNotNullParameter(skipView, "skipView");
        skipView.setVisibility(0);
        skipView.animate().alpha(1.0f).setDuration(200L);
        skipView.setEnabled(true);
    }
}
