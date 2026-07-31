package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w40 implements bp {
    @Override // com.yandex.mobile.ads.impl.bp
    public final void a(@NotNull View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.setAlpha(0.4f);
        closeView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.bp
    public final void b(@NotNull View closeView) {
        Intrinsics.checkNotNullParameter(closeView, "closeView");
        closeView.animate().alpha(1.0f).setDuration(200L);
        closeView.setEnabled(true);
    }
}
